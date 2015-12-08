// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.g;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/roidapp/cloudlib/sns/g/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    static 
    {
        a = new e("Follow", 0);
        b = new e("Post", 1);
        c = new e("PostDeleted", 2);
        d = new e("Profile", 3);
        e = new e("Logout", 4);
        f = (new e[] {
            a, b, c, d, e
        });
    }
}
