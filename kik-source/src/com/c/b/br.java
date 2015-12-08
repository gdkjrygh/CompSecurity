// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            bq

final class br extends bq
{

    br(int i)
    {
        super(i, (byte)0);
    }

    public final void a()
    {
        if (!b())
        {
            for (int i = 0; i < c(); i++)
            {
                java.util.Map.Entry entry = b(i);
                if (((ar.a)entry.getKey()).o())
                {
                    entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
                }
            }

            Iterator iterator = d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                if (((ar.a)entry1.getKey()).o())
                {
                    entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
                }
            } while (true);
        }
        super.a();
    }

    public final Object put(Object obj, Object obj1)
    {
        return super.a((ar.a)obj, obj1);
    }
}
