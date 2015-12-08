// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            ResolveActivity, IntentResolver

public final class  extends b
    implements a, Provider
{

    private b intentResolver;
    private b supertype;

    public final void attach(l l1)
    {
        intentResolver = l1.a("com.soundcloud.android.deeplinks.IntentResolver", com/soundcloud/android/deeplinks/ResolveActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.TrackedActivity", com/soundcloud/android/deeplinks/ResolveActivity, getClass().getClassLoader(), false);
    }

    public final ResolveActivity get()
    {
        ResolveActivity resolveactivity = new ResolveActivity();
        injectMembers(resolveactivity);
        return resolveactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(intentResolver);
        set1.add(supertype);
    }

    public final void injectMembers(ResolveActivity resolveactivity)
    {
        resolveactivity.intentResolver = (IntentResolver)intentResolver.get();
        supertype.injectMembers(resolveactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ResolveActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.deeplinks.ResolveActivity", "members/com.soundcloud.android.deeplinks.ResolveActivity", false, com/soundcloud/android/deeplinks/ResolveActivity);
    }
}
