// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package bo.app:
//            bb

final class bc
    implements Runnable
{

    final Class a;
    final CopyOnWriteArraySet b;
    final Object c;
    final bb d;

    bc(bb bb1, Class class1, CopyOnWriteArraySet copyonwritearrayset, Object obj)
    {
        d = bb1;
        a = class1;
        b = copyonwritearrayset;
        c = obj;
        super();
    }

    public final void run()
    {
        bb bb1 = d;
        for (Iterator iterator = bb.a(a, b).iterator(); iterator.hasNext(); ((IEventSubscriber)iterator.next()).trigger(c)) { }
    }
}
