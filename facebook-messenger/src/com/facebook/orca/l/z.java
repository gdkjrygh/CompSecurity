// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.base.Function;
import java.util.Collection;

final class z
    implements Function
{

    z()
    {
    }

    public Collection a(ThreadsCollection threadscollection)
    {
        return threadscollection.b();
    }

    public Object apply(Object obj)
    {
        return a((ThreadsCollection)obj);
    }
}
