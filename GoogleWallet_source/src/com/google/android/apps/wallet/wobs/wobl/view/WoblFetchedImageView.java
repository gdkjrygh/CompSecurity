// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.view;

import android.content.Context;
import android.net.Uri;
import android.view.InflateException;
import android.widget.ImageView;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class WoblFetchedImageView extends ImageView
{

    private static final String TAG = com/google/android/apps/wallet/wobs/wobl/view/WoblFetchedImageView.getSimpleName();
    private boolean forceSquareAspectRatio;
    private double mAspectRatio;
    private Uri mUri;
    private int measuredImageHeight;
    private int measuredImageWidth;
    Picasso picasso;

    public WoblFetchedImageView(Context context)
    {
        super(context, null);
        measuredImageHeight = -1;
        measuredImageWidth = -1;
        UserInjector.inject(this, context);
    }

    private void loadIfNecessary()
    {
        if (mUri != null && measuredDimensions())
        {
            picasso.load(mUri).resize(measuredImageWidth, measuredImageHeight).into(this, new Callback() {

                final WoblFetchedImageView this$0;

                public final void onError()
                {
                    setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                    setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wob_missing);
                }

            
            {
                this$0 = WoblFetchedImageView.this;
                super();
            }
            });
            mUri = null;
        }
    }

    private boolean measuredDimensions()
    {
        return measuredImageWidth != -1;
    }

    public void onMeasure(int i, int j)
    {
        int i1 = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (i1 == 0)
        {
            throw new InflateException("Unspecified width unsupported!");
        }
        i = getPaddingLeft();
        i1 = getPaddingRight();
        if (mAspectRatio != 0.0D)
        {
            i = (int)((double)(k - i - i1) / mAspectRatio);
        } else
        {
            i = 0;
        }
        i = getPaddingTop() + i + getPaddingBottom();
        if (l == 0x40000000 || l == 0x80000000 && i > j)
        {
            i = j;
        }
        setMeasuredDimension(k, i);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (mAspectRatio != 0.0D && i != 0 && j != 0 && i != k && j != l)
        {
            j = i - getPaddingLeft() - getPaddingRight();
            if (mAspectRatio != 0.0D)
            {
                i = (int)((double)j / mAspectRatio);
            } else
            {
                i = 0;
            }
            if (measuredImageWidth != j || measuredImageHeight != i)
            {
                measuredImageWidth = j;
                measuredImageHeight = i;
                WLog.vfmt(TAG, "Fetching Wobl image with width: %d and height: %d", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(i)
                });
                loadIfNecessary();
            }
        }
    }

    public void setAspectRatio(double d)
    {
        if (!measuredDimensions())
        {
            mAspectRatio = d;
        }
    }

    public void setForceSquareAspectRatio(boolean flag)
    {
        if (forceSquareAspectRatio && !flag)
        {
            throw new IllegalStateException("forceSquareAspectRatio cannot be unset after it has been set");
        }
        if (measuredDimensions())
        {
            throw new IllegalStateException("attempted to force square aspect ratio after width and height have been measured");
        } else
        {
            forceSquareAspectRatio = flag;
            setAspectRatio(1.0D);
            return;
        }
    }

    public void setImageUri(Uri uri)
    {
        mUri = uri;
        setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        loadIfNecessary();
    }

}
