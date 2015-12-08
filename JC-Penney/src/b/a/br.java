// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

// Referenced classes of package b.a:
//            bj, bk, eu

public final class br
    implements bj
{

    public String a;

    public br()
    {
        a = null;
        bk.b();
        String s;
        try
        {
            s = ((TelephonyManager)bk.b().getSystemService("phone")).getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            exception = Build.BRAND;
        }
        a = s;
        (new StringBuilder("carrier == ")).append(a);
        eu.b();
    }

    public final String a()
    {
        return "carrier";
    }

    public final volatile Object b()
    {
        return a;
    }
}
