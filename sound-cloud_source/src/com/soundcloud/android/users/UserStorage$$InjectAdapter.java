// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.users:
//            UserStorage

public final class  extends b
    implements Provider
{

    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/users/UserStorage, getClass().getClassLoader());
    }

    public final UserStorage get()
    {
        return new UserStorage((PropellerRx)propeller.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
    }

    public ()
    {
        super("com.soundcloud.android.users.UserStorage", "members/com.soundcloud.android.users.UserStorage", false, com/soundcloud/android/users/UserStorage);
    }
}
