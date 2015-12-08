// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dl

private final class c extends c
{

    final dj a;
    private final ArrayList c;

    public final void a()
    {
        Set set = a.a.o;
        if (set.isEmpty())
        {
            set = a.j();
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.o)iterator.next()).(a.g, set)) { }
    }

    public (dj dj1, ArrayList arraylist)
    {
        a = dj1;
        super(dj1, (byte)0);
        c = arraylist;
    }
}
