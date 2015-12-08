// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package crittercism.android:
//            bv, bw, dx

public static final class a
    implements bv
{

    public Integer a;

    public final String a()
    {
        return "mobile_country_code";
    }

    public final volatile Object b()
    {
        return a;
    }

    public nyManager()
    {
        a = Integer.valueOf(0);
        bw.b();
        String s;
        try
        {
            s = ((TelephonyManager)bw.b().getSystemService("phone")).getNetworkOperator();
        }
        catch (Exception exception)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a = Integer.valueOf(Integer.parseInt(s.substring(0, 3)));
        (new StringBuilder("mobileCountryCode == ")).append(a);
        dx.b();
        return;
    }
}
