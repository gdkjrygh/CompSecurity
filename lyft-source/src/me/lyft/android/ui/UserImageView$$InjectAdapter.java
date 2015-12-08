// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui:
//            UserImageView

public final class  extends Binding
    implements MembersInjector
{

    private Binding imageLoader;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/UserImageView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UserImageView)obj);
    }

    public void injectMembers(UserImageView userimageview)
    {
        userimageview.imageLoader = (ImageLoader)imageLoader.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.UserImageView", false, me/lyft/android/ui/UserImageView);
    }
}
