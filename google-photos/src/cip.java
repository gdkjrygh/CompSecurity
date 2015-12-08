// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class cip
{

    final Map a = new HashMap();
    int b;

    public cip()
    {
        b = 0;
    }

    public final cip a(String s, cir cir1)
    {
        if (b == 0)
        {
            b = cir1.c;
        } else
        if (b != cir1.c)
        {
            s = String.valueOf("Inconsistent vertex stream count. Previous = ");
            int i = b;
            int j = cir1.c;
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 30)).append(s).append(i).append(", new = ").append(j).toString());
        }
        if (a.get(s) != null)
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 40)).append("Vertex stream with name '").append(s).append("' already added").toString());
        } else
        {
            a.put(s, cir1);
            return this;
        }
    }
}
