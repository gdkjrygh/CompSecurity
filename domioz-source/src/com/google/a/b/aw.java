// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            ay, cr, av, ao, 
//            cm

public final class aw
{

    ay a[];
    int b;

    public aw()
    {
        this((byte)0);
    }

    private aw(byte byte0)
    {
        a = new ay[4];
        b = 0;
    }

    public final av a()
    {
        switch (b)
        {
        default:
            return new cr(b, a);

        case 0: // '\0'
            return av.g();

        case 1: // '\001'
            return av.b(a[0].getKey(), a[0].getValue());
        }
    }

    public final aw a(Object obj, Object obj1)
    {
        int i = b + 1;
        if (i > a.length)
        {
            a = (ay[])cm.b(a, ao.a(a.length, i));
        }
        obj = av.c(obj, obj1);
        obj1 = a;
        i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }
}
