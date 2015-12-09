// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManagerRegistry

public final class  extends Binding
    implements Provider
{

    private Binding keyValueStore;

    public final void attach(Linker linker)
    {
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=IMAGE_UPLOAD)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/wobs/upload/ImageUploadManagerRegistry, getClass().getClassLoader());
    }

    public final ImageUploadManagerRegistry get()
    {
        return new ImageUploadManagerRegistry((KeyValueStore)keyValueStore.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(keyValueStore);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.upload.ImageUploadManagerRegistry", "members/com.google.android.apps.wallet.wobs.upload.ImageUploadManagerRegistry", false, com/google/android/apps/wallet/wobs/upload/ImageUploadManagerRegistry);
    }
}
