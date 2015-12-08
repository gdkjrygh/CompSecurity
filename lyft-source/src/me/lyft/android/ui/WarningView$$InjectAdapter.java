// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.ui:
//            WarningView

public final class  extends Binding
    implements MembersInjector
{

    private Binding device;
    private Binding userSession;

    public void attach(Linker linker)
    {
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/WarningView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/WarningView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(device);
        set1.add(userSession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WarningView)obj);
    }

    public void injectMembers(WarningView warningview)
    {
        warningview.device = (IDevice)device.get();
        warningview.userSession = (IUserSession)userSession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.WarningView", false, me/lyft/android/ui/WarningView);
    }
}
