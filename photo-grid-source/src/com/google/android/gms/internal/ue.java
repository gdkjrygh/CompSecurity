// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            uh, tu, uj

final class ue extends uh
{

    final tu a;
    private final ArrayList c;

    public ue(tu tu1, ArrayList arraylist)
    {
        a = tu1;
        super(tu1, (byte)0);
        c = arraylist;
    }

    public final void a()
    {
        Set set = com.google.android.gms.internal.tu.c(a).f;
        if (set.isEmpty())
        {
            set = tu.g(a);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).zza(tu.f(a), set)) { }
    }
}
