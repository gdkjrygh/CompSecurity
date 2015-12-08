// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            LoMo, IClientLogging, UserProfile, IMdx, 
//            IPlayer, NrdpComponent, IPushNotification, SignUpParams, 
//            Video, INetflixServiceCallback

public interface INetflixService
{

    public static final String EXTRA_STATUS_CODE = "status_code";
    public static final String INTENT_CATEGORY_NETFLIX_SERVICE = "com.netflix.mediaclient.intent.category.NETFLIX_SERVICE";
    public static final String INTENT_NAME_DESTROYED = "com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED";
    public static final String INTENT_NAME_INIT_COMPLETE = "com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE";

    public abstract void addToQueue(String s, int i, int j, int k);

    public abstract void connectWithFacebook(String s, int i, int j);

    public abstract void dumpHomeLoLoMosAndVideos(String s, String s1);

    public abstract void dumpHomeLoLoMosAndVideosToLog();

    public abstract void dumpHomeLoMos();

    public abstract void fetchCWVideos(int i, int j, int k, int l);

    public abstract void fetchEpisodeDetails(String s, int i, int j);

    public abstract void fetchEpisodes(String s, int i, int j, int k, int l);

    public abstract void fetchGenreLists(int i, int j);

    public abstract void fetchGenreVideos(LoMo lomo, int i, int j, int k, int l);

    public abstract void fetchGenres(String s, int i, int j, int k, int l);

    public abstract void fetchIQVideos(int i, int j, int k, int l);

    public abstract void fetchKidsCharacterDetails(String s, int i, int j);

    public abstract void fetchLoLoMoSummary(String s, int i, int j);

    public abstract void fetchLoMos(String s, int i, int j, int k, int l);

    public abstract void fetchMovieDetails(String s, int i, int j);

    public abstract void fetchPostPlayVideos(String s, int i, int j);

    public abstract void fetchResource(String s, IClientLogging.AssetType assettype, int i, int j);

    public abstract void fetchSeasonDetails(String s, int i, int j);

    public abstract void fetchSeasons(String s, int i, int j, int k, int l);

    public abstract void fetchShowDetails(String s, String s1, int i, int j);

    public abstract void fetchSimilarVideosForPerson(String s, int i, int j, int k);

    public abstract void fetchSimilarVideosForQuerySuggestion(String s, int i, int j, int k);

    public abstract void fetchVideos(LoMo lomo, int i, int j, int k, int l);

    public abstract void flushCaches();

    public abstract List getAllProfiles();

    public abstract IClientLogging getClientLogging();

    public abstract com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface getConfiguration();

    public abstract String getCurrentAppLocale();

    public abstract UserProfile getCurrentProfile();

    public abstract String getCurrentProfileEmail();

    public abstract String getCurrentProfileFirstName();

    public abstract String getCurrentProfileLastName();

    public abstract String getCurrentProfileUserId();

    public abstract DeviceCategory getDeviceCategory();

    public abstract EsnProvider getESN();

    public abstract IMdx getMdx();

    public abstract IPlayer getNflxPlayer();

    public abstract String getNrdpComponentVersion(NrdpComponent nrdpcomponent);

    public abstract IPushNotification getPushNotification();

    public abstract SignUpParams getSignUpParams();

    public abstract String getSoftwareVersion();

    public abstract String getUserId();

    public abstract void hideVideo(String s, int i, int j);

    public abstract boolean isCurrentProfileFacebookConnected();

    public abstract boolean isCurrentProfileIQEnabled();

    public abstract boolean isDeviceHd();

    public abstract boolean isProfileSwitchingDisabled();

    public abstract boolean isTablet();

    public abstract boolean isUserLoggedIn();

    public abstract void logBillboardActivity(Video video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType billboardactivitytype);

    public abstract void loginUser(String s, String s1, int i, int j);

    public abstract void loginUserByTokens(ActivationTokens activationtokens, int i, int j);

    public abstract void logoutUser(int i, int j);

    public abstract void prefetchGenreLoLoMo(String s, int i, int j, int k, int l, boolean flag, int i1, 
            int j1);

    public abstract void prefetchLoLoMo(int i, int j, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1, int k1, int l1);

    public abstract void refreshProfileSwitchingStatus();

    public abstract void registerCallback(INetflixServiceCallback inetflixservicecallback);

    public abstract void removeFromQueue(String s, int i, int j);

    public abstract void searchNetflix(String s, int i, int j);

    public abstract void selectProfile(String s);

    public abstract void setCurrentAppLocale(String s);

    public abstract void setVideoRating(String s, int i, int j, int k, int l);

    public abstract void unregisterCallback(INetflixServiceCallback inetflixservicecallback);

    public abstract void verifyPin(String s, int i, int j);
}
