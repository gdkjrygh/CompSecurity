// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.cache;


// Referenced classes of package com.soundcloud.android.utils.cache:
//            SoftValuesCache, StrongValuesCache

public abstract class Cache
{
    public static interface ValueProvider
    {

        public abstract Object get(Object obj)
            throws Exception;
    }


    public Cache()
    {
    }

    public static Cache withSoftValues(int i)
    {
        return new SoftValuesCache(i);
    }

    public static Cache withStrongValues(int i)
    {
        return new StrongValuesCache(i);
    }

    public abstract void clear();

    public abstract Object get(Object obj);

    public abstract Object get(Object obj, ValueProvider valueprovider);

    public abstract int hitCount();

    public abstract int missCount();

    public abstract Cache put(Object obj, Object obj1);

    public abstract int size();
}
