// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpLegalView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding lyftPreferences;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/help/HelpLegalView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/help/HelpLegalView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((HelpLegalView)obj);
    }

    public void injectMembers(HelpLegalView helplegalview)
    {
        helplegalview.appFlow = (AppFlow)appFlow.get();
        helplegalview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.help.HelpLegalView", false, me/lyft/android/ui/help/HelpLegalView);
    }
}
