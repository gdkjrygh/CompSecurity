// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fbq
    implements fcg
{

    private final fci a;
    private final fbz b;
    private final noz c;
    private final izo d;

    public fbq(Context context, fci fci1, fbz fbz1)
    {
        a = (fci)p.b(fci1, "storage cannot be null");
        b = (fbz)p.b(fbz1, "settings cannot be null");
        c = noz.a(context, 3, "PhotosDeviceMgmt", new String[0]);
        d = (izo)olm.a(context, izo);
    }

    public final fcy a()
    {
        if (!a.a())
        {
            return fcy.a;
        }
        long l = a.b();
        if (l > b.a())
        {
            if (c.a())
            {
                long l1 = b.a();
                (new StringBuilder(77)).append("NOT LOW STORAGE! ").append(l).append(" Comparing against: ").append(l1);
            }
            return fcy.b;
        }
        if (l > b.b())
        {
            if (c.a())
            {
                long l2 = b.a();
                (new StringBuilder(73)).append("LOW STORAGE! ").append(l).append(" Comparing against: ").append(l2);
            }
            return fcy.c;
        }
        if (c.a())
        {
            long l3 = b.b();
            (new StringBuilder(78)).append("VERY LOW STORAGE! ").append(l).append(" Comparing against: ").append(l3);
        }
        return fcy.d;
    }

    public final List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            fcj fcj1 = (fcj)list.next();
            if ((new File(fcj1.f())).lastModified() == fcj1.c())
            {
                arraylist.add(fcj1);
            }
        } while (true);
        return arraylist;
    }

    public final void a(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(Uri.parse(((fcj)iterable.next()).a()))) { }
        d.b(arraylist);
    }

    public final List b()
    {
        List list = a.a(b.d());
        Collections.sort(list, new fbr(this));
        return list;
    }
}
