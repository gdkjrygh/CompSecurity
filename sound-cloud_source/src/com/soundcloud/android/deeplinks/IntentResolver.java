// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ForegroundEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.rx.eventbus.EventBus;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            ReferrerResolver, DeepLink, ResolveOperations

public class IntentResolver
{

    private final AccountOperations accountOperations;
    private final EventBus eventBus;
    private final Navigator navigator;
    private final PlayQueueManager playQueueManager;
    private final PlaybackInitiator playbackInitiator;
    private final ReferrerResolver referrerResolver;
    private final ResolveOperations resolveOperations;
    private final ServiceInitiator serviceInitiator;

    IntentResolver(ResolveOperations resolveoperations, AccountOperations accountoperations, ServiceInitiator serviceinitiator, PlaybackInitiator playbackinitiator, PlayQueueManager playqueuemanager, ReferrerResolver referrerresolver, EventBus eventbus, 
            Navigator navigator1)
    {
        resolveOperations = resolveoperations;
        accountOperations = accountoperations;
        serviceInitiator = serviceinitiator;
        playbackInitiator = playbackinitiator;
        playQueueManager = playqueuemanager;
        referrerResolver = referrerresolver;
        eventBus = eventbus;
        navigator = navigator1;
    }

    private DefaultSubscriber fetchSubscriber(final Context context, final Uri uri, final Referrer referrer)
    {
        return new _cls1();
    }

    private Referrer getReferrer(Context context, Intent intent)
    {
        return referrerResolver.getReferrerFromIntent(intent, context.getResources());
    }

    private void handleDeepLink(Context context, Uri uri, DeepLink deeplink, Referrer referrer)
    {
        switch (_cls2..SwitchMap.com.soundcloud.android.deeplinks.DeepLink[deeplink.ordinal()])
        {
        default:
            resolve(context, uri, referrer);
            return;

        case 1: // '\001'
        case 2: // '\002'
            showHomeScreen(context, referrer);
            return;

        case 3: // '\003'
            showExploreScreen(context, referrer);
            return;

        case 4: // '\004'
            showRecordScreen(context, referrer);
            return;

        case 5: // '\005'
            showSearchScreen(context, uri, referrer);
            return;

        case 6: // '\006'
            startWebView(context, uri, referrer);
            break;
        }
    }

    private boolean isCrawler(Referrer referrer)
    {
        return Referrer.GOOGLE_CRAWLER.equals(referrer);
    }

    private void launchApplicationWithMessage(Context context, Referrer referrer, int i)
    {
        trackForegroundEvent(referrer);
        AndroidUtils.showToast(context, i, new Object[0]);
        navigator.openLauncher(context);
    }

    private void loginCrawler()
    {
        accountOperations.loginCrawlerUser();
        serviceInitiator.resetPlaybackService();
        playQueueManager.clearAll();
    }

    private void navigateToResource(Context context, PublicApiResource publicapiresource, Referrer referrer)
    {
        Urn urn = publicapiresource.getUrn();
        if (urn.isTrack())
        {
            DefaultSubscriber.fireAndForget(playbackInitiator.startPlayback((PublicApiTrack)publicapiresource, Screen.DEEPLINK, shouldLoadRelated(referrer)));
            navigator.openStreamWithExpandedPlayer(context, Screen.DEEPLINK);
            return;
        }
        if (urn.isUser())
        {
            navigator.openProfile(context, urn, Screen.DEEPLINK);
            return;
        }
        if (urn.isPlaylist())
        {
            navigator.openPlaylist(context, urn, Screen.DEEPLINK);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unrecognized resolved resource: ")).append(urn).toString());
        }
    }

    private void resolve(Context context, Uri uri, Referrer referrer)
    {
        resolveOperations.resolve(uri).observeOn(a.a()).subscribe(fetchSubscriber(context, uri, referrer));
    }

    private boolean shouldLoadRelated(Referrer referrer)
    {
        return !isCrawler(referrer);
    }

    private boolean shouldShowLogInMessage(DeepLink deeplink, Referrer referrer)
    {
        if (deeplink.requiresLoggedInUser() && !deeplink.requiresResolve())
        {
            if (isCrawler(referrer))
            {
                loginCrawler();
                return false;
            }
            if (!accountOperations.isUserLoggedIn())
            {
                return true;
            }
        }
        return false;
    }

    private void showExploreScreen(Context context, Referrer referrer)
    {
        trackForegroundEvent(referrer);
        navigator.openExplore(context, Screen.DEEPLINK);
    }

