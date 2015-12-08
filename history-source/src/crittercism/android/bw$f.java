// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

// Referenced classes of package crittercism.android:
//            bv, bw, dx

public static final class a
    implements bv
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

    public nyManager()
    {
        a = null;
        bw.b();
        String s;
        try
        {
            s = ((TelephonyManager)bw.b().getSystemService("phone")).getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            exception = Build.BRAND;
        }
        a = s;
        (new StringBuilder("carrier == ")).append(a);
        dx.b();
    }
}
