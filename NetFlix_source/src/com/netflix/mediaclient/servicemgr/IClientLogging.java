// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.service.logging.client.model.DataContext;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AdvertiserIdLogging, ApplicationPerformanceMetricsLogging, BreadcrumbLogging, CmpEventLogging, 
//            CustomerEventLogging, ErrorLogging, PresentationTracking

public interface IClientLogging
{
    public static final class AssetType extends Enum
    {

        private static final AssetType $VALUES[];
        public static final AssetType bif;
        public static final AssetType boxArt;
        public static final AssetType heroImage;
        public static final AssetType merchStill;
        public static final AssetType profileAvatar;

        public static AssetType valueOf(String s)
        {
            return (AssetType)Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$AssetType, s);
        }

        public static AssetType[] values()
        {
            return (AssetType[])$VALUES.clone();
        }

        static 
        {
            boxArt = new AssetType("boxArt", 0);
            merchStill = new AssetType("merchStill", 1);
            bif = new AssetType("bif", 2);
            heroImage = new AssetType("heroImage", 3);
            profileAvatar = new AssetType("profileAvatar", 4);
            $VALUES = (new AssetType[] {
                boxArt, merchStill, bif, heroImage, profileAvatar
            });
        }

        private AssetType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class CompletionReason extends Enum
    {

        private static final CompletionReason $VALUES[];
        public static final CompletionReason canceled;
        public static final CompletionReason failed;
        public static final CompletionReason success;

        public static CompletionReason valueOf(String s)
        {
            return (CompletionReason)Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$CompletionReason, s);
        }

        public static CompletionReason[] values()
        {
            return (CompletionReason[])$VALUES.clone();
        }

        static 
        {
            success = new CompletionReason("success", 0);
            canceled = new CompletionReason("canceled", 1);
            failed = new CompletionReason("failed", 2);
            $VALUES = (new CompletionReason[] {
                success, canceled, failed
            });
        }

