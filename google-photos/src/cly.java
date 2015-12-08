// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class cly extends LruCache
{

    cly(clx clx, int i)
    {
        super(0x1800000);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        obj = (cwb)obj1;
        return 0x1e8480 + ((cwb) (obj)).c.length * 159 + ((cwb) (obj)).d.length * 755;
    }
}
