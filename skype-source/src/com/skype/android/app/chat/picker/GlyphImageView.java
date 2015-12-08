// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.widget.ImageView;

public class GlyphImageView extends ImageView
{

    private boolean invertedState;

    public GlyphImageView(Context context)
    {
        super(context);
        invertedState = false;
    }

    public GlyphImageView(Context context, Bitmap bitmap)
    {
        super(context);
        invertedState = false;
        init(bitmap);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        int i = getResources().getDimensionPixelSize(0x7f0c00d5);
        setPadding(i, i, i, i);
    }

    public GlyphImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        invertedState = false;
    }

    public GlyphImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        invertedState = false;
    }

    private StateListDrawable createStateDrawable(Bitmap bitmap)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        Resources resources = getContext().getResources();
        int ai1[] = new int[1];
        ai1[0] = 0x10100a7;
        int ai[] = StateSet.WILD_CARD;
        if (invertedState)
        {
            ai1 = StateSet.WILD_CARD;
            ai = new int[1];
            ai[0] = 0x10100a7;
        }
        int i = bitmap.getWidth();
        statelistdrawable.addState(ai1, new BitmapDrawable(resources, Bitmap.createBitmap(bitmap, 0, i, i, i)));
        BitmapDrawable bitmapdrawable = new BitmapDrawable(resources, Bitmap.createBitmap(bitmap, 0, i * 2, i, i));
        statelistdrawable.addState(new int[] {
            0x10100a1
        }, bitmapdrawable);
        statelistdrawable.addState(ai, new BitmapDrawable(resources, Bitmap.createBitmap(bitmap, 0, 0, i, i)));
        return statelistdrawable;
    }

    private void init(Bitmap bitmap)
    {
        if (isGlyphStateAsset(bitmap))
        {
            setImageDrawable(createStateDrawable(bitmap));
            return;
        } else
        {
            setImageBitmap(bitmap);
            return;
        }
    }

    private boolean isGlyphStateAsset(Bitmap bitmap)
    {
        return bitmap.getHeight() == bitmap.getWidth() * 3;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(j, j);
    }

    public boolean setInvertedState(boolean flag)
    {
        invertedState = flag;
        return flag;
    }

    public void setSource(int i)
    {
        init(BitmapFactory.decodeResource(getResources(), i));
    }

    public void setSource(Bitmap bitmap)
    {
        init(bitmap);
    }
}
