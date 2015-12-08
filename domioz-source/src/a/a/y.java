// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.c.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package a.a:
//            w

final class y
    implements Runnable
{

    final Class a;
    final CopyOnWriteArraySet b;
    final Object c;
    final w d;

    y(w w1, Class class1, CopyOnWriteArraySet copyonwritearrayset, Object obj)
    {
        d = w1;
        a = class1;
        b = copyonwritearrayset;
        c = obj;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = w.a(a, b).iterator(); iterator.hasNext(); ((b)iterator.next()).a(c)) { }
    }
}
