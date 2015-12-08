// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayPayoutSucceededDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/expresspay/ExpressPayPayoutSucceededDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/expresspay/ExpressPayPayoutSucceededDialogView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ExpressPayPayoutSucceededDialogView)obj);
    }

    public void injectMembers(ExpressPayPayoutSucceededDialogView expresspaypayoutsucceededdialogview)
    {
        expresspaypayoutsucceededdialogview.appFlow = (AppFlow)appFlow.get();
        expresspaypayoutsucceededdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.expresspay.ExpressPayPayoutSucceededDialogView", false, me/lyft/android/ui/driver/expresspay/ExpressPayPayoutSucceededDialogView);
    }
}
