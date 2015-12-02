// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.env.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.receiver.BootReceiver;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            s

public class r
{

    public static NumberFormat a;
    private static String b[] = {
        "B", "KB", "MB", "GB"
    };

    public static int a(int i)
    {
        if (i > 85)
        {
            return -36797;
        }
        if (i > 80)
        {
            return 0xfff9a825;
        }
        return !com.qihoo.utils.notice.c.b() ? 0xff448aff : 0xff00b8d4;
    }

    public static int a(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }

    public static Bundle a(String s1)
    {
        boolean flag;
        flag = true;
        s1 = new File(s1);
        if (s1 != null && s1.exists() && s1.isFile()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        s1 = new BufferedReader(new FileReader(s1));
        Object obj = s1.readLine();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String as[];
        int i;
        as = ((String) (obj)).split("::;;");
        i = as.length;
        if (i == 7)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (s1 == null) goto _L1; else goto _L3
_L3:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return null;
        obj = new Bundle();
        if (!"true".equals(as[0]))
        {
            flag = false;
        }
        ((Bundle) (obj)).putBoolean("ispatch", flag);
        ((Bundle) (obj)).putString("url", as[1]);
        ((Bundle) (obj)).putString("version", as[2]);
        ((Bundle) (obj)).putString("size", as[3]);
        ((Bundle) (obj)).putString("force", as[4]);
        ((Bundle) (obj)).putString("desc", as[5]);
        Object obj1;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        return ((Bundle) (obj));
        if (s1 == null) goto _L1; else goto _L4
_L4:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return null;
        s1;
        s1 = null;
_L8:
        if (s1 == null) goto _L1; else goto _L5
_L5:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return null;
        obj1;
        s1 = null;
_L7:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
          goto _L8
    }

    public static transient SpannableStringBuilder a(Context context, int i, int j, int k, String as[])
    {
        String s1;
        boolean flag;
        flag = false;
        s1 = d.a().a(i, (Object[])as);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("");
_L6:
        return spannablestringbuilder;
_L2:
        SpannableStringBuilder spannablestringbuilder1 = new SpannableStringBuilder(s1);
        int ai[];
        int l;
        int i1;
        try
        {
            i1 = as.length;
            ai = new int[i1];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new SpannableStringBuilder(s1);
        }
        i = 0;
        l = ((flag) ? 1 : 0);
        if (i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = s1.indexOf(as[i]);
        i++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_60;
_L3:
        spannablestringbuilder = spannablestringbuilder1;
        if (l >= i1) goto _L6; else goto _L5
_L5:
        ai[l] = s1.indexOf(as[l]);
        spannablestringbuilder1.setSpan(new ForegroundColorSpan(context.getResources().getColor(j)), ai[l], ai[l] + as[l].length(), 34);
        spannablestringbuilder1.setSpan(new StyleSpan(k), ai[l], ai[l] + as[l].length(), 34);
        l++;
          goto _L3
    }

    public static transient SpannableStringBuilder a(Context context, int i, int j, String as[])
    {
        return a(context, i, j, 0, as);
    }

    public static SpannableStringBuilder a(Context context, String s1, int i, String s2)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s1);
        int j = s1.lastIndexOf(s2);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(i)), j, s2.length() + j, 34);
        return spannablestringbuilder;
    }

    public static void a()
    {
        if (SharedPref.b(SecurityApplication.a(), "setting_auto_start", true))
        {
            a(true);
        }
    }

    public static void a(Context context)
    {
        if (SharedPref.b(context, "reset_language_config", true))
        {
            SharedPref.a(context, "reset_language_config", false);
            if (SharedPref.b(context, "language_index", 0) == 0)
            {
                SharedPref.a(context, "language", "");
            }
        }
        if (SharedPref.b(context, "locale_data_migration", true))
        {
            SharedPref.a(context, "locale_data_migration", false);
            if ("en_US".equals(SharedPref.b(context, "language", "")))
            {
                SharedPref.a(context, "language", "en");
            }
            if ("ru_RU".equals(SharedPref.b(context, "language", "")))
            {
                SharedPref.a(context, "language", "ru");
            }
            if ("tr_TR".equals(SharedPref.b(context, "language", "")))
            {
                SharedPref.a(context, "language", "");
            }
        }
    }

    public static void a(Context context, String s1)
    {
        s1 = new File(s1);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(s1), "application/vnd.android.package-archive");
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }

    public static void a(Context context, String s1, boolean flag)
    {
        s1 = new Intent(context, b());
        s1.addFlags(0x10000000);
        s1.putExtra("is_from_appbox_shortcut", flag);
        context.startActivity(s1);
    }

    private static void a(boolean flag)
    {
        Object obj = SecurityApplication.a();
        PackageManager packagemanager = ((Context) (obj)).getPackageManager();
        obj = new ComponentName(((Context) (obj)), com/qihoo/security/receiver/BootReceiver);
        int i = packagemanager.getComponentEnabledSetting(((ComponentName) (obj)));
        if (flag)
        {
            if (i == 2)
            {
                packagemanager.setComponentEnabledSetting(((ComponentName) (obj)), 1, 1);
            }
        } else
        if (i != 2)
        {
            packagemanager.setComponentEnabledSetting(((ComponentName) (obj)), 2, 1);
            return;
        }
    }

    public static boolean a(float f)
    {
        return a(com.qihoo360.mobilesafe.b.s.c(), f);
    }

    public static boolean a(long l, float f)
    {
        return (int)(100F * f) >= 85;
    }

    public static boolean a(Bundle bundle, String s1)
    {
        if (bundle != null && s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Object obj1;
        obj = new File(s1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj1 = ((File) (obj)).getParentFile();
        if (obj1 == null) goto _L1; else goto _L3
_L3:
        ((File) (obj1)).mkdirs();
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((File) (obj)).isFile()) goto _L1; else goto _L4
_L4:
        ((File) (obj)).delete();
        s1 = new BufferedWriter(new FileWriter(new File(s1)));
        obj1 = new StringBuilder();
        if (bundle.getBoolean("ispatch"))
        {
            obj = "true";
        } else
        {
            obj = Boolean.valueOf(false);
        }
        ((StringBuilder) (obj1)).append(obj);
        ((StringBuilder) (obj1)).append("::;;");
        ((StringBuilder) (obj1)).append(bundle.getString("url"));
        ((StringBuilder) (obj1)).append("::;;");
        ((StringBuilder) (obj1)).append(bundle.getString("version"));
        ((StringBuilder) (obj1)).append("::;;");
        ((StringBuilder) (obj1)).append(bundle.getString("size"));
        ((StringBuilder) (obj1)).append("::;;");
        ((StringBuilder) (obj1)).append(bundle.getString("force"));
        ((StringBuilder) (obj1)).append("::;;");
        ((StringBuilder) (obj1)).append(bundle.getString("desc"));
        s1.write(((StringBuilder) (obj1)).toString());
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
        }
        return true;
        bundle;
        s1 = null;
_L8:
        if (s1 == null) goto _L1; else goto _L5
_L5:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return false;
        }
        return false;
        bundle;
        s1 = null;
