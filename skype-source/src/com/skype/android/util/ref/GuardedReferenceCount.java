// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.ref;

import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.skype.android.util.ref:
//            ReferenceCounted

public class GuardedReferenceCount
{

    private CopyOnWriteArraySet a;
    private ReferenceCounted b;

    public GuardedReferenceCount(ReferenceCounted referencecounted)
    {
        a = new CopyOnWriteArraySet();
        b = referencecounted;
    }

    public final void a()
    {
        a.clear();
        b.releaseFully();
    }

    public final void a(Object obj)
    {
        if (a.add(obj))
        {
            b.acquireOnce();
        }
    }

    public final void b(Object obj)
    {
        if (a.remove(obj))
        {
            b.releaseOnce();
            if (a.size() == 0)
            {
                b.releaseFully();
            }
        }
    }
}
