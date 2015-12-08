// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.e.a;
import com.fitbit.util.p;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class TrackerSyncPreferencesSavedState extends com.fitbit.savedstate.a
{
    public static final class SynclairBackOffReason extends Enum
    {

        public static final SynclairBackOffReason a;
        public static final SynclairBackOffReason b;
        public static final SynclairBackOffReason c;
        private static final SynclairBackOffReason d[];

        public static SynclairBackOffReason valueOf(String s1)
        {
            return (SynclairBackOffReason)Enum.valueOf(com/fitbit/savedstate/TrackerSyncPreferencesSavedState$SynclairBackOffReason, s1);
        }

        public static SynclairBackOffReason[] values()
        {
            return (SynclairBackOffReason[])d.clone();
        }

        static 
        {
            a = new SynclairBackOffReason("RESTRICTION", 0);
            b = new SynclairBackOffReason("FAILED_REQUEST", 1);
            c = new SynclairBackOffReason("UNKNOWN", 2);
            d = (new SynclairBackOffReason[] {
                a, b, c
            });
        }

        private SynclairBackOffReason(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final String A = "SavedState.GalileoState.UPDATED_FIRMWARE";
    private static final String B = "HANDSET_WINDOW_SIZE";
    private static final String C = "LAST_BOOT_TIME";
    private static final String D = "SavedState.GalileoState.TRACKER_LAST_SYNC_TIME";
    private static final String E = "SavedState.GalileoState.LIVE_DATA_BACKOFF_TILL_DATE";
    private static final String F = "SavedState.GalileoState.SKIP_SERVER_ERRORS";
    private static final String G = "SavedState.GalileoState.REDIRECT_URL";
    private static final String H = "SavedState.GalileoState.REDIRECTED_REQUEST_FAIL_COUNT";
    private static final TrackerSyncPreferencesSavedState I = new TrackerSyncPreferencesSavedState();
    private static short J = 0;
    private static boolean K = false;
    public static final String b = "SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED";
    private static final String c = com/fitbit/savedstate/TrackerSyncPreferencesSavedState.getSimpleName();
    private static final String d = "BACKGROUND_SYNC_ENABLED.";
    private static final String e = "SavedState.GalileoState.BACKGROUND_SYNC_WARNING_IS_SHOWN";
    private static final String f = "SavedState.GalileoState.MAX_CONNECTION_INTERVAL";
    private static final short g = 256;
    private static final short h = 16;
    private static final short i = 256;
    private static final String j = "REFRESH_BLE_CACHE_";
    private static final String k = "SavedState.GalileoState.SUGGEST_SYNC_ON_THE_GO";
    private static final String l = "SavedState.GalileoState.USE_BLUETOOTH";
    private static final String m = "SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE";
    private static final String n = "SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT";
    private static final String o = "SavedState.GalileoState.BACKOFF_SYNC_REASON";
    private static final String p = "SavedState.GalileoState.BACKOFF_ALL_TILL_DATE";
    private static final String q = "SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT";
    private static final String r = "SavedState.GalileoState.BACKOFF_ALL_REASON";
    private static final String s = "SavedState.GalileoState.BACKGROUND_SYNC_INTERVAL";
    private static final String t = "SavedState.GalileoState.BACKGROUND_SYNC_SCHEDULED_FROM_DATE";
    private static final String u = "SavedState.GalileoState.BACKGROUND_SYNC_RETRIES_COUNT";
    private static final String v = "SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT";
    private static final String w = "SavedState.GalileoState.BACKGROUND_SYNC_IGNORE_RECENTLY_SYNC_FLAG";
    private static final String x = "TRACKER_LAST_SYNC_TIME.";
    private static final String y = "SavedState.GalileoState.BONDING_TIMEOUT";
    private static final String z = "SavedState.GalileoState.RECENTLY_SYNCED_INTERVAL";

    public TrackerSyncPreferencesSavedState()
    {
        super("TrackerSync");
    }

    public static SynclairBackOffReason A()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        Object obj;
        obj = I.b();
        obj = SynclairBackOffReason.values()[((SharedPreferences) (obj)).getInt("SavedState.GalileoState.BACKOFF_SYNC_REASON", SynclairBackOffReason.c.ordinal())];
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return ((SynclairBackOffReason) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public static void B()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT", 0);
        I.c().putInt("SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT", i1 + 1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void C()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag;
        com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: Sync back off is turned off.", new Object[0]);
        flag = I.b().contains("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE");
        I.c().remove("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE").remove("SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT").remove("SavedState.GalileoState.BACKOFF_SYNC_REASON").apply();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        M();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean D()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l1 = I.b().getLong("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE", 0L);
        l2 = Calendar.getInstance().getTimeInMillis();
        boolean flag;
        if (l2 > l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static int E()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT", 0);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static SynclairBackOffReason F()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        Object obj;
        obj = I.b();
        obj = SynclairBackOffReason.values()[((SharedPreferences) (obj)).getInt("SavedState.GalileoState.BACKOFF_ALL_REASON", SynclairBackOffReason.c.ordinal())];
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return ((SynclairBackOffReason) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public static void G()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT", 0);
        I.c().putInt("SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT", i1 + 1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void H()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag;
        com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: All back off is turned off.", new Object[0]);
        flag = I.b().contains("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE");
        I.c().remove("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE").remove("SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT").remove("SavedState.GalileoState.BACKOFF_ALL_REASON").apply();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        L();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static byte I()
    {
        long l1 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (l1 != I.b().getLong("LAST_BOOT_TIME", l1))
        {
            I.c().remove("HANDSET_WINDOW_SIZE").apply();
        }
        I.c().putLong("LAST_BOOT_TIME", l1).apply();
        return (byte)I.b().getInt("HANDSET_WINDOW_SIZE", 100);
    }

    public static final int J()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BONDING_TIMEOUT", 10);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void K()
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED"));
    }

    private static void L()
    {
        Intent intent = new Intent();
        intent.setAction("com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_ALL_CHANGED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    private static void M()
    {
        Intent intent = new Intent();
        intent.setAction("com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_SYNC_CHANGED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public static void a(byte byte0)
    {
        if (byte0 >= 0)
        {
            I.c().putInt("HANDSET_WINDOW_SIZE", byte0).apply();
        }
    }

    public static void a(int i1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = I.c();
        if (i1 <= 0)
        {
            i1 = 10;
        }
        editor.putInt("SavedState.GalileoState.BONDING_TIMEOUT", i1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(long l1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putLong("SavedState.GalileoState.BACKGROUND_SYNC_SCHEDULED_FROM_DATE", l1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(long l1, SynclairBackOffReason synclairbackoffreason)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l2;
        com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: Sync back off is turned on until %s with reason: %s", new Object[] {
            new Date(l1), synclairbackoffreason
        });
        l2 = I.b().getLong("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE", 0L);
        if (l2 != l1) goto _L2; else goto _L1
_L1:
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
_L2:
        I.c().putLong("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE", l1).putInt("SavedState.GalileoState.BACKOFF_SYNC_REASON", synclairbackoffreason.ordinal()).apply();
        M();
        if (true) goto _L1; else goto _L3
_L3:
        synclairbackoffreason;
        throw synclairbackoffreason;
    }

    public static void a(String s1, long l1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s1))
        {
            I.c().putLong((new StringBuilder()).append("TRACKER_LAST_SYNC_TIME.").append(s1).toString(), l1).apply();
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public static void a(String s1, boolean flag)
    {
        a(s1, flag, false);
    }

    public static void a(String s1, boolean flag, boolean flag1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            I.c().putBoolean((new StringBuilder()).append("BACKGROUND_SYNC_ENABLED.").append(s1).toString(), flag).putBoolean("SavedState.GalileoState.SUGGEST_SYNC_ON_THE_GO", false).apply();
            if (!flag1)
            {
                f(flag);
            }
        }
    }

    public static void a(boolean flag)
    {
        I.c().putBoolean("SavedState.GalileoState.BACKGROUND_SYNC_WARNING_IS_SHOWN", flag).apply();
    }

    public static boolean a(String s1)
    {
        if (s1 != null)
        {
            SharedPreferences sharedpreferences = I.b();
            if (sharedpreferences.contains((new StringBuilder()).append("BACKGROUND_SYNC_ENABLED.").append(s1).toString()))
            {
                return sharedpreferences.getBoolean((new StringBuilder()).append("BACKGROUND_SYNC_ENABLED.").append(s1).toString(), false);
            } else
            {
                a(s1, true);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public static void b(int i1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putInt("SavedState.GalileoState.BACKGROUND_SYNC_RETRIES_COUNT", i1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(long l1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putLong("SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT", l1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(long l1, SynclairBackOffReason synclairbackoffreason)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l2;
        com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: All back off is turned on until %s with reason: %s", new Object[] {
            new Date(l1), synclairbackoffreason
        });
        l2 = I.b().getLong("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE", 0L);
        if (l2 != l1) goto _L2; else goto _L1
_L1:
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
_L2:
        I.c().putLong("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE", l1).putInt("SavedState.GalileoState.BACKOFF_ALL_REASON", synclairbackoffreason.ordinal()).apply();
        L();
        if (true) goto _L1; else goto _L3
_L3:
        synclairbackoffreason;
        throw synclairbackoffreason;
    }

    public static void b(Context context)
    {
        if (k())
        {
            context = com.fitbit.util.p.f();
            if (context != null && !context.h().equals(DeviceVersion.MOTIONBIT) && com.fitbit.bluetooth.g.f() && (com.fitbit.bluetooth.g.h() || !com.fitbit.galileo.a.a.b()))
            {
                b(false);
                c(true);
                com.fitbit.galileo.a.a.b(true);
            }
        }
    }

    public static void b(String s1)
    {
        I.c().putString("SavedState.GalileoState.UPDATED_FIRMWARE", s1).apply();
    }

    public static void b(String s1, boolean flag)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!com.fitbit.util.b.a.a(21)) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        I.c().putBoolean(f(s1), flag).apply();
_L2:
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
_L5:
        I.c().remove(f(s1)).apply();
        if (true) goto _L2; else goto _L6
_L6:
        s1;
        throw s1;
    }

    public static void b(boolean flag)
    {
        I.c().putBoolean("SavedState.GalileoState.SUGGEST_SYNC_ON_THE_GO", flag).apply();
    }

    public static void c(int i1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putInt("SavedState.GalileoState.BACKGROUND_SYNC_INTERVAL", i1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void c(boolean flag)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        if (flag != l())
        {
            I.c().putBoolean("SavedState.GalileoState.USE_BLUETOOTH", flag).apply();
            K();
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean c(String s1)
    {
        boolean flag1 = false;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = flag1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = flag1;
        if (com.fitbit.util.b.a.a(21))
        {
            flag = I.b().getBoolean(f(s1), false);
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    public static void d(int i1)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putInt("SavedState.GalileoState.RECENTLY_SYNCED_INTERVAL", i1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void d(boolean flag)
    {
        K = flag;
    }

    public static boolean d(String s1)
    {
        boolean flag1 = false;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        int i1;
        long l1;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        l1 = I.b().getLong((new StringBuilder()).append("TRACKER_LAST_SYNC_TIME.").append(s1).toString(), 0L);
        l1 = (new Date()).getTime() - l1;
        i1 = I.b().getInt("SavedState.GalileoState.RECENTLY_SYNCED_INTERVAL", 15);
        long l2 = i1;
        flag = flag1;
        if (l1 > 0L)
        {
            flag = flag1;
            if (l1 < l2 * 60000L)
            {
                flag = true;
            }
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    public static long e(String s1)
    {
        long l1 = 0L;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s1))
        {
            l1 = I.b().getLong((new StringBuilder()).append("TRACKER_LAST_SYNC_TIME.").append(s1).toString(), 0L);
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return l1;
        s1;
        throw s1;
    }

    public static void e(boolean flag)
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        I.c().putBoolean("SavedState.GalileoState.BACKGROUND_SYNC_IGNORE_RECENTLY_SYNC_FLAG", flag).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static String f(String s1)
    {
        return (new StringBuilder()).append("REFRESH_BLE_CACHE_").append(s1).toString();
    }

    private static void f(boolean flag)
    {
        Intent intent = new Intent();
        intent.setAction("com.fitbit.galileo.GALILEO_SYNC_BACKGROUND_SYNC_OPTION_CHANGED");
        intent.putExtra("com.fitbit.galileo.EXTRA_SUCCESS", flag);
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public static com.fitbit.savedstate.a g()
    {
        return I;
    }

    public static boolean h()
    {
        return I.b().getBoolean("SavedState.GalileoState.BACKGROUND_SYNC_WARNING_IS_SHOWN", false);
    }

    public static long i()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l1 = I.b().getLong("SavedState.GalileoState.BACKGROUND_SYNC_SCHEDULED_FROM_DATE", 0L);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public static String j()
    {
        return I.b().getString("SavedState.GalileoState.UPDATED_FIRMWARE", null);
    }

    public static boolean k()
    {
        return I.b().getBoolean("SavedState.GalileoState.SUGGEST_SYNC_ON_THE_GO", true);
    }

    public static boolean l()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag = I.b().getBoolean("SavedState.GalileoState.USE_BLUETOOTH", true);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static short m()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1;
        long l1 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (l1 != I.b().getLong("LAST_BOOT_TIME", l1))
        {
            I.c().remove("SavedState.GalileoState.MAX_CONNECTION_INTERVAL").apply();
        }
        I.c().putLong("LAST_BOOT_TIME", l1).apply();
        i1 = I.b().getInt("SavedState.GalileoState.MAX_CONNECTION_INTERVAL", 16);
        short word0 = (short)i1;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return word0;
        Exception exception;
        exception;
        throw exception;
    }

    public static void n()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int j1 = m() * 2;
        int i1;
        i1 = j1;
        if (j1 > 256)
        {
            i1 = 16;
        }
        I.c().putInt("SavedState.GalileoState.MAX_CONNECTION_INTERVAL", i1).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void o()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(c, "MaxConnectionInterval reset", new Object[0]);
        I.c().putInt("SavedState.GalileoState.MAX_CONNECTION_INTERVAL", 16).apply();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static short p()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        short word0 = J;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return word0;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean q()
    {
        return K;
    }

    public static void r()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        J = 0;
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void s()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        if (J != 0) goto _L2; else goto _L1
_L1:
        J = 16;
_L4:
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return;
_L2:
        J *= 2;
        if (J > 256)
        {
            J = 16;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean t()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        boolean flag = I.b().getBoolean("SavedState.GalileoState.BACKGROUND_SYNC_IGNORE_RECENTLY_SYNC_FLAG", false);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static int u()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKGROUND_SYNC_RETRIES_COUNT", 0);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static int v()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKGROUND_SYNC_INTERVAL", 16);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static long w()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l1 = I.b().getLong("SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT", 0L);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean x()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        SharedPreferences sharedpreferences = I.b();
        l2 = sharedpreferences.getLong("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE", 0L);
        long l3 = sharedpreferences.getLong("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE", 0L);
        l1 = Calendar.getInstance().getTimeInMillis();
        l2 = Math.max(l3, l2);
        boolean flag;
        if (l1 > l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static long y()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        SharedPreferences sharedpreferences = I.b();
        l1 = sharedpreferences.getLong("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE", 0L);
        l1 = Math.max(sharedpreferences.getLong("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE", 0L), l1);
        l2 = Calendar.getInstance().getTimeInMillis();
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return l1 - l2;
        Exception exception;
        exception;
        throw exception;
    }

    public static int z()
    {
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorenter ;
        int i1 = I.b().getInt("SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT", 0);
        com/fitbit/savedstate/TrackerSyncPreferencesSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
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
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        context = a(context);
        if (sharedpreferences.contains("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME"))
        {
            editor.putLong("SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT", sharedpreferences.getLong("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME", 0L)).remove("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME");
        }
        if (context.contains("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME"))
        {
            editor.putLong("SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT", context.getLong("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME", 0L)).remove("SavedState.GalileoState.TRACKER_LAST_SYNC_TIME");
        }
        context = new String[2];
        context[0] = "SavedState.GalileoState.UPDATED_FIRMWARE";
        context[1] = "SavedState.GalileoState.REDIRECT_URL";
        j1 = context.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            String s1 = context[i1];
            if (sharedpreferences.contains(s1))
            {
                editor.putString(s1, sharedpreferences.getString(s1, null));
            }
        }

        context = new String[6];
        context[0] = "SavedState.GalileoState.REDIRECTED_REQUEST_FAIL_COUNT";
        context[1] = "SavedState.GalileoState.BONDING_TIMEOUT";
        context[2] = "SavedState.GalileoState.MAX_CONNECTION_INTERVAL";
        context[3] = "SavedState.GalileoState.BACKGROUND_SYNC_RETRIES_COUNT";
        context[4] = "SavedState.GalileoState.BACKGROUND_SYNC_INTERVAL";
        context[5] = "SavedState.GalileoState.RECENTLY_SYNCED_INTERVAL";
        j1 = context.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            String s2 = context[i1];
            if (sharedpreferences.contains(s2))
            {
                editor.putInt(s2, sharedpreferences.getInt(s2, 0x80000000));
            }
        }

        context = new String[5];
        context[0] = "SavedState.GalileoState.LIVE_DATA_BACKOFF_TILL_DATE";
        context[1] = "SavedState.GalileoState.BACKGROUND_SYNC_SCHEDULED_FROM_DATE";
        context[2] = "SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE";
        context[3] = "SavedState.GalileoState.BACKOFF_ALL_TILL_DATE";
        context[4] = "SavedState.GalileoState.TRACKER_LAST_SYNC_TIME";
        j1 = context.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            String s3 = context[i1];
            if (sharedpreferences.contains(s3))
            {
                editor.putLong(s3, sharedpreferences.getLong(s3, 0x8000000000000000L));
            }
        }

        context = new String[5];
        context[0] = "SavedState.GalileoState.USE_BLUETOOTH";
        context[1] = "SavedState.GalileoState.BACKGROUND_SYNC_IGNORE_RECENTLY_SYNC_FLAG";
        context[2] = "SavedState.GalileoState.SKIP_SERVER_ERRORS";
        context[3] = "SavedState.GalileoState.SUGGEST_SYNC_ON_THE_GO";
        context[4] = "SavedState.GalileoState.BACKGROUND_SYNC_WARNING_IS_SHOWN";
        j1 = context.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            String s4 = context[i1];
            if (sharedpreferences.contains(s4))
            {
                editor.putBoolean(s4, sharedpreferences.getBoolean(s4, false));
            }
        }

    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new HashSet();
        Iterator iterator = I.b().getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith("TRACKER_LAST_SYNC_TIME."))
            {
                ((Set) (obj)).add(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_76;
        obj;
        throw obj;
        android.content.SharedPreferences.Editor editor;
        editor = I.c().remove("SavedState.GalileoState.BACKGROUND_SYNC_INTERVAL").remove("SavedState.GalileoState.BACKGROUND_SYNC_LAST_ATTEMPT").remove("SavedState.GalileoState.BACKOFF_ALL_TILL_DATE").remove("SavedState.GalileoState.BACKOFF_ALL_RETRY_ATTEMPT").remove("SavedState.GalileoState.BACKOFF_SYNC_TILL_DATE").remove("SavedState.GalileoState.BACKOFF_SYNC_RETRY_ATTEMPT").remove("SavedState.GalileoState.BACKGROUND_SYNC_IGNORE_RECENTLY_SYNC_FLAG").remove("SavedState.GalileoState.REDIRECT_URL").remove("SavedState.GalileoState.REDIRECTED_REQUEST_FAIL_COUNT").remove("SavedState.GalileoState.RECENTLY_SYNCED_INTERVAL").remove("SavedState.GalileoState.USE_BLUETOOTH").remove("SavedState.GalileoState.UPDATED_FIRMWARE");
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); editor.remove((String)((Iterator) (obj)).next())) { }
        editor.apply();
        f(false);
        this;
        JVM INSTR monitorexit ;
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

    static 
    {
        J = 0;
        K = false;
    }
}
