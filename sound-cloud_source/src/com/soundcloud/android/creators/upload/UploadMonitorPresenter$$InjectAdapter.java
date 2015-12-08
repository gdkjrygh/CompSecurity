// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.image.PlaceholderGenerator;
import com.soundcloud.android.utils.ViewHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorPresenter

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b placeholderGenerator;
    private b supertype;
    private b viewHelper;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/creators/upload/UploadMonitorPresenter, getClass().getClassLoader());
        placeholderGenerator = l1.a("com.soundcloud.android.image.PlaceholderGenerator", com/soundcloud/android/creators/upload/UploadMonitorPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/creators/upload/UploadMonitorPresenter, getClass().getClassLoader());
        viewHelper = l1.a("com.soundcloud.android.utils.ViewHelper", com/soundcloud/android/creators/upload/UploadMonitorPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher", com/soundcloud/android/creators/upload/UploadMonitorPresenter, getClass().getClassLoader(), false);
    }

    public final UploadMonitorPresenter get()
    {
        UploadMonitorPresenter uploadmonitorpresenter = new UploadMonitorPresenter((EventBus)eventBus.get(), (PlaceholderGenerator)placeholderGenerator.get(), (AccountOperations)accountOperations.get(), (ViewHelper)viewHelper.get());
        injectMembers(uploadmonitorpresenter);
        return uploadmonitorpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(placeholderGenerator);
        set.add(accountOperations);
        set.add(viewHelper);
        set1.add(supertype);
    }

    public final void injectMembers(UploadMonitorPresenter uploadmonitorpresenter)
    {
        supertype.injectMembers(uploadmonitorpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UploadMonitorPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.upload.UploadMonitorPresenter", "members/com.soundcloud.android.creators.upload.UploadMonitorPresenter", false, com/soundcloud/android/creators/upload/UploadMonitorPresenter);
    }
}
