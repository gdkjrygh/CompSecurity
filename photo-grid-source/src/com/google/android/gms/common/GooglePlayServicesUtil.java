// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
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
import android.os.UserManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.c;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.d;
import com.google.android.gms.internal.we;
import com.google.android.gms.internal.wi;
import com.google.android.gms.internal.wn;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            b, ConnectionResult, ky, fi, 
//            k, f, a, c, 
//            d, e, j

public final class GooglePlayServicesUtil
{

    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = zzns();
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static boolean zzaal = false;
    public static boolean zzaam = false;
    private static int zzaan = -1;
    private static String zzaao = null;
    private static Integer zzaap = null;
    static final AtomicBoolean zzaaq = new AtomicBoolean();
    private static final AtomicBoolean zzaar = new AtomicBoolean();
    private static final Object zzpy = new Object();

    private GooglePlayServicesUtil()
    {
    }

    public static Dialog getErrorDialog(int l, Activity activity, int i1)
    {
        return getErrorDialog(l, activity, i1, null);
    }

    public static Dialog getErrorDialog(int l, Activity activity, int i1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return zza(l, activity, null, i1, oncancellistener);
    }

    public static PendingIntent getErrorPendingIntent(int l, Context context, int i1)
    {
        b.a();
        return b.a(context, l, i1, null);
    }

    public static String getErrorString(int l)
    {
        return ConnectionResult.a(l);
    }

