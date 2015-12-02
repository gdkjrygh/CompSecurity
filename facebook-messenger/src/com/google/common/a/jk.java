// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.a:
//            jg, jj

class jk
    implements Function
{

    final jj a;

    jk(jj jj)
    {
        a = jj;
        super();
    }

    public Object a(jg jg1)
    {
        return jg1.a();
    }

    public Object apply(Object obj)
    {
        return a((jg)obj);
    }
}
