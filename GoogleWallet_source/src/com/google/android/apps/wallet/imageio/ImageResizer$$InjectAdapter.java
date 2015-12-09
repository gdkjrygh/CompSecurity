// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.libraries.imageurl.FifeImageUrlUtil;
import com.google.android.libraries.imageurl.MapsStaticImageUrlUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            ImageResizer

public final class  extends Binding
    implements Provider
{

    private Binding gservicesWrapper;
    private Binding imageUrlUtil;
    private Binding mapsImageUrlUtil;

    public final void attach(Linker linker)
    {
        gservicesWrapper = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/imageio/ImageResizer, getClass().getClassLoader());
        imageUrlUtil = linker.requestBinding("com.google.android.libraries.imageurl.FifeImageUrlUtil", com/google/android/apps/wallet/imageio/ImageResizer, getClass().getClassLoader());
        mapsImageUrlUtil = linker.requestBinding("com.google.android.libraries.imageurl.MapsStaticImageUrlUtil", com/google/android/apps/wallet/imageio/ImageResizer, getClass().getClassLoader());
    }

    public final ImageResizer get()
    {
        return new ImageResizer((GservicesWrapper)gservicesWrapper.get(), (FifeImageUrlUtil)imageUrlUtil.get(), (MapsStaticImageUrlUtil)mapsImageUrlUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(gservicesWrapper);
        set.add(imageUrlUtil);
        set.add(mapsImageUrlUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.imageio.ImageResizer", "members/com.google.android.apps.wallet.imageio.ImageResizer", true, com/google/android/apps/wallet/imageio/ImageResizer);
    }
}
