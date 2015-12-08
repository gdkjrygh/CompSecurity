// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.ui.DSnapView;

public final class wj
{

    public final View a;
    final ImageView b;
    final ImageView c;
    final AnimationDrawable d;
    final Jx e;
    public boolean f;
    public Animator g;
    ObjectAnimator h;
    final JG i;

    public wj(Context context, DSnapView dsnapview)
    {
        this(context, dsnapview, new Jx(context));
    }

    private wj(Context context, DSnapView dsnapview, Jx jx)
    {
        f = false;
        i = new JG() {

            final wj a;

            public final void a(Jw jw, JF jf)
            {
                a.b.post(new Runnable(this) {

                    private _cls1 a;

                    public final void run()
                    {
                        a.a.h.start();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = wj.this;
                super();
            }
        };
        e = jx;
        a = dsnapview.findViewById(0x7f0d0296);
        b = (ImageView)dsnapview.findViewById(0x7f0d0298);
        c = (ImageView)dsnapview.findViewById(0x7f0d0297);
        d = (AnimationDrawable)context.getResources().getDrawable(0x7f02010d);
        a();
    }

    public final void a()
    {
        a.setAlpha(1.0F);
        a.setVisibility(0);
        h = ObjectAnimator.ofFloat(b, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        h.setDuration(800L);
        h.setRepeatCount(-1);
        h.setRepeatMode(2);
    }

    public final void a(int j)
    {
        if (a.getVisibility() != 0 || g != null)
        {
            return;
        } else
        {
            Timber.a("DSnapLoadingViewHolder", (new StringBuilder("LOADING-STATE: Hiding with duration ")).append(j).toString(), new Object[0]);
            a(j, 1.0F, true);
            return;
        }
    }

    public final void a(long l, float f1, boolean flag)
    {
        g = ObjectAnimator.ofFloat(a, View.ALPHA, new float[] {
            f1, 0.0F
        });
        g.setDuration(l);
        g.setInterpolator(new AccelerateInterpolator(1.5F));
        g.addListener(new Jr(flag) {

            private boolean a;
            private boolean b;
            private wj c;

            public final void onAnimationCancel(Animator animator)
            {
                a = true;
            }

            public final void onAnimationEnd(Animator animator)
            {
                if (!b || !a)
                {
                    c.b();
                }
            }

            
            {
                c = wj.this;
                b = flag;
                super();
                a = false;
            }
        });
        g.start();
    }

    public final void b()
    {
        a.setVisibility(8);
        d.stop();
        h.cancel();
        b.clearAnimation();
        f = false;
        g = null;
        e.a(b);
    }
}
