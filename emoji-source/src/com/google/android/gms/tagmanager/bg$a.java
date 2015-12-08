// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            bg

public static final class  extends Enum
{

    public static final agi agg;
    public static final agi agh;
    public static final agi agi;
    private static final agi agj[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
    }

    public static [] values()
    {
        return ([])agj.clone();
    }

    static 
    {
        agg = new <init>("NOT_AVAILABLE", 0);
        agh = new <init>("IO_ERROR", 1);
        agi = new <init>("SERVER_ERROR", 2);
        agj = (new agj[] {
            agg, agh, agi
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
