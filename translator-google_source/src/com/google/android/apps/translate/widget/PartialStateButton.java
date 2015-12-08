// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.apps.translate.widget:
//            al

public class PartialStateButton extends FrameLayout
{

    private static final int a[] = {
        0x10100a2
    };
    private final android.view.View.OnClickListener b = new al(this);
    private boolean c;
    private String d;
    private android.view.View.OnClickListener e;

    public PartialStateButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        super.setOnClickListener(b);
    }

    static boolean a(PartialStateButton partialstatebutton)
    {
        return partialstatebutton.c;
    }

    static String b(PartialStateButton partialstatebutton)
    {
        return partialstatebutton.d;
    }

    static android.view.View.OnClickListener c(PartialStateButton partialstatebutton)
    {
        return partialstatebutton.e;
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (!c)
        {
            mergeDrawableStates(ai, a);
        }
        return ai;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName("android.widget.Button");
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        e = onclicklistener;
    }

    public void setPartiallyDisabled(boolean flag, String s)
    {
        d = s;
        if (c != flag)
        {
            c = flag;
            refreshDrawableState();
        }
    }

}
