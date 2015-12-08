// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;

import java.util.HashMap;

// Referenced classes of package com.microsoft.a:
//            e, m

public final class d
{

    private String a;
    private String b;
    private HashMap c;
    private e d;
    private m e;

    public d()
    {
        b = "";
        if (c == null)
        {
            c = new HashMap();
        } else
        {
            c.clear();
        }
        d = e.a;
        e = new m();
    }

    public final m a()
    {
        return e;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }
}
