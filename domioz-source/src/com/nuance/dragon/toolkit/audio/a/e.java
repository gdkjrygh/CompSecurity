// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            g, d, f

public abstract class e extends g
{

    private final LinkedList a;
    private final LinkedList b;
    private final LinkedList c;
    private boolean d;
    private b e;
    private final Handler f;
    private final Handler g;
    private int h;
    private final Object i;
    private final ArrayList j;

    public e()
    {
        this((byte)0);
    }

    private e(byte byte0)
    {
        a = new LinkedList();
        b = new LinkedList();
        c = new LinkedList();
        e = new b("com.nuance.dragon.toolkit.audio.pipes.ConverterPipe");
        e.a();
        f = e.c();
        g = new Handler();
        h = 0;
        i = new Object();
        j = new ArrayList();
    }

    static LinkedList a(e e1)
    {
        return e1.c;
    }

    static LinkedList b(e e1)
    {
        return e1.b;
    }

    private List b(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            h ah[] = a((h)list.next());
            if (ah != null)
            {
                int l = ah.length;
                int k = 0;
                while (k < l) 
                {
                    arraylist.add(ah[k]);
                    k++;
                }
            }
        } while (true);
        return arraylist;
    }

    static com.nuance.dragon.toolkit.audio.b c(e e1)
    {
        return e1.j();
    }

    static void d(e e1)
    {
        ArrayList arraylist;
        synchronized (e1.i)
        {
            arraylist = new ArrayList(e1.a.size());
            arraylist.addAll(e1.a);
            e1.a.clear();
        }
        if (!arraylist.isEmpty())
        {
            if (!e1.d)
            {
                e1.a(((h)arraylist.get(0)).a);
                e1.d = true;
            }
            obj = new ArrayList(arraylist.size());
            ((ArrayList) (obj)).addAll(e1.b(arraylist));
            e1.g.post(new d(e1, ((ArrayList) (obj)), arraylist));
        }
    }

    public final void a(com.nuance.dragon.toolkit.audio.b b1, l l)
    {
        int k = b1.a(l);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        j.ensureCapacity(k);
        b1.a(l, j);
        b1 = ((com.nuance.dragon.toolkit.audio.b) (i));
        b1;
        JVM INSTR monitorenter ;
        l = j.iterator();
        do
        {
            if (!l.hasNext())
            {
                break;
            }
            h h1 = (h)l.next();
            a.add(h1);
            b.add(h1);
            if (h > 0)
            {
                h = h - h1.d;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_110;
        l;
        throw l;
        b1;
        JVM INSTR monitorexit ;
        j.clear();
        if (h <= 0)
        {
            f.post(new f(this));
        }
    }

    protected abstract void a(com.nuance.dragon.toolkit.audio.e e1);

    protected final void a(List list)
    {
        list.addAll(c);
        c.clear();
    }

    protected abstract h[] a(h h1);

    public final int b()
    {
        return c.size();
    }

    public final void b(com.nuance.dragon.toolkit.audio.b b1, l l)
    {
        if (b.isEmpty())
        {
            h();
        }
    }

    public final boolean c()
    {
        return k() || b.size() > 0;
    }

    public final void d()
    {
        g();
    }

    protected final h e()
    {
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return (h)c.remove(0);
        }
    }
}
