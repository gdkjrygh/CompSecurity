// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            bf

public static final class  extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/advertising/android/bf$b, s);
    }

    public static [] values()
    {
         a1[] = f;
        int i = a1.length;
         a2[] = new f[i];
        System.arraycopy(a1, 0, a2, 0, i);
        return a2;
    }

    static 
    {
        a = new <init>("DEFAULT", 0);
        b = new <init>("RESIZED", 1);
        c = new <init>("EXPANDED", 2);
        d = new <init>("HIDDEN", 3);
        e = new <init>("SUSPENDED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
