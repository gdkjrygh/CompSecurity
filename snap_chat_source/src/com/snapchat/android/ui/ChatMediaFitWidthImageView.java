// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class ChatMediaFitWidthImageView extends ImageView
{

    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public ChatMediaFitWidthImageView(Context context)
    {
        super(context);
        a = (int)getResources().getDimension(0x7f0a0008);
        b = (int)getResources().getDimension(0x7f0a005c);
        c = (int)getResources().getDimension(0x7f0a0065);
        d = (int)getResources().getDimension(0x7f0a0040);
    }

    public ChatMediaFitWidthImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = (int)getResources().getDimension(0x7f0a0008);
        b = (int)getResources().getDimension(0x7f0a005c);
        c = (int)getResources().getDimension(0x7f0a0065);
        d = (int)getResources().getDimension(0x7f0a0040);
    }

    public ChatMediaFitWidthImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = (int)getResources().getDimension(0x7f0a0008);
        b = (int)getResources().getDimension(0x7f0a005c);
        c = (int)getResources().getDimension(0x7f0a0065);
        d = (int)getResources().getDimension(0x7f0a0040);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = (int)((double)getResources().getDisplayMetrics().heightPixels / 2D);
        j = a;
        int k = b;
        int l = c;
        i = Math.max(d, i - j - k - l);
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            j = drawable.getIntrinsicHeight();
            if (j > 0)
            {
                float f = i;
                setMeasuredDimension((int)(((float)drawable.getIntrinsicWidth() * f) / (float)j), i);
            }
        }
    }
}
