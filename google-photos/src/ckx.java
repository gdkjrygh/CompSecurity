// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ckx
    implements ded
{

    public Queue a;
    public Set b;
    public cky c;
    private final ckz d;
    private final ckt e;
    private int f;
    private boolean g;
    private ckt h;

    public ckx(ckz ckz1, ckt ckt1)
    {
        d = (ckz)b.a(ckz1, "settings", null);
        e = (ckt)b.a(ckt1, "decoderFactory", null);
    }

    public final ckq a(civ civ1)
    {
        Object obj = e;
        b.a(civ1, "source", null);
        b.a(obj, "decoderFactory", null);
        if (a == null)
        {
            f = d.a();
            g = d.b();
            a = new LinkedList();
            b = new HashSet(f);
        }
        boolean flag;
        if (g || a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "no decoders should be available if reusing decoders is not enabled");
        if (!obj.equals(h))
        {
            c.a(b, "mAvailableDecoders");
            a();
            h = ((ckt) (obj));
        }
        obj = civ1.b();
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ckq ckq1 = (ckq)iterator.next();
            if (ckq1.a(((android.media.MediaFormat) (obj))))
            {
                iterator.remove();
                b.add(ckq1);
                ckq1.a(civ1);
                return ckq1;
            }
        }

        if (a.size() == 0 && b.size() == f)
        {
            return null;
        }
        if (a.size() + b.size() == f)
        {
            dee.a((ded)a.poll());
        }
        obj = h.a(civ1.b());
        ((ckq) (obj)).a(civ1);
        b.add(obj);
        return ((ckq) (obj));
    }

    public final void a()
    {
        if (a == null)
        {
            b();
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); dee.a((ckq)iterator.next())) { }
        a.clear();
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); dee.a((ckq)iterator1.next())) { }
        b.clear();
        b();
    }

    public final void a(ckq ckq1)
    {
        if (ckq1 != null)
        {
            if (g)
            {
                b.remove(ckq1);
                a.add(ckq1);
                ckq1.d();
            } else
            {
                b.remove(ckq1);
                dee.a(ckq1);
            }
            if (b.isEmpty() && a.isEmpty())
            {
                b();
                return;
            }
        }
    }

    public void b()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }

    static 
    {
        ckx.getSimpleName();
    }
}
