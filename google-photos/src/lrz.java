// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class lrz extends LruCache
{

    private luj a;

    lrz(lry lry, int i, luj luj1)
    {
        a = luj1;
        super(i);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        return a.a(obj, obj1);
    }
}
