// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SendToBottomPanelView extends RelativeLayout
{
    public static interface a
    {

        public abstract void a(Integer integer);
    }


    public ImageView a;
    public HorizontalScrollView b;
    public TextView c;
    public TextView d;
    public Animator e;
    private LinearLayout f;
    private boolean g;
    private boolean h;

    public SendToBottomPanelView(Context context)
    {
        this(context, null);
    }

    public SendToBottomPanelView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SendToBottomPanelView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        g = false;
        h = false;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0400c8, this, true);
        a = (ImageView)findViewById(0x7f0d042d);
        b = (HorizontalScrollView)findViewById(0x7f0d042e);
        f = (LinearLayout)findViewById(0x7f0d042f);
        c = (TextView)findViewById(0x7f0d0430);
        d = (TextView)findViewById(0x7f0d0431);
    }

    static TextView a(SendToBottomPanelView sendtobottompanelview)
    {
        return sendtobottompanelview.c;
    }

    static TextView b(SendToBottomPanelView sendtobottompanelview)
    {
        return sendtobottompanelview.d;
    }

    public final void a()
    {
        if (getVisibility() != 8)
        {
            g = true;
            setVisibility(8);
            return;
        } else
        {
            g = false;
            return;
        }
    }

    public final void a(boolean flag)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(getLayoutParams());
        layoutparams.bottomMargin = (int)Jo.a(0.0F, getContext());
        layoutparams.addRule(12);
        if (flag)
        {
            setVisibility(0);
        } else
        {
            setVisibility(8);
        }
        setLayoutParams(layoutparams);
        h = true;
    }

    public final void b()
    {
        if (!h)
        {
            a(false);
        }
        if (!g)
        {
            setVisibility(0);
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
        b.setOnClickListener(onclicklistener);
        f.setOnClickListener(onclicklistener);
        c.setOnClickListener(onclicklistener);
        d.setOnClickListener(onclicklistener);
    }

    public void setOnTouchListenerForSearch(a a1)
    {
        c.setOnTouchListener(new android.view.View.OnTouchListener(a1) {

            private a a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                view = (TextView)view;
                CharSequence charsequence = view.getText();
                if (motionevent.getActionMasked() != 1)
                {
                    return true;
                }
                int i = view.getOffsetForPosition(motionevent.getX(), motionevent.getY());
                if (i < 0 || i >= charsequence.length())
                {
                    return false;
                } else
                {
                    a.a(Integer.valueOf(i));
                    return false;
                }
            }

            
            {
                a = a1;
                super();
            }
        });
    }

    public void setSendButtonOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public void setSendButtonOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        a.setOnTouchListener(ontouchlistener);
    }

    public void setText(String s)
    {
        c.setText(s);
    }

    // Unreferenced inner class com/snapchat/android/ui/SendToBottomPanelView$1

/* anonymous class */
    public final class _cls1
        implements android.animation.Animator.AnimatorListener
    {

        private SendToBottomPanelView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            SendToBottomPanelView.a(a).setTranslationY(0.0F);
            SendToBottomPanelView.b(a).setAlpha(1.0F);
            SendToBottomPanelView.b(a).setVisibility(0);
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = SendToBottomPanelView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/SendToBottomPanelView$2

/* anonymous class */
    public final class _cls2
        implements android.animation.Animator.AnimatorListener
    {

        private SendToBottomPanelView a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            SendToBottomPanelView.a(a).setTranslationY(0.0F);
            SendToBottomPanelView.b(a).setVisibility(8);
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = SendToBottomPanelView.this;
                super();
            }
    }

}
