// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class fbf
{

    private final Map a = new HashMap();

    public fbf()
    {
    }

    public final fbe a()
    {
        return new fbe(a);
    }

    public final fbf a(String s, String s1, Object obj)
    {
        a.put(fbg.a(s, s1), obj);
        return this;
    }
}
