// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            az

private static final class  extends Enum
{

    public static final apG apE;
    public static final apG apF;
    public static final apG apG;
    private static final apG apH[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
    }

    public static [] values()
    {
        return ([])apH.clone();
    }

    static 
    {
        apE = new <init>("NONE", 0);
        apF = new <init>("URL", 1);
        apG = new <init>("BACKSLASH", 2);
        apH = (new apH[] {
            apE, apF, apG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
