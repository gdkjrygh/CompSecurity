// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.base.Function;
import java.util.Collection;

// Referenced classes of package com.facebook.orca.l:
//            a

class m
    implements Function
{

    final a a;

    m(a a1)
    {
        a = a1;
        super();
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
