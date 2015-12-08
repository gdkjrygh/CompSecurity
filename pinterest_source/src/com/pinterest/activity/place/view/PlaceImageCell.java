// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class PlaceImageCell extends RelativeLayout
{

    private WebImageView image;

    public PlaceImageCell(Context context)
    {
        this(context, null);
    }

    public PlaceImageCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static PlaceImageCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof PlaceImageCell)
        {
            return (PlaceImageCell)view;
        } else
        {
            return new PlaceImageCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        setBackgroundColor(-1);
        LayoutInflater.from(getContext()).inflate(0x7f030127, this, true);
        image = (WebImageView)findViewById(0x7f0f004b);
        image.setTransformation(new _cls1());
    }

    public void setImageUrl(String s)
    {
        image.loadUrl(s);
    }

    private class _cls1
        implements Transformation
    {

        final PlaceImageCell this$0;

        public String key()
        {
            return "180x180";
        }

        public Bitmap transform(Bitmap bitmap)
        {
            return ImageUtils.bitmapToExactFit(bitmap, 180, 180);
        }

        _cls1()
        {
            this$0 = PlaceImageCell.this;
            super();
        }
    }

}
