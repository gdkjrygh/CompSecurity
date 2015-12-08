// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class hwf
    implements hxu, hyb, omb, opn, opv
{

    hwy a;
    final HashSet b = new HashSet();
    private hxt c;
    private hwh d;
    private mmr e;

    public hwf(opd opd1, am am)
    {
        opd1.a(this);
        c = new hxt(am, opd1, this);
        a = new hwy(opd1, this);
        d = new hwh(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (mmr)olm1.a(mmr);
    }

    public final void a(hwg hwg)
    {
        b.add(hwg);
    }

    public final void a(String s, int i, int j)
    {
        b.u();
        if (a != null && c != null)
        {
            if (j == 0)
            {
                hwy hwy1 = a;
                hyb hyb1;
                ArrayList arraylist;
label0:
                for (Iterator iterator = hwy1.e.iterator(); iterator.hasNext(); hyb1.a(s, arraylist))
                {
                    hyb1 = (hyb)iterator.next();
                    String s1 = s.toString().toLowerCase(Locale.getDefault()).trim().replaceAll("\\s+", " ");
                    arraylist = new ArrayList();
                    Iterator iterator1 = hwy1.d.iterator();
                    do
                    {
                        CharSequence charsequence;
                        do
                        {
                            if (!iterator1.hasNext())
                            {
                                continue label0;
                            }
                            charsequence = (CharSequence)iterator1.next();
                        } while (charsequence.length() <= s1.length() || !charsequence.subSequence(0, s1.length()).toString().toLowerCase(Locale.getDefault()).equals(s1) || arraylist.contains(charsequence));
                        arraylist.add(charsequence);
                    } while (arraylist.size() != 2);
                }

            }
            c.a(e.d(), s, i, j);
        }
    }

    public final void a(String s, List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new hse(s, (new StringBuilder((CharSequence)list.next())).toString()))) { }
        s = d;
        s.a = Collections.unmodifiableList(arraylist);
        s.a();
    }

    public final void a(List list)
    {
        hwh hwh1 = d;
        hwh1.b = list;
        hwh1.a();
    }

    public final void c()
    {
        b.clear();
        a = null;
        c = null;
    }
}
