// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            LicensesActivity

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b supertype;

    public final void attach(l l1)
    {
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/settings/LicensesActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/settings/LicensesActivity, getClass().getClassLoader(), false);
    }

    public final LicensesActivity get()
    {
        LicensesActivity licensesactivity = new LicensesActivity();
        injectMembers(licensesactivity);
        return licensesactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(baseLayoutHelper);
        set1.add(supertype);
    }

    public final void injectMembers(LicensesActivity licensesactivity)
    {
        licensesactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(licensesactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LicensesActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.LicensesActivity", "members/com.soundcloud.android.settings.LicensesActivity", false, com/soundcloud/android/settings/LicensesActivity);
    }
}
