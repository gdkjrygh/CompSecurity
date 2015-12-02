// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.w;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.config.background:
//            k, f

public class g
    implements e
{

    private final w a;
    private final Set b;

    public g(w w1, Set set)
    {
        a = w1;
        b = set;
    }

    private OperationResult b(ad ad1)
    {
        ad1 = hq.a();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.facebook.http.protocol.v v = ((k)iterator.next()).c();
            if (v != null)
            {
                ad1.add(v);
            }
        } while (true);
        a.a("handleFetchConfiguration", ad1);
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (operationtype.equals(f.a))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled operation type: ").append(operationtype).toString());
        }
    }
}
