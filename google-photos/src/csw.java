// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class csw
{

    private static final String f = csw.getSimpleName();
    final String a;
    public final List b;
    public final LongSparseArray c;
    final Map d;
    public final Map e;

    public csw()
    {
        c = new LongSparseArray();
        a = "";
        b = Collections.emptyList();
        d = Collections.emptyMap();
        e = Collections.emptyMap();
    }

    public csw(cvp cvp1, String s)
    {
        c = new LongSparseArray();
        b.a(s, "defaultBaseUrl", null);
        boolean flag;
        int j1;
        if (TextUtils.isEmpty(cvp1.e))
        {
            a = s;
        } else
        {
            a = cvp1.e;
        }
        j1 = cvp1.c;
        if (j1 == 0 || j1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            Log.e(f, "Track database encryption method not supported.");
            throw new csx(j1);
        }
        Object aobj[] = cvp1.b;
        s = new ArrayList(aobj.length);
        java.util.HashMap hashmap = b.l(aobj.length);
        Object obj = new SparseArray(aobj.length);
        int l = aobj.length;
        for (int i = 0; i < l; i++)
        {
            cvo cvo1 = aobj[i];
            coc coc2 = new coc(cvo1.b);
            ((SparseArray) (obj)).append(cvo1.a, coc2);
            s.add(coc2);
            hashmap.put(coc2, new ArrayList());
        }

        aobj = cvp1.a;
        l = aobj.length;
        for (int j = 0; j < l; j++)
        {
            cvr cvr1 = aobj[j];
            long l2 = a(j1, cvr1.c);
            cqa cqa1 = new cqa(cvr1.b, cvr1.a, new cqc(l2), cvr1.d, cvr1.e);
            coc coc3 = (coc)((SparseArray) (obj)).get(cvr1.d);
            if (coc3 == null)
            {
                j = cvr1.d;
                throw csy.a("genreId", (new StringBuilder(11)).append(j).toString(), cqa1.toString());
            }
            ((List)hashmap.get(coc3)).add(cqa1);
            c.put(l2, cqa1);
        }

        obj = new EnumMap(cyy);
        aobj = cvp1.d;
        int k1 = aobj.length;
        for (int k = 0; k < k1; k++)
        {
            cvq cvq1 = aobj[k];
            if (cvq1.a == null)
            {
                throw new csy("Missing theme type");
            }
            long al[];
            ArrayList arraylist;
            int l1;
            try
            {
                cvp1 = cyy.valueOf(cvq1.a);
            }
            // Misplaced declaration of an exception variable
            catch (cvp cvp1)
            {
                cvp1 = null;
            }
            if (cvp1 == null)
            {
                continue;
            }
            arraylist = new ArrayList(cvq1.b.length);
            al = cvq1.b;
            l1 = al.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                long l3 = a(j1, al[i1]);
                arraylist.add(c.get(l3));
            }

            ((Map) (obj)).put(cvp1, Collections.unmodifiableList(arraylist));
        }

        cvp1 = b.l(s.size());
        coc coc1;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); cvp1.put(coc1, Collections.unmodifiableList((List)hashmap.get(coc1))))
        {
            coc1 = (coc)iterator.next();
        }

        b = Collections.unmodifiableList(s);
        d = Collections.unmodifiableMap(cvp1);
        e = Collections.unmodifiableMap(((Map) (obj)));
    }

    private static long a(int i, long l)
    {
        if (i == 0)
        {
            return l;
        }
        if (i == 1)
        {
            return l * 0x2ba9057979c4c891L;
        } else
        {
            throw b.a((new StringBuilder(39)).append("Unsupported encryption type ").append(i).toString());
        }
    }

    public final cqa a(cqc cqc1)
    {
        return (cqa)c.get(cqc1.b);
    }

    public final List a(coc coc1)
    {
        ArrayList arraylist = new ArrayList();
        coc1 = ((List)d.get(coc1)).iterator();
        do
        {
            if (!coc1.hasNext())
            {
                break;
            }
            cqa cqa1 = (cqa)coc1.next();
            if (cqa1.h)
            {
                arraylist.add(cqa1);
            }
        } while (true);
        return arraylist;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof csw))
            {
                return false;
            }
            obj = (csw)obj;
            if (!b.e(d, ((csw) (obj)).d) || !b.e(e, ((csw) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(d, e.hashCode());
    }

}
