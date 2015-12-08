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
//            m, o, p

private final class c extends c
{

    final m a;
    private final Map c;

    public final void a()
    {
        int i = b.a(m.a(a));
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            m.c(a).a(new o.b(a, connectionresult) {

                final ConnectionResult a;
                final m.e b;

                public final void a()
                {
                    m.a(b.a, a);
                }

            
            {
                b = m.e.this;
                a = connectionresult;
                super(p);
            }
            });
        } else
        {
            if (com.google.android.gms.common.api.m.d(a))
            {
                m.e(a).p();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                onResult onresult = (c)iterator.next();
                onresult.a((a)c.get(onresult));
            }
        }
    }

    public <init>(m m1, Map map)
    {
        a = m1;
        super(m1, (byte)0);
        c = map;
    }
}
