// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            au, ax

public final class av
{

    private final Collection a = new ArrayList();
    private final Collection b = new ArrayList();
    private final Collection c = new ArrayList();

    public av()
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
            Object obj = (au)iterator.next();
            obj = (String)p.n().a(((au) (obj)));
            if (obj != null)
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    public final void a(au au1)
    {
        a.add(au1);
    }

    public final void b(au au1)
    {
        b.add(au1);
    }

    public final void c(au au1)
    {
        c.add(au1);
    }
}
