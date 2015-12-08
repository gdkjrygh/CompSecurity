// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.app.ActivityManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util.cache:
//            SpannedStringCache

public final class SpannedStringCache_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityManagerProvider;
    private final MembersInjector membersInjector;

    public SpannedStringCache_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            activityManagerProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new SpannedStringCache_Factory(membersinjector, provider);
    }

    public final SpannedStringCache get()
    {
        SpannedStringCache spannedstringcache = new SpannedStringCache((ActivityManager)activityManagerProvider.get());
        membersInjector.injectMembers(spannedstringcache);
        return spannedstringcache;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/cache/SpannedStringCache_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
