// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            UploadModule, ImageUploadManager

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding imageUploadManager;
    private final UploadModule module;

    public final void attach(Linker linker)
    {
        imageUploadManager = linker.requestBinding("com.google.android.apps.wallet.wobs.upload.ImageUploadManager", com/google/android/apps/wallet/wobs/upload/UploadModule, getClass().getClassLoader());
    }

    public final LocalImageUriResolver get()
    {
        UploadModule uploadmodule = module;
        return UploadModule.getLocalImageUriUtil((ImageUploadManager)imageUploadManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageUploadManager);
    }

    public (UploadModule uploadmodule)
    {
        super("com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver", false, "com.google.android.apps.wallet.wobs.upload.UploadModule", "getLocalImageUriUtil");
        module = uploadmodule;
        setLibrary(true);
    }
}
