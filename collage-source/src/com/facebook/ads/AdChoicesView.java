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

public class AdChoicesView extends RelativeLayout
{

    private final Context a;
    private final NativeAd b;
    private final DisplayMetrics c;
    private boolean d;
    private TextView e;

    public AdChoicesView(Context context, NativeAd nativead)
    {
        this(context, nativead, false);
    }

    public AdChoicesView(Context context, NativeAd nativead, boolean flag)
    {
        super(context);
        d = false;
        a = context;
        b = nativead;
        c = a.getResources().getDisplayMetrics();
        context = b.getAdChoicesIcon();
        nativead = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final AdChoicesView a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    if (AdChoicesView.a(a))
                    {
                        view = new Intent();
                        view.setAction("android.intent.action.VIEW");
                        view.addCategory("android.intent.category.BROWSABLE");
                        view.setData(Uri.parse(AdChoicesView.b(a).getAdChoicesLinkUrl()));
                        AdChoicesView.c(a).startActivity(view);
                    } else
                    {
                        AdChoicesView.d(a);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = AdChoicesView.this;
                super();
            }
        });
        e = new TextView(a);
        addView(e);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (flag)
        {
            layoutparams.addRule(11, a(context).getId());
            layoutparams.width = 0;
            nativead.width = Math.round((float)(context.getWidth() + 4) * c.density);
            nativead.height = Math.round((float)(context.getHeight() + 2) * c.density);
            d = false;
        } else
        {
            d = true;
        }
        setLayoutParams(nativead);
        layoutparams.addRule(15, -1);
        e.setLayoutParams(layoutparams);
        e.setSingleLine();
        e.setText("AdChoices");
        e.setTextSize(10F);
        e.setTextColor(0xffbdc1c9);
    }

    private ImageView a(NativeAd.Image image)
    {
        ImageView imageview = new ImageView(a);
        addView(imageview);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(Math.round((float)image.getWidth() * c.density), Math.round((float)image.getHeight() * c.density));
        layoutparams.addRule(9);
        layoutparams.addRule(15, -1);
        layoutparams.setMargins(Math.round(4F * c.density), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F));
        imageview.setLayoutParams(layoutparams);
        NativeAd.downloadAndDisplayImage(image, imageview);
        return imageview;
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
            final AdChoicesView c;

            protected void applyTransformation(float f, Transformation transformation)
            {
                int k = (int)((float)a + (float)(b - a) * f);
                c.getLayoutParams().width = k;
                c.requestLayout();
                AdChoicesView.e(c).getLayoutParams().width = k - a;
                AdChoicesView.e(c).requestLayout();
            }

            public boolean willChangeBounds()
            {
                return true;
            }

            
            {
                c = AdChoicesView.this;
                a = i;
                b = j;
                super();
            }
        };
        ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener(j, i) {

            final int a;
            final int b;
            final AdChoicesView c;

            public void onAnimationEnd(Animation animation)
            {
                (new Handler()).postDelayed(new Runnable(this) {

                    final _cls3 a;

                    public void run()
                    {
                        if (!AdChoicesView.a(a.c))
                        {
                            return;
                        } else
                        {
                            AdChoicesView.a(a.c, false);
                            Animation animation = new Animation(this) {

                                final _cls1 a;

                                protected void applyTransformation(float f, Transformation transformation)
                                {
                                    int i = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                                    a.a.c.getLayoutParams().width = i;
                                    a.a.c.requestLayout();
                                    AdChoicesView.e(a.a.c).getLayoutParams().width = i - a.a.b;
                                    AdChoicesView.e(a.a.c).requestLayout();
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
                c = AdChoicesView.this;
                a = i;
                b = j;
                super();
            }
        });
        ((Animation) (obj)).setDuration(300L);
        ((Animation) (obj)).setFillAfter(true);
        startAnimation(((Animation) (obj)));
    }

    static boolean a(AdChoicesView adchoicesview)
    {
        return adchoicesview.d;
    }

    static boolean a(AdChoicesView adchoicesview, boolean flag)
    {
        adchoicesview.d = flag;
        return flag;
    }

    static NativeAd b(AdChoicesView adchoicesview)
    {
        return adchoicesview.b;
    }

    static Context c(AdChoicesView adchoicesview)
    {
        return adchoicesview.a;
    }

    static void d(AdChoicesView adchoicesview)
    {
        adchoicesview.a();
    }

    static TextView e(AdChoicesView adchoicesview)
    {
        return adchoicesview.e;
    }
}
