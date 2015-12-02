// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;

// Referenced classes of package com.google.common.a:
//            ji, jb

class jc extends ji
{

    final java.util.Map.Entry a;
    final jb b;

    jc(jb jb, java.util.Map.Entry entry)
    {
        b = jb;
        a = entry;
        super();
    }

    public Object a()
    {
        return a.getKey();
    }

    public int b()
    {
        return ((Collection)a.getValue()).size();
    }
}
