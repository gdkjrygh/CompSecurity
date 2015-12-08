// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/associations/RepostStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/associations/RepostStorage, getClass().getClassLoader());
    }

    public final RepostStorage get()
    {
        return new RepostStorage((PropellerDatabase)propeller.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.associations.RepostStorage", "members/com.soundcloud.android.associations.RepostStorage", false, com/soundcloud/android/associations/RepostStorage);
    }
}
