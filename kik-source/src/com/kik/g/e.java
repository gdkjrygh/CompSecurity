// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.kik.g:
//            i

public final class e
{
    final class a
    {

        public final i a;
        final e b;

        public a(i i)
        {
            b = e.this;
            super();
            a = i;
        }
    }


    protected final List a = new CopyOnWriteArrayList();
    protected Object b;

    public e(Object obj)
    {
        b = obj;
    }

    final a a(i i)
    {
        i = new a(i);
        a.add(i);
        return i;
    }

    final void a(a a1)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a2 = (a)iterator.next();
            if (a1 != a2)
            {
                continue;
            }
            a.remove(a2);
            break;
        } while (true);
    }
}
