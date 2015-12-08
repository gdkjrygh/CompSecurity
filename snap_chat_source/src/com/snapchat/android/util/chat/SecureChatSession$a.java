// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import Br;
import Bt;
import IJ;
import Ih;
import KA;
import KD;
import Kv;
import Kw;
import Ky;
import Qt;
import Qu;
import RO;
import RS;
import android.util.Log;
import android.util.Pair;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.util.debug.ScApplicationInfo;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

final class <init>
    implements Runnable
{

    final SecureChatSession this$0;

    private void a(String s, int i)
    {
        Object obj = KD.a().mSslContext;
        if (obj == null)
        {
            return;
        }
        obj = ((SSLContext) (obj)).getSocketFactory();
        SecureChatSession.a(SecureChatSession.this, (SSLSocket)((SSLSocketFactory) (obj)).createSocket());
        obj = SecureChatSession.g(SecureChatSession.this).getSSLParameters();
        ArrayList arraylist = new ArrayList(Arrays.asList(((SSLParameters) (obj)).getCipherSuites()));
        String as[] = SecureChatSession.g();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as[j];
            if (arraylist.remove(s1))
            {
                arraylist.add(0, s1);
            }
        }

        ((SSLParameters) (obj)).setCipherSuites(SecureChatSession.a(arraylist));
        SecureChatSession.g(SecureChatSession.this).setSSLParameters(((SSLParameters) (obj)));
        SecureChatSession.g(SecureChatSession.this).setUseClientMode(true);
        SecureChatSession.g(SecureChatSession.this).connect(new InetSocketAddress(s, i), 10000);
        SecureChatSession.g(SecureChatSession.this).setSoTimeout(10000);
        SecureChatSession.a(SecureChatSession.this, nnectingState.SSL);
        SecureChatSession.g(SecureChatSession.this).startHandshake();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int i;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        flag = true;
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession executing CONNECT runnable", new Object[0]);
        if (SecureChatSession.a(SecureChatSession.this) != CONNECTED._fld7133d94d)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because intended connection state != CONNECTED", new Object[0]);
            return;
        }
        if (SecureChatSession.b(SecureChatSession.this) != nnectionState.DISCONNECTED)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because connection state != DISCONNECTED", new Object[0]);
            return;
        }
        obj1 = Br.a(SecureChatSession.e(SecureChatSession.this)).mMessagingGatewayInfo;
        if (obj1 == null)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because messaging gateway info is null", new Object[0]);
            return;
        }
        String as[] = ((RS) (obj1)).b().split(":");
        obj2 = new Pair(as[0], Integer.valueOf(Integer.parseInt(as[1])));
        obj = (String)((Pair) (obj2)).first;
        i = ((Integer)((Pair) (obj2)).second).intValue();
        obj2 = ((RS) (obj1)).a();
        if (obj2 == null)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because messaging gateway auth token is null", new Object[0]);
            return;
        }
        SecureChatSession.a(SecureChatSession.this, System.currentTimeMillis());
        SecureChatSession.i(SecureChatSession.this).set(false);
        SecureChatSession.j(SecureChatSession.this);
        SecureChatSession.a(SecureChatSession.this, nnectionState.CONNECTING);
        obj1 = nnectingFailureReason.UNKNOWN_FAILURE;
        AnalyticsEvents.c(SecureChatSession.k(SecureChatSession.this));
        SecureChatSession.a(SecureChatSession.this, nnectingState.SOCKET);
        a(((String) (obj)), i);
        SecureChatSession.a(SecureChatSession.this, new Kv(SecureChatSession.g(SecureChatSession.this).getInputStream(), mGson));
        SecureChatSession.a(SecureChatSession.this, new Kw(SecureChatSession.g(SecureChatSession.this).getOutputStream(), mGson));
        SecureChatSession.m(SecureChatSession.this).schedule(new Runnable() {

            final SecureChatSession.a this$1;

            public final void run()
            {
                if (!d())
                {
                    Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession ran into soft-timeout", new Object[0]);
                    for (Iterator iterator = SecureChatSession.l(this$0).iterator(); iterator.hasNext(); iterator.next()) { }
                }
            }

            
            {
                this$1 = SecureChatSession.a.this;
                super();
            }
        }, 3000L, TimeUnit.MILLISECONDS);
        SecureChatSession.a(SecureChatSession.this, nnectingState.AUTH);
        obj = ScApplicationInfo.b(SecureChatSession.e(SecureChatSession.this));
        if (ScApplicationInfo.DEFAULT_VERSION_NAME.equals(obj))
        {
            obj = "unknown";
        }
        Qt qt = (Qt)Ih.b(als);
        qt.a(Bt.q()).b("android").c(Integer.toString(android.os.T)).d(((String) (obj))).a(((Su) (obj2)));
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession writeConnectMessage: ")).append(qt).toString(), new Object[0]);
        SecureChatSession.h(SecureChatSession.this).a(qt);
        obj = SecureChatSession.n(SecureChatSession.this).a();
        if (((RO) (obj)).k() != E) goto _L2; else goto _L1
