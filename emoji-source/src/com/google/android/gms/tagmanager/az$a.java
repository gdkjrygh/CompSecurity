// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            az

private static final class  extends Enum
{

    public static final aga afY;
    public static final aga afZ;
    public static final aga aga;
    private static final aga agb[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
    }

    public static [] values()
    {
        return ([])agb.clone();
    }

    static 
    {
        afY = new <init>("NONE", 0);
        afZ = new <init>("URL", 1);
        aga = new <init>("BACKSLASH", 2);
        agb = (new agb[] {
            afY, afZ, aga
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
