// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            v

final class nit> extends v
{

    public final void a()
    {
        if (!super.a)
        {
            for (int i = 0; i < b(); i++)
            {
                java.util.Entry entry = b(i);
                if (((b)entry.getKey()).d())
                {
                    entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
                }
            }

            Iterator iterator = c().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Entry entry1 = (java.util.Entry)iterator.next();
                if (((c)entry1.getKey()).d())
                {
                    entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
                }
            } while (true);
        }
        super.a();
    }

    public final Object put(Object obj, Object obj1)
    {
        return super.a((ist)obj, obj1);
    }

    (int i)
    {
        super(i, (byte)0);
    }
}
