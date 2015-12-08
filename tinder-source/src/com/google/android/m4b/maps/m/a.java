// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.m;


// Referenced classes of package com.google.android.m4b.maps.m:
//            b

public final class a
{

    private static final double a = Math.log(2D);
    private static double b[] = {
        1.0D, 20922789888000D, 2.6313083693369352E+35D, 1.2413915592536073E+61D, 1.2688693218588417E+89D, 7.1569457046263806E+118D, 9.9167793487094965E+149D, 1.974506857221074E+182D, 3.8562048236258041E+215D, 5.5502938327393044E+249D, 
        4.7147236359920616E+284D
    };

    public static boolean a(double d)
    {
        return com.google.android.m4b.maps.m.b.c(d) && (d == 0.0D || 52 - Long.numberOfTrailingZeros(com.google.android.m4b.maps.m.b.b(d)) <= com.google.android.m4b.maps.m.b.a(d));
    }

}
