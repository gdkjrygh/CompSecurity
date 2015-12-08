// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;


// Referenced classes of package com.c.a.b:
//            o, ae, ah

public static final class b
{

    getValue a[];
    int b;

    public final ct a(Object obj, Object obj1)
    {
        int i = b + 1;
        if (i > a.length)
        {
            a = (a[])ae.b(a, a(a.length, i));
        }
        obj = o.c(obj, obj1);
        obj1 = a;
        i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }

    public final o a()
    {
        switch (b)
        {
        default:
            return new ah(b, a);

        case 0: // '\0'
            return o.g();

        case 1: // '\001'
            return o.b(a[0].getKey(), a[0].getValue());
        }
    }

    public ct()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
        a = new a[4];
        b = 0;
    }
}
