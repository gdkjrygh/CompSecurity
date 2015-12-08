// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.properties;

import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.properties:
//            ApplicationProperties

public final class  extends b
    implements Provider
{

    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/properties/ApplicationProperties, getClass().getClassLoader());
    }

    public final ApplicationProperties get()
    {
        return new ApplicationProperties((Resources)resources.get());
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
        super("com.soundcloud.android.properties.ApplicationProperties", "members/com.soundcloud.android.properties.ApplicationProperties", true, com/soundcloud/android/properties/ApplicationProperties);
    }
}
