// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ixe
    implements jcc, omb, opn, opv
{

    private final ar a;
    private final Set b = new HashSet();
    private ixs c;
    private jbz d;
    private mmr e;
    private elh f;

    ixe(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    private void a(ixo ixo1, Collection collection)
    {
        ixo1 = ixn.a(new hyw(collection), ixo1);
        collection = a.c().a();
        collection.a(ixo1, "skip_trash");
        collection.b();
    }

    public final String a()
    {
        return "trash.MoveToTrashUndoableAction";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (ixs)olm1.a(ixs);
        d = (jbz)olm1.a(jbz);
        d.a(this);
        e = (mmr)olm1.a(mmr);
        f = (elh)olm1.a(elh);
    }

    public final void a(hyw hyw1)
    {
        ArrayList arraylist = new ArrayList(hyw1.a);
        Object obj = (iyj)b.a(a, iyj, arraylist);
        obj = (eka)f.a(obj.getClass());
        if (obj != null && ((eka) (obj)).a(a, arraylist))
        {
            return;
        } else
        {
            b(hyw1);
            return;
        }
    }

    public final void a(ixf ixf1)
    {
        b.add(ixf1);
    }

    public final void a(jby jby1)
    {
        c.a();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ixf)iterator.next()).a((Collection)jby1.b(), true)) { }
    }

    public final void a(jby jby1, Exception exception)
    {
        c.a();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ixf)iterator.next()).a((Collection)jby1.b(), false)) { }
        if (exception instanceof izw)
        {
            a(ixo.a, (Collection)jby1.b());
        } else
        {
            if (exception instanceof izv)
            {
                a(ixo.b, (Collection)jby1.b());
                return;
            }
            if (exception instanceof fap)
            {
                exception = (fap)exception;
                ixa.a(new hyw((Collection)jby1.b()), ((fap) (exception)).a, iyj).a(a.c(), "com.google.android.apps.photos.trash.FileNotDeletableDialog");
                return;
            }
        }
    }

    public final void b(hyw hyw1)
    {
        hyw1 = new ArrayList(hyw1.a);
        c.b();
        d.a(new ixh(e.d(), new hyw(hyw1)));
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ixf)iterator.next()).a(hyw1)) { }
    }

    public final void b(ixf ixf1)
    {
        b.remove(ixf1);
    }

    public final void b(jby jby1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ixf)iterator.next()).b((Collection)jby1.b())) { }
    }

    public final void c()
    {
        d.b(this);
    }

    public final void c(jby jby1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ixf)iterator.next()).c((Collection)jby1.b())) { }
    }
}
