// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.schedule;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetFilter;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import java.util.EnumSet;
import javax.inject.Provider;
import rx.Observable;

public class ScheduleListPresenter extends ContentListPresenter
{

    public ScheduleListPresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, Provider provider)
    {
        super(contentservice, assetviewmodeltransformer, provider);
    }

    protected EnumSet getFilters()
    {
        return EnumSet.of(AssetFilter.PAST_EVENTS);
    }

    protected SortOrder getSortOrder()
    {
        return SortOrder.ASC;
    }

    protected void loadData()
    {
        subscribe(new Observable[] {
            service.loadSchedule()
        });
    }
}
