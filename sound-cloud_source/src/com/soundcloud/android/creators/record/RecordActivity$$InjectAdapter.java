// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordActivity, SoundRecorder

public final class  extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b baseLayoutHelper;
    private b eventBus;
    private b navigator;
    private b recorder;
    private b supertype;

    public final void attach(l l1)
    {
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader());
        recorder = l1.a("com.soundcloud.android.creators.record.SoundRecorder", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/creators/record/RecordActivity, getClass().getClassLoader(), false);
    }

    public final RecordActivity get()
    {
        RecordActivity recordactivity = new RecordActivity();
        injectMembers(recordactivity);
        return recordactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(actionBarHelper);
        set1.add(baseLayoutHelper);
        set1.add(eventBus);
        set1.add(recorder);
        set1.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(RecordActivity recordactivity)
    {
        recordactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        recordactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        recordactivity.eventBus = (EventBus)eventBus.get();
        recordactivity.recorder = (SoundRecorder)recorder.get();
        recordactivity.navigator = (Navigator)navigator.get();
        supertype.injectMembers(recordactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecordActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.RecordActivity", "members/com.soundcloud.android.creators.record.RecordActivity", false, com/soundcloud/android/creators/record/RecordActivity);
    }
}
