// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class l extends a
{

    public static final String b = "SavedState.GalileoState.LIVE_DATA_PACKET_INVALIDATED";
    private static final l c = new l();
    private static final String d = "LAST_LIVE_DATA_TIMESTAMP";
    private static final String e = "LAST_LIVE_DATA_STEPS";
    private static final String f = "LAST_LIVE_DATA_DISTANCE";
    private static final String g = "LAST_LIVE_DATA_CALORIES";
    private static final String h = "LAST_LIVE_DATA_FLOORS";

    l()
    {
        super("LiveDateSavedState");
    }

    private static float a(SharedPreferences sharedpreferences, String s)
    {
        float f1;
        try
        {
            f1 = sharedpreferences.getFloat(s, 0.0F);
        }
        catch (Exception exception)
        {
            int j;
            try
            {
                j = sharedpreferences.getInt(s, 0);
            }
            // Misplaced declaration of an exception variable
            catch (SharedPreferences sharedpreferences)
            {
                return 0.0F;
            }
            return (float)j;
        }
        return f1;
    }

    public static void a(LiveDataPacket livedatapacket)
    {
        com/fitbit/savedstate/l;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.b().edit();
        if (livedatapacket == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        editor.putInt("LAST_LIVE_DATA_TIMESTAMP", (int)(System.currentTimeMillis() / 1000L));
        editor.putInt("LAST_LIVE_DATA_STEPS", livedatapacket.a());
        editor.putFloat("LAST_LIVE_DATA_DISTANCE", (float)livedatapacket.d());
        editor.putInt("LAST_LIVE_DATA_CALORIES", livedatapacket.b());
        editor.putFloat("LAST_LIVE_DATA_FLOORS", (float)livedatapacket.c());
_L1:
        editor.apply();
        com/fitbit/savedstate/l;
        JVM INSTR monitorexit ;
        return;
        editor.putInt("LAST_LIVE_DATA_TIMESTAMP", 0);
        i();
          goto _L1
        livedatapacket;
        throw livedatapacket;
    }

    protected static a g()
    {
        return c;
    }

    public static LiveDataPacket h()
    {
        com/fitbit/savedstate/l;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences;
        boolean flag;
        sharedpreferences = c.b();
        flag = o.i(new Date((long)sharedpreferences.getInt("LAST_LIVE_DATA_TIMESTAMP", 0) * 1000L));
        if (flag) goto _L2; else goto _L1
_L1:
        LiveDataPacket livedatapacket = null;
_L4:
        com/fitbit/savedstate/l;
        JVM INSTR monitorexit ;
        return livedatapacket;
_L2:
        livedatapacket = new LiveDataPacket();
        livedatapacket.a(sharedpreferences.getInt("LAST_LIVE_DATA_STEPS", -1));
        livedatapacket.b(a(sharedpreferences, "LAST_LIVE_DATA_DISTANCE"));
        livedatapacket.b(sharedpreferences.getInt("LAST_LIVE_DATA_CALORIES", -1));
        livedatapacket.a(a(sharedpreferences, "LAST_LIVE_DATA_FLOORS"));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static void i()
    {
        Intent intent = new Intent();
        intent.setAction("SavedState.GalileoState.LIVE_DATA_PACKET_INVALIDATED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, j, k, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.GalileoState.LAST_LIVE_DATA_TIMESTAMP"))
        {
            editor.putInt("LAST_LIVE_DATA_TIMESTAMP", context.getInt("SavedState.GalileoState.LAST_LIVE_DATA_TIMESTAMP", 0));
            editor1.remove("SavedState.GalileoState.LAST_LIVE_DATA_TIMESTAMP");
        }
        if (context.contains("SavedState.GalileoState.LAST_LIVE_DATA_STEPS"))
        {
            editor.putInt("LAST_LIVE_DATA_STEPS", context.getInt("SavedState.GalileoState.LAST_LIVE_DATA_STEPS", 0));
            editor1.remove("SavedState.GalileoState.LAST_LIVE_DATA_STEPS");
        }
        if (context.contains("SavedState.GalileoState.LAST_LIVE_DATA_DISTANCE"))
        {
            editor.putFloat("LAST_LIVE_DATA_DISTANCE", context.getFloat("SavedState.GalileoState.LAST_LIVE_DATA_DISTANCE", 0.0F));
            editor1.remove("SavedState.GalileoState.LAST_LIVE_DATA_DISTANCE");
        }
        if (context.contains("SavedState.GalileoState.LAST_LIVE_DATA_CALORIES"))
        {
            editor.putInt("LAST_LIVE_DATA_CALORIES", context.getInt("SavedState.GalileoState.LAST_LIVE_DATA_CALORIES", 0));
            editor1.remove("SavedState.GalileoState.LAST_LIVE_DATA_CALORIES");
        }
        if (context.contains("SavedState.GalileoState.LAST_LIVE_DATA_FLOORS"))
        {
            editor.putFloat("LAST_LIVE_DATA_FLOORS", context.getFloat("SavedState.GalileoState.LAST_LIVE_DATA_FLOORS", 0.0F));
            editor1.remove("SavedState.GalileoState.LAST_LIVE_DATA_FLOORS");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
