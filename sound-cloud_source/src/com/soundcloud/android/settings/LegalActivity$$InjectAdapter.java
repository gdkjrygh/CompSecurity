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
//            LegalActivity

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b supertype;

    public final void attach(l l1)
    {
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/settings/LegalActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/settings/LegalActivity, getClass().getClassLoader(), false);
    }

    public final LegalActivity get()
    {
        LegalActivity legalactivity = new LegalActivity();
        injectMembers(legalactivity);
        return legalactivity;
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

    public final void injectMembers(LegalActivity legalactivity)
    {
        legalactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        supertype.injectMembers(legalactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LegalActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.LegalActivity", "members/com.soundcloud.android.settings.LegalActivity", false, com/soundcloud/android/settings/LegalActivity);
    }
}
