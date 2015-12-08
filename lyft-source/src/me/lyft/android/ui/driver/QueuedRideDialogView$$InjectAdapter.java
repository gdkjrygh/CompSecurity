// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;

// Referenced classes of package me.lyft.android.ui.driver:
//            QueuedRideDialogView

public final class or extends Binding
    implements MembersInjector
{

    private Binding appForegroundDetector;
    private Binding dialogFlow;
    private Binding supertype;

    public void attach(Linker linker)
    {
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/ui/driver/QueuedRideDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/QueuedRideDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/QueuedRideDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appForegroundDetector);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((QueuedRideDialogView)obj);
    }

    public void injectMembers(QueuedRideDialogView queuedridedialogview)
    {
        queuedridedialogview.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        queuedridedialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(queuedridedialogview);
    }

    public or()
    {
        super(null, "members/me.lyft.android.ui.driver.QueuedRideDialogView", false, me/lyft/android/ui/driver/QueuedRideDialogView);
    }
}
