// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperationsController, ImageOperations

public final class  extends b
    implements a, Provider
{

    private b imageOperations;
    private b supertype;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/image/ImageOperationsController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/image/ImageOperationsController, getClass().getClassLoader(), false);
    }

    public final ImageOperationsController get()
    {
        ImageOperationsController imageoperationscontroller = new ImageOperationsController((ImageOperations)imageOperations.get());
        injectMembers(imageoperationscontroller);
        return imageoperationscontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set1.add(supertype);
    }

    public final void injectMembers(ImageOperationsController imageoperationscontroller)
    {
        supertype.injectMembers(imageoperationscontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ImageOperationsController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.image.ImageOperationsController", "members/com.soundcloud.android.image.ImageOperationsController", false, com/soundcloud/android/image/ImageOperationsController);
    }
}
