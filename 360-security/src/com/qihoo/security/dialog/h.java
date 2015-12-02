// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.dialog:
//            e

public class h extends Dialog
    implements e
{

    public d a;
    private LocaleTextView b;
    private LocaleTextView c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i[];
    private e j;
    private Context k;
    private View l;

    public h(Context context)
    {
        super(context, 0x7f0d00f5);
        a = com.qihoo.security.locale.d.a();
        j = null;
        k = context;
        a(context);
    }

    static ImageView[] a(h h1)
    {
        return h1.i;
    }

    public void a()
    {
        if (i == null || i.length != 5)
        {
            return;
        } else
        {
            a(i[0], new android.view.animation.Animation.AnimationListener() {

                final h a;

                public void onAnimationEnd(Animation animation)
                {
                    a.a(com.qihoo.security.dialog.h.a(a)[1], new android.view.animation.Animation.AnimationListener(this) {

                        final _cls1 a;

                        public void onAnimationEnd(Animation animation)
                        {
                            a.a.a(com.qihoo.security.dialog.h.a(a.a)[2], new android.view.animation.Animation.AnimationListener(this) {

                                final _cls1 a;

                                public void onAnimationEnd(Animation animation)
                                {
                                    a.a.a.a(com.qihoo.security.dialog.h.a(a.a.a)[3], new android.view.animation.Animation.AnimationListener(this) {

                                        final _cls1 a;

                                        public void onAnimationEnd(Animation animation)
                                        {
                                            a.a.a.a.a(com.qihoo.security.dialog.h.a(a.a.a.a)[4], new android.view.animation.Animation.AnimationListener(this) {

                                                final _cls1 a;

                                                public void onAnimationEnd(Animation animation)
                                                {
                                                }

                                                public void onAnimationRepeat(Animation animation)
                                                {
                                                }

                                                public void onAnimationStart(Animation animation)
                                                {
                                                    com.qihoo.security.dialog.h.a(a.a.a.a.a)[4].setVisibility(0);
                                                }

            
            {
                a = _pcls1;
                super();
            }
                                            });
                                        }

                                        public void onAnimationRepeat(Animation animation)
                                        {
                                        }

                                        public void onAnimationStart(Animation animation)
                                        {
                                            com.qihoo.security.dialog.h.a(a.a.a.a)[3].setVisibility(0);
                                        }

            
            {
                a = _pcls1;
                super();
            }
                                    });
                                }

                                public void onAnimationRepeat(Animation animation)
                                {
                                }

                                public void onAnimationStart(Animation animation)
                                {
                                    com.qihoo.security.dialog.h.a(a.a.a)[2].setVisibility(0);
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                        }

                        public void onAnimationRepeat(Animation animation)
                        {
                        }

                        public void onAnimationStart(Animation animation)
                        {
                            com.qihoo.security.dialog.h.a(a.a)[1].setVisibility(0);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    com.qihoo.security.dialog.h.a(a)[0].setVisibility(0);
                }

            
            {
                a = h.this;
                super();
            }
            });
            return;
        }
    }

    public void a(Context context)
    {
        l = LayoutInflater.from(context).inflate(0x7f03006b, null, false);
        j = (e)l.findViewById(0x7f0b0100);
        b = (LocaleTextView)l.findViewById(0x7f0b015c);
        c = (LocaleTextView)l.findViewById(0x7f0b015d);
        d = (ImageView)l.findViewById(0x7f0b015e);
        e = (ImageView)l.findViewById(0x7f0b015f);
        f = (ImageView)l.findViewById(0x7f0b0160);
        g = (ImageView)l.findViewById(0x7f0b0161);
        h = (ImageView)l.findViewById(0x7f0b0162);
        i = (new ImageView[] {
            d, e, f, g, h
        });
        setContentView(l);
    }

    public void a(ImageView imageview, android.view.animation.Animation.AnimationListener animationlistener)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setDuration(200L);
        scaleanimation.setFillAfter(true);
        scaleanimation.setInterpolator(new DecelerateInterpolator());
        scaleanimation.setAnimationListener(animationlistener);
        imageview.setAnimation(scaleanimation);
        scaleanimation.start();
    }

    public void a(String s)
    {
        if (b != null)
        {
            b.setLocalText(s);
        }
    }

    public void b(String s)
    {
        if (c != null)
        {
            c.setLocalText(s);
        }
    }

    public LocaleButton[] getShownButtons()
    {
        return j.getShownButtons();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)l.getLayoutParams();
        layoutparams.width = com.qihoo360.mobilesafe.b.a.a(k) - com.qihoo360.mobilesafe.b.a.a(k, 60F);
        l.setLayoutParams(layoutparams);
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        j.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        j.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        j.setButtonText(acharsequence);
    }
}
