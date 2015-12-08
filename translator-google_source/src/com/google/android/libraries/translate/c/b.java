// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.translate.core.Singleton;

// Referenced classes of package com.google.android.libraries.translate.c:
//            a, d, h

public class b extends a
{

    private static h a;

    protected b()
    {
    }

    public static b b()
    {
        if (Singleton.a().getSharedPreferences("sync", 0).contains("account"))
        {
            return new d();
        } else
        {
            return new b();
        }
    }

    public final String a()
    {
        return "favorite";
    }

    public h c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new h(context, "favoritedb_sql", 200);
        }
        context = a;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }
}