_L7:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw bundle;
        bundle;
        if (true) goto _L7; else goto _L6
_L6:
        bundle;
          goto _L8
    }

    public static boolean a(Signature asignature[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (asignature == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (asignature.length <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = asignature.length;
        i = 0;
_L8:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        String s1 = com.qihoo360.mobilesafe.b.s.c(asignature[i].toByteArray());
        if (!a.b.equals(s1) && !a.c.equals(s1)) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Class b()
    {
        return com/qihoo/security/ui/main/HomeActivity;
    }

    public static void b(Context context)
    {
        Object obj;
        obj = context.getSystemService("statusbar");
        context = Class.forName("android.app.StatusBarManager");
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        context = context.getMethod("collapsePanels", new Class[0]);
_L1:
        context.invoke(obj, new Object[0]);
        return;
        try
        {
            context = context.getMethod("collapse", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
          goto _L1
    }

    public static boolean c(Context context)
    {
        boolean flag = false;
        int i;
        int j;
        try
        {
            PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            i = SharedPref.b(context, "guide_ver", 0);
            j = packageinfo.versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (i != j)
        {
            flag = true;
        }
        return flag;
    }

    static 
    {
        a = NumberFormat.getInstance(Locale.US);
        a.setMaximumFractionDigits(2);
        a.setMinimumFractionDigits(2);
    }
}
