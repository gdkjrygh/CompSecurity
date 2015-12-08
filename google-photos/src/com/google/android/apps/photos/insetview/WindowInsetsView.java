// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.insetview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import fpj;
import olm;

public class WindowInsetsView extends FrameLayout
{

    public WindowInsetsView(Context context)
    {
        this(context, null);
    }

    public WindowInsetsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WindowInsetsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        fpj fpj1 = (fpj)olm.b(getContext(), fpj);
        if (fpj1 != null)
        {
            fpj1.b(rect);
        }
        return fpj1 != null;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowinsets)
    {
        fpj fpj1 = (fpj)olm.b(getContext(), fpj);
        WindowInsets windowinsets1 = windowinsets;
        if (fpj1 != null)
        {
            fpj1.a(windowinsets);
            windowinsets1 = windowinsets.consumeSystemWindowInsets();
        }
        return windowinsets1;
    }
}
