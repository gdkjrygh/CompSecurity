// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.controls:
//            MenuButtonToolbar

public final class  extends Binding
    implements MembersInjector
{

    private Binding slideMenuController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/controls/MenuButtonToolbar, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.controls.Toolbar", me/lyft/android/controls/MenuButtonToolbar, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(slideMenuController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MenuButtonToolbar)obj);
    }

    public void injectMembers(MenuButtonToolbar menubuttontoolbar)
    {
        menubuttontoolbar.slideMenuController = (SlideMenuController)slideMenuController.get();
        supertype.injectMembers(menubuttontoolbar);
    }

    public ()
    {
        super(null, "members/me.lyft.android.controls.MenuButtonToolbar", false, me/lyft/android/controls/MenuButtonToolbar);
    }
}
