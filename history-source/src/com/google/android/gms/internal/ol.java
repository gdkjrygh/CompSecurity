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
//            ok, oj, on, om

public class ol
    implements PanoramaApi
{
    private static abstract class a extends c
    {

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult ay(Status status)
        {
            return new on(status, null);
        }

        protected Result c(Status status)
        {
            return ay(status);
        }

        public a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class b extends oj.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

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
            Ea.b(new on(bundle, intent));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static abstract class c extends com.google.android.gms.common.api.BaseImplementation.a
    {

        protected abstract void a(Context context, ok ok1)
            throws RemoteException;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((om)a1);
        }

        protected final void a(om om1)
            throws RemoteException
        {
            a(om1.getContext(), (ok)om1.hw());
        }

        protected c(GoogleApiClient googleapiclient)
        {
            super(Panorama.DQ, googleapiclient);
        }
    }


    public ol()
    {
    }

    private static void a(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void a(Context context, ok ok1, oj oj, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        oj = new oj.a(context, uri, oj) {

            final Uri amO;
            final oj amQ;
            final Context nf;

            public void a(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                ol.b(nf, amO);
                amQ.a(i, bundle1, j, intent);
            }

            
            {
                nf = context;
                amO = uri;
                amQ = oj1;
                super();
            }
        };
        try
        {
            ok1.a(oj, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ok ok1)
        {
            a(context, uri);
            throw ok1;
        }
        // Misplaced declaration of an exception variable
        catch (ok ok1)
        {
            a(context, uri);
        }
        throw ok1;
    }

    static void b(Context context, Uri uri)
    {
        a(context, uri);
    }

    static void b(Context context, ok ok1, oj oj, Uri uri, Bundle bundle)
        throws RemoteException
    {
        a(context, ok1, oj, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new a(googleapiclient, uri) {

            final Uri amO;
            final ol amP;

            protected void a(Context context, ok ok1)
                throws RemoteException
            {
                ok1.a(new b(this), amO, null, false);
            }

            
            {
                amP = ol.this;
                amO = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new a(googleapiclient, uri) {

            final Uri amO;
            final ol amP;

            protected void a(Context context, ok ok1)
                throws RemoteException
            {
                ol.b(context, ok1, new b(this), amO, null);
            }

            
            {
                amP = ol.this;
                amO = uri;
                super(googleapiclient);
            }
        });
    }
}
