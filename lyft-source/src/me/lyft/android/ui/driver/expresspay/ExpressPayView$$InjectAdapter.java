// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayView, IExpressPayErrorHandler

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding expressPayErrorHandler;
    private Binding expressPayRepository;
    private Binding expressPayService;
    private Binding progressController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
        expressPayRepository = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayRepository", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
        expressPayService = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayService", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
        expressPayErrorHandler = linker.requestBinding("me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler", me/lyft/android/ui/driver/expresspay/ExpressPayView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(expressPayRepository);
        set1.add(expressPayService);
        set1.add(progressController);
        set1.add(expressPayErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ExpressPayView)obj);
    }

    public void injectMembers(ExpressPayView expresspayview)
    {
        expresspayview.appFlow = (AppFlow)appFlow.get();
        expresspayview.dialogFlow = (DialogFlow)dialogFlow.get();
        expresspayview.expressPayRepository = (IExpressPayRepository)expressPayRepository.get();
        expresspayview.expressPayService = (IExpressPayService)expressPayService.get();
        expresspayview.progressController = (IProgressController)progressController.get();
        expresspayview.expressPayErrorHandler = (IExpressPayErrorHandler)expressPayErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.expresspay.ExpressPayView", false, me/lyft/android/ui/driver/expresspay/ExpressPayView);
    }
}
