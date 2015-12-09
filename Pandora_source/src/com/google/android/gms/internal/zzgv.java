// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzgu, zzgt, zzgq, zzgs

public final class zzgv
    implements zzk, AppIndexApi
{
    private static final class a
        implements com.google.android.gms.appindexing.AppIndexApi.ActionResult
    {

        private zzgv a;
        private PendingResult b;
        private Action c;

        public PendingResult end(GoogleApiClient googleapiclient)
        {
            Object obj = googleapiclient.getContext().getPackageName();
            long l = System.currentTimeMillis();
            obj = com.google.android.gms.internal.zzgu.zza(c, l, ((String) (obj)), 2);
            return a.zza(googleapiclient, new UsageInfo[] {
                obj
            });
        }

        public PendingResult getPendingResult()
        {
            return b;
        }

        a(zzgv zzgv1, PendingResult pendingresult, Action action1)
        {
            a = zzgv1;
            b = pendingresult;
            c = action1;
        }
    }

    private static abstract class b extends com.google.android.gms.common.api.zza.zza
    {

        protected abstract void a(zzgq zzgq)
            throws RemoteException;

        protected final void a(zzgt zzgt1)
            throws RemoteException
        {
            a(zzgt1.zzjI());
        }

        protected void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            a((zzgt)zza1);
        }

        public b(GoogleApiClient googleapiclient)
        {
            super(zza.zzIS, googleapiclient);
        }
    }

    private static abstract class c extends b
    {

        protected Status a(Status status)
        {
            return status;
        }

        protected Result createFailedResult(Status status)
        {
            return a(status);
        }

        c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class d extends zzgs
    {

        public void zza(Status status)
        {
            zzJS.zzj(status);
        }

        public d(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }


    public zzgv()
    {
    }

    public static Intent zza(String s, Uri uri)
    {
        zzb(s, uri);
        s = uri.getPathSegments();
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
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    private PendingResult zza(GoogleApiClient googleapiclient, Action action1, int i)
    {
        String s = googleapiclient.getContext().getPackageName();
        return zza(googleapiclient, new UsageInfo[] {
            com.google.android.gms.internal.zzgu.zza(action1, System.currentTimeMillis(), s, i)
        });
    }

    private static void zzb(String s, Uri uri)
    {
        if (!"android-app".equals(uri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The URI scheme must be 'android-app' and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        }
        String s1 = uri.getHost();
        if (s != null && !s.equals(s1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The URI host must match the package name and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        }
        s = uri.getPathSegments();
        if (s.isEmpty() || ((String)s.get(0)).isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        } else
        {
            return;
        }
    }

    public static void zzj(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                zzb(null, ((com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.next()).appIndexingUrl);
            }
        }
    }

    public com.google.android.gms.appindexing.AppIndexApi.ActionResult action(GoogleApiClient googleapiclient, Action action1)
    {
        return new a(this, zza(googleapiclient, action1, 1), action1);
    }

    public PendingResult end(GoogleApiClient googleapiclient, Action action1)
    {
        return zza(googleapiclient, action1, 2);
    }

    public PendingResult start(GoogleApiClient googleapiclient, Action action1)
    {
        return zza(googleapiclient, action1, 1);
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list)
    {
        activity = googleapiclient.getContext().getPackageName();
        zzj(list);
        return zza(googleapiclient, new UsageInfo[] {
            new UsageInfo(activity, intent, s, uri, null, list, 1)
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list)
    {
        String s1 = googleapiclient.getContext().getPackageName();
        zzb(s1, uri);
        return view(googleapiclient, activity, zza(s1, uri), s, uri1, list);
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent)
    {
        activity = googleapiclient.getContext().getPackageName();
        return zza(googleapiclient, new UsageInfo[] {
            (new com.google.android.gms.appdatasearch.UsageInfo.zza()).zza(UsageInfo.zza(activity, intent)).zzu(System.currentTimeMillis()).zzac(0).zzad(2).zzjH()
        });
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri)
    {
        return viewEnd(googleapiclient, activity, zza(googleapiclient.getContext().getPackageName(), uri));
    }

    public transient PendingResult zza(GoogleApiClient googleapiclient, UsageInfo ausageinfo[])
    {
        return googleapiclient.zza(new c(googleapiclient, googleapiclient.getContext().getPackageName(), ausageinfo) {

            final String a;
            final UsageInfo b[];
            final zzgv c;

            protected void a(zzgq zzgq1)
                throws RemoteException
            {
                zzgq1.zza(new d(this), a, b);
            }

            
            {
                c = zzgv.this;
                a = s;
                b = ausageinfo;
                super(googleapiclient);
            }
        });
    }
}
