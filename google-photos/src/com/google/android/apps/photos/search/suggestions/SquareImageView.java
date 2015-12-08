// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.search.suggestions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class SquareImageView extends ImageView
{

    public SquareImageView(Context context)
    {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SquareImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public SquareImageView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, i);
    }
}
