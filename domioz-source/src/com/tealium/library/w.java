// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AbsSeekBar;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.TimePicker;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

// Referenced classes of package com.tealium.library:
//            l, Tealium, u, b, 
//            s, C, G

final class w
    implements l
{

    private final SharedPreferences a;
    private final SparseArray b = new SparseArray(28);
    private final SimpleDateFormat c;
    private final SimpleDateFormat d;
    private final TelephonyManager e;
    private final WindowManager f;
    private final s g;
    private final a h;

    w(Tealium.Config config, s s1)
    {
        a = config.a();
        g = s1;
        d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        d.setTimeZone(TimeZone.getTimeZone("UTC"));
        e = (TelephonyManager)config.f().getSystemService("phone");
        f = (WindowManager)config.f().getSystemService("window");
        h = new a(config.f());
        b.put(0x400000, "FLAG_ACTIVITY_BROUGHT_TO_FRONT");
        b.put(0x4000000, "FLAG_ACTIVITY_CLEAR_TOP");
        b.put(0x800000, "FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS");
        b.put(0x2000000, "FLAG_ACTIVITY_FORWARD_RESULT");
        b.put(0x100000, "FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY");
        b.put(0x8000000, "FLAG_ACTIVITY_MULTIPLE_TASK");
        b.put(0x10000000, "FLAG_ACTIVITY_NEW_TASK");
        b.put(0x10000, "FLAG_ACTIVITY_NO_ANIMATION");
        b.put(0x40000000, "FLAG_ACTIVITY_NO_HISTORY");
        b.put(0x40000, "FLAG_ACTIVITY_NO_USER_ACTION");
        b.put(0x1000000, "FLAG_ACTIVITY_PREVIOUS_IS_TOP");
        b.put(0x20000, "FLAG_ACTIVITY_REORDER_TO_FRONT");
        b.put(0x200000, "FLAG_ACTIVITY_RESET_TASK_IF_NEEDED");
        b.put(0x20000000, "FLAG_ACTIVITY_SINGLE_TOP");
        b.put(8, "FLAG_DEBUG_LOG_RESOLUTION");
        b.put(4, "FLAG_FROM_BACKGROUND");
        b.put(1, "FLAG_GRANT_READ_URI_PERMISSION");
        b.put(2, "FLAG_GRANT_WRITE_URI_PERMISSION");
        b.put(0x40000000, "FLAG_RECEIVER_REGISTERED_ONLY");
        b.put(0x20000000, "FLAG_RECEIVER_REPLACE_PENDING");
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            b.put(0x80000, "FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET");
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b.put(32768, "FLAG_ACTIVITY_CLEAR_TASK");
            b.put(16384, "FLAG_ACTIVITY_TASK_ON_HOME");
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                b.put(16, "FLAG_EXCLUDE_STOPPED_PACKAGES");
                b.put(32, "FLAG_INCLUDE_STOPPED_PACKAGES");
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    b.put(0x10000000, "FLAG_RECEIVER_FOREGROUND");
                    if (android.os.Build.VERSION.SDK_INT >= 19)
                    {
                        b.put(64, "FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                        b.put(0x8000000, "FLAG_RECEIVER_NO_ABORT");
                    }
                }
            }
        }
        c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
        SharedPreferences sharedpreferences = Tealium.getGlobalCustomData();
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        s1 = config.f();
        int i = s1.getApplicationInfo().labelRes;
        String s2;
        if (i == 0)
        {
            u.d("Unable to find app name, context.getApplicationInfo().labelRes returns 0");
            s1 = b(s1.getPackageName());
        } else
        {
            s1 = b(s1.getString(i));
        }
        s1 = b(s1);
        if (s1 != null && !s1.equals(sharedpreferences.getString("app_name", null)))
        {
            editor.putString("app_name", s1);
        }
        s2 = b(a.a(config.f()));
        if (s2 != null && !s1.equals(sharedpreferences.getString("app_version", null)))
        {
            editor.putString("app_version", s2);
            if (s1 != null)
            {
                editor.putString("app_id", (new StringBuilder()).append(s1).append(" ").append(s2).toString());
            }
        }
        if (!sharedpreferences.contains("device"))
        {
            s1 = h.b();
            if (s1 != null)
            {
                editor.putString("device", s1);
            }
        }
        if (!sharedpreferences.contains("device_resolution"))
        {
            s1 = h.a(f.getDefaultDisplay());
            if (s1 != null)
            {
                editor.putString("device_resolution", s1);
            }
        }
        if (sharedpreferences.getInt("os_version", 0) != android.os.Build.VERSION.SDK_INT)
        {
            editor.putInt("os_version", android.os.Build.VERSION.SDK_INT);
        }
        if (!sharedpreferences.contains("device_architecture"))
        {
            editor.putString("device_architecture", "32");
        }
        if (!sharedpreferences.contains("device_cputype"))
        {
            s1 = System.getProperty("os.arch", null);
            if (s1 != null)
            {
                editor.putString("device_cputype", s1);
            }
        }
        if (!sharedpreferences.contains("uuid"))
        {
            editor.putString("uuid", UUID.randomUUID().toString());
        }
        a(sharedpreferences, editor, "origin", "mobile");
        a(sharedpreferences, editor, "platform", "android");
        if (!sharedpreferences.contains("platform"))
        {
            a(sharedpreferences, editor, "platform", "android");
            editor.putString("platform_version", (new StringBuilder("android ")).append(android.os.Build.VERSION.SDK_INT).toString());
        }
        if (!config.f().getPackageName().equals(sharedpreferences.getString("app_rdns", null)))
        {
            editor.putString("app_rdns", config.f().getPackageName());
        }
        if (!b.a.equals(sharedpreferences.getString("library_version", null)))
        {
            editor.putString("library_version", b.a);
        }
        editor.commit();
    }

    static String a(String s1)
    {
        return b(s1);
    }

    private void a(Intent intent, C c1)
    {
        if (intent != null && g.d()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = intent.getDataString();
        String s2 = intent.getAction();
        Set set = intent.getCategories();
        String s4 = intent.getPackage();
        String s5 = intent.getScheme();
        String s6 = intent.getType();
        if (s1 != null && !s1.equals(""))
        {
            c1.c("ivar_datastring", s1);
        }
        if (s2 != null && !s2.equals(""))
        {
            c1.c("ivar_action", s2);
        }
        if (s4 != null && !s4.equals(""))
        {
            c1.c("ivar_package", s4);
        }
        if (s5 != null && !s5.equals(""))
        {
            c1.c("ivar_scheme", s5);
        }
        if (s6 != null && !s6.equals(""))
        {
            c1.c("ivar_type", s6);
        }
        if (set != null && set.size() > 0)
        {
            c1.c("ivar_categories", G.a(set, ","));
        }
        int i1 = intent.getFlags();
        if (i1 != 0)
        {
            Object obj = new String[b.size()];
            int i = 0;
            int j;
            int k;
            for (j = -1; i < b.size(); j = k)
            {
                int j1 = b.keyAt(i);
                k = j;
                if ((i1 & j1) == 1)
                {
                    k = j + 1;
                    obj[k] = (String)b.get(j1);
                }
                i++;
            }

            String s3;
            if (j == -1)
            {
                c1.c("ivar_flags", Integer.toHexString(i1));
            } else
            {
                c1.c("ivar_flags", G.a((String[])Arrays.copyOf(((Object []) (obj)), j + 1), ","));
            }
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            obj = intent.keySet();
            if (obj != null)
            {
                obj = ((Set) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    s3 = (String)((Iterator) (obj)).next();
                    c1.c((new StringBuilder("ivar_")).append(s3).toString(), intent.get(s3).toString());
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor, String s1, String s2)
    {
        if (!sharedpreferences.contains(s1))
        {
            editor.putString(s1, s2);
        }
    }

    private void a(C c1)
    {
        String s2;
        String s3;
        String s4;
        String s5;
        s2 = e.getNetworkOperatorName();
        s3 = e.getNetworkCountryIso();
        s4 = e.getNetworkOperator();
        s5 = h.a();
        f.getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 1 3: default 72
    //                   1 363
    //                   2 370
    //                   3 377;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1 = "Portrait";
_L6:
        String s6 = Locale.getDefault().getLanguage();
        Date date = new Date();
        if (s2 != null && !s2.equals(""))
        {
            c1.c("carrier", s2);
        }
        if (s3 != null && !s3.equals(""))
        {
            c1.c("carrier_iso", s3);
        }
        if (s4 != null && s4.length() >= 3)
        {
            c1.c("carrier_mcc", s4.substring(0, 3));
            if (s4.length() > 3)
            {
                c1.c("carrier_mnc", s4.substring(3));
            }
        }
        if (s5 != null && !s5.equals(""))
        {
            c1.c("connection_type", s5);
        }
        if (!s1.equals(""))
        {
            c1.c("orientation", s1);
        }
        if (s6 != null && !s6.equals(""))
        {
            c1.c("device_language", s6);
        }
        c1.c("timestamp", d.format(date));
        c1.c("timestamp_unix", Long.toString(date.getTime() / 1000L));
        c1.c("timestamp_local", c.format(date));
        c1.c("timestamp_offset", String.format(Locale.ROOT, "%.0f", new Object[] {
            Float.valueOf((float)TimeZone.getDefault().getOffset(date.getTime()) / 3600000F)
        }));
        return;
_L2:
        s1 = "Landscape Right";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "Portrait UpsideDown";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "Landscape Left";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String b(String s1)
    {
        String s2;
label0:
        {
            if (s1 != null)
            {
                s2 = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s2 = null;
        }
        return s2;
    }

    public final void a(Object obj, C c1, String s1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        c1.a(Tealium.getGlobalCustomData());
        a(c1);
        obj = s1;
        if (s1 == null)
        {
            obj = "link";
        }
        c1.c("call_type", obj);
        c1.c("autotracked", "false");
_L4:
        return;
_L2:
        c1.a(Tealium.getCustomData(obj));
        c1.a(Tealium.getGlobalCustomData());
        c1.c("object_class", obj.getClass().getName());
        if (!(obj instanceof View))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (View)obj;
        a(c1);
        if (!c1.has("tealium_id"))
        {
            c1.d("tealium_id", G.a(s1));
        }
        if (!c1.has("link_id"))
        {
            c1.d("link_id", G.b(s1));
        }
        if (s1 instanceof CompoundButton)
        {
            boolean flag;
            if (!((CompoundButton)s1).isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c1.c("selected_value", Boolean.toString(flag));
        } else
        if (s1 instanceof RatingBar)
        {
            c1.c("selected_value", Float.toString(((RatingBar)s1).getRating()));
        } else
        if (s1 instanceof AbsSeekBar)
        {
            c1.c("selected_value", Integer.toString(((AbsSeekBar)s1).getProgress()));
        } else
        if (s1 instanceof DatePicker)
        {
            obj = (DatePicker)s1;
            c1.c("selected_value", String.format(Locale.ROOT, "%d-%02d-%02d", new Object[] {
                Integer.valueOf(((DatePicker) (obj)).getYear()), Integer.valueOf(((DatePicker) (obj)).getMonth()), Integer.valueOf(((DatePicker) (obj)).getDayOfMonth())
            }));
        } else
        if (s1 instanceof AdapterView)
        {
            obj = ((AdapterView)s1).getSelectedItem();
            if (obj == null)
            {
                obj = G.b(((AdapterView)s1).getSelectedView());
            } else
            {
                obj = obj.toString();
            }
            c1.c("selected_value", obj);
        } else
        if (s1 instanceof TimePicker)
        {
            obj = (TimePicker)s1;
            c1.c("selected_value", String.format(Locale.ROOT, "%d:%02d", new Object[] {
                ((TimePicker) (obj)).getCurrentHour(), ((TimePicker) (obj)).getCurrentMinute()
            }));
        }
        obj = s1.getContext();
        if (!c1.has("screen_title") && (obj instanceof Activity))
        {
            c1.d("screen_title", G.a((Activity)obj));
        }
_L5:
        c1.c("autotracked", "false");
        c1.c("call_type", "link");
        if (c1.get("call_type").equals("link"))
        {
            c1.c("call_eventtype", "action");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj instanceof Activity)
        {
            Activity activity = (Activity)obj;
            a(c1);
            if (!c1.has("tealium_id"))
            {
                c1.d("tealium_id", G.b(activity));
            }
            if (!c1.has("screen_title"))
            {
                c1.d("screen_title", G.a(activity));
            }
            obj = s1;
            if (s1 == null)
            {
                obj = "view";
            }
            c1.c("call_type", obj);
            obj = activity.getWindow().getDecorView();
            c1.c("view_width", (new StringBuilder()).append(((View) (obj)).getWidth()).toString());
            c1.c("view_height", (new StringBuilder()).append(((View) (obj)).getHeight()).toString());
            obj = G.c(activity);
            if (obj != null && ((ViewGroup) (obj)).getChildCount() > 0 && c1.getString("call_type").equals("view"))
            {
                if (((ViewGroup) (obj)).getChildAt(0) instanceof WebView)
                {
                    obj = "webview";
                } else
                {
                    obj = "view";
                }
                c1.c("call_viewtype", obj);
            }
            a(activity.getIntent(), c1);
        } else
        if (obj instanceof Throwable)
        {
            obj = (Throwable)obj;
            a(c1);
            c1.c("exception_name", obj.getClass().getName());
            c1.c("exception_reason", ((Throwable) (obj)).getMessage());
            c1.c("exception_totalcrashcount", Integer.toString(a.getInt("total_crash_count", 0)));
            c1.c("exception_trace", Log.getStackTraceString(((Throwable) (obj))));
            c1.c("exception_type", "caught");
        } else
        if (obj instanceof Intent)
        {
            a((Intent)obj, c1);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private class a
    {

        private final ConnectivityManager a;
        private final Point b = new Point();

        static String a(Context context)
        {
            Object obj = null;
            try
            {
                context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                u.d("App Version Name appears to be missing; this data source will not be available.");
                context = obj;
            }
            return w.a(context);
        }

        private static String a(String s1)
        {
            String s2;
            if (s1 == null || s1.length() == 0)
            {
                s2 = "";
            } else
            {
                char c1 = s1.charAt(0);
                s2 = s1;
                if (!Character.isUpperCase(c1))
                {
                    return (new StringBuilder()).append(Character.toUpperCase(c1)).append(s1.substring(1)).toString();
                }
            }
            return s2;
        }

        final String a()
        {
            String s1;
            Object obj;
            NetworkInfo networkinfo;
            obj = null;
            networkinfo = a.getActiveNetworkInfo();
            s1 = obj;
            if (networkinfo == null) goto _L2; else goto _L1
_L1:
            s1 = obj;
            if (!networkinfo.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
            if (networkinfo.getType() != 1) goto _L5; else goto _L4
_L4:
            s1 = "WIFI";
_L2:
            return w.a(s1);
_L5:
            s1 = obj;
            if (networkinfo.getType() == 0)
            {
                s1 = a.getActiveNetworkInfo().getSubtypeName();
            }
            if (true) goto _L2; else goto _L6
_L6:
        }

        final String a(Display display)
        {
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                display.getSize(b);
                if (b.x > 0 && b.y > 0)
                {
                    return (new StringBuilder()).append(b.x).append("x").append(b.y).toString();
                }
            } else
            {
                int i = display.getWidth();
                int j = display.getHeight();
                if (i > 0 && j > 0)
                {
                    return (new StringBuilder()).append(i).append("x").append(j).toString();
                }
            }
            return null;
        }

        final String b()
        {
            String s1 = Build.MANUFACTURER;
            String s2 = Build.MODEL;
            if (s2.startsWith(s1))
            {
                return a(s2);
            } else
            {
                return (new StringBuilder()).append(a(s1)).append(" ").append(s2).toString();
            }
        }

        a(Context context)
        {
            a = (ConnectivityManager)context.getSystemService("connectivity");
        }
    }

}
