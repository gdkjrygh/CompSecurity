// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

public static final class  extends Enum
{

    public static final zzaDW zzaDU;
    public static final zzaDW zzaDV;
    public static final zzaDW zzaDW;
    private static final zzaDW zzaDX[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
    }

    public static [] values()
    {
        return ([])zzaDX.clone();
    }

    static 
    {
        zzaDU = new <init>("NOT_AVAILABLE", 0);
        zzaDV = new <init>("IO_ERROR", 1);
        zzaDW = new <init>("SERVER_ERROR", 2);
        zzaDX = (new zzaDX[] {
            zzaDU, zzaDV, zzaDW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
