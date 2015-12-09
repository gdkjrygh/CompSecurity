// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.c;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.audio.util.a;
import com.nuance.dragon.toolkit.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m extends c
{

    private final List a = new CopyOnWriteArrayList();
    private final a b = new a();
    private final List c = new ArrayList();

    public m()
    {
    }

    public final int a(l l1)
    {
        int i = a.indexOf(l1);
        if (i != -1)
        {
            return ((com.nuance.dragon.toolkit.audio.util.c)c.get(i)).b();
        } else
        {
            return 0;
        }
    }

    public final com.nuance.dragon.toolkit.audio.e a()
    {
        return n();
    }

    public final void a(b b1, l l1)
    {
        if (b1.a(l1) > 0)
        {
            for (b1 = b1.e(l1).iterator(); b1.hasNext(); b.a(l1))
            {
                l1 = (h)b1.next();
            }

            for (b1 = a.iterator(); b1.hasNext(); ((l)b1.next()).a(this)) { }
        }
    }

    public final void a(l l1, List list)
    {
        int i = a.indexOf(l1);
        if (i != -1)
        {
            com.nuance.dragon.toolkit.audio.util.c c1 = (com.nuance.dragon.toolkit.audio.util.c)c.get(i);
            for (l1 = (h)c1.a(); l1 != null; l1 = (h)c1.a())
            {
                list.add(l1);
            }

        } else
        {
            e.c(this, "getAudioChunkForSink(): Can't find sink");
        }
    }

    public final int b()
    {
        e.d(this, "Method is not supported. Call getChunksAvailableForSink() instead.");
        throw new UnsupportedOperationException("Method is not supported. Call getChunksAvailableForSink() instead.");
    }

    public final h b(l l1)
    {
        int i = a.indexOf(l1);
        if (i != -1)
        {
            l1 = (com.nuance.dragon.toolkit.audio.util.c)c.get(i);
            if (l1.b() > 0)
            {
                l1 = (h)l1.a();
                if (l1 != null)
                {
                    return l1;
                }
                e.d(this, "getAudioChunkForSink(): Expected non-null chunk");
            }
        } else
        {
            e.c(this, "getAudioChunkForSink(): Can't find sink");
        }
        return null;
    }

    public final void b(b b1, l l1)
    {
        for (b1 = a.iterator(); b1.hasNext(); ((l)b1.next()).b(this)) { }
    }

    protected final void c(l l1)
    {
        a.add(l1);
        c.add(b.a());
        if (!k())
        {
            l1.b(this);
        }
    }

    public final boolean c()
    {
        return k();
    }

    public final void d()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((l)iterator.next()).a()) { }
    }

    protected final void d(l l1)
    {
        int i = a.indexOf(l1);
        if (i >= 0)
        {
            a.remove(i);
            ((com.nuance.dragon.toolkit.audio.util.c)c.remove(i)).c();
            return;
        } else
        {
            e.c(this, "Couldn't find audio sink to remove");
            return;
        }
    }
}
