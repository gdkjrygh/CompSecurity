// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.exoplayer.BehindLiveWindowException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class bam
    implements bab
{

    private final azp a;
    private final bdc b;
    private final baf c;
    private final bah d;
    private final bdt e;
    private final StringBuilder f;
    private final int g;
    private final int h;
    private final bad i[];
    private final HashMap j;
    private bat k;
    private bbj l;
    private azo m;
    private long n[];
    private int o;
    private int p;
    private boolean q;
    private IOException r;

    public bam(bat bat1, int i1, int ai[], bdc bdc, baf baf1)
    {
        this(bat1, i1, ai, bdc, baf1, ((bdt) (new beg())));
    }

    private bam(bat bat1, int i1, int ai[], bdc bdc, baf baf1, bdt bdt1)
    {
        k = bat1;
        b = bdc;
        c = baf1;
        e = bdt1;
        d = new bah();
        f = new StringBuilder();
        n = new long[2];
        l = a(k, i1);
        ai = a(k, i1, ai);
        int j1;
        int k1;
        long l1;
        if (((bay) (ai[0])).c == -1L)
        {
            l1 = -1L;
        } else
        {
            l1 = ((bay) (ai[0])).c * 1000L;
        }
        a = new azp(((bay) (ai[0])).a.b, l1);
        i = new bad[ai.length];
        j = new HashMap();
        k1 = 0;
        j1 = 0;
        i1 = 0;
        while (i1 < ai.length) 
        {
            i[i1] = ((bay) (ai[i1])).a;
            k1 = Math.max(i[i1].d, k1);
            j1 = Math.max(i[i1].e, j1);
            if (a(i[i1].b))
            {
                bat1 = new bcv();
            } else
            {
                bat1 = new bcl();
            }
            j.put(i[i1].a, new ban(ai[i1], new azw(bat1)));
            i1++;
        }
        g = k1;
        h = j1;
        Arrays.sort(i, new bae());
    }

    private static bbj a(bat bat1, int i1)
    {
        String s;
        Object obj;
        obj = null;
        Object obj2 = null;
        bat1 = (baq)((baw)bat1.e.get(0)).a.get(i1);
        if (a(((bay)((baq) (bat1)).b.get(0)).a.b))
        {
            s = "video/webm";
        } else
        {
            s = "video/mp4";
        }
        if (!((baq) (bat1)).c.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L4:
        return ((bbj) (obj));
_L2:
        Iterator iterator = ((baq) (bat1)).c.iterator();
        bat1 = ((bat) (obj));
        do
        {
            obj = bat1;
            if (!iterator.hasNext())
            {
                continue;
            }
            bar bar1 = (bar)iterator.next();
            if (bar1.b != null && bar1.c != null)
            {
                Object obj1 = bat1;
                if (bat1 == null)
                {
                    obj1 = new bbk(s);
                }
                ((bbk) (obj1)).a(bar1.b, bar1.c);
                bat1 = ((bat) (obj1));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(bao bao1, long l1)
    {
        int j1 = bao1.a();
        int k1 = bao1.b();
        int i1;
        if (k1 == -1)
        {
            l1 -= k.a * 1000L;
            i1 = j1;
            if (k.d != -1L)
            {
                i1 = Math.max(j1, bao1.a(l1 - k.d * 1000L));
            }
            j1 = bao1.a(l1);
            j1--;
        } else
        {
            i1 = j1;
            j1 = k1;
        }
        o = i1;
        p = j1;
    }

    private static boolean a(String s)
    {
        return s.startsWith("video/webm") || s.startsWith("audio/webm");
    }

    private static bay[] a(bat bat1, int i1, int ai[])
    {
        boolean flag = false;
        bat1 = ((baq)((baw)bat1.e.get(0)).a.get(i1)).b;
        if (ai == null)
        {
            ai = new bay[bat1.size()];
            bat1.toArray(ai);
            return ai;
        }
        bay abay[] = new bay[ai.length];
        for (i1 = ((flag) ? 1 : 0); i1 < ai.length; i1++)
        {
            abay[i1] = (bay)bat1.get(ai[i1]);
        }

        return abay;
    }

    private void b(bao bao1, long l1)
    {
        long l2;
        long l4;
        l4 = bao1.a(o);
        l2 = bao1.a(p) + bao1.b(p);
        if (!k.c) goto _L2; else goto _L1
_L1:
        if (bao1.b() != -1) goto _L4; else goto _L3
_L3:
        l2 = l1 - k.a * 1000L;
_L6:
        l2 = Math.max(l4, l2);
_L2:
        bao1 = new azo(l4, l2);
        if (m == null || !m.equals(bao1))
        {
            m = bao1;
        }
        return;
_L4:
        long l3 = bao1.a(bao1.b()) + bao1.b(bao1.b());
        l2 = l3;
        if (!bao1.c())
        {
            l2 = Math.min(l3, l1 - k.a * 1000L);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private long e()
    {
        if (0L != 0L)
        {
            return e.a() * 1000L;
        } else
        {
            return System.currentTimeMillis() * 1000L;
        }
    }

    public final azp a()
    {
        return a;
    }

    public final void a(azi azi1)
    {
        if (a.a.startsWith("video"))
        {
            int i1 = g;
            int j1 = h;
            azi1.f = i1;
            azi1.g = j1;
            if (azi1.h != null)
            {
                azi1.a(azi1.h);
            }
        }
    }

    public final void a(azv azv1)
    {
        if (azv1 instanceof baj)
        {
            azv1 = (baj)azv1;
            Object obj = ((baj) (azv1)).c.a;
            obj = (ban)j.get(obj);
            boolean flag;
            if (((baj) (azv1)).a != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj.d = ((baj) (azv1)).a;
            }
            if (((baj) (azv1)).f != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj.c = new bap((bbu)((baj) (azv1)).f, ((baj) (azv1)).d.a.toString(), ((ban) (obj)).a.b * 1000L);
            }
            if (l == null)
            {
                if (((baj) (azv1)).b != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    l = ((baj) (azv1)).b;
                }
            }
        }
    }

    public final void a(List list, long l1, long l2, azy azy1)
    {
        if (r == null) goto _L2; else goto _L1
_L1:
        azy1.b = null;
_L4:
        return;
_L2:
        Object obj;
        d.a = list.size();
        if (d.c == null || !q)
        {
            c.a(list, l2, i, d);
        }
        obj = d.c;
        azy1.a = d.a;
        if (obj == null)
        {
            azy1.b = null;
            return;
        }
        if (azy1.a == list.size() && azy1.b != null && azy1.b.c.equals(obj)) goto _L4; else goto _L3
_L3:
        Object obj3;
        int j1;
        int j2;
        azy1.b = null;
        obj3 = (ban)j.get(((bad) (obj)).a);
        bay bay2 = ((ban) (obj3)).a;
        Object obj4 = ((ban) (obj3)).c;
        azw azw1 = ((ban) (obj3)).b;
        obj = null;
        Object obj1 = null;
        if (((ban) (obj3)).d == null)
        {
            obj = bay2.e;
        }
        if (obj4 == null)
        {
            obj1 = bay2.e();
        }
        if (obj != null || obj1 != null)
        {
            obj3 = b;
            int i1 = d.b;
            if (obj != null)
            {
                if (obj1 == null || !((bax) (obj)).b().equals(((bax) (obj1)).b()))
                {
                    list = null;
                } else
                if (((bax) (obj)).b != -1L && ((bax) (obj)).a + ((bax) (obj)).b == ((bax) (obj1)).a)
                {
                    list = ((bax) (obj)).c;
                    obj4 = ((bax) (obj)).d;
                    l2 = ((bax) (obj)).a;
                    if (((bax) (obj1)).b == -1L)
                    {
                        l1 = -1L;
                    } else
                    {
                        l1 = ((bax) (obj)).b;
                        l1 = ((bax) (obj1)).b + l1;
                    }
                    list = new bax(list, ((String) (obj4)), l2, l1);
                } else
                if (((bax) (obj1)).b != -1L && ((bax) (obj1)).a + ((bax) (obj1)).b == ((bax) (obj)).a)
                {
                    list = ((bax) (obj)).c;
                    obj4 = ((bax) (obj)).d;
                    l2 = ((bax) (obj1)).a;
                    if (((bax) (obj)).b == -1L)
                    {
                        l1 = -1L;
                    } else
                    {
                        l1 = ((bax) (obj1)).b + ((bax) (obj)).b;
                    }
                    list = new bax(list, ((String) (obj4)), l2, l1);
                } else
                {
                    list = null;
                }
                if (list == null)
                {
                    list = ((List) (obj));
                }
            } else
            {
                list = ((List) (obj1));
            }
            list = new baj(((bdc) (obj3)), new bde(list.a(), ((bax) (list)).a, ((bax) (list)).b, bay2.g()), i1, bay2.a, azw1);
            q = true;
            azy1.b = list;
            return;
        }
        long al[];
        int i3;
        if (((bao) (obj4)).b() == -1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            l2 = e();
            int i2 = o;
            int k2 = p;
            a(((bao) (obj4)), l2);
            if (i2 != o || k2 != p)
            {
                b(((bao) (obj4)), l2);
            }
        }
        if (!list.isEmpty()) goto _L6; else goto _L5
_L5:
label0:
        {
label1:
            {
                l2 = l1;
                if (!k.c)
                {
                    break label0;
                }
                obj1 = m;
                al = n;
                if (al != null)
                {
                    list = al;
                    if (al.length >= 2)
                    {
                        break label1;
                    }
                }
                list = new long[2];
            }
            list[0] = ((azo) (obj1)).a;
            list[1] = ((azo) (obj1)).b;
            n = list;
            l2 = Math.min(Math.max(l1, n[0]), n[1]);
        }
        i3 = ((bao) (obj4)).a(l2);
        j2 = i3;
        if (j1 == 0) goto _L8; else goto _L7
_L7:
        j1 = Math.min(i3, p);
_L10:
        j2 = j1;
_L8:
        if (!k.c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j2 < o)
        {
            r = new BehindLiveWindowException();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        list = (bak)list.get(azy1.a - 1);
        if (((bak) (list)).i)
        {
            j1 = -1;
        } else
        {
            j1 = ((bak) (list)).h + 1;
        }
        if (true) goto _L10; else goto _L9
_L9:
        if (j2 > p) goto _L4; else goto _L11
_L11:
        if (j2 == -1) goto _L4; else goto _L12
_L12:
        list = b;
        int k1 = d.b;
        bay bay1 = ((ban) (obj3)).a;
        Object obj2 = ((ban) (obj3)).c;
        l1 = ((bao) (obj2)).a(j2);
        l2 = l1 + ((bao) (obj2)).b(j2);
        long l3;
        boolean flag;
        if (!k.c && j2 == ((bao) (obj2)).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = ((bao) (obj2)).c(j2);
        obj2 = new bde(((bax) (obj2)).a(), ((bax) (obj2)).a, ((bax) (obj2)).b, bay1.g());
        l3 = bay1.b * 1000L - bay1.d;
        if (bay1.a.b.equals("text/vtt"))
        {
            if (((ban) (obj3)).e != l3)
            {
                f.setLength(0);
                f.append("EXO-HEADER=OFFSET:").append(l3).append("\n");
                obj3.f = f.toString().getBytes();
                obj3.e = l3;
            }
            list = new bal(list, ((bde) (obj2)), bay1.a, l1, l2, j2, flag, azi.a("text/vtt", -1L), ((ban) (obj3)).f);
        } else
        {
            list = new bac(list, ((bde) (obj2)), k1, bay1.a, l1, l2, j2, flag, l3, ((ban) (obj3)).b, ((ban) (obj3)).d, l);
        }
        q = false;
        azy1.b = list;
        return;
    }

    public final void b()
    {
        r = null;
        bao bao1 = ((ban)j.get(i[0].a)).a.f();
        if (bao1 == null)
        {
            m = new azo(0L, k.b * 1000L);
            return;
        } else
        {
            long l1 = e();
            a(bao1, l1);
            b(bao1, l1);
            return;
        }
    }

    public final void c()
    {
        m = null;
    }

    public final void d()
    {
        if (r != null)
        {
            throw r;
        } else
        {
            return;
        }
    }
}
