// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksVerifyEmailSelectScreenView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksVerifyEmailSelectScreenView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/enterprise/WorkPerksVerifyEmailSelectScreenView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksVerifyEmailSelectScreenView)obj);
    }

    public void injectMembers(WorkPerksVerifyEmailSelectScreenView workperksverifyemailselectscreenview)
    {
        workperksverifyemailselectscreenview.appFlow = (AppFlow)appFlow.get();
        workperksverifyemailselectscreenview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailSelectScreenView", false, me/lyft/android/ui/enterprise/WorkPerksVerifyEmailSelectScreenView);
    }
}
