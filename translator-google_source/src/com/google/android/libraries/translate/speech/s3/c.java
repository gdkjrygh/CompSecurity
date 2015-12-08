// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.gsa.a.a.e;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.android.apps.gsa.shared.speech.exception.RecognizeException;
import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.shared.util.g;
import com.google.android.apps.gsa.speech.audio.AudioUtils;
import com.google.android.apps.gsa.speech.audio.d;
import com.google.android.apps.gsa.speech.audio.j;
import com.google.android.apps.gsa.speech.b.a;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.speech.h;
import com.google.common.base.Suppliers;
import com.google.g.a.a.m;
import com.google.g.a.a.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.translate.speech.s3:
//            j, h, i, e, 
//            RecognitionState

public final class c
    implements android.os.Handler.Callback, g, a, h, com.google.android.libraries.translate.speech.s3.j
{

    private final boolean A;
    private final boolean B;
    private final AtomicBoolean C = new AtomicBoolean(false);
    public final com.google.android.libraries.translate.speech.s3.h a;
    public final boolean b;
    public RecognitionState c;
    public Language d;
    public Language e;
    private final com.google.android.libraries.translate.speech.e f;
    private e g;
    private com.google.android.libraries.translate.speech.s3.e h;
    private final String i;
    private final String j;
    private final LogParams k = new LogParams();
    private final String l;
    private final Handler m = new Handler(this);
    private final boolean n;
    private InputStream o;
    private String p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final boolean v = false;
    private final i w;
    private String x;
    private boolean y;
    private String z;

    public c(com.google.android.libraries.translate.speech.e e1, Context context, String s1, String s2, List list, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, String s3, String s4)
    {
        p = "";
        f = e1;
        i = s2;
        StringBuilder stringbuilder = new StringBuilder(i);
        list = com.google.android.libraries.translate.speech.c.a(s2, list);
        byte byte0;
        boolean flag4;
        if (list != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        A = flag4;
        if (A)
        {
            b = flag3;
            if (b)
            {
                e1 = "translate-s2s";
            } else
            {
                e1 = "multi-recognizer";
            }
            l = e1;
            stringbuilder.append(',').append(TextUtils.join(",", list));
            z = s4;
        } else
        {
            b = flag2;
            if (b)
            {
                e1 = "translate-s2s";
            } else
            {
                e1 = "recognizer";
            }
            l = e1;
            z = s3;
        }
        if (list != null && list.size() > 0)
        {
            e1 = (String)list.get(0);
        } else
        {
            e1 = null;
        }
        j = e1;
        k.addParam("service", l).addParam("locales", stringbuilder.toString());
        n = flag1;
        if (!com.google.android.libraries.translate.core.b.d(Singleton.a()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        B = flag1;
        a = new com.google.android.libraries.translate.speech.s3.h(s2, list, flag, s1, b, B);
        if (o.b)
        {
            byte0 = 9;
        } else
        {
            byte0 = 3;
        }
        w = new i(this, b, k);
        h = new com.google.android.libraries.translate.speech.s3.e(this, context, a, this, new f(), byte0);
        s1 = context.getApplicationContext();
        s2 = w;
        if (TextUtils.isEmpty(z))
        {
            context = "https://www.google.com/m/voice-search/down?pair=";
            e1 = "https://www.google.com/m/voice-search/up?pair=";
        } else
        {
            context = a(z, "down");
            e1 = a(z, "up");
        }
        flag = b;
        context = (new m()).a(context).a(false).a().b();
        e1 = (new m()).a(e1).a(false).b("c548_232a_f5c8_05ff").a(1024).a().b();
        list = new t();
        list.a = context;
        list.b = e1;
        g = new e(s1, s2, Suppliers.a(list), new com.google.android.apps.gsa.shared.util.a.b());
    }

    static InputStream a(c c1, InputStream inputstream)
    {
        c1.o = inputstream;
        return inputstream;
    }

    static String a(c c1)
    {
        return c1.l;
    }

    private static String a(String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder("https://");
        stringbuilder.append(s1);
        stringbuilder.append("/m/voice-search/");
        stringbuilder.append(s2);
        stringbuilder.append("?");
        if (!TextUtils.equals(s1, "www.google.com"))
        {
            stringbuilder.append("sky=rad_b924-18a3-c08b-451c&");
        }
        stringbuilder.append("pair=");
        return stringbuilder.toString();
    }

    static boolean b(c c1)
    {
        return c1.v;
    }

    static InputStream c(c c1)
    {
        return c1.o;
    }

    private boolean e()
    {
        if (b)
        {
            break MISSING_BLOCK_LABEL_7;
        }
        break MISSING_BLOCK_LABEL_89;
        while (!c.i) 
        {
            do
            {
                return false;
            } while (!y || !c.c());
            if (B)
            {
                break;
            }
            RecognitionState recognitionstate = c;
            boolean flag;
            if (recognitionstate.j && !recognitionstate.k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break;
            }
            if (!t)
            {
                t = true;
                f.h();
            }
        }
        return f();
    }

    private boolean f()
    {
        if (!C.getAndSet(true))
        {
            f.a(p, x, true);
            f.i();
            Singleton.b().a(Event.S3_SUCCESS, i, null, k);
            Singleton.b().a(Event.S3_SUCCESS, q, i, null, k, -1);
            if (!u)
            {
                u = true;
                f.g();
                return true;
            }
        }
        return true;
    }

    public final void a()
    {
        Message.obtain(m, 4).sendToTarget();
    }

    public final void a(int i1)
    {
        m.removeMessages(5);
        Message.obtain(m, 5, Integer.valueOf(i1)).sendToTarget();
    }

    public final void a(RecognitionState recognitionstate)
    {
        Message.obtain(m, 1, new RecognitionState(recognitionstate)).sendToTarget();
    }

    public final void a(Exception exception)
    {
        Message.obtain(m, 3, exception).sendToTarget();
    }

    public final void b()
    {
        if (!s) goto _L2; else goto _L1
_L1:
        i i1;
        c();
        i1 = w;
        i1.a.set(true);
        if (i1.d == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        i1.d.close();
        i1.d = null;
_L4:
        i1.g = null;
        i1.h.a();
        g.a();
        s = false;
        c = null;
_L2:
        return;
        Object obj;
        obj;
        i1.d = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        i1.d = null;
        throw obj;
    }

    public final void b_()
    {
        if (!s)
        {
            s = true;
            t = false;
            u = false;
            r = true;
            p = "";
            y = false;
            x = null;
            c = null;
            C.set(false);
            q = System.currentTimeMillis();
            Object obj = w;
            obj.g = new com.google.android.libraries.b.a.a.a();
            obj.c = 0L;
            ((i) (obj)).h.a();
            if (((i) (obj)).b)
            {
                obj.f = new com.google.android.libraries.translate.tts.network.a(Singleton.a());
                if (((i) (obj)).d != null)
                {
                    FileNotFoundException filenotfoundexception;
                    try
                    {
                        ((i) (obj)).d.close();
                    }
                    catch (IOException ioexception) { }
                    obj.d = null;
                }
                obj.e = ((i) (obj)).f.a();
                try
                {
                    obj.d = new FileOutputStream(((i) (obj)).e.getAbsolutePath());
                }
                // Misplaced declaration of an exception variable
                catch (FileNotFoundException filenotfoundexception) { }
            }
            ((i) (obj)).a.set(false);
            obj = h;
            obj.e = new j(((com.google.android.apps.gsa.a.a.a) (obj)).d, AudioUtils.a(), AudioUtils.b(((com.google.android.apps.gsa.a.a.a) (obj)).c), ((com.google.android.apps.gsa.a.a.a) (obj)).a(((com.google.android.apps.gsa.a.a.a) (obj)).c), ((com.google.android.apps.gsa.a.a.a) (obj)).b, ((com.google.android.apps.gsa.a.a.a) (obj)).a);
            g.a(h);
        }
    }

    public final void c()
    {
        if (r)
        {
            ((com.google.android.apps.gsa.a.a.a) (h)).e.a();
        }
        if (o != null)
        {
            try
            {
                o.close();
            }
            catch (IOException ioexception) { }
            o = null;
        }
        r = false;
    }

    public final void d()
    {
        Message.obtain(m, 2).sendToTarget();
    }

    public final boolean handleMessage(Message message)
    {
        int i1 = -1;
        if (s) goto _L2; else goto _L1
_L1:
        if (message != null)
        {
            i1 = message.what;
        }
_L4:
        return true;
_L2:
        switch (message.what)
        {
        default:
            return true;

        case 5: // '\005'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            message = (RecognitionState)message.obj;
            if (s)
            {
                c = message;
                if (!y)
                {
                    if (message.c())
                    {
                        e();
                    }
                    if (((RecognitionState) (message)).c == RecognitionState.ResultType.RESULT)
                    {
                        if (message.a(p, x))
                        {
                            p = message.b();
                            x = message.a(d, e, i, j);
                            f.a(p, x, false);
                        }
                    } else
                    if (((RecognitionState) (message)).c == RecognitionState.ResultType.COMPLETED_RESULT)
                    {
                        if (!TextUtils.isEmpty(message.b()))
                        {
                            p = message.b();
                        }
                        TextUtils.isEmpty(p);
                        String s1 = message.a(d, e, i, j);
                        if (s1 != null)
                        {
                            x = s1;
                        }
                        if (!TextUtils.isEmpty(p))
                        {
                            y = true;
                            if (!message.c())
                            {
                                f();
                            } else
                            if (!e())
                            {
                                f.a(p, x, false);
                            }
                        }
                    }
                } else
                {
                    e();
                }
                if (((RecognitionState) (message)).d != RecognitionState.EndpointerState.START_OF_SPEECH && ((RecognitionState) (message)).d == RecognitionState.EndpointerState.END_OF_SPEECH && n && !TextUtils.isEmpty(p))
                {
                    u = true;
                    f.g();
                    c();
                }
                if (((RecognitionState) (message)).i)
                {
                    if (message.a(p, x))
                    {
                        p = message.b();
                        x = message.a(d, e, i, j);
                    }
                    e();
                }
            }
            m.removeMessages(6);
            if (!TextUtils.isEmpty(p) && (!A || x != null))
            {
                m.sendEmptyMessageDelayed(6, 3000L);
                return true;
            }
            break;

        case 3: // '\003'
            message = (RecognizeException)message.obj;
            String s2;
            char c1;
            int j1;
            if (message instanceof NetworkRecognizeException)
            {
                j1 = com.google.android.libraries.translate.f.voice_network_error;
                c1 = '\uFD42';
            } else
            {
                j1 = com.google.android.libraries.translate.f.voice_no_match;
                c1 = '\uFD44';
            }
            s2 = Singleton.a().getString(j1);
            f.c(s2);
            Singleton.b().a(c1, message.getClass().getName());
            (new StringBuilder(String.valueOf(s2).length() + 20)).append("Recognizer error: [").append(s2).append("]");
            return true;

        case 6: // '\006'
            f();
            return true;

        case 4: // '\004'
            f.f();
            Singleton.b().a(Event.S3_CONNECTED, i, null, k);
            Singleton.b().a(Event.S3_CONNECTED, q, i, null, k, -1);
            return true;

        case 2: // '\002'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!r) goto _L4; else goto _L5
_L5:
        f.a((float)((Integer)message.obj).intValue() / 10F);
        return true;
    }
}
