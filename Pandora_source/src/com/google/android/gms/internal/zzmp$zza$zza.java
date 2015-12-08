// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzmp

public static final class  extends Enum
{

    public static final zzaHi zzaHg;
    public static final zzaHi zzaHh;
    public static final zzaHi zzaHi;
    private static final zzaHi zzaHj[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzmp$zza$zza, s);
    }

    public static [] values()
    {
        return ([])zzaHj.clone();
    }

    static 
    {
        zzaHg = new <init>("NETWORK", 0);
        zzaHh = new <init>("DISK", 1);
        zzaHi = new <init>("DEFAULT", 2);
        zzaHj = (new zzaHj[] {
            zzaHg, zzaHh, zzaHi
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
