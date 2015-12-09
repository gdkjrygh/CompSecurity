// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.pandora.android.util:
//            ac

private class <init> extends Filter
{

    final ac a;

    protected android.widget.r.FilterResults performFiltering(CharSequence charsequence)
    {
        android.widget.r.FilterResults filterresults;
        ArrayList arraylist;
        int i;
        int k;
        filterresults = new android.widget.r.FilterResults();
        if (charsequence == null || charsequence.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        charsequence = charsequence.toString().toLowerCase(Locale.getDefault());
        if (charsequence.charAt(0) == '@')
        {
            charsequence = charsequence.substring(1);
        }
        synchronized (ac.a(a))
        {
            arraylist = new ArrayList(ac.b(a));
        }
        k = arraylist.size();
        obj = new ArrayList();
        i = 0;
_L5:
        if (i >= k) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        s = (String)arraylist.get(i);
        s1 = s.toString().toLowerCase();
        if (!s1.startsWith((new StringBuilder()).append("@").append(charsequence).toString())) goto _L4; else goto _L3
_L3:
        ((ArrayList) (obj)).add(s);
_L7:
        i++;
          goto _L5
        charsequence;
        obj;
        JVM INSTR monitorexit ;
        throw charsequence;
_L4:
        String as[];
        int j;
        int l;
        as = s1.split(" ");
        l = as.length;
        j = 0;
_L9:
        if (j >= l) goto _L7; else goto _L6
_L6:
label0:
        {
            if (!as[j].startsWith(charsequence))
            {
                break label0;
            }
            ((ArrayList) (obj)).add(s);
        }
        if (true) goto _L7; else goto _L8
_L8:
        j++;
          goto _L9
_L2:
        filterresults.values = obj;
        filterresults.count = ((ArrayList) (obj)).size();
        return filterresults;
          goto _L7
    }

    protected void publishResults(CharSequence charsequence, android.widget.r.FilterResults filterresults)
    {
        if (filterresults.values != null)
        {
            ac.a(a, (ArrayList)filterresults.values);
            a.notifyDataSetChanged();
        }
    }

    private sults(ac ac1)
    {
        a = ac1;
        super();
    }

    a(ac ac1, a a1)
    {
        this(ac1);
    }
}
