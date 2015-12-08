// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;
import me.lyft.android.infrastructure.lyft.ride.DriverSignOutFrictionDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft.profile:
//            NullUserDTO, PermissionsDTO, PhoneDTO, VehicleDTO

public class UserDTO
{

    public static final long DEFAULT_POLLING_RATE;
    public static final String DRIVER = "driver";
    public static final String EMAIL_FIELD = "email";
    public static final String INVALID_AREA_CODE_REASON = "invalidAreaCode";
    public static final String INVALID_COUNTRY_REASON = "invalidCountry";
    public static final String PASSENGER = "passenger";
    public static final String PHONE_NUMBER_FIELD = "number";
    public static final String VERIFICATION_CODE_FIELD = "verificationCode";
    public final String additionalMutualFriendsCount;
    public final String appInfoRevision;
    public final Boolean approvedChauffeurDriver;
    public final Boolean approvedDriver;
    public final ArrayList chargeAccounts;
    public final String couponCode;
    public final List credits;
    public final MoneyDTO dailyTotalFares;
    public final MoneyDTO debtMoney;
    public final LocationDTO destinyLocation;
    public final Boolean driverDocumentsEnabled;
    public final Double driverRating;
    public final DriverSignOutFrictionDTO driverSignOutFriction;
    public final String email;
    public final String expenseRidesToConcurDefault;
    public final String facebookUid;
    public final String fbToken;
    public final String firstName;
    public final String googleNowRefreshToken;
    public final String googlePushToken;
    public final String id;
    public final List images;
    public final Boolean isDriverLastRide;
    public final String joinDate;
    public final String lastName;
    public final LocationDTO location;
    public final String lyftToken;
    public final String matId;
    public final String mode;
    public final List mutualFriends;
    public final Integer partySize;
    public final Boolean passengerPhotoUploadEnabled;
    public final Double passengerRating;
    public final PermissionsDTO permissions;
    public final PhoneDTO phone;
    public final Long pollingRate;
    public final List profileFields;
    public final Boolean ratingCompleted;
    public final List recentLocations;
    public final Boolean redirectToDriverApplication;
    public final String referralCode;
    public final String referralUrl;
    public final String region;
    public final Boolean requestProfileV1FacebookPermissions;
    public final Boolean requiresBillingAddress;
    public final Boolean requiresCreditCardCapture;
    public final ArrayList shortcuts;
    public final Boolean showExpressPayPopUp;
    public final Boolean termsAccepted;
    public final Long timestamp;
    public final String userPhoto;
    public final VehicleDTO vehicleDTO;
    public final Boolean wheelchair;

