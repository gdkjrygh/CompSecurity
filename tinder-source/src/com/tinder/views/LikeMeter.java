// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class LikeMeter extends ImageView
{
    public static final class AssetMode extends Enum
    {

        private static final AssetMode $VALUES[];
        public static final AssetMode EXTRA_LARGE;
        public static final AssetMode NORMAL;
        public static final AssetMode PLUS;

        public static AssetMode valueOf(String s)
        {
            return (AssetMode)Enum.valueOf(com/tinder/views/LikeMeter$AssetMode, s);
        }

        public static AssetMode[] values()
        {
            return (AssetMode[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new AssetMode("NORMAL", 0);
            PLUS = new AssetMode("PLUS", 1);
            EXTRA_LARGE = new AssetMode("EXTRA_LARGE", 2);
            $VALUES = (new AssetMode[] {
                NORMAL, PLUS, EXTRA_LARGE
            });
        }

        private AssetMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final float PERCENT_FULL = 1F;
    private static final float TOP_MARGIN_PERCENTAGE = 0.024F;
    private AssetMode mAssetMode;
    private Canvas mCanvasMasked;
    private Bitmap mMaskHeart;
    private Bitmap mMaskShadow;
    private boolean mNeedsRedraw;
    private Paint mPaintGray;
    private Paint mPaintGreen;
    private Paint mPaintMask;
    private Path mPathGray;
    private Path mPathGreen;
    private float mPercentFull;
    private Bitmap mResultBmp;
    private Rect mShadowRectDst;

    public LikeMeter(Context context)
    {
        super(context);
        mAssetMode = AssetMode.NORMAL;
        init();
    }

    public LikeMeter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAssetMode = AssetMode.NORMAL;
        init();
    }

    public LikeMeter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAssetMode = AssetMode.NORMAL;
        init();
    }

    private void buildMask()
    {
        int i = 0;
        static class _cls1
        {

            static final int $SwitchMap$com$tinder$views$LikeMeter$AssetMode[];

            static 
            {
                $SwitchMap$com$tinder$views$LikeMeter$AssetMode = new int[AssetMode.values().length];
                try
                {
                    $SwitchMap$com$tinder$views$LikeMeter$AssetMode[AssetMode.NORMAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$tinder$views$LikeMeter$AssetMode[AssetMode.PLUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$tinder$views$LikeMeter$AssetMode[AssetMode.EXTRA_LARGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.tinder.views.LikeMeter.AssetMode[mAssetMode.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 241
    //                   2 250
    //                   3 259;
           goto _L1 _L2 _L3 _L4
_L1:
        int j = 0;
_L6:
        mMaskHeart = BitmapFactory.decodeResource(getResources(), j);
        mMaskShadow = BitmapFactory.decodeResource(getResources(), i);
        mResultBmp = Bitmap.createBitmap(mMaskHeart.getWidth(), mMaskHeart.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        j = mMaskHeart.getWidth() - mMaskShadow.getWidth();
        i = mMaskHeart.getHeight() - mMaskShadow.getHeight();
        mShadowRectDst = new Rect();
        mShadowRectDst.left = j / 2;
        mShadowRectDst.top = i / 2;
        Rect rect = mShadowRectDst;
        int k = mMaskShadow.getWidth();
        rect.right = j / 2 + k;
        rect = mShadowRectDst;
        j = mMaskShadow.getHeight();
        rect.bottom = i / 2 + j;
        mCanvasMasked = new Canvas(mResultBmp);
        setMinimumHeight(mMaskHeart.getHeight());
        setMinimumWidth(mMaskHeart.getWidth());
        redraw();
        return;
_L2:
        j = 0x7f0201b5;
        i = 0x7f0201b6;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f0201b3;
        i = 0x7f0201b4;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0x7f020194;
        i = 0x7f020195;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void redraw()
    {
        mNeedsRedraw = true;
        invalidate();
    }

    public float getPercentFull()
    {
        return mPercentFull;
    }

    public void init()
    {
        setWillNotDraw(false);
        mPathGreen = new Path();
        mPathGray = new Path();
        mPaintGreen = new Paint(1);
        mPaintGreen.setColor(getResources().getColor(0x7f0d0017));
        mPaintGray = new Paint(1);
        mPaintGray.setColor(getResources().getColor(0x7f0d00a1));
        mPaintMask = new Paint(1);
        mPaintMask.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        setPercentFull(1.0F);
    }

    protected void onDraw(Canvas canvas)
    {
        if (mNeedsRedraw)
        {
            mCanvasMasked.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        }
        mCanvasMasked.drawPath(mPathGray, mPaintGray);
        if (isEnabled())
        {
            mCanvasMasked.drawPath(mPathGreen, mPaintGreen);
        }
        mCanvasMasked.drawBitmap(mMaskHeart, 0.0F, 0.0F, mPaintMask);
        if (mPercentFull != 1.0F && isEnabled())
        {
            mCanvasMasked.drawBitmap(mMaskShadow, null, mShadowRectDst, null);
        }
        int i = getWidth();
        int j = mMaskHeart.getWidth();
        int k = getHeight();
        int l = mMaskHeart.getHeight();
        canvas.drawBitmap(mResultBmp, (i - j) / 2, (float)((k - l) / 2) + 0.024F * (float)getHeight(), null);
    }

    public void setAssetMode(AssetMode assetmode)
    {
        if (assetmode != mAssetMode)
        {
            mAssetMode = assetmode;
            buildMask();
            setPercentFull(mPercentFull);
        }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        redraw();
    }

    public void setPercentFull(float f)
    {
        Bitmap bitmap = mMaskHeart;
        Bitmap bitmap1 = mMaskShadow;
        int i = 0;
        boolean flag = true;
        while (i < 2) 
        {
            Bitmap bitmap2 = (new Bitmap[] {
                bitmap, bitmap1
            })[i];
            if (flag && bitmap2 != null && !bitmap2.isRecycled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
        if (!flag)
        {
            buildMask();
        }
        mPercentFull = f;
        mPathGreen.reset();
        mPathGreen.addRect(0.0F, (float)mMaskHeart.getHeight() * (1.0F - mPercentFull), mMaskHeart.getWidth(), mMaskHeart.getHeight(), android.graphics.Path.Direction.CW);
        mPathGray.reset();
        mPathGray.addRect(0.0F, 0.0F, mMaskHeart.getWidth(), mMaskHeart.getHeight(), android.graphics.Path.Direction.CW);
        redraw();
    }

    public void setPercentFullInt(int i)
    {
        setPercentFull((float)i / 100F);
    }
}
