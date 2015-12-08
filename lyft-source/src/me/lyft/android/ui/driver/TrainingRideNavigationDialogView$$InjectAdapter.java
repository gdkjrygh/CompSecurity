// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            TrainingRideNavigationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/TrainingRideNavigationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/TrainingRideNavigationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TrainingRideNavigationDialogView)obj);
    }

    public void injectMembers(TrainingRideNavigationDialogView trainingridenavigationdialogview)
    {
        trainingridenavigationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(trainingridenavigationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.TrainingRideNavigationDialogView", false, me/lyft/android/ui/driver/TrainingRideNavigationDialogView);
    }
}
