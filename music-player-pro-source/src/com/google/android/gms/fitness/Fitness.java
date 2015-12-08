// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.lv;
import com.google.android.gms.internal.mf;
import com.google.android.gms.internal.mh;
import com.google.android.gms.internal.mi;
import com.google.android.gms.internal.mj;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mm;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mo;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//            BleApi, ConfigApi, HistoryApi, RecordingApi, 
//            SensorsApi, SessionsApi, a

public class Fitness
{

    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    public static final Api API;
    public static final BleApi BleApi = jj();
    public static final ConfigApi ConfigApi = new mi();
    public static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final HistoryApi HistoryApi = new mj();
    public static final RecordingApi RecordingApi = new ml();
    public static final Scope SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
    public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
    public static final Scope SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
    public static final Scope SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
    public static final Scope SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
    public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");
    public static final SensorsApi SensorsApi = new mm();
    public static final SessionsApi SessionsApi = new mn();
    public static final mf TK = new mk();

    private Fitness()
    {
    }

    public static long getEndTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.end_time", -1L);
        if (l == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
        }
    }

    public static long getStartTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.start_time", -1L);
        if (l == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
        }
    }

    private static BleApi jj()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new mh();
        } else
        {
            return new mo();
        }
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return d(context, looper, jg1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public lu d(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                nooptions = com.google.android.gms.fitness.a.e(jg1.ho());
                return new lv(context, looper, connectioncallbacks, onconnectionfailedlistener, jg1.hm(), nooptions);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(DR, DQ, new Scope[0]);
    }
}
