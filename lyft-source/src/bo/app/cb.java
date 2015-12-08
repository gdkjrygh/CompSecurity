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
import com.appboy.Constants;
import com.appboy.models.outgoing.Environment;
import com.appboy.support.AppboyLogger;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//            cf, ff, ci, da, 
//            de, cg, ce, eg, 
//            em

public final class cb
    implements cf
{

    private static final String a;
    private final Context b;
    private final cg c;
    private final ci d;
    private final Environment e;
    private final eg f;
    private final em g;
    private final ce h;

    public cb(Context context, cg cg1, ci ci1, eg eg1, em em, ce ce1)
    {
        b = (Context)ff.a(context);
        c = cg1;
        d = ci1;
        f = eg1;
        g = em;
        context = b.getPackageName();
        cg1 = a(context);
        e = new Environment("1.9.0", ((PackageInfo) (cg1)).versionCode, ((PackageInfo) (cg1)).versionName, context, em);
        h = ce1;
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
        AppboyLogger.e(a, String.format("Unable to inspect package [%s]", new Object[] {
            s
        }), namenotfoundexception);
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final da a()
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
    //                   0 219
    //                   1 224
    //                   2 224;
           goto _L1 _L2 _L3 _L3
_L1:
        AppboyLogger.w(a, "Unknown phone type");
        obj = null;
_L5:
        String s2 = Build.MODEL;
        String s3 = ((Locale) (obj1)).getLanguage();
        obj1 = ((Locale) (obj1)).getCountry();
        String s4 = TimeZone.getDefault().getID();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return new da(Integer.valueOf(i), s1, ((String) (obj)), s2, s3, ((String) (obj1)), s4, new de(displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.xdpi, displaymetrics.ydpi, displaymetrics.densityDpi), c.a(), s, h.a());
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final da b()
    {
        f.b = a();
        return (da)f.b();
    }

    public final Environment c()
    {
        return e;
    }

    public final String d()
    {
        String s = c.b();
        if (s == null)
        {
            AppboyLogger.e(a, "Error reading deviceId, received a null value.");
        }
        return s;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cb.getName()
        });
    }
}
