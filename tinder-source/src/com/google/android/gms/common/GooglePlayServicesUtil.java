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
import android.os.Looper;
import android.os.Message;
import android.os.UserManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ed;
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.el;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            b, ConnectionResult, g, c, 
//            a, GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, f

public final class GooglePlayServicesUtil
{
    private static final class a extends Handler
    {

        private final Context a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 1: default 24
        //                       1 50;
               goto _L1 _L2
_L1:
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Don't know how to handle this message: ")).append(message.what).toString());
_L4:
            return;
_L2:
            int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(a);
            if (GooglePlayServicesUtil.isUserRecoverableError(j))
            {
                GooglePlayServicesUtil.zzb(j, a);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        a(Context context)
        {
            Looper looper;
            if (Looper.myLooper() == null)
            {
                looper = Looper.getMainLooper();
            } else
            {
                looper = Looper.myLooper();
            }
            super(looper);
            a = context.getApplicationContext();
        }
    }


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

    public static Dialog getErrorDialog(int j, Activity activity, int k)
    {
        return getErrorDialog(j, activity, k, null);
    }

    public static Dialog getErrorDialog(int j, Activity activity, int k, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return zza(j, activity, null, k, oncancellistener);
    }

    public static PendingIntent getErrorPendingIntent(int j, Context context, int k)
    {
        b.a();
        return b.a(context, j, k, null);
    }

    public static String getErrorString(int j)
    {
        return ConnectionResult.a(j);
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
        if (f.a)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        int j;
        try
        {
            context.getResources().getString(com.google.android.gms.a.b.common_google_play_services_unknown_issue);
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
        g.a();
        j = ((PackageInfo) (obj)).versionCode;
        if (ed.a(context))
        {
            if (g.a(((PackageInfo) (obj)), f.bb.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_178;
        }
        try
        {
            context = g.a(packagemanager.getPackageInfo("com.android.vending", 8256), f.bb.a);
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
        if (g.a(((PackageInfo) (obj)), new f.a[] {
    context
}) != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int k = ed.a(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (ed.a(((PackageInfo) (obj)).versionCode) < k)
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

    public static boolean isUserRecoverableError(int j)
    {
        switch (j)
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

    public static boolean showErrorDialogFragment(int j, Activity activity, int k)
    {
        return showErrorDialogFragment(j, activity, k, null);
    }

    public static boolean showErrorDialogFragment(int j, Activity activity, int k, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return showErrorDialogFragment(j, activity, null, k, oncancellistener);
    }

    public static boolean showErrorDialogFragment(int j, Activity activity, Fragment fragment, int k, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = zza(j, activity, fragment, k, oncancellistener);
        if (fragment == null)
        {
            return false;
        } else
        {
            zza(activity, oncancellistener, "GooglePlayServicesErrorDialog", fragment);
            return true;
        }
    }

    public static void showErrorNotification(int j, Context context)
    {
        int k = j;
        if (ed.a(context))
        {
            k = j;
            if (j == 2)
            {
                k = 42;
            }
        }
        if (zzd(context, k) || zzf(context, k))
        {
            zzae(context);
            return;
        } else
        {
            zza(k, context);
            return;
        }
    }

    private static Dialog zza(int j, Activity activity, Fragment fragment, int k, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int l;
        obj1 = null;
        if (j == 0)
        {
            return null;
        }
        l = j;
        if (ed.a(activity))
        {
            l = j;
            if (j == 2)
            {
                l = 42;
            }
        }
        if (!el.a(14)) goto _L2; else goto _L1
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
        l;
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
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_unknown_issue);
_L34:
        builder.setMessage(((CharSequence) (obj)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        b.a();
        oncancellistener = b.a(activity, l, "d");
        if (fragment == null)
        {
            oncancellistener = new h(activity, oncancellistener, k);
        } else
        {
            oncancellistener = new h(fragment, oncancellistener, k);
        }
        fragment = activity.getResources();
        l;
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
        l;
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
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(l).toString());
        activity = obj1;
_L36:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        if (eh.a(resources))
        {
            obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_install_text_tablet, new Object[] {
                obj
            });
        } else
        {
            obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_install_text_phone, new Object[] {
                obj
            });
        }
          goto _L34
_L7:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_enable_text, new Object[] {
            obj
        });
          goto _L34
_L13:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_updating_text, new Object[] {
            obj
        });
          goto _L34
_L6:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_update_text, new Object[] {
            obj
        });
          goto _L34
_L14:
        obj = resources.getString(com.google.android.gms.a.b.common_android_wear_update_text, new Object[] {
            obj
        });
          goto _L34
_L10:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_unsupported_text, new Object[] {
            obj
        });
          goto _L34
_L9:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_network_error_text);
          goto _L34
_L8:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_invalid_account_text);
          goto _L34
_L11:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_api_unavailable_text, new Object[] {
            obj
        });
          goto _L34
_L12:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_sign_in_failed_text);
          goto _L34
_L16:
        fragment = fragment.getString(com.google.android.gms.a.b.common_google_play_services_install_button);
          goto _L35
_L18:
        fragment = fragment.getString(com.google.android.gms.a.b.common_google_play_services_enable_button);
          goto _L35
_L17:
        fragment = fragment.getString(com.google.android.gms.a.b.common_google_play_services_update_button);
          goto _L35
_L20:
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_install_title);
          goto _L36
_L22:
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_enable_title);
          goto _L36
_L32:
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_updating_title);
          goto _L36
_L21:
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_update_title);
          goto _L36
_L33:
        activity = fragment.getString(com.google.android.gms.a.b.common_android_wear_update_title);
          goto _L36
_L27:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_unsupported_title);
          goto _L36
