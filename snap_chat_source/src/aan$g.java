// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

public static final class a
    implements aam
{

    public String a;

    public final String a()
    {
        return "carrier";
    }

    public final volatile Object b()
    {
        return a;
    }

    public ()
    {
        a = null;
        String s;
        try
        {
            s = ((TelephonyManager)aan.b().getSystemService("phone")).getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            exception = Build.BRAND;
        }
        a = s;
        (new StringBuilder("carrier == ")).append(a);
    }
}
