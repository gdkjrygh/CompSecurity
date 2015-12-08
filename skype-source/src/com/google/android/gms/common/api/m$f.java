// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            m, o

private final class c extends c
{

    final m a;
    private final ArrayList c;

    public final void a()
    {
        Set set = m.c(a).f;
        if (set.isEmpty())
        {
            set = m.g(a);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).a(m.f(a), set)) { }
    }

    public (m m1, ArrayList arraylist)
    {
        a = m1;
        super(m1, (byte)0);
        c = arraylist;
    }
}
