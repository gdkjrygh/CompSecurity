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
//            WorkPerksVerifyEmailView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksVerifyEmailView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksVerifyEmailView)obj);
    }

    public void injectMembers(WorkPerksVerifyEmailView workperksverifyemailview)
    {
        workperksverifyemailview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailView", false, me/lyft/android/ui/enterprise/WorkPerksVerifyEmailView);
    }
}
