// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.math.BigInteger;
import java.security.SecureRandom;

public class gcz
    implements dmx
{

    private static final gip a = gip.a("installation_id");
    private static final Object c = new Object();
    private Context b;
    private String d;

    public gcz(Context context)
    {
        b = (Context)ctz.a(context);
    }

    public static int a()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static String g()
    {
        return Build.MANUFACTURER;
    }

    public static gda h()
    {
        return new gda(i(), Build.MODEL, Build.BRAND, Build.MANUFACTURER, Build.DISPLAY);
    }

    public static String i()
    {
        Object obj = BluetoothAdapter.getDefaultAdapter();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        return Build.MODEL;
        String s;
        if (!((BluetoothAdapter) (obj)).isEnabled())
        {
            return Build.MODEL;
        }
        s = ((BluetoothAdapter) (obj)).getName();
        obj = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = Build.MODEL;
        return ((String) (obj));
        obj;
        obj = Build.MODEL;
        return ((String) (obj));
    }

    public final int b()
    {
        return b.getResources().getDisplayMetrics().widthPixels;
    }

    public final int c()
    {
        return b.getResources().getDisplayMetrics().heightPixels;
    }

    public final double d()
    {
        DisplayMetrics displaymetrics = b.getResources().getDisplayMetrics();
        float f1 = (float)displaymetrics.widthPixels / displaymetrics.xdpi;
        float f2 = (float)displaymetrics.heightPixels / displaymetrics.ydpi;
        return Math.sqrt(f2 * f2 + f1 * f1);
    }

    public final String e()
    {
        String s1 = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
        String s = s1;
        if (s1 == null)
        {
            s = "0";
        }
        return s;
    }

    public final String f()
    {
label0:
        {
            String s;
            synchronized (c)
            {
                if (d == null)
                {
                    break label0;
                }
                s = d;
            }
            return s;
        }
        String s2;
        d = ((giq)dmz.a(giq)).a(b).a(a, "");
        if (TextUtils.isEmpty(d))
        {
            String s1 = (new BigInteger(130, new SecureRandom())).toString(32);
            Context context = b;
            ((giq)dmz.a(giq)).a(context).b().a(a, s1).b();
            d = s1;
        }
        s2 = d;
        obj;
        JVM INSTR monitorexit ;
        return s2;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
