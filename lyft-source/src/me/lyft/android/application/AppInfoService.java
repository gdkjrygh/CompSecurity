// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.features.IFeatureFlagsManager;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.application:
//            IAppInfoService, IConstantsProvider

public class AppInfoService
    implements IAppInfoService
{

    private static final long LOAD_APP_INFO_TIMOUT_MILLISECONDS = 4000L;
    private final IAssetPackagingService assetPackagingService;
    private final IConstantsProvider constantsProvider;
    private IFeatureFlagsManager featureFlagsManager;
    private final ILocationService locationService;
    private final ILyftApi lyftApi;
    private final Observable observable;
    private final ILyftPreferences preferences;
    private final PublishSubject subject = PublishSubject.create();

    public AppInfoService(ILocationService ilocationservice, ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, IAssetPackagingService iassetpackagingservice, IFeatureFlagsManager ifeatureflagsmanager, ILyftPreferences ilyftpreferences)
    {
        observable = subject.asObservable();
        locationService = ilocationservice;
        lyftApi = ilyftapi;
        constantsProvider = iconstantsprovider;
        assetPackagingService = iassetpackagingservice;
        featureFlagsManager = ifeatureflagsmanager;
        preferences = ilyftpreferences;
        ifeatureflagsmanager.updateFromAppInfoConstants(iconstantsprovider.getConstants());
    }

    public Observable loadAppInfo(final String deepLink)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final AppInfoService this$0;
            final String val$deepLink;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.getAppInfo(location.getLat().doubleValue(), location.getLng().doubleValue(), deepLink);
            }

            
            {
                this$0 = AppInfoService.this;
                deepLink = s;
                super();
            }
        }).timeout(4000L, TimeUnit.MILLISECONDS).doOnNext(new Action1() {

            final AppInfoService this$0;

            public volatile void call(Object obj)
            {
                call((AppInfo)obj);
            }

            public void call(AppInfo appinfo)
            {
                updateAppInfo(appinfo);
                preferences.setInstallReferrer(null);
            }

            
            {
                this$0 = AppInfoService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable observeAppInfo()
    {
        return observable;
    }

    public void updateAppInfo(AppInfo appinfo)
    {
        String s = (String)Objects.firstNonNull(appinfo.getAssetsUrl(), "");
        assetPackagingService.downloadAssetsIfChanged(s);
        constantsProvider.update(appinfo);
        featureFlagsManager.updateFromAppInfoConstants((Constants)Objects.firstNonNull(appinfo.getConstants(), Constants.empty()));
        subject.onNext(appinfo);
    }


}
