// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, cj, cy

abstract class cg
    implements Iterator
{

    int b;
    int c;
    MapMakerInternalMap.Segment d;
    AtomicReferenceArray e;
    cj f;
    cy g;
    cy h;
    final MapMakerInternalMap i;

    cg(MapMakerInternalMap mapmakerinternalmap)
    {
        i = mapmakerinternalmap;
        super();
        b = mapmakerinternalmap.segments.length - 1;
        c = -1;
        b();
    }

    private boolean a(cj cj1)
    {
        Object obj;
        obj = cj1.getKey();
        cj1 = ((cj) (i.getLiveValue(cj1)));
        if (cj1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        g = new cy(i, obj, cj1);
        d.postReadCleanup();
        return true;
        d.postReadCleanup();
        return false;
        cj1;
        d.postReadCleanup();
        throw cj1;
    }

    private void b()
    {
        g = null;
        break MISSING_BLOCK_LABEL_5;
        if (!c() && !d())
        {
            while (b >= 0) 
            {
                MapMakerInternalMap.Segment asegment[] = i.segments;
                int j = b;
                b = j - 1;
                d = asegment[j];
                if (d.count != 0)
                {
                    e = d.table;
                    c = e.length() - 1;
                    if (d())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    private boolean c()
    {
        if (f != null)
        {
            for (f = f.getNext(); f != null; f = f.getNext())
            {
                if (a(f))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean d()
    {
        while (c >= 0) 
        {
            Object obj = e;
            int j = c;
            c = j - 1;
            obj = (cj)((AtomicReferenceArray) (obj)).get(j);
            f = ((cj) (obj));
            if (obj != null && (a(f) || c()))
            {
                return true;
            }
        }
        return false;
    }

    final cy a()
    {
        if (g == null)
        {
            throw new NoSuchElementException();
        } else
        {
            h = g;
            b();
            return h;
        }
    }

    public boolean hasNext()
    {
        return g != null;
    }

    public void remove()
    {
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "no calls to next() since the last call to remove()");
        i.remove(h.getKey());
        h = null;
    }
}
