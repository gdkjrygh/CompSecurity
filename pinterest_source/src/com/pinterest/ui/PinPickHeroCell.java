// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.imageview.WebImageView;

public class PinPickHeroCell extends RelativeLayout
{

    WebImageView _heroImageView;
    TextView _subTitleTv;
    TextView _titleTv;

    public PinPickHeroCell(Context context)
    {
        this(context, null);
    }

    public PinPickHeroCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03018d, this, true);
        ButterKnife.a(this);
    }

    public void updateUI(String s, final String title, final String description)
    {
        _heroImageView.setImageListener(new _cls1());
        _heroImageView.loadUrl(s);
    }

    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final PinPickHeroCell this$0;
        final String val$description;
        final String val$title;

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            super.onBitmapLoaded(bitmap, loadedfrom);
            _titleTv.setText(title);
            _subTitleTv.setText(description);
        }

        _cls1()
        {
            this$0 = PinPickHeroCell.this;
            title = s;
            description = s1;
            super();
        }
    }

}
