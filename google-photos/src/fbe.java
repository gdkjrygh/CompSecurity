// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

final class fbe
{

    private final Map a;

    fbe(Map map)
    {
        a = Collections.unmodifiableMap(map);
    }

    public final Object a(String s, String s1)
    {
        return a.get(fbg.a(s, s1));
    }
}
