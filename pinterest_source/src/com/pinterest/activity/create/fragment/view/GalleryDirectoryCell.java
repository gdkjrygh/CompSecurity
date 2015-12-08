// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.create.model.DirectoryItem;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.ui.imageview.SquareImageView;
import java.io.File;

public class GalleryDirectoryCell extends LinearLayout
{

    TextView _descTextView;
    private DirectoryItem _directoryItem;
    SquareImageView _imageView;
    TextView _nameTextView;

    public GalleryDirectoryCell(Context context)
    {
        this(context, null);
    }

    public GalleryDirectoryCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private String getLatestPhotoPath(String s)
    {
        File afile[] = (new File(s)).listFiles(ImageUtils.PICTURE_FILE_FILTER);
        String s1 = s;
        if (afile != null)
        {
            s1 = s;
            if (afile.length > 0)
            {
                s1 = afile[afile.length - 1].getPath();
            }
        }
        return s1;
    }

    private void init()
    {
        inflate(getContext(), 0x7f030121, this);
        ButterKnife.a(this);
    }

    protected void onDetachedFromWindow()
    {
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void setDirectoryItem(DirectoryItem directoryitem)
    {
        _directoryItem = directoryitem;
        ImageCache.cancelLoadImage(_imageView);
        directoryitem = getLatestPhotoPath(_directoryItem.getPath());
        _imageView.setTransformation(new _cls1());
        ImageCache.loadImage(_imageView, new File(directoryitem), true);
        _nameTextView.setText(_directoryItem.getName());
        _descTextView.setText(_directoryItem.getPhotoCountDesc());
    }

    private class _cls1
        implements Transformation
    {

        final GalleryDirectoryCell this$0;

        public String key()
        {
            return "R.dimen.thumbnail_size";
        }

        public Bitmap transform(Bitmap bitmap)
        {
            return ImageUtils.bitmapToExactFit(bitmap, (int)Resources.dimension(0x7f0a01e7), (int)Resources.dimension(0x7f0a01e7));
        }

        _cls1()
        {
            this$0 = GalleryDirectoryCell.this;
            super();
        }
    }

}
