// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class lry
    implements luh
{

    private LruCache a;

    lry(int i, luj luj)
    {
        a = new lrz(this, i, luj);
    }

    public final Object a(Object obj)
    {
        return a.get(obj);
    }

    public final void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }
}
