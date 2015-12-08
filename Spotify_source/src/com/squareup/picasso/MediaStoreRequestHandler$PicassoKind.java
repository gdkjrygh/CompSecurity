// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


final class height extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    final int androidKind;
    final int height;
    final int width;

    public static height valueOf(String s)
    {
        return (height)Enum.valueOf(com/squareup/picasso/MediaStoreRequestHandler$PicassoKind, s);
    }

    public static height[] values()
    {
        return (height[])d.clone();
    }

    static 
    {
        a = new <init>("MICRO", 0, 3, 96, 96);
        b = new <init>("MINI", 1, 1, 512, 384);
        c = new <init>("FULL", 2, 2, -1, -1);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, int j, int k, int l)
    {
        super(s, i);
        androidKind = j;
        width = k;
        height = l;
    }
}
