// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.fitbit.e.a;
import com.fitbit.savedstate.d;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.service.b;
import java.sql.Timestamp;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, an, dg

public class at extends b
{

    static final String a = "com.fitbit.data.bl.SendGCMRegistractionIdTask.ACTION";
    public static final long b = 0x240c8400L;
    private static final String c = "com.fitbit.data.bl.SendGCMRegistractionIdTask.PREFERENCES";
    private static final String d = "com.fitbit.data.bl.SendGCMRegistractionIdTask.REGISTRATION_ID";
    private static final String e = "com.fitbit.data.bl.SendGCMRegistractionIdTask.PROPERTY_ON_SERVER_EXPIRATION_TIME";
    private static final String f = "com.fitbit.data.bl.SendGCMRegistractionIdTask.USER";

    public at()
    {
    }

    public static long a(Context context)
    {
        return 0x240c8400L;
    }

    private static void a(Context context, String s, String s1)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("com.fitbit.data.bl.SendGCMRegistractionIdTask.PREFERENCES", 0);
        long l = a(context) + System.currentTimeMillis();
        com.fitbit.e.a.b("GCMRegistratonIdTask", (new StringBuilder()).append("Setting currentRegId as ").append(s).append(" until ").append(new Timestamp(l)).toString(), new Object[0]);
        sharedpreferences.edit().putString("com.fitbit.data.bl.SendGCMRegistractionIdTask.REGISTRATION_ID", s).putLong("com.fitbit.data.bl.SendGCMRegistractionIdTask.PROPERTY_ON_SERVER_EXPIRATION_TIME", l).putString("com.fitbit.data.bl.SendGCMRegistractionIdTask.USER", s1).commit();
    }

    public static Intent b(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SendGCMRegistractionIdTask.ACTION");
        return context;
    }

    private static String c(Context context)
    {
        context = context.getSharedPreferences("com.fitbit.data.bl.SendGCMRegistractionIdTask.PREFERENCES", 0);
        long l = context.getLong("com.fitbit.data.bl.SendGCMRegistractionIdTask.PROPERTY_ON_SERVER_EXPIRATION_TIME", -1L);
        if (System.currentTimeMillis() > l)
        {
            com.fitbit.e.a.b("GCMRegistratonIdTask", (new StringBuilder()).append("currentRegId expired on: ").append(new Timestamp(l)).toString(), new Object[0]);
            return null;
        } else
        {
            return context.getString("com.fitbit.data.bl.SendGCMRegistractionIdTask.REGISTRATION_ID", null);
        }
    }

    private static String d(Context context)
    {
        return context.getSharedPreferences("com.fitbit.data.bl.SendGCMRegistractionIdTask.PREFERENCES", 0).getString("com.fitbit.data.bl.SendGCMRegistractionIdTask.USER", null);
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        com/fitbit/data/bl/at;
        JVM INSTR monitorenter ;
        intent = com.google.android.gcm.b.g(syncservice);
        resultreceiver = com.fitbit.savedstate.d.h();
        if (com.fitbit.data.bl.an.a().j() && !TextUtils.isEmpty(intent) && !TextUtils.isEmpty(resultreceiver) && (!intent.equals(c(syncservice)) || !resultreceiver.equals(d(syncservice))) && com.fitbit.data.bl.dg.d().a().C(intent))
        {
            a(((Context) (syncservice)), ((String) (intent)), ((String) (resultreceiver)));
        }
        com/fitbit/data/bl/at;
        JVM INSTR monitorexit ;
        return;
        syncservice;
        com/fitbit/data/bl/at;
        JVM INSTR monitorexit ;
        throw syncservice;
    }
}
