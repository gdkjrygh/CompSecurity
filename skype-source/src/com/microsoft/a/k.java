// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;

import java.util.ArrayList;

// Referenced classes of package com.microsoft.a:
//            d, l

public final class k
{

    private d a;
    private l b;
    private ArrayList c;

    public k()
    {
        a = new d();
        b = null;
        if (c == null)
        {
            c = new ArrayList();
            return;
        } else
        {
            c.clear();
            return;
        }
    }

    public final d a()
    {
        return a;
    }

    public final void a(d d1)
    {
        a = d1;
    }

    public final ArrayList b()
    {
        return c;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }
}
