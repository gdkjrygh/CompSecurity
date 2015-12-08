// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.signin.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, n, o

private class c extends c
{

    final zzg a;
    private final Map c;

    public void a()
    {
        int i = com.google.android.gms.common.api.zzg.b(a).a(zzg.a(a));
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            com.google.android.gms.common.api.zzg.d(a).a(new n.b(a, connectionresult) {

                final ConnectionResult a;
                final zzg.zze b;

                public void a()
                {
                    zzg.a(b.a, a);
                }

            
            {
                b = zzg.zze.this;
                a = connectionresult;
                super(o);
            }
            });
        } else
        {
            if (zzg.e(a))
            {
                zzg.f(a).b();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                sult sult = (c)iterator.next();
                sult.c((c)c.get(sult));
            }
        }
    }

    public t>(zzg zzg1, Map map)
    {
        a = zzg1;
        super(zzg1, null);
        c = map;
    }
}
