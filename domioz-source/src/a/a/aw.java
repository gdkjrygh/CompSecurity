// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.d.b.b;
import com.appboy.f;
import com.appboy.f.a;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package a.a:
//            ba, du, bd, bv, 
//            ca, bb, cy, df

public final class aw
    implements ba
{

    private static final String a;
    private final Context b;
    private final bb c;
    private final bd d;
    private final b e;
    private final cy f;
    private final df g;

    public aw(Context context, bb bb1, bd bd1, cy cy1, df df)
    {
        b = (Context)a.a.du.a(context);
        c = bb1;
        d = bd1;
        f = cy1;
        g = df;
        context = b.getPackageName();
        bb1 = a(context);
        e = new b("1.8.2", ((PackageInfo) (bb1)).versionCode, ((PackageInfo) (bb1)).versionName, context, df);
    }

    private PackageInfo a(String s)
    {
        Object obj = null;
        PackageInfo packageinfo = b.getPackageManager().getPackageInfo(s, 0);
        s = packageinfo;
_L2:
        ApplicationInfo applicationinfo = b.getApplicationInfo();
        obj = s;
        if (s == null)
        {
            obj = b.getPackageManager().getPackageArchiveInfo(applicationinfo.sourceDir, 0);
        }
        return ((PackageInfo) (obj));
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        com.appboy.f.a.c(a, String.format("Unable to inspect package [%s]", new Object[] {
            s
        }), namenotfoundexception);
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final bv a()
    {
        Object obj;
        String s;
        String s1;
        Object obj1;
        int i;
        obj1 = Locale.getDefault();
        s = null;
        if (d != null)
        {
            s = d.a();
        }
        i = android.os.Build.VERSION.SDK_INT;
        s1 = Build.CPU_ABI;
        obj = (TelephonyManager)b.getSystemService("phone");
        ((TelephonyManager) (obj)).getPhoneType();
        JVM INSTR tableswitch 0 2: default 76
    //                   0 210
    //                   1 215
    //                   2 215;
           goto _L1 _L2 _L3 _L3
_L1:
        com.appboy.f.a.c(a, "Unknown phone type");
        obj = null;
_L5:
        String s2 = Build.MODEL;
        String s3 = ((Locale) (obj1)).getLanguage();
        obj1 = ((Locale) (obj1)).getCountry();
        String s4 = TimeZone.getDefault().getID();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return new bv(Integer.valueOf(i), s1, ((String) (obj)), s2, s3, ((String) (obj1)), s4, new ca(displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.xdpi, displaymetrics.ydpi, displaymetrics.densityDpi), c.a(), s);
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final bv b()
    {
        f.b = a();
        return (bv)f.b();
    }

    public final b c()
    {
        return e;
    }

    public final String d()
    {
        String s = c.b();
        if (s == null)
        {
            com.appboy.f.a.d(a, "Error reading deviceId, received a null value.");
        }
        return s;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/aw.getName()
        });
    }
}
