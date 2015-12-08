// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fqx
    implements opl, ops, opv
{

    Set a;

    public fqx(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        a = new HashSet();
        if (bundle != null)
        {
            bundle = bundle.getLongArray("expanded_date_headers");
            if (bundle != null && bundle.length > 0)
            {
                int j = bundle.length;
                for (int i = 0; i < j; i++)
                {
                    long l = bundle[i];
                    a.add(Long.valueOf(l));
                }

            }
        }
    }

    public final boolean a(long l)
    {
        return a.contains(Long.valueOf(l));
    }

    public final void e(Bundle bundle)
    {
        long al[] = new long[a.size()];
        Iterator iterator = a.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            al[i] = ((Long)iterator.next()).longValue();
        }

        bundle.putLongArray("expanded_date_headers", al);
    }
}
