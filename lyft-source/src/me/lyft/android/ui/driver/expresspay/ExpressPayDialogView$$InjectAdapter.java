// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding signUrlService;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/expresspay/ExpressPayDialogView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/expresspay/ExpressPayDialogView, getClass().getClassLoader());
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/driver/expresspay/ExpressPayDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/expresspay/ExpressPayDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(signUrlService);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ExpressPayDialogView)obj);
    }

    public void injectMembers(ExpressPayDialogView expresspaydialogview)
    {
        expresspaydialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        expresspaydialogview.appFlow = (AppFlow)appFlow.get();
        expresspaydialogview.signUrlService = (ISignUrlService)signUrlService.get();
        supertype.injectMembers(expresspaydialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.expresspay.ExpressPayDialogView", false, me/lyft/android/ui/driver/expresspay/ExpressPayDialogView);
    }
}
