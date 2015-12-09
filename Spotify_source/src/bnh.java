// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class bnh
{

    final String a;
    final String b;
    final boolean c;
    long d;
    final Map e;

    public bnh(String s, String s1, boolean flag, long l, Map map)
    {
        btl.a(s);
        btl.a(s1);
        a = s;
        b = s1;
        c = flag;
        d = l;
        if (map != null)
        {
            e = new HashMap(map);
            return;
        } else
        {
            e = Collections.emptyMap();
            return;
        }
    }
}
