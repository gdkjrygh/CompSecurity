// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    private static final f e[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/roidapp/cloudlib/upload/f, s);
    }

    public static f[] values()
    {
        return (f[])e.clone();
    }

    static 
    {
        a = new f("WAITING", 0);
        b = new f("UPLOADING", 1);
        c = new f("FAILED", 2);
        d = new f("SUCCESSED", 3);
        e = (new f[] {
            a, b, c, d
        });
    }
}
