// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.bind.data.Bound;
import com.google.android.libraries.bind.data.BoundHelper;
import com.google.android.libraries.bind.data.Data;

public class BoundFrameLayout extends FrameLayout
    implements Bound
{

    private final BoundHelper boundHelper;

    public BoundFrameLayout(Context context)
    {
        this(context, null);
    }

    public BoundFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoundFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        boundHelper = new BoundHelper(context, attributeset, this);
    }

    public final void updateBoundData(Data data)
    {
        boundHelper.updateBoundData(data);
    }
}
