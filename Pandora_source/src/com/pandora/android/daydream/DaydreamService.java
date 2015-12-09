// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.service.dreams.DreamService;
import android.support.v4.content.j;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.Main;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.ae;
import com.pandora.android.util.p;
import com.pandora.android.util.v;
import com.pandora.radio.data.af;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import p.cw.c;
import p.cw.d;
import p.dd.ag;
import p.dd.an;
import p.dd.ap;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;

// Referenced classes of package com.pandora.android.daydream:
//            b, LightshowView, a

public class DaydreamService extends DreamService
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/daydream/DaydreamService$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("CHECKING_SERVICE", 0);
            b = new a("WAITING_FOR_SERVICE", 1);
            c = new a("READY", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    private class b extends AsyncTask
    {

        final DaydreamService a;

        protected transient y a(Void avoid[])
        {
            return com.pandora.radio.util.i.b();
        }

        protected void a(y y1)
        {
            DaydreamService.a(a, y1);
            DaydreamService.a(a, com.pandora.android.daydream.a.c);
            a.b();
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((y)obj);
        }

        private b()
        {
            a = DaydreamService.this;
            super();
        }

    }


    protected LightshowView a;
    protected com.pandora.android.daydream.b b;
    protected c c;
    private LinearLayout d;
    private TextView e;
    private y f;
    private a g;
    private b.d h;
    private boolean i;
    private boolean j;
    private CountDownTimer k;
    private CountDownTimer l;
    private android.view.View.OnClickListener m;
    private android.view.View.OnClickListener n;

    public DaydreamService()
    {
        g = a.a;
        i = false;
        k = new CountDownTimer(5000L, 5000L) {

            final DaydreamService a;

            public void onFinish()
            {
                if (com.pandora.android.daydream.DaydreamService.b(a))
                {
                    a.b.a(b.c.a, b.b.a);
                    return;
                } else
                {
                    a.b.a(com.pandora.android.daydream.b.c.b, b.b.a);
                    return;
                }
            }

            public void onTick(long l1)
            {
            }

            
            {
                a = DaydreamService.this;
                super(l1, l2);
            }
        };
        l = new CountDownTimer(5000L, 5000L) {

            final DaydreamService a;

            public void onFinish()
            {
                com.pandora.android.daydream.DaydreamService.c(a);
            }

            public void onTick(long l1)
            {
            }

            
            {
                a = DaydreamService.this;
                super(l1, l2);
            }
        };
        m = new android.view.View.OnClickListener() {

            final DaydreamService a;

            public void onClick(View view)
            {
                view.getId();
                JVM INSTR tableswitch 2131755319 2131755329: default 64
            //                           2131755319 65
            //                           2131755320 64
            //                           2131755321 64
            //                           2131755322 64
            //                           2131755323 64
            //                           2131755324 64
            //                           2131755325 64
            //                           2131755326 93
            //                           2131755327 106
            //                           2131755328 119
            //                           2131755329 127;
                   goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L3 _L4 _L5 _L6
_L1:
                return;
_L2:
                a.b.b(b.c.a);
                DaydreamService.a(a);
_L8:
                DaydreamService.a(a);
                return;
_L3:
                a.b.e();
                continue; /* Loop/switch isn't completed */
_L4:
                a.b.d();
                continue; /* Loop/switch isn't completed */
_L5:
                ae.a(null);
                continue; /* Loop/switch isn't completed */
_L6:
                ae.b(null);
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                a = DaydreamService.this;
                super();
            }
        };
        n = new android.view.View.OnClickListener() {

            final DaydreamService a;

            public void onClick(View view)
            {
                view.getId();
                JVM INSTR lookupswitch 3: default 40
            //                           2131755317: 41
            //                           2131755340: 258
            //                           2131755341: 219;
                   goto _L1 _L2 _L3 _L4
_L1:
                return;
_L2:
                DaydreamService.a(a, a.b.c());
                if (com.pandora.android.daydream.DaydreamService.d(a) == com.pandora.android.daydream.b.d.c)
                {
                    view = p.cr.k.a(p.cr.k.b.d, p.a, null);
                    view = (new PandoraIntent("show_page")).setClass(a.getApplicationContext(), com/pandora/android/Main).setData(view);
                    view.addFlags(0x10000000);
                    a.startActivity(view);
                    a.finish();
                    return;
                }
                if (com.pandora.android.daydream.DaydreamService.d(a) == com.pandora.android.daydream.b.d.d)
                {
                    view = new Intent(a.getApplicationContext(), com/pandora/android/Main);
                    view.addFlags(0x10000000);
                    a.startActivity(view);
                    a.finish();
                    return;
                }
                if (DaydreamService.e(a) == com.pandora.android.daydream.a.c)
                {
                    a.b.b(com.pandora.android.daydream.b.c.b);
                    DaydreamService.a(a);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L4:
                DaydreamService.a(a, a.b.c());
                if (com.pandora.android.daydream.DaydreamService.d(a) == b.d.f)
                {
                    DaydreamService.f(a);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                DaydreamService.a(a, a.b.c());
                if (com.pandora.android.daydream.DaydreamService.d(a) == com.pandora.android.daydream.b.d.b)
                {
                    a.c.d().a(p.cw.b.c.a);
                    a.c.z().a();
                    a.b.a(true);
                    DaydreamService.f(a);
                    return;
                }
                if (com.pandora.android.daydream.DaydreamService.d(a) == b.d.e)
                {
                    view = new Intent(a.getApplicationContext(), com/pandora/android/Main);
                    view.addFlags(0x10000000);
                    view.setAction(PandoraIntent.a("show_upgrade"));
                    com.pandora.android.provider.b.a.a(view);
                    a.startActivity(view);
                    if (a.c.d().t() != null)
                    {
                        view = new PandoraIntent("show_now_playing");
                    } else
                    {
                        view = new PandoraIntent("show_no_station_selected");
                    }
                    com.pandora.android.provider.b.a.C().a(view);
                    com.pandora.android.provider.b.a.b().o().a();
                    a.finish();
                    a.b.a(false);
                    return;
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                a = DaydreamService.this;
                super();
            }
        };
    }

    static a a(DaydreamService daydreamservice, a a1)
    {
        daydreamservice.g = a1;
        return a1;
    }

    static b.d a(DaydreamService daydreamservice, b.d d1)
    {
        daydreamservice.h = d1;
        return d1;
    }

    static y a(DaydreamService daydreamservice, y y)
    {
        daydreamservice.f = y;
        return y;
    }

    static void a(DaydreamService daydreamservice)
    {
        daydreamservice.f();
    }

    private void a(String s)
    {
        com.pandora.android.provider.b.a.b().o().a(s, j);
    }

    public static boolean a()
    {
        if (com.pandora.android.provider.b.a.d() == null)
        {
            return false;
        } else
        {
            return com.pandora.android.provider.b.a.d().i();
        }
    }

    static boolean b(DaydreamService daydreamservice)
    {
        return daydreamservice.i;
    }

    private void c()
    {
        i = true;
        if (c.d().t() != null)
        {
            if (!c.d().o())
            {
                ae.a(null);
            }
        } else
        {
            c.d().a(f, null, false, null, null);
            f = null;
        }
        b.a(com.pandora.android.daydream.b.c.b, com.pandora.android.daydream.b.b.b);
        b.a(b.c.a);
        f();
        a("playback");
    }

    static void c(DaydreamService daydreamservice)
    {
        daydreamservice.d();
    }

    static b.d d(DaydreamService daydreamservice)
    {
        return daydreamservice.h;
    }

    private void d()
    {
        if (i)
        {
            i = false;
            b.a(com.pandora.android.daydream.b.c.b);
            b.a(b.c.a, com.pandora.android.daydream.b.b.b);
            b.b(false);
            a.a();
            a.postDelayed(new Runnable() {

                final DaydreamService a;

                public void run()
                {
                    a.b.b(true);
                    DaydreamService.a(a);
                }

            
            {
                a = DaydreamService.this;
                super();
            }
            }, 1000L);
            a("lightshow");
        }
    }

    static a e(DaydreamService daydreamservice)
    {
        return daydreamservice.g;
    }

    private void e()
    {
        (new b()).execute(new Void[0]);
    }

    private void f()
    {
        k.cancel();
        k.start();
    }

    static void f(DaydreamService daydreamservice)
    {
        daydreamservice.c();
    }

    private void g()
    {
        l.cancel();
        l.start();
    }

    void b()
    {
        j = a();
        if (j)
        {
            if (i || c.d().o())
            {
                i = true;
                b.a(b.c.a);
                a.b();
                a("playback");
            } else
            {
                i = false;
                b.a(com.pandora.android.daydream.b.c.b);
                a("lightshow");
            }
        } else
        {
            i = false;
            b.a(com.pandora.android.daydream.b.c.b);
            a("lightshow");
        }
        f();
    }

    public void onAttachedToWindow()
    {
        boolean flag = true;
        super.onAttachedToWindow();
        c = com.pandora.android.provider.b.a.b();
        if (c.C())
        {
            finish();
        }
        setContentView(0x7f040048);
        setInteractive(true);
        setFullscreen(true);
        View view;
        if (c.j().s())
        {
            flag = false;
        }
        setScreenBright(flag);
        view = findViewById(0x1020002);
        b = new com.pandora.android.daydream.b(getApplicationContext(), view);
        b.a(m);
        b.b(n);
        a = (LightshowView)findViewById(0x7f100131);
        d = (LinearLayout)findViewById(0x7f100138);
        e = (TextView)findViewById(0x7f100139);
        if (g == a.a && !com.pandora.android.provider.b.a.g())
        {
            g = com.pandora.android.daydream.a.b;
            com.pandora.android.provider.b.a.a(new Intent());
            startService(new Intent(getApplicationContext(), com/pandora/android/PandoraService));
            a("lightshow");
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (a != null)
        {
            a.b();
        }
        configuration = findViewById(0x7f100133);
        if (configuration != null)
        {
            configuration.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(configuration) {

                final View a;
                final DaydreamService b;

                public void onGlobalLayout()
                {
                    a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    b.b.a(null, false);
                }

            
            {
                b = DaydreamService.this;
                a = view;
                super();
            }
            });
        }
    }

    public void onDreamingStarted()
    {
        super.onDreamingStarted();
        com.pandora.android.provider.b.a.b().b(this);
        com.pandora.android.provider.b.a.e().c(this);
    }

    public void onDreamingStopped()
    {
        super.onDreamingStopped();
        k.cancel();
        com.pandora.android.provider.b.a.b().c(this);
        com.pandora.android.provider.b.a.e().b(this);
        b.b();
        a("terminate");
    }

    public void onPlayerStateChange(ag ag1)
    {
        while (!a() || ag1.a != p.cw.b.a.d) 
        {
            return;
        }
        h = com.pandora.android.daydream.b.d.b;
        b.a(com.pandora.android.daydream.b.d.b);
        d();
    }

    public void onSignInStateRadioEvent(an an1)
    {
        static class _cls7
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[p.cx.e.a.values().length];
                try
                {
                    c[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[p.cx.e.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                b = new int[p.cw.d.a.values().length];
                try
                {
                    b[p.cw.d.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cw.d.a.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cw.d.a.h.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.daydream._cls7.c[an1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            e();
            return;

        case 2: // '\002'
            g = com.pandora.android.daydream.a.c;
            break;
        }
        b();
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.a(ap1.c) && ap1.c != p.cw.d.a.d)
        {
            com.pandora.android.daydream.a.a(v.a(ap1.c), e, d);
        }
    }

    public void onThumbDown(bb bb1)
    {
        com.pandora.android.daydream._cls7.b[bb1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 36
    //                   3 57;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (!bb1.c)
        {
            b.a(-1, bb1.b);
            return;
        }
          goto _L1
_L3:
        com.pandora.android.daydream.a.a(getResources().getString(0x7f080183), e, d);
        return;
    }

    public void onThumbRevert(bc bc1)
    {
        b.a(bc1.b, bc1.a);
    }

    public void onThumbUp(bd bd1)
    {
        com.pandora.android.daydream._cls7.b[bd1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (!bd1.c)
        {
            b.a(1, bd1.b);
            return;
        }
          goto _L1
_L3:
        com.pandora.android.daydream.a.a(getResources().getString(0x7f080183), e, d);
        return;
    }

    public void onTrackElapsedTime(bg bg1)
    {
        while (!a() || g == a.a) 
        {
            return;
        }
        b.a(bg1.b, bg1.a * 1000);
    }

    public void onTrackState(bh bh1)
    {
        if (a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.pandora.radio.data.aa aa = bh1.b;
        _cls7.a[bh1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 6
    //                   2 87
    //                   3 121
    //                   4 164
    //                   5 6;
           goto _L3 _L4 _L5 _L6 _L7 _L4
_L7:
        break MISSING_BLOCK_LABEL_164;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        throw new InvalidParameterException((new StringBuilder()).append("Unknown state: ").append(bh1.a).toString());
_L5:
        if (!i) goto _L9; else goto _L8
_L9:
        if (true) goto _L1; else goto _L10
_L8:
        b.a(null, true);
        b.a(aa);
        b.a(0L, 0);
        return;
_L10:
        if (g != a.a)
        {
            if (i)
            {
                b.a(aa);
            }
        } else
        {
            b.a();
        }
        l.cancel();
        return;
        if (i)
        {
            b.a(aa);
        }
        g();
        return;
    }
}
