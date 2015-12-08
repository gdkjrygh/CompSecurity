// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.pv;
import com.google.android.gms.internal.qg;
import com.google.android.gms.internal.qh;
import com.google.android.gms.internal.qj;
import com.google.android.gms.internal.qk;
import com.google.android.gms.wallet.wobs.r;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.wallet:
//            Payments, FullWalletRequest, MaskedWalletRequest, NotifyTransactionStatusRequest

public final class Wallet
{
    public static final class WalletOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        public final int environment;
        public final int theme;

        private WalletOptions()
        {
            this(new Builder());
        }


        private WalletOptions(Builder builder)
        {
            environment = Builder.a(builder);
            theme = Builder.b(builder);
        }

    }

    public static final class WalletOptions.Builder
    {

        private int avV;
        private int mTheme;

        static int a(WalletOptions.Builder builder)
        {
            return builder.avV;
        }

        static int b(WalletOptions.Builder builder)
        {
            return builder.mTheme;
        }

        public WalletOptions build()
        {
            return new WalletOptions(this);
        }

        public WalletOptions.Builder setEnvironment(int i)
        {
            if (i == 0 || i == 2 || i == 1)
            {
                avV = i;
                return this;
            } else
            {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public WalletOptions.Builder setTheme(int i)
        {
            if (i == 0 || i == 1)
            {
                mTheme = i;
                return this;
            } else
            {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public WalletOptions.Builder()
        {
            avV = 0;
            mTheme = 0;
        }
    }

    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(Wallet.re(), googleapiclient);
        }
    }

    public static abstract class b extends a
    {

        protected Status b(Status status)
        {
            return status;
        }

        protected Result c(Status status)
        {
            return b(status);
        }

        public b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static final Payments Payments = new qg();
    public static final r avT = new qk();
    public static final pv avU = new qj();

    private Wallet()
    {
    }

    public static void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        Payments.changeMaskedWallet(googleapiclient, s, s1, i);
    }

    public static void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        Payments.checkForPreAuthorization(googleapiclient, i);
    }

    public static void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        Payments.loadFullWallet(googleapiclient, fullwalletrequest, i);
    }

    public static void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        Payments.loadMaskedWallet(googleapiclient, maskedwalletrequest, i);
    }

    public static void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        Payments.notifyTransactionStatus(googleapiclient, notifytransactionstatusrequest);
    }

    static com.google.android.gms.common.api.Api.c re()
    {
        return DQ;
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, jg1, (WalletOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public qh a(Context context, Looper looper, jg jg1, WalletOptions walletoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                jx.b(context instanceof Activity, "An Activity must be used for Wallet APIs");
                context = (Activity)context;
                if (walletoptions == null)
                {
                    walletoptions = new WalletOptions();
                }
                return new qh(context, looper, connectioncallbacks, onconnectionfailedlistener, walletoptions.environment, jg1.getAccountName(), walletoptions.theme);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(DR, DQ, new Scope[0]);
    }
}
