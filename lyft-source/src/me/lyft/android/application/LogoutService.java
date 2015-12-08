// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import android.content.Context;
import java.io.File;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.persistence.ISimpleStorage;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.utils.FileUtils;
import rx.Observable;

// Referenced classes of package me.lyft.android.application:
//            ILogoutService, IUserProvider

public class LogoutService
    implements ILogoutService
{

    private Context appContext;
    private IDriverDocumentsStorage driverDocumentsStorage;
    private IFacebookService facebookService;
    private ILyftApi lyftApi;
    private ILyftPreferences preferences;
    private IRideRequestSession rideRequestSession;
    private ISimpleStorage simpleStorage;
    private IUserProvider userProvider;
    private IUserSession userSession;

    public LogoutService(Context context, IUserSession iusersession, IRideRequestSession iriderequestsession, ILyftApi ilyftapi, ILyftPreferences ilyftpreferences, IFacebookService ifacebookservice, IDriverDocumentsStorage idriverdocumentsstorage, 
            ISimpleStorage isimplestorage, IUserProvider iuserprovider)
    {
        appContext = context;
        userSession = iusersession;
        rideRequestSession = iriderequestsession;
        lyftApi = ilyftapi;
        preferences = ilyftpreferences;
        facebookService = ifacebookservice;
        driverDocumentsStorage = idriverdocumentsstorage;
        simpleStorage = isimplestorage;
        userProvider = iuserprovider;
    }

    private void deleteFile(File file)
    {
        if (file != null)
        {
            file.delete();
        }
    }

    private void deleteRegistrationPhotos()
    {
        deleteFile(getTemporaryPictureFile("profile_photo.jpg"));
    }

    private File getTemporaryPictureFile(String s)
    {
        return new File(FileUtils.getTempDirectoryPath(appContext), s);
    }

    private void performLogout()
    {
        facebookService.logout();
        userSession.resetAppState();
        rideRequestSession.resetCurrentRideType();
        userProvider.updateUser(User.empty());
        preferences.setLyftToken(null);
        preferences.clearTooltips();
        preferences.setShowTermsOfServiceOverRideView(true);
        driverDocumentsStorage.reset();
        deleteRegistrationPhotos();
        simpleStorage.clearAll();
    }

    public void logout(final String analytics)
    {
        analytics = OnBoardingAnalytics.trackLogoutUser(analytics);
        User user = userProvider.getUser();
        lyftApi.logout(user.getId()).subscribe(new AsyncCall() {

            final LogoutService this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackFailure(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                analytics.trackSuccess();
            }

            
            {
                this$0 = LogoutService.this;
                analytics = actionanalytics;
                super();
            }
        });
        performLogout();
    }

    public void resetCachedState()
    {
        userSession.resetAppState();
        userProvider.updateUser(User.empty());
    }

    public void resetSignUp()
    {
        preferences.setLyftToken(null);
        userSession.resetAppState();
        userProvider.updateUser(User.empty());
    }
}
