// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class UISavedState extends a
{
    public static final class AnimatedGoalType extends Enum
    {

        public static final AnimatedGoalType a;
        public static final AnimatedGoalType b;
        public static final AnimatedGoalType c;
        public static final AnimatedGoalType d;
        public static final AnimatedGoalType e;
        public static final AnimatedGoalType f;
        public static final AnimatedGoalType g;
        private static final AnimatedGoalType h[];

        public static AnimatedGoalType valueOf(String s1)
        {
            return (AnimatedGoalType)Enum.valueOf(com/fitbit/savedstate/UISavedState$AnimatedGoalType, s1);
        }

        public static AnimatedGoalType[] values()
        {
            return (AnimatedGoalType[])h.clone();
        }

        static 
        {
            a = new AnimatedGoalType("CALORIES", 0);
            b = new AnimatedGoalType("DISTANCE", 1);
            c = new AnimatedGoalType("FLOORS", 2);
            d = new AnimatedGoalType("STEPS", 3);
            e = new AnimatedGoalType("MINUTES_VERY_ACTIVE", 4);
            f = new AnimatedGoalType("WATER", 5);
            g = new AnimatedGoalType("SLEEP", 6);
            h = (new AnimatedGoalType[] {
                a, b, c, d, e, f, g
            });
        }

        private AnimatedGoalType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static UISavedState b = new UISavedState();
    private static final String c = "SHOULD_BE_SHOW_GUIDE_UNTIL_DATE";
    private static final String d = "SHOULD_BE_SHOWN_TILE_UNTIL_DATE";
    private static final String e = "SHOULD_BE_SHOW_TILE_MASK";
    private static final String f = "LAST_PAIRED_DEVICE_NAME";
    private static final String g = "WAS_SHOWN_TIPS";
    private static final String h = "SHOW_ALARM_TUTORIAL";
    private static final String i = "COPPA_WAS_SHOWN_DATE";
    private static final String j = "WAS_SHOWN_UPDATE_AVAILABLE_DIALOG";
    private static final String k = "APP_LAST_START_OR_ENTER_FOREGROUND_DATE";
    private static final String l = "SHOULD_RESTORE_EMAIL";
    private static final String m = "SHOULD_SHOW_FIND_FRIENDS_BUBBLE";
    private static final String n = "ANIMATION_SHOWED.%s";
    private static final String o = "SHOW_LANG_FIRMWARE_AVAILABLE_DIALOG";
    private static final String p = "SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_UNTIL_DATE";
    private static final String q = "SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_MASK";

    UISavedState()
    {
        super("UISavedState");
    }

    public static void a(Device device)
    {
        b.c().putString("LAST_PAIRED_DEVICE_NAME", device.j()).apply();
    }

    public static void a(AnimatedGoalType animatedgoaltype)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putLong(String.format("ANIMATION_SHOWED.%s", new Object[] {
            animatedgoaltype.toString()
        }), (new Date()).getTime());
        editor.apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        animatedgoaltype;
        throw animatedgoaltype;
    }

    public static void a(Date date)
    {
        b.b().edit().putLong("COPPA_WAS_SHOWN_DATE", date.getTime()).apply();
    }

    public static void a(boolean flag)
    {
        b.c().putBoolean("WAS_SHOWN_TIPS", flag).apply();
    }

    public static boolean a(com.fitbit.ui.charts.OnboardingCellView.TileType tiletype)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        if (!tiletype.equals(com.fitbit.ui.charts.OnboardingCellView.TileType.f)) goto _L2; else goto _L1
_L1:
        boolean flag1 = com.fitbit.util.p.a(DeviceFeature.BIKE_TRACKING);
        if (flag1) goto _L2; else goto _L3
_L3:
        flag1 = flag3;
_L5:
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        int i1;
        long l1;
        i1 = tiletype.c();
        tiletype = b.b();
        l1 = tiletype.getLong("SHOULD_BE_SHOWN_TILE_UNTIL_DATE", 0L);
        flag1 = flag3;
        if (l1 == 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(new Date(l1)).before(new Date()))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        m();
        flag1 = flag3;
        continue; /* Loop/switch isn't completed */
        tiletype;
        throw tiletype;
        l1 = tiletype.getLong("SHOULD_BE_SHOW_TILE_MASK", 0L);
        boolean flag;
        if ((l1 & 1L << i1) == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void b(com.fitbit.ui.charts.OnboardingCellView.TileType tiletype)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        int i1 = tiletype.c();
        if (tiletype != com.fitbit.ui.charts.OnboardingCellView.TileType.h) goto _L2; else goto _L1
_L1:
        b.c().putLong("SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_MASK", 1L).commit();
_L4:
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l1 = b.b().getLong("SHOULD_BE_SHOW_TILE_MASK", 0L);
        b.c().putLong("SHOULD_BE_SHOW_TILE_MASK", l1 ^ 1L << i1).apply();
        if (true) goto _L4; else goto _L3
_L3:
        tiletype;
        throw tiletype;
    }

    public static void b(boolean flag)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        b.b().edit().putBoolean("SHOW_ALARM_TUTORIAL", flag).apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean b(AnimatedGoalType animatedgoaltype)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        boolean flag = com.fitbit.util.o.i(new Date(b.b().getLong(String.format("ANIMATION_SHOWED.%s", new Object[] {
            animatedgoaltype.toString()
        }), 0L)));
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag;
        animatedgoaltype;
        throw animatedgoaltype;
    }

    public static void c(boolean flag)
    {
        b.b().edit().putBoolean("WAS_SHOWN_UPDATE_AVAILABLE_DIALOG", flag).apply();
    }

    public static void d(boolean flag)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean("SHOULD_RESTORE_EMAIL", flag);
        editor.apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void e(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = b.c();
        editor.putBoolean("SHOULD_SHOW_FIND_FRIENDS_BUBBLE", flag);
        editor.apply();
    }

    public static void f(boolean flag)
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit().putBoolean("SHOW_LANG_FIRMWARE_AVAILABLE_DIALOG", flag).apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected static a g()
    {
        return b;
    }

    public static boolean h()
    {
        boolean flag = false;
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        long l1 = b.b().getLong("SHOULD_BE_SHOW_GUIDE_UNTIL_DATE", 0L);
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if ((new Date(l1)).before(new Date()))
        {
            j();
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        throw exception;
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void i()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        b.c().putLong("SHOULD_BE_SHOW_GUIDE_UNTIL_DATE", com.fitbit.util.o.a(new Date(), 5, 6).getTime()).apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void j()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        b.c().remove("SHOULD_BE_SHOW_GUIDE_UNTIL_DATE").apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void k()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        b.c().putLong("SHOULD_BE_SHOWN_TILE_UNTIL_DATE", com.fitbit.util.o.a(new Date(), 14, 6).getTime()).putLong("SHOULD_BE_SHOW_TILE_MASK", 0x7fffffffffffffffL).apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean l()
    {
        SharedPreferences sharedpreferences = b.b();
        long l1 = sharedpreferences.getLong("SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_UNTIL_DATE", 0L);
        if (l1 == 0L)
        {
            sharedpreferences.edit().putLong("SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_UNTIL_DATE", com.fitbit.util.o.a(new Date(), 30, 6).getTime()).commit();
        } else
        {
            if ((new Date(l1)).before(new Date()))
            {
                return false;
            }
            if (sharedpreferences.getLong("SavedState.HomeState.SHOULD_SHOW_SLEEP_NEWS_MASK", 0L) != 0L)
            {
                return false;
            }
        }
        return true;
    }

    public static void m()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        b.c().remove("SHOULD_BE_SHOWN_TILE_UNTIL_DATE").remove("SHOULD_BE_SHOW_TILE_MASK").apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String n()
    {
        return b.b().getString("LAST_PAIRED_DEVICE_NAME", "");
    }

    public static boolean o()
    {
        return b.b().getBoolean("WAS_SHOWN_TIPS", true);
    }

    public static boolean p()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("SHOW_ALARM_TUTORIAL", true);
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean q()
    {
        return b.b().getBoolean("WAS_SHOWN_UPDATE_AVAILABLE_DIALOG", false);
    }

    public static Date r()
    {
        return new Date(b.b().getLong("COPPA_WAS_SHOWN_DATE", 0L));
    }

    public static void s()
    {
        b.b().edit().remove("COPPA_WAS_SHOWN_DATE").apply();
    }

    public static void t()
    {
        b.b().edit().putLong("APP_LAST_START_OR_ENTER_FOREGROUND_DATE", (new Date()).getTime()).apply();
    }

    public static Date u()
    {
        return new Date(b.b().getLong("APP_LAST_START_OR_ENTER_FOREGROUND_DATE", 0L));
    }

    public static boolean v()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("SHOULD_RESTORE_EMAIL", true);
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean w()
    {
        return b.b().getBoolean("SHOULD_SHOW_FIND_FRIENDS_BUBBLE", false);
    }

    public static boolean x()
    {
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        boolean flag = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getBoolean("SHOW_LANG_FIRMWARE_AVAILABLE_DIALOG", false);
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void y()
    {
        int i1 = 0;
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        AnimatedGoalType aanimatedgoaltype[];
        int j1;
        editor = b.b().edit();
        aanimatedgoaltype = AnimatedGoalType.values();
        j1 = aanimatedgoaltype.length;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        editor.remove(String.format("ANIMATION_SHOWED.%s", new Object[] {
            aanimatedgoaltype[i1].toString()
        }));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        editor.remove("SHOW_LANG_FIRMWARE_AVAILABLE_DIALOG");
        editor.apply();
        com/fitbit/savedstate/UISavedState;
        JVM INSTR monitorexit ;
        return;
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
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.HomeState.SHOULD_BE_SHOW_GUIDE_UNTIL_DATE"))
        {
            editor.putLong("SHOULD_BE_SHOW_GUIDE_UNTIL_DATE", context.getLong("SavedState.HomeState.SHOULD_BE_SHOW_GUIDE_UNTIL_DATE", 0L));
            editor1.remove("SavedState.HomeState.SHOULD_BE_SHOW_GUIDE_UNTIL_DATE");
        }
        if (context.contains("SavedState.HomeState.SHOULD_BE_SHOW_TILE_UNTIL_DATE"))
        {
            editor.putLong("SHOULD_BE_SHOWN_TILE_UNTIL_DATE", context.getLong("SavedState.HomeState.SHOULD_BE_SHOW_TILE_UNTIL_DATE", 0L));
            editor1.remove("SavedState.HomeState.SHOULD_BE_SHOW_TILE_UNTIL_DATE");
        }
        if (context.contains("SavedState.HomeState.SHOULD_BE_SHOW_TILE_MASK"))
        {
            editor.putLong("SHOULD_BE_SHOW_TILE_MASK", context.getLong("SavedState.HomeState.SHOULD_BE_SHOW_TILE_MASK", 0L));
            editor1.remove("SavedState.HomeState.SHOULD_BE_SHOW_TILE_MASK");
        }
        if (context.contains("SavedState.HomeState.LAST_PAIRED_DEVICE_NAME"))
        {
            editor.putString("LAST_PAIRED_DEVICE_NAME", context.getString("SavedState.HomeState.LAST_PAIRED_DEVICE_NAME", null));
            editor1.remove("SavedState.HomeState.LAST_PAIRED_DEVICE_NAME");
        }
        if (context.contains("SavedState.AppState.WAS_SHOWN_TIPS"))
        {
            editor.putBoolean("WAS_SHOWN_TIPS", context.getBoolean("SavedState.AppState.WAS_SHOWN_TIPS", false));
            editor1.remove("SavedState.AppState.WAS_SHOWN_TIPS");
        }
        if (context.contains("SavedState.HomeState.SHOW_ALARM_TUTORIAL"))
        {
            editor.putBoolean("SHOW_ALARM_TUTORIAL", context.getBoolean("SavedState.HomeState.SHOW_ALARM_TUTORIAL", false));
            editor1.remove("SavedState.HomeState.SHOW_ALARM_TUTORIAL");
        }
        if (context.contains("SavedState.AppState.COPPA_WAS_SHOWN_DATE"))
        {
            editor.putLong("COPPA_WAS_SHOWN_DATE", context.getLong("SavedState.AppState.COPPA_WAS_SHOWN_DATE", 0L));
            editor1.remove("SavedState.AppState.COPPA_WAS_SHOWN_DATE");
        }
        if (context.contains("SavedState.AppState.WAS_SHOWN_UPDATE_AVAILABLE_DIALOG"))
        {
            editor.putBoolean("WAS_SHOWN_UPDATE_AVAILABLE_DIALOG", context.getBoolean("SavedState.AppState.WAS_SHOWN_UPDATE_AVAILABLE_DIALOG", false));
            editor1.remove("SavedState.AppState.WAS_SHOWN_UPDATE_AVAILABLE_DIALOG");
        }
        if (context.contains("SavedState.AppState.APP_LAST_START_OR_ENTER_FOREGROUND_DATE"))
        {
            editor.putLong("APP_LAST_START_OR_ENTER_FOREGROUND_DATE", context.getLong("SavedState.AppState.APP_LAST_START_OR_ENTER_FOREGROUND_DATE", 0L));
            editor1.remove("SavedState.AppState.APP_LAST_START_OR_ENTER_FOREGROUND_DATE");
        }
        if (context.contains("SavedState.GalileoState.SHOULD_RESTORE_EMAIL"))
        {
            editor.putBoolean("SHOULD_RESTORE_EMAIL", context.getBoolean("SavedState.GalileoState.SHOULD_RESTORE_EMAIL", false));
            editor1.remove("SavedState.GalileoState.SHOULD_RESTORE_EMAIL");
        }
        if (context.contains("SavedState.AddFriendsParams.SHOULD_SHOW_FIND_FRIENDS_BUBBLE"))
        {
            editor.putBoolean("SHOULD_SHOW_FIND_FRIENDS_BUBBLE", context.getBoolean("SavedState.AddFriendsParams.SHOULD_SHOW_FIND_FRIENDS_BUBBLE", false));
            editor1.remove("SavedState.AddFriendsParams.SHOULD_SHOW_FIND_FRIENDS_BUBBLE");
        }
        AnimatedGoalType aanimatedgoaltype[] = AnimatedGoalType.values();
        j1 = aanimatedgoaltype.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            Object obj = aanimatedgoaltype[i1];
            String s1 = String.format("SavedState.GoalState.AnimationShowed.%s", new Object[] {
                ((AnimatedGoalType) (obj)).toString()
            });
            obj = String.format("ANIMATION_SHOWED.%s", new Object[] {
                ((AnimatedGoalType) (obj)).toString()
            });
            if (context.contains(s1))
            {
                editor.putLong(((String) (obj)), context.getLong(s1, 0L));
                editor1.remove(s1);
            }
        }

        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        AnimatedGoalType aanimatedgoaltype[] = AnimatedGoalType.values();
        int j1 = aanimatedgoaltype.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            AnimatedGoalType animatedgoaltype = aanimatedgoaltype[i1];
            b.c().remove(String.format("ANIMATION_SHOWED.%s", new Object[] {
                animatedgoaltype.toString()
            }));
        }

        b.c().remove("LAST_PAIRED_DEVICE_NAME").remove("SHOULD_BE_SHOW_GUIDE_UNTIL_DATE").remove("SHOULD_BE_SHOW_TILE_MASK").remove("SHOULD_BE_SHOWN_TILE_UNTIL_DATE").remove("WAS_SHOWN_TIPS").remove("SHOW_ALARM_TUTORIAL").remove("WAS_SHOWN_UPDATE_AVAILABLE_DIALOG").remove("SHOULD_RESTORE_EMAIL").apply();
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
