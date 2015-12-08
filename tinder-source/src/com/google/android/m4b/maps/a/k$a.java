// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;


// Referenced classes of package com.google.android.m4b.maps.a:
//            k

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    private static d c;
    private static d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/a/k$a, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("LOW", 0);
        b = new <init>("NORMAL", 1);
        c = new <init>("HIGH", 2);
        d = new <init>("IMMEDIATE", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
