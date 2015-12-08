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
//            kf, ke, kd, ki, 
//            kh

public class kg
    implements PanoramaApi
{
    private static final class a extends ke.a
    {

        private final com.google.android.gms.common.api.a.d yO;

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
            yO.a(new kd(bundle, intent, j));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            yO = d1;
        }
    }

    private static abstract class b extends d
    {

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult ak(Status status)
        {
            return new ki(status, null);
        }

        protected Result c(Status status)
        {
            return ak(status);
        }

        private b()
        {
        }

    }

    private static final class c extends ke.a
    {

        private final com.google.android.gms.common.api.a.d yO;

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
            yO.a(new ki(bundle, intent));
        }

        public c(com.google.android.gms.common.api.a.d d1)
        {
            yO = d1;
        }
    }

    private static abstract class d extends com.google.android.gms.common.api.a.b
    {

        protected abstract void a(Context context, kf kf1)
            throws RemoteException;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((kh)a1);
        }

        protected final void a(kh kh1)
            throws RemoteException
        {
            a(kh1.getContext(), (kf)kh1.fo());
        }

        protected d()
        {
            super(Panorama.yE);
        }
    }


    public kg()
    {
    }

    private static void a(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void a(Context context, kf kf1, ke ke, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        ke = new ke.a(context, uri, ke) {

            final Uri abh;
            final ke abk;
            final Context qr;

            public void a(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                kg.b(qr, abh);
                abk.a(i, bundle1, j, intent);
            }

            
            {
                qr = context;
                abh = uri;
                abk = ke1;
                super();
            }
        };
        try
        {
            kf1.a(ke, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kf kf1)
        {
            a(context, uri);
            throw kf1;
        }
        // Misplaced declaration of an exception variable
        catch (kf kf1)
        {
            a(context, uri);
        }
        throw kf1;
    }

    static void b(Context context, Uri uri)
    {
        a(context, uri);
    }

    static void b(Context context, kf kf1, ke ke, Uri uri, Bundle bundle)
        throws RemoteException
    {
        a(context, kf1, ke, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final Uri abh;
            final kg abj;

            protected void a(Context context, kf kf1)
                throws RemoteException
            {
                kf1.a(new c(this), abh, null, false);
            }

            
            {
                abj = kg.this;
                abh = uri;
                super();
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final Uri abh;
            final kg abj;

            protected void a(Context context, kf kf1)
                throws RemoteException
            {
                kg.b(context, kf1, new c(this), abh, null);
            }

            
            {
                abj = kg.this;
                abh = uri;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/internal/kg$1

/* anonymous class */
    class _cls1 extends d
    {

        final Uri abh;
        final Bundle abi;

        protected void a(Context context, kf kf1)
            throws RemoteException
        {
            kg.b(context, kf1, new a(this), abh, abi);
        }

        protected com.google.android.gms.panorama.PanoramaApi.a aj(Status status)
        {
            return new kd(status, null, 0);
        }

        protected Result c(Status status)
        {
            return aj(status);
        }
    }

}
