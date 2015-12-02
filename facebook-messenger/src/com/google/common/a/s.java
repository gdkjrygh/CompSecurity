// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Map;

// Referenced classes of package com.google.common.a:
//            ji, bi, r, q

class s extends ji
{

    final java.util.Map.Entry a;
    final r b;

    s(r r1, java.util.Map.Entry entry)
    {
        b = r1;
        a = entry;
        super();
    }

    public Object a()
    {
        return a.getKey();
    }

    public int b()
    {
        int i = ((bi)a.getValue()).a();
        if (i == 0)
        {
            bi bi1 = (bi)q.a(b.c).get(a());
            if (bi1 != null)
            {
                return bi1.a();
            }
        }
        return i;
    }
}
