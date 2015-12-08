// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import aif;
import aki;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DispatchQueue extends ConcurrentLinkedQueue
{

    private aif b;

    public DispatchQueue(aif aif1)
    {
        b = aif1;
    }

    public boolean offer(Object obj)
    {
        obj = (Runnable)obj;
        return b.e.a(((Runnable) (obj)), true);
    }
}
