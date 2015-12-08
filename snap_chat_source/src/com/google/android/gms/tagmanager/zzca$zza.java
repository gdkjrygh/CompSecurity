// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzca

static final class  extends Enum
{

    public static final zzazD zzazB;
    public static final zzazD zzazC;
    public static final zzazD zzazD;
    private static final zzazD zzazE[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzca$zza, s);
    }

    public static [] values()
    {
        return ([])zzazE.clone();
    }

    static 
    {
        zzazB = new <init>("NONE", 0);
        zzazC = new <init>("CONTAINER", 1);
        zzazD = new <init>("CONTAINER_DEBUG", 2);
        zzazE = (new zzazE[] {
            zzazB, zzazC, zzazD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
