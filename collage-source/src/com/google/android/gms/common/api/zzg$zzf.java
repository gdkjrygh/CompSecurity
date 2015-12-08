// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, n

private class c extends c
{

    final zzg a;
    private final ArrayList c;

    public void a()
    {
        Set set = zzg.d(a).f;
        if (set.isEmpty())
        {
            set = zzg.h(a);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).c(zzg.g(a), set)) { }
    }

    public (zzg zzg1, ArrayList arraylist)
    {
        a = zzg1;
        super(zzg1, null);
        c = arraylist;
    }
}
