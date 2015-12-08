// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class nlc
{

    final SparseArray a = new SparseArray();
    final int b;

    nlc(Context context)
    {
        String s = olm.b(context).a("LoginAccountHandler.account_key", null);
        b = ((mmv)olm.a(context, mmv)).c(s);
    }

    final List a()
    {
        Object obj = b();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            int i = ((nlg)((Iterator) (obj)).next()).a.b;
            if (!arraylist.contains(Integer.valueOf(i)))
            {
                arraylist.add(Integer.valueOf(i));
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    final void a(nlq nlq1, long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.get(nlq1.b) == null)
        {
            a.put(nlq1.b, new HashSet());
        }
        ((Set)a.get(nlq1.b)).add(new nlg(nlq1, l1, l));
        this;
        JVM INSTR monitorexit ;
        return;
        nlq1;
        throw nlq1;
    }

    final List b()
    {
        Object obj = new HashSet();
        for (int i = 0; i < a.size(); i++)
        {
            ((Set) (obj)).addAll((Collection)a.valueAt(i));
        }

        obj = new ArrayList(((Collection) (obj)));
        if (b != -1)
        {
            Collections.sort(((List) (obj)), new nld(this));
        }
        return Collections.unmodifiableList(((List) (obj)));
    }

    public final String toString()
    {
        return a.toString();
    }
}
