// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.record:
//            UploadActivity, RecordingOperations

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b navigator;
    private b operations;
    private b supertype;

    public final void attach(l l1)
    {
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/creators/record/UploadActivity, getClass().getClassLoader());
        operations = l1.a("com.soundcloud.android.creators.record.RecordingOperations", com/soundcloud/android/creators/record/UploadActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/creators/record/UploadActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/creators/record/UploadActivity, getClass().getClassLoader(), false);
    }

    public final UploadActivity get()
    {
        UploadActivity uploadactivity = new UploadActivity();
        injectMembers(uploadactivity);
        return uploadactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(baseLayoutHelper);
        set1.add(operations);
        set1.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(UploadActivity uploadactivity)
    {
        uploadactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        uploadactivity.operations = (RecordingOperations)operations.get();
        uploadactivity.navigator = (Navigator)navigator.get();
        supertype.injectMembers(uploadactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UploadActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.UploadActivity", "members/com.soundcloud.android.creators.record.UploadActivity", false, com/soundcloud/android/creators/record/UploadActivity);
    }
}
