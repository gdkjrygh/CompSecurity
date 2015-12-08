// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.screen;

import com.soundcloud.android.properties.ApplicationProperties;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.screen:
//            BaseLayoutHelper

public final class  extends b
    implements Provider
{

    private b applicationProperties;

    public final void attach(l l1)
    {
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/view/screen/BaseLayoutHelper, getClass().getClassLoader());
    }

    public final BaseLayoutHelper get()
    {
        return new BaseLayoutHelper((ApplicationProperties)applicationProperties.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(applicationProperties);
    }

    public ()
    {
        super("com.soundcloud.android.view.screen.BaseLayoutHelper", "members/com.soundcloud.android.view.screen.BaseLayoutHelper", false, com/soundcloud/android/view/screen/BaseLayoutHelper);
    }
}
