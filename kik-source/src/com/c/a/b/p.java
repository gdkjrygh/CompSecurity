// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;


// Referenced classes of package com.c.a.b:
//            l, d

abstract class p extends l
{
    static final class a extends p
    {

        final p a()
        {
            return null;
        }

        a(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }


    p(p p1)
    {
        super(p1.getKey(), p1.getValue());
    }

    p(Object obj, Object obj1)
    {
        super(obj, obj1);
        d.a(obj, obj1);
    }

    abstract p a();
}
