// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.api.BaseApi;
import me.lyft.android.infrastructure.api.JsonBody;
import me.lyft.android.infrastructure.api.UrlBuilder;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.googlegeo.GoogleDirectionsResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GooglePlacesSearchResponseDTO;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.driver.DriverAchievementsDTO;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayAccountDTO;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.infrastructure.lyft.faresplit.FareSplitInviteRequestDTO;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.infrastructure.lyft.invite.InviteRequestDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.notifications.LyftNotificationsResponseDTO;
import me.lyft.android.infrastructure.lyft.payment.PayPalClientTokenDTO;
import me.lyft.android.infrastructure.lyft.polling.LocationUpdateRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.ImageUploadDTO;
import me.lyft.android.infrastructure.lyft.profile.LoginRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.ShortcutDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO;
import me.lyft.android.infrastructure.lyft.ride.DestinyLocationRequestDTO;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import me.lyft.android.infrastructure.lyft.ride.RideRequestDTO;
import me.lyft.android.infrastructure.lyft.ride.RideUpdateRequestDTO;
import me.lyft.android.infrastructure.lyft.ride.ShareRouteDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDetailsDTO;
import me.lyft.android.infrastructure.lyft.signing.SignedUrlDTO;
import me.lyft.android.infrastructure.lyft.work.EnterpriseInviteRequestDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.infrastructure.placesearch.PlaceSearchResponseDTO;
import me.lyft.android.logging.L;
import okio.ByteString;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.lyft:
//            ILyftApi, AppStateDTO, XSession, LyftError, 
//            LyftApiException

