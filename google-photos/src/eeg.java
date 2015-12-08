// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class eeg extends mtf
{

    private final List a;

    public eeg(List list)
    {
        super("MarkAllAsViewedTask");
        a = list;
    }

    protected final mue a(Context context)
    {
        dus dus1 = (dus)olm.a(context, dus);
        jk jk1 = new jk();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dui dui1 = (dui)iterator.next();
            if (((dur)dus1.a(dui1.c())).b(dui1) != dut.b)
            {
                List list = (List)jk1.get(dui1.c());
                context = list;
                if (list == null)
                {
                    context = new ArrayList();
                    jk1.put(dui1.c(), context);
                }
                context.add(dui1);
            }
        } while (true);
        java.util.Map.Entry entry;
        for (context = jk1.entrySet().iterator(); context.hasNext(); ((dur)dus1.a(entry.getKey())).a((List)entry.getValue()))
        {
            entry = (java.util.Map.Entry)context.next();
        }

        return new mue(true);
    }
}
