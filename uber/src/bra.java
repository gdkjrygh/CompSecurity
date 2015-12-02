// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import java.util.Locale;

public class bra
{

    private static final String a = bra.getSimpleName();
    private static String b = null;

    public bra()
    {
    }

    public static String a(bus bus1)
    {
        if (b == null)
        {
            String s = Locale.getDefault().toString().replace("_", "-");
            StringBuilder stringbuilder = new StringBuilder("Mozilla/5.0 (Linux; U; ");
            new bwq();
            b = stringbuilder.append((new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString()).append("; ").append(s).append("; ").append(Build.MODEL).append(" ").append(Build.DISPLAY).append(") mpl/").append(bus1.a()).toString();
            (new StringBuilder("UserAgent: ")).append(b);
        }
        return b;
    }

}
