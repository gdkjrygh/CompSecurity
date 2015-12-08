// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            CircularProgressDrawable

public class CircularProgressBar extends View
{

    private CircularProgressDrawable mDrawable;

    public CircularProgressBar(Context context)
    {
        this(context, null);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDrawable = new CircularProgressDrawable(12F, getResources().getColor(0x7f0e000d));
        mDrawable.setCallback(this);
        if (getVisibility() == 0)
        {
            mDrawable.start();
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        mDrawable.draw(canvas);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        mDrawable.setBounds(0, 0, i, j);
    }

    protected void onVisibilityChanged(View view, int i)
    {
label0:
        {
            super.onVisibilityChanged(view, i);
            if (mDrawable != null)
            {
                if (i != 0)
                {
                    break label0;
                }
                mDrawable.start();
            }
            return;
        }
        mDrawable.stop();
    }

    public void setIndeterminate(boolean flag)
    {
        if (flag)
        {
            mDrawable.start();
            return;
        } else
        {
            mDrawable.stop();
            return;
        }
    }

    public void setProgress(int i)
    {
        mDrawable.setProgress(i);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == mDrawable || super.verifyDrawable(drawable);
    }
}
