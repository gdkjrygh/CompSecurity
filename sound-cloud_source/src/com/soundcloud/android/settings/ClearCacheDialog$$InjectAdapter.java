// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.Context;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.waveform.WaveformOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            ClearCacheDialog

public final class  extends b
    implements a, Provider
{

    private b appContext;
    private b imageOperations;
    private b waveformOperations;

    public final void attach(l l1)
    {
        appContext = l1.a("android.content.Context", com/soundcloud/android/settings/ClearCacheDialog, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/settings/ClearCacheDialog, getClass().getClassLoader());
        waveformOperations = l1.a("com.soundcloud.android.waveform.WaveformOperations", com/soundcloud/android/settings/ClearCacheDialog, getClass().getClassLoader());
    }

    public final ClearCacheDialog get()
    {
        ClearCacheDialog clearcachedialog = new ClearCacheDialog();
        injectMembers(clearcachedialog);
        return clearcachedialog;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(appContext);
        set1.add(imageOperations);
        set1.add(waveformOperations);
    }

    public final void injectMembers(ClearCacheDialog clearcachedialog)
    {
        clearcachedialog.appContext = (Context)appContext.get();
        clearcachedialog.imageOperations = (ImageOperations)imageOperations.get();
        clearcachedialog.waveformOperations = (WaveformOperations)waveformOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ClearCacheDialog)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.ClearCacheDialog", "members/com.soundcloud.android.settings.ClearCacheDialog", false, com/soundcloud/android/settings/ClearCacheDialog);
    }
}
