// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzvk

public static final class  extends Enum
{

    public static final zzaCh zzaCf;
    public static final zzaCh zzaCg;
    public static final zzaCh zzaCh;
    private static final zzaCh zzaCi[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzvk$zza$zza, s);
    }

    public static [] values()
    {
        return ([])zzaCi.clone();
    }

    static 
    {
        zzaCf = new <init>("NETWORK", 0);
        zzaCg = new <init>("DISK", 1);
        zzaCh = new <init>("DEFAULT", 2);
        zzaCi = (new zzaCi[] {
            zzaCf, zzaCg, zzaCh
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
