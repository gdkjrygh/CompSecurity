// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            MetadataFragment, MetadataPresenter

public final class  extends b
    implements a, Provider
{

    private b metadataPresenter;
    private b supertype;

    public final void attach(l l1)
    {
        metadataPresenter = l1.a("com.soundcloud.android.creators.upload.MetadataPresenter", com/soundcloud/android/creators/upload/MetadataFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/creators/upload/MetadataFragment, getClass().getClassLoader(), false);
    }

    public final MetadataFragment get()
    {
        MetadataFragment metadatafragment = new MetadataFragment();
        injectMembers(metadatafragment);
        return metadatafragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(metadataPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(MetadataFragment metadatafragment)
    {
        metadatafragment.metadataPresenter = (MetadataPresenter)metadataPresenter.get();
        supertype.injectMembers(metadatafragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MetadataFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.upload.MetadataFragment", "members/com.soundcloud.android.creators.upload.MetadataFragment", false, com/soundcloud/android/creators/upload/MetadataFragment);
    }
}
