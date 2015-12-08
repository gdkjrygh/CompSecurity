// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


public class RenderCoordinates
{
    public class NormalizedPoint
    {

        private float mXAbsoluteCss;
        private float mYAbsoluteCss;
        final RenderCoordinates this$0;

        public float getXAbsoluteCss()
        {
            return mXAbsoluteCss;
        }

        public float getXLocalDip()
        {
            return (mXAbsoluteCss - mScrollXCss) * mPageScaleFactor;
        }

        public float getXPix()
        {
            return getXLocalDip() * mDeviceScaleFactor;
        }

        public float getYAbsoluteCss()
        {
            return mYAbsoluteCss;
        }

        public float getYLocalDip()
        {
            return (mYAbsoluteCss - mScrollYCss) * mPageScaleFactor;
        }

        public float getYPix()
        {
            return getYLocalDip() * mDeviceScaleFactor + mContentOffsetYPix;
        }

        public void setAbsoluteCss(float f, float f1)
        {
            mXAbsoluteCss = f;
            mYAbsoluteCss = f1;
        }

        public void setLocalDip(float f, float f1)
        {
            setAbsoluteCss(f / mPageScaleFactor + mScrollXCss, f1 / mPageScaleFactor + mScrollYCss);
        }

        public void setScreen(float f, float f1)
        {
            setLocalDip(f / mDeviceScaleFactor, f1 / mDeviceScaleFactor);
        }

        private NormalizedPoint()
        {
            this$0 = RenderCoordinates.this;
            super();
        }

    }


    private float mContentHeightCss;
    private float mContentOffsetYPix;
    private float mContentWidthCss;
    private float mDeviceScaleFactor;
    private float mLastFrameViewportHeightCss;
    private float mLastFrameViewportWidthCss;
    private float mMaxPageScaleFactor;
    private float mMinPageScaleFactor;
    private float mPageScaleFactor;
    private float mScrollXCss;
    private float mScrollYCss;

    public RenderCoordinates()
    {
        mPageScaleFactor = 1.0F;
        mMinPageScaleFactor = 1.0F;
        mMaxPageScaleFactor = 1.0F;
    }

    public NormalizedPoint createNormalizedPoint()
    {
        return new NormalizedPoint();
    }

    public float fromDipToPix(float f)
    {
        return mDeviceScaleFactor * f;
    }

    public float fromLocalCssToPix(float f)
    {
        return mPageScaleFactor * f * mDeviceScaleFactor;
    }

    public float fromPixToDip(float f)
    {
        return f / mDeviceScaleFactor;
    }

    public float fromPixToLocalCss(float f)
    {
        return f / (mDeviceScaleFactor * mPageScaleFactor);
    }

    public float getContentHeightCss()
    {
        return mContentHeightCss;
    }

    public float getContentHeightPix()
    {
        return fromLocalCssToPix(mContentHeightCss);
    }

    public int getContentHeightPixInt()
    {
        return (int)Math.ceil(getContentHeightPix());
    }

    public float getContentOffsetYPix()
    {
        return mContentOffsetYPix;
    }

    public float getContentWidthCss()
    {
        return mContentWidthCss;
    }

    public float getContentWidthPix()
    {
        return fromLocalCssToPix(mContentWidthCss);
    }

    public int getContentWidthPixInt()
    {
        return (int)Math.ceil(getContentWidthPix());
    }

    public float getDeviceScaleFactor()
    {
        return mDeviceScaleFactor;
    }

    public float getLastFrameViewportHeightCss()
    {
        return mLastFrameViewportHeightCss;
    }

    public float getLastFrameViewportHeightPix()
    {
        return fromLocalCssToPix(mLastFrameViewportHeightCss);
    }

    public int getLastFrameViewportHeightPixInt()
    {
        return (int)Math.ceil(getLastFrameViewportHeightPix());
    }

    public float getLastFrameViewportWidthCss()
    {
        return mLastFrameViewportWidthCss;
    }

    public float getLastFrameViewportWidthPix()
    {
        return fromLocalCssToPix(mLastFrameViewportWidthCss);
    }

    public int getLastFrameViewportWidthPixInt()
    {
        return (int)Math.ceil(getLastFrameViewportWidthPix());
    }

    public float getMaxHorizontalScrollPix()
    {
        return getContentWidthPix() - getLastFrameViewportWidthPix();
    }

    public int getMaxHorizontalScrollPixInt()
    {
        return (int)Math.floor(getMaxHorizontalScrollPix());
    }

    public float getMaxPageScaleFactor()
    {
        return mMaxPageScaleFactor;
    }

    public float getMaxVerticalScrollPix()
    {
        return getContentHeightPix() - getLastFrameViewportHeightPix();
    }

    public int getMaxVerticalScrollPixInt()
    {
        return (int)Math.floor(getMaxVerticalScrollPix());
    }

    public float getMinPageScaleFactor()
    {
        return mMinPageScaleFactor;
    }

    public float getPageScaleFactor()
    {
        return mPageScaleFactor;
    }

    public float getScrollX()
    {
        return mScrollXCss;
    }

    public float getScrollXPix()
    {
        return fromLocalCssToPix(mScrollXCss);
    }

    public int getScrollXPixInt()
    {
        return (int)Math.floor(getScrollXPix());
    }

    public float getScrollY()
    {
        return mScrollYCss;
    }

    public float getScrollYPix()
    {
        return fromLocalCssToPix(mScrollYCss);
    }

    public int getScrollYPixInt()
    {
        return (int)Math.floor(getScrollYPix());
    }

    void reset()
    {
        mScrollYCss = 0.0F;
        mScrollXCss = 0.0F;
        mPageScaleFactor = 1.0F;
    }

    void setDeviceScaleFactor(float f)
    {
        mDeviceScaleFactor = f;
    }

    void updateContentSizeCss(float f, float f1)
    {
        mContentWidthCss = f;
        mContentHeightCss = f1;
    }

    void updateFrameInfo(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7, float f8, float f9)
    {
        mScrollXCss = f;
        mScrollYCss = f1;
        mPageScaleFactor = f6;
        mMinPageScaleFactor = f7;
        mMaxPageScaleFactor = f8;
        mContentOffsetYPix = f9;
        updateContentSizeCss(f2, f3);
        mLastFrameViewportWidthCss = f4;
        mLastFrameViewportHeightCss = f5;
    }





}
