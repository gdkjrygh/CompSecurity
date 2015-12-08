// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ix;

// Referenced classes of package com.google.android.gms.identity.intents:
//            UserAddressRequest

public final class Address
{
    public static final class AddressOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        public final int theme;

        public AddressOptions()
        {
            theme = 0;
        }

        public AddressOptions(int i)
        {
            theme = i;
        }
    }

    private static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        public a()
        {
            super(Address.yE);
        }
    }


    public static final Api API;
    static final com.google.android.gms.common.api.Api.c yE;
    private static final com.google.android.gms.common.api.Api.b yF;

    public Address()
    {
    }

    public static void requestUserAddress(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
    {
        googleapiclient.a(new a(useraddressrequest, i) {

            final int UA;
            final UserAddressRequest Uz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ix)a1);
            }

            protected void a(ix ix1)
                throws RemoteException
            {
                ix1.a(Uz, UA);
                b(Status.Ek);
            }

            
            {
                Uz = useraddressrequest;
                UA = i;
                super();
            }
        });
    }

    static 
    {
        yE = new com.google.android.gms.common.api.Api.c();
        yF = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gz gz1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gz1, (AddressOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ix a(Context context, Looper looper, gz gz1, AddressOptions addressoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                hn.b(context instanceof Activity, "An Activity must be used for Address APIs");
                AddressOptions addressoptions1 = addressoptions;
                if (addressoptions == null)
                {
                    addressoptions1 = new AddressOptions();
                }
                return new ix((Activity)context, looper, connectioncallbacks, onconnectionfailedlistener, gz1.getAccountName(), addressoptions1.theme);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yF, yE, new Scope[0]);
    }
}
