// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            s

private static final class  extends Enum
{

    public static final uB uA;
    public static final uB uB;
    private static final uB uC[];
    public static final uB uv;
    public static final uB uw;
    public static final uB ux;
    public static final uB uy;
    public static final uB uz;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
    }

    public static [] values()
    {
        return ([])uC.clone();
    }

    static 
    {
        uv = new <init>("CONNECTING", 0);
        uw = new <init>("CONNECTED_SERVICE", 1);
        ux = new <init>("CONNECTED_LOCAL", 2);
        uy = new <init>("BLOCKED", 3);
        uz = new <init>("PENDING_CONNECTION", 4);
        uA = new <init>("PENDING_DISCONNECT", 5);
        uB = new <init>("DISCONNECTED", 6);
        uC = (new uC[] {
            uv, uw, ux, uy, uz, uA, uB
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }
}
