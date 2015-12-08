// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hu, hd, hy, hs, 
//            hv, hx

public final class hz
    implements AppIndexApi, hu
{
    private static abstract class a
        implements Result
    {

        private final Status CM;
        protected final Object CN;

        public Status getStatus()
        {
            return CM;
        }

        public a(Status status, Object obj)
        {
            CM = status;
            CN = obj;
        }
    }

    static class b extends a
        implements hu.a
    {

        public b(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            super(status, parcelfiledescriptor);
        }
    }

    private static abstract class c extends com.google.android.gms.common.api.BaseImplementation.a
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((hy)a1);
        }

        protected abstract void a(hv hv)
            throws RemoteException;

        protected final void a(hy hy1)
            throws RemoteException
        {
            a(hy1.fn());
        }

        public c()
        {
            super(hd.BN);
        }
    }

    private static abstract class d extends c
    {

        protected Result c(Status status)
        {
            return d(status);
        }

        protected Status d(Status status)
        {
            return status;
        }

        private d()
        {
        }

    }

    private static final class e extends hx
    {

        public void a(Status status)
        {
            CH.b(status);
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }


    public hz()
    {
    }

    public static Uri a(String s, Uri uri)
    {
        if (!"android-app".equals(uri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Uri scheme must be android-app: ").append(uri).toString());
        }
        if (!s.equals(uri.getHost()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Uri host must match package name: ").append(uri).toString());
        }
        s = uri.getPathSegments();
        if (s.isEmpty() || ((String)s.get(0)).isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Uri path must exist: ").append(uri).toString());
        }
        String s1 = (String)s.get(0);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(s1);
        if (s.size() > 1)
        {
            builder.authority((String)s.get(1));
            for (int i = 2; i < s.size(); i++)
            {
                builder.appendPath((String)s.get(i));
            }

        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return builder.build();
    }

    public transient PendingResult a(GoogleApiClient googleapiclient, hs ahs[])
    {
        return googleapiclient.a(new d(((hy)googleapiclient.a(hd.BN)).getContext().getPackageName(), ahs) {

            final String CJ;
            final hs CK[];
            final hz CL;

            protected void a(hv hv1)
                throws RemoteException
            {
                hv1.a(new e(this), CJ, CK);
            }

            
            {
                CL = hz.this;
                CJ = s;
                CK = ahs;
                super();
            }
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list)
    {
        return a(googleapiclient, new hs[] {
            new hs(((hy)googleapiclient.a(hd.BN)).getContext().getPackageName(), intent, s, uri, null, list)
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list)
    {
        return view(googleapiclient, activity, new Intent("android.intent.action.VIEW", a(((hy)googleapiclient.a(hd.BN)).getContext().getPackageName(), uri)), s, uri1, list);
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent)
    {
        return a(googleapiclient, new hs[] {
            new hs(hs.a(((hy)googleapiclient.a(hd.BN)).getContext().getPackageName(), intent), System.currentTimeMillis(), 3)
        });
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri)
    {
        return viewEnd(googleapiclient, activity, new Intent("android.intent.action.VIEW", a(((hy)googleapiclient.a(hd.BN)).getContext().getPackageName(), uri)));
    }

    // Unreferenced inner class com/google/android/gms/internal/hz$1

/* anonymous class */
    class _cls1 extends c
    {

        protected void a(hv hv1)
            throws RemoteException
        {
            hv1.a(new hx(this, this) {

                final _cls1 CI;

                public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
                {
                    CH.b(new b(status, parcelfiledescriptor));
                }

            
            {
                CI = _pcls1;
                super(b1);
            }
            });
        }

        public hu.a b(Status status)
        {
            return new b(status, null);
        }

        public Result c(Status status)
        {
            return b(status);
        }
    }

}
