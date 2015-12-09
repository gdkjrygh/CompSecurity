// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;


// Referenced classes of package com.bumptech.glide.load.engine.a:
//            h, i

static final class a
    implements h
{

    private final c a;
    private int b;
    private android.graphics.ap.Config c;

    static int a(a a1)
    {
        return a1.b;
    }

    public void a()
    {
        a.a(this);
    }

    public void a(int j, android.graphics.ap.Config config)
    {
        b = j;
        c = config;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(obj instanceof c)) goto _L2; else goto _L1
_L1:
        obj = (c)obj;
        flag = flag1;
        if (b != ((b) (obj)).b) goto _L2; else goto _L3
_L3:
        if (c != null) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (((c) (obj)).c != null) goto _L2; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (!c.equals((() (obj)).c)) goto _L2; else goto _L6
    }

    public int hashCode()
    {
        int k = b;
        int j;
        if (c != null)
        {
            j = c.hashCode();
        } else
        {
            j = 0;
        }
        return j + k * 31;
    }

    public String toString()
    {
        return i.a(b, c);
    }

    public ( )
    {
        a = ;
    }
}
