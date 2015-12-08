// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class lfv
{

    public final List a;
    public final Map b;
    public final String c;

    public lfv(List list, Map map, String s, int i)
    {
        a = Collections.unmodifiableList(list);
        b = Collections.unmodifiableMap(map);
        c = s;
    }

    public final String toString()
    {
        return (new StringBuilder("Rules: ")).append(a).append("  Macros: ").append(b).toString();
    }
}
