// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            bg

public static final class  extends Enum
{

    public static final YA YA;
    private static final YA YB[];
    public static final YA Yy;
    public static final YA Yz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
    }

    public static [] values()
    {
        return ([])YB.clone();
    }

    static 
    {
        Yy = new <init>("NOT_AVAILABLE", 0);
        Yz = new <init>("IO_ERROR", 1);
        YA = new <init>("SERVER_ERROR", 2);
        YB = (new YB[] {
            Yy, Yz, YA
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
