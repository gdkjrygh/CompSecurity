// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            az

private static final class  extends Enum
{

    public static final Ys Yq;
    public static final Ys Yr;
    public static final Ys Ys;
    private static final Ys Yt[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/az$a, s);
    }

    public static [] values()
    {
        return ([])Yt.clone();
    }

    static 
    {
        Yq = new <init>("NONE", 0);
        Yr = new <init>("URL", 1);
        Ys = new <init>("BACKSLASH", 2);
        Yt = (new Yt[] {
            Yq, Yr, Ys
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
