// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

public class ChatMediaFullScreenTextureVideoView extends TextureVideoView
{

    private ViewGroup h;
    private View i;
    private boolean j;

    public ChatMediaFullScreenTextureVideoView(Context context)
    {
        super(context);
    }

    public ChatMediaFullScreenTextureVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ChatMediaFullScreenTextureVideoView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        h = (ViewGroup)getParent();
        if (h != null)
        {
            i = h.findViewById(0x7f0d0153);
        }
    }

    protected void onMeasure(int k, int l)
    {
        if (!j)
        {
            super.onMeasure(k, l);
            return;
        }
        float f = getDefaultSize(h.getWidth(), k);
        float f1 = getDefaultSize(h.getHeight(), l);
        float f2 = f / 2.0F;
        float f3 = f1 / 2.0F;
        float f4 = f / (float)a / (f1 / (float)b);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0F, f4, f2, f3);
        setTransform(matrix);
        if (i != null)
        {
            i.setScaleX(f4);
            i.setScaleY(f4);
        }
        setMeasuredDimension(Math.max(1, (int)f), Math.max(1, (int)f1));
    }

    public void setShouldScale(boolean flag)
    {
        j = flag;
    }
}
