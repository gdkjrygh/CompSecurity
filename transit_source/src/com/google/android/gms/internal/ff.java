// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            de, dj, fe

public class ff extends de
{
    final class a extends de.b
    {

        public final ConnectionResult qV;
        public final Intent qW;
        final ff qX;
        public final int type;

        protected void a(com.google.android.gms.panorama.PanoramaClient.a a1)
        {
            if (a1 != null)
            {
                a1.a(qV, type, qW);
            }
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.panorama.PanoramaClient.a)obj);
        }

        protected void aF()
        {
        }

        public a(com.google.android.gms.panorama.PanoramaClient.a a1, ConnectionResult connectionresult, int i, Intent intent)
        {
            qX = ff.this;
            super(ff.this, a1);
            qV = connectionresult;
            type = i;
            qW = intent;
        }
    }

    final class b extends fd.a
    {

        final ff qX;
        private final com.google.android.gms.panorama.PanoramaClient.a qY = null;
        private final com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener qZ;
        private final Uri ra;

        public void a(int i, Bundle bundle, int j, Intent intent)
        {
            if (ra != null)
            {
                qX.getContext().revokeUriPermission(ra, 1);
            }
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("pendingIntent");
            }
            bundle = new ConnectionResult(i, pendingintent);
            if (qY != null)
            {
                qX.a(qX. new a(qY, bundle, j, intent));
                return;
            } else
            {
                qX.a(qX. new c(qZ, bundle, intent));
                return;
            }
        }

        public b(com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener, Uri uri)
        {
            qX = ff.this;
            super();
            qZ = onpanoramainfoloadedlistener;
            ra = uri;
        }
    }

    final class c extends de.b
    {

        private final ConnectionResult qV;
        private final Intent qW;
        final ff qX;

        protected void a(com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener)
        {
            if (onpanoramainfoloadedlistener != null)
            {
                onpanoramainfoloadedlistener.onPanoramaInfoLoaded(qV, qW);
            }
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener)obj);
        }

        protected void aF()
        {
        }

        public c(com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener, ConnectionResult connectionresult, Intent intent)
        {
            qX = ff.this;
            super(ff.this, onpanoramainfoloadedlistener);
            qV = connectionresult;
            qW = intent;
        }
    }


    public ff(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    protected void a(dj dj1, de.d d)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        dj1.a(d, 0x3d8024, getContext().getPackageName(), bundle);
    }

    public void a(b b1, Uri uri, Bundle bundle, boolean flag)
    {
        bc();
        if (flag)
        {
            getContext().grantUriPermission("com.google.android.gms", uri, 1);
        }
        try
        {
            ((fe)bd()).a(b1, uri, bundle, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            b1.a(8, null, 0, null);
        }
    }

    public void a(com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener, Uri uri, boolean flag)
    {
        Uri uri1;
        if (flag)
        {
            uri1 = uri;
        } else
        {
            uri1 = null;
        }
        a(new b(onpanoramainfoloadedlistener, uri1), uri, null, flag);
    }

    protected String ag()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    public fe am(IBinder ibinder)
    {
        return fe.a.al(ibinder);
    }

    public IInterface p(IBinder ibinder)
    {
        return am(ibinder);
    }
}
