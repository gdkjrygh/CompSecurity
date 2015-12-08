// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.view.adapters:
//            v

private final class <init> extends Filter
{

    final v a;

    protected final android.widget.er.FilterResults performFiltering(CharSequence charsequence)
    {
        obj = new android.widget.er.FilterResults();
        if (charsequence == null || charsequence.length() == 0)
        {
            synchronized (v.a(a))
            {
                obj.values = v.b(a);
                obj.count = v.b(a).size();
            }
            return ((android.widget.er.FilterResults) (obj));
        }
        break MISSING_BLOCK_LABEL_67;
        obj;
        charsequence;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1 = v.a(a);
        obj1;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ArrayList arraylist1;
        int j;
        charsequence = charsequence.toString().toLowerCase();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist1.addAll(v.b(a));
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        String s = (String)arraylist1.get(i);
        if (s.toString().toLowerCase().startsWith(charsequence))
        {
            arraylist.add(s);
        }
        break MISSING_BLOCK_LABEL_197;
        obj.values = arraylist;
        obj.count = arraylist.size();
        obj1;
        JVM INSTR monitorexit ;
        return ((android.widget.er.FilterResults) (obj));
        charsequence;
        obj1;
        JVM INSTR monitorexit ;
        throw charsequence;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void publishResults(CharSequence charsequence, android.widget.er.FilterResults filterresults)
    {
        charsequence = ((CharSequence) (v.a(a)));
        charsequence;
        JVM INSTR monitorenter ;
        filterresults = (ArrayList)filterresults.values;
        Collections.sort(filterresults, String.CASE_INSENSITIVE_ORDER);
        a.clear();
        String s;
        for (filterresults = filterresults.iterator(); filterresults.hasNext(); a.add(s))
        {
            s = (String)filterresults.next();
        }

        break MISSING_BLOCK_LABEL_72;
        filterresults;
        charsequence;
        JVM INSTR monitorexit ;
        throw filterresults;
        a.notifyDataSetChanged();
        charsequence;
        JVM INSTR monitorexit ;
    }

    private erResults(v v1)
    {
        a = v1;
        super();
    }

    t>(v v1, byte byte0)
    {
        this(v1);
    }
}
