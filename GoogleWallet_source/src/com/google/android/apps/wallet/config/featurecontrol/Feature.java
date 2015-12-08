// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import dagger.Lazy;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureState

public class Feature extends Enum
{
    public static class SupportedFeaturePredicateStub
    {

        Lazy hceSupported;

        public SupportedFeaturePredicateStub()
        {
        }
    }


    private static final Feature $VALUES[];
    public static final Feature BANK_ACCOUNT;
    public static final Feature CLAIM_TO_BANK_ACCOUNT;
    private static final Map CODE_TO_FEATURE;
    public static final Feature DYNAMIC_MY_WALLET;
    public static final Feature FAST_WOBL;
    public static final Feature GIFT_CARDS_USER_ADDED;
    public static final Feature KYC_GB;
    public static final Feature LOCATION_REPORTING;
    public static final Feature LOW_BALANCE_ALERT;
    public static final Feature LOYALTY_DISCOVERABLES;
    public static final Feature LOYALTY_USER_ADDED;
    public static final Feature NFC_HCE_PPMS;
    public static final Feature NFC_TAP_AND_PAY_FINDER;
    public static final Feature OFFERS_SAVED;
    public static final Feature ONEVIEW;
    public static final Feature P2P_REQUEST_PAYMENT;
    public static final Feature P2P_SEND_MONEY;
    public static final Feature PAYMENT_CARDS_OCR;
    public static final Feature SCHEDULED_STORED_VALUE_TOPUP;
    private static final Iterable SERVER_CONTROLLED_FEATURES;
    public static final Feature SERVER_LOGGING;
    public static final Feature SHOW_CONFIDENTIAL_DIALOG;
    public static final Feature SIMPLIFIED_SETUP;
    public static final Feature STORED_VALUE_BALANCE;
    public static final Feature STORED_VALUE_STATEMENTS;
    public static final Feature STORED_VALUE_TOPUP;
    public static final Feature STORED_VALUE_WITHDRAWAL;
    public static final Feature TRANSACTIONS_USE_WOBL;
    public static final Feature TRANSACTION_HISTORY_SEARCH;
    public static final Feature TRANSACTION_LIST;
    public static final Feature TRANSACTION_RICH_MERCHANT_DETAILS;
    public static final Feature UNIFIED_KYC_FLOW;
    public static final Feature USE_ANDROID_GCM;
    public static final Feature WALLET_CARD;
    public static final Feature WALLET_CARD_CANCEL;
    public static final Feature WALLET_CARD_LOCK;
    public static final Feature WOBL_PROTO;
    public static final Feature WOBS_CAMERA_RECOGNITION;
    public static final Feature WOBS_CAMERA_RECOGNITION_SERVER_UPLOAD;
    public static final Feature WOBS_GEOFENCING;
    public static final Feature WOB_NOTIFICATION_FEEDBACK;
    static Function stubFactoryAndInjector = new Function() {

        private static SupportedFeaturePredicateStub apply(Application application)
        {
            SupportedFeaturePredicateStub supportedfeaturepredicatestub = new SupportedFeaturePredicateStub();
            UserInjector.inject(supportedfeaturepredicatestub, application);
            return supportedfeaturepredicatestub;
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Application)obj);
        }

    };
    private Integer code;
    private FeatureState featureState;

    private Feature(String s, int i, FeatureState featurestate)
    {
        super(s, i);
        Preconditions.checkNotNull(featurestate);
        featureState = featurestate;
    }

    private Feature(String s, int i, FeatureState featurestate, Integer integer)
    {
        super(s, i);
        Preconditions.checkNotNull(integer);
        Preconditions.checkNotNull(featurestate);
        featureState = featurestate;
        code = integer;
    }


    public static Feature getFeatureForCode(Integer integer)
    {
        Preconditions.checkNotNull(integer);
        return (Feature)CODE_TO_FEATURE.get(integer);
    }

    public static Iterable getServerControlledFeatures()
    {
        return SERVER_CONTROLLED_FEATURES;
    }

    public static Feature valueOf(String s)
    {
        return (Feature)Enum.valueOf(com/google/android/apps/wallet/config/featurecontrol/Feature, s);
    }

    public static Feature[] values()
    {
        return (Feature[])$VALUES.clone();
    }

    public final Integer getFeatureCode()
    {
        return (Integer)Preconditions.checkNotNull(code);
    }

    public final FeatureState getFeatureState()
    {
        return featureState;
    }

    public final boolean isServerControlled()
    {
        return code != null;
    }

    public Boolean isSupported(Application application)
    {
        return Boolean.TRUE;
    }

    static 
    {
        CLAIM_TO_BANK_ACCOUNT = new Feature("CLAIM_TO_BANK_ACCOUNT", 0, FeatureState.PRODUCTION);
        DYNAMIC_MY_WALLET = new Feature("DYNAMIC_MY_WALLET", 1, FeatureState.PRODUCTION);
        FAST_WOBL = new Feature("FAST_WOBL", 2, FeatureState.PRODUCTION);
        NFC_TAP_AND_PAY_FINDER = new Feature("NFC_TAP_AND_PAY_FINDER", 3, FeatureState.OFF);
        SERVER_LOGGING = new Feature("SERVER_LOGGING", 4, FeatureState.PRODUCTION);
        SHOW_CONFIDENTIAL_DIALOG = new Feature("SHOW_CONFIDENTIAL_DIALOG", 5, FeatureState.DOGFOOD);
        SIMPLIFIED_SETUP = new Feature("SIMPLIFIED_SETUP", 6, FeatureState.OFF);
        TRANSACTIONS_USE_WOBL = new Feature("TRANSACTIONS_USE_WOBL", 7, FeatureState.PRODUCTION);
        TRANSACTION_HISTORY_SEARCH = new Feature("TRANSACTION_HISTORY_SEARCH", 8, FeatureState.PRODUCTION);
        TRANSACTION_RICH_MERCHANT_DETAILS = new Feature("TRANSACTION_RICH_MERCHANT_DETAILS", 9, FeatureState.PRODUCTION);
        UNIFIED_KYC_FLOW = new Feature("UNIFIED_KYC_FLOW", 10, FeatureState.PRODUCTION);
        USE_ANDROID_GCM = new Feature("USE_ANDROID_GCM", 11, FeatureState.PRODUCTION);
        WALLET_CARD_CANCEL = new Feature("WALLET_CARD_CANCEL", 12, FeatureState.PRODUCTION);
        WALLET_CARD_LOCK = new Feature("WALLET_CARD_LOCK", 13, FeatureState.PRODUCTION);
        WOB_NOTIFICATION_FEEDBACK = new Feature("WOB_NOTIFICATION_FEEDBACK", 14, FeatureState.DOGFOOD);
        BANK_ACCOUNT = new Feature("BANK_ACCOUNT", 15, FeatureState.PRODUCTION, Integer.valueOf(1000));
        GIFT_CARDS_USER_ADDED = new Feature("GIFT_CARDS_USER_ADDED", 16, FeatureState.PRODUCTION, Integer.valueOf(1101));
        KYC_GB = new Feature("KYC_GB", 17, FeatureState.DEV, Integer.valueOf(1601));
        LOCATION_REPORTING = new Feature("LOCATION_REPORTING", 18, FeatureState.PRODUCTION, Integer.valueOf(1200));
        LOW_BALANCE_ALERT = new Feature("LOW_BALANCE_ALERT", 19, FeatureState.PRODUCTION, Integer.valueOf(306));
        LOYALTY_DISCOVERABLES = new Feature("LOYALTY_DISCOVERABLES", 20, FeatureState.PRODUCTION, Integer.valueOf(600));
        LOYALTY_USER_ADDED = new Feature("LOYALTY_USER_ADDED", 21, FeatureState.PRODUCTION, Integer.valueOf(601));
        NFC_HCE_PPMS = new Feature("NFC_HCE_PPMS", 22, FeatureState.PRODUCTION, Integer.valueOf(201)) {

            public final Boolean isSupported(Application application)
            {
                return (Boolean)((SupportedFeaturePredicateStub)stubFactoryAndInjector.apply(application)).hceSupported.get();
            }

        };
        OFFERS_SAVED = new Feature("OFFERS_SAVED", 23, FeatureState.PRODUCTION, Integer.valueOf(500));
        ONEVIEW = new Feature("ONEVIEW", 24, FeatureState.PRODUCTION, Integer.valueOf(1700));
        P2P_REQUEST_PAYMENT = new Feature("P2P_REQUEST_PAYMENT", 25, FeatureState.PRODUCTION, Integer.valueOf(102));
        P2P_SEND_MONEY = new Feature("P2P_SEND_MONEY", 26, FeatureState.PRODUCTION, Integer.valueOf(100));
        PAYMENT_CARDS_OCR = new Feature("PAYMENT_CARDS_OCR", 27, FeatureState.PRODUCTION, Integer.valueOf(900));
        SCHEDULED_STORED_VALUE_TOPUP = new Feature("SCHEDULED_STORED_VALUE_TOPUP", 28, FeatureState.PRODUCTION, Integer.valueOf(304));
        STORED_VALUE_BALANCE = new Feature("STORED_VALUE_BALANCE", 29, FeatureState.PRODUCTION, Integer.valueOf(300));
        STORED_VALUE_STATEMENTS = new Feature("STORED_VALUE_STATEMENTS", 30, FeatureState.PRODUCTION, Integer.valueOf(303));
        STORED_VALUE_TOPUP = new Feature("STORED_VALUE_TOPUP", 31, FeatureState.PRODUCTION, Integer.valueOf(301));
        STORED_VALUE_WITHDRAWAL = new Feature("STORED_VALUE_WITHDRAWAL", 32, FeatureState.PRODUCTION, Integer.valueOf(302));
        TRANSACTION_LIST = new Feature("TRANSACTION_LIST", 33, FeatureState.PRODUCTION, Integer.valueOf(400));
        WALLET_CARD = new Feature("WALLET_CARD", 34, FeatureState.PRODUCTION, Integer.valueOf(700));
        WOBL_PROTO = new Feature("WOBL_PROTO", 35, FeatureState.PRODUCTION, Integer.valueOf(1902));
        WOBS_CAMERA_RECOGNITION = new Feature("WOBS_CAMERA_RECOGNITION", 36, FeatureState.PRODUCTION, Integer.valueOf(1300));
        WOBS_CAMERA_RECOGNITION_SERVER_UPLOAD = new Feature("WOBS_CAMERA_RECOGNITION_SERVER_UPLOAD", 37, FeatureState.PRODUCTION, Integer.valueOf(1301));
        WOBS_GEOFENCING = new Feature("WOBS_GEOFENCING", 38, FeatureState.PRODUCTION, Integer.valueOf(1302));
        $VALUES = (new Feature[] {
            CLAIM_TO_BANK_ACCOUNT, DYNAMIC_MY_WALLET, FAST_WOBL, NFC_TAP_AND_PAY_FINDER, SERVER_LOGGING, SHOW_CONFIDENTIAL_DIALOG, SIMPLIFIED_SETUP, TRANSACTIONS_USE_WOBL, TRANSACTION_HISTORY_SEARCH, TRANSACTION_RICH_MERCHANT_DETAILS, 
            UNIFIED_KYC_FLOW, USE_ANDROID_GCM, WALLET_CARD_CANCEL, WALLET_CARD_LOCK, WOB_NOTIFICATION_FEEDBACK, BANK_ACCOUNT, GIFT_CARDS_USER_ADDED, KYC_GB, LOCATION_REPORTING, LOW_BALANCE_ALERT, 
            LOYALTY_DISCOVERABLES, LOYALTY_USER_ADDED, NFC_HCE_PPMS, OFFERS_SAVED, ONEVIEW, P2P_REQUEST_PAYMENT, P2P_SEND_MONEY, PAYMENT_CARDS_OCR, SCHEDULED_STORED_VALUE_TOPUP, STORED_VALUE_BALANCE, 
            STORED_VALUE_STATEMENTS, STORED_VALUE_TOPUP, STORED_VALUE_WITHDRAWAL, TRANSACTION_LIST, WALLET_CARD, WOBL_PROTO, WOBS_CAMERA_RECOGNITION, WOBS_CAMERA_RECOGNITION_SERVER_UPLOAD, WOBS_GEOFENCING
        });
        SERVER_CONTROLLED_FEATURES = Iterables.filter(EnumSet.allOf(com/google/android/apps/wallet/config/featurecontrol/Feature), new Predicate() {

            private static boolean apply(Feature feature1)
            {
                return feature1.isServerControlled();
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((Feature)obj);
            }

        });
        CODE_TO_FEATURE = Maps.newHashMap();
        Feature feature;
        for (Iterator iterator = SERVER_CONTROLLED_FEATURES.iterator(); iterator.hasNext(); CODE_TO_FEATURE.put(feature.getFeatureCode(), feature))
        {
            feature = (Feature)iterator.next();
        }

    }
}
