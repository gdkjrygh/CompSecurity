// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            UserItemRenderer

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b numberFormatter;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/view/adapters/UserItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/view/adapters/UserItemRenderer, getClass().getClassLoader());
    }

    public final UserItemRenderer get()
    {
        return new UserItemRenderer((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(numberFormatter);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.UserItemRenderer", "members/com.soundcloud.android.view.adapters.UserItemRenderer", false, com/soundcloud/android/view/adapters/UserItemRenderer);
    }
}
