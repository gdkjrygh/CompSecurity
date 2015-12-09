// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            UserScopeSingletonsModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.config.appcontrol.AppControl", "members/com.google.android.apps.wallet.pin.AppPinToken", "members/com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher", "members/com.google.android.apps.wallet.bankaccount.api.BankAccountsModelRpcCache", "members/com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEventPublisher", "members/com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", "members/com.google.android.apps.wallet.device.DeviceClient", "members/com.google.android.apps.wallet.log.DeviceContextFactory", "members/com.google.android.apps.wallet.device.DeviceInfoManager", "members/com.google.android.apps.wallet.eventbus.EventBus", 
        "members/com.google.android.apps.wallet.log.EventLogDataStore", "members/com.google.android.apps.wallet.log.EventLogDispatcher", "members/com.google.android.apps.wallet.eventbus.EventPublishersInitializationState", "members/com.google.android.apps.wallet.config.featurecontrol.FeatureManager", "members/com.google.android.apps.wallet.cardlist.FrontingInstrumentClient", "members/com.google.android.apps.wallet.transfer.api.FundsTransferInfoPublisher", "members/com.google.android.apps.wallet.geofencing.service.GeofencingNotificationClient", "members/com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", "members/com.google.android.apps.wallet.settings.ui.GeofencingSettingsChecker", "members/com.google.android.apps.wallet.giftcard.GiftCardsClient", 
        "members/com.google.android.apps.wallet.globalresources.GlobalResourceManager", "members/com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", "members/com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", "members/com.google.android.apps.wallet.hce.database.HceLibraryDatabase", "members/com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", "members/com.google.android.apps.wallet.webview.HybridWebViewManager", "members/com.google.android.apps.wallet.wobs.upload.ImageUploadManager", "members/com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsManager", "members/com.google.android.apps.wallet.encryption.KeyczarBillingKeysEncryptionService", "members/com.google.android.apps.wallet.kyc.api.KycClient", 
        "members/com.google.android.apps.wallet.kyc.api.KycExperimentPublisher", "members/com.google.android.apps.wallet.kyc.api.KycStatusPublisher", "members/com.google.android.apps.wallet.locale.LocaleChangedEventPublisher", "members/com.google.android.apps.wallet.locale.LocalePreferenceUpdater", "members/com.google.android.apps.wallet.loyalty.LoyaltyApiClient", "members/com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient", "members/com.google.android.apps.wallet.navdrawer.NavDrawerPublisher", "members/com.google.android.apps.wallet.network.NetworkConnectivityEventPublisher", "members/com.google.android.apps.wallet.network.NetworkInformationProvider", "members/com.google.android.apps.wallet.nfc.NfcAdapterStateEventPublisher", 
        "members/com.google.android.apps.wallet.hce.setup.NfcFeatureDisabledListener", "members/com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", "members/com.google.android.apps.wallet.notifications.NotificationClient", "members/com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher", "members/com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher", "members/com.google.android.apps.wallet.pin.PinTokenRequestProcessor", "members/com.google.android.apps.wallet.plastic.PlasticCardModelPublisher", "members/com.google.android.apps.wallet.preferences.PreferenceClient", "members/com.google.android.apps.wallet.keys.PublicKeysManager", "members/com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher", 
        "members/com.google.android.apps.wallet.rpc.ResponseMetadataProcessor", "members/com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityPublisher", "members/com.google.android.apps.wallet.recurringtopup.RecurringTopupPublisher", "members/com.google.android.apps.wallet.log.SLog", "members/com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher", "members/com.google.android.apps.wallet.wobs.provider.SyncWobsStatusPublisher", "members/com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher", "members/com.google.android.apps.wallet.user.UserInfoManager", "members/com.google.android.apps.wallet.p2p.people.UserProfilePhotoPublisher", "members/com.google.android.apps.wallet.settings.UserSettingsPublisher", 
        "members/com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionPublisher", "members/com.google.android.apps.wallet.datastore.WalletDatabaseHelper", "members/com.google.android.apps.wallet.log.WalletEventLogger", "members/com.google.android.apps.wallet.hce.tap.WalletHceContext", "members/com.google.android.apps.wallet.init.WalletInitializerTaskManager", "members/com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker", "members/com.google.android.apps.wallet.wobs.caching.WobsManager"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final UserScopeSingletonsModule newModule()
    {
        return new UserScopeSingletonsModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public Y()
    {
        super(com/google/android/apps/wallet/app/modules/UserScopeSingletonsModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
