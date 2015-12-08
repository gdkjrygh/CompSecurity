// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

public class ChatMediaFixedHeightTextureVideoView extends TextureVideoView
{

    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public ChatMediaFixedHeightTextureVideoView(Context context)
    {
        super(context);
        h = (int)getResources().getDimension(0x7f0a0008);
        i = (int)getResources().getDimension(0x7f0a005c);
        j = (int)getResources().getDimension(0x7f0a0065);
        k = (int)getResources().getDimension(0x7f0a0040);
    }

    public ChatMediaFixedHeightTextureVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ChatMediaFixedHeightTextureVideoView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        h = (int)getResources().getDimension(0x7f0a0008);
        i = (int)getResources().getDimension(0x7f0a005c);
        j = (int)getResources().getDimension(0x7f0a0065);
        k = (int)getResources().getDimension(0x7f0a0040);
    }

    protected final Matrix a(int l)
    {
        if (e != 0 && this.f != 0 && (c != 0 || d != 0))
        {
            float f = (float)l / (float)e;
            Matrix matrix = new Matrix();
            matrix.setTranslate((float)c * f, f * (float)d);
            return matrix;
        } else
        {
            return null;
        }
    }

    protected void onMeasure(int l, int i1)
    {
        i1 = getDefaultSize(a, l);
        l = (int)((double)getResources().getDisplayMetrics().heightPixels / 2D);
        int j1 = h;
        int k1 = i;
        int l1 = j;
        j1 = Math.max(k, l - j1 - k1 - l1);
        l = i1;
        if (a > 0)
        {
            l = i1;
            if (b > 0)
            {
                i1 = (int)(((float)j1 * (float)a) / (float)b);
                Math.max(1, j1);
                Matrix matrix = a(i1);
                l = i1;
                if (matrix != null)
                {
                    setTransform(matrix);
                    l = i1;
                }
            }
        }
        setMeasuredDimension(Math.max(1, l), Math.max(1, j1));
    }
}
