// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jqy extends liz
{

    public final Map a = new HashMap();

    public jqy()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (jqy)liz1;
        b.d(liz1);
        ((jqy) (liz1)).a.putAll(a);
    }

    public final String toString()
    {
        return liz.a(a, 0);
    }
}
