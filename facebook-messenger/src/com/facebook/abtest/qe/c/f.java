// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.c;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f FROM_SERVER;
    public static final f FROM_USER;
    private final String name;

    private f(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/abtest/qe/c/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        FROM_SERVER = new f("FROM_SERVER", 0, "from_server");
        FROM_USER = new f("FROM_USER", 1, "from_user");
        $VALUES = (new f[] {
            FROM_SERVER, FROM_USER
        });
    }

}