    public UserDTO(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, Boolean boolean1, List list, LocationDTO locationdto, List list1, 
            Double double1, Double double2, Boolean boolean2, String s10, Boolean boolean3, String s11, Long long1, 
            String s12, String s13, PhoneDTO phonedto, ArrayList arraylist, VehicleDTO vehicledto, MoneyDTO moneydto, List list2, 
            Boolean boolean4, String s14, ArrayList arraylist1, Integer integer, MoneyDTO moneydto1, Long long2, LocationDTO locationdto1, 
            String s15, List list3, Boolean boolean5, String s16, String s17, List list4, Boolean boolean6, 
            PermissionsDTO permissionsdto, Boolean boolean7, Boolean boolean8, DriverSignOutFrictionDTO driversignoutfrictiondto, Boolean boolean9, Boolean boolean10, Boolean boolean11, 
            String s18, String s19, Boolean boolean12, Boolean boolean13)
    {
        id = s;
        firstName = s1;
        lastName = s2;
        email = s3;
        userPhoto = s4;
        facebookUid = s5;
        fbToken = s6;
        referralCode = s7;
        referralUrl = s8;
        lyftToken = s9;
        approvedDriver = boolean1;
        credits = list;
        location = locationdto;
        recentLocations = list1;
        passengerRating = double1;
        driverRating = double2;
        ratingCompleted = boolean2;
        mode = s10;
        termsAccepted = boolean3;
        googlePushToken = s11;
        timestamp = long1;
        region = s12;
        matId = s13;
        phone = phonedto;
        chargeAccounts = arraylist;
        vehicleDTO = vehicledto;
        debtMoney = moneydto;
        images = list2;
        wheelchair = boolean4;
        appInfoRevision = s14;
        shortcuts = arraylist1;
        partySize = integer;
        dailyTotalFares = moneydto1;
        pollingRate = long2;
        destinyLocation = locationdto1;
        googleNowRefreshToken = s15;
        profileFields = list3;
        passengerPhotoUploadEnabled = boolean5;
        joinDate = s16;
        additionalMutualFriendsCount = s17;
        mutualFriends = list4;
        requestProfileV1FacebookPermissions = boolean6;
        permissions = permissionsdto;
        requiresBillingAddress = boolean7;
        driverDocumentsEnabled = boolean8;
        driverSignOutFriction = driversignoutfrictiondto;
        redirectToDriverApplication = boolean9;
        requiresCreditCardCapture = boolean10;
        approvedChauffeurDriver = boolean11;
        couponCode = s18;
        expenseRidesToConcurDefault = s19;
        showExpressPayPopUp = boolean12;
        isDriverLastRide = boolean13;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (UserDTO)obj;
        if (id == null) goto _L4; else goto _L3
_L3:
        if (id.equals(((UserDTO) (obj)).id)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((UserDTO) (obj)).id == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getAdditionalMutualFriendsCount()
    {
        return additionalMutualFriendsCount;
    }

    public List getChargeAccounts()
    {
        return chargeAccounts;
    }

    public List getCredits()
    {
        return credits;
    }

    public MoneyDTO getDailyTotalFares()
    {
        return dailyTotalFares;
    }

    public MoneyDTO getDebtMoney()
    {
        return debtMoney;
    }

    public LocationDTO getDestinyLocation()
    {
        return destinyLocation;
    }

    public Boolean getDriverDocumentsEnabled()
    {
        return driverDocumentsEnabled;
    }

    public Double getDriverRating()
    {
        return driverRating;
    }

    public DriverSignOutFrictionDTO getDriverSignOutFriction()
    {
        return driverSignOutFriction;
    }

    public String getEmail()
    {
        return email;
    }

    public String getExpenseRidesToConcur()
    {
        return expenseRidesToConcurDefault;
    }

    public String getFacebookToken()
    {
        return fbToken;
    }

    public String getFacebookUid()
    {
        return facebookUid;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getGoogleNowRefreshToken()
    {
        return googleNowRefreshToken;
    }

    public String getGooglePushToken()
    {
        return googlePushToken;
    }

    public String getId()
    {
        return id;
    }

    public String getJoinDate()
    {
        return joinDate;
    }

    public String getLastName()
    {
        return lastName;
    }

    public LocationDTO getLocation()
    {
        return location;
    }

    public String getLyftToken()
    {
        return lyftToken;
    }

    public String getMode()
    {
        return mode;
    }

    public List getMutualFriends()
    {
        return mutualFriends;
    }

    public Integer getPartySize()
    {
        return partySize;
    }

    public Double getPassengerRating()
    {
        return passengerRating;
    }

    public PermissionsDTO getPermissions()
    {
        return permissions;
    }

    public PhoneDTO getPhone()
    {
        return phone;
    }

    public Long getPollingRate()
    {
        return pollingRate;
    }

    public List getProfileFields()
    {
        return profileFields;
    }

    public List getRecentLocations()
    {
        return recentLocations;
    }

    public Boolean getRedirectToDriverApplication()
    {
        return redirectToDriverApplication;
    }

    public String getReferralCode()
    {
        return referralCode;
    }

    public String getReferralUrl()
    {
        return referralUrl;
    }

    public String getRegion()
    {
        return region;
    }

    public Boolean getRequiresBillingAddress()
    {
        return requiresBillingAddress;
    }

    public Boolean getRequiresCreditCardCapture()
    {
        return requiresCreditCardCapture;
    }

    public ArrayList getShortcuts()
    {
        return shortcuts;
    }

    public Boolean getShowExpressPayPopUp()
    {
        return showExpressPayPopUp;
    }

    public String getUserPhoto()
    {
        return userPhoto;
    }

    public VehicleDTO getVehicle()
    {
        return vehicleDTO;
    }

    public Boolean getWheelchair()
    {
        return wheelchair;
    }

    public Boolean isApprovedChauffeurDriver()
    {
        return approvedChauffeurDriver;
    }

    public Boolean isApprovedDriver()
    {
        return approvedDriver;
    }

    public Boolean isDriverLastRide()
    {
        return isDriverLastRide;
    }

    public boolean isNull()
    {
        return NullUserDTO.isNull(this);
    }

    public Boolean isPassengerPhotoUploadEnabled()
    {
        return passengerPhotoUploadEnabled;
    }

    public Boolean isRatingCompleted()
    {
        return ratingCompleted;
    }

    public Boolean isTermsAccepted()
    {
        return termsAccepted;
    }

    public Boolean shouldRequestProfileV1FacebookPermissions()
    {
        return requestProfileV1FacebookPermissions;
    }

    static 
    {
        DEFAULT_POLLING_RATE = TimeUnit.SECONDS.toMillis(5L);
    }
}