_L25:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_network_error_title);
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
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_invalid_account_title);
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
        activity = fragment.getString(com.google.android.gms.a.b.common_google_play_services_sign_in_failed_title);
          goto _L36
_L2:
        obj = null;
        if (true) goto _L38; else goto _L37
_L37:
    }

    private static void zza(int j, Context context)
    {
        zza(j, context, null);
    }

    private static void zza(int j, Context context, String s)
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
        j;
        JVM INSTR lookupswitch 15: default 156
    //                   1: 455
    //                   2: 491
    //                   3: 467
    //                   4: 183
    //                   5: 591
    //                   6: 183
    //                   7: 537
    //                   8: 559
    //                   9: 515
    //                   10: 575
    //                   11: 613
    //                   16: 629
    //                   17: 645
    //                   18: 479
    //                   42: 503;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(j).toString());
        obj = obj1;
_L27:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(com.google.android.gms.a.b.common_google_play_services_notification_ticker);
        }
        obj = context.getResources();
        j;
        JVM INSTR lookupswitch 10: default 296
    //                   1: 667
    //                   2: 734
    //                   3: 774
    //                   5: 825
    //                   7: 814
    //                   9: 794
    //                   16: 836
    //                   17: 856
    //                   18: 714
    //                   42: 754;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L24:
        break MISSING_BLOCK_LABEL_856;
_L16:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_unknown_issue);
_L28:
        b.a();
        obj3 = b.a(context, j, 0, "n");
        if (ed.a(context))
        {
            u.a(el.a(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(com.google.android.gms.a.a.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(com.google.android.gms.a.a.common_full_open_on_phone, ((Resources) (obj2)).getString(com.google.android.gms.a.b.common_open_on_phone), ((PendingIntent) (obj3))).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(com.google.android.gms.a.b.common_google_play_services_notification_ticker);
            if (el.a(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(((PendingIntent) (obj3))).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (el.a(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (el.a(16))
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
                obj = (new android.support.v4.app.aa.d(context)).setSmallIcon(0x108008a).setTicker(((CharSequence) (obj2))).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(((PendingIntent) (obj3))).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).build();
            }
        }
        if (zzbk(j))
        {
            zzaaq.set(false);
            j = 10436;
        } else
        {
            j = 39789;
        }
        context = (NotificationManager)context.getSystemService("notification");
        if (s != null)
        {
            context.notify(s, j, ((Notification) (obj)));
            return;
        } else
        {
            context.notify(j, ((Notification) (obj)));
            return;
        }
_L2:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_install_title);
          goto _L27
_L4:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_enable_title);
          goto _L27
_L14:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_updating_title);
          goto _L27
_L3:
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_update_title);
          goto _L27
_L15:
        obj = resources.getString(com.google.android.gms.a.b.common_android_wear_update_title);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_unsupported_title);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_network_error_title);
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
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_invalid_account_title);
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
        obj = resources.getString(com.google.android.gms.a.b.common_google_play_services_sign_in_failed_title);
          goto _L27
_L17:
        if (eh.a(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_install_text_tablet, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_install_text_phone, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_updating_text, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_update_text, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_android_wear_notification_needs_update_text, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_enable_text, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_unsupported_text, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_network_error_text);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_invalid_account_text);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_api_unavailable_text, new Object[] {
            obj3
        });
          goto _L28
        obj = ((Resources) (obj)).getString(com.google.android.gms.a.b.common_google_play_services_sign_in_failed_text);
          goto _L28
    }

    public static void zza(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener, String s, Dialog dialog)
    {
        if (activity instanceof i)
        {
            activity = ((i)activity).getSupportFragmentManager();
            c.a(dialog, oncancellistener).show(activity, s);
            return;
        }
        if (el.a(11))
        {
            activity = activity.getFragmentManager();
            com.google.android.gms.common.a.a(dialog, oncancellistener).show(activity, s);
            return;
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static void zzaa(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        b.a();
        int j = b.a(context);
        if (j != 0)
        {
            b.a();
            context = b.a(context, j, "e");
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(j).toString());
            if (context == null)
            {
                throw new GooglePlayServicesNotAvailableException(j);
            } else
            {
                throw new GooglePlayServicesRepairableException(j, "Google Play Services not available", context);
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
        context = new a(context);
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
        return el.a(21) && context.hasSystemFeature("com.google.sidewinder");
    }

    public static boolean zzah(Context context)
    {
        if (el.a(18))
        {
            context = ((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals(context.getString("restricted_profile")))
            {
                return true;
            }
        }
        return false;
    }

    static void zzb(int j, Context context)
    {
        zza(j, context);
    }

    public static boolean zzb(Context context, int j, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!el.a(19))
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(j, s);
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
        context = context.getPackageManager().getPackagesForUid(j);
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
        j = 0;
        do
        {
            flag = flag1;
            if (j >= context.length)
            {
                continue;
            }
            if (s.equals(context[j]))
            {
                return true;
            }
            j++;
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
        int j = zzaan;
        if (j != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        g.a();
        if (g.a(packagemanager, new f.a[] {
            f.b[1]
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
        g.a();
        return g.a(packagemanager, s);
    }

    public static Intent zzbj(int j)
    {
        b.a();
        return b.a(null, j, null);
    }

    private static boolean zzbk(int j)
    {
        switch (j)
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

    public static boolean zzd(Context context, int j)
    {
        if (j == 18)
        {
            return true;
        }
        if (j == 1)
        {
            return zzj(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean zze(Context context, int j)
    {
        return zzb(context, j, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean zzf(Context context, int j)
    {
        if (j == 9)
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
            if (!el.a(21))
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
