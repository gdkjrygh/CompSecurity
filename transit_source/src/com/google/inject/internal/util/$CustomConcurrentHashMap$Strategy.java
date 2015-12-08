// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

public static interface 
{

    public abstract Object copyEntry(Object obj, Object obj1, Object obj2);

    public abstract boolean equalKeys(Object obj, Object obj1);

    public abstract boolean equalValues(Object obj, Object obj1);

    public abstract int getHash(Object obj);

    public abstract Object getKey(Object obj);

    public abstract Object getNext(Object obj);

    public abstract Object getValue(Object obj);

    public abstract int hashKey(Object obj);

    public abstract Object newEntry(Object obj, int i, Object obj1);

    public abstract void setInternals( );

    public abstract void setValue(Object obj, Object obj1);
}
