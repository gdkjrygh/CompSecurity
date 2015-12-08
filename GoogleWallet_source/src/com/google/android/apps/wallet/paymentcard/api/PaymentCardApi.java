// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.firstparty.FirstPartyWallet;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResult;
import com.google.android.gms.wallet.ia.UpdateInstrumentIntentBuilder;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            EditInstrumentException, PaymentCard

public class PaymentCardApi
{

    public static final int CARD_FAMILY[] = {
        0
    };
    private final Account account;
    private GoogleApiClient client;
    private final CloudConfigurationManager cloudConfigurationManager;
    private final ThreadChecker threadChecker;

    public PaymentCardApi(Account account1, CloudConfigurationManager cloudconfigurationmanager, ThreadChecker threadchecker)
    {
        account = account1;
        cloudConfigurationManager = cloudconfigurationmanager;
        threadChecker = threadchecker;
    }

    public static Intent createAddNewCardIntent(Context context, String s)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.paymentcard.ui.AddNewPaymentCardActivity").putExtra("instrument_add_context", s);
    }

    private Intent createExternalEditIntent(Context context, String s)
        throws InterruptedException, ExecutionException, EditInstrumentException
    {
        Object obj = GetInstrumentsRequest.newBuilder().setFamilyFilter(CARD_FAMILY).build();
        GoogleApiClient googleapiclient = (GoogleApiClient)getGoogleApiClient(context).get();
        obj = ((GetInstrumentsResult)Wallet.FirstPartyWallet.getInstruments(googleapiclient, ((GetInstrumentsRequest) (obj))).await()).getGetInstrumentsResponse();
        String as[] = ((GetInstrumentsResponse) (obj)).getInstrumentIds();
        byte abyte1[][] = ((GetInstrumentsResponse) (obj)).getPaymentInstruments();
        googleapiclient = null;
        int j = 0;
        int k = as.length;
        int i = 0;
        do
        {
label0:
            {
                byte abyte0[] = googleapiclient;
                if (i < k)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    abyte0 = abyte1[j];
                }
                if (abyte0 == null)
                {
                    throw new EditInstrumentException();
                } else
                {
                    return ((UpdateInstrumentIntentBuilder)((UpdateInstrumentIntentBuilder)((UpdateInstrumentIntentBuilder)(new UpdateInstrumentIntentBuilder(context)).setPaymentInstrument(abyte0).setBuyerAccount(account)).setAddressUpgradeRequired(true).setEnvironment(cloudConfigurationManager.getCloudConfig().getPaymentsSdkEnvironment().intValue())).setTheme(1)).build();
                }
            }
            j++;
            i++;
        } while (true);
    }

    public static Intent createPaymentCardDetailsIntent(Context context, String s, Integer integer)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.paymentcard.ui.PaymentCardDetailsActivity").putExtra("id_extra", s).putExtra("instrument_use_extra", integer);
    }

    private Future getGoogleApiClient(Context context)
    {
        String s = account.name;
        int i = cloudConfigurationManager.getCloudConfig().getPaymentsSdkEnvironment().intValue();
        final SettableFuture future = SettableFuture.create();
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

            final PaymentCardApi this$0;
            final SettableFuture val$future;

            public final void onConnected(Bundle bundle)
            {
                future.set(client);
            }

            public final void onConnectionSuspended(int j)
            {
            }

            
            {
                this$0 = PaymentCardApi.this;
                future = settablefuture;
                super();
            }
        };
        client = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addConnectionCallbacks(connectioncallbacks).setAccountName(s).addApi(Wallet.API, (new com.google.android.gms.wallet.Wallet.WalletOptions.Builder()).setEnvironmentUnchecked(i).build()).build();
        client.connect();
        return future;
    }

    public final Intent createEditCardIntent(Context context, PaymentCard paymentcard)
        throws InterruptedException, ExecutionException, EditInstrumentException
    {
        Preconditions.checkNotNull(paymentcard);
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        return createExternalEditIntent(context, paymentcard.getPaymentsSdkId());
    }


}
