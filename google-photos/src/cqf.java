// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class cqf
    implements cnp, cqn
{

    private static final long j;
    public final Map a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final cok g;
    public final long h;
    public final long i;
    private final List k;
    private final cay l;
    private final cod m;

    cqf(Map map, List list, List list1, List list2, List list3, cay cay1, String s, 
            String s1, cod cod1, cok cok1)
    {
        a = (Map)b.a(map, "inputDisplayables", null);
        b = (List)b.a(list, "videoClips");
        c = (List)b.a(list1, "audioClipSequences");
        k = (List)b.a(list2, "playbackMetrics");
        g = (cok)b.a(cok1, "dimensions", null);
        b.a(k.size(), "mPlaybackMetrics.size()", list.size(), "playback metrics should have the same length as clips");
        for (map = list.iterator(); map.hasNext();)
        {
            list2 = (cnq)map.next();
            if (((cnq) (list2)).d != cnt.a && ((cnq) (list2)).d != cnt.c && ((cnq) (list2)).d != cnt.d && ((cnq) (list2)).d != cnt.e)
            {
                map = String.valueOf(((cnq) (list2)).d);
                throw b.a((new StringBuilder(String.valueOf(map).length() + 44)).append("videoClips should not contain clip of type: ").append(map).toString());
            }
        }

        for (map = list1.iterator(); map.hasNext();)
        {
            list1 = (cnn)map.next();
            int i1 = 0;
            while (i1 < list1.a()) 
            {
                list2 = list1.a(i1);
                if (((cnq) (list2)).d != cnt.b)
                {
                    map = String.valueOf(((cnq) (list2)).d);
                    throw b.a((new StringBuilder(String.valueOf(map).length() + 52)).append("audioClipSequences should not contain clip of type: ").append(map).toString());
                }
                i1++;
            }
        }

        b.a(list3, "transitions", null);
        if (list.size() != 1)
        {
            b.a(list3.size(), "transitions.size()", list.size() - 1, "transitions should be one element shorter than clips");
        }
        d = list3;
        h = a(list, list3);
        l = (cay)b.a(cay1, "globalEffect", null);
        e = (String)b.a(s, "title", null);
        f = (String)b.a(s1, "subtitle", null);
        m = (cod)b.a(cod1, "titleDisplayInterval", null);
        long l1 = -1L;
        for (int j1 = 0; j1 < c.size();)
        {
            long l2;
label0:
            {
                map = (cnn)c.get(j1);
                if (l1 != -1L)
                {
                    l2 = l1;
                    if (map.b() >= l1)
                    {
                        break label0;
                    }
                }
                l2 = map.b();
            }
            j1++;
            l1 = l2;
        }

        i = l1;
    }

    public static int a(cqn cqn1, cqn cqn2)
    {
        boolean flag = false;
        int i1;
        if (cqn2 == null)
        {
            i1 = 1;
        } else
        {
            ArrayList arraylist = new ArrayList(cqn1.e());
            ArrayList arraylist1 = new ArrayList(cqn2.e());
            ArrayList arraylist2 = new ArrayList(cqn1.f());
            ArrayList arraylist3 = new ArrayList(cqn2.f());
            boolean flag1 = cqn1.k();
            boolean flag2 = cqn2.k();
            if (flag1)
            {
                arraylist.remove(0);
                arraylist2.remove(0);
            }
            if (flag2)
            {
                arraylist1.remove(0);
                arraylist3.remove(0);
            }
            if (arraylist.size() != arraylist1.size())
            {
                return 1;
            }
            for (i1 = 0; i1 < arraylist.size(); i1++)
            {
                if (!((cnq)arraylist.get(i1)).e.equals(((cnq)arraylist1.get(i1)).e))
                {
                    return 1;
                }
            }

            if (flag1 && !flag2)
            {
                return 2;
            }
            i1 = ((flag) ? 1 : 0);
            if (!flag1)
            {
                i1 = ((flag) ? 1 : 0);
                if (flag2)
                {
                    return 4;
                }
            }
        }
        return i1;
    }

    private static long a(List list, List list1)
    {
        list = list.iterator();
        long l1;
        for (l1 = 0L; list.hasNext(); l1 = ((cnq)list.next()).f.a() + l1) { }
        long l2 = l1;
        if (list1 != null)
        {
            list = list1.iterator();
            do
            {
                l2 = l1;
                if (!list.hasNext())
                {
                    break;
                }
                l1 -= ((czw)list.next()).b();
            } while (true);
        }
        return l2;
    }

    public final int a(long l1, boolean flag)
    {
        int j1 = d();
        int i1 = 0;
        while (i1 < j1) 
        {
            cnq cnq1 = b(i1);
            if (l1 < cnq1.f.a() && (flag || cnq1.d != cnt.d))
            {
                return i1;
            }
            long l3 = cnq1.f.a();
            long l2;
            if (i1 < j1 - 1)
            {
                l2 = d(i1).b();
            } else
            {
                l2 = 0L;
            }
            l1 = (l1 - l3) + l2;
            i1++;
        }
        return j1;
    }

    public final long a(long l1, int i1)
    {
        return (l1 - e(i1)) + b(i1).f.b;
    }

    public final cnn a(int i1)
    {
        return (cnn)c.get(b.a(i1, "n", c));
    }

    public final cqk a(nny nny1)
    {
        nny1 = (cnz)a.get(nny1);
        if (nny1 instanceof cqk)
        {
            return (cqk)nny1;
        } else
        {
            return null;
        }
    }

    public final List a()
    {
        return Collections.unmodifiableList(c);
    }

    public final int b()
    {
        return c.size();
    }

    public final cnq b(int i1)
    {
        return (cnq)b.get(b.a(i1, "n", b));
    }

    public final long c()
    {
        return i;
    }

    public final cnu c(int i1)
    {
        return (cnu)k.get(i1);
    }

    public final int d()
    {
        return b.size();
    }

    public final czw d(int i1)
    {
        return (czw)d.get(b.a(i1, "from", d));
    }

    public final long e(int i1)
    {
        b.a(i1, "index", Collections.unmodifiableList(b));
        long l1 = 0L;
        for (int j1 = 0; j1 < i1; j1++)
        {
            l1 = (l1 + b(j1).f.a()) - d(j1).b();
        }

        return l1;
    }

    public final List e()
    {
        return Collections.unmodifiableList(b);
    }

    public final List f()
    {
        return Collections.unmodifiableList(d);
    }

    public final cay g()
    {
        return l;
    }

    public final String h()
    {
        return e;
    }

    public final String i()
    {
        return f;
    }

    public final cod j()
    {
        return m;
    }

    public final boolean k()
    {
        return !b.isEmpty() && ((cnq)b.get(0)).d == cnt.d;
    }

    public final long l()
    {
        return h;
    }

    public final long m()
    {
        long l3 = 0L;
        long l1 = 0L;
        long l2 = 0L;
        int i1 = 0;
        do
        {
            cnq cnq1;
label0:
            {
                if (i1 < b.size())
                {
                    cnq1 = (cnq)b.get(i1);
                    if (j >= l3)
                    {
                        break label0;
                    }
                }
                return l2;
            }
            l3 = cnq1.f.a() + l1;
            if (i1 < d.size())
            {
                l1 = l3 - ((czw)d.get(i1)).b();
            } else
            {
                l1 = l3;
            }
            if (cnq1.d == cnt.a || cnq1.d == cnt.c)
            {
                if (j < l1)
                {
                    return j;
                }
                l2 = l1 - 1L;
            }
            i1++;
        } while (true);
    }

    public String toString()
    {
        Class class1 = getClass();
        List list = b;
        List list1 = c;
        List list2 = d;
        cay cay1 = l;
        String s = String.valueOf(e.toString().replace("\"", "\\\""));
        return b.a(class1, new Object[] {
            list, list1, list2, cay1, (new StringBuilder(String.valueOf(s).length() + 2)).append("\"").append(s).append("\"").toString()
        });
    }

    static 
    {
        cqf.getSimpleName();
        j = TimeUnit.SECONDS.toMicros(5L);
    }
}
