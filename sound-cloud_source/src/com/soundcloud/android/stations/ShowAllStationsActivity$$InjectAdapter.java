// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            ShowAllStationsActivity

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/stations/ShowAllStationsActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/stations/ShowAllStationsActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/stations/ShowAllStationsActivity, getClass().getClassLoader(), false);
    }

    public final ShowAllStationsActivity get()
    {
        ShowAllStationsActivity showallstationsactivity = new ShowAllStationsActivity();
        injectMembers(showallstationsactivity);
        return showallstationsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(ShowAllStationsActivity showallstationsactivity)
    {
        showallstationsactivity.playerController = (PlayerController)playerController.get();
        showallstationsactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(showallstationsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ShowAllStationsActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stations.ShowAllStationsActivity", "members/com.soundcloud.android.stations.ShowAllStationsActivity", false, com/soundcloud/android/stations/ShowAllStationsActivity);
    }
}
