// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.io.File;
import java.util.LinkedHashMap;

public final class bs extends LinkedHashMap
{

    private int a;
    private boolean b;

    public bs(int i)
    {
        super((int)((double)Math.max(i, 10) * 1.3999999999999999D), 0.75F, true);
        b = true;
        if (i <= 0)
        {
            b = false;
        }
        a = i;
    }

    protected final boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        if (size() <= a || !b)
        {
            return false;
        }
        entry = (File)entry.getValue();
        if (entry != null && entry.exists())
        {
            entry.delete();
        }
        return true;
    }
}
