// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzax

static final class  extends Enum
{

    public static final zzaza zzayY;
    public static final zzaza zzayZ;
    public static final zzaza zzaza;
    private static final zzaza zzazb[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzax$zza, s);
    }

    public static [] values()
    {
        return ([])zzazb.clone();
    }

    static 
    {
        zzayY = new <init>("NONE", 0);
        zzayZ = new <init>("URL", 1);
        zzaza = new <init>("BACKSLASH", 2);
        zzazb = (new zzazb[] {
            zzayY, zzayZ, zzaza
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
