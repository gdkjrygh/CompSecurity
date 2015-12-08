// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import com.soundcloud.android.api.ApiUrlBuilder;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations, PlaceholderGenerator, CircularPlaceholderGenerator, ImageProcessor

public final class ctory extends b
    implements Provider
{

    private b adapterFactory;
    private b bitmapAdapterFactory;
    private b circularPlaceholderGenerator;
    private b imageProcessor;
    private b placeholderGenerator;
    private b urlBuilder;

    public final void attach(l l1)
    {
        urlBuilder = l1.a("com.soundcloud.android.api.ApiUrlBuilder", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
        placeholderGenerator = l1.a("com.soundcloud.android.image.PlaceholderGenerator", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
        circularPlaceholderGenerator = l1.a("com.soundcloud.android.image.CircularPlaceholderGenerator", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
        adapterFactory = l1.a("com.soundcloud.android.image.FallbackBitmapLoadingAdapter$Factory", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
        bitmapAdapterFactory = l1.a("com.soundcloud.android.image.BitmapLoadingAdapter$Factory", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
        imageProcessor = l1.a("com.soundcloud.android.image.ImageProcessor", com/soundcloud/android/image/ImageOperations, getClass().getClassLoader());
    }

    public final ImageOperations get()
    {
        return new ImageOperations((ApiUrlBuilder)urlBuilder.get(), (PlaceholderGenerator)placeholderGenerator.get(), (CircularPlaceholderGenerator)circularPlaceholderGenerator.get(), (ctory)adapterFactory.get(), (adapterFactory)bitmapAdapterFactory.get(), (ImageProcessor)imageProcessor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(urlBuilder);
        set.add(placeholderGenerator);
        set.add(circularPlaceholderGenerator);
        set.add(adapterFactory);
        set.add(bitmapAdapterFactory);
        set.add(imageProcessor);
    }

    public ctory()
    {
        super("com.soundcloud.android.image.ImageOperations", "members/com.soundcloud.android.image.ImageOperations", true, com/soundcloud/android/image/ImageOperations);
    }
}
