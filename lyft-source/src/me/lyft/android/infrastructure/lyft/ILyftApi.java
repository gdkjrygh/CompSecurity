// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.infrastructure.lyft.faresplit.FareSplitInviteRequestDTO;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.infrastructure.lyft.invite.InviteRequestDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
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
import me.lyft.android.infrastructure.lyft.work.EnterpriseInviteRequestDTO;
import rx.Observable;

// Referenced classes of package me.lyft.android.infrastructure.lyft:
//            AppStateDTO

public interface ILyftApi
{

    public abstract Observable acceptDeclineFareSplitRequest(String s, boolean flag);

    public abstract Observable applyCoupon(String s, String s1);

    public abstract Observable cancelRide(String s, String s1, String s2, LocationDTO locationdto);

    public abstract Observable changePartySizeAndStatus(String s, String s1, int i, LocationDTO locationdto);

    public abstract Observable changeRideStatus(String s, String s1, LocationDTO locationdto);

    public abstract Observable changeRideStatusToArrived(String s, String s1, LocationDTO locationdto);

    public abstract Observable createCreditCardChargeAccount(String s, String s1, String s2, String s3);

    public abstract Observable createOrUpdateDebitCard(String s, String s1);

    public abstract Observable createPayPalChargeAccount(String s, String s1, String s2);

    public abstract Observable createRide(RideRequestDTO riderequestdto);

    public abstract Observable createUser(LoginRequestDTO loginrequestdto);

    public abstract Observable createUserOrganization(String s);

    public abstract Observable createUserShortcut(String s, ShortcutDTO shortcutdto);

    public abstract Observable createWalletChargeAccount(String s, String s1, String s2, String s3);

    public abstract Observable deleteChargeAccount(String s, String s1);

    public abstract Observable deleteDestinyLocation(String s);

    public abstract Observable fallbackDirections(String s);

    public abstract Observable generateSignedUrl(String s);

    public abstract Observable getAppInfo(double d, double d1, String s);

    public abstract Observable getDriverDocuments();

    public abstract Observable getDriverStats(String s);

    public abstract Observable getExpressPay(String s);

    public abstract HeatmapMetaDTO getHeatmapPricingSync(double d, double d1);

    public abstract Observable getImageUploadUrl(ImageUploadDTO imageuploaddto);

    public abstract Observable getNotifications();

    public abstract Observable getPassengerHistory(String s, int i, int j);

    public abstract Observable getPassengerRideHistoryDetails(String s, String s1);

    public abstract Observable getPayPalClientToken(String s);

    public abstract Observable getShareRouteUrl(String s);

    public abstract Observable getUserOrganization();

    public abstract Observable logout(String s);

    public abstract Observable makeCardDefault(String s, String s1);

    public abstract Observable makeCreditLineDefault(String s, String s1);

    public abstract Observable makeFacebookDefault(String s, String s1);

    public abstract Observable makePayPalDefault(String s, String s1, String s2);

    public abstract Observable makeWalletDefault(String s, String s1);

    public abstract Observable payDebtWithCreditCard(String s, String s1);

    public abstract Observable payDebtWithPayPal(String s, String s1, String s2);

    public abstract Observable payDebtWithWallet(String s, String s1);

    public abstract Observable placeSearch(String s, LocationDTO locationdto);

    public abstract Observable placeTextSearch(String s, LocationDTO locationdto);

    public abstract Observable rateAndDonateDriver(String s, RideUpdateRequestDTO rideupdaterequestdto);

    public abstract Observable ratePassenger(String s, Integer integer, String s1);

    public abstract Observable refreshFacebookAuthToken(String s, String s1);

    public abstract Observable requestPhoneAuthentication(PhoneRequestDTO phonerequestdto);

    public abstract Observable sendEnterpriseInvites(EnterpriseInviteRequestDTO enterpriseinviterequestdto);

    public abstract Observable sendFareSplitInvites(FareSplitInviteRequestDTO faresplitinviterequestdto);

    public abstract Observable sendInvites(InviteRequestDTO inviterequestdto);

    public abstract Observable startCouchRide(LocationDTO locationdto);

    public abstract Observable submitPayout(String s);

    public abstract Observable unlinkConcur(String s);

    public abstract Observable updateBgLocation(String s, LocationDTO locationdto);

    public abstract Observable updateConcurSendRideReceipts(String s, boolean flag);

    public abstract Observable updateCreditCardChargeAccount(String s, String s1, String s2, String s3, String s4);

    public abstract Observable updateDestinyLocation(String s, DestinyLocationRequestDTO destinylocationrequestdto);

    public abstract Observable updateGoogleAuthToken(String s, GoogleNowAuthCodeDTO googlenowauthcodedto);

    public abstract Observable updateInsurance(DriverDocumentsDTO driverdocumentsdto);

    public abstract AppStateDTO updateLocationSync(String s, LocationUpdateRequestDTO locationupdaterequestdto);

    public abstract Observable updateRide(String s, RideUpdateRequestDTO rideupdaterequestdto);

    public abstract Observable updateUser(String s, UpdateUserRequestDTO updateuserrequestdto);

    public abstract AppStateDTO updateUserSync(String s, UpdateUserRequestDTO updateuserrequestdto);
}
