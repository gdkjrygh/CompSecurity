// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

public class StoryReplyFitWidthTextureVideoView extends TextureVideoView
{

    private final int h;
    private final int i;
    private View j;
    private ViewGroup k;

    public StoryReplyFitWidthTextureVideoView(Context context)
    {
        super(context);
        h = (int)getResources().getDimension(0x7f0a0065);
        i = (int)getResources().getDimension(0x7f0a0136);
    }

    public StoryReplyFitWidthTextureVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StoryReplyFitWidthTextureVideoView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        h = (int)getResources().getDimension(0x7f0a0065);
        i = (int)getResources().getDimension(0x7f0a0136);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        k = (ViewGroup)getParent();
        if (k == null)
        {
            return;
        } else
        {
            j = k.findViewById(0x7f0d017f);
            return;
        }
    }

    protected void onMeasure(int l, int i1)
    {
        float f1 = 1.0F;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Matrix matrix;
        if (j == null)
        {
            i1 = 0;
        } else
        {
            i1 = j.getHeight();
        }
        f2 = getDefaultSize(a, l);
        f3 = (i1 + i) - h;
        f4 = f2 / 2.0F;
        f5 = f3 / 2.0F;
        if ((float)a > f2 && (float)b > f3)
        {
            f1 = (float)a / f2;
            f = (float)b / f3;
        } else
        if ((float)a < f2 && (float)b < f3)
        {
            f = f2 / (float)a;
            f1 = f3 / (float)b;
        } else
        if (f2 > (float)a)
        {
            f = f2 / (float)a / (f3 / (float)b);
        } else
        if (f3 > (float)b)
        {
            f1 = f3 / (float)b / (f2 / (float)a);
            f = 1.0F;
        } else
        {
            f = 1.0F;
        }
        matrix = new Matrix();
        matrix.setScale(f1, f, f4, f5);
        setTransform(matrix);
        setMeasuredDimension(Math.max(1, (int)f2), Math.max(1, (int)f3));
    }
}
