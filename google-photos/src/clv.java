// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

final class clv extends LruCache
{

    clv(int i)
    {
        super(1000);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        return ((cmd)obj1).b;
    }
}
