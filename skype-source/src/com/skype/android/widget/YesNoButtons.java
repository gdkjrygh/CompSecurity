// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;

public class YesNoButtons extends LinearLayout
    implements android.view.View.OnClickListener
{
    public static interface Callback
    {

        public abstract void onNoClick();

        public abstract void onYesClick();
    }


    Button a;
    Button b;
    Callback c;

    public YesNoButtons(Context context)
    {
        this(context, null);
    }

    public YesNoButtons(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f0300a4, this, true);
        a = (Button)ViewUtil.a(this, 0x7f1003fa);
        b = (Button)ViewUtil.a(this, 0x7f1003f9);
        ViewUtil.a(this, new View[] {
            a, b
        });
        Object obj = context.getTheme().obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.YesNoButtons, 0, 0);
        context = ((TypedArray) (obj)).getString(0);
        attributeset = ((TypedArray) (obj)).getString(1);
        android.graphics.drawable.Drawable drawable = ((TypedArray) (obj)).getDrawable(2);
        obj = ((TypedArray) (obj)).getDrawable(2);
        if (context != null)
        {
            a.setText(context);
        }
        if (attributeset != null)
        {
            b.setText(attributeset);
        }
        if (drawable != null && obj != null)
        {
            ViewUtil.a(a, drawable);
            ViewUtil.a(b, ((android.graphics.drawable.Drawable) (obj)));
        }
        context = new AccessibilityUtil(getContext());
        if (context.a())
        {
            post(new Runnable() {

                final YesNoButtons a;

                public final void run()
                {
                    android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                    layoutparams.width = -1;
                    a.setLayoutParams(layoutparams);
                    a.invalidate();
                }

            
            {
                a = YesNoButtons.this;
                super();
            }
            });
            post(context.a(this, a, 8));
            post(context.a(this, b, 4));
        }
    }

    public void onClick(View view)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        view.getId();
        JVM INSTR tableswitch 2131756025 2131756026: default 32
    //                   2131756025 43
    //                   2131756026 33;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        c.onYesClick();
        return;
_L3:
        c.onNoClick();
        return;
    }

    public void setCallback(Callback callback)
    {
        c = callback;
    }
}
