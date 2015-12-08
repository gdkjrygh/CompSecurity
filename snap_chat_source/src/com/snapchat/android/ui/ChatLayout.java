// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.snapchat.android.util.SnapchatViewPager;

public class ChatLayout extends RelativeLayout
{

    public boolean a;
    private Context b;
    private SnapchatViewPager c;

    public ChatLayout(Context context)
    {
        super(context);
        b = context;
    }

    public ChatLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = context;
    }

    public ChatLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = context;
    }

    static SnapchatViewPager a(ChatLayout chatlayout)
    {
        return chatlayout.c;
    }

    static boolean a(ChatLayout chatlayout, boolean flag)
    {
        chatlayout.a = flag;
        return flag;
    }

    public final void a(boolean flag, boolean flag1)
    {
        float f = 0.0F;
        boolean flag2 = a;
        float f1 = (float)getWidth() * 0.66F;
        if (flag1)
        {
            c.setPagingEnabled(false);
            float f2 = getTranslationX();
            if (flag)
            {
                f = f1;
            }
            f1 = Math.abs(f2 - f) / f1;
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "translationX", new float[] {
                f2, f
            });
            objectanimator.addListener(new android.animation.Animator.AnimatorListener(flag, flag2) {

                private boolean a;
                private boolean b;
                private ChatLayout c;

                public final void onAnimationCancel(Animator animator)
                {
                    animator = ChatLayout.a(c);
                    boolean flag3;
                    if (!b)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    animator.setPagingEnabled(flag3);
                    ChatLayout.a(c, b);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    animator = ChatLayout.a(c);
                    boolean flag3;
                    if (!a)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    animator.setPagingEnabled(flag3);
                    ChatLayout.a(c, a);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                c = ChatLayout.this;
                a = flag;
                b = flag1;
                super();
            }
            });
            objectanimator.setDuration((int)(f1 * 250F));
            objectanimator.start();
            return;
        }
        SnapchatViewPager snapchatviewpager;
        if (flag)
        {
            setTranslationX(f1);
        } else
        {
            setTranslationX(0.0F);
        }
        snapchatviewpager = c;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        snapchatviewpager.setPagingEnabled(flag1);
        a = flag;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        c = (SnapchatViewPager)((Activity)b).findViewById(0x7f0d02fe);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a;
    }
}
