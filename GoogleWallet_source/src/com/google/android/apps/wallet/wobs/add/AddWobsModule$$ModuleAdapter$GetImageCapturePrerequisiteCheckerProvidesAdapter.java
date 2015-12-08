// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.pm.PackageManager;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            AddWobsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AddWobsModule module;
    private Binding packageManager;

    public final void attach(Linker linker)
    {
        packageManager = linker.requestBinding("android.content.pm.PackageManager", com/google/android/apps/wallet/wobs/add/AddWobsModule, getClass().getClassLoader());
    }

    public final ImageCapturePrerequisiteChecker get()
    {
        AddWobsModule addwobsmodule = module;
        return AddWobsModule.getImageCapturePrerequisiteChecker((PackageManager)packageManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(packageManager);
    }

    public (AddWobsModule addwobsmodule)
    {
        super("com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker", false, "com.google.android.apps.wallet.wobs.add.AddWobsModule", "getImageCapturePrerequisiteChecker");
        module = addwobsmodule;
        setLibrary(true);
    }
}
