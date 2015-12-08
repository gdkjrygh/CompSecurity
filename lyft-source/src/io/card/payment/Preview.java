// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

class Preview extends ViewGroup
{

    static final boolean $assertionsDisabled;
    private static final String TAG = io/card/payment/Preview.getSimpleName();
    private boolean isSurfaceValid;
    private int mPreviewHeight;
    private int mPreviewWidth;
    SurfaceView mSurfaceView;

    public Preview(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset);
        mPreviewWidth = j;
        mPreviewHeight = i;
        mSurfaceView = new SurfaceView(context);
        addView(mSurfaceView);
    }

    SurfaceHolder getSurfaceHolder()
    {
        SurfaceHolder surfaceholder = getSurfaceView().getHolder();
        if (!$assertionsDisabled && surfaceholder == null)
        {
            throw new AssertionError();
        } else
        {
            return surfaceholder;
        }
    }

    public SurfaceView getSurfaceView()
    {
        if (!$assertionsDisabled && mSurfaceView == null)
        {
            throw new AssertionError();
        } else
        {
            return mSurfaceView;
        }
    }

    public void onDraw(Canvas canvas)
    {
        Log.d(TAG, "Preview.onDraw()");
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            Log.d(TAG, "Preview.onLayout()");
            Log.d(TAG, (new StringBuilder()).append("- isSurfaceValid: ").append(isSurfaceValid).toString());
            if (flag && getChildCount() > 0)
            {
                if (!$assertionsDisabled && mSurfaceView == null)
                {
                    throw new AssertionError();
                }
                i = k - i;
                j = l - j;
                if (mPreviewHeight * i <= mPreviewWidth * j)
                {
                    break label0;
                }
                k = (mPreviewWidth * j) / mPreviewHeight;
                mSurfaceView.layout((i - k) / 2, 0, (i + k) / 2, j);
            }
            return;
        }
        k = (mPreviewHeight * i) / mPreviewWidth;
        mSurfaceView.layout(0, (j - k) / 2, i, (j + k) / 2);
    }

    protected void onMeasure(int i, int j)
    {
        int k = resolveSize(getSuggestedMinimumWidth(), i);
        int l = resolveSize(getSuggestedMinimumHeight(), j);
        Log.d(TAG, String.format("Preview.onMeasure(w:%d, h:%d) setMeasuredDimension(w:%d, h:%d)", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
        }));
        setMeasuredDimension(k, l);
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/Preview.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
