// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            GoBackOnlineDialogPresenter

public final class  extends b
    implements Provider
{

    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/policies/GoBackOnlineDialogPresenter, getClass().getClassLoader());
    }

    public final GoBackOnlineDialogPresenter get()
    {
        return new GoBackOnlineDialogPresenter((Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.policies.GoBackOnlineDialogPresenter", "members/com.soundcloud.android.policies.GoBackOnlineDialogPresenter", false, com/soundcloud/android/policies/GoBackOnlineDialogPresenter);
    }
}
