// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            s

private static final class  extends Enum
{

    public static final uE uA;
    public static final uE uB;
    public static final uE uC;
    public static final uE uD;
    public static final uE uE;
    private static final uE uF[];
    public static final uE uy;
    public static final uE uz;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
    }

    public static [] values()
    {
        return ([])uF.clone();
    }

    static 
    {
        uy = new <init>("CONNECTING", 0);
        uz = new <init>("CONNECTED_SERVICE", 1);
        uA = new <init>("CONNECTED_LOCAL", 2);
        uB = new <init>("BLOCKED", 3);
        uC = new <init>("PENDING_CONNECTION", 4);
        uD = new <init>("PENDING_DISCONNECT", 5);
        uE = new <init>("DISCONNECTED", 6);
        uF = (new uF[] {
            uy, uz, uA, uB, uC, uD, uE
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }
}
