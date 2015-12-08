// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ObservableImageView extends ImageView
{

    private Listener _listener;
    private OnDrawListener _onDrawListener;

    public ObservableImageView(Context context)
    {
        super(context);
    }

    public ObservableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ObservableImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (_onDrawListener != null)
        {
            _onDrawListener.onDraw(this);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (_listener != null)
        {
            _listener.onLayout(this, k, l);
        }
    }

    public void setListener(Listener listener)
    {
        _listener = listener;
    }

    public void setOnDrawListener(OnDrawListener ondrawlistener)
    {
        _onDrawListener = ondrawlistener;
    }

    private class OnDrawListener
    {

        public abstract void onDraw(ImageView imageview);
    }


    private class Listener
    {

        public abstract void onLayout(ImageView imageview, int i, int j);
    }

}
