// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;


// Referenced classes of package com.nineoldandroids.a:
//            i

static class c extends i
{

    float d;

    public void a(Object obj)
    {
        if (obj != null && obj.getClass() == java/lang/Float)
        {
            d = ((Float)obj).floatValue();
            c = true;
        }
    }

    public Object b()
    {
        return Float.valueOf(d);
    }

    public i e()
    {
        return g();
    }

    public float f()
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
        b = Float.TYPE;
    }

    b(float f1, float f2)
    {
        a = f1;
        d = f2;
        b = Float.TYPE;
        c = true;
    }
}
