// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class CheckableStickerView extends FrameLayout
    implements Checkable
{

    private boolean a;

    public CheckableStickerView(Context context)
    {
        super(context);
        a = false;
    }

    public CheckableStickerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public CheckableStickerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
    }

    public CheckableStickerView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a = false;
    }

    private void a()
    {
        View view = findViewById(0x7f1000d4);
        int i;
        if (isChecked())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public ImageView getImageView()
    {
        return (ImageView)findViewById(0x7f100077);
    }

    public boolean isChecked()
    {
        return a;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, i);
        i = android.view.View.MeasureSpec.getSize(i);
        setMeasuredDimension(i, i);
    }

    public void setChecked(boolean flag)
    {
        if (a == flag)
        {
            return;
        } else
        {
            a = flag;
            a();
            return;
        }
    }

    public void toggle()
    {
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        a();
    }
}
