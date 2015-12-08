// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.skype.android.util.accessibility.AccessibilityUtil;

public class FocusableEditText extends EditText
{

    private AccessibilityUtil accessibility;

    public FocusableEditText(Context context)
    {
        super(context);
    }

    public FocusableEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FocusableEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private Drawable applyStateList(Drawable drawable)
    {
        return getAccessibilityUtil().a(drawable, getResources().getDrawable(0x7f020175), getViewTreeObserver());
    }

    public AccessibilityUtil getAccessibilityUtil()
    {
        if (!isInEditMode() && accessibility == null)
        {
            accessibility = new AccessibilityUtil(getContext());
        }
        return accessibility;
    }

    public void setBackground(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        AccessibilityUtil accessibilityutil = getAccessibilityUtil();
        Drawable drawable1 = drawable;
        if (accessibilityutil != null)
        {
            drawable1 = drawable;
            if (accessibilityutil.a())
            {
                drawable1 = accessibilityutil.a(drawable, getResources().getDrawable(0x7f020175), getViewTreeObserver());
            }
        }
        super.setBackgroundDrawable(drawable1);
    }
}
