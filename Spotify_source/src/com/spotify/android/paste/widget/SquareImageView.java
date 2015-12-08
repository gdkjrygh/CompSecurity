// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import ctz;

public class SquareImageView extends ImageView
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

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        boolean flag;
        if (k == 0 || l == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "SquareImageView requires one of its dimensions to be 0, to use the other one as size");
        if (k == 0)
        {
            i = j;
        } else
        {
            j = i;
        }
        super.onMeasure(i, j);
    }
}
