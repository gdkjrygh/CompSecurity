// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;

// Referenced classes of package com.google.android.gms.internal:
//            nb, na, mz, ne, 
//            nd

public class nc
    implements PanoramaApi
{
    private static final class a extends na.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(int i, Bundle bundle, int j, Intent intent)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            De.b(new mz(bundle, intent, j));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static abstract class b extends d
    {

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult az(Status status)
        {
            return new ne(status, null);
        }

        protected Result c(Status status)
        {
            return az(status);
        }

        private b()
        {
        }

    }

    private static final class c extends na.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(int i, Bundle bundle, int j, Intent intent)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            De.b(new ne(bundle, intent));
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static abstract class d extends com.google.android.gms.common.api.BaseImplementation.a
    {

        protected abstract void a(Context context, nb nb1)
            throws RemoteException;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((nd)a1);
        }

        protected final void a(nd nd1)
            throws RemoteException
        {
            a(nd1.getContext(), (nb)nd1.gS());
        }

        protected d()
        {
            super(Panorama.CU);
        }
    }


    public nc()
    {
    }

    private static void a(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void a(Context context, nb nb1, na na, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        na = new na.a(context, uri, na) {

            final na akB;
            final Uri aky;
            final Context mV;

            public void a(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                nc.b(mV, aky);
                akB.a(i, bundle1, j, intent);
            }

            
            {
                mV = context;
                aky = uri;
                akB = na1;
                super();
            }
        };
        try
        {
            nb1.a(na, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (nb nb1)
        {
            a(context, uri);
            throw nb1;
        }
        // Misplaced declaration of an exception variable
        catch (nb nb1)
        {
            a(context, uri);
        }
        throw nb1;
    }

    static void b(Context context, Uri uri)
    {
        a(context, uri);
    }

    static void b(Context context, nb nb1, na na, Uri uri, Bundle bundle)
        throws RemoteException
    {
        a(context, nb1, na, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final nc akA;
            final Uri aky;

            protected void a(Context context, nb nb1)
                throws RemoteException
            {
                nb1.a(new c(this), aky, null, false);
            }

            
            {
                akA = nc.this;
                aky = uri;
                super();
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final nc akA;
            final Uri aky;

            protected void a(Context context, nb nb1)
                throws RemoteException
            {
                nc.b(context, nb1, new c(this), aky, null);
            }

            
            {
                akA = nc.this;
                aky = uri;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/internal/nc$1

/* anonymous class */
    class _cls1 extends d
    {

        final Uri aky;
        final Bundle akz;

        protected void a(Context context, nb nb1)
            throws RemoteException
        {
            nc.b(context, nb1, new a(this), aky, akz);
        }

        protected com.google.android.gms.panorama.PanoramaApi.a ay(Status status)
        {
            return new mz(status, null, 0);
        }

        protected Result c(Status status)
        {
            return ay(status);
        }
    }

}
