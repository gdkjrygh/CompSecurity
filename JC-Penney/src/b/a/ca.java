// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package b.a:
//            bj, bk, eu

public final class ca
    implements bj
{

    public Integer a;

    public ca()
    {
        a = Integer.valueOf(0);
        bk.b();
        String s;
        try
        {
            s = ((TelephonyManager)bk.b().getSystemService("phone")).getNetworkOperator();
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
        eu.b();
        return;
    }

    public final String a()
    {
        return "mobile_country_code";
    }

    public final volatile Object b()
    {
        return a;
    }
}
