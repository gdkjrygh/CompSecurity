// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

final class ehz
    implements iwj
{

    private final Context a;
    private final int b;
    private final eqs c;

    public ehz(Context context, int i)
    {
        a = context;
        b = i;
        c = (eqs)olm.a(context, eqs);
    }

    public final Object a(Object obj)
    {
        List list = (List)obj;
        ArrayList arraylist = new ArrayList(list.size());
        obj = null;
        ehy ehy1 = new ehy(a, b);
        fsj fsj1 = new fsj(a);
        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            Object obj1 = (ekq)iterator.next();
            String s = ((hpe)((ekq) (obj1)).a(hpe)).a.a;
            obj1 = new eht(ehy1, ((ekq) (obj1)), i);
            if (obj == null && c.b(s, b))
            {
                obj = c;
                int j = b;
                if (((eqs) (obj)).b == eqt.a && ((eqs) (obj)).b(s, j))
                {
                    obj.b = eqt.b;
                }
                obj = obj1;
            }
            arraylist.add(obj1);
            long l = ((hkd)((eht) (obj1)).a.a(hkd)).a;
            fsj1.d.setTimeInMillis(l);
            if (fsj1.e != null)
            {
                fsi fsi1 = fsj1.e;
                Calendar calendar = fsj1.d;
                boolean flag;
                if (fsi1.a.get(1) == calendar.get(1) && fsi1.a.get(2) == calendar.get(2))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    continue;
                }
            }
            fsj1.e = new fsi(fsj1.a, fsj1.d, fsj1.b);
            fsj1.c.put(i, fsj1.e);
            i++;
        }
        return new eia(arraylist, arraylist.indexOf(obj), fsj1.c);
    }
}
