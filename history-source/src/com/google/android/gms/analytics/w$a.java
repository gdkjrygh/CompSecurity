// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            w

private static final class  extends Enum
{

    public static final zD zA;
    public static final zD zB;
    public static final zD zC;
    public static final zD zD;
    private static final zD zE[];
    public static final zD zx;
    public static final zD zy;
    public static final zD zz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/w$a, s);
    }

    public static [] values()
    {
        return ([])zE.clone();
    }

    static 
    {
        zx = new <init>("CONNECTING", 0);
        zy = new <init>("CONNECTED_SERVICE", 1);
        zz = new <init>("CONNECTED_LOCAL", 2);
        zA = new <init>("BLOCKED", 3);
        zB = new <init>("PENDING_CONNECTION", 4);
        zC = new <init>("PENDING_DISCONNECT", 5);
        zD = new <init>("DISCONNECTED", 6);
        zE = (new zE[] {
            zx, zy, zz, zA, zB, zC, zD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
