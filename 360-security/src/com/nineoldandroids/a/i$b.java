// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;


// Referenced classes of package com.nineoldandroids.a:
//            i

static class c extends i
{

    int d;

    public void a(Object obj)
    {
        if (obj != null && obj.getClass() == java/lang/Integer)
        {
            d = ((Integer)obj).intValue();
            c = true;
        }
    }

    public Object b()
    {
        return Integer.valueOf(d);
    }

    public i e()
    {
        return g();
    }

    public int f()
    {
        return d;
    }

    public d g()
    {
        erpolator erpolator = new <init>(c(), d);
        erpolator.a(d());
        return erpolator;
    }

    (float f1)
    {
        a = f1;
        b = Integer.TYPE;
    }

    b(float f1, int j)
    {
        a = f1;
        d = j;
        b = Integer.TYPE;
        c = true;
    }
}
