// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            InviteSurfacingDTO, SocialSharing

public class Constants
    implements INullable
{

    private static final Long DEFAULT_AUTO_NAVIGATION_DISTANCE_THRESHOLD = Long.valueOf(400L);
    private static final Long DEFAULT_AUTO_RESTORE_DISTANCE_THRESHOLD = Long.valueOf(240L);
    private static final long DEFAULT_COURIER_PICKUP_TIMEOUT_DRIVER = 70L;
    public static final String INSURANCE_URL = "http://lft.to/COI";
    Long autoNavigateDistanceThreshold;
    Long autoRestoreDistanceThreshold;
    String cancelDetailTextCharge;
    String cancelSubtitleTextCharge;
    String cancelSubtitleTextNoCharge;
    String cancelSubtitleTextUnassigned;
    List cancelationOptions;
    Map checkBundleIds;
    String courierDialogHeaderMessage;
    String courierDialogHeaderTitle;
    String courierDialogInfoMessage1;
    String courierDialogInfoMessage2;
    String courierDialogInfoTitle1;
    String courierDialogInfoTitle2;
    String courierNoShowPentaltyMessage;
    Long courierPickupCountdownTimeoutDriver;
    String defaultSmsInviteText;
    String destinyDialogHeaderLabel;
    String destinyDialogHeaderText;
    String destinyDialogSectionOneLabel;
    String destinyDialogSectionOneText;
    String destinyDialogSectionTwoLabel;
    String destinyDialogSectionTwoText;
    public Boolean destinyEnabled;
    String destinyEndedModalText;
    String destinyMatchingLabelText;
    String destinyStartedModalText;
    String driverStatsDisclaimer;
    public Boolean enablePassengerRideMapTraffic;
    String endRideConfirmationCancelButton;
    String endRideConfirmationPassengerNotPickedUpButton;
    String endRideConfirmationPassengerPickedUpButton;
    String endRideConfirmationTitle;
    String expressPayAccountIncompleteLink;
    String expressPayDebitCardInfoLink;
    String expressPayIneligibleLink;
    String expressPayInsufficientEarningsLink;
    String expressPayPromoPopUpButtonText;
    String expressPayPromoPopUpText;
    public Boolean fareEstimateEnabled;
    public Boolean featureSearchFallbackEnabled;
    public Boolean heatmapEnabled;
    String heatmapTilesUrl;
    String insuranceHelpCenterUrl;
    InviteSurfacingDTO inviteSurfacingDTO;
    public Boolean lastRideEnabled;
    String multipleOptionsCancelSubtitle;
    Float networkAnalyticsSamplingRate;
    String organizationJoinDescription;
    String organizationJoinHeader;
    String partySizeConfirmationMessage;
    String partySizeConfirmationTitle;
    List placeholderClassicMatchingScreenStrings;
    String placeholderMatchingScreenHeaderString;
    List placeholderMatchingScreenStrings;
    public Integer primeTimeConfirmationThreshold;
    String primeTimeDownSellButtonLabel;
    String primeTimeDownSellDialogLabel;
    List profileFieldseDTOs;
    String referralHeaderText;
    public Boolean rideConfirmationEnabled;
    public Boolean routeDirectionsEnabled;
    public Boolean routeDirectionsIncludeDriver;
    Long routeDirectionsRefreshInterval;
    public Integer searchFallbackThreshold;
    String signupPromoBanner;
    public Boolean smsToDriverEnabled;
    SocialSharing socialSharing;
    String splitPaymentsFeeText;
    List whitelistedUrls;

    public Constants()
    {
    }

    public static Constants empty()
    {
        return NullConstants.getInstance();
    }

    public Long getAutoNavigateDistanceThreshold()
    {
        return (Long)Objects.firstNonNull(autoNavigateDistanceThreshold, DEFAULT_AUTO_NAVIGATION_DISTANCE_THRESHOLD);
    }

    public Long getAutoRestoreDistanceThreshold()
    {
        return (Long)Objects.firstNonNull(autoRestoreDistanceThreshold, DEFAULT_AUTO_RESTORE_DISTANCE_THRESHOLD);
    }

    public String getCancelDetailTextCharge()
    {
        return cancelDetailTextCharge;
    }

    public String getCancelSubtitleTextCharge()
    {
        return cancelSubtitleTextCharge;
    }

    public String getCancelSubtitleTextNoCharge()
    {
        return cancelSubtitleTextNoCharge;
    }

    public String getCancelSubtitleTextUnassigned()
    {
        return cancelSubtitleTextUnassigned;
    }

    public List getCancellationOptions()
    {
        return (List)Objects.firstNonNull(cancelationOptions, Collections.emptyList());
    }

    public Map getCheckBundleIds()
    {
        return (Map)Objects.firstNonNull(checkBundleIds, Collections.emptyMap());
    }

    public String getCourierDialogHeaderMessage()
    {
        return courierDialogHeaderMessage;
    }

    public String getCourierDialogHeaderTitle()
    {
        return courierDialogHeaderTitle;
    }

    public String getCourierDialogInfoMessage1()
    {
        return courierDialogInfoMessage1;
    }

    public String getCourierDialogInfoMessage2()
    {
        return courierDialogInfoMessage2;
    }

    public String getCourierDialogInfoTitle1()
    {
        return courierDialogInfoTitle1;
    }

    public String getCourierDialogInfoTitle2()
    {
        return courierDialogInfoTitle2;
    }

    public String getCourierNoShowPentaltyMessage()
    {
        return (String)Objects.firstNonNull(courierNoShowPentaltyMessage, "");
    }

    public Long getCourierPickupCountdownTimeoutDriver()
    {
        return (Long)Objects.firstNonNull(courierPickupCountdownTimeoutDriver, Long.valueOf(70L));
    }

    public String getDefaultSmsInviteText()
    {
        return (String)Objects.firstNonNull(defaultSmsInviteText, "");
    }

    public String getDestinyDialogHeaderLabel(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogHeaderLabel, s);
    }

    public String getDestinyDialogHeaderText(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogHeaderText, s);
    }

    public String getDestinyDialogSectionOneLabel(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogSectionOneLabel, s);
    }

    public String getDestinyDialogSectionOneText(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogSectionOneText, s);
    }

    public String getDestinyDialogSectionTwoLabel(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogSectionTwoLabel, s);
    }

    public String getDestinyDialogSectionTwoText(String s)
    {
        return (String)Objects.firstNonNull(destinyDialogSectionTwoText, s);
    }

    public String getDestinyEndedModalText(String s)
    {
        return (String)Objects.firstNonNull(destinyEndedModalText, s);
    }

    public String getDestinyMatchingLabelText(String s)
    {
        return (String)Objects.firstNonNull(destinyMatchingLabelText, s);
    }

    public String getDestinyStartedModalText(String s)
    {
        return (String)Objects.firstNonNull(destinyStartedModalText, s);
    }

    public String getDriverStatsDisclaimer()
    {
        return (String)Objects.firstNonNull(driverStatsDisclaimer, "");
    }

    public String getEndRideConfirmationCancelButton()
    {
        return (String)Objects.firstNonNull(endRideConfirmationCancelButton, "");
    }

    public String getEndRideConfirmationPassengerNotPickedUpButton()
    {
        return (String)Objects.firstNonNull(endRideConfirmationPassengerNotPickedUpButton, "");
    }

    public String getEndRideConfirmationPassengerPickedUpButton()
    {
        return (String)Objects.firstNonNull(endRideConfirmationPassengerPickedUpButton, "");
    }

    public String getEndRideConfirmationTitle()
    {
        return (String)Objects.firstNonNull(endRideConfirmationTitle, "");
    }

    public String getExpressPayAccountIncompleteLink()
    {
        return (String)Objects.firstNonNull(expressPayAccountIncompleteLink, "");
    }

    public String getExpressPayDebitCardInfoLink()
    {
        return (String)Objects.firstNonNull(expressPayDebitCardInfoLink, "");
    }

    public String getExpressPayIneligibleLink()
    {
        return (String)Objects.firstNonNull(expressPayIneligibleLink, "");
    }

    public String getExpressPayInsufficientEarningsLink()
    {
        return (String)Objects.firstNonNull(expressPayInsufficientEarningsLink, "");
    }

    public String getExpressPayPromoPopUpButtonText()
    {
        return (String)Objects.firstNonNull(expressPayPromoPopUpButtonText, "");
    }

    public String getExpressPayPromoPopUpText()
    {
        return (String)Objects.firstNonNull(expressPayPromoPopUpText, "");
    }

    public boolean getFeatureSearchFallbackEnabled()
    {
        return ((Boolean)Objects.firstNonNull(featureSearchFallbackEnabled, Boolean.valueOf(false))).booleanValue();
    }

    public String getHeatmapTilesUrl()
    {
        return (String)Objects.firstNonNull(heatmapTilesUrl, "");
    }

    public String getInsuranceHelpCenterUrl()
    {
        if (Strings.isNullOrEmpty(insuranceHelpCenterUrl))
        {
            return "http://lft.to/COI";
        } else
        {
            return insuranceHelpCenterUrl;
        }
    }

    public InviteSurfacingDTO getInviteSurfacingDTO()
    {
        return (InviteSurfacingDTO)Objects.firstNonNull(inviteSurfacingDTO, InviteSurfacingDTO.NULL);
    }

    public String getMultipleOptionsCancelSubtitle()
    {
        return multipleOptionsCancelSubtitle;
    }

    public float getNetworkAnalyticsSamplingRate()
    {
        return ((Float)Objects.firstNonNull(networkAnalyticsSamplingRate, Float.valueOf(0.0F))).floatValue();
    }

    public String getOrganizationJoinDescription()
    {
        return (String)Objects.firstNonNull(organizationJoinDescription, "");
    }

    public String getOrganizationJoinHeader()
    {
        return (String)Objects.firstNonNull(organizationJoinHeader, "");
    }

    public String getPartySizeConfirmationMessage()
    {
        return partySizeConfirmationMessage;
    }

    public String getPartySizeConfirmationTitle()
    {
        return partySizeConfirmationTitle;
    }

    public List getPlaceholderClassicMatchingScreenStrings()
    {
        return (List)Objects.firstNonNull(placeholderClassicMatchingScreenStrings, Collections.emptyList());
    }

    public String getPlaceholderMatchingScreenHeaderString(String s)
    {
        return (String)Objects.firstNonNull(placeholderMatchingScreenHeaderString, s);
    }

    public List getPlaceholderMatchingScreenStrings()
    {
        return (List)Objects.firstNonNull(placeholderMatchingScreenStrings, Collections.emptyList());
    }

    public int getPrimeTimeConfirmationThreshold()
    {
        return ((Integer)Objects.firstNonNull(primeTimeConfirmationThreshold, Integer.valueOf(0))).intValue();
    }

    public String getPrimeTimeDownSellButtonLabel()
    {
        return primeTimeDownSellButtonLabel;
    }

    public String getPrimeTimeDownSellDialogLabel()
    {
        return primeTimeDownSellDialogLabel;
    }

    public List getProfileFields()
    {
        return (List)Objects.firstNonNull(profileFieldseDTOs, Collections.emptyList());
    }

    public String getReferralHeaderText()
    {
        return referralHeaderText;
    }

    public Long getRouteDirectionsRefreshInterval()
    {
        return routeDirectionsRefreshInterval;
    }

    public int getSearchFallbackThreshold()
    {
        return ((Integer)Objects.firstNonNull(searchFallbackThreshold, Integer.valueOf(0))).intValue();
    }

    public String getSignupPromoBanner()
    {
        return signupPromoBanner;
    }

    public SocialSharing getSocialSharing()
    {
        return (SocialSharing)Objects.firstNonNull(socialSharing, SocialSharing.NULL);
    }

    public String getSplitPaymentsFeeText()
    {
        return splitPaymentsFeeText;
    }

    public List getWhitelistedUrls()
    {
        return (List)Objects.firstNonNull(whitelistedUrls, Collections.emptyList());
    }

    public boolean isNull()
    {
        return false;
    }


    private class NullConstants extends Constants
    {

        private static final Constants INSTANCE = new NullConstants();

        static Constants getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        NullConstants()
        {
        }
    }

}
