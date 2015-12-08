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
//            ft, ff, fx, fr, 
//            fu, fw

public final class fy
    implements AppIndexApi, ft
{
    private static abstract class a
        implements Result
    {

        protected final Object yA;
        private final Status yz;

        public Status getStatus()
        {
            return yz;
        }

        public a(Status status, Object obj)
        {
            yz = status;
            yA = obj;
        }
    }

    static class b extends a
        implements ft.a
    {

        public b(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            super(status, parcelfiledescriptor);
        }
    }

    private static abstract class c extends com.google.android.gms.common.api.a.b
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((fx)a1);
        }

        protected abstract void a(fu fu)
            throws RemoteException;

        protected final void a(fx fx1)
            throws RemoteException
        {
            a(fx1.dR());
        }

        public c()
        {
            super(ff.xI);
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

    private static final class e extends fw
    {

        public void a(Status status)
        {
            yu.a(status);
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            super(d1);
        }
    }


    public fy()
    {
    }

    static Uri a(String s, Uri uri)
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

    public transient PendingResult a(GoogleApiClient googleapiclient, fr afr[])
    {
        return googleapiclient.a(new d(((fx)googleapiclient.a(ff.xI)).getContext().getPackageName(), afr) {

            final String yw;
            final fr yx[];
            final fy yy;

            protected void a(fu fu1)
                throws RemoteException
            {
                fu1.a(new e(this), yw, yx);
            }

            
            {
                yy = fy.this;
                yw = s;
                yx = afr;
                super();
            }
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list)
    {
        return a(googleapiclient, new fr[] {
            new fr(((fx)googleapiclient.a(ff.xI)).getContext().getPackageName(), intent, s, uri, null, list)
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list)
    {
        return view(googleapiclient, activity, new Intent("android.intent.action.VIEW", a(((fx)googleapiclient.a(ff.xI)).getContext().getPackageName(), uri)), s, uri1, list);
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent)
    {
        return a(googleapiclient, new fr[] {
            new fr(fr.a(((fx)googleapiclient.a(ff.xI)).getContext().getPackageName(), intent), System.currentTimeMillis(), 3)
        });
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri)
    {
        return viewEnd(googleapiclient, activity, new Intent("android.intent.action.VIEW", a(((fx)googleapiclient.a(ff.xI)).getContext().getPackageName(), uri)));
    }

    // Unreferenced inner class com/google/android/gms/internal/fy$1

/* anonymous class */
    class _cls1 extends c
    {

        protected void a(fu fu1)
            throws RemoteException
        {
            fu1.a(new fw(this, this) {

                final _cls1 yv;

                public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
                {
                    yu.a(new b(status, parcelfiledescriptor));
                }

            
            {
                yv = _pcls1;
                super(d1);
            }
            });
        }

        public ft.a b(Status status)
        {
            return new b(status, null);
        }

        public Result c(Status status)
        {
            return b(status);
        }
    }

}
