// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;

import java.util.ArrayList;

// Referenced classes of package com.microsoft.a:
//            l

public final class j
{

    private ArrayList a;
    private l b;

    public j()
    {
        if (a == null)
        {
            a = new ArrayList();
        } else
        {
            a.clear();
        }
        b = new l();
    }

    public final ArrayList a()
    {
        return a;
    }

    public final void a(l l1)
    {
        b = l1;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }
}
