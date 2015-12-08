// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            VerifyAgeActivity, VerifyAgePresenter, UpdateAgeCommand

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b presenter;
    private b supertype;
    private b updateAgeCommand;

    public final void attach(l l1)
    {
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/profile/VerifyAgeActivity, getClass().getClassLoader());
        presenter = l1.a("com.soundcloud.android.profile.VerifyAgePresenter", com/soundcloud/android/profile/VerifyAgeActivity, getClass().getClassLoader());
        updateAgeCommand = l1.a("com.soundcloud.android.profile.UpdateAgeCommand", com/soundcloud/android/profile/VerifyAgeActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/profile/VerifyAgeActivity, getClass().getClassLoader(), false);
    }

    public final VerifyAgeActivity get()
    {
        VerifyAgeActivity verifyageactivity = new VerifyAgeActivity();
        injectMembers(verifyageactivity);
        return verifyageactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(baseLayoutHelper);
        set1.add(presenter);
        set1.add(updateAgeCommand);
        set1.add(supertype);
    }

    public final void injectMembers(VerifyAgeActivity verifyageactivity)
    {
        verifyageactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        verifyageactivity.presenter = (VerifyAgePresenter)presenter.get();
        verifyageactivity.updateAgeCommand = (UpdateAgeCommand)updateAgeCommand.get();
        supertype.injectMembers(verifyageactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VerifyAgeActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.VerifyAgeActivity", "members/com.soundcloud.android.profile.VerifyAgeActivity", false, com/soundcloud/android/profile/VerifyAgeActivity);
    }
}
