// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class u extends a
{

    private static final u b = new u();
    private static final String c = "LAST_USED_WATER_UNIT";
    private static final String d = "LAST_SELECTED_WATER_INTERVAL";

    u()
    {
        super("WaterSavedState");
    }

    public static void a(int j)
    {
        com/fitbit/savedstate/u;
        JVM INSTR monitorenter ;
        b.c().putInt("LAST_SELECTED_WATER_INTERVAL", j).apply();
        com/fitbit/savedstate/u;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        com/fitbit/savedstate/u;
        JVM INSTR monitorenter ;
        waterunits = waterunits.getSerializableName();
        b.c().putString("LAST_USED_WATER_UNIT", waterunits).apply();
        com/fitbit/savedstate/u;
        JVM INSTR monitorexit ;
        return;
        waterunits;
        throw waterunits;
    }

    public static com.fitbit.data.domain.WaterLogEntry.WaterUnits g()
    {
        com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits = null;
        com/fitbit/savedstate/u;
        JVM INSTR monitorenter ;
        String s = b.b().getString("LAST_USED_WATER_UNIT", null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        waterunits = (com.fitbit.data.domain.WaterLogEntry.WaterUnits)w.a(s, com/fitbit/data/domain/WaterLogEntry$WaterUnits);
        com/fitbit/savedstate/u;
        JVM INSTR monitorexit ;
        return waterunits;
        Exception exception;
        exception;
        throw exception;
    }

    public static int h()
    {
        com/fitbit/savedstate/u;
        JVM INSTR monitorenter ;
        int j = b.b().getInt("LAST_SELECTED_WATER_INTERVAL", 1);
        com/fitbit/savedstate/u;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    protected static a i()
    {
        return b;
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
