// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    private static final e d[];
    private final String c;

    private e(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/roidapp/cloudlib/sns/b/e, s);
    }

    public static e[] values()
    {
        return (e[])d.clone();
    }

    final String a()
    {
        return c;
    }

    static 
    {
        a = new e("GRADIENT", 0, "gradient");
        b = new e("BACKGROUND", 1, "background");
        d = (new e[] {
            a, b
        });
    }
}
