// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            PicassoRequestTransformer, ImageResizer

public final class  extends Binding
    implements Provider
{

    private Binding authoritiesRequiringAuth;
    private Binding localImageUriResolver;
    private Binding resizer;

    public final void attach(Linker linker)
    {
        resizer = linker.requestBinding("com.google.android.apps.wallet.imageio.ImageResizer", com/google/android/apps/wallet/imageio/PicassoRequestTransformer, getClass().getClassLoader());
        localImageUriResolver = linker.requestBinding("com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver", com/google/android/apps/wallet/imageio/PicassoRequestTransformer, getClass().getClassLoader());
        authoritiesRequiringAuth = linker.requestBinding("@com.google.android.apps.wallet.imageio.BindingAnnotations$AuthoritiesRequiringAuth()/java.util.Set<java.lang.String>", com/google/android/apps/wallet/imageio/PicassoRequestTransformer, getClass().getClassLoader());
    }

    public final PicassoRequestTransformer get()
    {
        return new PicassoRequestTransformer((ImageResizer)resizer.get(), (LocalImageUriResolver)localImageUriResolver.get(), (Set)authoritiesRequiringAuth.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resizer);
        set.add(localImageUriResolver);
        set.add(authoritiesRequiringAuth);
    }

    public ()
    {
        super("com.google.android.apps.wallet.imageio.PicassoRequestTransformer", "members/com.google.android.apps.wallet.imageio.PicassoRequestTransformer", false, com/google/android/apps/wallet/imageio/PicassoRequestTransformer);
    }
}
