// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.aviary.android.feather.sdk.utils:
//            c

class a extends LinkedHashMap
{

    final c a;

    protected boolean removeEldestEntry(java.util.Entry entry)
    {
        if (size() > 4)
        {
            c.c().put(entry.getKey(), new SoftReference(entry.getValue()));
            return true;
        } else
        {
            return false;
        }
    }

    (c c1, int i, float f, boolean flag)
    {
        a = c1;
        super(i, f, flag);
    }
}