public class LyftApi extends BaseApi
    implements ILyftApi
{

    private static final int API_VERSION = 40;
    private final IDevice device;
    private final IAppStateListener listener;
    private final ILyftPreferences preferences;
    private final Action1 setAppStateAction = new Action1() {

        final LyftApi this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            listener.onAppStateReceived(appstatedto);
        }

            
            {
                this$0 = LyftApi.this;
                super();
            }
    };

    public LyftApi(OkHttpClient okhttpclient, Gson gson, ILyftPreferences ilyftpreferences, IDevice idevice, IAppStateListener iappstatelistener)
    {
        super(okhttpclient, gson);
        preferences = ilyftpreferences;
        device = idevice;
        listener = iappstatelistener;
    }

    private Observable changeRideStatus(String s, String s1, String s2, LocationDTO locationdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        HashMap hashmap = new HashMap();
        hashmap.put("status", s1);
        if (!Strings.isNullOrEmpty(s2))
        {
            hashmap.put("arrivedReason", s2);
        }
        if (locationdto != null)
        {
            hashmap.put("location", locationdto);
        }
        builder.put(createJsonBody(hashmap)).url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString());
        return executeAsyncReceiveAppState(builder);
    }

    private Observable createChargeAccount(String s, Map map)
    {
        Preconditions.checkNotNull(map);
        Preconditions.checkArgument(map.containsKey("clientPaymentMethod"), "Charge account request requires clientPaymentMethod.");
        map.put("default", Boolean.valueOf(true));
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/chargeaccounts").toString()).post(createJsonBody(map)));
    }

    private Observable executeAsyncReceiveAppState(com.squareup.okhttp.Request.Builder builder)
    {
        return executeAsync(builder, me/lyft/android/infrastructure/lyft/AppStateDTO).doOnNext(setAppStateAction);
    }

    private AppStateDTO executeReceiveAppState(com.squareup.okhttp.Request.Builder builder)
    {
        builder = (AppStateDTO)execute(builder, me/lyft/android/infrastructure/lyft/AppStateDTO);
        listener.onAppStateReceived(builder);
        return builder;
    }

    private String getApiRoot()
    {
        return preferences.getLyftApiRoot();
    }

    private String getXSession()
    {
        Object obj = device.getAndroidId();
        String s = preferences.getAdvertisingId();
        boolean flag;
        if (!preferences.getLimitAdvertisingId())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new XSession(((String) (obj)), s, flag);
        try
        {
            obj = ByteString.encodeUtf8(gson.a(obj)).base64();
        }
        catch (Exception exception)
        {
            L.e(exception, "getXSession", new Object[0]);
            return "";
        }
        return ((String) (obj));
    }

    private Observable makeDefaultChargeAccount(String s, String s1, Map map)
    {
        map.put("default", Boolean.valueOf(true));
        return updateChargeAccount(s, s1, map);
    }

    private Observable updateChargeAccount(String s, String s1, Map map)
    {
        Preconditions.checkNotNull(map);
        Preconditions.checkArgument(map.containsKey("clientPaymentMethod"), "Charge account request requires clientPaymentMethod.");
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/chargeaccounts/").append(s1).toString()).put(createJsonBody(map)));
    }

    public Observable acceptDeclineFareSplitRequest(String s, boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s1;
        if (flag)
        {
            s1 = "accepted";
        } else
        {
            s1 = "rejected";
        }
        hashmap.put("status", s1);
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/contributors/").append(s).toString()).put(createJsonBody(hashmap))).map(Unit.func1());
    }

    public Observable applyCoupon(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("coupon", s1);
        s1 = createRequest();
        s1.url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).toString()).put(createJsonBody(hashmap));
        return executeAsyncReceiveAppState(s1);
    }

    public Observable cancelRide(String s, String s1, String s2, LocationDTO locationdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        HashMap hashmap = new HashMap();
        hashmap.put("status", s2);
        if (!Strings.isNullOrEmpty(s1))
        {
            hashmap.put("cancelId", s1);
        }
        if (!locationdto.isNull())
        {
            hashmap.put("location", locationdto);
        }
        builder.put(createJsonBody(hashmap)).url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString());
        return executeAsyncReceiveAppState(builder);
    }

    public Observable changePartySizeAndStatus(String s, String s1, int i, LocationDTO locationdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        HashMap hashmap = new HashMap();
        hashmap.put("status", s1);
        hashmap.put("partySize", Integer.valueOf(i));
        hashmap.put("location", locationdto);
        builder.url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString()).put(createJsonBody(hashmap));
        return executeAsyncReceiveAppState(builder);
    }

    public Observable changeRideStatus(String s, String s1, LocationDTO locationdto)
    {
        return changeRideStatus(s, s1, null, locationdto);
    }

    public Observable changeRideStatusToArrived(String s, String s1, LocationDTO locationdto)
    {
        return changeRideStatus(s, "arrived", s1, locationdto);
    }

    public Observable createCreditCardChargeAccount(String s, String s1, String s2, String s3)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "card");
        hashmap.put("token", s1);
        hashmap.put("label", s2);
        hashmap.put("labelType", s3);
        return createChargeAccount(s, hashmap);
    }

    protected RequestBody createJsonBody(Object obj)
    {
        return JsonBody.create(gson, obj);
    }

    public Observable createOrUpdateDebitCard(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("paymentMethod", "card");
        hashmap.put("token", s1);
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/recipientaccounts").toString()).post(createJsonBody(hashmap)), me/lyft/android/infrastructure/lyft/driver/ExpressPayAccountDTO);
    }

    public Observable createPayPalChargeAccount(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "paypal");
        hashmap.put("nonce", s1);
        hashmap.put("chargeToken", s2);
        return createChargeAccount(s, hashmap);
    }

    protected com.squareup.okhttp.Request.Builder createRequest()
    {
        Object obj = device.getDeviceLocale();
        obj = (new com.squareup.okhttp.Request.Builder()).addHeader("Accept-Language", ((String) (obj))).addHeader("Accept", "application/vnd.lyft.app+json;version=40").addHeader("User-Agent", device.getUserAgent()).addHeader("User-Device", device.getDeviceName()).addHeader("X-Carrier", device.getOperatorName()).addHeader("X-Session", getXSession());
        if (!Strings.isNullOrEmpty(preferences.getLyftToken()))
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).addHeader("Authorization", (new StringBuilder()).append("lyftToken ").append(preferences.getLyftToken()).toString());
        }
        return ((com.squareup.okhttp.Request.Builder) (obj));
    }

    public Observable createRide(RideRequestDTO riderequestdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        builder.url((new StringBuilder()).append(getApiRoot()).append("/rides").toString()).post(createJsonBody(riderequestdto));
        return executeAsyncReceiveAppState(builder);
    }

    public Observable createUser(LoginRequestDTO loginrequestdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users").toString()).post(createJsonBody(loginrequestdto));
        if (Strings.isNullOrEmpty(preferences.getLyftToken()) && !Strings.isNullOrEmpty(loginrequestdto.fbToken))
        {
            builder.addHeader("Authorization", (new StringBuilder()).append("fbAccessToken ").append(loginrequestdto.fbToken).toString());
        }
        return executeAsyncReceiveAppState(builder);
    }

    public Observable createUserOrganization(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", s);
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/organizations").toString()).post(createJsonBody(hashmap)), me/lyft/android/infrastructure/lyft/work/UserOrganizationDTO);
    }

    public Observable createUserShortcut(String s, ShortcutDTO shortcutdto)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/shortcuts").toString()).post(createJsonBody(shortcutdto)));
    }

    public Observable createWalletChargeAccount(String s, String s1, String s2, String s3)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "googleWallet");
        hashmap.put("token", s1);
        hashmap.put("originalType", s2);
        hashmap.put("originalLastFour", s3);
        return createChargeAccount(s, hashmap);
    }

    public Observable deleteChargeAccount(String s, String s1)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/chargeaccounts/").append(s1).toString()).delete());
    }

    public Observable deleteDestinyLocation(String s)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/driverdestinations").toString()).delete());
    }

    public Observable fallbackDirections(String s)
    {
        s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/ride/").append(s).append("/directions").toString())).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/googlegeo/GoogleDirectionsResponseDTO);
    }

    public Observable generateSignedUrl(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("url", s);
        hashmap.put("ttl", Integer.valueOf(3600));
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/signedurl").toString()).post(createJsonBody(hashmap)), me/lyft/android/infrastructure/lyft/signing/SignedUrlDTO);
    }

    public Observable getAppInfo(double d, double d1, String s)
    {
        UrlBuilder urlbuilder = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/appinfo").toString())).addQueryParam("matId", preferences.getMatId()).addQueryParam("lat", String.valueOf(d)).addQueryParam("lng", String.valueOf(d1));
        if (!Strings.isNullOrEmpty(s))
        {
            urlbuilder.addQueryParam("deepLink", s);
        }
        s = urlbuilder.build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/lyft/constants/AppInfo);
    }

    public Observable getDriverDocuments()
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/driver/documents").toString()).get(), me/lyft/android/infrastructure/lyft/driverdocuments/DriverDocumentsDTO);
    }

    public Observable getDriverStats(String s)
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/driverstats").toString()).get(), me/lyft/android/infrastructure/lyft/driver/DriverAchievementsDTO);
    }

    public Observable getExpressPay(String s)
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/payout-eligibility").toString()).get(), me/lyft/android/infrastructure/lyft/driver/ExpressPayDTO);
    }

    public HeatmapMetaDTO getHeatmapPricingSync(double d, double d1)
    {
        String s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/pricing").toString())).addQueryParam("lat", String.valueOf(d)).addQueryParam("lng", String.valueOf(d1)).build();
        return (HeatmapMetaDTO)execute(createRequest().url(s).get(), me/lyft/android/infrastructure/lyft/ride/HeatmapMetaDTO);
    }

    public Observable getImageUploadUrl(ImageUploadDTO imageuploaddto)
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/images").toString()).post(createJsonBody(imageuploaddto)), me/lyft/android/infrastructure/lyft/profile/ImageUploadDTO);
    }

    public Observable getNotifications()
    {
        String s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/notifications").toString())).addQueryParam("screenWidth", device.getScreenWidth().toString()).addQueryParam("screenHeight", device.getScreenHeight().toString()).addQueryParam("dpi", device.getDensity().toString()).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/lyft/notifications/LyftNotificationsResponseDTO);
    }

    public Observable getPassengerHistory(String s, int i, int j)
    {
        s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/ride-history").toString())).addQueryParam("skip", String.valueOf(i)).addQueryParam("limit", String.valueOf(j)).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/lyft/ridehistory/PassengerRideHistoryDTO);
    }

    public Observable getPassengerRideHistoryDetails(String s, String s1)
    {
        s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/ride-history/").append(s1).toString())).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/lyft/ridehistory/PassengerRideHistoryDetailsDTO);
    }

    public Observable getPayPalClientToken(String s)
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/paypal").toString()).get(), me/lyft/android/infrastructure/lyft/payment/PayPalClientTokenDTO);
    }

    public Observable getShareRouteUrl(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("id", s);
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/share-route").toString()).put(createJsonBody(hashmap)), me/lyft/android/infrastructure/lyft/ride/ShareRouteDTO);
    }

    protected IOException getUnsuccessfulResponseException(Response response)
    {
        LyftError lyfterror;
        try
        {
            lyfterror = (LyftError)deserializeJsonBody(response, me/lyft/android/infrastructure/lyft/LyftError);
        }
        catch (Throwable throwable)
        {
            throwable = new LyftError();
        }
        return new LyftApiException(lyfterror, response.code());
    }

    public Observable getUserOrganization()
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/organizations").toString()).get(), me/lyft/android/infrastructure/lyft/work/UserOrganizationDTO);
    }

    public Observable logout(String s)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        builder.url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/logout").toString()).put(null);
        return executeWithoutResultAsync(builder);
    }

    public Observable makeCardDefault(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "card");
        return makeDefaultChargeAccount(s, s1, hashmap);
    }

    public Observable makeCreditLineDefault(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "creditLine");
        return makeDefaultChargeAccount(s, s1, hashmap);
    }

    public Observable makeFacebookDefault(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "facebook");
        return makeDefaultChargeAccount(s, s1, hashmap);
    }

    public Observable makePayPalDefault(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "paypal");
        hashmap.put("chargeToken", s2);
        return makeDefaultChargeAccount(s, s1, hashmap);
    }

    public Observable makeWalletDefault(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "googleWallet");
        return makeDefaultChargeAccount(s, s1, hashmap);
    }

    public Observable payDebtWithCreditCard(String s, String s1)
    {
        return makeCardDefault(s, s1);
    }

    public Observable payDebtWithPayPal(String s, String s1, String s2)
    {
        return makePayPalDefault(s, s1, s2);
    }

    public Observable payDebtWithWallet(String s, String s1)
    {
        return makeWalletDefault(s, s1);
    }

    public Observable placeSearch(String s, LocationDTO locationdto)
    {
        s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/places/placesearch").toString())).addQueryParam("query", s).addQueryParam("lat", String.valueOf(((Double)Objects.firstNonNull(locationdto.getLat(), Double.valueOf(0.0D))).doubleValue())).addQueryParam("lng", String.valueOf(((Double)Objects.firstNonNull(locationdto.getLng(), Double.valueOf(0.0D))).doubleValue())).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/placesearch/PlaceSearchResponseDTO);
    }

    public Observable placeTextSearch(String s, LocationDTO locationdto)
    {
        locationdto = (new StringBuilder()).append(Objects.firstNonNull(locationdto.getLat(), Double.valueOf(0.0D))).append(",").append(Objects.firstNonNull(locationdto.getLng(), Double.valueOf(0.0D))).toString();
        s = (new UrlBuilder((new StringBuilder()).append(getApiRoot()).append("/places/textsearch").toString())).addQueryParam("location", locationdto).addQueryParam("query", s).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/googlegeo/GooglePlacesSearchResponseDTO);
    }

    public Observable rateAndDonateDriver(String s, RideUpdateRequestDTO rideupdaterequestdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        builder.put(createJsonBody(rideupdaterequestdto)).url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString());
        return executeAsyncReceiveAppState(builder);
    }

    public Observable ratePassenger(String s, Integer integer, String s1)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        HashMap hashmap = new HashMap();
        hashmap.put("passengerRating", integer);
        if (!Strings.isNullOrEmpty(s1))
        {
            hashmap.put("passengerFeedback", s1);
        }
        builder.url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString()).put(createJsonBody(hashmap));
        return executeAsyncReceiveAppState(builder);
    }

    public Observable refreshFacebookAuthToken(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("fbToken", s1);
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/facebook").toString()).post(createJsonBody(hashmap)));
    }

    public Observable requestPhoneAuthentication(PhoneRequestDTO phonerequestdto)
    {
        return executeWithoutResultAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/phoneauth").toString()).post(createJsonBody(phonerequestdto)));
    }

    public Observable sendEnterpriseInvites(EnterpriseInviteRequestDTO enterpriseinviterequestdto)
    {
        return executeWithoutResultAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/invites").toString()).post(createJsonBody(enterpriseinviterequestdto)));
    }

    public Observable sendFareSplitInvites(FareSplitInviteRequestDTO faresplitinviterequestdto)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/contributors").toString()).post(createJsonBody(faresplitinviterequestdto))).map(Unit.func1());
    }

    public Observable sendInvites(InviteRequestDTO inviterequestdto)
    {
        return executeWithoutResultAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/invites").toString()).post(createJsonBody(inviterequestdto)));
    }

    public Observable startCouchRide(LocationDTO locationdto)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/ghostride").toString()).post(createJsonBody(locationdto)));
    }

    public Observable submitPayout(String s)
    {
        HashMap hashmap = new HashMap();
        return executeWithoutResultAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/payout").toString()).post(createJsonBody(hashmap)));
    }

    public Observable unlinkConcur(String s)
    {
        HashMap hashmap = new HashMap();
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/concur/unlink").toString()).put(createJsonBody(hashmap)));
    }

    public Observable updateBgLocation(String s, LocationDTO locationdto)
    {
        s = createRequest();
        HashMap hashmap = new HashMap();
        hashmap.put("locations", Collections.singletonList(locationdto));
        s.url((new StringBuilder()).append(getApiRoot()).append("/locations/").toString()).post(createJsonBody(hashmap));
        return executeWithoutResultAsync(s);
    }

    public Observable updateConcurSendRideReceipts(String s, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("concurEnabled", Boolean.valueOf(flag));
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).toString()).post(createJsonBody(hashmap)));
    }

    public Observable updateCreditCardChargeAccount(String s, String s1, String s2, String s3, String s4)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientPaymentMethod", "card");
        hashmap.put("token", s2);
        hashmap.put("label", s3);
        hashmap.put("labelType", s4);
        return updateChargeAccount(s, s1, hashmap);
    }

    public Observable updateDestinyLocation(String s, DestinyLocationRequestDTO destinylocationrequestdto)
    {
        return executeAsyncReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/driverdestinations").toString()).put(createJsonBody(destinylocationrequestdto)));
    }

    public Observable updateGoogleAuthToken(String s, GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
        return executeWithoutResultAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/now").toString()).put(createJsonBody(googlenowauthcodedto)));
    }

    public Observable updateInsurance(DriverDocumentsDTO driverdocumentsdto)
    {
        return executeAsync(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/driver/documents").toString()).put(createJsonBody(driverdocumentsdto)), me/lyft/android/infrastructure/lyft/driverdocuments/DriverDocumentsDTO);
    }

    public AppStateDTO updateLocationSync(String s, LocationUpdateRequestDTO locationupdaterequestdto)
    {
        if (Strings.isNullOrEmpty(s))
        {
            throw new NullPointerException("userId cannot be null");
        } else
        {
            return executeReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).append("/location").toString()).put(createJsonBody(locationupdaterequestdto)));
        }
    }

    public Observable updateRide(String s, RideUpdateRequestDTO rideupdaterequestdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        builder.url((new StringBuilder()).append(getApiRoot()).append("/rides/").append(s).toString()).put(createJsonBody(rideupdaterequestdto));
        return executeAsyncReceiveAppState(builder);
    }

    public Observable updateUser(String s, UpdateUserRequestDTO updateuserrequestdto)
    {
        com.squareup.okhttp.Request.Builder builder = createRequest();
        builder.url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).toString()).put(createJsonBody(updateuserrequestdto));
        return executeAsyncReceiveAppState(builder);
    }

    public AppStateDTO updateUserSync(String s, UpdateUserRequestDTO updateuserrequestdto)
    {
        return executeReceiveAppState(createRequest().url((new StringBuilder()).append(getApiRoot()).append("/users/").append(s).toString()).put(createJsonBody(updateuserrequestdto)));
    }


    private class IAppStateListener
    {

        public abstract void onAppStateReceived(AppStateDTO appstatedto);
    }

}
