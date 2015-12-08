// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.otto.Bus;

public final class Ey
    implements PI.a
{
    public static interface a
    {

        public abstract void d();
    }


    final Er a;
    final Bus b;
    View c;
    a d;
    int e;
    public String f;
    public boolean g;
    private TextView h;
    private ProgressBar i;
    private ImageView j;
    private final android.view.View.OnClickListener k;

    public Ey()
    {
        this(Er.a(), Mf.a());
    }

    private Ey(Er er, Bus bus)
    {
        e = 0;
        f = "";
        g = false;
        k = new android.view.View.OnClickListener() {

            private Ey a;

            public final void onClick(View view)
            {
                a.a();
                if (a.d != null)
                {
                    a.d.d();
                }
            }

            
            {
                a = Ey.this;
                super();
            }
        };
        a = er;
        b = bus;
    }

    final void a()
    {
        g = true;
        c.setVisibility(0);
        c.setAlpha(1.0F);
        i.setVisibility(0);
        j.setVisibility(4);
        h.setText(f);
    }

    public final void a(Ex ex)
    {
        f = "";
        PG.a(new Runnable(this, ex) {

            private Ey a;
            private Ex b;
            private Ey c;

            public final void run()
            {
                c.e = 1;
                c.a.a(a, b);
            }

            
            {
                c = Ey.this;
                a = ey1;
                b = ex;
                super();
            }
        });
    }

    public final void a(a a1)
    {
        PG.a(new Runnable(a1, this, a1) {

            private a a;
            private Ey b;
            private a c;
            private Ey d;

            public final void run()
            {
                d.e = 2;
                d.d = a;
                d.a.a(b, (Ex)c);
            }

            
            {
                d = Ey.this;
                a = a1;
                b = ey1;
                c = a2;
                super();
            }
        });
    }

    public final void a(View view)
    {
        if (c != view)
        {
            f = "";
            c = view;
            j = (ImageView)view.findViewById(0x7f0d04ac);
            h = (TextView)view.findViewById(0x7f0d04ad);
            h.setText(0x7f0800ef);
            h.setOnClickListener(k);
            i = (ProgressBar)view.findViewById(0x7f0d04ab);
        }
        e;
        JVM INSTR tableswitch 0 4: default 116
    //                   0 117
    //                   1 246
    //                   2 187
    //                   3 251
    //                   4 297;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        g = false;
        if (c.getVisibility() == 0)
        {
            view = ObjectAnimator.ofFloat(c, View.ALPHA, new float[] {
                1.0F, 0.0F
            });
            view.setDuration(800L);
            view.addListener(new Jr() {

                private Ey a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.c.setVisibility(8);
                }

            
            {
                a = Ey.this;
                super();
            }
            });
            view.start();
            j.setOnClickListener(null);
            return;
        }
          goto _L1
_L4:
        g = false;
        c.setVisibility(0);
        i.setVisibility(8);
        j.setVisibility(0);
        h.setText(0x7f0800ef);
        h.setVisibility(0);
        j.setOnClickListener(k);
        return;
_L3:
        a();
        return;
_L5:
        h.setText(f);
        h.setAlpha(0.0F);
        h.setVisibility(0);
        h.animate().alpha(1.0F).setDuration(800L);
        return;
_L6:
        a();
        g = false;
        return;
    }

    // Unreferenced inner class Ey$3

/* anonymous class */
    public final class _cls3
        implements Runnable
    {

        final Ey a;
        private Ey b;
        private Ex c;

        public final void run()
        {
            a.e = 4;
            a.a.a(b, c);
            com.snapchat.android.util.eventbus.ShowDialogEvent.a a1 = new com.snapchat.android.util.eventbus.ShowDialogEvent.a(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.ONE_BUTTON);
            a1.mTitleResId = 0x7f0800f3;
            a1.mMessageResId = 0x7f0800f1;
            a1.mOnClickListener = new android.content.DialogInterface.OnClickListener(this) {

                private _cls3 a;

                public final void onClick(DialogInterface dialoginterface, int l)
                {
    public final class _cls3
        implements Runnable
    {
                    a.a.a.a(null);
                }

            
            {
                a = _pcls3;
                super();
            }
            };
            a.b.a(a1.a());
        }

            public 
            {
                a = Ey.this;
                b = ey1;
                c = ex;
                super();
            }
    }


    // Unreferenced inner class Ey$4

/* anonymous class */
    public final class _cls4
        implements Runnable
    {

        private Ey a;
        private Ex b;
        private Ey c;

        public final void run()
        {
            c.e = 3;
            c.a.a(a, b);
        }

            public 
            {
                c = Ey.this;
                a = ey1;
                b = ex;
                super();
            }
    }

}
