// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class cmd
{

    final SparseArray a;
    final int b;
    private final int c[];

    cmd(SparseArray sparsearray)
    {
        a = sparsearray;
        c = b(a);
        b = a(a);
    }

    public cmd(cwb cwb1)
    {
        this(b(cwb1));
    }

    private static int a(SparseArray sparsearray)
    {
        int i = 0;
        int j = 0;
        for (; i < sparsearray.size(); i++)
        {
            j += ((List)sparsearray.valueAt(i)).size();
        }

        return j;
    }

    private static SparseArray b(cwb cwb1)
    {
        SparseArray sparsearray = new SparseArray();
        cwa acwa[] = cwb1.d;
        int j = acwa.length;
        for (int i = 0; i < j; i++)
        {
            cwb1 = acwa[i];
            cof cof1 = new cof(new cod(((cwa) (cwb1)).a, ((cwa) (cwb1)).b), cml.a(((cwa) (cwb1)).d), ((cwa) (cwb1)).c);
            int k = ((cwa) (cwb1)).c;
            List list = (List)sparsearray.get(k);
            cwb1 = list;
            if (list == null)
            {
                cwb1 = new ArrayList();
                sparsearray.put(k, cwb1);
            }
            cwb1.add(cof1);
        }

        return sparsearray;
    }

    private static int[] b(SparseArray sparsearray)
    {
        int ai[] = new int[sparsearray.size()];
        for (int i = 0; i < sparsearray.size(); i++)
        {
            ai[i] = sparsearray.keyAt(i);
        }

        return ai;
    }

    public final List a(int i)
    {
        List list = (List)a.get(i);
        if (list == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(list);
        }
    }

    public final void a(cwb cwb1)
    {
        ArrayList arraylist = new ArrayList();
        int ai[] = c;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            cwa cwa1;
            for (Iterator iterator = a(ai[i]).iterator(); iterator.hasNext(); arraylist.add(cwa1))
            {
                cof cof1 = (cof)iterator.next();
                cwa1 = new cwa();
                cwa1.a = cof1.b.b;
                cwa1.b = cof1.b.c;
                cwa1.c = cof1.a;
                if (cof1.c != null)
                {
                    cwa1.d = cof1.c.a();
                }
            }

        }

        cwb1.d = (cwa[])arraylist.toArray(new cwa[arraylist.size()]);
    }
}
