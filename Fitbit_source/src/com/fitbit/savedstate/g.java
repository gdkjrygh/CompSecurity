// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fitbit.data.domain.device.Device;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class g extends com.fitbit.savedstate.a
{

    public static final String b = (new StringBuilder()).append(com/fitbit/savedstate/g.getCanonicalName()).append(".ACTION_TRACKER_BOND_STATE_CHANGED").toString();
    public static final String c = (new StringBuilder()).append(com/fitbit/savedstate/g.getCanonicalName()).append(".EXTRA_TRACKER_ID").toString();
    public static final String d = (new StringBuilder()).append(com/fitbit/savedstate/g.getCanonicalName()).append(".EXTRA_OLD_STATE").toString();
    public static final String e = (new StringBuilder()).append(com/fitbit/savedstate/g.getCanonicalName()).append(".EXTRA_NEW_STATE").toString();
    private static final String f = "FAILURE_COUNT";
    private static final String g = "BOND_STATE.";
    private static final String h = "PAIRING_CONFIRMED.";
    private static final int i = -1;
    private static final g j = new g();

    private g()
    {
        super(1, "DncsState");
    }

    public static TrackerBondState a(String s)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = TrackerBondState.a(j.b().getInt(d(s), -1));
_L4:
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public static void a(int i1)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        j.b().edit().putInt("FAILURE_COUNT", i1).apply();
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(BluetoothDevice bluetoothdevice, TrackerBondState trackerbondstate)
    {
        if (bluetoothdevice != null)
        {
            a(com.fitbit.galileo.a.f.a(bluetoothdevice), trackerbondstate);
        }
    }

    public static void a(Device device, boolean flag)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        if (device == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        a(device.d(), flag);
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
        device;
        throw device;
    }

    public static void a(String s, TrackerBondState trackerbondstate)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        TrackerBondState trackerbondstate1 = a(s);
        if (trackerbondstate1 == trackerbondstate) goto _L2; else goto _L3
_L3:
        if (trackerbondstate == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        j.c().putInt(d(s), trackerbondstate.ordinal()).apply();
_L4:
        a(s, trackerbondstate1, trackerbondstate);
_L2:
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
        j.c().remove(d(s)).apply();
          goto _L4
        s;
        throw s;
    }

    private static void a(String s, TrackerBondState trackerbondstate, TrackerBondState trackerbondstate1)
    {
        Intent intent = new Intent(b);
        intent.putExtra(c, s);
        if (trackerbondstate != null)
        {
            intent.putExtra(d, trackerbondstate);
        }
        if (trackerbondstate1 != null)
        {
            intent.putExtra(e, trackerbondstate1);
        }
        z.a(intent);
    }

    public static void a(String s, boolean flag)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        j.c().putBoolean(e(s), flag).apply();
_L2:
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
_L4:
        j.c().remove(e(s)).apply();
        if (true) goto _L2; else goto _L5
_L5:
        s;
        throw s;
    }

    public static void b(String s)
    {
        a(s, ((TrackerBondState) (null)));
    }

    public static boolean c(String s)
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        boolean flag = j.b().getBoolean(e(s), false);
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    private static String d(String s)
    {
        if (s != null)
        {
            return s.toUpperCase(Locale.UK);
        } else
        {
            return null;
        }
    }

    private static String e(String s)
    {
        s = f(s);
        if (s != null)
        {
            return (new StringBuilder()).append("PAIRING_CONFIRMED.").append(s).toString();
        } else
        {
            return null;
        }
    }

    private static String f(String s)
    {
        if (s != null)
        {
            return s.toUpperCase(Locale.UK);
        } else
        {
            return null;
        }
    }

    public static g g()
    {
        return j;
    }

    public static int h()
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        int i1 = j.b().getInt("FAILURE_COUNT", 0);
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void i()
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        a(h() + 1);
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void j()
    {
        com/fitbit/savedstate/g;
        JVM INSTR monitorenter ;
        a(0);
        com/fitbit/savedstate/g;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void k()
    {
        Object obj = j.b().getAll();
        if (obj != null)
        {
            obj = ((Map) (obj)).keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                if (s.startsWith("BOND_STATE."))
                {
                    b(s.substring("BOND_STATE.".length()));
                }
            } while (true);
        }
        j.b().edit().clear().apply();
    }

    private static SharedPreferences l()
    {
        return j.b();
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        if (i1 != 0 || j1 != 1) goto _L2; else goto _L1
_L1:
        Object obj;
        context = a(context);
        obj = context.getAll();
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((Map) (obj)).keySet().iterator();
_L4:
        String s;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)((Iterator) (obj)).next();
        if (s.endsWith("FAILURE_COUNT"))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = context.getInt(s, -1);
        if (i1 != -1)
        {
            try
            {
                editor.putInt(d(s), i1);
            }
            catch (Throwable throwable)
            {
                com.fitbit.e.a.a(f(), throwable.toString(), new Object[0]);
            }
        }
        editor.remove(s);
        if (true) goto _L4; else goto _L2
_L2:
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        k();
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
