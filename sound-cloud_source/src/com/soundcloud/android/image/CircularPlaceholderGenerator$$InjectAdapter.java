// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.image:
//            CircularPlaceholderGenerator

public final class  extends b
    implements a, Provider
{

    private b resources;
    private b supertype;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/image/CircularPlaceholderGenerator, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.image.PlaceholderGenerator", com/soundcloud/android/image/CircularPlaceholderGenerator, getClass().getClassLoader(), false);
    }

    public final CircularPlaceholderGenerator get()
    {
        CircularPlaceholderGenerator circularplaceholdergenerator = new CircularPlaceholderGenerator((Resources)resources.get());
        injectMembers(circularplaceholdergenerator);
        return circularplaceholdergenerator;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set1.add(supertype);
    }

    public final void injectMembers(CircularPlaceholderGenerator circularplaceholdergenerator)
    {
        supertype.injectMembers(circularplaceholdergenerator);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CircularPlaceholderGenerator)obj);
    }

    public ()
    {
        super("com.soundcloud.android.image.CircularPlaceholderGenerator", "members/com.soundcloud.android.image.CircularPlaceholderGenerator", false, com/soundcloud/android/image/CircularPlaceholderGenerator);
    }
}
