// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            zzw

static final class  extends Enum
{

    public static final zzCD zzCA;
    public static final zzCD zzCB;
    public static final zzCD zzCC;
    public static final zzCD zzCD;
    private static final zzCD zzCE[];
    public static final zzCD zzCx;
    public static final zzCD zzCy;
    public static final zzCD zzCz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/zzw$zza, s);
    }

    public static [] values()
    {
        return ([])zzCE.clone();
    }

    static 
    {
        zzCx = new <init>("CONNECTING", 0);
        zzCy = new <init>("CONNECTED_SERVICE", 1);
        zzCz = new <init>("CONNECTED_LOCAL", 2);
        zzCA = new <init>("BLOCKED", 3);
        zzCB = new <init>("PENDING_CONNECTION", 4);
        zzCC = new <init>("PENDING_DISCONNECT", 5);
        zzCD = new <init>("DISCONNECTED", 6);
        zzCE = (new zzCE[] {
            zzCx, zzCy, zzCz, zzCA, zzCB, zzCC, zzCD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
