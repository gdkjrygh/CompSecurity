// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.app.Application;
import com.google.android.libraries.uploader.service.lib.service.Uploader;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            UploadModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final UploadModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/wobs/upload/UploadModule, getClass().getClassLoader());
    }

    public final Uploader get()
    {
        UploadModule uploadmodule = module;
        return UploadModule.getUploader((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (UploadModule uploadmodule)
    {
        super("com.google.android.libraries.uploader.service.lib.service.Uploader", false, "com.google.android.apps.wallet.wobs.upload.UploadModule", "getUploader");
        module = uploadmodule;
        setLibrary(true);
    }
}
