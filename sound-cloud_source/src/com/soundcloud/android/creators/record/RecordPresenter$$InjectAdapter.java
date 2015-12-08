// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.utils.ViewHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter, RecordingOperations, SoundRecorder

public final class  extends b
    implements a, Provider
{

    private b recorder;
    private b recordingOperations;
    private b supertype;
    private b viewHelper;

    public final void attach(l l1)
    {
        recordingOperations = l1.a("com.soundcloud.android.creators.record.RecordingOperations", com/soundcloud/android/creators/record/RecordPresenter, getClass().getClassLoader());
        viewHelper = l1.a("com.soundcloud.android.utils.ViewHelper", com/soundcloud/android/creators/record/RecordPresenter, getClass().getClassLoader());
        recorder = l1.a("com.soundcloud.android.creators.record.SoundRecorder", com/soundcloud/android/creators/record/RecordPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher", com/soundcloud/android/creators/record/RecordPresenter, getClass().getClassLoader(), false);
    }

    public final RecordPresenter get()
    {
        RecordPresenter recordpresenter = new RecordPresenter((RecordingOperations)recordingOperations.get(), (ViewHelper)viewHelper.get(), (SoundRecorder)recorder.get());
        injectMembers(recordpresenter);
        return recordpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(recordingOperations);
        set.add(viewHelper);
        set.add(recorder);
        set1.add(supertype);
    }

    public final void injectMembers(RecordPresenter recordpresenter)
    {
        supertype.injectMembers(recordpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecordPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.RecordPresenter", "members/com.soundcloud.android.creators.record.RecordPresenter", false, com/soundcloud/android/creators/record/RecordPresenter);
    }
}
