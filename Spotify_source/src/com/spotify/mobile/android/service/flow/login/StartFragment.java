// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dmz;
import dxk;
import dxv;
import dxw;
import dxx;
import dxy;
import dyf;
import dyg;
import gbu;
import ggl;
import ggn;
import gmv;

public class StartFragment extends dxx
    implements dxw
{

    private ImageView Y;
    private View Z;
    public boolean a;
    private View aa;
    private Button ab;
    private Button ac;
    private int ad;
    private int ae;
    private ggl af;
    private Handler ag;
    private float ah;
    private boolean ai;
    private View aj;
    private dxv ak;
    private final android.view.View.OnTouchListener al = new android.view.View.OnTouchListener() {

        private StartFragment a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            motionevent.getAction();
            JVM INSTR tableswitch 0 3: default 36
        //                       0 38
        //                       1 162
        //                       2 63
        //                       3 162;
               goto _L1 _L2 _L3 _L4 _L3
_L1:
            return true;
_L2:
            StartFragment.a(a, motionevent.getX());
            StartFragment.d(a).removeMessages(1);
            return true;
_L4:
            float f1 = motionevent.getX();
            if (StartFragment.f(a))
            {
                StartFragment.a(a, f1);
                return true;
            }
            float f2 = StartFragment.g(a) - f1;
            StartFragment.a(a, f1);
            if (Math.abs(f2 / (float)StartFragment.h(a)) > 0.01F)
            {
                StartFragment.i(a);
                if (f2 > 0.0F)
                {
                    StartFragment.j(a);
                    return true;
                } else
                {
                    StartFragment.k(a);
                    return true;
                }
            }
              goto _L1
_L3:
            StartFragment.l(a);
            return true;
        }

            
            {
                a = StartFragment.this;
                super();
            }
    };
    private ImageView b;

    public StartFragment()
    {
        ad = 0x7fffffff;
        ai = true;
    }

    public static StartFragment F()
    {
        StartFragment startfragment = new StartFragment();
        startfragment.f(new Bundle());
        return startfragment;
    }

    private dyf I()
    {
        return (dyf)H().a(this);
    }

    private void K()
    {
        ag.removeMessages(1);
        ag.sendEmptyMessageDelayed(1, 5000L);
    }

    static float a(StartFragment startfragment, float f1)
    {
        startfragment.ah = f1;
        return f1;
    }

    static int a(StartFragment startfragment, int i1)
    {
        startfragment.ad = i1;
        return i1;
    }

    static void a(int i1, View view)
    {
        b(i1, view);
    }

    private void a(int i1, Direction direction)
    {
        Animation animation;
        int j1;
        if (direction == Direction.a)
        {
            j1 = 0x7f04000a;
        } else
        {
            j1 = 0x7f04000b;
        }
        animation = f(j1);
        animation.setAnimationListener(new gbu(i1) {

            private int a;
            private StartFragment b;

            public final void onAnimationEnd(Animation animation1)
            {
                StartFragment.a(a, StartFragment.c(b));
                StartFragment.d(b).sendEmptyMessageDelayed(2, 250L);
            }

            
            {
                b = StartFragment.this;
                a = i1;
                super();
            }
        });
        a(animation);
        if (direction == Direction.a)
        {
            i1 = 0x7f04000d;
        } else
        {
            i1 = 0x7f04000c;
        }
        direction = f(i1);
        a(((Animation) (direction)));
        aa.startAnimation(animation);
        Z.startAnimation(direction);
    }

    private static void a(Animation animation)
    {
        animation.setDuration(250L);
        animation.setFillAfter(true);
    }

    static void a(StartFragment startfragment)
    {
        startfragment.I().a();
    }

    private static void b(int i1, View view)
    {
        i1;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 102
    //                   1 111
    //                   2 120
    //                   3 129
    //                   4 138;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        int j1;
        Assertion.a((new StringBuilder("View at position ")).append(i1).append(" not defined").toString());
        i1 = 0x7f0804f3;
        j1 = 0x7f0804f2;
_L8:
        TextView textview = (TextView)view.findViewById(0x7f1102f9);
        view = (TextView)view.findViewById(0x7f11026e);
        textview.setText(j1);
        view.setText(i1);
        view.setVisibility(0);
        return;
_L2:
        i1 = 0x7f0804f3;
        j1 = 0x7f0804f2;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f0804f1;
        j1 = 0x7f0804f0;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f0804f7;
        j1 = 0x7f0804f6;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 0x7f0804f9;
        j1 = 0x7f0804f8;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f0804f5;
        j1 = 0x7f0804f4;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void b(StartFragment startfragment)
    {
        startfragment.I().b();
    }

    static View c(StartFragment startfragment)
    {
        return startfragment.Z;
    }

    static int d(int i1)
    {
        return h(i1);
    }

    static Handler d(StartFragment startfragment)
    {
        return startfragment.ag;
    }

    static ImageView e(StartFragment startfragment)
    {
        return startfragment.b;
    }

    private void e(int i1)
    {
        boolean flag1 = true;
        ae = i1;
        View view = y();
        View view1 = view.findViewById(0x7f1103bb);
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view1.setEnabled(flag);
        view1 = view.findViewById(0x7f1103bc);
        if (i1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view1.setEnabled(flag);
        view1 = view.findViewById(0x7f1103bd);
        if (i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view1.setEnabled(flag);
        view1 = view.findViewById(0x7f1103be);
        if (i1 == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view1.setEnabled(flag);
        view = view.findViewById(0x7f1103bf);
        if (i1 == 4)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

    private Animation f(int i1)
    {
        return AnimationUtils.loadAnimation((Context)ctz.a(k()), i1);
    }

    static boolean f(StartFragment startfragment)
    {
        return startfragment.a;
    }

    static float g(StartFragment startfragment)
    {
        return startfragment.ah;
    }

    private void g(int i1)
    {
        if (ai)
        {
            return;
        } else
        {
            Y.setImageResource(h(i1));
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(250L);
            alphaanimation.setFillAfter(false);
            alphaanimation.setAnimationListener(new gbu(i1) {

                private int a;
                private StartFragment b;

                public final void onAnimationEnd(Animation animation)
                {
                    StartFragment.e(b).setImageResource(StartFragment.d(a));
                }

            
            {
                b = StartFragment.this;
                a = i1;
                super();
            }
            });
            b.startAnimation(alphaanimation);
            return;
        }
    }

    private static int h(int i1)
    {
        switch (i1)
        {
        default:
            Assertion.a((new StringBuilder("View at position ")).append(i1).append(" not defined").toString());
            // fall through

        case 0: // '\0'
            return 0x7f02005b;

        case 1: // '\001'
            return 0x7f02005a;

        case 2: // '\002'
            return 0x7f02005d;

        case 3: // '\003'
            return 0x7f02005e;

        case 4: // '\004'
            return 0x7f02005c;
        }
    }

    static int h(StartFragment startfragment)
    {
        return startfragment.ad;
    }

    static boolean i(StartFragment startfragment)
    {
        startfragment.a = true;
        return true;
    }

    public static void j(StartFragment startfragment)
    {
        int i1 = (startfragment.ae + 1) % 5;
        b(i1, startfragment.aa);
        startfragment.g(i1);
        startfragment.a(i1, Direction.b);
        startfragment.e(i1);
    }

    static void k(StartFragment startfragment)
    {
        int i1;
        if (startfragment.ae == 0)
        {
            i1 = 4;
        } else
        {
            i1 = startfragment.ae - 1;
        }
        b(i1, startfragment.aa);
        startfragment.g(i1);
        startfragment.a(i1, Direction.a);
        startfragment.e(i1);
    }

    public static void l(StartFragment startfragment)
    {
        startfragment.K();
    }

    public final void A()
    {
        dxv dxv1;
        super.A();
        dxv1 = ak;
        if (dxv1.a == null || !dxv1.a.isPlaying())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((gmv)dmz.a(gmv)).a();
        dxv1.a.pause();
        Exception exception;
        try
        {
            ((gmv)dmz.a(gmv)).b();
        }
        catch (IllegalStateException illegalstateexception)
        {
            dxv1.a("Media player crashed while attempting to pause", illegalstateexception);
        }
        af.b();
        return;
        exception;
        ((gmv)dmz.a(gmv)).b();
        throw exception;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030098, viewgroup, false);
        viewgroup = (ViewStub)layoutinflater.findViewById(0x7f1103b5);
        viewgroup.setLayoutResource(0x7f0300ca);
        viewgroup.inflate();
        ab = (Button)layoutinflater.findViewById(0x7f1103fc);
        ac = (Button)layoutinflater.findViewById(0x7f1103fd);
        aj = layoutinflater.findViewById(0x7f1103c0);
        b = (ImageView)layoutinflater.findViewById(0x7f1103b7);
        Y = (ImageView)layoutinflater.findViewById(0x7f1103b6);
        Z = layoutinflater.findViewById(0x7f1103b8);
        aa = layoutinflater.findViewById(0x7f1103ba);
        aa.setVisibility(4);
        ak = new dxv((SurfaceView)layoutinflater.findViewById(0x7f1102e6), this);
        layoutinflater.setOnTouchListener(al);
        ag = new dyg(this, (byte)0);
        return layoutinflater;
    }

    public final void a()
    {
        ai = false;
        b.setVisibility(0);
        Y.setVisibility(0);
        b.setImageResource(h(0));
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        af = ggn.b(k(), ViewUri.aw);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ab.setOnClickListener(new android.view.View.OnClickListener() {

            private StartFragment a;

            public final void onClick(View view1)
            {
                StartFragment.a(a);
            }

            
            {
                a = StartFragment.this;
                super();
            }
        });
        H();
        ac.setOnClickListener(new android.view.View.OnClickListener() {

            private StartFragment a;

            public final void onClick(View view1)
            {
                StartFragment.b(a);
            }

            
            {
                a = StartFragment.this;
                super();
            }
        });
        b(0, Z);
        e(0);
        Z.post(new Runnable() {

            private StartFragment a;

            public final void run()
            {
                StartFragment.a(a, StartFragment.c(a).getWidth());
            }

            
            {
                a = StartFragment.this;
                super();
            }
        });
    }

    public final void a(dxy dxy1)
    {
        if (aj != null)
        {
            View view = aj;
            int i1;
            if (dxy1.b)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
        }
    }

    public final void e()
    {
        ak.b();
        super.e();
    }

    public final Context j()
    {
        return (Context)ctz.a(k());
    }

    public final void z()
    {
        dxv dxv1;
        super.z();
        af.a();
        K();
        dxv1 = ak;
        if (!dxv1.b) goto _L2; else goto _L1
_L1:
        if (dxv1.a != null) goto _L4; else goto _L3
_L3:
        dxv1.a();
_L2:
        return;
_L4:
        if (dxv1.a.isPlaying()) goto _L2; else goto _L5
_L5:
        dxv1.a.start();
        return;
        Exception exception;
        exception;
        dxv1.a("Media player crashed while attempting to resume", exception);
        return;
    }

    private class Direction extends Enum
    {

        public static final Direction a;
        public static final Direction b;
        private static final Direction c[];

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/spotify/mobile/android/service/flow/login/StartFragment$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])c.clone();
        }

        static 
        {
            a = new Direction("LEFT", 0);
            b = new Direction("RIGHT", 1);
            c = (new Direction[] {
                a, b
            });
        }

        private Direction(String s, int i1)
        {
            super(s, i1);
        }
    }

}
