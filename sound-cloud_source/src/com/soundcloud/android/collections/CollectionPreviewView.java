// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import dagger.b;
import java.util.List;

public class CollectionPreviewView extends FrameLayout
{

    static final int EXTRA_HOLDER_VIEWS = 1;
    private ViewGroup holder;
    ImageOperations imageOperations;
    private LayoutInflater inflater;
    private int numThumbnails;

    public CollectionPreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        SoundCloudApplication.getObjectGraph().a(this);
        init(context);
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.CollectionPreviewView);
        attributeset = (TextView)findViewById(0x7f0f0073);
        attributeset.setText(context.getString(0));
        attributeset.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(1), null, null, null);
        context.recycle();
    }

    public CollectionPreviewView(Context context, ImageOperations imageoperations)
    {
        super(context);
        imageOperations = imageoperations;
        init(context);
    }

    private void inflateThumbnailViewIntoHolder()
    {
        inflater.inflate(0x7f030031, holder);
        if (isLastThumbnailView())
        {
            holder.getChildAt(holder.getChildCount() - 1).setBackgroundResource(0x7f02005c);
        }
    }

    private void init(Context context)
    {
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        inflater.inflate(0x7f03002e, this);
        holder = (ViewGroup)findViewById(0x7f0f00d4);
    }

    private boolean isLastThumbnailView()
    {
        return holder.getChildCount() - 1 == numThumbnails;
    }

    void clearThumbnails()
    {
        for (; 1 < holder.getChildCount(); holder.removeViewAt(1)) { }
    }

    void populateArtwork(List list, int i)
    {
        int k = numThumbnails;
        for (int j = 0; j < k - i; j++)
        {
            inflateThumbnailViewIntoHolder();
            ImageView imageview = (ImageView)holder.getChildAt(j + i + 1);
            imageOperations.displayWithPlaceholder((Urn)list.get(j), ApiImageSize.getListItemImageSize(holder.getResources()), imageview);
        }

    }

    void populateEmptyThumbnails(int i)
    {
        for (int j = 0; j < i; j++)
        {
            inflateThumbnailViewIntoHolder();
        }

    }

    public void refreshThumbnails(List list, int i)
    {
        int j = Math.max(i - list.size(), 0);
        numThumbnails = i;
        clearThumbnails();
        populateEmptyThumbnails(j);
        populateArtwork(list, j);
    }
}
