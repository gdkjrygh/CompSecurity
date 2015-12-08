// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import com.google.android.libraries.translate.core.Entry;

// Referenced classes of package com.google.android.libraries.translate.c:
//            a, h

public final class c extends a
{

    private static h a;

    public c()
    {
    }

    public final String a()
    {
        return "history";
    }

    public final void a(Context context, Entry entry)
    {
        b(context).b(entry.getEntryWithoutOnMemoryAttributes());
    }

    public final h c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new h(context, "historydb_sql", 200);
        }
        context = a;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }
}
