// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bw.e;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.az:
//            k, b

final class a
    implements com.google.android.m4b.maps.bq.a
{

    private k a;

    public final void a()
    {
        k k1 = a;
        synchronized (k1.b)
        {
            k1.b.clear();
        }
        synchronized (k1.c)
        {
            k1.c.a(0);
        }
        k1.a();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a(aa aa1)
    {
        b b1;
        synchronized (k.a(a))
        {
            b1 = (b)k.a(a).remove(aa1.a());
        }
        Collection collection;
        synchronized (k.b(a))
        {
            collection = (Collection)k.b(a).d(aa1.a());
        }
        if (b1 != null || collection != null)
        {
            if (ab.a("TileBasedBuildingBoundProvider", 3))
            {
                aa1 = String.valueOf(aa1.a());
                Log.d("TileBasedBuildingBoundProvider", (new StringBuilder(String.valueOf(aa1).length() + 33)).append("Removed data for ").append(aa1).append(" from the cache ").toString());
            }
            k.c(a);
        }
        return;
        aa1;
        obj;
        JVM INSTR monitorexit ;
        throw aa1;
        aa1;
        obj;
        JVM INSTR monitorexit ;
        throw aa1;
    }

    (k k1)
    {
        a = k1;
        super();
    }
}
