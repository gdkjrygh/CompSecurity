// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.kochava.android.tracker:
//            Global, Feature, KochavaDbAdapter

class a extends TimerTask
{

    final a a;

    public void run()
    {
        if (Global.a)
        {
            Log.e("KochavaTracker", "Reached 10 min mark w/o sending initial, sending now.");
        }
        Feature.b(a(a), false);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/kochava/android/tracker/Feature$3

/* anonymous class */
    class Feature._cls3 extends Handler
    {

        final Feature a;

        static Feature a(Feature._cls3 _pcls3)
        {
            return _pcls3.a;
        }

        public void handleMessage(Message message)
        {
            boolean flag;
            flag = message.getData().getBoolean("sendonstart");
            Feature.c(Feature.a(a));
            Feature.a(a, Feature.b(a));
            Feature.b(a, Feature.c(a));
            Feature.c(a, "Default");
            Feature.d(a, "N/A");
            Feature.e(a, "");
            PackageManager packagemanager = Feature.d(a).getApplicationContext().getPackageManager();
            message = packagemanager.getApplicationInfo(Feature.d(a).getPackageName(), 0);
_L3:
            Feature feature = a;
            if (message == null)
            {
                break MISSING_BLOCK_LABEL_807;
            }
            message = packagemanager.getApplicationLabel(message);
_L2:
            Feature.c(feature, (String)message);
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("mAppName now: ")).append(Feature.e(a)).toString());
            }
_L1:
            try
            {
                Feature.d(a, (new StringBuilder(String.valueOf(Feature.d(a).getPackageManager().getPackageInfo(Feature.d(a).getPackageName(), 0).versionCode))).toString());
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("mAppVersionCode now: ")).append(Feature.f(a)).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error gathering app version code ")).append(message.toString()).toString());
                }
            }
            try
            {
                Feature.e(a, Feature.d(a).getPackageManager().getPackageInfo(Feature.d(a).getPackageName(), 0).versionName);
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("mAppVersionName now: ")).append(Feature.g(a)).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error gathering app version name ")).append(message.toString()).toString());
                }
            }
            try
            {
                message = (WindowManager)Feature.d(a).getSystemService("window");
                Feature.a(a, message.getDefaultDisplay().getHeight());
                Feature.b(a, message.getDefaultDisplay().getWidth());
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("Height: ")).append(Feature.h(a)).append(" | Width: ").append(Feature.i(a)).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error ")).append(message.toString()).toString());
                }
            }
            Feature.f(a, android.provider.Settings.Secure.getString(Feature.d(a).getContentResolver(), "android_id"));
            Feature.g(a, Feature.e());
            Feature.a(Feature.d(a).getSharedPreferences("initPrefs", 0));
            if (Feature.h().getString("initBool", "").equals(""))
            {
                Feature.h().edit().putString("initBool", "false").commit();
            }
            if (Feature.h().getString("kochavaappdata", null) != null)
            {
                message = Feature.i().a(Feature.h().getString("kochavaappdata", null));
                String s = Feature.j(a);
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("[KOCHAVA] Stored Data: ")).append(message).toString());
                    Log.e("KochavaTracker", (new StringBuilder("[KOCHAVA] Created Data: ")).append(s).toString());
                }
                if (message == null)
                {
                    Feature.i().b(Feature.h().getString("kochavaappdata", null), s);
                } else
                if (!message.equals(s))
                {
                    Feature.i().a(Feature.h().getString("kochavaappdata", null), s);
                } else
                {
                    if (Global.a)
                    {
                        Log.e("KochavaTracker", "Set start of life to false");
                    }
                    Feature.a(a, false);
                }
            } else
            {
                Feature.a(a, false);
            }
            if (Feature.k(a) || !Feature.h().getString("initBool", "").equals("") && Feature.h().getString("initBool", "").equals("false"))
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Initial event has not yet been qued in the database, making initial call");
                }
                Feature.a(a, "initial", null);
            }
            Feature.a(a, new Timer());
            Feature.l(a).schedule(new Feature._cls3._cls1(), 0L, Feature.j());
            Feature.b(a, new Timer());
            if (!flag)
            {
                Feature.m(a).schedule(new Feature._cls3._cls2(this), 0x927c0L);
                return;
            } else
            {
                Feature.m(a).schedule(new Feature._cls3._cls3(), 2000L);
                Feature.c(a, new Timer());
                Feature.n(a).schedule(new Feature._cls3._cls4(), 4000L);
                return;
            }
            message;
            try
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error gathering app name ")).append(message.toString()).toString());
                }
                break MISSING_BLOCK_LABEL_1082;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error gathering app name ")).append(message.toString()).toString());
                }
            }
              goto _L1
            message = "(unknown)";
              goto _L2
            message = null;
              goto _L3
        }

            
            {
                a = feature;
                super();
            }

        // Unreferenced inner class com/kochava/android/tracker/Feature$3$1

/* anonymous class */
        class Feature._cls3._cls1 extends TimerTask
        {

            final Feature._cls3 a;

            public void run()
            {
                Feature.a();
            }

                    
                    {
                        a = Feature._cls3.this;
                        super();
                    }
        }


        // Unreferenced inner class com/kochava/android/tracker/Feature$3$3

/* anonymous class */
        class Feature._cls3._cls3 extends TimerTask
        {

            final Feature._cls3 a;

            public void run()
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Scheduling timer to que initial event if needed.");
                }
                Feature.b(Feature._cls3.a(a), false);
            }

                    
                    {
                        a = Feature._cls3.this;
                        super();
                    }
        }


        // Unreferenced inner class com/kochava/android/tracker/Feature$3$4

/* anonymous class */
        class Feature._cls3._cls4 extends TimerTask
        {

            final Feature._cls3 a;

            public void run()
            {
                Feature.a();
            }

                    
                    {
                        a = Feature._cls3.this;
                        super();
                    }
        }

    }

}
