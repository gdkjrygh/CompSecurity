// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            f

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static d e;
    private static final d f[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/bk/f$a, s);
    }

    public static [] values()
    {
        return ([])f.clone();
    }

    static 
    {
        e = new <init>("NO_VERIFICATION", 0);
        a = new <init>("NO_VERIFICATION_WITH_REASON", 1);
        b = new <init>("AREA_VERIFICATION", 2);
        c = new <init>("AREA_VERIFICATION_WITH_REASON", 3);
        d = new <init>("COMPLETE_VERIFICATION", 4);
        f = (new f[] {
            e, a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
