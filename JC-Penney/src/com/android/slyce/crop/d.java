// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class d
    implements Iterable
{

    private final WeakHashMap a = new WeakHashMap();

    public d()
    {
    }

    public Iterator iterator()
    {
        return a.keySet().iterator();
    }
}
