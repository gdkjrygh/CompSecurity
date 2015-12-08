// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;


// Referenced classes of package com.bumptech.glide.load.b.c:
//            f, g

public class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static final e d[];

    private e(String s, int i)
    {
        super(s, i);
    }

    e(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/bumptech/glide/load/b/c/e, s);
    }

    public static e[] values()
    {
        return (e[])d.clone();
    }

    protected void a(Throwable throwable)
    {
    }

    static 
    {
        a = new e("IGNORE", 0);
        b = new f("LOG");
        c = new g("THROW");
        d = (new e[] {
            a, b, c
        });
    }
}
