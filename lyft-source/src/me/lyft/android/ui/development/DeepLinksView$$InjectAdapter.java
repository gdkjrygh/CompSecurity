// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android.ui.development:
//            DeepLinksView

public final class A extends Binding
    implements MembersInjector
{

    private Binding deepLinkManager;

    public void attach(Linker linker)
    {
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/ui/development/DeepLinksView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(deepLinkManager);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DeepLinksView)obj);
    }

    public void injectMembers(DeepLinksView deeplinksview)
    {
        deeplinksview.deepLinkManager = (DeepLinkManager)deepLinkManager.get();
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.development.DeepLinksView", false, me/lyft/android/ui/development/DeepLinksView);
    }
}
