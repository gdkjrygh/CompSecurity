// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.CardViewImpl;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.games.ui:
//            ImageLoader, GamesRecyclerAdapter

public static abstract class mContext extends android.support.v7.widget.older
    implements ImageLoader, com.google.android.play.animation.ontext
{

    public GamesRecyclerAdapter mAdapter;
    public final Context mContext;

    public final int getLocalPosition()
    {
        int i;
        if (super.older == -1)
        {
            i = super.older;
        } else
        {
            i = super.older;
        }
        return i - mAdapter.getBasePosition();
    }

    public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i)
    {
        loadImage(loadingimageview, uri, i, null);
    }

    public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i, com.google.android.gms.common.images.mage mage)
    {
        if (mAdapter == null || mAdapter.mShouldLoadImages)
        {
            if (mage != null)
            {
                loadingimageview.mOnImageLoadedListener = mage;
            }
            loadingimageview.loadUri$3329f911(uri, i, true);
            return;
        } else
        {
            loadingimageview.clearImage();
            return;
        }
    }

    public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        mAdapter = gamesrecycleradapter;
    }

    public void repopulateViews()
    {
    }

    public boolean shouldAnimateAdd()
    {
        for (ViewGroup viewgroup = (ViewGroup)itemView.getParent(); viewgroup == null || itemView.getBottom() < 0 || itemView.getTop() > viewgroup.getHeight();)
        {
            return false;
        }

        return true;
    }

    public (View view)
    {
        super(view);
        mContext = view.getContext();
        if ((view instanceof CardView) && !PlatformVersion.checkVersion(21))
        {
            Object obj = (CardView)view;
            float f = CardView.IMPL.getMaxElevation(((android.support.v7.widget.CardViewDelegate) (obj)));
            obj = (CardView)view;
            float f1 = CardView.IMPL.getRadius(((android.support.v7.widget.CardViewDelegate) (obj)));
            int i = (int)Math.ceil((double)f + (1.0D - GamesRecyclerAdapter.access$000()) * (double)f1);
            int j = (int)Math.ceil((double)f * 1.5D + (1.0D - GamesRecyclerAdapter.access$000()) * (double)f1);
            obj = (android.support.v7.widget.older.mContext)view.getLayoutParams();
            obj.mContext = Math.max(((android.support.v7.widget.older.mContext) (obj)).mContext - i, 0);
            obj.mContext = Math.max(((android.support.v7.widget.older.mContext) (obj)).mContext - i, 0);
            obj.mContext = Math.max(((android.support.v7.widget.older.mContext) (obj)).mContext - j, 0);
            obj.mContext = Math.max(((android.support.v7.widget.older.mContext) (obj)).mContext - j, 0);
            view.setLayoutParams(((android.view.ottomMargin) (obj)));
        }
    }
}
