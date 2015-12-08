// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            ExpressPayAchievementCard

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding expressPayErrorHandler;
    private Binding expressPayService;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        expressPayService = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayService", me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard, getClass().getClassLoader());
        expressPayErrorHandler = linker.requestBinding("me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler", me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.driver.achievements.card.LightAchievementCardView", me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(expressPayService);
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(expressPayErrorHandler);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ExpressPayAchievementCard)obj);
    }

    public void injectMembers(ExpressPayAchievementCard expresspayachievementcard)
    {
        expresspayachievementcard.expressPayService = (IExpressPayService)expressPayService.get();
        expresspayachievementcard.appFlow = (AppFlow)appFlow.get();
        expresspayachievementcard.progressController = (IProgressController)progressController.get();
        expresspayachievementcard.expressPayErrorHandler = (IExpressPayErrorHandler)expressPayErrorHandler.get();
        supertype.injectMembers(expresspayachievementcard);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.achievements.card.ExpressPayAchievementCard", false, me/lyft/android/ui/driver/achievements/card/ExpressPayAchievementCard);
    }
}