    private void showHomeScreen(Context context, Referrer referrer)
    {
        accountOperations.clearCrawler();
        trackForegroundEvent(referrer);
        navigator.openStream(context, Screen.DEEPLINK);
    }

    private void showOnboardingForUrn(Context context, Urn urn, Referrer referrer)
    {
        if (Urn.NOT_SET.equals(urn))
        {
            trackForegroundEvent(referrer);
        } else
        {
            trackForegroundEventForResource(urn, referrer);
        }
        AndroidUtils.showToast(context, 0x7f07012d, new Object[0]);
        navigator.openOnboarding(context, urn, Screen.DEEPLINK);
    }

    private void showRecordScreen(Context context, Referrer referrer)
    {
        trackForegroundEvent(referrer);
        navigator.openRecord(context, Screen.DEEPLINK);
    }

    private void showSearchScreen(Context context, Uri uri, Referrer referrer)
    {
        trackForegroundEvent(referrer);
        navigator.openLegacySearch(context, uri, Screen.DEEPLINK);
    }

    private void startActivityForResource(Context context, PublicApiResource publicapiresource, Referrer referrer)
    {
        Urn urn = publicapiresource.getUrn();
        if (isActionableResource(publicapiresource))
        {
            if (isCrawler(referrer))
            {
                loginCrawler();
            }
            if (accountOperations.isUserLoggedIn())
            {
                trackForegroundEventForResource(urn, referrer);
                navigateToResource(context, publicapiresource, referrer);
                return;
            } else
            {
                showOnboardingForUrn(context, urn, referrer);
                return;
            }
        } else
        {
            showHomeScreen(context, referrer);
            return;
        }
    }

    private void startWebView(Context context, Uri uri, Referrer referrer)
    {
        trackForegroundEvent(referrer);
        navigator.openWebView(context, uri);
    }

    private void trackForegroundEvent(Referrer referrer)
    {
        trackForegroundEvent(ForegroundEvent.open(Screen.DEEPLINK, referrer));
    }

    private void trackForegroundEvent(ForegroundEvent foregroundevent)
    {
        eventBus.publish(EventQueue.TRACKING, foregroundevent);
    }

    private void trackForegroundEventForResource(Urn urn, Referrer referrer)
    {
        trackForegroundEvent(ForegroundEvent.open(Screen.DEEPLINK, referrer, urn));
    }

    private Uri uriFromResolveException(Throwable throwable, Uri uri)
    {
        if (throwable instanceof rx.exceptions.OnErrorThrowable.OnNextValue)
        {
            throwable = ((Throwable) (((rx.exceptions.OnErrorThrowable.OnNextValue)throwable).getValue()));
            if (throwable instanceof Uri)
            {
                return (Uri)throwable;
            }
        }
        return uri;
    }

    public void handleIntent(Intent intent, Context context)
    {
        Uri uri = intent.getData();
        intent = getReferrer(context, intent);
        DeepLink deeplink = DeepLink.fromUri(uri);
        if (shouldShowLogInMessage(deeplink, intent))
        {
            showOnboardingForUrn(context, Urn.NOT_SET, intent);
            return;
        } else
        {
            handleDeepLink(context, uri, deeplink, intent);
            return;
        }
    }

    boolean isActionableResource(PublicApiResource publicapiresource)
    {
        publicapiresource = publicapiresource.getUrn();
        return publicapiresource.isTrack() || publicapiresource.isUser() || publicapiresource.isPlaylist();
    }





    private class _cls1 extends DefaultSubscriber
    {

        final IntentResolver this$0;
        final Context val$context;
        final Referrer val$referrer;
        final Uri val$uri;

        public void onError(Throwable throwable)
        {
            throwable = uriFromResolveException(throwable, uri);
            DeepLink deeplink = DeepLink.fromUri(throwable);
            if (DeepLink.WEB_VIEW.equals(deeplink))
            {
                startWebView(context, throwable, referrer);
                return;
            } else
            {
                launchApplicationWithMessage(context, referrer, 0x7f07012a);
                return;
            }
        }

        public void onNext(PublicApiResource publicapiresource)
        {
            startActivityForResource(context, publicapiresource, referrer);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PublicApiResource)obj);
        }

        _cls1()
        {
            this$0 = IntentResolver.this;
            context = context1;
            referrer = referrer1;
            uri = uri1;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[];

        static 
        {
            $SwitchMap$com$soundcloud$android$deeplinks$DeepLink = new int[DeepLink.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.HOME.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.STREAM.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.EXPLORE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.RECORD.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.SEARCH.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$deeplinks$DeepLink[DeepLink.WEB_VIEW.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
