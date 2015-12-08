// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            v

static final class  extends Enum
{

    public static final zC zA;
    public static final zC zB;
    public static final zC zC;
    private static final zC zD[];
    public static final zC zw;
    public static final zC zx;
    public static final zC zy;
    public static final zC zz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/v$a, s);
    }

    public static [] values()
    {
        return ([])zD.clone();
    }

    static 
    {
        zw = new <init>("CONNECTING", 0);
        zx = new <init>("CONNECTED_SERVICE", 1);
        zy = new <init>("CONNECTED_LOCAL", 2);
        zz = new <init>("BLOCKED", 3);
        zA = new <init>("PENDING_CONNECTION", 4);
        zB = new <init>("PENDING_DISCONNECT", 5);
        zC = new <init>("DISCONNECTED", 6);
        zD = (new zD[] {
            zw, zx, zy, zz, zA, zB, zC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
