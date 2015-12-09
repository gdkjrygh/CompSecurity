// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class LoadingView extends FrameLayout
{

    public LoadingView(Context context)
    {
        this(context, null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflate(context, 0x7f040027, this);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
    }
}
