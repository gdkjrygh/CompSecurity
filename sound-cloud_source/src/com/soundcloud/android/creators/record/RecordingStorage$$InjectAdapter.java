// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordingStorage, AudioDurationHelper

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b durationHelper;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/creators/record/RecordingStorage, getClass().getClassLoader());
        durationHelper = l1.a("com.soundcloud.android.creators.record.AudioDurationHelper", com/soundcloud/android/creators/record/RecordingStorage, getClass().getClassLoader());
    }

    public final RecordingStorage get()
    {
        return new RecordingStorage((AccountOperations)accountOperations.get(), (AudioDurationHelper)durationHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountOperations);
        set.add(durationHelper);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.RecordingStorage", "members/com.soundcloud.android.creators.record.RecordingStorage", false, com/soundcloud/android/creators/record/RecordingStorage);
    }
}
