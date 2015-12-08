// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.favorites;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import java.util.EnumSet;
import rx.Observable;

public class FavoritesListPresenter extends ContentListPresenter
{

    private final FavoriteService favorites;
    private boolean isLive;

    public FavoritesListPresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, FavoriteService favoriteservice)
    {
        super(contentservice, assetviewmodeltransformer, null);
        isLive = true;
        favorites = favoriteservice;
    }

    protected EnumSet getFilters()
    {
        return null;
    }

    protected SortOrder getSortOrder()
    {
        if (isLive)
        {
            return SortOrder.ASC;
        } else
        {
            return SortOrder.DESC;
        }
    }

    protected void loadData()
    {
        super.reset();
        subscribe(new Observable[] {
            favorites.getStoredFavoritesObservable(isLive)
        });
    }

    public void setIsLive(boolean flag)
    {
        if (isLive == flag)
        {
            return;
        } else
        {
            isLive = flag;
            loadData();
            return;
        }
    }

    public void setListener(com.nbcsports.liveextra.ui.main.core.ContentListPresenter.Listener listener, boolean flag)
    {
        super.setListener(listener);
        isLive = flag;
    }
}
