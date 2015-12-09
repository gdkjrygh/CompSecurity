// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.xn;
import com.google.android.gms.internal.xp;
import com.google.android.gms.wallet.firstparty.FirstPartyWallet;
import com.google.android.gms.wallet.wobs.WalletObjects;

// Referenced classes of package com.google.android.gms.wallet:
//            Payments

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

        private int aUz;
        private int mTheme;

        static int a(WalletOptions.Builder builder)
        {
            return builder.aUz;
        }

        static int b(WalletOptions.Builder builder)
        {
            return builder.mTheme;
        }

        public final WalletOptions build()
        {
            return new WalletOptions(this);
        }

        public final WalletOptions.Builder setEnvironmentUnchecked(int i)
        {
            aUz = i;
            return this;
        }

        public WalletOptions.Builder()
        {
            aUz = 0;
            mTheme = 0;
        }
    }

    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(Wallet.uV(), googleapiclient);
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.b CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.c CLIENT_KEY;
    public static final FirstPartyWallet FirstPartyWallet = new xp();
    public static final Payments Payments = new Payments();
    public static final WalletObjects WalletObjects = new WalletObjects();

    static com.google.android.gms.common.api.Api.c uV()
    {
        return CLIENT_KEY;
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.c();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.b() {

            private static xn a$33a2cb56(Context context, Looper looper, jw jw1, WalletOptions walletoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                kn.b(context instanceof Activity, "An Activity must be used for Wallet APIs");
                context = (Activity)context;
                if (walletoptions == null)
                {
                    walletoptions = new WalletOptions();
                }
                return new xn(context, looper, connectioncallbacks, onconnectionfailedlistener, walletoptions.environment, jw1.getAccountName(), walletoptions.theme);
            }

            public final volatile com.google.android.gms.common.api.Api.a a$28a3456d(Context context, Looper looper, jw jw1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a$33a2cb56(context, looper, jw1, (WalletOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CLIENT_BUILDER, CLIENT_KEY, new Scope[0]);
    }
}
