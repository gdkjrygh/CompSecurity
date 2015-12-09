// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.e.a;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.htc.lib2.Hms;
import java.util.List;

public class d
{
    public static interface a
    {

        public abstract void f();

        public abstract void g();
    }


    public static final String a = "com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION";
    public static final String b = "com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_KEY";
    private static final String c = "HtcPedometerCompatibilityUtils";
    private static final String d = "com.android.vending";
    private static final String e = "com.htcmarket";

    public d()
    {
    }

    public static Intent a(PackageManager packagemanager, String s)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getUpdateIntent", new Object[0]);
        if (packagemanager == null || TextUtils.isEmpty(s))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "manager == null || TextUtils.isEmpty(packageName)", new Object[0]);
            return null;
        }
        if (b(packagemanager))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isGooglePlayStore(manager)", new Object[0]);
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 1", new Object[0]);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
            boolean flag = a(packagemanager, intent);
            boolean flag1;
            if (!flag)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 2", new Object[0]);
                s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://play.google.com/store/apps/details?id=").append(s).toString()));
                flag = a(packagemanager, ((Intent) (s)));
                packagemanager = s;
            } else
            {
                packagemanager = intent;
            }
        } else
        if (a(packagemanager))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isChinaPlayStore(manager)", new Object[0]);
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 1", new Object[0]);
            intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://search?q=pname:").append(s).toString()));
            flag1 = a(packagemanager, intent);
            flag = flag1;
            if (!flag1)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 2", new Object[0]);
                intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://market.android.com/search?q=pname:").append(s).toString()));
                flag = a(packagemanager, intent);
            }
            flag1 = flag;
            if (!flag)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 3", new Object[0]);
                intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
                flag1 = a(packagemanager, intent);
            }
            if (!flag1)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 4", new Object[0]);
                s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://market.android.com/details?id=").append(s).toString()));
                flag = a(packagemanager, ((Intent) (s)));
                packagemanager = s;
            } else
            {
                packagemanager = intent;
                flag = flag1;
            }
        } else
        {
            flag = false;
            packagemanager = null;
        }
        if (flag)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "hasMatched", new Object[0]);
            return packagemanager;
        } else
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getUpdateIntent return null", new Object[0]);
            return null;
        }
    }

    public static Intent a(com.htc.lib2.Hms.CompatibilityStatus compatibilitystatus)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getIntentByStatusString", new Object[0]);
        Intent intent = null;
        PackageManager packagemanager = FitBitApplication.a().getPackageManager();
        if (compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_INSTALLED || compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.HSP_UPDATE_REQUIRED)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status is one of ERROR_HSP_NOT_INSTALLED, HSP_UPDATE_REQUIRED", new Object[0]);
            intent = b(packagemanager, Hms.getHspPackageName());
        } else
        {
            if (compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.HMS_APP_UPDATE_REQUIRED)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status == Hms.CompatibilityStatus.HMS_APP_UPDATE_REQUIRED", new Object[0]);
                return a(packagemanager, FitBitApplication.a().getApplicationContext().getPackageName());
            }
            if (compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_ENABLED)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status == Hms.CompatibilityStatus.ERROR_HSP_NOT_ENABLED", new Object[0]);
                return c(packagemanager, Hms.getHspPackageName());
            }
        }
        return intent;
    }

    public static SimpleConfirmDialogFragment a(String s, Activity activity, a a1, boolean flag)
    {
        com.htc.lib2.Hms.CompatibilityStatus compatibilitystatus;
        Intent intent;
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "createDialogForStatus", new Object[0]);
        compatibilitystatus = com.htc.lib2.Hms.CompatibilityStatus.valueOf(s);
        s = null;
        intent = a(compatibilitystatus);
        if (intent == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "null != intent", new Object[0]);
        k = 0x7f080269;
        j = 0x7f08026a;
        i = 0x7f08026b;
        if (flag)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isBlocking", new Object[0]);
            i = 0x7f080268;
        }
        if (compatibilitystatus != com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_INSTALLED) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status == Hms.CompatibilityStatus.ERROR_HSP_NOT_INSTALLED", new Object[0]);
        k = 0x7f080271;
        j = 0x7f080272;
        if (flag)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isBlocking", new Object[0]);
            i = 0x7f080270;
        } else
        {
            i = 0x7f080273;
        }
