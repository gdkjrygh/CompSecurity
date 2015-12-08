// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import com.soundcloud.android.image.ImageOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view:
//            ListViewController, EmptyViewController

public final class  extends b
    implements a, Provider
{

    private b emptyViewController;
    private b imageOperations;
    private b supertype;

    public final void attach(l l1)
    {
        emptyViewController = l1.a("com.soundcloud.android.view.EmptyViewController", com/soundcloud/android/view/ListViewController, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/view/ListViewController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/view/ListViewController, getClass().getClassLoader(), false);
    }

    public final ListViewController get()
    {
        ListViewController listviewcontroller = new ListViewController((EmptyViewController)emptyViewController.get(), (ImageOperations)imageOperations.get());
        injectMembers(listviewcontroller);
        return listviewcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(emptyViewController);
        set.add(imageOperations);
        set1.add(supertype);
    }

    public final void injectMembers(ListViewController listviewcontroller)
    {
        supertype.injectMembers(listviewcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ListViewController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.ListViewController", "members/com.soundcloud.android.view.ListViewController", false, com/soundcloud/android/view/ListViewController);
    }
}
