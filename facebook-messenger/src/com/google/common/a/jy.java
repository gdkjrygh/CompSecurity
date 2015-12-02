// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            fl, jw

class jy extends fl
{

    final jw d;

    jy(jw jw1)
    {
        super(jw.a(jw1), jw.b(jw1));
        d = jw1;
    }

    volatile Object a(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }

    Object a(java.util.Map.Entry entry)
    {
        return entry.getKey();
    }

    boolean a()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        return d.containsKey(obj);
    }
}
