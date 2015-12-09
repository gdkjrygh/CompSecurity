// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class czs extends LruCache
{

    public czs()
    {
        super(255);
    }

    protected final Object create(Object obj)
    {
        return ((Class)obj).getCanonicalName();
    }
}
