// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class jrn
{

    final long a;
    final String b;
    final String c;
    final boolean d;
    long e;
    final Map f;

    public jrn(long l, String s, String s1, boolean flag, long l1, 
            Map map)
    {
        b.o(s);
        b.o(s1);
        a = l;
        b = s;
        c = s1;
        d = flag;
        e = l1;
        if (map != null)
        {
            f = new HashMap(map);
            return;
        } else
        {
            f = Collections.emptyMap();
            return;
        }
    }
}
