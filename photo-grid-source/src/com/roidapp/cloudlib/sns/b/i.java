// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    private static final i g[];
    private String f;

    private i(String s, int j, String s1)
    {
        super(s, j);
        f = s1;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/roidapp/cloudlib/sns/b/i, s);
    }

    public static i[] values()
    {
        return (i[])g.clone();
    }

    public final String a()
    {
        return f;
    }

    static 
    {
        a = new i("LIKE", 0, "like");
        b = new i("FOLLOW", 1, "attion");
        c = new i("COMMENT", 2, "comment");
        d = new i("MENTION", 3, "mention");
        e = new i("CMENTION", 4, "cmention");
        g = (new i[] {
            a, b, c, d, e
        });
    }
}