_L6:
        s = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(a1, activity, intent) {

            final a a;
            final Activity b;
            final Intent c;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "onPositive", new Object[0]);
                a.f();
                b.startActivity(c);
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "onNegative", new Object[0]);
                a.g();
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                a = a1;
                b = activity;
                c = intent;
                super();
            }
        }, k, 0, j, i);
_L2:
        return s;
_L4:
        if (compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.HSP_UPDATE_REQUIRED)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status == Hms.CompatibilityStatus.HSP_UPDATE_REQUIRED", new Object[0]);
            k = 0x7f080275;
            j = 0x7f080276;
            if (flag)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isBlocking", new Object[0]);
                i = 0x7f080274;
            } else
            {
                i = 0x7f080277;
            }
        } else
        if (compatibilitystatus == com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_ENABLED)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status == Hms.CompatibilityStatus.ERROR_HSP_NOT_ENABLED", new Object[0]);
            k = 0x7f08026d;
            j = 0x7f08026e;
            if (flag)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isBlocking", new Object[0]);
                i = 0x7f08026c;
            } else
            {
                i = 0x7f08026f;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean a(PackageManager packagemanager)
    {
        boolean flag1 = d(packagemanager, "com.htcmarket");
        boolean flag = flag1;
        if (BuildType.e == b.a)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "BuildType.DEBUG == Config.BUILD_TYPE", new Object[0]);
            packagemanager = ChinaStoreUtilsSavedState.i();
            flag = flag1;
            if (packagemanager != null)
            {
                flag = packagemanager.booleanValue();
            }
        }
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isChinaPlayStore() == %s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
    }

    private static boolean a(PackageManager packagemanager, Intent intent)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "hasMatchedActivityIntent", new Object[0]);
        if (packagemanager == null || intent == null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "(manager == null) || (intent == null)", new Object[0]);
        } else
        {
            packagemanager = packagemanager.queryIntentActivities(intent, 0x10000);
            if (packagemanager != null && !packagemanager.isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String s)
    {
        boolean flag = false;
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isFixableCompatibilityError()", new Object[0]);
        s = com.htc.lib2.Hms.CompatibilityStatus.valueOf(s);
        if (s == com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_INSTALLED || s == com.htc.lib2.Hms.CompatibilityStatus.HSP_UPDATE_REQUIRED || s == com.htc.lib2.Hms.CompatibilityStatus.HMS_APP_UPDATE_REQUIRED || s == com.htc.lib2.Hms.CompatibilityStatus.ERROR_HSP_NOT_ENABLED)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "status is one of ERROR_HSP_NOT_INSTALLED, HSP_UPDATE_REQUIRED, HMS_APP_UPDATE_REQUIRED, ERROR_HSP_NOT_ENABLED", new Object[0]);
            flag = true;
        }
        return flag;
    }

    private static Intent b(PackageManager packagemanager, String s)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getHSPUpdateIntent", new Object[0]);
        return a(packagemanager, s);
    }

    public static boolean b(PackageManager packagemanager)
    {
        com.fitbit.e.a.b("HtcPedometerCompatibilityUtils", "isGooglePlayStore()", new Object[0]);
        return d(packagemanager, "com.android.vending");
    }

    private static Intent c(PackageManager packagemanager, String s)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getHSPEnableIntent", new Object[0]);
        if (packagemanager == null || TextUtils.isEmpty(s))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "manager == null || TextUtils.isEmpty(packageName))", new Object[0]);
            return null;
        }
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 1", new Object[0]);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT").setData(Uri.parse((new StringBuilder()).append("package:").append(s).toString()));
        boolean flag = a(packagemanager, intent);
        if (!flag)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "!hasMatched 2", new Object[0]);
            s = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
            s.addCategory("android.intent.category.DEFAULT");
            flag = a(packagemanager, s);
            packagemanager = s;
        } else
        {
            packagemanager = intent;
        }
        if (flag)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "hasMatched", new Object[0]);
            return packagemanager;
        } else
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "getHSPEnableIntent return null", new Object[0]);
            return null;
        }
    }

    private static boolean d(PackageManager packagemanager, String s)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "isAppInstalled()", new Object[0]);
        if (packagemanager == null || TextUtils.isEmpty(s))
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "manager == null || TextUtils.isEmpty(packageName)", new Object[0]);
        } else
        {
            Object obj = null;
            try
            {
                packagemanager = packagemanager.getLaunchIntentForPackage(s);
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", packagemanager.toString(), new Object[0]);
                packagemanager = obj;
            }
            if (packagemanager != null)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityUtils", "mIntent != null", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
