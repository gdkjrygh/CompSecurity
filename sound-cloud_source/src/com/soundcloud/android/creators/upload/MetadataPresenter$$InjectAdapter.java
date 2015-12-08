// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.image.PlaceholderGenerator;
import com.soundcloud.android.utils.ViewHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            MetadataPresenter

public final class  extends b
    implements a, Provider
{

    private b placeholderGenerator;
    private b recorder;
    private b supertype;
    private b viewHelper;

    public final void attach(l l1)
    {
        recorder = l1.a("com.soundcloud.android.creators.record.SoundRecorder", com/soundcloud/android/creators/upload/MetadataPresenter, getClass().getClassLoader());
        placeholderGenerator = l1.a("com.soundcloud.android.image.PlaceholderGenerator", com/soundcloud/android/creators/upload/MetadataPresenter, getClass().getClassLoader());
        viewHelper = l1.a("com.soundcloud.android.utils.ViewHelper", com/soundcloud/android/creators/upload/MetadataPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher", com/soundcloud/android/creators/upload/MetadataPresenter, getClass().getClassLoader(), false);
    }

    public final MetadataPresenter get()
    {
        MetadataPresenter metadatapresenter = new MetadataPresenter((SoundRecorder)recorder.get(), (PlaceholderGenerator)placeholderGenerator.get(), (ViewHelper)viewHelper.get());
        injectMembers(metadatapresenter);
        return metadatapresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(recorder);
        set.add(placeholderGenerator);
        set.add(viewHelper);
        set1.add(supertype);
    }

    public final void injectMembers(MetadataPresenter metadatapresenter)
    {
        supertype.injectMembers(metadatapresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MetadataPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.upload.MetadataPresenter", "members/com.soundcloud.android.creators.upload.MetadataPresenter", false, com/soundcloud/android/creators/upload/MetadataPresenter);
    }
}
