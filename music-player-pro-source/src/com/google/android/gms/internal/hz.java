// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ht, hc, hx, hr, 
//            hy, hu, hw

public final class hz
    implements AppIndexApi, ht
{
    private static final class a
        implements com.google.android.gms.appindexing.AppIndexApi.ActionResult
    {

        private hz DE;
        private PendingResult DF;
        private Action DG;
        private String DH;

        public PendingResult end(GoogleApiClient googleapiclient)
        {
            Object obj = ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName();
            long l = System.currentTimeMillis();
            obj = hy.a(DG, DH, l, ((String) (obj)), 3);
            return DE.a(googleapiclient, new hr[] {
                obj
            });
        }

        public PendingResult getPendingResult()
        {
            return DF;
        }

        a(hz hz1, PendingResult pendingresult, Action action1, String s)
        {
            DE = hz1;
            DF = pendingresult;
            DG = action1;
            DH = s;
        }
    }

    private static abstract class b extends com.google.android.gms.common.api.BaseImplementation.a
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((hx)a1);
        }

        protected abstract void a(hu hu)
            throws RemoteException;

        protected final void a(hx hx1)
            throws RemoteException
        {
            a(hx1.fH());
        }

        public b(GoogleApiClient googleapiclient)
        {
            super(hc.CG, googleapiclient);
        }
    }

    private static abstract class c extends b
    {

        protected Status b(Status status)
        {
            return status;
        }

        protected Result c(Status status)
        {
            return b(status);
        }

        c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class d extends hw
    {

        public void a(Status status)
        {
            DA.b(status);
        }

        public d(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }


    public hz()
    {
    }

    public static Intent a(String s, Uri uri)
    {
        b(s, uri);
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

    private static void b(String s, Uri uri)
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

    public static void c(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                b(null, ((com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.next()).appIndexingUrl);
            }
        }
    }

    public transient PendingResult a(GoogleApiClient googleapiclient, hr ahr[])
    {
        return googleapiclient.a(new c(googleapiclient, ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName(), ahr) {

            final String DB;
            final hr DC[];
            final hz DD;

            protected void a(hu hu1)
                throws RemoteException
            {
                hu1.a(new d(this), DB, DC);
            }

            
            {
                DD = hz.this;
                DB = s;
                DC = ahr;
                super(googleapiclient);
            }
        });
    }

    public com.google.android.gms.appindexing.AppIndexApi.ActionResult action(GoogleApiClient googleapiclient, Action action1)
    {
        String s = ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName();
        long l = System.currentTimeMillis();
        String s1 = String.valueOf(l);
        return new a(this, a(googleapiclient, new hr[] {
            hy.a(action1, s1, l, s, 0)
        }), action1, s1);
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list)
    {
        activity = ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName();
        c(list);
        return a(googleapiclient, new hr[] {
            new hr(activity, intent, s, uri, null, list)
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list)
    {
        String s1 = ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName();
        b(s1, uri);
        return view(googleapiclient, activity, a(s1, uri), s, uri1, list);
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent)
    {
        return a(googleapiclient, new hr[] {
            new hr(hr.a(((hx)googleapiclient.a(hc.CG)).getContext().getPackageName(), intent), System.currentTimeMillis(), 3)
        });
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri)
    {
        return viewEnd(googleapiclient, activity, a(((hx)googleapiclient.a(hc.CG)).getContext().getPackageName(), uri));
    }
}
