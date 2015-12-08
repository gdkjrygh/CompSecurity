// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.favorites;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.ui.main.core.AssetViewAdapter;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import com.nbcsports.liveextra.ui.main.core.ContentListView;
import com.phunware.nbc.sochi.MainNavigationContentActivity;

// Referenced classes of package com.nbcsports.liveextra.ui.main.favorites:
//            FavoritesListPresenter

public class FavoritesListView extends ContentListView
    implements com.nbcsports.liveextra.content.FavoriteService.FavoriteActionListener
{

    private boolean isLiveActive;
    FavoritesListPresenter presenter;

    public FavoritesListView(Context context)
    {
        super(context);
    }

    public FavoritesListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FavoritesListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected boolean canRefresh()
    {
        return false;
    }

    protected ContentListPresenter getPresenter()
    {
        return presenter;
    }

    protected void inject()
    {
        MainNavigationContentActivity.component().inject(this);
    }

    public void onAdded(Asset asset)
    {
        adapter.add(asset);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        presenter.bindView(this);
        timelineWrapper.setVisibility(8);
        empty.setText(0x7f07010b);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.releaseView();
    }

    public void onHideTimeline()
    {
    }

    public void onRemove(Asset asset)
    {
        adapter.remove(asset);
    }

    public void onShowTimeline()
    {
    }

    public void setIsLive(boolean flag)
    {
        isLiveActive = flag;
        presenter.setIsLive(flag);
    }

    protected boolean showRelativeDateHeader()
    {
        return false;
    }
}
