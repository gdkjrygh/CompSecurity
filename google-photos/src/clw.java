// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class clw extends LruCache
{

    clw(int i)
    {
        super(36000);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        return ((cmi)obj1).b.length;
    }
}
