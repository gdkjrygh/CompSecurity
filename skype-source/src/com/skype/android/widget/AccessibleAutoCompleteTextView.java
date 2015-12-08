// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import com.skype.android.util.accessibility.AccessibilityEditTextDecorator;
import com.skype.android.util.accessibility.AccessibilityUtil;

public class AccessibleAutoCompleteTextView extends AutoCompleteTextView
{

    private AccessibilityEditTextDecorator a;
    private boolean b;
    private AccessibilityUtil c;

    public AccessibleAutoCompleteTextView(Context context)
    {
        super(context);
        a();
    }

    public AccessibleAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public AccessibleAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = new AccessibilityEditTextDecorator(this);
    }

    private AccessibilityUtil b()
    {
        if (c == null && !isInEditMode())
        {
            c = new AccessibilityUtil(getContext());
        }
        return c;
    }

    public CharSequence getContentDescription()
    {
        return a.a(super.getContentDescription(), b);
    }

    public void onFilterComplete(int i)
    {
        super.onFilterComplete(i);
        if (i > 0)
        {
            b().a(this, getContext().getString(0x7f080093, new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!TextUtils.isEmpty(getContentDescription()))
        {
            accessibilitynodeinfo.setText(getContentDescription());
        }
    }

    public void setBackground(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        Drawable drawable1 = drawable;
        if (!isInEditMode())
        {
            drawable1 = b().a(drawable, getResources().getDrawable(0x7f020175), getViewTreeObserver());
        }
        super.setBackgroundDrawable(drawable1);
    }

    public void setIncludeTextInContentDescription(boolean flag)
    {
        b = flag;
    }
}
