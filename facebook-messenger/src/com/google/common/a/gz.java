// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            w, hm

final class gz extends w
{

    final hm a;

    gz(hm hm1)
    {
        a = hm1;
        super();
    }

    public Object getKey()
    {
        return a.a;
    }

    public Object getValue()
    {
        return a.b;
    }

    public Object setValue(Object obj)
    {
        Object obj1 = a.b;
        a.b = obj;
        return obj1;
    }
}