    public static String getOpenSourceSoftwareLicenseInfo(Context context)
    {
        Object obj = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
        InputStream inputstream = context.getContentResolver().openInputStream(((android.net.Uri) (obj)));
        try
        {
            context = (new Scanner(inputstream)).useDelimiter("\\A").next();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (inputstream == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            try
            {
                inputstream.close();
                break MISSING_BLOCK_LABEL_97;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                obj = null;
            }
            break MISSING_BLOCK_LABEL_95;
        }
        finally
        {
            if (inputstream == null) goto _L0; else goto _L0
        }
        obj = context;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        inputstream.close();
        return context;
        inputstream.close();
        throw context;
        return ((String) (obj));
        return null;
    }

    public static Context getRemoteContext(Context context)
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

    public static Resources getRemoteResource(Context context)
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

    public static int isGooglePlayServicesAvailable(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        if (i.a)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        int l;
        try
        {
            context.getResources().getString(d.t);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()))
        {
            zzad(context);
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
        ky.a();
        l = ((PackageInfo) (obj)).versionCode;
        if (we.a(context))
        {
            if (ky.a(((PackageInfo) (obj)), fi.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_178;
        }
        try
        {
            context = ky.a(packagemanager.getPackageInfo("com.android.vending", 8256), fi.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
            return 9;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (ky.a(((PackageInfo) (obj)), new k[] {
    context
}) != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i1 = we.a(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (we.a(((PackageInfo) (obj)).versionCode) < i1)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires ")).append(GOOGLE_PLAY_SERVICES_VERSION_CODE).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
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
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", context);
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static boolean isUserRecoverableError(int l)
    {
        switch (l)
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

    public static boolean showErrorDialogFragment(int l, Activity activity, int i1)
    {
        return showErrorDialogFragment(l, activity, i1, null);
    }

    public static boolean showErrorDialogFragment(int l, Activity activity, int i1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return showErrorDialogFragment(l, activity, null, i1, oncancellistener);
    }

    public static boolean showErrorDialogFragment(int l, Activity activity, Fragment fragment, int i1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = zza(l, activity, fragment, i1, oncancellistener);
        if (fragment == null)
        {
            return false;
        } else
        {
            zza(activity, oncancellistener, "GooglePlayServicesErrorDialog", fragment);
            return true;
        }
    }

    public static void showErrorNotification(int l, Context context)
    {
        int i1 = l;
        if (we.a(context))
        {
            i1 = l;
            if (l == 2)
            {
                i1 = 42;
            }
        }
        if (zzd(context, i1) || zzf(context, i1))
        {
            zzae(context);
            return;
        } else
        {
            zza(i1, context);
            return;
        }
    }

    private static Dialog zza(int l, Activity activity, Fragment fragment, int i1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int j1;
        obj1 = null;
        if (l == 0)
        {
            return null;
        }
        j1 = l;
        if (we.a(activity))
        {
            j1 = l;
            if (l == 2)
            {
                j1 = 42;
            }
        }
        if (!wn.c()) goto _L2; else goto _L1
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
        obj = zzaf(activity);
        resources = activity.getResources();
        j1;
        JVM INSTR lookupswitch 10: default 216
    //                   1: 533
    //                   2: 629
    //                   3: 585
    //                   5: 708
    //                   7: 695
    //                   9: 673
    //                   16: 721
    //                   17: 743
    //                   18: 607
    //                   42: 651;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L4:
        obj = resources.getString(d.t);
_L34:
        builder.setMessage(((CharSequence) (obj)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        b.a();
        oncancellistener = b.a(activity, j1, "d");
        if (fragment == null)
        {
            oncancellistener = new y(activity, oncancellistener, i1);
        } else
        {
            oncancellistener = new y(fragment, oncancellistener, i1);
        }
        fragment = activity.getResources();
        j1;
        JVM INSTR lookupswitch 4: default 328
    //                   1: 772
    //                   2: 794
    //                   3: 783
    //                   42: 794;
           goto _L15 _L16 _L17 _L18 _L17
_L15:
        fragment = fragment.getString(0x104000a);
_L35:
        if (fragment != null)
        {
            builder.setPositiveButton(fragment, oncancellistener);
        }
        fragment = activity.getResources();
        activity = obj1;
        j1;
        JVM INSTR lookupswitch 15: default 488
    //                   1: 805
    //                   2: 838
    //                   3: 816
    //                   4: 516
    //                   5: 934
    //                   6: 516
    //                   7: 881
    //                   8: 902
    //                   9: 860
    //                   10: 918
    //                   11: 955
    //                   16: 971
    //                   17: 987
    //                   18: 827
    //                   42: 849;
           goto _L19 _L20 _L21 _L22 _L23 _L24 _L23 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L31:
        break MISSING_BLOCK_LABEL_987;
_L23:
        break; /* Loop/switch isn't completed */
_L19:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(j1).toString());
        activity = obj1;
_L36:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        if (wi.a(resources))
        {
            obj = resources.getString(d.k, new Object[] {
                obj
            });
        } else
        {
            obj = resources.getString(d.j, new Object[] {
                obj
            });
        }
          goto _L34
_L7:
        obj = resources.getString(d.g, new Object[] {
            obj
        });
          goto _L34
_L13:
        obj = resources.getString(d.z, new Object[] {
            obj
        });
          goto _L34
_L6:
        obj = resources.getString(d.x, new Object[] {
            obj
        });
          goto _L34
_L14:
        obj = resources.getString(d.c, new Object[] {
            obj
        });
          goto _L34
_L10:
        obj = resources.getString(d.u, new Object[] {
            obj
        });
          goto _L34
_L9:
        obj = resources.getString(d.o);
          goto _L34
_L8:
        obj = resources.getString(d.m);
          goto _L34
_L11:
        obj = resources.getString(d.e, new Object[] {
            obj
        });
          goto _L34
_L12:
        obj = resources.getString(d.r);
          goto _L34
_L16:
        fragment = fragment.getString(d.i);
          goto _L35
_L18:
        fragment = fragment.getString(d.f);
          goto _L35
_L17:
        fragment = fragment.getString(d.w);
          goto _L35
_L20:
        activity = fragment.getString(d.l);
          goto _L36
_L22:
        activity = fragment.getString(d.h);
          goto _L36
_L32:
        activity = fragment.getString(d.A);
          goto _L36
_L21:
        activity = fragment.getString(d.y);
          goto _L36
_L33:
        activity = fragment.getString(d.d);
          goto _L36
_L27:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = fragment.getString(d.v);
          goto _L36
_L25:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = fragment.getString(d.p);
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
        activity = fragment.getString(d.n);
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
        activity = fragment.getString(d.s);
          goto _L36
_L2:
        obj = null;
        if (true) goto _L38; else goto _L37
_L37:
    }

    private static void zza(int l, Context context)
    {
        zza(l, context, null);
    }

    private static void zza(int l, Context context, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Resources resources;
        obj1 = null;
        obj2 = context.getResources();
        obj3 = zzaf(context);
        resources = context.getResources();
        obj = obj1;
        l;
        JVM INSTR lookupswitch 15: default 156
    //                   1: 453
    //                   2: 489
    //                   3: 465
    //                   4: 183
    //                   5: 589
    //                   6: 183
    //                   7: 535
    //                   8: 557
    //                   9: 513
    //                   10: 573
    //                   11: 611
    //                   16: 627
    //                   17: 643
    //                   18: 477
    //                   42: 501;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(l).toString());
        obj = obj1;
_L27:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(d.q);
        }
        obj = context.getResources();
        l;
        JVM INSTR lookupswitch 10: default 296
    //                   1: 665
    //                   2: 732
    //                   3: 772
    //                   5: 823
    //                   7: 812
    //                   9: 792
    //                   16: 834
    //                   17: 854
    //                   18: 712
    //                   42: 752;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L24:
        break MISSING_BLOCK_LABEL_854;
_L16:
        obj = ((Resources) (obj)).getString(d.t);
_L28:
        b.a();
        obj3 = b.a(context, l, 0, "n");
        if (we.a(context))
        {
            bl.a(wn.d());
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(c.b).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(c.a, ((Resources) (obj2)).getString(d.B), ((PendingIntent) (obj3))).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(d.q);
            if (wn.a())
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(((PendingIntent) (obj3))).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (wn.h())
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (wn.d())
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
                obj = (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x108008a).setTicker(((CharSequence) (obj2))).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(((PendingIntent) (obj3))).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).build();
            }
        }
        if (zzbk(l))
        {
            zzaaq.set(false);
            l = 10436;
        } else
        {
            l = 39789;
        }
        context = (NotificationManager)context.getSystemService("notification");
        if (s != null)
        {
            context.notify(s, l, ((Notification) (obj)));
            return;
        } else
        {
            context.notify(l, ((Notification) (obj)));
            return;
        }
_L2:
        obj = resources.getString(d.l);
          goto _L27
_L4:
        obj = resources.getString(d.h);
          goto _L27
_L14:
        obj = resources.getString(d.A);
          goto _L27
_L3:
        obj = resources.getString(d.y);
          goto _L27
_L15:
        obj = resources.getString(d.d);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = resources.getString(d.v);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = resources.getString(d.p);
          goto _L27
_L8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        obj = obj1;
          goto _L27
_L10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        obj = obj1;
          goto _L27
_L6:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        obj = resources.getString(d.n);
          goto _L27
_L11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        obj = obj1;
          goto _L27
_L12:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        obj = obj1;
          goto _L27
_L13:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        obj = resources.getString(d.s);
          goto _L27
_L17:
        if (wi.a(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(d.k, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(d.j, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(d.z, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(d.x, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(d.b, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(d.g, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(d.u, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(d.o);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(d.m);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(d.e, new Object[] {
            obj3
        });
          goto _L28
        obj = ((Resources) (obj)).getString(d.r);
          goto _L28
    }

    public static void zza(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener, String s, Dialog dialog)
    {
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            f.a(dialog, oncancellistener).show(activity, s);
            return;
        }
        if (wn.a())
        {
            activity = activity.getFragmentManager();
            a.a(dialog, oncancellistener).show(activity, s);
            return;
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static void zzaa(Context context)
    {
        b.a();
        int l = b.a(context);
        if (l != 0)
        {
            b.a();
            context = b.a(context, l, "e");
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(l).toString());
            if (context == null)
            {
                throw new com.google.android.gms.common.c(l);
            } else
            {
                throw new com.google.android.gms.common.d(l, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static void zzac(Context context)
    {
        if (zzaaq.getAndSet(true))
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

    private static void zzad(Context context)
    {
        if (!zzaar.get()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = zzpy;
        obj;
        JVM INSTR monitorenter ;
        if (zzaao != null) goto _L4; else goto _L3
_L3:
        zzaao = context.getPackageName();
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (context == null) goto _L6; else goto _L5
_L5:
        zzaap = Integer.valueOf(context.getInt("com.google.android.gms.version"));
_L7:
        context = zzaap;
        obj;
        JVM INSTR monitorexit ;
        if (context == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        continue; /* Loop/switch isn't completed */
_L6:
        zzaap = null;
          goto _L7
        context;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
          goto _L7
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        if (zzaao.equals(context.getPackageName())) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(zzaao).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (context.intValue() == GOOGLE_PLAY_SERVICES_VERSION_CODE) goto _L1; else goto _L9
_L9:
        throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ")).append(GOOGLE_PLAY_SERVICES_VERSION_CODE).append(" but found ").append(context).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />").toString());
    }

    private static void zzae(Context context)
    {
        context = new e(context);
        context.sendMessageDelayed(context.obtainMessage(1), 0x1d4c0L);
    }

    public static String zzaf(Context context)
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

    public static boolean zzag(Context context)
    {
        context = context.getPackageManager();
        return wn.j() && context.hasSystemFeature("com.google.sidewinder");
    }

    public static boolean zzah(Context context)
    {
        if (wn.f())
        {
            context = ((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals(context.getString("restricted_profile")))
            {
                return true;
            }
        }
        return false;
    }

    static void zzb(int l, Context context)
    {
        zza(l, context);
    }

    public static boolean zzb(Context context, int l, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!wn.g())
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(l, s);
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
        context = context.getPackageManager().getPackagesForUid(l);
        flag = flag1;
        if (s == null)
        {
            continue;
        }
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        l = 0;
        do
        {
            flag = flag1;
            if (l >= context.length)
            {
                continue;
            }
            if (s.equals(context[l]))
            {
                return true;
            }
            l++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
    }

    public static boolean zzb(PackageManager packagemanager)
    {
        boolean flag = true;
        Object obj = zzpy;
        obj;
        JVM INSTR monitorenter ;
        int l = zzaan;
        if (l != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        ky.a();
        if (ky.a(packagemanager, new k[] {
            j.b[1]
        }) == null) goto _L4; else goto _L3
_L3:
        zzaan = 1;
_L2:
        if (zzaan == 0)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        zzaan = 0;
          goto _L2
        packagemanager;
        zzaan = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static boolean zzb(PackageManager packagemanager, String s)
    {
        ky.a();
        return ky.a(packagemanager, s);
    }

    public static Intent zzbj(int l)
    {
        b.a();
        return b.a(null, l, null);
    }

    private static boolean zzbk(int l)
    {
        switch (l)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 18: // '\022'
        case 42: // '*'
            return true;
        }
    }

    public static boolean zzc(PackageManager packagemanager)
    {
        return zzb(packagemanager) || !zznt();
    }

    public static boolean zzd(Context context, int l)
    {
        if (l == 18)
        {
            return true;
        }
        if (l == 1)
        {
            return zzj(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean zze(Context context, int l)
    {
        return zzb(context, l, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean zzf(Context context, int l)
    {
        if (l == 9)
        {
            return zzj(context, "com.android.vending");
        } else
        {
            return false;
        }
    }

    static boolean zzj(Context context, String s)
    {
label0:
        {
            if (!wn.j())
            {
                break label0;
            }
            Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)iterator.next()).getAppPackageName()));
            return true;
        }
        if (zzah(context))
        {
            return false;
        }
        context = context.getPackageManager();
        boolean flag;
        try
        {
            flag = context.getApplicationInfo(s, 8192).enabled;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    private static int zzns()
    {
        return 0x7bd338;
    }

    public static boolean zznt()
    {
        if (zzaal)
        {
            return zzaam;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

}
