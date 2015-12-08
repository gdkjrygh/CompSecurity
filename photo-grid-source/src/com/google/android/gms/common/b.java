// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.d;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

public final class b
{

    public static final int a;
    private static final b b = new b();

    b()
    {
    }

    public static int a(Context context)
    {
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        int i = j;
        if (GooglePlayServicesUtil.zzd(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static Dialog a(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1 = new ProgressBar(activity, null, 0x101007a);
        ((ProgressBar) (obj1)).setIndeterminate(true);
        ((ProgressBar) (obj1)).setVisibility(0);
        Object obj = new android.app.AlertDialog.Builder(activity);
        ((android.app.AlertDialog.Builder) (obj)).setView(((android.view.View) (obj1)));
        obj1 = GooglePlayServicesUtil.zzaf(activity);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(activity.getResources().getString(d.z, new Object[] {
            obj1
        }));
        ((android.app.AlertDialog.Builder) (obj)).setTitle(d.A);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton("", null);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        GooglePlayServicesUtil.zza(activity, oncancellistener, "GooglePlayServicesUpdatingDialog", ((Dialog) (obj)));
        return ((Dialog) (obj));
    }

    public static PendingIntent a(Context context, int i, int j, String s)
    {
        s = a(context, i, s);
        if (s == null)
        {
            return null;
        } else
        {
            return PendingIntent.getActivity(context, j, s, 0x10000000);
        }
    }

    public static Intent a(Context context, int i, String s)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return ar.a("com.google.android.gms", b(context, s));

        case 42: // '*'
            return ar.a();

        case 3: // '\003'
            return ar.a("com.google.android.gms");
        }
    }

    public static b a()
    {
        return b;
    }

    public static boolean a(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }

    public static boolean a(Context context, int i)
    {
        return GooglePlayServicesUtil.zzd(context, i);
    }

    public static boolean a(Context context, String s)
    {
        return GooglePlayServicesUtil.zzj(context, s);
    }

    public static Intent b(int i)
    {
        return a(null, i, null);
    }

    private static String b(Context context, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("gcore_");
        stringbuilder.append(a);
        stringbuilder.append("-");
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append(s);
        }
        stringbuilder.append("-");
        if (context != null)
        {
            stringbuilder.append(context.getPackageName());
        }
        stringbuilder.append("-");
        if (context != null)
        {
            try
            {
                stringbuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return stringbuilder.toString();
    }

    public static void b(Context context)
    {
        GooglePlayServicesUtil.zzac(context);
    }

    static 
    {
        a = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
