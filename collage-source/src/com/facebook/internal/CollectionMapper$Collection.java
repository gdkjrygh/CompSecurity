// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            CollectionMapper

public static interface ener
{

    public abstract Object get(Object obj);

    public abstract Iterator keyIterator();

    public abstract void set(Object obj, Object obj1, ener ener);
}
