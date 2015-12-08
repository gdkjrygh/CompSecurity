// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android.a;


// Referenced classes of package com.microsoft.advertising.android.a:
//            b

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/advertising/android/a/b$a, s);
    }

    public static [] values()
    {
         a1[] = d;
        int i = a1.length;
         a2[] = new d[i];
        System.arraycopy(a1, 0, a2, 0, i);
        return a2;
    }

    static 
    {
        a = new <init>("DEFAULT", 0);
        b = new <init>("EXPANDED", 1);
        c = new <init>("CLICK", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
