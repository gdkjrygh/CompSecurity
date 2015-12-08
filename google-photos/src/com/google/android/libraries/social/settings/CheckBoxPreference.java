// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import b;
import cn;
import nzw;
import oaw;
import oba;

public class CheckBoxPreference extends oba
{

    public CheckBoxPreference(Context context)
    {
        this(context, null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.HJ);
    }

    private CheckBoxPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, oaw.d, i, 0);
        c(context.getString(oaw.g));
        d(context.getString(oaw.f));
        super.c = context.getBoolean(oaw.e, false);
        context.recycle();
    }

    protected final void a(View view)
    {
        super.a(view);
        View view1 = view.findViewById(cn.K);
        if (view1 instanceof Checkable)
        {
            ((Checkable)view1).setChecked(a);
            AccessibilityManager accessibilitymanager = (AccessibilityManager)super.g.getSystemService("accessibility");
            if (super.b && accessibilitymanager.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(1);
                view1.onInitializeAccessibilityEvent(accessibilityevent);
                view1.dispatchPopulateAccessibilityEvent(accessibilityevent);
                accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
            }
            super.b = false;
        }
        b(view);
    }
}
