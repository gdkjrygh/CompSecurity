// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dl, es, dm

private final class c extends c
{

    final dj a;
    private final Map c;

    public final void a()
    {
        int i = b.a(a.c);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            a.a.a(new dl.b(a, connectionresult) {

                final ConnectionResult a;
                final dj.e b;

                public final void a()
                {
                    b.a.b(a);
                }

            
            {
                b = dj.e.this;
                a = connectionresult;
                super(dm);
            }
            });
        } else
        {
            if (a.e)
            {
                a.d.h();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                com.google.android.gms.common.api.nResult nresult = (com.google.android.gms.common.api.nResult)iterator.next();
                nresult.((com.google.android.gms.common.api.)c.get(nresult));
            }
        }
    }

    public <init>(dj dj1, Map map)
    {
        a = dj1;
        super(dj1, (byte)0);
        c = map;
    }
}
