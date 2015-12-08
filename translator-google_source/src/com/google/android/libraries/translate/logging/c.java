// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.translate.logging:
//            d

public final class c
{

    final SharedPreferences a;
    d b;

    public c(Context context, String s)
    {
        a = context.getSharedPreferences(s, 0);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d d1 = b;
        if (d1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ArrayList arraylist = new ArrayList(a.getAll().keySet());
        if (!arraylist.isEmpty())
        {
            b = new d(this);
            b.a(arraylist.toArray(new String[0]));
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.getInt(s, 0);
        a.edit().putInt(s, i + 1).commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
