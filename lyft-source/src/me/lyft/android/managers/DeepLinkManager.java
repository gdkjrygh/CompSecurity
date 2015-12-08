// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.managers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.jobs.ConfigureProxyJob;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.jobs.LoadAppInfoJob;
import me.lyft.android.jobs.RideRequestSessionUpdateJob;

public class DeepLinkManager
{

    private final AppFlow appFlow;
    private final DialogFlow dialogFlow;
    private boolean followDeepLinkAfterSignIn;
    private final JobManager jobManager;
    private DeepLink lastDeepLink;
    private final ProfileFlow profileFlow;
    private final IUserSession userSession;

    public DeepLinkManager(AppFlow appflow, IUserSession iusersession, JobManager jobmanager, ProfileFlow profileflow, DialogFlow dialogflow)
    {
        followDeepLinkAfterSignIn = true;
        appFlow = appflow;
        userSession = iusersession;
        jobManager = jobmanager;
        profileFlow = profileflow;
        dialogFlow = dialogflow;
    }

    private void handleRideTypesDeeplink(DeepLink deeplink)
    {
        String s = deeplink.getParam("id");
        me.lyft.android.domain.location.Location location = GoogleLocationMapper.fromDeepLink(deeplink.getParam("pickup[latitude]"), deeplink.getParam("pickup[longitude]"));
        deeplink = GoogleLocationMapper.fromDeepLink(deeplink.getParam("destination[latitude]"), deeplink.getParam("destination[longitude]"));
        jobManager.queueBackgroundJob(new RideRequestSessionUpdateJob(location, deeplink, s));
    }

    private static boolean isSupportedDeepLink(DeepLink deeplink)
    {
        deeplink = deeplink.getAction();
        return deeplink != null && (deeplink.equalsIgnoreCase("payment") || deeplink.equalsIgnoreCase("concur") || deeplink.equalsIgnoreCase("help") || deeplink.equalsIgnoreCase("drivemode") || deeplink.equalsIgnoreCase("profile") || deeplink.equalsIgnoreCase("editprofile") || deeplink.equalsIgnoreCase("settings") || deeplink.equalsIgnoreCase("drive") || deeplink.equalsIgnoreCase("referral") || deeplink.equalsIgnoreCase("workperks") || deeplink.equalsIgnoreCase("ridetype") || deeplink.equalsIgnoreCase("proxy") || deeplink.equalsIgnoreCase("note") || deeplink.equalsIgnoreCase("driver_stats") || deeplink.startsWith("app-walkthrough") || deeplink.equalsIgnoreCase("ride_screen") || deeplink.equalsIgnoreCase("split_payment") || deeplink.equalsIgnoreCase("share_route"));
    }

