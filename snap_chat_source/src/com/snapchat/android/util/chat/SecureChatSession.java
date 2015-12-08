// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import Br;
import Bt;
import IJ;
import Ih;
import Iu;
import KA;
import KB;
import KD;
import Kp;
import Kr;
import Kv;
import Kw;
import Kx;
import Ky;
import Kz;
import Ll;
import Pf;
import Pg;
import Qt;
import Qu;
import Qy;
import RO;
import RS;
import Sq;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.debug.ScApplicationInfo;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class SecureChatSession
    implements KB.a, Kr, Kz.a
{
    public static final class ConnectingFailureReason extends Enum
    {

        private static final ConnectingFailureReason $VALUES[];
        public static final ConnectingFailureReason SSL_HANDSHAKE_FAILURE;
        public static final ConnectingFailureReason TIMED_OUT;
        public static final ConnectingFailureReason UNKNOWN_FAILURE;

        public static ConnectingFailureReason valueOf(String s1)
        {
            return (ConnectingFailureReason)Enum.valueOf(com/snapchat/android/util/chat/SecureChatSession$ConnectingFailureReason, s1);
        }

        public static ConnectingFailureReason[] values()
        {
            return (ConnectingFailureReason[])$VALUES.clone();
        }

        static 
        {
            TIMED_OUT = new ConnectingFailureReason("TIMED_OUT", 0);
            SSL_HANDSHAKE_FAILURE = new ConnectingFailureReason("SSL_HANDSHAKE_FAILURE", 1);
            UNKNOWN_FAILURE = new ConnectingFailureReason("UNKNOWN_FAILURE", 2);
            $VALUES = (new ConnectingFailureReason[] {
                TIMED_OUT, SSL_HANDSHAKE_FAILURE, UNKNOWN_FAILURE
            });
        }

        private ConnectingFailureReason(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class ConnectingState extends Enum
    {

        private static final ConnectingState $VALUES[];
        public static final ConnectingState AUTH;
        public static final ConnectingState SOCKET;
        public static final ConnectingState SSL;

        public static ConnectingState valueOf(String s1)
        {
            return (ConnectingState)Enum.valueOf(com/snapchat/android/util/chat/SecureChatSession$ConnectingState, s1);
        }

        public static ConnectingState[] values()
        {
            return (ConnectingState[])$VALUES.clone();
        }

        static 
        {
            SOCKET = new ConnectingState("SOCKET", 0);
            SSL = new ConnectingState("SSL", 1);
            AUTH = new ConnectingState("AUTH", 2);
            $VALUES = (new ConnectingState[] {
                SOCKET, SSL, AUTH
            });
        }

        private ConnectingState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class ConnectionState extends Enum
    {

        private static final ConnectionState $VALUES[];
        public static final ConnectionState CONNECTED;
        public static final ConnectionState CONNECTING;
        public static final ConnectionState DISCONNECTED;

        public static ConnectionState valueOf(String s1)
        {
            return (ConnectionState)Enum.valueOf(com/snapchat/android/util/chat/SecureChatSession$ConnectionState, s1);
        }

        public static ConnectionState[] values()
        {
            return (ConnectionState[])$VALUES.clone();
        }

        static 
        {
            DISCONNECTED = new ConnectionState("DISCONNECTED", 0);
            CONNECTING = new ConnectionState("CONNECTING", 1);
            CONNECTED = new ConnectionState("CONNECTED", 2);
            $VALUES = (new ConnectionState[] {
                DISCONNECTED, CONNECTING, CONNECTED
            });
        }

        private ConnectionState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    final class a
        implements Runnable
    {

        final SecureChatSession this$0;

        private void a(String s1, int i1)
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
            int k1 = as.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                String s2 = as[j1];
                if (arraylist.remove(s2))
                {
                    arraylist.add(0, s2);
                }
            }

            ((SSLParameters) (obj)).setCipherSuites(SecureChatSession.a(arraylist));
            SecureChatSession.g(SecureChatSession.this).setSSLParameters(((SSLParameters) (obj)));
            SecureChatSession.g(SecureChatSession.this).setUseClientMode(true);
            SecureChatSession.g(SecureChatSession.this).connect(new InetSocketAddress(s1, i1), 10000);
            SecureChatSession.g(SecureChatSession.this).setSoTimeout(10000);
            SecureChatSession.a(SecureChatSession.this, ConnectingState.SSL);
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
            int i1;
            flag1 = true;
            flag2 = true;
            flag3 = true;
            flag = true;
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession executing CONNECT runnable", new Object[0]);
            if (SecureChatSession.a(SecureChatSession.this) != b.CONNECTED._fld7133d94d)
            {
                Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because intended connection state != CONNECTED", new Object[0]);
                return;
            }
            if (SecureChatSession.b(SecureChatSession.this) != ConnectionState.DISCONNECTED)
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
            i1 = ((Integer)((Pair) (obj2)).second).intValue();
            obj2 = ((RS) (obj1)).a();
            if (obj2 == null)
            {
                Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT returning because messaging gateway auth token is null", new Object[0]);
                return;
            }
            SecureChatSession.a(SecureChatSession.this, System.currentTimeMillis());
            SecureChatSession.i(SecureChatSession.this).set(false);
            SecureChatSession.j(SecureChatSession.this);
            SecureChatSession.a(SecureChatSession.this, ConnectionState.CONNECTING);
            obj1 = ConnectingFailureReason.UNKNOWN_FAILURE;
            AnalyticsEvents.c(SecureChatSession.k(SecureChatSession.this));
            SecureChatSession.a(SecureChatSession.this, ConnectingState.SOCKET);
            a(((String) (obj)), i1);
            SecureChatSession.a(SecureChatSession.this, new Kv(SecureChatSession.g(SecureChatSession.this).getInputStream(), mGson));
            SecureChatSession.a(SecureChatSession.this, new Kw(SecureChatSession.g(SecureChatSession.this).getOutputStream(), mGson));
            SecureChatSession.m(SecureChatSession.this).schedule(new Runnable() {

                final a this$1;

                public final void run()
                {
                    if (!d())
                    {
                        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession ran into soft-timeout", new Object[0]);
                        for (Iterator iterator = SecureChatSession.l(_fld0).iterator(); iterator.hasNext(); iterator.next()) { }
                    }
                }

            
            {
                this$1 = a.this;
                super();
            }
            }, 3000L, TimeUnit.MILLISECONDS);
            SecureChatSession.a(SecureChatSession.this, ConnectingState.AUTH);
            obj = ScApplicationInfo.b(SecureChatSession.e(SecureChatSession.this));
            if (ScApplicationInfo.DEFAULT_VERSION_NAME.equals(obj))
            {
                obj = "unknown";
            }
            Qt qt = (Qt)Ih.b(RO.a.CONNECT);
            qt.a(Bt.q()).b("android").c(Integer.toString(android.os.Build.VERSION.SDK_INT)).d(((String) (obj))).a(((Su) (obj2)));
            Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession writeConnectMessage: ")).append(qt).toString(), new Object[0]);
            SecureChatSession.h(SecureChatSession.this).a(qt);
            obj = SecureChatSession.n(SecureChatSession.this).a();
            if (((RO) (obj)).k() != RO.a.CONNECT_RESPONSE) goto _L2; else goto _L1
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
            obj = ConnectingFailureReason.TIMED_OUT;
            Kw kw;
            long l1;
            long l2;
            if (SecureChatSession.b(SecureChatSession.this) != ConnectionState.CONNECTED)
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = SecureChatSession.u(SecureChatSession.this);
            if (flag)
            {
                AnalyticsEvents.a(l1 - l2, SecureChatSession.k(SecureChatSession.this));
                return;
            } else
            {
                AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((ConnectingFailureReason) (obj)));
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
            obj = ConnectingFailureReason.SSL_HANDSHAKE_FAILURE;
            if (SecureChatSession.b(SecureChatSession.this) == ConnectionState.CONNECTED)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = SecureChatSession.u(SecureChatSession.this);
            if (flag)
            {
                AnalyticsEvents.a(l1 - l2, SecureChatSession.k(SecureChatSession.this));
                return;
            } else
            {
                AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((ConnectingFailureReason) (obj)));
                SecureChatSession.c(SecureChatSession.this);
                SecureChatSession.f(SecureChatSession.this);
                return;
            }
            if (!SecureChatSession.q(SecureChatSession.this).await(1L, TimeUnit.SECONDS)) goto _L5; else goto _L4
_L4:
            SecureChatSession.g(SecureChatSession.this).setSoTimeout(0);
            SecureChatSession.a(SecureChatSession.this, ConnectionState.CONNECTED);
            SecureChatSession.r(SecureChatSession.this);
            SecureChatSession.s(SecureChatSession.this);
_L2:
            if (SecureChatSession.b(SecureChatSession.this) == ConnectionState.CONNECTED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = SecureChatSession.u(SecureChatSession.this);
            if (flag)
            {
                AnalyticsEvents.a(l1 - l2, SecureChatSession.k(SecureChatSession.this));
                return;
            } else
            {
                AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((ConnectingFailureReason) (obj1)));
                SecureChatSession.c(SecureChatSession.this);
                SecureChatSession.f(SecureChatSession.this);
                return;
            }
_L5:
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT due to countdown latch timeout", new Object[0]);
              goto _L2
            obj;
            Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession DISCONNECT due to exception when attempting to connect ")).append(Log.getStackTraceString(((Throwable) (obj)))).toString(), new Object[0]);
            if (SecureChatSession.b(SecureChatSession.this) == ConnectionState.CONNECTED)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = SecureChatSession.u(SecureChatSession.this);
            if (flag)
            {
                AnalyticsEvents.a(l1 - l2, SecureChatSession.k(SecureChatSession.this));
                return;
            } else
            {
                AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((ConnectingFailureReason) (obj1)));
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
            if (SecureChatSession.b(SecureChatSession.this) == ConnectionState.CONNECTED)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = SecureChatSession.u(SecureChatSession.this);
            if (flag)
            {
                AnalyticsEvents.a(l1 - l2, SecureChatSession.k(SecureChatSession.this));
            } else
            {
                AnalyticsEvents.a(SecureChatSession.v(SecureChatSession.this), ((ConnectingFailureReason) (obj1)));
                SecureChatSession.c(SecureChatSession.this);
                SecureChatSession.f(SecureChatSession.this);
            }
            throw obj;
        }

        private a()
        {
            this$0 = SecureChatSession.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b extends Enum
    {

        private static final int $VALUES$2fe2f418[];
        public static final int CONNECTED$7133d94d;
        public static final int DISCONNECTED$7133d94d;

        static 
        {
            DISCONNECTED$7133d94d = 1;
            CONNECTED$7133d94d = 2;
            $VALUES$2fe2f418 = (new int[] {
                DISCONNECTED$7133d94d, CONNECTED$7133d94d
            });
        }
    }


    private static final int ALTERNATIVE_SERVER_BACKOFF_DELAY = 5000;
    public static final int CHAT_SCCP_TIMEOUT_MILLIS = 20000;
    private static final int CONNECTION_SOFT_TIMEOUT_MILLIS = 3000;
    private static final int CONNECTION_TIMEOUT_MILLIS = 10000;
    private static final String EXPORT = "EXPORT";
    private static final long FIFTEEN_SECONDS = 15000L;
    private static final RejectedExecutionHandler LOGGING_REJECTED_EXECUTION_HANDLER = new RejectedExecutionHandler() {

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
        {
            Timber.f("SecureChatSession", (new StringBuilder("rejecting execution of runnable, shutdown=")).append(threadpoolexecutor.isShutdown()).toString(), new Object[0]);
        }

    };
    private static final int MAX_MESSAGES_CAN_RECEIVE_PER_SEC = 32;
    private static final int MAX_RECONNECT_ATTEMPTS = 10;
    private static final int NUM_ALTERNATIVE_SERVERS_BEFORE_BACKOFF = 2;
    private static final int NUM_SECONDS_BEFORE_SCCP_RECONNECT = 60;
    private static final long PING_INTERVAL = 15000L;
    private static final long PING_TIMEOUT_MILLIS = 10000L;
    private static final String PREFERRED_CIPHER_SUITES[] = {
        "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"
    };
    private static final int SOCKET_READ_TIMEOUT_MILLIS = 10000;
    private static final String TAG = "SecureChatSession";
    private static final long TEN_SECONDS = 10000L;
    private static final long THIRTY_SECONDS = 30000L;
    private volatile ConnectingState mConnectingState;
    private volatile CountDownLatch mConnectionCountDownLatch;
    final ExecutorService mConnectionExecutorService;
    private long mConnectionStartedTimestamp;
    public volatile ConnectionState mConnectionState;
    private final List mConnectionStateListeners = new CopyOnWriteArrayList();
    private final Context mContext;
    public Iu mGson;
    private Kv mInputStream;
    final Ky mInputThread;
    private volatile int mIntendedConnectionState$7133d94d;
    private int mNumReconnectAttempts;
    private int mNumWrongServers;
    private Kw mOutputStream;
    final KA mOutputThread;
    private boolean mReconnectOutstanding;
    private SSLSocket mSSLSocket;
    final ScheduledExecutorService mScheduledExecutorService;
    private final AtomicBoolean mStreamProcessingStopped = new AtomicBoolean(false);

    public SecureChatSession(Context context)
    {
        mNumWrongServers = 0;
        mNumReconnectAttempts = 0;
        mReconnectOutstanding = false;
        mIntendedConnectionState$7133d94d = b.DISCONNECTED._fld7133d94d;
        mConnectionState = ConnectionState.DISCONNECTED;
        mConnectingState = ConnectingState.SOCKET;
        mConnectionStartedTimestamp = 0L;
        SnapchatApplication.getDIComponent().a(this);
        mContext = context;
        mConnectionExecutorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), LOGGING_REJECTED_EXECUTION_HANDLER);
        mScheduledExecutorService = new ScheduledThreadPoolExecutor(1, LOGGING_REJECTED_EXECUTION_HANDLER);
        Object obj = new Kx(mScheduledExecutorService);
        context = new Kz(this, mScheduledExecutorService);
        mInputThread = new Ky(context);
        mInputThread.mStreamProcessingStateListeners.add(this);
        mInputThread.a(((Kq) (obj)));
        mInputThread.start();
        mOutputThread = new KA(((Kx) (obj)));
        mOutputThread.mStreamProcessingStateListeners.add(this);
        mOutputThread.start();
        obj = new KB(this, mScheduledExecutorService);
        mInputThread.a(((Kq) (obj)));
        a(((Kp) (obj)));
        a(context);
    }

    static int a(SecureChatSession securechatsession)
    {
        return securechatsession.mIntendedConnectionState$7133d94d;
    }

    static long a(SecureChatSession securechatsession, long l1)
    {
        securechatsession.mConnectionStartedTimestamp = l1;
        return l1;
    }

    static Kv a(SecureChatSession securechatsession, Kv kv)
    {
        securechatsession.mInputStream = kv;
        return kv;
    }

    static Kw a(SecureChatSession securechatsession, Kw kw)
    {
        securechatsession.mOutputStream = kw;
        return kw;
    }

    static CountDownLatch a(SecureChatSession securechatsession, CountDownLatch countdownlatch)
    {
        securechatsession.mConnectionCountDownLatch = countdownlatch;
        return countdownlatch;
    }

    static SSLSocket a(SecureChatSession securechatsession, SSLSocket sslsocket)
    {
        securechatsession.mSSLSocket = sslsocket;
        return sslsocket;
    }

    private void a(ConnectionState connectionstate)
    {
        if (mConnectionState != connectionstate)
        {
            Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession SET CONNECTION STATE: ")).append(connectionstate.name()).toString(), new Object[0]);
            mConnectionState = connectionstate;
            for (Iterator iterator = mConnectionStateListeners.iterator(); iterator.hasNext(); ((Kp)iterator.next()).a(connectionstate)) { }
        }
    }

    static void a(SecureChatSession securechatsession, final Sq serverString)
    {
        serverString = (new StringBuilder()).append(serverString.a()).append(":").append(serverString.b()).toString();
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession setAlternativeServer: ")).append(serverString).toString(), new Object[0]);
        if (securechatsession.mNumWrongServers >= 2)
        {
            securechatsession.mScheduledExecutorService.schedule(securechatsession. new Runnable() {

                final SecureChatSession this$0;
                final String val$serverString;

                public final void run()
                {
                    Br.a(SecureChatSession.e(SecureChatSession.this)).a(serverString);
                }

            
            {
                this$0 = SecureChatSession.this;
                serverString = s1;
                super();
            }
            }, 5000L, TimeUnit.MILLISECONDS);
            return;
        } else
        {
            Br.a(securechatsession.mContext).a(serverString);
            return;
        }
    }

    static void a(SecureChatSession securechatsession, ConnectingState connectingstate)
    {
        if (securechatsession.mConnectingState != connectingstate)
        {
            Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession SET CONNECTING STATE: ")).append(connectingstate.name()).toString(), new Object[0]);
            securechatsession.mConnectingState = connectingstate;
            AnalyticsEvents.a(securechatsession.mConnectingState, System.currentTimeMillis() - securechatsession.mConnectionStartedTimestamp);
        }
    }

    static void a(SecureChatSession securechatsession, ConnectionState connectionstate)
    {
        securechatsession.a(connectionstate);
    }

    protected static String[] a(List list)
    {
        list = (String[])list.toArray(new String[list.size()]);
        ArrayList arraylist = new ArrayList();
        int j1 = list.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = list[i1];
            if (!s1.toUpperCase().contains("EXPORT"))
            {
                arraylist.add(s1);
            }
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    static ConnectionState b(SecureChatSession securechatsession)
    {
        return securechatsession.mConnectionState;
    }

    static void c(SecureChatSession securechatsession)
    {
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession resetSessionState", new Object[0]);
        Pf.a(securechatsession.mOutputStream);
        Pf.a(securechatsession.mInputStream);
        SSLSocket sslsocket = securechatsession.mSSLSocket;
        if (sslsocket != null)
        {
            try
            {
                sslsocket.close();
            }
            catch (IOException ioexception)
            {
                Timber.a("CloseableUtils", ioexception);
            }
        }
        securechatsession.mOutputThread.interrupt();
        securechatsession.mInputThread.interrupt();
        securechatsession.mInputStream = null;
        securechatsession.mOutputStream = null;
        securechatsession.mSSLSocket = null;
        securechatsession.a(ConnectionState.DISCONNECTED);
    }

    static void d(SecureChatSession securechatsession)
    {
        securechatsession.h();
    }

    static Context e(SecureChatSession securechatsession)
    {
        return securechatsession.mContext;
    }

    static void f(SecureChatSession securechatsession)
    {
        if (!securechatsession.mReconnectOutstanding && securechatsession.mNumReconnectAttempts < 10)
        {
            securechatsession.mReconnectOutstanding = true;
            securechatsession.mNumReconnectAttempts = securechatsession.mNumReconnectAttempts + 1;
            ScheduledExecutorService scheduledexecutorservice = securechatsession.mScheduledExecutorService;
            Runnable runnable = securechatsession. new Runnable() {

                final SecureChatSession this$0;

                public final void run()
                {
                    if (SecureChatSession.a(SecureChatSession.this) == b.CONNECTED._fld7133d94d)
                    {
                        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession START SESSION RECONNECT", new Object[0]);
                        SecureChatSession.d(SecureChatSession.this);
                    }
                }

            
            {
                this$0 = SecureChatSession.this;
                super();
            }
            };
            long l1;
            if (securechatsession.mNumReconnectAttempts == 0)
            {
                l1 = 0L;
            } else
            {
                l1 = (long)Math.min(Math.pow(2D, securechatsession.mNumReconnectAttempts - 1) * 1000D, 30000D);
            }
            scheduledexecutorservice.schedule(runnable, l1, TimeUnit.MILLISECONDS);
        }
    }

    static SSLSocket g(SecureChatSession securechatsession)
    {
        return securechatsession.mSSLSocket;
    }

    static String[] g()
    {
        return PREFERRED_CIPHER_SUITES;
    }

    static Kw h(SecureChatSession securechatsession)
    {
        return securechatsession.mOutputStream;
    }

    private void h()
    {
        mConnectionExecutorService.execute(new a((byte)0));
    }

    static AtomicBoolean i(SecureChatSession securechatsession)
    {
        return securechatsession.mStreamProcessingStopped;
    }

    static boolean j(SecureChatSession securechatsession)
    {
        securechatsession.mReconnectOutstanding = false;
        return false;
    }

    static int k(SecureChatSession securechatsession)
    {
        return securechatsession.mNumReconnectAttempts;
    }

    static List l(SecureChatSession securechatsession)
    {
        return securechatsession.mConnectionStateListeners;
    }

    static ScheduledExecutorService m(SecureChatSession securechatsession)
    {
        return securechatsession.mScheduledExecutorService;
    }

    static Kv n(SecureChatSession securechatsession)
    {
        return securechatsession.mInputStream;
    }

    static Ky o(SecureChatSession securechatsession)
    {
        return securechatsession.mInputThread;
    }

    static KA p(SecureChatSession securechatsession)
    {
        return securechatsession.mOutputThread;
    }

    static CountDownLatch q(SecureChatSession securechatsession)
    {
        return securechatsession.mConnectionCountDownLatch;
    }

    static int r(SecureChatSession securechatsession)
    {
        securechatsession.mNumReconnectAttempts = 0;
        return 0;
    }

    static int s(SecureChatSession securechatsession)
    {
        securechatsession.mNumWrongServers = 0;
        return 0;
    }

    static int t(SecureChatSession securechatsession)
    {
        int i1 = securechatsession.mNumWrongServers;
        securechatsession.mNumWrongServers = i1 + 1;
        return i1;
    }

    static long u(SecureChatSession securechatsession)
    {
        return securechatsession.mConnectionStartedTimestamp;
    }

    static ConnectingState v(SecureChatSession securechatsession)
    {
        return securechatsession.mConnectingState;
    }

    public final void a()
    {
        mConnectionCountDownLatch.countDown();
    }

    public final void a(Kp kp)
    {
        mConnectionStateListeners.add(kp);
    }

    public final void a(RO ro, SecureChatService.SecureChatWriteCompletedCallback securechatwritecompletedcallback)
    {
        KA ka;
        if (TextUtils.isEmpty(ro.l()) || ro.k() == RO.a.UNRECOGNIZED_VALUE)
        {
            String s1 = (new StringBuilder("writeMessage - The message has no valid id/type: ")).append(ro).toString();
            Timber.e("SecureChatSession", s1, new Object[0]);
            if (ReleaseManager.f())
            {
                throw new IllegalArgumentException(s1);
            }
        }
        ka = mOutputThread;
        if (ReleaseManager.f())
        {
            Timber.f("SecureChatSessionOutputThread", (new StringBuilder("CHAT-LOG: SecureChatSessionOutputThread writeMessage ")).append(ro).toString(), new Object[0]);
        }
        AtomicReference atomicreference = ka.mThreadState;
        atomicreference;
        JVM INSTR monitorenter ;
        Kx kx;
        if (ka.mThreadState.get() != KA.a.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        kx = ka.mAckTracker;
        if (!(ro instanceof Qy) || !Ih.a(ro)) goto _L2; else goto _L1
_L1:
        kx.mMessageCallbacksPendingAcks.put(ro.l(), securechatwritecompletedcallback);
        securechatwritecompletedcallback = ro.l();
        kx.mScheduledExecutorService.schedule(new Kx._cls1(kx, securechatwritecompletedcallback), kx.mTimeoutInMillis, TimeUnit.MILLISECONDS);
_L3:
        if (!ka.mMessageQueue.offer(ro))
        {
            ka.mAckTracker.a(ro.l(), SecureChatService.SecureChatWriteCompletedCallback.Status.SCCP_MESSAGE_QUEUE_FULL, "Couldn't add message to output message queue");
        }
_L4:
        return;
_L2:
        kx.mMessageCallbacksPendingWrite.put(ro.l(), securechatwritecompletedcallback);
          goto _L3
        ro;
        atomicreference;
        JVM INSTR monitorexit ;
        throw ro;
        securechatwritecompletedcallback.a(false, SecureChatService.SecureChatWriteCompletedCallback.Status.SCCP_CONNECTION_ENDED, "Output stream not connected");
          goto _L4
    }

    public final void a(Exception exception)
    {
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession onStreamProcessingStopped with exception: ")).append(exception).toString(), new Object[0]);
        if (mStreamProcessingStopped.compareAndSet(false, true))
        {
            mConnectionExecutorService.execute(new Runnable() {

                final SecureChatSession this$0;

                public final void run()
                {
                    SecureChatSession.c(SecureChatSession.this);
                    SecureChatSession.f(SecureChatSession.this);
                }

            
            {
                this$0 = SecureChatSession.this;
                super();
            }
            });
        }
    }

    public final void b()
    {
        Timber.f("SecureChatSession", (new StringBuilder("CHAT-LOG: SecureChatSession CONNECT on ")).append(Pg.b()).toString(), new Object[0]);
        mIntendedConnectionState$7133d94d = b.CONNECTED._fld7133d94d;
        h();
    }

    public final void c()
    {
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT", new Object[0]);
        mIntendedConnectionState$7133d94d = b.DISCONNECTED._fld7133d94d;
        mConnectionExecutorService.execute(new Runnable() {

            final SecureChatSession this$0;

            public final void run()
            {
                Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession executing DISCONNECT runnable", new Object[0]);
                if (SecureChatSession.a(SecureChatSession.this) != b.DISCONNECTED._fld7133d94d)
                {
                    Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT returning because intended connection state != DISCONNECTED", new Object[0]);
                    return;
                }
                if (SecureChatSession.b(SecureChatSession.this) == ConnectionState.DISCONNECTED)
                {
                    Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT returning because connection state == DISCONNECTED", new Object[0]);
                    return;
                } else
                {
                    AnalyticsEvents.A();
                    SecureChatSession.c(SecureChatSession.this);
                    return;
                }
            }

            
            {
                this$0 = SecureChatSession.this;
                super();
            }
        });
    }

    public final boolean d()
    {
        return mConnectionState == ConnectionState.CONNECTED;
    }

    public final void e()
    {
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECTING because receiving rate limit hit", new Object[0]);
        c();
        mScheduledExecutorService.schedule(new Runnable() {

            final SecureChatSession this$0;

            public final void run()
            {
                Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT after being disconnected due to rate limit", new Object[0]);
                b();
            }

            
            {
                this$0 = SecureChatSession.this;
                super();
            }
        }, 60L, TimeUnit.SECONDS);
    }

    public final void f()
    {
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECTING because of ping timeout", new Object[0]);
        c();
        mScheduledExecutorService.execute(new Runnable() {

            final SecureChatSession this$0;

            public final void run()
            {
                Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession CONNECT after being disconnected due to ping timeout", new Object[0]);
                b();
            }

            
            {
                this$0 = SecureChatSession.this;
                super();
            }
        });
    }

}
