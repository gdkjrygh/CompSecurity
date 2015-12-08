// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import java.util.LinkedHashMap;

// Referenced classes of package com.kik.cache:
//            h

public abstract class ai extends LinkedHashMap
{

    private final long a;
    private boolean b;

    public ai(long l)
    {
        super((int)((double)Math.max(40L, 10L) * 1.3999999999999999D), 0.75F, true);
        b = true;
        if (l <= 0L)
        {
            b = false;
        }
        a = l;
    }

    protected abstract void a(Object obj);

    public void clear()
    {
        super.clear();
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        if ((long)size() <= a || !b)
        {
            return false;
        }
        entry = ((java.util.Map.Entry) (((h)entry.getValue()).a()));
        if (entry != null)
        {
            a(entry);
        }
        return true;
    }
}
