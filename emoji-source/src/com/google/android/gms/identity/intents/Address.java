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
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.iw;

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
            super(Address.yH);
        }
    }


    public static final Api API;
    static final com.google.android.gms.common.api.Api.c yH;
    private static final com.google.android.gms.common.api.Api.b yI;

    public Address()
    {
    }

    public static void requestUserAddress(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
    {
        googleapiclient.a(new a(useraddressrequest, i) {

            final UserAddressRequest UC;
            final int UD;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((iw)a1);
            }

            protected void a(iw iw1)
                throws RemoteException
            {
                iw1.a(UC, UD);
                b(Status.En);
            }

            
            {
                UC = useraddressrequest;
                UD = i;
                super();
            }
        });
    }

    static 
    {
        yH = new com.google.android.gms.common.api.Api.c();
        yI = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gy1, (AddressOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public iw a(Context context, Looper looper, gy gy1, AddressOptions addressoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                hm.b(context instanceof Activity, "An Activity must be used for Address APIs");
                AddressOptions addressoptions1 = addressoptions;
                if (addressoptions == null)
                {
                    addressoptions1 = new AddressOptions();
                }
                return new iw((Activity)context, looper, connectioncallbacks, onconnectionfailedlistener, gy1.getAccountName(), addressoptions1.theme);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yI, yH, new Scope[0]);
    }
}
