// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.text.TextUtils;
import java.util.Calendar;

public final class OmnitureMeasurement
{

    private static final String CHARITY_DETAIL = "a>donatedetails";
    private static final String DONATE_COMPLETE = "a>donatecomplete";
    private static final String DONATE_CONFIRM = "a>donateconfirm";
    private static final String DONATE_POINTS_DEFAULT = "a>donatedefault";
    private static final String EDIT_REWARDS_ADDRESS_MODAL = "a>rewardsinfoedit";
    private static final String EDIT_REWARDS_PHONE_NUMBER_MODAL = "a>rewardsphone";
    private static OmnitureMeasurement INSTANCE;
    private static final Object LINK_ACCOUNT_TO_LOYALTY = "link";
    private static final String LOYALTY_CHANNEL = "Loyalty";
    private static final String LOYALTY_ENROLLMENT_EVENT = "Kohls logged in| Loyalty logged in";
    private static final String LOYALTY_NO_ENROLLMENT_EVENT = "Kohls logged in | Loyalty not logged in";
    private static final String NOT_SIGNENIN_EVENT = "Kohl's not logged in | Loyalty not logged in";
    private static final String NO_CUSTOMER_ID = "No customer id";
    private static final String NO_EMAIL_ID = "No email id";
    private static final String NO_LOYALTY_ID = "No loyalty id";
    public static final String OMNI_CURRENCY = "USD";
    private static final String REWARDS_ACTIVITY_DETAILS_PAGE = "a>rewardsactivitydetails";
    private static final String REWARDS_ACTIVITY_PAGE = "a>rewardsactivity";
    private static final String REWARDS_BIRTHDAY_MODAL = "a>rewardsbirthday";
    private static final String REWARDS_CARD_PAGE = "a>digitalrewardscard";
    private static final String REWARDS_ENROLLMENT_PAGE = "a>rewardsenrollment";
    private static final String REWARDS_FAQ_PAGE = "a>rewardfaq";
    private static final String REWARDS_HOME_PAGE = "a>rewardshome";
    private static final String REWARDS_INFO = "a>rewardsinfo";
    private static final String REWARDS_PROGRAM_DETAIL_PAGE = "a>rewardsprogramdetails";
    private static final String REWARDS_TnC_PAGE = "a>rewardtandc";
    private static final String SHARE_COMPLETE = "a>sharecomplete";
    private static final String SHARE_CONFIRM = "a>shareconfirm";
    private static final String SHARE_CUSTOMER_FOUND = "a>sharecustfound";
    private static final String SHARE_DEFAULT = "a>sharedefault";
    private static final Object SIGN_UP_INTO_LOYALTY = "signup";
    private static final String WALLET_MY_REWARDS_PAGE = "a>wallet-kc-rewards-detail";
    Calendar mCalendar;

    private OmnitureMeasurement()
    {
        mCalendar = Calendar.getInstance();
    }

    private void clearLoyaltyVars()
    {
    }

    public static OmnitureMeasurement getInstance()
    {
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorenter ;
        OmnitureMeasurement omnituremeasurement;
        if (INSTANCE == null)
        {
            INSTANCE = new OmnitureMeasurement();
        }
        omnituremeasurement = INSTANCE;
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorexit ;
        return omnituremeasurement;
        Exception exception;
        exception;
        throw exception;
    }

    public static void init()
    {
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorenter ;
        if (INSTANCE != null)
        {
            throw new IllegalStateException("OmnitureMeasurement were already initialized");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorexit ;
        throw exception;
        INSTANCE = new OmnitureMeasurement();
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorexit ;
    }

    public static boolean isInitialized()
    {
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorenter ;
        OmnitureMeasurement omnituremeasurement = INSTANCE;
        boolean flag;
        if (omnituremeasurement != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/kohls/mcommerce/opal/wallet/util/OmnitureMeasurement;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void performCleanup()
    {
    }

    private void setLoyaltyEnrollmentEvents(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    private void setLoyaltyEvents(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    private void setNonHomeWalletEvents()
    {
    }

    private void setWalletEvents()
    {
    }

    public void setAccountSignUpEvents(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setCharityDetailsEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setConfig(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Omniture account not properly configured.");
        } else
        {
            return;
        }
    }

    public void setDonateCompleteEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setDonateConfirmEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setDonatePointsEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setEditRewardsAddressEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setEditRewardsPhoneEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setLoyaltyErrorEvents(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setOffersShareEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardCardPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsActivityDetailsPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsActivityPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsBirthdayEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsEnrollmentPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsFaqPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsHomePageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsInfoEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsProgDetailPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setRewardsTnCPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setShareCompleteEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setShareConfirmEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setShareCustFoundEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setSharePointsEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setWalletMyRewardsCardPageEvents()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackBarCodeScannedAndReadable(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackBarCodeUnsuccessfulScan()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackClickToCallCancelled(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackClickToCallDialedNumber(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackMyInfoView(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackPageView(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(s))
        {
            throw new NullPointerException("pageName");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        this;
        JVM INSTR monitorexit ;
    }

    public void trackQRCodeSuccessfulScan(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackQRCodeUnsuccessfulScan()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackScanNSearchClicked()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackSharingChannel(boolean flag, String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackSharingPageURL(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackStoreLocatorClicked()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void trackStoreLocatorDefaultStore(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void tracksearchTerms(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletDeleteCashRequest()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletDeleteConfirmation(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletDeleteOfferRequest()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletHomeCash(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletManualScan(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletReminder()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletScan()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletScanError()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void walletdesc(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

}
