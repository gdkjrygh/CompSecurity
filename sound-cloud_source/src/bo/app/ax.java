// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package bo.app:
//            aw

final class ax
    implements Runnable
{

    final Class a;
    final CopyOnWriteArraySet b;
    final Object c;
    final aw d;

    ax(aw aw1, Class class1, CopyOnWriteArraySet copyonwritearrayset, Object obj)
    {
        d = aw1;
        a = class1;
        b = copyonwritearrayset;
        c = obj;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = aw.a(a, b).iterator(); iterator.hasNext(); ((b)iterator.next()).trigger(c)) { }
    }
}
