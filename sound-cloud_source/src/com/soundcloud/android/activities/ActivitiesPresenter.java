// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesOperations, ActivitiesAdapter

class ActivitiesPresenter extends RecyclerViewPresenter
{

    private final ActivitiesAdapter adapter;
    private final ActivitiesOperations operations;

    ActivitiesPresenter(SwipeRefreshAttacher swiperefreshattacher, ActivitiesOperations activitiesoperations, ActivitiesAdapter activitiesadapter)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.list().build());
        operations = activitiesoperations;
        adapter = activitiesadapter;
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(operations.initialActivities()).withAdapter(adapter).withPager(operations.pagingFunction()).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(operations.updatedActivities()).withAdapter(adapter).withPager(operations.pagingFunction()).build();
    }
}
