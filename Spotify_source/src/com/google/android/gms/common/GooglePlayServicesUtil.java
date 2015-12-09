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
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import bb;
import bqh;
import bqi;
import bqj;
import bqk;
import bsa;
import btl;
import btz;
import bua;
import bwb;
import bya;
import cnn;
import cnr;
import cnv;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import u;

// Referenced classes of package com.google.android.gms.common:
//            ConnectionResult, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException

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

    public static Dialog getErrorDialog(int i, Activity activity, int j)
    {
        return getErrorDialog(i, activity, j, null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return zza(i, activity, null, j, oncancellistener);
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
    {
        bqi.a();
        return bqi.a(context, i, j, null);
    }

    public static String getErrorString(int i)
    {
        return ConnectionResult.a(i);
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
        packagemanager = context.getPackageManager();
        int i;
        try
        {
            context.getResources().getString(0x7f080029);
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
        bya.a();
        i = ((PackageInfo) (obj)).versionCode;
        if (cnn.a(context))
        {
            if (bya.a(((PackageInfo) (obj)), bwb.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_169;
        }
        try
        {
            context = bya.a(packagemanager.getPackageInfo("com.android.vending", 8256), bwb.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
            return 9;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (bya.a(((PackageInfo) (obj)), new bua[] {
    context
}) != null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int j = GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000;
        if (((PackageInfo) (obj)).versionCode / 1000 < j)
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

    public static boolean isUserRecoverableError(int i)
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

    public static boolean showErrorDialogFragment(int i, Activity activity, int j)
    {
        return showErrorDialogFragment(i, activity, j, null);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return showErrorDialogFragment(i, activity, null, j, oncancellistener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = zza(i, activity, fragment, j, oncancellistener);
        if (fragment == null)
        {
            return false;
        } else
        {
            zza(activity, oncancellistener, "GooglePlayServicesErrorDialog", fragment);
            return true;
        }
    }

    public static void showErrorNotification(int i, Context context)
    {
        int j = i;
        if (cnn.a(context))
        {
            j = i;
            if (i == 2)
            {
                j = 42;
            }
        }
        if (zzd(context, j) || zzf(context, j))
        {
            zzae(context);
            return;
        } else
        {
            zza(j, context);
            return;
        }
    }

    private static Dialog zza(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int k;
        obj1 = null;
        if (i == 0)
        {
            return null;
        }
        k = i;
        if (cnn.a(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        if (!cnv.a(14)) goto _L2; else goto _L1
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
        k;
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
        obj = resources.getString(0x7f080029);
_L34:
        builder.setMessage(((CharSequence) (obj)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        bqi.a();
        oncancellistener = bqi.a(activity, k, "d");
        if (fragment == null)
        {
            oncancellistener = new bsa(activity, oncancellistener, j);
        } else
        {
            oncancellistener = new bsa(fragment, oncancellistener, j);
        }
        fragment = activity.getResources();
        k;
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
        k;
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
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(k).toString());
        activity = obj1;
_L36:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        if (cnr.a(resources))
        {
            obj = resources.getString(0x7f08001e, new Object[] {
                obj
            });
        } else
        {
            obj = resources.getString(0x7f08001d, new Object[] {
                obj
            });
        }
          goto _L34
_L7:
        obj = resources.getString(0x7f080019, new Object[] {
            obj
        });
          goto _L34
_L13:
        obj = resources.getString(0x7f08002f, new Object[] {
            obj
        });
          goto _L34
_L6:
        obj = resources.getString(0x7f08002d, new Object[] {
            obj
        });
          goto _L34
_L14:
        obj = resources.getString(0x7f080015, new Object[] {
            obj
        });
          goto _L34
_L10:
        obj = resources.getString(0x7f08002a, new Object[] {
            obj
        });
          goto _L34
_L9:
        obj = resources.getString(0x7f080023);
          goto _L34
_L8:
        obj = resources.getString(0x7f080020);
          goto _L34
_L11:
        obj = resources.getString(0x7f080017, new Object[] {
            obj
        });
          goto _L34
_L12:
        obj = resources.getString(0x7f080027);
          goto _L34
_L16:
        fragment = fragment.getString(0x7f08001c);
          goto _L35
_L18:
        fragment = fragment.getString(0x7f080018);
          goto _L35
_L17:
        fragment = fragment.getString(0x7f08002c);
          goto _L35
_L20:
        activity = fragment.getString(0x7f08001f);
          goto _L36
_L22:
        activity = fragment.getString(0x7f08001a);
          goto _L36
_L32:
        activity = fragment.getString(0x7f080030);
          goto _L36
_L21:
        activity = fragment.getString(0x7f08002e);
          goto _L36
_L33:
        activity = fragment.getString(0x7f080016);
          goto _L36
_L27:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = fragment.getString(0x7f08002b);
          goto _L36
_L25:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = fragment.getString(0x7f080024);
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
        activity = fragment.getString(0x7f080021);
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
        activity = fragment.getString(0x7f080028);
          goto _L36
_L2:
        obj = null;
        if (true) goto _L38; else goto _L37
_L37:
    }

    private static void zza(int i, Context context)
    {
        zza(i, context, null);
    }

    private static void zza(int i, Context context, String s)
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
        i;
        JVM INSTR lookupswitch 15: default 156
    //                   1: 454
    //                   2: 490
    //                   3: 466
    //                   4: 183
    //                   5: 590
    //                   6: 183
    //                   7: 536
    //                   8: 558
    //                   9: 514
    //                   10: 574
    //                   11: 612
    //                   16: 628
    //                   17: 644
    //                   18: 478
    //                   42: 502;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(i).toString());
        obj = obj1;
_L27:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(0x7f080026);
        }
        obj = context.getResources();
        i;
        JVM INSTR lookupswitch 10: default 296
    //                   1: 666
    //                   2: 733
    //                   3: 773
    //                   5: 824
    //                   7: 813
    //                   9: 793
    //                   16: 835
    //                   17: 855
    //                   18: 713
    //                   42: 753;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L24:
        break MISSING_BLOCK_LABEL_855;
_L16:
        obj = ((Resources) (obj)).getString(0x7f080029);
_L28:
        bqi.a();
        obj3 = bqi.a(context, i, 0, "n");
        if (cnn.a(context))
        {
            btl.a(cnv.a(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(0x7f02016f).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(0x7f02016e, ((Resources) (obj2)).getString(0x7f080031), ((PendingIntent) (obj3))).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(0x7f080026);
            if (cnv.a(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(((PendingIntent) (obj3))).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (cnv.a(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (cnv.a(16))
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
                obj2 = (new bb(context)).a(0x108008a).c(((CharSequence) (obj2))).a(System.currentTimeMillis());
                ((bb) (obj2)).b(16);
                obj2.d = ((PendingIntent) (obj3));
                obj = ((bb) (obj2)).a(((CharSequence) (obj1))).b(((CharSequence) (obj))).g();
            }
        }
        if (zzbk(i))
        {
            zzaaq.set(false);
            i = 10436;
        } else
        {
            i = 39789;
        }
        context = (NotificationManager)context.getSystemService("notification");
        if (s != null)
        {
            context.notify(s, i, ((Notification) (obj)));
            return;
        } else
        {
            context.notify(i, ((Notification) (obj)));
            return;
        }
_L2:
        obj = resources.getString(0x7f08001f);
          goto _L27
_L4:
        obj = resources.getString(0x7f08001a);
          goto _L27
_L14:
        obj = resources.getString(0x7f080030);
          goto _L27
_L3:
        obj = resources.getString(0x7f08002e);
          goto _L27
_L15:
        obj = resources.getString(0x7f080016);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = resources.getString(0x7f08002b);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = resources.getString(0x7f080024);
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
        obj = resources.getString(0x7f080021);
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
        obj = resources.getString(0x7f080028);
          goto _L27
_L17:
        if (cnr.a(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(0x7f08001e, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(0x7f08001d, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(0x7f08002f, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(0x7f08002d, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(0x7f080014, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(0x7f080019, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(0x7f08002a, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(0x7f080023);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(0x7f080020);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(0x7f080017, new Object[] {
            obj3
        });
          goto _L28
        obj = ((Resources) (obj)).getString(0x7f080027);
          goto _L28
    }

    public static void zza(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener, String s, Dialog dialog)
    {
        if (activity instanceof u)
        {
            activity = ((u)activity).a_();
            bqk.a(dialog, oncancellistener).a(activity, s);
            return;
        }
        if (cnv.a(11))
        {
            activity = activity.getFragmentManager();
            bqh.a(dialog, oncancellistener).show(activity, s);
            return;
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static void zzaa(Context context)
    {
        bqi.a();
        int i = bqi.a(context);
        if (i != 0)
        {
            bqi.a();
            context = bqi.a(context, i, "e");
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
            if (context == null)
            {
                throw new GooglePlayServicesNotAvailableException(i);
            } else
            {
                throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", context);
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
        context = new bqj(context);
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
        return cnv.a(21) && context.hasSystemFeature("com.google.sidewinder");
    }

    public static boolean zzah(Context context)
    {
        if (cnv.a(18))
        {
            context = ((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals(context.getString("restricted_profile")))
            {
                return true;
            }
        }
        return false;
    }

    public static void zzb(int i, Context context)
    {
        zza(i, context);
    }

    public static boolean zzb(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!cnv.a(19))
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
        if (s == null)
        {
            continue;
        }
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

    public static boolean zzb(PackageManager packagemanager)
    {
        boolean flag = true;
        Object obj = zzpy;
        obj;
        JVM INSTR monitorenter ;
        int i = zzaan;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        bya.a();
        if (bya.a(packagemanager, new bua[] {
            btz.a[1]
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
        bya.a();
        return bya.a(packagemanager, s);
    }

    public static Intent zzbj(int i)
    {
        bqi.a();
        return bqi.a(null, i, null);
    }

    private static boolean zzbk(int i)
    {
        switch (i)
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

    public static boolean zzd(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return zzj(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean zze(Context context, int i)
    {
        return zzb(context, i, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean zzf(Context context, int i)
    {
        if (i == 9)
        {
            return zzj(context, "com.android.vending");
        } else
        {
            return false;
        }
    }

    public static boolean zzj(Context context, String s)
    {
label0:
        {
            if (!cnv.a(21))
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
