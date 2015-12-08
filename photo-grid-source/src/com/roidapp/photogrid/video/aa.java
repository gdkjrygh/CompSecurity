// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;


final class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    public static final aa c;
    public static final aa d;
    public static final aa e;
    public static final aa f;
    private static final aa g[];

    private aa(String s, int i)
    {
        super(s, i);
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/roidapp/photogrid/video/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])g.clone();
    }

    static 
    {
        a = new aa("None", 0);
        b = new aa("Preparing", 1);
        c = new aa("Prepared", 2);
        d = new aa("Updating", 3);
        e = new aa("Done", 4);
        f = new aa("Error", 5);
        g = (new aa[] {
            a, b, c, d, e, f
        });
    }
}
