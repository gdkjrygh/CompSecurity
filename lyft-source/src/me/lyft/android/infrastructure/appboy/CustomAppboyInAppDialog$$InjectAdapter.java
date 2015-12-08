// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure.appboy:
//            CustomAppboyInAppDialog

public final class  extends Binding
    implements MembersInjector
{

    private Binding deepLinkManager;
    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/appboy/CustomAppboyInAppDialog, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/infrastructure/appboy/CustomAppboyInAppDialog, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/appboy/CustomAppboyInAppDialog, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/infrastructure/appboy/CustomAppboyInAppDialog, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(deepLinkManager);
        set1.add(imageLoader);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CustomAppboyInAppDialog)obj);
    }

    public void injectMembers(CustomAppboyInAppDialog customappboyinappdialog)
    {
        customappboyinappdialog.dialogFlow = (DialogFlow)dialogFlow.get();
        customappboyinappdialog.deepLinkManager = (DeepLinkManager)deepLinkManager.get();
        customappboyinappdialog.imageLoader = (ImageLoader)imageLoader.get();
        supertype.injectMembers(customappboyinappdialog);
    }

    public ()
    {
        super(null, "members/me.lyft.android.infrastructure.appboy.CustomAppboyInAppDialog", false, me/lyft/android/infrastructure/appboy/CustomAppboyInAppDialog);
    }
}
