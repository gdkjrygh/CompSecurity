// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.d;
import com.appboy.d.b.c;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//            bz, fa, cc, cu, 
//            cy, ca, by, ea, 
//            eg

public final class bv
    implements bz
{

    private static final String a;
    private final Context b;
    private final ca c;
    private final cc d;
    private final c e;
    private final ea f;
    private final eg g;
    private final by h;

    public bv(Context context, ca ca1, cc cc1, ea ea1, eg eg, by by1)
    {
        b = (Context)fa.a(context);
        c = ca1;
        d = cc1;
        f = ea1;
        g = eg;
        context = b.getPackageName();
        ca1 = a(context);
        e = new c("1.10.2", ((PackageInfo) (ca1)).versionCode, ((PackageInfo) (ca1)).versionName, context, eg);
        h = by1;
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
        String.format("Unable to inspect package [%s]", new Object[] {
            s
        });
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final cu a()
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
        obj = null;
_L5:
        String s2 = Build.MODEL;
        String s3 = ((Locale) (obj1)).getLanguage();
        obj1 = ((Locale) (obj1)).getCountry();
        String s4 = TimeZone.getDefault().getID();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return new cu(Integer.valueOf(i), s1, ((String) (obj)), s2, s3, ((String) (obj1)), s4, new cy(displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.xdpi, displaymetrics.ydpi, displaymetrics.densityDpi), c.a(), s, h.a());
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final cu b()
    {
        f.b = a();
        return (cu)f.b();
    }

    public final c c()
    {
        return e;
    }

    public final String d()
    {
        return c.b();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/bv.getName()
        });
    }
}
