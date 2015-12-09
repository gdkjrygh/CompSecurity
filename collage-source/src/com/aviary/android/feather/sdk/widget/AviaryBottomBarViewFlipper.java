// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
import it.sephiroth.android.library.widget.HListView;

public class AviaryBottomBarViewFlipper extends ViewFlipper
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a(int i);
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();
    }


    private View a;
    private b b;
    private a c;

    public AviaryBottomBarViewFlipper(Context context)
    {
        super(context);
    }

    public AviaryBottomBarViewFlipper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static b a(AviaryBottomBarViewFlipper aviarybottombarviewflipper)
    {
        return aviarybottombarviewflipper.b;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            findViewById(com.aviary.android.feather.sdk.R.id.aviary_white_logo).setVisibility(0);
            return;
        } else
        {
            findViewById(com.aviary.android.feather.sdk.R.id.aviary_white_logo).setVisibility(4);
            return;
        }
    }

    public boolean a()
    {
label0:
        {
            Animation animation;
label1:
            {
                if (getDisplayedChild() == 1)
                {
                    animation = getInAnimation();
                    if (animation == null)
                    {
                        break label0;
                    }
                    if (!animation.hasStarted() || animation.hasEnded())
                    {
                        break label1;
                    }
                }
                return false;
            }
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final AviaryBottomBarViewFlipper a;

                public void onAnimationEnd(Animation animation1)
                {
                    if (AviaryBottomBarViewFlipper.a(a) != null)
                    {
                        AviaryBottomBarViewFlipper.a(a).b();
                    }
                    a.getChildAt(1).setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    a.getChildAt(0).setVisibility(0);
                    if (AviaryBottomBarViewFlipper.a(a) != null)
                    {
                        AviaryBottomBarViewFlipper.a(a).a();
                    }
                }

            
            {
                a = AviaryBottomBarViewFlipper.this;
                super();
            }
            });
        }
        setDisplayedChild(0);
        return true;
    }

    public boolean b()
    {
label0:
        {
            Animation animation;
label1:
            {
                if (getDisplayedChild() == 0)
                {
                    animation = getInAnimation();
                    if (animation == null)
                    {
                        break label0;
                    }
                    if (!animation.hasStarted() || animation.hasEnded())
                    {
                        break label1;
                    }
                }
                return false;
            }
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final AviaryBottomBarViewFlipper a;

                public void onAnimationEnd(Animation animation1)
                {
                    if (AviaryBottomBarViewFlipper.a(a) != null)
                    {
                        AviaryBottomBarViewFlipper.a(a).d();
                    }
                    a.getChildAt(0).setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    a.getChildAt(1).setVisibility(0);
                    if (AviaryBottomBarViewFlipper.a(a) != null)
                    {
                        AviaryBottomBarViewFlipper.a(a).c();
                    }
                }

            
            {
                a = AviaryBottomBarViewFlipper.this;
                super();
            }
            });
        }
        setDisplayedChild(1);
        return true;
    }

    public ViewGroup getContentPanel()
    {
        return (ViewGroup)getChildAt(0);
    }

    public HListView getToolsListView()
    {
        return (HListView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_tools_listview);
    }

    public void onClick(View view)
    {
        if (view != null)
        {
            int i = view.getId();
            if (c != null)
            {
                c.a(i);
            }
        }
    }

    protected void onFinishInflate()
    {
        a = findViewById(com.aviary.android.feather.sdk.R.id.aviary_white_logo);
        a.setOnClickListener(this);
        super.onFinishInflate();
    }

    public void setOnBottomBarItemClickListener(a a1)
    {
        c = a1;
    }

    public void setOnViewChangingStatusListener(b b1)
    {
        b = b1;
    }
}
