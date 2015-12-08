// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.managers;

import com.squareup.picasso.Picasso;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.managers:
//            ImageLoader

public final class _cls9 extends Binding
    implements Provider
{

    private Binding picasso;

    public void attach(Linker linker)
    {
        picasso = linker.requestBinding("com.squareup.picasso.Picasso", me/lyft/android/managers/ImageLoader, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ImageLoader get()
    {
        return new ImageLoader((Picasso)picasso.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(picasso);
    }

    public _cls9()
    {
        super("me.lyft.android.managers.ImageLoader", "members/me.lyft.android.managers.ImageLoader", true, me/lyft/android/managers/ImageLoader);
    }
}