    private boolean route(DeepLink deeplink)
    {
        boolean flag = false;
        String s = deeplink.getAction();
        if (s.equalsIgnoreCase("payment"))
        {
            deeplink = deeplink.getParam("credits");
            if (Strings.isNullOrEmpty(deeplink))
            {
                appFlow.resetToParent(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreen());
            } else
            {
                followDeepLinkAfterSignIn = false;
                appFlow.resetToParent(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreen(deeplink));
            }
            flag = true;
        } else
        {
            if (s.equalsIgnoreCase("concur"))
            {
                deeplink = deeplink.getParam("enabled");
                appFlow.resetToParent(new me.lyft.android.ui.payment.PaymentScreens.ConcurSendRideReceiptsScreen(Boolean.parseBoolean(deeplink)));
                return true;
            }
            if (s.equalsIgnoreCase("help"))
            {
                appFlow.resetToParent(new me.lyft.android.ui.help.HelpScreens.HelpScreen());
                return true;
            }
            if (s.equalsIgnoreCase("profile"))
            {
                profileFlow.openMyProfile();
                return true;
            }
            if (s.equalsIgnoreCase("editprofile"))
            {
                appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.EditProfileScreen());
                return true;
            }
            if (s.equalsIgnoreCase("settings"))
            {
                appFlow.resetToParent(new me.lyft.android.ui.settings.SettingsScreens.SettingsScreen());
                return true;
            }
            if (s.equalsIgnoreCase("referral"))
            {
                appFlow.resetToParent(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
                return true;
            }
            if (s.equalsIgnoreCase("workperks"))
            {
                appFlow.goTo(new me.lyft.android.ui.enterprise.EnterpriseScreens.WorkPerksMainScreen());
                return true;
            }
            if (s.equalsIgnoreCase("ridetype"))
            {
                handleRideTypesDeeplink(deeplink);
                return true;
            }
            if (s.equalsIgnoreCase("note"))
            {
                deeplink = deeplink.getParam("url");
                appFlow.resetTo((new me.lyft.android.ui.MainScreens.RideScreen()).setWebDialogUrl(deeplink));
                return true;
            }
            if (s.equalsIgnoreCase("proxy"))
            {
                jobManager.queueImmediateJob(new ConfigureProxyJob(deeplink.getParam("ip")));
                return false;
            }
            if (s.equalsIgnoreCase("drivemode") || s.equalsIgnoreCase("drive"))
            {
                deeplink = new me.lyft.android.ui.MainScreens.RideScreen();
                deeplink.enableSwitchToDriverMode();
                appFlow.resetTo(deeplink);
                return true;
            }
            if (s.equalsIgnoreCase("driver_stats"))
            {
                if (((Boolean)Objects.firstNonNull(userSession.getUser().isApprovedDriver(), Boolean.valueOf(false))).booleanValue())
                {
                    appFlow.goTo(new me.lyft.android.ui.driver.DriverScreens.DriverStatsScreen());
                }
                return true;
            }
            if (s.startsWith("app-walkthrough"))
            {
                appFlow.resetTo(new me.lyft.android.ui.settings.SettingsScreens.TrainingRideStartScreen());
                return true;
            }
            if (s.equalsIgnoreCase("ride_screen"))
            {
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                return true;
            }
            if (s.equalsIgnoreCase("split_payment"))
            {
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                appFlow.goTo(new me.lyft.android.ui.splitfare.SplitScreens.InviteToSplitScreen());
                return true;
            }
            if (s.equalsIgnoreCase("share_route"))
            {
                deeplink = new me.lyft.android.ui.passenger.PassengerDialogs.PassengerRideOverflowMenuScreen();
                deeplink.shareRoute();
                dialogFlow.show(deeplink);
                return true;
            }
        }
        return flag;
    }

    public boolean isSupportedDeepLink(String s)
    {
        return isSupportedDeepLink(new DeepLink(Uri.parse(s)));
    }

    public void route(Uri uri)
    {
        route(new DeepLink(uri));
    }

    public void route(String s)
    {
        route(Uri.parse(s));
    }

    public boolean tryHandleDeepAfterAuthorized()
    {
        boolean flag = false;
        boolean flag1 = false;
        if (lastDeepLink != null)
        {
            if (lastDeepLink.getAction().equalsIgnoreCase("payment") && !Strings.isNullOrEmpty(lastDeepLink.getParam("credits")))
            {
                jobManager.queueImmediateJob(new LoadAppInfoJob(lastDeepLink.getUri().toString()));
                flag = flag1;
            } else
            {
                flag = route(lastDeepLink);
            }
            lastDeepLink = null;
        }
        return flag;
    }

    public void tryHandleDeepLink(Activity activity)
    {
        Uri uri;
        boolean flag;
label0:
        {
            Intent intent = activity.getIntent();
            if (intent.getData() != null)
            {
                uri = intent.getData();
                intent.setData(null);
                activity.setIntent(intent);
                lastDeepLink = new DeepLink(uri);
                flag = isSupportedDeepLink(lastDeepLink);
                if (userSession.getUser().isNull())
                {
                    break label0;
                }
                boolean flag1 = route(lastDeepLink);
                lastDeepLink = null;
                AppAnalytics.trackDeepLinkLaunched(uri.toString(), flag1, flag);
            }
            return;
        }
        if (!followDeepLinkAfterSignIn)
        {
            jobManager.queueImmediateJob(new LoadAppInfoJob(uri.toString()));
            lastDeepLink = null;
        }
        AppAnalytics.trackDeepLinkLaunched(uri.toString(), false, flag);
    }

    private class DeepLink
    {

        final String action;
        final Map params;
        final Uri uri;

        public String getAction()
        {
            return action;
        }

        public String getParam(String s)
        {
            return (String)params.get(s);
        }

        public Uri getUri()
        {
            return uri;
        }

        public DeepLink(Uri uri1)
        {
            uri = uri1;
            action = uri1.getHost();
            params = UriParser.parseParams(uri1.toString());
        }
    }

}
