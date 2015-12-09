// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.common.inject.ApplicationModule;
import com.google.android.apps.common.inject.SystemServiceModule;
import com.google.android.apps.wallet.account.AccountModule;
import com.google.android.apps.wallet.app.migration.MigrationModule;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApiModule;
import com.google.android.apps.wallet.base.fragment.FragmentModule;
import com.google.android.apps.wallet.cardlist.CardListModule;
import com.google.android.apps.wallet.config.featurecontrol.FeatureModule;
import com.google.android.apps.wallet.config.sharedpreferences.UserScopedSharedPreferenceModule;
import com.google.android.apps.wallet.datastore.DatastoreModule;
import com.google.android.apps.wallet.encryption.EncryptionModule;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModule;
import com.google.android.apps.wallet.geofencing.GeofencingModule;
import com.google.android.apps.wallet.hce.WalletHceModule;
import com.google.android.apps.wallet.hce.setup.HceSetupModule;
import com.google.android.apps.wallet.hce.setup.setupstate.HceSetupStateModule;
import com.google.android.apps.wallet.imageio.ImageIoModule;
import com.google.android.apps.wallet.init.InitModule;
import com.google.android.apps.wallet.init.InitializerModule;
import com.google.android.apps.wallet.kyc.api.KycApiModule;
import com.google.android.apps.wallet.locale.LocaleModule;
import com.google.android.apps.wallet.locale.UserScopedLocaleModule;
import com.google.android.apps.wallet.location.api.LocationApiModule;
import com.google.android.apps.wallet.log.UserScopedLogModule;
import com.google.android.apps.wallet.mywallet.MyWalletModule;
import com.google.android.apps.wallet.navdrawer.NavDrawerModule;
import com.google.android.apps.wallet.network.NetworkModule;
import com.google.android.apps.wallet.nfc.NfcModule;
import com.google.android.apps.wallet.notifications.NotificationsModule;
import com.google.android.apps.wallet.p2p.P2PModule;
import com.google.android.apps.wallet.p2p.people.PeopleModule;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApiModule;
import com.google.android.apps.wallet.plastic.PlasticCardModule;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordModule;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupModule;
import com.google.android.apps.wallet.reset.ResetModule;
import com.google.android.apps.wallet.restrictioncheck.RestrictionCheckModule;
import com.google.android.apps.wallet.rpc.RpcModule;
import com.google.android.apps.wallet.settings.SettingsModule;
import com.google.android.apps.wallet.storedvalue.StoredValueModule;
import com.google.android.apps.wallet.transfer.api.TransferApiModule;
import com.google.android.apps.wallet.userscope.CurrentUserModule;
import com.google.android.apps.wallet.wobs.add.AddWobsModule;
import com.google.android.apps.wallet.wobs.caching.WobsCachingModule;
import com.google.android.apps.wallet.wobs.provider.LayoutContextParametersModule;
import com.google.android.apps.wallet.wobs.provider.WobsProviderModule;
import com.google.android.apps.wallet.wobs.upload.UploadModule;
import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            UserScopeSingletonsModule, RpcMetaDataProcessorModule, WalletUserModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        com/google/android/apps/common/inject/ApplicationModule, com/google/android/apps/common/inject/SystemServiceModule, com/google/android/apps/wallet/app/modules/UserScopeSingletonsModule, com/google/android/apps/wallet/account/AccountModule, com/google/android/apps/wallet/wobs/add/AddWobsModule, com/google/android/apps/wallet/bankaccount/api/BankAccountApiModule, com/google/android/apps/wallet/cardlist/CardListModule, com/google/android/apps/wallet/userscope/CurrentUserModule, com/google/android/apps/wallet/datastore/DatastoreModule, com/google/android/apps/wallet/config/featurecontrol/FeatureModule, 
        com/google/android/apps/wallet/base/fragment/FragmentModule, com/google/android/apps/wallet/geofencing/GeofencingModule, com/google/android/apps/wallet/imageio/ImageIoModule, com/google/android/apps/wallet/init/InitModule, com/google/android/apps/wallet/encryption/EncryptionModule, com/google/android/apps/wallet/hce/setup/HceSetupModule, com/google/android/apps/wallet/hce/setup/setupstate/HceSetupStateModule, com/google/android/apps/wallet/init/InitializerModule, com/google/android/apps/wallet/kyc/api/KycApiModule, com/google/android/apps/wallet/wobs/provider/LayoutContextParametersModule, 
        com/google/android/apps/wallet/locale/LocaleModule, com/google/android/apps/wallet/location/api/LocationApiModule, com/google/android/apps/wallet/app/migration/MigrationModule, com/google/android/apps/wallet/mywallet/MyWalletModule, com/google/android/apps/wallet/network/NetworkModule, com/google/android/apps/wallet/notifications/NotificationsModule, com/google/android/apps/wallet/nfc/NfcModule, com/google/android/apps/wallet/navdrawer/NavDrawerModule, com/google/android/apps/wallet/p2p/P2PModule, com/google/android/apps/wallet/paymentcard/api/PaymentCardApiModule, 
        com/google/android/apps/wallet/p2p/people/PeopleModule, com/google/android/apps/wallet/plastic/PlasticCardModule, com/google/android/apps/wallet/purchaserecord/PurchaseRecordModule, com/google/android/apps/wallet/recurringtopup/RecurringTopupModule, com/google/android/apps/wallet/reset/ResetModule, com/google/android/apps/wallet/restrictioncheck/RestrictionCheckModule, com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, com/google/android/apps/wallet/rpc/RpcModule, com/google/android/apps/wallet/settings/SettingsModule, com/google/android/apps/wallet/storedvalue/StoredValueModule, 
        com/google/android/apps/wallet/frontinginstrument/TapAndPayModule, com/google/android/apps/wallet/transfer/api/TransferApiModule, com/google/android/apps/wallet/wobs/upload/UploadModule, com/google/android/apps/wallet/locale/UserScopedLocaleModule, com/google/android/apps/wallet/log/UserScopedLogModule, com/google/android/apps/wallet/config/sharedpreferences/UserScopedSharedPreferenceModule, com/google/android/apps/wallet/hce/WalletHceModule, com/google/android/apps/wallet/wobs/caching/WobsCachingModule, com/google/android/apps/wallet/wobs/provider/WobsProviderModule
    };
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.config.featurecontrol.Feature$SupportedFeaturePredicateStub", "members/com.google.android.apps.wallet.notifications.C2dmDispatchService", "members/com.google.android.apps.wallet.account.LoginAccountsChangedService", "members/com.google.android.apps.wallet.hce.setup.NfcPaymentSetupService", "members/com.google.android.apps.wallet.init.OnBootOrUpgradeService", "members/com.google.android.apps.wallet.notifications.NotificationService", "members/com.google.android.apps.wallet.geofencing.service.GeofencingNotificationService", "members/com.google.android.apps.wallet.geofencing.service.GeofencingService", "members/com.google.android.apps.wallet.log.EventLogUploadService", "members/com.google.android.apps.wallet.globalresources.GlobalResourcesSyncService", 
        "members/com.google.android.apps.wallet.hce.HceTapProcessorService", "members/com.google.android.apps.wallet.hce.setup.PaymentBundleRefreshService", "members/com.google.android.apps.wallet.notifications.C2dmRegistrationReceiver", "members/com.google.android.apps.wallet.geofencing.service.GeofencingReceiver", "members/com.google.android.apps.wallet.nfc.NfcAdapterStateReceiver", "members/com.google.android.apps.wallet.init.OnBootOrUpgradeReceiver", "members/com.google.android.apps.wallet.init.ClearNotificationsTask", "members/com.google.android.apps.wallet.init.CombinedBackgroundInitializerTask", "members/com.google.android.apps.wallet.init.CombinedSyncTask", "members/com.google.android.apps.wallet.pin.ExpirePinTask", 
        "members/com.google.android.apps.wallet.pin.FetchCloudPinStateTask", "members/com.google.android.apps.wallet.init.LoadGlobalResourcesTask", "members/com.google.android.apps.wallet.init.MarkBootTasksCompletedTask", "members/com.google.android.apps.wallet.hce.setup.SetupHceOnBootTask", "members/com.google.android.apps.wallet.init.EagerSingletonInitializer", "members/com.google.android.apps.wallet.eventbus.InitializeEventPublishersTask", "members/com.google.android.apps.wallet.paymentcard.widgets.CardDrawable", "members/com.google.android.apps.wallet.widgets.address.AddressView", "members/com.google.android.apps.wallet.webview.HybridWebView", "members/com.google.android.apps.wallet.p2p.IncomingMoneyRequestView", 
        "members/com.google.android.apps.wallet.p2p.SenderRowView", "members/com.google.android.apps.wallet.wobs.wobl.view.WoblFetchedImageView", "members/com.google.android.apps.wallet.usersetup.ZipCodeView", "members/com.google.android.apps.wallet.userevents.UserEventLogger", "members/com.google.android.apps.wallet.transfer.api.FundsTransferInfoPublisher"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final WalletUserModule newModule()
    {
        return new WalletUserModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ferenceModule()
    {
        super(com/google/android/apps/wallet/app/modules/WalletUserModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
