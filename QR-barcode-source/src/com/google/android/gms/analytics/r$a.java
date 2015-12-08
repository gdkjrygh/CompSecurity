// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            r

private static final class  extends Enum
{

    public static final yN yH;
    public static final yN yI;
    public static final yN yJ;
    public static final yN yK;
    public static final yN yL;
    public static final yN yM;
    public static final yN yN;
    private static final yN yO[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/r$a, s);
    }

    public static [] values()
    {
        return ([])yO.clone();
    }

    static 
    {
        yH = new <init>("CONNECTING", 0);
        yI = new <init>("CONNECTED_SERVICE", 1);
        yJ = new <init>("CONNECTED_LOCAL", 2);
        yK = new <init>("BLOCKED", 3);
        yL = new <init>("PENDING_CONNECTION", 4);
        yM = new <init>("PENDING_DISCONNECT", 5);
        yN = new <init>("DISCONNECTED", 6);
        yO = (new yO[] {
            yH, yI, yJ, yK, yL, yM, yN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
