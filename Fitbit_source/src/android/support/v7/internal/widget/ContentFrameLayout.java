// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{

    public ContentFrameLayout(Context context)
    {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void dispatchFitSystemWindows(Rect rect)
    {
        fitSystemWindows(rect);
    }
}
