// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cs, hs

public class cr
    implements Iterable
{

    private final List a = new LinkedList();

    public cr()
    {
    }

    private cq c(hs hs)
    {
        for (Iterator iterator1 = zzp.zzbK().iterator(); iterator1.hasNext();)
        {
            cq cq1 = (cq)iterator1.next();
            if (cq1.a == hs)
            {
                return cq1;
            }
        }

        return null;
    }

    public void a(cq cq1)
    {
        a.add(cq1);
    }

    public boolean a(hs hs)
    {
        hs = c(hs);
        if (hs != null)
        {
            ((cq) (hs)).b.a();
            return true;
        } else
        {
            return false;
        }
    }

    public void b(cq cq1)
    {
        a.remove(cq1);
    }

    public boolean b(hs hs)
    {
        return c(hs) != null;
    }

    public Iterator iterator()
    {
        return a.iterator();
    }
}
