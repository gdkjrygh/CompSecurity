// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDriverStatsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.HorizontalCarouselView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driver.Card;
import me.lyft.android.domain.driver.DriverAchievements;
import me.lyft.android.domain.driver.DriverActivities;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.driver.DriverActivitiesView;
import me.lyft.android.ui.driver.ViewPagerTabLayout;
import me.lyft.android.ui.driver.achievements.card.AchievementCardView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver.achievements:
//            StatsPagerAdapter

public class DriverStatsView extends LinearLayout
    implements IHandleBack
{

    HorizontalCarouselView achievementCardCarouselView;
    AppFlow appFlow;
    IConstantsProvider constantsProvider;
    TextView dailyTabButton;
    IDefaultErrorHandler defaultErrorHandler;
    private String disclaimer;
    IDriverStatsProvider driverStatsProvider;
    private List footers;
    TextView statsDisclaimer;
    ViewPager statsPager;
    private StatsPagerAdapter statsPagerAdapter;
    TextView statsUnavailableBanner;
    ViewPagerTabLayout tabsLayout;
    Toolbar toolbar;
    IUserSession userSession;
    TextView weeklyTabButton;

    public DriverStatsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        footers = new ArrayList();
        Scoop.a(this).b(this);
        statsPagerAdapter = new StatsPagerAdapter(getContext());
    }

    private void addFooter(String s)
    {
        footers.add(s);
        if (footers.size() == 1 && statsDisclaimer != null)
        {
            TextView textview = statsDisclaimer;
            byte byte0;
            if (Strings.isNullOrEmpty(s))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textview.setVisibility(byte0);
            statsDisclaimer.setText(s);
        }
    }

    private void onDriverStatsLoaded(DriverAchievements driverachievements)
    {
        Iterator iterator = driverachievements.getActivities().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DriverActivities driveractivities = (DriverActivities)iterator.next();
            DriverActivitiesView driveractivitiesview = statsPagerAdapter.getStatsView(driveractivities.getType());
            if (driveractivitiesview != null)
            {
                driveractivitiesview.displayStats(driveractivities);
                setTabTitle(driveractivities);
            }
        } while (true);
        driverachievements = driverachievements.getCards();
        if (driverachievements.isEmpty())
        {
            achievementCardCarouselView.setVisibility(8);
        }
        Card card;
        for (driverachievements = driverachievements.iterator(); driverachievements.hasNext(); addFooter(Strings.nullOrEmptyToDefault(card.getFooter(), disclaimer)))
        {
            card = (Card)driverachievements.next();
            achievementCardCarouselView.addItem(AchievementCardView.create(card, getContext()));
        }

    }

    private void setTabTitle(DriverActivities driveractivities)
    {
        if (Strings.isNullOrEmpty(driveractivities.getTitle())) goto _L2; else goto _L1
_L1:
        class _cls3
        {

            static final int $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type = new int[me.lyft.android.domain.driver.DriverActivities.Type.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[me.lyft.android.domain.driver.DriverActivities.Type.DAILY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[me.lyft.android.domain.driver.DriverActivities.Type.WEEKLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.me.lyft.android.domain.driver.DriverActivities.Type[driveractivities.getType().ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 45
    //                   2 57;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        dailyTabButton.setText(driveractivities.getTitle());
        return;
_L4:
        weeklyTabButton.setText(driveractivities.getTitle());
        return;
    }

    protected void onAttachedToWindow()
    {
        byte byte0 = 0;
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        DriverAnalytics.trackDriverStatsShown();
        toolbar.setTitle(getResources().getString(0x7f07015c));
        statsPagerAdapter = new StatsPagerAdapter(getContext());
        statsPager.setAdapter(statsPagerAdapter);
        tabsLayout.setViewPager(statsPager);
        tabsLayout.selectTab(0);
        Object obj = Binder.attach(this);
        final AsyncActionAnalytics driverStatsRequestAnalytics = DriverAnalytics.createDriverStatsRequestAnalytics();
        driverStatsRequestAnalytics.trackRequest();
        ((Binder) (obj)).bind(driverStatsProvider.getDriverAchievements(userSession.getUser().getId()), new AsyncCall() {

            final DriverStatsView this$0;
            final AsyncActionAnalytics val$driverStatsRequestAnalytics;

            public void onFail(Throwable throwable)
            {
                driverStatsRequestAnalytics.trackResponseFailure(throwable);
                defaultErrorHandler.handle(throwable);
                onDriverStatsLoaded(DriverAchievements.empty());
                statsUnavailableBanner.setVisibility(0);
            }

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((DriverAchievements)obj1);
            }

            public void onSuccess(DriverAchievements driverachievements)
            {
                driverStatsRequestAnalytics.trackResponseSuccess();
                onDriverStatsLoaded(driverachievements);
            }

            
            {
                this$0 = DriverStatsView.this;
                driverStatsRequestAnalytics = asyncactionanalytics;
                super();
            }
        });
        ((Binder) (obj)).bind(achievementCardCarouselView.observeOnCarouselScrollToIndex(), new Action1() {

            final DriverStatsView this$0;

            public void call(Integer integer)
            {
                statsDisclaimer.setText((CharSequence)footers.get(integer.intValue()));
            }

            public volatile void call(Object obj1)
            {
                call((Integer)obj1);
            }

            
            {
                this$0 = DriverStatsView.this;
                super();
            }
        });
        disclaimer = constantsProvider.getConstants().getDriverStatsDisclaimer();
        obj = statsDisclaimer;
        if (Strings.isNullOrEmpty(disclaimer))
        {
            byte0 = 8;
        }
        ((TextView) (obj)).setVisibility(byte0);
        statsDisclaimer.setText(disclaimer);
    }

    public boolean onBack()
    {
        appFlow.goBack();
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        DriverAnalytics.trackDriverStatsDismiss();
        footers.clear();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }


}
