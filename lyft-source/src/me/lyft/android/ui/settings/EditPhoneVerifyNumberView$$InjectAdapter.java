// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditPhoneVerifyNumberView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/settings/EditPhoneVerifyNumberView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/EditPhoneVerifyNumberView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditPhoneVerifyNumberView)obj);
    }

    public void injectMembers(EditPhoneVerifyNumberView editphoneverifynumberview)
    {
        editphoneverifynumberview.userProvider = (IUserProvider)userProvider.get();
        editphoneverifynumberview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.EditPhoneVerifyNumberView", false, me/lyft/android/ui/settings/EditPhoneVerifyNumberView);
    }
}
