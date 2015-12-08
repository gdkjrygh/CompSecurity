// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

public interface SessionsApi
{
    public static class ViewIntentBuilder
    {

        private String Ss;
        private Session St;
        private boolean Su;
        private final Context mContext;

        private Intent i(Intent intent)
        {
            if (Ss != null)
            {
                Intent intent1 = (new Intent(intent)).setPackage(Ss);
                ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
                if (resolveinfo != null)
                {
                    intent = resolveinfo.activityInfo.name;
                    intent1.setComponent(new ComponentName(Ss, intent));
                    return intent1;
                }
            }
            return intent;
        }

        public Intent build()
        {
            Intent intent;
            boolean flag;
            if (St != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Session must be set");
            intent = new Intent("vnd.google.fitness.VIEW");
            intent.setType(Session.getMimeType(St.getActivity()));
            c.a(St, intent, "vnd.google.fitness.session");
            if (!Su)
            {
                Ss = St.getAppPackageName();
            }
            return i(intent);
        }

        public ViewIntentBuilder setPreferredApplication(String s)
        {
            Ss = s;
            Su = true;
            return this;
        }

        public ViewIntentBuilder setSession(Session session)
        {
            St = session;
            return this;
        }

        public ViewIntentBuilder(Context context)
        {
            Su = false;
            mContext = context;
        }
    }


    public abstract PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest);

    public abstract PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest);

    public abstract PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);

    public abstract PendingResult startSession(GoogleApiClient googleapiclient, Session session);

    public abstract PendingResult stopSession(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);
}
