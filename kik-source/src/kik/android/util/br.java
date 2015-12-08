// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

public final class br extends LinkedHashMap
{

    private int a;
    private boolean b;

    public br()
    {
        super((int)((double)Math.max(15, 10) * 1.3999999999999999D), 0.75F, true);
        b = true;
        a = 15;
    }

    protected final boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        if (size() <= a || !b)
        {
            return false;
        }
        entry = (SoftReference)entry.getValue();
        if (entry != null)
        {
            entry = (Bitmap)entry.get();
        } else
        {
            entry = null;
        }
        if (entry != null && !entry.isRecycled())
        {
            entry.recycle();
        }
        return true;
    }
}
