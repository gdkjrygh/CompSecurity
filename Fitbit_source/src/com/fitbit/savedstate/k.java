// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.TrackerType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class k extends com.fitbit.savedstate.a
{
    public static interface a
    {

        public abstract void a(Class class1);
    }


    private static final k b = new k();
    private static final String c = "ERRORS";
    private static final String d = "LAST_DATE";
    private static final String e = "INITIAL_DEVICE_SETUP_IN_PROGRESS";
    private static final String f = "INITIAL_DEVICE_SETUP_DEVICE_TYPE";
    private static final String g = "INITIAL_DEVICE_SETUP_POSTPONE_DATE";
    private static Set h = new HashSet();

    k()
    {
        super("HomeSavedState");
    }

    public static void a(int i1)
    {
        com/fitbit/savedstate/k;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = b.b();
        String s = sharedpreferences.getString("ERRORS", "");
        s = (new StringBuilder()).append(s).append(",").append(Integer.toString(i1)).toString();
        sharedpreferences.edit().putString("ERRORS", s).apply();
        p();
        com/fitbit/savedstate/k;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(TrackerType trackertype)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        if (trackertype == null) goto _L2; else goto _L1
_L1:
        editor.putString("INITIAL_DEVICE_SETUP_DEVICE_TYPE", trackertype.toPublicApiJsonObject().toString());
_L3:
        editor.putBoolean("INITIAL_DEVICE_SETUP_IN_PROGRESS", true);
_L4:
        editor.apply();
        return;
_L2:
        editor.remove("INITIAL_DEVICE_SETUP_DEVICE_TYPE");
          goto _L3
        trackertype;
        trackertype.printStackTrace();
          goto _L4
    }

    public static void a(a a1)
    {
        h.add(a1);
    }

    public static void a(Date date)
    {
        b.c().putLong("LAST_DATE", date.getTime()).apply();
    }

    public static void b(a a1)
    {
        h.remove(a1);
    }

    protected static com.fitbit.savedstate.a g()
    {
        return b;
    }

    public static Date h()
    {
        long l1 = b.b().getLong("LAST_DATE", 0L);
        if (l1 == 0L)
        {
            return null;
        } else
        {
            return new Date(l1);
        }
    }

    public static Integer[] i()
    {
        int i1 = 0;
        com/fitbit/savedstate/k;
        JVM INSTR monitorenter ;
        Integer ainteger[];
        String s;
        ainteger = b.b();
        s = ainteger.getString("ERRORS", null);
        if (s != null) goto _L2; else goto _L1
_L1:
        ainteger = new Integer[0];
_L7:
        com/fitbit/savedstate/k;
        JVM INSTR monitorexit ;
        return ainteger;
_L2:
        String as[];
        ArrayList arraylist;
        int j1;
        as = s.split(",");
        arraylist = new ArrayList();
        j1 = as.length;
_L5:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        String s1 = as[i1];
        int k1 = s1.length();
        Exception exception;
        if (k1 > 0)
        {
            try
            {
                arraylist.add(Integer.valueOf(Integer.parseInt(s1)));
            }
            catch (NumberFormatException numberformatexception) { }
            finally
            {
                com/fitbit/savedstate/k;
            }
        }
        i1++;
          goto _L5
_L4:
        ainteger.edit().putString("ERRORS", null).apply();
        ainteger = (Integer[])arraylist.toArray(new Integer[arraylist.size()]);
        if (true) goto _L7; else goto _L6
_L6:
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean j()
    {
        return b.b().getBoolean("INITIAL_DEVICE_SETUP_IN_PROGRESS", false);
    }

    public static TrackerType k()
    {
        Object obj;
        obj = b.b().getString("INITIAL_DEVICE_SETUP_DEVICE_TYPE", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject(((String) (obj)));
        obj = new TrackerType();
        ((TrackerType) (obj)).initFromPublicApiJsonObject(jsonobject);
        return ((TrackerType) (obj));
        JSONException jsonexception;
        jsonexception;
        obj = null;
_L2:
        jsonexception.printStackTrace();
        return ((TrackerType) (obj));
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static void l()
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.remove("INITIAL_DEVICE_SETUP_IN_PROGRESS");
        editor.remove("INITIAL_DEVICE_SETUP_DEVICE_TYPE");
        editor.remove("INITIAL_DEVICE_SETUP_POSTPONE_DATE");
        editor.apply();
    }

    public static void m()
    {
        b.b().edit().putLong("INITIAL_DEVICE_SETUP_POSTPONE_DATE", (new Date()).getTime()).apply();
    }

    public static Date n()
    {
        return new Date(b.b().getLong("INITIAL_DEVICE_SETUP_POSTPONE_DATE", 0L));
    }

    static Set o()
    {
        return h;
    }

    private static void p()
    {
        (new Handler(FitBitApplication.a().getMainLooper())).post(new _cls1());
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
        if (context.contains("SavedState.HomeState.ERRORS"))
        {
            editor.putString("ERRORS", context.getString("SavedState.HomeState.ERRORS", null));
            editor1.remove("SavedState.HomeState.ERRORS");
        }
        if (context.contains("SavedState.HomeChartState.LAST_DATE"))
        {
            editor.putLong("LAST_DATE", context.getLong("SavedState.HomeChartState.LAST_DATE", 0L));
            editor1.remove("SavedState.HomeChartState.LAST_DATE");
        }
        if (context.contains("SavedState.AppState.INITIAL_DEVICE_SETUP_IN_PROGRESS"))
        {
            editor.putBoolean("INITIAL_DEVICE_SETUP_IN_PROGRESS", context.getBoolean("SavedState.AppState.INITIAL_DEVICE_SETUP_IN_PROGRESS", false));
            editor1.remove("SavedState.AppState.INITIAL_DEVICE_SETUP_IN_PROGRESS");
        }
        if (context.contains("SavedState.AppState.INITIAL_DEVICE_SETUP_DEVICE_TYPE"))
        {
            editor.putString("INITIAL_DEVICE_SETUP_DEVICE_TYPE", context.getString("SavedState.AppState.INITIAL_DEVICE_SETUP_DEVICE_TYPE", null));
            editor1.remove("SavedState.AppState.INITIAL_DEVICE_SETUP_DEVICE_TYPE");
        }
        if (context.contains("SavedState.AppState.INITIAL_DEVICE_SETUP_POSTPONE_DATE"))
        {
            editor.putLong("INITIAL_DEVICE_SETUP_POSTPONE_DATE", context.getLong("SavedState.AppState.INITIAL_DEVICE_SETUP_POSTPONE_DATE", 0L));
            editor1.remove("SavedState.AppState.INITIAL_DEVICE_SETUP_POSTPONE_DATE");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.c();
        editor.remove("INITIAL_DEVICE_SETUP_IN_PROGRESS");
        editor.remove("INITIAL_DEVICE_SETUP_DEVICE_TYPE");
        editor.remove("INITIAL_DEVICE_SETUP_POSTPONE_DATE");
        editor.putString("ERRORS", null).putLong("LAST_DATE", 0L);
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }


    /* member class not found */
    class _cls1 {}

}
