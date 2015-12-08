// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            bg

public static final class  extends Enum
{

    public static final apO apM;
    public static final apO apN;
    public static final apO apO;
    private static final apO apP[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
    }

    public static [] values()
    {
        return ([])apP.clone();
    }

    static 
    {
        apM = new <init>("NOT_AVAILABLE", 0);
        apN = new <init>("IO_ERROR", 1);
        apO = new <init>("SERVER_ERROR", 2);
        apP = (new apP[] {
            apM, apN, apO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
