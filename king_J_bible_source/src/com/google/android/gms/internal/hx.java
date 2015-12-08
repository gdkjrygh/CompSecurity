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
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ff, fm, hv

public class hx extends ff
{
    final class a extends ff.b
        implements com.google.android.gms.panorama.PanoramaApi.a
    {

        public final Status TC;
        public final Intent TD;
        final hx TE;
        public final int type;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d)
        {
            d.b(this);
        }

        protected void dx()
        {
        }

        public Status getStatus()
        {
            return TC;
        }

        public Intent getViewerIntent()
        {
            return TD;
        }

        public a(com.google.android.gms.common.api.a.d d, Status status, int i, Intent intent)
        {
            TE = hx.this;
            super(hx.this, d);
            TC = status;
            type = i;
            TD = intent;
        }
    }

    final class b extends hu.a
    {

        final hx TE;
        private final com.google.android.gms.common.api.a.d TF;
        private final com.google.android.gms.common.api.a.d TG;
        private final Uri TH;

        public void a(int i, Bundle bundle, int j, Intent intent)
        {
            if (TH != null)
            {
                TE.getContext().revokeUriPermission(TH, 1);
            }
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            if (TG != null)
            {
                TE.a(TE. new c(TG, bundle, intent));
            } else
            if (TF != null)
            {
                TE.a(TE. new a(TF, bundle, j, intent));
                return;
            }
        }

        public b(com.google.android.gms.common.api.a.d d, com.google.android.gms.common.api.a.d d1, Uri uri)
        {
            TE = hx.this;
            super();
            TF = d;
            TG = d1;
            TH = uri;
        }
    }

    final class c extends ff.b
        implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
    {

        private final Status TC;
        private final Intent TD;
        final hx TE;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d)
        {
            d.b(this);
        }

        protected void dx()
        {
        }

        public Status getStatus()
        {
            return TC;
        }

        public Intent getViewerIntent()
        {
            return TD;
        }

        public c(com.google.android.gms.common.api.a.d d, Status status, Intent intent)
        {
            TE = hx.this;
            super(hx.this, d);
            TC = status;
            TD = intent;
        }
    }


    public hx(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    public void a(com.google.android.gms.common.api.a.d d, Uri uri, boolean flag)
    {
        Uri uri1;
        if (flag)
        {
            uri1 = uri;
        } else
        {
            uri1 = null;
        }
        a(new b(null, d, uri1), uri, null, flag);
    }

    protected void a(fm fm1, ff.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        fm1.a(e, 0x43eea0, getContext().getPackageName(), bundle);
    }

    public void a(b b1, Uri uri, Bundle bundle, boolean flag)
    {
        bT();
        if (flag)
        {
            getContext().grantUriPermission("com.google.android.gms", uri, 1);
        }
        try
        {
            ((hv)eM()).a(b1, uri, bundle, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            b1.a(8, null, 0, null);
        }
    }

    public hv aN(IBinder ibinder)
    {
        return hv.a.aM(ibinder);
    }

    protected String bg()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    public IInterface r(IBinder ibinder)
    {
        return aN(ibinder);
    }
}
