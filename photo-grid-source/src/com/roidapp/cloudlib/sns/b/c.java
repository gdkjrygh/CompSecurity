// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/roidapp/cloudlib/sns/b/c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new c("FOLLOW_ING", 0);
        b = new c("FOLLOW_YES", 1);
        c = new c("FOLLOW_NO", 2);
        d = (new c[] {
            a, b, c
        });
    }
}