_L1:
        obj = (Qu)obj;
        if (!IJ.a(((Qu) (obj)).a()))
        {
            break MISSING_BLOCK_LABEL_945;
        }
        SecureChatSession.a(SecureChatSession.this, new CountDownLatch(2));
        obj = SecureChatSession.o(SecureChatSession.this);
        Kv kv = SecureChatSession.n(SecureChatSession.this);
        if (!((Ky) (obj)).mInputStreamQueue.offer(kv))
        {
            throw new IllegalStateException();
        }
          goto _L3
        obj;
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession DISCONNECT due to TIMED_OUT when attempting to connect ")).append(Log.getStackTraceString(((Throwable) (obj)))).toString(), new Object[0]);
        obj = nnectingFailureReason.TIMED_OUT;
        Kw kw;
        long l;
        long l1;
        if (SecureChatSession.b(SecureChatSession.this) != nnectionState.CONNECTED)
        {
            flag = false;
        }
        l = System.currentTimeMillis();
        l1 = SecureChatSession.u(SecureChatSession.this);
        if (flag)
        {
            AnalyticsEvents.a(l - l1, SecureChatSession.k(SecureChatSession.this));
            return;
        } else
        {
            AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((nnectingFailureReason) (obj)));
            SecureChatSession.c(SecureChatSession.this);
            SecureChatSession.f(SecureChatSession.this);
            return;
        }
_L3:
        obj = SecureChatSession.p(SecureChatSession.this);
        kw = SecureChatSession.h(SecureChatSession.this);
        if (!((KA) (obj)).mOutputStreamQueue.offer(kw))
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_743;
        obj;
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession DISCONNECT due to SSL HandShake Failure when attempting to connect ")).append(Log.getStackTraceString(((Throwable) (obj)))).toString(), new Object[0]);
        obj = nnectingFailureReason.SSL_HANDSHAKE_FAILURE;
        if (SecureChatSession.b(SecureChatSession.this) == nnectionState.CONNECTED)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = System.currentTimeMillis();
        l1 = SecureChatSession.u(SecureChatSession.this);
        if (flag)
        {
            AnalyticsEvents.a(l - l1, SecureChatSession.k(SecureChatSession.this));
            return;
        } else
        {
            AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((nnectingFailureReason) (obj)));
            SecureChatSession.c(SecureChatSession.this);
            SecureChatSession.f(SecureChatSession.this);
            return;
        }
        if (!SecureChatSession.q(SecureChatSession.this).await(1L, TimeUnit.SECONDS)) goto _L5; else goto _L4
_L4:
        SecureChatSession.g(SecureChatSession.this).setSoTimeout(0);
        SecureChatSession.a(SecureChatSession.this, nnectionState.CONNECTED);
        SecureChatSession.r(SecureChatSession.this);
        SecureChatSession.s(SecureChatSession.this);
_L2:
        if (SecureChatSession.b(SecureChatSession.this) == nnectionState.CONNECTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = System.currentTimeMillis();
        l1 = SecureChatSession.u(SecureChatSession.this);
        if (flag)
        {
            AnalyticsEvents.a(l - l1, SecureChatSession.k(SecureChatSession.this));
            return;
        } else
        {
            AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((nnectingFailureReason) (obj1)));
            SecureChatSession.c(SecureChatSession.this);
            SecureChatSession.f(SecureChatSession.this);
            return;
        }
_L5:
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT due to countdown latch timeout", new Object[0]);
          goto _L2
        obj;
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession DISCONNECT due to exception when attempting to connect ")).append(Log.getStackTraceString(((Throwable) (obj)))).toString(), new Object[0]);
        if (SecureChatSession.b(SecureChatSession.this) == nnectionState.CONNECTED)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        l = System.currentTimeMillis();
        l1 = SecureChatSession.u(SecureChatSession.this);
        if (flag)
        {
            AnalyticsEvents.a(l - l1, SecureChatSession.k(SecureChatSession.this));
            return;
        } else
        {
            AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((nnectingFailureReason) (obj1)));
            SecureChatSession.c(SecureChatSession.this);
            SecureChatSession.f(SecureChatSession.this);
            return;
        }
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession DISCONNECT due to unsuccessful ConnectResponse ")).append(obj).toString(), new Object[0]);
        if (((Qu) (obj)).b().equals("wrong_server"))
        {
            SecureChatSession.t(SecureChatSession.this);
            SecureChatSession.a(SecureChatSession.this, ((Qu) (obj)).c());
        }
          goto _L2
        obj;
        if (SecureChatSession.b(SecureChatSession.this) == nnectionState.CONNECTED)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        l = System.currentTimeMillis();
        l1 = SecureChatSession.u(SecureChatSession.this);
        if (flag)
        {
            AnalyticsEvents.a(l - l1, SecureChatSession.k(SecureChatSession.this));
        } else
        {
            AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((nnectingFailureReason) (obj1)));
            SecureChatSession.c(SecureChatSession.this);
            SecureChatSession.f(SecureChatSession.this);
        }
        throw obj;
    }

    private _cls1.this._cls1()
    {
        this$0 = SecureChatSession.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
