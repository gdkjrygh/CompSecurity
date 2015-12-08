// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            az

private static final class  extends Enum
{

    public static final arP arN;
    public static final arP arO;
    public static final arP arP;
    private static final arP arQ[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
    }

    public static [] values()
    {
        return ([])arQ.clone();
    }

    static 
    {
        arN = new <init>("NONE", 0);
        arO = new <init>("URL", 1);
        arP = new <init>("BACKSLASH", 2);
        arQ = (new arQ[] {
            arN, arO, arP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
