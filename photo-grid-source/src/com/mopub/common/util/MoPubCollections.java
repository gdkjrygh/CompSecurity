// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import java.util.Collection;
import java.util.Collections;

public class MoPubCollections
{

    public MoPubCollections()
    {
    }

    public static transient void addAllNonNull(Collection collection, Object aobj[])
    {
        Collections.addAll(collection, aobj);
        collection.removeAll(Collections.singleton(null));
    }
}
