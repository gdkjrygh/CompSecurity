// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads:
//            NativeAd

public class b extends RelativeLayout
{

    private final Context a;
    private final NativeAd b;
    private final DisplayMetrics c;
    private boolean d;
    private TextView e;

    public b(Context context, NativeAd nativead)
    {
        super(context);
        d = false;
        a = context;
        b = nativead;
        c = a.getResources().getDisplayMetrics();
        nativead = b.l();
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(Math.round((float)(nativead.b() + 4) * c.density), Math.round((float)(nativead.c() + 2) * c.density)));
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final b a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    if (b.a(a))
                    {
                        view = new Intent();
                        view.setAction("android.intent.action.VIEW");
                        view.addCategory("android.intent.category.BROWSABLE");
                        view.setData(Uri.parse(b.b(a).m()));
                        b.c(a).startActivity(view);
                    } else
                    {
                        b.d(a);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
        context = new ImageView(a);
        addView(context);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(Math.round((float)nativead.b() * c.density), Math.round((float)nativead.c() * c.density));
        layoutparams.addRule(9);
        layoutparams.addRule(15, -1);
        layoutparams.setMargins(Math.round(4F * c.density), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F));
        context.setLayoutParams(layoutparams);
        NativeAd.a(nativead, context);
        e = new TextView(a);
        addView(e);
        nativead = new android.widget.RelativeLayout.LayoutParams(0, -2);
        nativead.addRule(11, context.getId());
        nativead.addRule(15, -1);
        e.setLayoutParams(nativead);
        e.setSingleLine();
        e.setText("AdChoices");
        e.setTextSize(10F);
        e.setTextColor(0xffbdc1c9);
        d = false;
    }

    private void a()
    {
        Object obj = new Paint();
        ((Paint) (obj)).setTextSize(e.getTextSize());
        int j = Math.round(((Paint) (obj)).measureText("AdChoices") + 4F * c.density);
        int i = getWidth();
        j += i;
        d = true;
        obj = new Animation(i, j) {

            final int a;
            final int b;
            final b c;

            protected void applyTransformation(float f, Transformation transformation)
            {
                int k = (int)((float)a + (float)(b - a) * f);
                c.getLayoutParams().width = k;
                c.requestLayout();
                b.e(c).getLayoutParams().width = k - a;
                b.e(c).requestLayout();
            }

            public boolean willChangeBounds()
            {
                return true;
            }

            
            {
                c = b.this;
                a = i;
                b = j;
                super();
            }
        };
        ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener(j, i) {

            final int a;
            final int b;
            final b c;

            public void onAnimationEnd(Animation animation)
            {
                (new Handler()).postDelayed(new Runnable(this) {

                    final _cls3 a;

                    public void run()
                    {
                        if (!b.a(a.c))
                        {
                            return;
                        } else
                        {
                            b.a(a.c, false);
                            Animation animation = new Animation(this) {

                                final _cls1 a;

                                protected void applyTransformation(float f, Transformation transformation)
                                {
                                    int i = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                                    a.a.c.getLayoutParams().width = i;
                                    a.a.c.requestLayout();
                                    b.e(a.a.c).getLayoutParams().width = i - a.a.b;
                                    b.e(a.a.c).requestLayout();
                                }

                                public boolean willChangeBounds()
                                {
                                    return true;
                                }

            
            {
                a = _pcls1;
                super();
            }
                            };
                            animation.setDuration(300L);
                            animation.setFillAfter(true);
                            a.c.startAnimation(animation);
                            return;
                        }
                    }

            
            {
                a = _pcls3;
                super();
            }
                }, 3000L);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                c = b.this;
                a = i;
                b = j;
                super();
            }
        });
        ((Animation) (obj)).setDuration(300L);
        ((Animation) (obj)).setFillAfter(true);
        startAnimation(((Animation) (obj)));
    }

    static boolean a(b b1)
    {
        return b1.d;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.d = flag;
        return flag;
    }

    static NativeAd b(b b1)
    {
        return b1.b;
    }

    static Context c(b b1)
    {
        return b1.a;
    }

    static void d(b b1)
    {
        b1.a();
    }

    static TextView e(b b1)
    {
        return b1.e;
    }
}
