// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            au

public class av
{

    private final Collection a = new ArrayList();
    private final Collection b = new ArrayList();
    private final Collection c = new ArrayList();

    public av()
    {
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((au)iterator.next()).c();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    public void a(au au1)
    {
        a.add(au1);
    }

    public void b(au au1)
    {
        b.add(au1);
    }

    public void c(au au1)
    {
        c.add(au1);
    }
}
