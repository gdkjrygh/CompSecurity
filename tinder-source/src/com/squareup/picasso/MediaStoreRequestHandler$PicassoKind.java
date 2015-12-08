// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            MediaStoreRequestHandler

static final class f extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c g[];
    final int d;
    final int e;
    final int f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/squareup/picasso/MediaStoreRequestHandler$PicassoKind, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    static 
    {
        a = new <init>("MICRO", 0, 3, 96, 96);
        b = new <init>("MINI", 1, 1, 512, 384);
        c = new <init>("FULL", 2, 2, -1, -1);
        g = (new g[] {
            a, b, c
        });
    }

    private (String s, int i, int j, int k, int l)
    {
        super(s, i);
        d = j;
        e = k;
        f = l;
    }
}
