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
//            ke, kd, kc, kh, 
//            kg

public class kf
    implements PanoramaApi
{
    private static final class a extends kd.a
    {

        private final com.google.android.gms.common.api.a.d yR;

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
            yR.a(new kc(bundle, intent, j));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            yR = d1;
        }
    }

    private static abstract class b extends d
    {

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult ak(Status status)
        {
            return new kh(status, null);
        }

        protected Result c(Status status)
        {
            return ak(status);
        }

        private b()
        {
        }

    }

    private static final class c extends kd.a
    {

        private final com.google.android.gms.common.api.a.d yR;

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
            yR.a(new kh(bundle, intent));
        }

        public c(com.google.android.gms.common.api.a.d d1)
        {
            yR = d1;
        }
    }

    private static abstract class d extends com.google.android.gms.common.api.a.b
    {

        protected abstract void a(Context context, ke ke1)
            throws RemoteException;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((kg)a1);
        }

        protected final void a(kg kg1)
            throws RemoteException
        {
            a(kg1.getContext(), (ke)kg1.ft());
        }

        protected d()
        {
            super(Panorama.yH);
        }
    }


    public kf()
    {
    }

    private static void a(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void a(Context context, ke ke1, kd kd, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        kd = new kd.a(context, uri, kd) {

            final Uri abk;
            final kd abn;
            final Context qu;

            public void a(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                kf.b(qu, abk);
                abn.a(i, bundle1, j, intent);
            }

            
            {
                qu = context;
                abk = uri;
                abn = kd1;
                super();
            }
        };
        try
        {
            ke1.a(kd, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ke ke1)
        {
            a(context, uri);
            throw ke1;
        }
        // Misplaced declaration of an exception variable
        catch (ke ke1)
        {
            a(context, uri);
        }
        throw ke1;
    }

    static void b(Context context, Uri uri)
    {
        a(context, uri);
    }

    static void b(Context context, ke ke1, kd kd, Uri uri, Bundle bundle)
        throws RemoteException
    {
        a(context, ke1, kd, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final Uri abk;
            final kf abm;

            protected void a(Context context, ke ke1)
                throws RemoteException
            {
                ke1.a(new c(this), abk, null, false);
            }

            
            {
                abm = kf.this;
                abk = uri;
                super();
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new b(uri) {

            final Uri abk;
            final kf abm;

            protected void a(Context context, ke ke1)
                throws RemoteException
            {
                kf.b(context, ke1, new c(this), abk, null);
            }

            
            {
                abm = kf.this;
                abk = uri;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/internal/kf$1

/* anonymous class */
    class _cls1 extends d
    {

        final Uri abk;
        final Bundle abl;

        protected void a(Context context, ke ke1)
            throws RemoteException
        {
            kf.b(context, ke1, new a(this), abk, abl);
        }

        protected com.google.android.gms.panorama.PanoramaApi.a aj(Status status)
        {
            return new kc(status, null, 0);
        }

        protected Result c(Status status)
        {
            return aj(status);
        }
    }

}
