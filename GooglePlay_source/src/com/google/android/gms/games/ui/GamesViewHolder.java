// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.net.Uri;
import com.google.android.gms.common.images.internal.LoadingImageView;

// Referenced classes of package com.google.android.gms.games.ui:
//            ImageLoader, GamesBaseAdapter

public abstract class GamesViewHolder
    implements ImageLoader
{

    protected final GamesBaseAdapter mAdapter;

    public GamesViewHolder(GamesBaseAdapter gamesbaseadapter)
    {
        mAdapter = gamesbaseadapter;
    }

    public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i)
    {
        loadImage(loadingimageview, uri, i, null);
    }

    public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i, com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onimageloadedlistener)
    {
        if (mAdapter == null || mAdapter.mShouldLoadImages)
        {
            if (onimageloadedlistener != null)
            {
                loadingimageview.mOnImageLoadedListener = onimageloadedlistener;
            }
            loadingimageview.loadUri$3329f911(uri, i, true);
            return;
        } else
        {
            loadingimageview.clearImage();
            return;
        }
    }
}
