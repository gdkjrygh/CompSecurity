// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.development:
//            DevelopmentView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding appFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/development/DevelopmentView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/development/DevelopmentView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(activityController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DevelopmentView)obj);
    }

    public void injectMembers(DevelopmentView developmentview)
    {
        developmentview.appFlow = (AppFlow)appFlow.get();
        developmentview.activityController = (ActivityController)activityController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.development.DevelopmentView", false, me/lyft/android/ui/development/DevelopmentView);
    }
}