        private CompletionReason(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ModalView extends Enum
    {

        private static final ModalView $VALUES[];
        public static final ModalView appLoading;
        public static final ModalView audioSubtitlesSelector;
        public static final ModalView badPayment;
        public static final ModalView bob;
        public static final ModalView browseTitles;
        public static final ModalView characterDetails;
        public static final ModalView customerService;
        public static final ModalView emailConfirmation;
        public static final ModalView episodesSelector;
        public static final ModalView errorDialog;
        public static final ModalView facebook;
        public static final ModalView homeScreen;
        public static final ModalView jfkGate;
        public static final ModalView legalTerms;
        public static final ModalView login;
        public static final ModalView logout;
        public static final ModalView maxStreamsReached;
        public static final ModalView mdxPlayback;
        public static final ModalView movieDetails;
        public static final ModalView nmLanding;
        public static final ModalView offerDetails;
        public static final ModalView openSourceLicenses;
        public static final ModalView orderConfirmation;
        public static final ModalView originalDetails;
        public static final ModalView payment;
        public static final ModalView playback;
        public static final ModalView playbackControls;
        public static final ModalView postPlay;
        public static final ModalView prePlayback;
        public static final ModalView privacyPolicy;
        public static final ModalView profilesGate;
        public static final ModalView registration;
        public static final ModalView search;
        public static final ModalView searchResults;
        public static final ModalView seasonsSelector;
        public static final ModalView settings;
        public static final ModalView signupPrompt;
        public static final ModalView trickplay;
        public static final ModalView upgradeStreamsError;
        public static final ModalView upgradeStreamsPitch;
        public static final ModalView upgradeStreamsPrompt;

        public static ModalView valueOf(String s)
        {
            return (ModalView)Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$ModalView, s);
        }

        public static ModalView[] values()
        {
            return (ModalView[])$VALUES.clone();
        }

        static 
        {
            appLoading = new ModalView("appLoading", 0);
            nmLanding = new ModalView("nmLanding", 1);
            signupPrompt = new ModalView("signupPrompt", 2);
            registration = new ModalView("registration", 3);
            emailConfirmation = new ModalView("emailConfirmation", 4);
            login = new ModalView("login", 5);
            privacyPolicy = new ModalView("privacyPolicy", 6);
            offerDetails = new ModalView("offerDetails", 7);
            payment = new ModalView("payment", 8);
            badPayment = new ModalView("badPayment", 9);
            legalTerms = new ModalView("legalTerms", 10);
            orderConfirmation = new ModalView("orderConfirmation", 11);
            profilesGate = new ModalView("profilesGate", 12);
            jfkGate = new ModalView("jfkGate", 13);
            homeScreen = new ModalView("homeScreen", 14);
            bob = new ModalView("bob", 15);
            movieDetails = new ModalView("movieDetails", 16);
            browseTitles = new ModalView("browseTitles", 17);
            originalDetails = new ModalView("originalDetails", 18);
            audioSubtitlesSelector = new ModalView("audioSubtitlesSelector", 19);
            characterDetails = new ModalView("characterDetails", 20);
            seasonsSelector = new ModalView("seasonsSelector", 21);
            episodesSelector = new ModalView("episodesSelector", 22);
            search = new ModalView("search", 23);
            searchResults = new ModalView("searchResults", 24);
            prePlayback = new ModalView("prePlayback", 25);
            playback = new ModalView("playback", 26);
            playbackControls = new ModalView("playbackControls", 27);
            trickplay = new ModalView("trickplay", 28);
            postPlay = new ModalView("postPlay", 29);
            customerService = new ModalView("customerService", 30);
            logout = new ModalView("logout", 31);
            errorDialog = new ModalView("errorDialog", 32);
            upgradeStreamsPitch = new ModalView("upgradeStreamsPitch", 33);
            upgradeStreamsPrompt = new ModalView("upgradeStreamsPrompt", 34);
            upgradeStreamsError = new ModalView("upgradeStreamsError", 35);
            maxStreamsReached = new ModalView("maxStreamsReached", 36);
            mdxPlayback = new ModalView("mdxPlayback", 37);
            openSourceLicenses = new ModalView("openSourceLicenses", 38);
            settings = new ModalView("settings", 39);
            facebook = new ModalView("facebook", 40);
            $VALUES = (new ModalView[] {
                appLoading, nmLanding, signupPrompt, registration, emailConfirmation, login, privacyPolicy, offerDetails, payment, badPayment, 
                legalTerms, orderConfirmation, profilesGate, jfkGate, homeScreen, bob, movieDetails, browseTitles, originalDetails, audioSubtitlesSelector, 
                characterDetails, seasonsSelector, episodesSelector, search, searchResults, prePlayback, playback, playbackControls, trickplay, postPlay, 
                customerService, logout, errorDialog, upgradeStreamsPitch, upgradeStreamsPrompt, upgradeStreamsError, maxStreamsReached, mdxPlayback, openSourceLicenses, settings, 
                facebook
            });
        }

        private ModalView(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String APM_LOGGING_REQUEST_DELIVERY_STATUS = "com.netflix.mediaclient.intent.action.APM_LOGGING_REQUEST_DELIVERY_STATUS";
    public static final String CATEGORY_NFLOGGING = "com.netflix.mediaclient.intent.category.LOGGING";
    public static final String EXTRA_DELIVERED = "delivered";
    public static final String EXTRA_FLUSH = "flush";
    public static final String EXTRA_PAYLOAD = "payload";
    public static final String PAUSE_EVENTS_DELIVERY = "com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY";
    public static final String PRESENTATION_TRACKING_LOGGING_REQUEST_DELIVERY_STATUS = "com.netflix.mediaclient.intent.action.PRESENTATION_TRACKING_LOGGING_REQUEST_DELIVERY_STATUS";
    public static final String RESUME_EVENTS_DELIVERY = "com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY";

    public abstract void flush();

    public abstract List getActiveLoggingSessions();

    public abstract AdvertiserIdLogging getAdvertiserIdLogging();

    public abstract ApplicationPerformanceMetricsLogging getApplicationPerformanceMetricsLogging();

    public abstract BreadcrumbLogging getBreadcrumbLogging();

    public abstract CmpEventLogging getCmpEventLogging();

    public abstract CustomerEventLogging getCustomerEventLogging();

    public abstract ErrorLogging getErrorLogging();

    public abstract long getNextSequence();

    public abstract PresentationTracking getPresentationTracking();

    public abstract void pauseDelivery();

    public abstract void resumeDelivery(boolean flag);

    public abstract void setDataContext(DataContext datacontext);
}
