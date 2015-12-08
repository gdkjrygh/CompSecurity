// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    private static final f h[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/yume/android/sdk/f, s);
    }

    public static f[] values()
    {
        f af[] = h;
        int i = af.length;
        f af1[] = new f[i];
        System.arraycopy(af, 0, af1, 0, i);
        return af1;
    }

    static 
    {
        a = new f("NONE", 0);
        b = new f("AD_SLOT", 1);
        c = new f("REFRESH_TIME", 2);
        d = new f("STAGGER_TIME", 3);
        e = new f("DURATION", 4);
        f = new f("AD_EXPIRATION_TIME", 5);
        g = new f("AD_ID", 6);
        h = (new f[] {
            a, b, c, d, e, f, g
        });
    }
}
