// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbe

public static final class  extends Enum
{

    public static final zzazi zzazg;
    public static final zzazi zzazh;
    public static final zzazi zzazi;
    private static final zzazi zzazj[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzbe$zza, s);
    }

    public static [] values()
    {
        return ([])zzazj.clone();
    }

    static 
    {
        zzazg = new <init>("NOT_AVAILABLE", 0);
        zzazh = new <init>("IO_ERROR", 1);
        zzazi = new <init>("SERVER_ERROR", 2);
        zzazj = (new zzazj[] {
            zzazg, zzazh, zzazi
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
