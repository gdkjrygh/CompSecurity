// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.landing:
//            AppLoadingView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/landing/AppLoadingView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AppLoadingView)obj);
    }

    public void injectMembers(AppLoadingView apploadingview)
    {
        apploadingview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.AppLoadingView", false, me/lyft/android/ui/landing/AppLoadingView);
    }
}
