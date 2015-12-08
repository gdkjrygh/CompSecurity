// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;


// Referenced classes of package com.bumptech.glide.load.b.a:
//            m, q, n

final class p
    implements m
{

    private final q a;
    private int b;
    private android.graphics.Bitmap.Config c;

    public p(q q1)
    {
        a = q1;
    }

    static int a(p p1)
    {
        return p1.b;
    }

    public final void a()
    {
        a.a(this);
    }

    public final void a(int i, android.graphics.Bitmap.Config config)
    {
        b = i;
        c = config;
    }

    public final boolean equals(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(obj instanceof p)) goto _L2; else goto _L1
_L1:
        obj = (p)obj;
        flag = flag1;
        if (b != ((p) (obj)).b) goto _L2; else goto _L3
_L3:
        if (c != null) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (((p) (obj)).c != null) goto _L2; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (!c.equals(((p) (obj)).c)) goto _L2; else goto _L6
    }

    public final int hashCode()
    {
        int j = b;
        int i;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }

    public final String toString()
    {
        return n.a(b, c);
    }
}
