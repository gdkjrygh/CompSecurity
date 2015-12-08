// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchActivity, SearchPresenter

public final class  extends b
    implements a, Provider
{

    private b layoutHelper;
    private b playerController;
    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        layoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/discovery/SearchActivity, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.discovery.SearchPresenter", com/soundcloud/android/discovery/SearchActivity, getClass().getClassLoader());
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/discovery/SearchActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/discovery/SearchActivity, getClass().getClassLoader(), false);
    }

    public final SearchActivity get()
    {
        SearchActivity searchactivity = new SearchActivity();
        injectMembers(searchactivity);
        return searchactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(layoutHelper);
        set1.add(presenter);
        set1.add(playerController);
        set1.add(supertype);
    }

    public final void injectMembers(SearchActivity searchactivity)
    {
        searchactivity.layoutHelper = (BaseLayoutHelper)layoutHelper.get();
        searchactivity.presenter = (SearchPresenter)presenter.get();
        searchactivity.playerController = (PlayerController)playerController.get();
        supertype.injectMembers(searchactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.SearchActivity", "members/com.soundcloud.android.discovery.SearchActivity", false, com/soundcloud/android/discovery/SearchActivity);
    }
}
