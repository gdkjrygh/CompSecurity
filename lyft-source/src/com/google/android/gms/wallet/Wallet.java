// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzra;
import com.google.android.gms.wallet.firstparty.zza;
import com.google.android.gms.wallet.wobs.zzj;

// Referenced classes of package com.google.android.gms.wallet:
//            Payments

public final class Wallet
{

    public static final Api a;
    public static final Payments b = new zzqw();
    public static final zzj c = new zzra();
    public static final zza d = new zzqz();
    private static final com.google.android.gms.common.api.Api.ClientKey e;
    private static final com.google.android.gms.common.api.Api.zza f;

    static com.google.android.gms.common.api.Api.ClientKey a()
    {
        return e;
    }

    static 
    {
        e = new com.google.android.gms.common.api.Api.ClientKey();
        f = new com.google.android.gms.common.api.Api.zza() {

            public int a()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client a(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, zze1, (WalletOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzqx a(Context context, Looper looper, zze zze1, WalletOptions walletoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                zzu.b(context instanceof Activity, "An Activity must be used for Wallet APIs");
                context = (Activity)context;
                if (walletoptions == null)
                {
                    walletoptions = new WalletOptions();
                }
                return new zzqx(context, looper, connectioncallbacks, onconnectionfailedlistener, walletoptions.a, zze1.a(), walletoptions.b);
            }


            private class WalletOptions
                implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
            {

                public final int a;
                public final int b;

                private WalletOptions()
                {
                    class Builder
                    {

                        private int a;
                        private int b;

                        static int a(Builder builder)
                        {
                            return builder.a;
                        }

                        static int b(Builder builder)
                        {
                            return builder.b;
                        }

                        public Builder a(int i)
                        {
                            if (i == 0 || i == 2 || i == 1 || i == 3)
                            {
                                a = i;
                                return this;
                            } else
                            {
                                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                                    Integer.valueOf(i)
                                }));
                            }
                        }

                        public WalletOptions a()
                        {
                            return new WalletOptions(this);
                        }

                        public Builder b(int i)
                        {
                            if (i == 0 || i == 1)
                            {
                                b = i;
                                return this;
                            } else
                            {
                                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                                    Integer.valueOf(i)
                                }));
                            }
                        }

                        public Builder()
                        {
                            a = 3;
                            b = 0;
                        }
                    }

                    this(new Builder());
                }


                private WalletOptions(Builder builder)
                {
                    a = Builder.a(builder);
                    b = Builder.b(builder);
                }

            }

        };
        a = new Api("Wallet.API", f, e, new Scope[0]);
    }
}
