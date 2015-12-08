// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            uh, tu, ud, uj, 
//            xi

final class uc extends uh
{

    final tu a;
    private final Map c;

    public uc(tu tu1, Map map)
    {
        a = tu1;
        super(tu1, (byte)0);
        c = map;
    }

    public final void a()
    {
        int i = b.a(tu.a(a));
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            com.google.android.gms.internal.tu.c(a).a(new ud(this, a, connectionresult));
        } else
        {
            if (tu.d(a))
            {
                tu.e(a).d();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                c c1 = (c)iterator.next();
                c1.zza((o)c.get(c1));
            }
        }
    }
}
