// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.a:
//            ja

class jd
    implements Function
{

    final ja a;

    jd(ja ja)
    {
        a = ja;
        super();
    }

    public Object a(java.util.Map.Entry entry)
    {
        return entry.getKey();
    }

    public Object apply(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }
}
