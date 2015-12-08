// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cx

public final class cv
{

    private final Collection a = new ArrayList();
    private final Collection b = new ArrayList();
    private final Collection c = new ArrayList();

    public cv()
    {
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (cq)iterator.next();
            obj = (String)zzp.zzbE().a(((cq) (obj)));
            if (obj != null)
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    public final void a(cq cq1)
    {
        a.add(cq1);
    }

    public final void b(cq cq1)
    {
        b.add(cq1);
    }

    public final void c(cq cq1)
    {
        c.add(cq1);
    }
}
