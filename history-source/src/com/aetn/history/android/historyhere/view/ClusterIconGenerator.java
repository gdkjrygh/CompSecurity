// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ClusterIconGenerator
{

    private float mAnchorU;
    private float mAnchorV;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private TextView mTextView;

    public ClusterIconGenerator(Context context)
    {
        mAnchorU = 0.5F;
        mAnchorV = 1.0F;
        mContext = context;
        mContainer = (ViewGroup)LayoutInflater.from(mContext).inflate(0x7f030036, null);
        context = (TextView)mContainer.findViewById(0x7f0a002f);
        mTextView = context;
        mContentView = context;
    }

    public Bitmap makeIcon()
    {
        int i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mContainer.measure(i, i);
        i = mContainer.getMeasuredWidth();
        int j = mContainer.getMeasuredHeight();
        mContainer.layout(0, 0, i, j);
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        mContainer.draw(canvas);
        return bitmap;
    }

    public Bitmap makeIcon(String s)
    {
        if (mTextView != null)
        {
            mTextView.setText(s);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable)
    {
        mContainer.setBackgroundDrawable(drawable);
        if (drawable != null)
        {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        } else
        {
            mContainer.setPadding(0, 0, 0, 0);
            return;
        }
    }

    public void setContentPadding(int i, int j, int k, int l)
    {
        mContentView.setPadding(i, j, k, l);
    }

    public void setContentView(View view)
    {
        mContainer.removeAllViews();
        mContainer.addView(view);
        mContentView = view;
        view = mContainer.findViewById(0x7f0a002f);
        if (view instanceof TextView)
        {
            view = (TextView)view;
        } else
        {
            view = null;
        }
        mTextView = view;
    }

    public void setTextAppearance(int i)
    {
        setTextAppearance(mContext, i);
    }

    public void setTextAppearance(Context context, int i)
    {
        if (mTextView != null)
        {
            mTextView.setTextAppearance(context, i);
        }
    }
}
