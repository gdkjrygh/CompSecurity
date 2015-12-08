// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.imageview.SquareImageView;
import java.io.File;

public class GalleryGridCell extends RelativeLayout
{

    private static final int PRIMARY_COLORS[] = Resources.intArray(0x7f08003c);
    FrameLayout _frameLayout;
    SquareImageView _imageView;
    private PhotoItem _photoItem;

    public GalleryGridCell(Context context)
    {
        this(context, null);
    }

    public GalleryGridCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private int getPrimaryColor(PhotoItem photoitem)
    {
        int i;
        if (photoitem == null)
        {
            i = hashCode();
        } else
        {
            i = String.valueOf(photoitem.getPath()).hashCode();
        }
        i = Math.abs(i % PRIMARY_COLORS.length);
        return PRIMARY_COLORS[i];
    }

    private void init()
    {
        inflate(getContext(), 0x7f030122, this);
        ButterKnife.a(this);
    }

    private boolean isCameraCell()
    {
        if (_photoItem != null)
        {
            return _photoItem.getPath().isEmpty();
        } else
        {
            return false;
        }
    }

    protected void onDetachedFromWindow()
    {
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void setPhotoItem(PhotoItem photoitem)
    {
        _photoItem = photoitem;
        ImageCache.cancelLoadImage(_imageView);
        _imageView.setBackgroundColor(getPrimaryColor(photoitem));
        _imageView.getBackground().setAlpha(128);
        if (!isCameraCell())
        {
            _frameLayout.setForeground(null);
            _imageView.setImageListener(new _cls1());
            ImageCache.loadImage(_imageView, new File(_photoItem.getPath()), true, (int)Resources.dimension(0x7f0a0133), (int)Resources.dimension(0x7f0a0133));
            return;
        } else
        {
            _imageView.setClickable(false);
            _imageView.setImageBitmap(null);
            _frameLayout.setForeground(Resources.drawable(0x7f020165));
            return;
        }
    }


    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final GalleryGridCell this$0;

        public void onBitmapSet()
        {
            _imageView.setClickable(false);
        }

        public void onPrepareLoad(Drawable drawable)
        {
            _imageView.setClickable(true);
        }

        _cls1()
        {
            this$0 = GalleryGridCell.this;
            super();
        }
    }

}
