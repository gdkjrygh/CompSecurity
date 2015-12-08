// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEditEmailView

public final class I extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding lyftApi;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksEditEmailView, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/enterprise/WorkPerksEditEmailView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/enterprise/WorkPerksEditEmailView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/enterprise/WorkPerksEditEmailView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(lyftApi);
        set1.add(progressController);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksEditEmailView)obj);
    }

    public void injectMembers(WorkPerksEditEmailView workperkseditemailview)
    {
        workperkseditemailview.appFlow = (AppFlow)appFlow.get();
        workperkseditemailview.lyftApi = (ILyftApi)lyftApi.get();
        workperkseditemailview.progressController = (IProgressController)progressController.get();
        workperkseditemailview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksEditEmailView", false, me/lyft/android/ui/enterprise/WorkPerksEditEmailView);
    }
}
