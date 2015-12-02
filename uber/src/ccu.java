// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;

public final class ccu
    implements bus
{

    public ccu()
    {
    }

    public final String a()
    {
        return "2.9.10";
    }

    public final String b()
    {
        String s = android.os.Build.VERSION.RELEASE;
        String s1 = (new StringBuilder()).append(Build.MANUFACTURER).append(" ").append(Build.MODEL).toString();
        StringBuilder stringbuilder = new StringBuilder();
        if (bwq.d(""))
        {
            stringbuilder.append(" ");
        }
        return String.format("PayPalSDK/%s %s (%s %s; %s; %s)", new Object[] {
            "PayPal-Android-SDK", "2.9.10", "Android", s, s1, stringbuilder.toString().trim()
        });
    }

    public final String c()
    {
        return "1d3523bb5c312838069f6196f54ae1d530d80463";
    }
}
