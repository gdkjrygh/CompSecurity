// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.search.SearchAuthApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzlz, zzly

public class zzma
    implements SearchAuthApi
{
    static abstract class a extends zzlx.zza
    {

        public void zza(Status status, GoogleNowAuthState googlenowauthstate)
        {
            throw new UnsupportedOperationException();
        }

        a()
        {
        }
    }

    static class b extends com.google.android.gms.common.api.zza.zza
    {

        private final GoogleApiClient a;
        private final String b;
        private final boolean c = Log.isLoggable("SearchAuth", 3);

        static boolean a(b b1)
        {
            return b1.c;
        }

        protected com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult a(Status status)
        {
            if (c)
            {
                Log.d("SearchAuth", (new StringBuilder()).append("GetGoogleNowAuthImpl received failure: ").append(status.getStatusMessage()).toString());
            }
            return new c(status, null);
        }

        protected void a(zzlz zzlz1)
            throws RemoteException
        {
            if (c)
            {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            String s = a.getContext().getPackageName();
            a a1 = new a(this) {

                final b a;

                public void zza(Status status, GoogleNowAuthState googlenowauthstate)
                {
                    if (b.a(a))
                    {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    a.setResult(new c(status, googlenowauthstate));
                }

            
            {
                a = b1;
                super();
            }
            };
            ((zzly)zzlz1.zzlX()).zza(a1, s, b);
        }

        protected Result createFailedResult(Status status)
        {
            return a(status);
        }

        protected void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            a((zzlz)zza1);
        }

        protected b(GoogleApiClient googleapiclient, String s)
        {
            super(SearchAuth.zzKh, googleapiclient);
            a = googleapiclient;
            b = s;
        }
    }

    static class c
        implements com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult
    {

        private final Status a;
        private final GoogleNowAuthState b;

        public GoogleNowAuthState getGoogleNowAuthState()
        {
            return b;
        }

        public Status getStatus()
        {
            return a;
        }

        c(Status status, GoogleNowAuthState googlenowauthstate)
        {
            a = status;
            b = googlenowauthstate;
        }
    }


    public zzma()
    {
    }

    public PendingResult getGoogleNowAuth(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new b(googleapiclient, s));
    }
}
