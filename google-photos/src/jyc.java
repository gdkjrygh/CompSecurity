// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class jyc
{

    public static final int a = 0x7877d8;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = -1;
    private static final Object e = new Object();
    private static String f = null;
    private static Integer g = null;
    private static AtomicBoolean h = new AtomicBoolean();

    public static int a(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        Object obj1;
        if (kbe.a)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        try
        {
            context.getResources().getString(b.De);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ("com.google.android.gms".equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_262;
        }
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (f != null) goto _L2; else goto _L1
_L1:
        f = context.getPackageName();
        obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        g = Integer.valueOf(((Bundle) (obj1)).getInt("com.google.android.gms.version"));
_L5:
        obj1 = g;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_202;
_L4:
        g = null;
          goto _L5
        obj1;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", ((Throwable) (obj1)));
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (f.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(f).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (((Integer) (obj1)).intValue() != a)
        {
            throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ")).append(a).append(" but found ").append(obj1).append(".  You must have the following declaration within the <application> element: ").append("    <meta-data android:name=\"com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        }
        try
        {
            obj = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        if (kdi.b(((PackageInfo) (obj)).versionCode) || kdi.a(context))
        {
            if (jye.a(((PackageInfo) (obj)), kiz.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_426;
        }
        Object obj2;
        try
        {
            obj2 = jye.a(packagemanager.getPackageInfo("com.android.vending", 64), kiz.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            if (a(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (jye.a(((PackageInfo) (obj)), kiz.a) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_426;
        }
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (jye.a(((PackageInfo) (obj)), new kdq[] {
    obj2
}) != null)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = kdi.a(a);
        if (kdi.a(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires ")).append(a).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
            return 2;
        }
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                context.printStackTrace();
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static Dialog a(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return b(i, activity, null, j, oncancellistener);
    }

    public static Intent a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return kcf.b("com.google.android.gms");

        case 42: // '*'
            return kcf.a();

        case 3: // '\003'
            return kcf.a("com.google.android.gms");
        }
    }

    public static void a(int i, Context context)
    {
        Object obj;
        PendingIntent pendingintent;
        Object obj2;
        Object obj3;
        int j;
label0:
        {
            pendingintent = null;
            j = i;
            if (kdi.a(context))
            {
                j = i;
                if (i == 2)
                {
                    j = 42;
                }
            }
            if (!b(context, j))
            {
                boolean flag;
                if (j == 9)
                {
                    flag = a(context, "com.android.vending");
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            context = new jyd(context);
            context.sendMessageDelayed(context.obtainMessage(1), 0x1d4c0L);
            return;
        }
        obj2 = context.getResources();
        obj3 = f(context);
        obj = context.getResources();
        j;
        JVM INSTR lookupswitch 15: default 232
    //                   1: 578
    //                   2: 611
    //                   3: 589
    //                   4: 573
    //                   5: 705
    //                   6: 573
    //                   7: 654
    //                   8: 675
    //                   9: 633
    //                   10: 690
    //                   11: 726
    //                   16: 741
    //                   17: 756
    //                   18: 600
    //                   42: 622;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(j).toString());
        obj = null;
_L27:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(b.Db);
        }
        obj = context.getResources();
        j;
        JVM INSTR lookupswitch 10: default 372
    //                   1: 777
    //                   2: 844
    //                   3: 884
    //                   5: 935
    //                   7: 924
    //                   9: 904
    //                   16: 946
    //                   17: 966
    //                   18: 824
    //                   42: 864;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L16:
        obj = ((Resources) (obj)).getString(b.De);
_L28:
        obj3 = a(j);
        if (obj3 != null)
        {
            pendingintent = PendingIntent.getActivity(context, 0, ((Intent) (obj3)), 0x10000000);
        }
        if (kdi.a(context))
        {
            b.a(c.a(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(b.CL).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(b.CK, ((Resources) (obj2)).getString(b.Dm), pendingintent).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(b.Db);
            if (c.a(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(pendingintent).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (c.a(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (c.a(16))
                {
                    ((android.app.Notification.Builder) (obj1)).setStyle((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (obj))));
                    obj = ((android.app.Notification.Builder) (obj1)).build();
                } else
                {
                    obj = ((android.app.Notification.Builder) (obj1)).getNotification();
                }
                if (android.os.Build.VERSION.SDK_INT == 19)
                {
                    ((Notification) (obj)).extras.putBoolean("android.support.localOnly", true);
                }
            } else
            {
                obj2 = new Notification(0x108008a, ((CharSequence) (obj2)), System.currentTimeMillis());
                obj2.flags = ((Notification) (obj2)).flags | 0x10;
                ((Notification) (obj2)).setLatestEventInfo(context, ((CharSequence) (obj1)), ((CharSequence) (obj)), pendingintent);
                obj = obj2;
            }
        }
        switch (j)
        {
        default:
            i = 0;
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 18: // '\022'
        case 42: // '*'
            break MISSING_BLOCK_LABEL_1166;
        }
_L29:
        if (i != 0)
        {
            h.set(false);
            i = 10436;
        } else
        {
            i = 39789;
        }
        ((NotificationManager)context.getSystemService("notification")).notify(i, ((Notification) (obj)));
        return;
_L5:
        obj = null;
          goto _L27
_L2:
        obj = ((Resources) (obj)).getString(b.CW);
          goto _L27
_L4:
        obj = ((Resources) (obj)).getString(b.CS);
          goto _L27
_L14:
        obj = ((Resources) (obj)).getString(b.Dl);
          goto _L27
_L3:
        obj = ((Resources) (obj)).getString(b.Dj);
          goto _L27
_L15:
        obj = ((Resources) (obj)).getString(b.CO);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = ((Resources) (obj)).getString(b.Dg);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = ((Resources) (obj)).getString(b.Da);
          goto _L27
_L8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L6:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        obj = ((Resources) (obj)).getString(b.CY);
          goto _L27
_L11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        obj = null;
          goto _L27
_L12:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        obj = null;
          goto _L27
_L13:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        obj = ((Resources) (obj)).getString(b.Dd);
          goto _L27
_L17:
        if (b.b(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(b.CV, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(b.CU, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(b.Dk, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(b.Di, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(b.CM, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(b.CR, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(b.Df, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(b.CZ);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(b.CX);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(b.CP, new Object[] {
            obj3
        });
          goto _L28
_L24:
        obj = ((Resources) (obj)).getString(b.Dc);
          goto _L28
        i = 1;
          goto _L29
    }

    public static boolean a(int i, Activity activity, int j)
    {
        return a(i, activity, null, 0, null);
    }

    public static boolean a(int i, Activity activity, am am, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        am = b(i, activity, am, j, oncancellistener);
        if (am == null)
        {
            return false;
        }
        if (activity instanceof ar)
        {
            activity = ((ar)activity).c();
            jyf.a(am, oncancellistener).a(activity, "GooglePlayServicesErrorDialog");
        } else
        if (c.a(11))
        {
            activity = activity.getFragmentManager();
            jxy.a(am, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean a(Context context, int i)
    {
        if (a(context, i, "com.google.android.gms"))
        {
            context = context.getPackageManager();
            if (jye.a().a(context, "com.google.android.gms"))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!c.a(19))
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(i, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
            return flag;
        }
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        i = 0;
        do
        {
            flag = flag1;
            if (i >= context.length)
            {
                continue;
            }
            if (s.equals(context[i]))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_30;
_L1:
    }

    private static boolean a(Context context, String s)
    {
        if (c.a(21))
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_78;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)context.next()).getAppPackageName()));
            return true;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo(s, 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_78;
        context;
        return false;
    }

    public static boolean a(PackageManager packagemanager)
    {
        return b(packagemanager) || !"user".equals(Build.TYPE);
    }

    private static Dialog b(int i, Activity activity, am am, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int k;
        obj1 = null;
        if (i == 0)
        {
            return null;
        }
        k = i;
        if (kdi.a(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        if (!c.a(14)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
        if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId))) goto _L2; else goto _L3
_L3:
        obj = new android.app.AlertDialog.Builder(activity, 5);
_L38:
        android.app.AlertDialog.Builder builder;
        Resources resources;
        builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        obj = f(activity);
        resources = activity.getResources();
        k;
        JVM INSTR lookupswitch 10: default 216
    //                   1: 525
    //                   2: 621
    //                   3: 577
    //                   5: 700
    //                   7: 687
    //                   9: 665
    //                   16: 713
    //                   17: 735
    //                   18: 599
    //                   42: 643;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L4:
        obj = resources.getString(b.De);
_L34:
        builder.setMessage(((CharSequence) (obj)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(k);
        if (am == null)
        {
            oncancellistener = new kbm(activity, oncancellistener, j);
        } else
        {
            oncancellistener = new kbm(am, oncancellistener, j);
        }
        am = activity.getResources();
        k;
        JVM INSTR lookupswitch 4: default 320
    //                   1: 764
    //                   2: 786
    //                   3: 775
    //                   42: 786;
           goto _L15 _L16 _L17 _L18 _L17
_L15:
        am = am.getString(0x104000a);
_L35:
        if (am != null)
        {
            builder.setPositiveButton(am, oncancellistener);
        }
        am = activity.getResources();
        activity = obj1;
        k;
        JVM INSTR lookupswitch 15: default 480
    //                   1: 797
    //                   2: 830
    //                   3: 808
    //                   4: 508
    //                   5: 926
    //                   6: 508
    //                   7: 873
    //                   8: 894
    //                   9: 852
    //                   10: 910
    //                   11: 947
    //                   16: 963
    //                   17: 979
    //                   18: 819
    //                   42: 841;
           goto _L19 _L20 _L21 _L22 _L23 _L24 _L23 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L31:
        break MISSING_BLOCK_LABEL_979;
_L23:
        break; /* Loop/switch isn't completed */
_L19:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(k).toString());
        activity = obj1;
_L36:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        if (b.b(resources))
        {
            obj = resources.getString(b.CV, new Object[] {
                obj
            });
        } else
        {
            obj = resources.getString(b.CU, new Object[] {
                obj
            });
        }
          goto _L34
_L7:
        obj = resources.getString(b.CR, new Object[] {
            obj
        });
          goto _L34
_L13:
        obj = resources.getString(b.Dk, new Object[] {
            obj
        });
          goto _L34
_L6:
        obj = resources.getString(b.Di, new Object[] {
            obj
        });
          goto _L34
_L14:
        obj = resources.getString(b.CN, new Object[] {
            obj
        });
          goto _L34
_L10:
        obj = resources.getString(b.Df, new Object[] {
            obj
        });
          goto _L34
_L9:
        obj = resources.getString(b.CZ);
          goto _L34
_L8:
        obj = resources.getString(b.CX);
          goto _L34
_L11:
        obj = resources.getString(b.CP, new Object[] {
            obj
        });
          goto _L34
_L12:
        obj = resources.getString(b.Dc);
          goto _L34
_L16:
        am = am.getString(b.CT);
          goto _L35
_L18:
        am = am.getString(b.CQ);
          goto _L35
_L17:
        am = am.getString(b.Dh);
          goto _L35
_L20:
        activity = am.getString(b.CW);
          goto _L36
_L22:
        activity = am.getString(b.CS);
          goto _L36
_L32:
        activity = am.getString(b.Dl);
          goto _L36
_L21:
        activity = am.getString(b.Dj);
          goto _L36
_L33:
        activity = am.getString(b.CO);
          goto _L36
_L27:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = am.getString(b.Dg);
          goto _L36
_L25:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = am.getString(b.Da);
          goto _L36
_L26:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        activity = obj1;
          goto _L36
_L28:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        activity = obj1;
          goto _L36
_L24:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        activity = am.getString(b.CY);
          goto _L36
_L29:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        activity = obj1;
          goto _L36
_L30:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        activity = obj1;
          goto _L36
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        activity = am.getString(b.Dd);
          goto _L36
_L2:
        obj = null;
        if (true) goto _L38; else goto _L37
_L37:
    }

    static void b(int i, Context context)
    {
        c(i, context);
    }

    public static void b(Context context)
    {
        int i = a(context);
        if (i != 0)
        {
            context = a(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
            if (context == null)
            {
                throw new jya(i);
            } else
            {
                throw new jyb(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static boolean b(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
            return true;
        }
    }

    public static boolean b(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    private static boolean b(PackageManager packagemanager)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int i = d;
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (jye.a(packagemanager.getPackageInfo("com.google.android.gms", 64), new kdq[] {
            kdp.a[1]
        }) == null) goto _L4; else goto _L3
_L3:
        d = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return d != 0;
_L4:
        d = 0;
          goto _L2
        packagemanager;
        d = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    private static void c(int i, Context context)
    {
        Object obj;
        PendingIntent pendingintent;
        Object obj2;
        Object obj3;
        pendingintent = null;
        obj2 = context.getResources();
        obj3 = f(context);
        obj = context.getResources();
        i;
        JVM INSTR lookupswitch 15: default 152
    //                   1: 490
    //                   2: 523
    //                   3: 501
    //                   4: 485
    //                   5: 617
    //                   6: 485
    //                   7: 566
    //                   8: 587
    //                   9: 545
    //                   10: 602
    //                   11: 638
    //                   16: 653
    //                   17: 668
    //                   18: 512
    //                   42: 534;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(i).toString());
        obj = null;
_L27:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(b.Db);
        }
        obj = context.getResources();
        i;
        JVM INSTR lookupswitch 10: default 288
    //                   1: 689
    //                   2: 756
    //                   3: 796
    //                   5: 847
    //                   7: 836
    //                   9: 816
    //                   16: 858
    //                   17: 878
    //                   18: 736
    //                   42: 776;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L16:
        obj = ((Resources) (obj)).getString(b.De);
_L28:
        obj3 = a(i);
        if (obj3 != null)
        {
            pendingintent = PendingIntent.getActivity(context, 0, ((Intent) (obj3)), 0x10000000);
        }
        if (kdi.a(context))
        {
            b.a(c.a(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(b.CL).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(b.CK, ((Resources) (obj2)).getString(b.Dm), pendingintent).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(b.Db);
            if (c.a(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(pendingintent).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (c.a(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (c.a(16))
                {
                    ((android.app.Notification.Builder) (obj1)).setStyle((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (obj))));
                    obj = ((android.app.Notification.Builder) (obj1)).build();
                } else
                {
                    obj = ((android.app.Notification.Builder) (obj1)).getNotification();
                }
                if (android.os.Build.VERSION.SDK_INT == 19)
                {
                    ((Notification) (obj)).extras.putBoolean("android.support.localOnly", true);
                }
            } else
            {
                obj2 = new Notification(0x108008a, ((CharSequence) (obj2)), System.currentTimeMillis());
                obj2.flags = ((Notification) (obj2)).flags | 0x10;
                ((Notification) (obj2)).setLatestEventInfo(context, ((CharSequence) (obj1)), ((CharSequence) (obj)), pendingintent);
                obj = obj2;
            }
        }
        switch (i)
        {
        default:
            i = 0;
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 18: // '\022'
        case 42: // '*'
            break MISSING_BLOCK_LABEL_1078;
        }
_L29:
        if (i != 0)
        {
            h.set(false);
            i = 10436;
        } else
        {
            i = 39789;
        }
        ((NotificationManager)context.getSystemService("notification")).notify(i, ((Notification) (obj)));
        return;
_L5:
        obj = null;
          goto _L27
_L2:
        obj = ((Resources) (obj)).getString(b.CW);
          goto _L27
_L4:
        obj = ((Resources) (obj)).getString(b.CS);
          goto _L27
_L14:
        obj = ((Resources) (obj)).getString(b.Dl);
          goto _L27
_L3:
        obj = ((Resources) (obj)).getString(b.Dj);
          goto _L27
_L15:
        obj = ((Resources) (obj)).getString(b.CO);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = ((Resources) (obj)).getString(b.Dg);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = ((Resources) (obj)).getString(b.Da);
          goto _L27
_L8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L6:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        obj = ((Resources) (obj)).getString(b.CY);
          goto _L27
_L11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        obj = null;
          goto _L27
_L12:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        obj = null;
          goto _L27
_L13:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        obj = ((Resources) (obj)).getString(b.Dd);
          goto _L27
_L17:
        if (b.b(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(b.CV, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(b.CU, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(b.Dk, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(b.Di, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(b.CM, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(b.CR, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(b.Df, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(b.CZ);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(b.CX);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(b.CP, new Object[] {
            obj3
        });
          goto _L28
_L24:
        obj = ((Resources) (obj)).getString(b.Dc);
          goto _L28
        i = 1;
          goto _L29
    }

    public static void c(Context context)
    {
        if (h.getAndSet(true))
        {
            return;
        }
        try
        {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static Resources d(Context context)
    {
        try
        {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Context e(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private static String f(Context context)
    {
        String s1 = context.getApplicationInfo().name;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = context.getPackageName();
            PackageManager packagemanager = context.getApplicationContext().getPackageManager();
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                s = packagemanager.getApplicationLabel(context).toString();
            }
        }
        return s;
    }

}
