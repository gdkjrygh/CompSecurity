// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.actionabletoast;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class ToastRootView extends FrameLayout
{

    public final Rect a;

    public ToastRootView(Context context)
    {
        this(context, null);
    }

    public ToastRootView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ToastRootView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
    }

    private void a(Rect rect)
    {
        ((android.view.WindowManager.LayoutParams)getLayoutParams()).gravity;
        JVM INSTR lookupswitch 2: default 36
    //                   48: 108
    //                   80: 85;
           goto _L1 _L2 _L3
_L1:
        Log.w("ToastRootView", "Ignoring system window insets with unsupported gravity.");
_L5:
        getChildAt(0).setPadding(a.left, a.top, a.right, a.bottom);
        requestLayout();
        return;
_L3:
        a.set(rect.left, 0, rect.right, rect.bottom);
        continue; /* Loop/switch isn't completed */
_L2:
        a.set(rect.left, rect.top, rect.right, 0);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            return super.fitSystemWindows(rect);
        } else
        {
            a(rect);
            return true;
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowinsets)
    {
        a(new Rect(windowinsets.getSystemWindowInsetLeft(), windowinsets.getSystemWindowInsetTop(), windowinsets.getSystemWindowInsetRight(), windowinsets.getSystemWindowInsetBottom()));
        return windowinsets.consumeSystemWindowInsets();
    }
}
