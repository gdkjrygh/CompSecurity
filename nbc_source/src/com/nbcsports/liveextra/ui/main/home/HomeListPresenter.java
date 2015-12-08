// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.home;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetFilter;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import com.nbcsports.liveextra.ui.main.core.ContentListView;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePresenter;
import java.util.EnumSet;
import javax.inject.Provider;
import rx.Observable;

public class HomeListPresenter extends ContentListPresenter
    implements com.nbcsports.liveextra.ui.main.showcase.ShowcasePresenter.Listener
{

    private boolean canHideTimeline;
    private final ShowcasePresenter showcasePresenter;

    public HomeListPresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, ShowcasePresenter showcasepresenter, Provider provider)
    {
        super(contentservice, assetviewmodeltransformer, provider);
        canHideTimeline = true;
        showcasePresenter = showcasepresenter;
    }

    public boolean canHideTimeline()
    {
        return canHideTimeline;
    }

    protected EnumSet getFilters()
    {
        Sport sport;
        if (this.sport == null)
        {
            sport = null;
        } else
        {
            sport = (Sport)this.sport.get();
        }
        if (sport == null || !sport.isRSN())
        {
            return EnumSet.of(AssetFilter.RSN, AssetFilter.PAST_EVENTS);
        } else
        {
            return EnumSet.of(AssetFilter.PAST_EVENTS);
        }
    }

    protected SortOrder getSortOrder()
    {
        return SortOrder.ASC;
    }

    protected void loadData()
    {
        showcasePresenter.setListener(this);
        subscribe(new Observable[] {
            service.loadLive(), service.loadUpcomingData()
        });
        showcasePresenter.onLoad();
    }

    public void onHideTimeline()
    {
        if (canHideTimeline())
        {
            showcasePresenter.show();
        }
    }

    public void onShowTimeline()
    {
        if (canHideTimeline())
        {
            showcasePresenter.hide();
        }
    }

    public void onShowcaseListReceived(boolean flag)
    {
        if (flag)
        {
            getView().onShowTimeline();
            canHideTimeline = false;
            return;
        } else
        {
            canHideTimeline = true;
            return;
        }
    }

    public void refresh()
    {
        super.refresh();
        showcasePresenter.refresh();
    }
}
