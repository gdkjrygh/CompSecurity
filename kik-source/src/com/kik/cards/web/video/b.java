// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.video;

import android.support.v4.app.FragmentActivity;
import kik.a.h.j;
import kik.android.chat.activity.k;
import kik.android.chat.fragment.WebVideoFragment;
import kik.android.util.cq;
import kik.android.widget.WebVideoView;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.video:
//            c, d, VideoPlayerPlugin, a

public final class b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private static b b;
    private int a;
    private String c;
    private WebVideoView d;
    private VideoPlayerPlugin e;
    private WebVideoFragment f;
    private boolean g;
    private boolean h;
    private FragmentActivity i;
    private com.kik.cards.web.video.a j;
    private int k;
    private boolean l;

    private b()
    {
        c = null;
        h = false;
        j = null;
        k = a.a;
        l = false;
    }

    public static b a()
    {
        if (b == null)
        {
            b = new b();
        }
        return b;
    }

    static WebVideoFragment a(b b1)
    {
        return b1.f;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.l = flag;
        return flag;
    }

    static WebVideoView b(b b1)
    {
        return b1.d;
    }

    static boolean c(b b1)
    {
        return b1.h;
    }

    static boolean d(b b1)
    {
        b1.g = true;
        return true;
    }

    public final void a(int i1)
    {
        d.a(i1);
        if (k == a.c)
        {
            d.a();
        }
    }

    public final void a(FragmentActivity fragmentactivity)
    {
        i = fragmentactivity;
    }

    public final void a(VideoPlayerPlugin videoplayerplugin)
    {
        e = videoplayerplugin;
    }

    public final void a(String s1)
    {
        g = false;
        if (k == a.a) goto _L2; else goto _L1
_L1:
        i();
        j();
_L4:
        if (!cq.c(s1))
        {
            c = s1;
            d = new WebVideoView(i);
            d.a(s1);
            d.a(new c(this));
            d.a(new d(this));
            d.k();
        }
        return;
_L2:
        if (!cq.c(c))
        {
            j();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(WebVideoFragment webvideofragment)
    {
        f = webvideofragment;
    }

    public final void b(int i1)
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   -1010: 105
    //                   -1007: 96
    //                   -1004: 87
    //                   -110: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s1;
        String s2;
        s2 = "UNKNOWN";
        s1 = "UNKNOWN";
_L7:
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("type", s2);
        jsonobject.put("message", s1);
        e.a(jsonobject);
        return;
_L4:
        s2 = "NETWORK";
        s1 = "IO MEDIA ERROR";
        continue; /* Loop/switch isn't completed */
_L3:
        s2 = "PLAYBACK";
        s1 = "Malformed bitstream";
        continue; /* Loop/switch isn't completed */
_L2:
        s2 = "PLAYBACK";
        s1 = "Unsupported file type";
        continue; /* Loop/switch isn't completed */
_L5:
        s2 = "NETWORK";
        s1 = "Network time out";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean b()
    {
        return g;
    }

    public final boolean c()
    {
        return h;
    }

    public final void d()
    {
        h = true;
    }

    public final String e()
    {
        return c;
    }

    public final void f()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.a().length];
                try
                {
                    a[a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[k - 1];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 112;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        a = i.getRequestedOrientation();
        h = true;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            int i1 = d.q();
            a(c);
            h = true;
            d.a(i1);
        }
        kik.android.chat.activity.k.a(new kik.android.chat.fragment.WebVideoFragment.a(), i).f();
_L5:
        k = a.c;
        return;
_L3:
        d.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final WebVideoView g()
    {
        return d;
    }

    public final boolean h()
    {
        return k == a.c;
    }

    public final void i()
    {
        if (k != a.a)
        {
            if (f != null)
            {
                f.b();
                f.J();
            }
            f = null;
            u();
        }
    }

    public final void j()
    {
        c = null;
        h = false;
        f = null;
        l = false;
        j = null;
        if (d != null)
        {
            d.j();
            d.m();
        }
    }

    public final boolean k()
    {
        return l;
    }

    public final void l()
    {
        l = false;
    }

    public final boolean m()
    {
        return k == a.a;
    }

    public final int n()
    {
        return d.p();
    }

    public final int o()
    {
        return d.o();
    }

    public final void p()
    {
        switch (_cls1.a[k - 1])
        {
        case 2: // '\002'
        default:
            return;

        case 3: // '\003'
            d.b();
            return;

        case 1: // '\001'
            a = i.getRequestedOrientation();
            h = false;
            kik.android.chat.activity.k.a(new kik.android.chat.fragment.WebVideoFragment.a(), i).f();
            s();
            return;
        }
    }

    public final boolean q()
    {
        return k == a.b;
    }

    public final void r()
    {
        k = a.c;
        e.c();
    }

    public final void s()
    {
        k = a.b;
        e.d();
    }

    public final void t()
    {
        k = a.a;
        if (j == null)
        {
            j = new com.kik.cards.web.video.a(c, kik.a.h.j.b() / 1000L);
            return;
        } else
        {
            j.a(c, kik.a.h.j.b() / 1000L);
            return;
        }
    }

    public final void u()
    {
        if (d.e())
        {
            d.n();
        }
        k = a.a;
        e.j();
    }

    public final int v()
    {
        return a;
    }

    public final JSONObject w()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        if (j == null)
        {
            jsonobject.put("completion", JSONObject.NULL);
            return jsonobject;
        } else
        {
            jsonobject1.put("url", j.a());
            jsonobject1.put("time", j.b());
            jsonobject.put("completion", jsonobject1);
            return jsonobject;
        }
    }
}
