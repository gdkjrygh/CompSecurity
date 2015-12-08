// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksVerifyEmailScreenView

public final class Q extends Binding
    implements MembersInjector
{

    private Binding appFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksVerifyEmailScreenView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksVerifyEmailScreenView)obj);
    }

    public void injectMembers(WorkPerksVerifyEmailScreenView workperksverifyemailscreenview)
    {
        workperksverifyemailscreenview.appFlow = (AppFlow)appFlow.get();
    }

    public Q()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailScreenView", false, me/lyft/android/ui/enterprise/WorkPerksVerifyEmailScreenView);
    }
}
