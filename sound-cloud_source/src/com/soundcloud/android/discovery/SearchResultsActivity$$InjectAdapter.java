// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchResultsActivity

public final class  extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b baseLayoutHelper;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/discovery/SearchResultsActivity, getClass().getClassLoader());
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/discovery/SearchResultsActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/discovery/SearchResultsActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/discovery/SearchResultsActivity, getClass().getClassLoader(), false);
    }

    public final SearchResultsActivity get()
    {
        SearchResultsActivity searchresultsactivity = new SearchResultsActivity();
        injectMembers(searchresultsactivity);
        return searchresultsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(actionBarHelper);
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(SearchResultsActivity searchresultsactivity)
    {
        searchresultsactivity.playerController = (PlayerController)playerController.get();
        searchresultsactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        searchresultsactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(searchresultsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchResultsActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.SearchResultsActivity", "members/com.soundcloud.android.discovery.SearchResultsActivity", false, com/soundcloud/android/discovery/SearchResultsActivity);
    }
}
