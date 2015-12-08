// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.content.Context;
import com.roidapp.videolib.gl.e;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.h;
import jp.co.cyberagent.android.a.k;
import jp.co.cyberagent.android.a.r;
import jp.co.cyberagent.android.a.s;

// Referenced classes of package com.roidapp.videolib.b:
//            c, u, l, x, 
//            k

public final class f extends c
{

    public static final u x;
    protected x A[] = {
        new x(3, 6599L, 7066L, 0.5F, 0.5F), new x(6599L, 7066L, 9F, 9F, -0.02F, 0.514F), new x(4, 6599L, 7066L, -0.02F, -1.288F), new x(5, 6599L, 7066L, 0.1F, 0.1F), new x(3, 7066L, 7133L, 0.5F, 0.5F), new x(7066L, 7133L, 9F, 9F, -0.02F, 0.514F), new x(4, 7066L, 7133L, -1.288F, -1.288F), new x(5, 7066L, 7133L, 0.1F, 0.1F), new x(3, 7133L, 7599L, 0.5F, 0.5F), new x(7133L, 7599L, 9F, 9F, -0.02F, 0.514F), 
        new x(4, 7133L, 7599L, -1.288F, -1.288F), new x(5, 7133L, 7599L, 0.104F, 0.104F), new x(3, 7599L, 7733L, 0.5F, 0.6F), new x(7599L, 7733L, 9F, 9F, -0.02F, 0.514F), new x(4, 7599L, 7733L, -1.288F, -1.288F), new x(5, 7599L, 7733L, 0.104F, 0.104F), new x(3, 7599L, 9200L, 0.6F, 0.6F), new x(7599L, 9200L, 9F, 9F, -0.02F, 0.514F), new x(4, 7599L, 9200L, -1.288F, -1.344F), new x(5, 7599L, 9200L, 0.104F, 0.104F), 
        new x(3, 9200L, 10020L, 0.6F, 0.5F), new x(9200L, 10020L, 9F, 9F, -0.02F, 0.514F), new x(4, 9200L, 10020L, -1.344F, -1.344F), new x(5, 9200L, 10020L, 0.104F, 0.1F), new x(3, 10020L, 10130L, 0.5F, 0.5F), new x(10020L, 10130L, 9F, 9F, -0.02F, 0.514F), new x(4, 10020L, 10130L, -1.344F, -1.344F), new x(5, 10020L, 10130L, 0.1F, 0.1F), new x(3, 10130L, 10150L, 0.5F, 0.5F), new x(10130L, 10150L, 9F, 9F, -0.02F, 0.514F), 
        new x(4, 10130L, 10150L, -1.344F, -1.344F), new x(5, 10130L, 10150L, 0.1F, 0.1F), new x(10150L, 11040L, 9F, 9F, -0.02F, 0.514F), new x(3, 10150L, 11040L, 0.5F, 0.5F), new x(4, 10150L, 11040L, -1.344F, -1.852F), new x(5, 10150L, 11040L, 0.1F, 0.1F)
    };
    private s B;
    private com.roidapp.videolib.b.k C;
    private long D[] = {
        0L, 3090L, 6190L
    };
    protected r y;
    protected x z[] = {
        new x(3, 3210L, 3713L, 0.5F, 0.5F), new x(3210L, 3713L, 9F, 9F, -0.02F, 0.5F), new x(4, 3210L, 3713L, 1.052F, -0.02F), new x(5, 3210L, 3713L, 0.1F, 0.1F), new x(3, 3713L, 3723L, 0.5F, 0.5F), new x(3713L, 3723L, 9F, 5F, -0.02F, 0.5F), new x(4, 3713L, 3723L, -0.02F, -0.02F), new x(5, 3713L, 3723L, 0.1F, 0.1F), new x(3, 3723L, 4133L, 0.5F, 0.5F), new x(3723L, 4133L, 5F, 5F, -0.02F, 0.5F), 
        new x(4, 3723L, 4133L, -0.02F, -0.02F), new x(5, 3723L, 4133L, 0.1F, 0.1F), new x(3, 4133L, 4533L, 0.5F, 0.6F), new x(4133L, 4533L, 5F, 5F, -0.02F, 0.5F), new x(4, 4133L, 4533L, -0.02F, -0.02F), new x(5, 4133L, 4533L, 0.1F, 0.1F), new x(3, 4533L, 6199L, 0.6F, 0.6F), new x(4533L, 6199L, 5F, 5F, -0.02F, 0.5F), new x(4, 4533L, 6199L, -0.02F, -0.02F), new x(5, 4533L, 6199L, 0.1F, 0.1F), 
        new x(3, 6199L, 6569L, 0.6F, 0.5F), new x(6199L, 6569L, 5F, 5F, -0.02F, 0.5F), new x(4, 6199L, 6569L, -0.02F, -0.02F), new x(5, 6199L, 6569L, 0.1F, 0.1F), new x(3, 6569L, 6589L, 0.5F, 0.5F), new x(6569L, 6589L, 5F, 9F, 0.01F, 0.382F), new x(4, 6569L, 6589L, -0.02F, -0.02F), new x(5, 6569L, 6589L, 0.1F, 0.1F), new x(3, 6589L, 6599L, 0.5F, 0.5F), new x(6569L, 6599L, 5F, 9F, 0.01F, 0.382F), 
        new x(4, 6589L, 6599L, -0.02F, -0.02F), new x(5, 6589L, 6599L, 0.1F, 0.1F), new x(3, 6599L, 7066L, 0.5F, 0.5F), new x(6599L, 7066L, 1.0F, 1.0F, 0.01F, 0.382F), new x(4, 6599L, 7066L, 1.28F, -0.015F), new x(5, 6599L, 7066L, 0.07F, 0.07F), new x(3, 7066L, 7186L, 0.5F, 0.5F), new x(7066L, 7186L, 1.0F, -5F, 0.01F, 0.382F), new x(4, 7066L, 7186L, -0.015F, -0.018F), new x(5, 7066L, 7186L, 0.07F, 0.07F), 
        new x(3, 7186L, 7599L, 0.5F, 0.5F), new x(7186L, 7599L, -5F, -5F, 1.716F, 0.48F), new x(4, 7186L, 7599L, -0.018F, -0.018F), new x(5, 7186L, 7599L, 0.07F, 0.07F), new x(3, 7599L, 7999L, 0.5F, 0.6F), new x(7599L, 7999L, -5F, -5F, 0.01F, 0.382F), new x(4, 7599L, 7999L, -0.018F, -0.018F), new x(5, 7599L, 7999L, 0.07F, 0.132F), new x(3, 7999L, 9666L, 0.6F, 0.6F), new x(7999L, 9666L, -5F, -5F, 0.01F, 0.382F), 
        new x(4, 7999L, 9666L, -0.018F, -0.018F), new x(5, 7999L, 9666L, 0.132F, 0.132F), new x(3, 9666L, 10066L, 0.6F, 0.5F), new x(9666L, 10066L, -5F, -5F, 0.01F, 0.382F), new x(4, 9666L, 10066L, -0.018F, -0.018F), new x(5, 9666L, 10066L, 0.132F, 0.09F), new x(3, 10066L, 10399L, 0.5F, 0.5F), new x(10066L, 10399L, -5F, -5F, 0.01F, 0.382F), new x(4, 10066L, 10399L, -0.018F, -0.018F), new x(5, 10066L, 10399L, 0.09F, 0.09F), 
        new x(3, 10399L, 10466L, 0.5F, 0.5F), new x(10399L, 10466L, -5F, 1.0F, 0.01F, 0.382F), new x(4, 10399L, 10466L, -0.018F, -0.018F), new x(5, 10399L, 10466L, 0.09F, 0.09F), new x(3, 10466L, 11133L, 0.5F, 0.5F), new x(10466L, 11133L, 1.0F, 1.0F, 0.01F, 0.382F), new x(4, 10466L, 11133L, -0.018F, -1.264F), new x(5, 10466L, 11133L, 0.09F, 0.09F), new x(3, 11133L, 11199L, 0.5F, 0.5F), new x(11133L, 11199L, 1.0F, -5F, 0.01F, 0.382F), 
        new x(4, 11133L, 11199L, -1.26F, -1.26F), new x(5, 11133L, 11199L, 0.098F, 0.098F), new x(3, 11199L, 11266L, 0.5F, 0.5F), new x(11199L, 11266L, 1.0F, -5F, 0.01F, 0.382F), new x(4, 11199L, 11266L, -1.26F, -1.26F), new x(5, 11199L, 11266L, 0.098F, 0.098F), new x(3, 11266L, 11733L, 0.5F, 0.6F), new x(11266L, 11733L, -5F, -5F, 0.01F, 0.382F), new x(4, 11266L, 11733L, -1.26F, -1.7F), new x(5, 11266L, 11733L, 0.098F, 0.136F)
    };

    public f(Context context)
    {
        super(context);
        y = null;
        z = null;
        A = null;
        C = null;
        B = new s();
        w = (new l[] {
            new l(0, 0L, 7000L), new l(1, 7000L, 11100L), new l(2, 11100L, 20000L)
        });
        q = (new l[] {
            new l(0, 2250L, 3210L), new l(1, 3210L, 6599L), new l(2, 6599L, 20000L)
        });
        p = (new x[] {
            new x(3, 2400L, 3200L, 0.5F, 0.5F), new x(2400L, 3200L, 5.1F, 5.1F, -0.018F, 0.6F), new x(4, 2400L, 3200L, 1.5F, 1.2F), new x(5, 2400L, 3200L, 0.13F, 0.1F), new x(3, 3200L, 3210L, 0.5F, 0.5F), new x(3200L, 3210L, 5.1F, 9F, -0.018F, 0.6F), new x(4, 3200L, 3210L, 1.2F, 1.052F), new x(5, 3200L, 3210L, 0.1F, 0.1F), new x(3, 3210L, 3723L, 0.5F, 0.5F), new x(3210L, 3723L, 1.0F, 1.0F, 0.01F, 0.382F), 
            new x(4, 3210L, 3723L, 1.358F, 1.276F), new x(5, 3210L, 3723L, 0.1F, 0.1F), new x(3, 3723L, 3733L, 0.5F, 0.5F), new x(3723L, 3733L, 1.0F, -5F, 0.01F, 0.382F), new x(4, 3723L, 3733L, 1.276F, 1.276F), new x(5, 3723L, 3733L, 0.1F, 0.1F), new x(3, 3733L, 4133L, 0.5F, 0.5F), new x(3733L, 4133L, -5F, -5F, 0.01F, 0.382F), new x(4, 3733L, 4133L, 1.276F, 1.276F), new x(5, 3733L, 4133L, 0.1F, 0.1F), 
            new x(3, 4133L, 4400L, 0.5F, 0.6F), new x(4133L, 4400L, -5F, -5F, 0.01F, 0.382F), new x(4, 4133L, 4400L, 1.276F, 1.6F), new x(5, 4133L, 4400L, 0.1F, 0.13F), new x(3, 6333L, 6533L, 0.6F, 0.5F), new x(6333L, 6533L, -5F, -5F, 0.01F, 0.382F), new x(4, 6333L, 6533L, 1.6F, 1.276F), new x(5, 6333L, 6533L, 0.13F, 0.1F), new x(3, 6533L, 6599L, 0.5F, 0.5F), new x(6533L, 6599L, -5F, 1.0F, 0.01F, 0.382F), 
            new x(4, 6533L, 6599L, 1.276F, 1.276F), new x(5, 6533L, 6599L, 0.1F, 0.1F), new x(3, 6883L, 7113L, 0.5F, 0.5F), new x(6883L, 7113L, 9F, 9F, 1.6F, 0.48F), new x(4, 6883L, 7113L, 1.708F, 1.304F), new x(5, 6883L, 7113L, 0.114F, 0.114F), new x(3, 7113L, 7133L, 0.5F, 0.5F), new x(7113L, 7133L, 9F, 7F, -0.034F, 0.376F), new x(4, 7113L, 7133L, 1.304F, 1.304F), new x(5, 7113L, 7133L, 0.114F, 0.114F), 
            new x(3, 7133L, 7599L, 0.5F, 0.5F), new x(7133L, 7599L, 7F, 7F, -0.034F, 0.376F), new x(4, 7133L, 7599L, 1.304F, 1.304F), new x(5, 7133L, 7599L, 0.114F, 0.114F), new x(3, 7599L, 7799L, 0.5F, 0.6F), new x(7599L, 7799L, 7F, 7F, -0.034F, 0.376F), new x(4, 7599L, 7799L, 1.304F, 1.6F), new x(5, 7599L, 7799L, 0.114F, 0.114F), new x(3, 7799L, 9799L, 0.6F, 0.6F), new x(7799L, 9799L, 7F, 7F, -0.034F, 0.376F), 
            new x(4, 7799L, 9799L, 1.6F, 1.6F), new x(5, 7799L, 9799L, 0.114F, 0.114F), new x(3, 9799L, 10066L, 0.6F, 0.5F), new x(9799L, 10066L, 7F, 7F, -0.034F, 0.376F), new x(4, 9799L, 10066L, 1.6F, 1.18F), new x(5, 9799L, 10066L, 0.114F, 0.114F), new x(3, 10066L, 10399L, 0.5F, 0.5F), new x(10066L, 10399L, 7F, 7F, -0.034F, 0.376F), new x(4, 10066L, 10399L, 1.18F, 1.18F), new x(5, 10066L, 10399L, 0.114F, 0.114F), 
            new x(3, 10399L, 10419L, 0.5F, 0.5F), new x(10399L, 10419L, 9F, 9F, -0.034F, 0.376F), new x(4, 10399L, 10419L, 1.18F, 1.18F), new x(5, 10399L, 10419L, 0.114F, 0.114F), new x(3, 10419L, 11169L, 0.5F, 0.5F), new x(10419L, 11169L, 9F, 9F, -0.034F, 0.376F), new x(4, 10419L, 11169L, 1.18F, 0.02F), new x(5, 10419L, 11169L, 0.114F, 0.114F), new x(3, 11169L, 11189L, 0.5F, 0.5F), new x(11169L, 11189L, 9F, 7F, -0.034F, 0.376F), 
            new x(4, 11169L, 11189L, 0.02F, 0.02F), new x(5, 11169L, 11189L, 0.114F, 0.114F), new x(3, 11189L, 11266L, 0.5F, 0.5F), new x(11189L, 11266L, 7F, 7F, -0.034F, 0.376F), new x(4, 11189L, 11266L, 0.02F, 0.02F), new x(5, 11189L, 11266L, 0.114F, 0.114F), new x(3, 11266L, 11733L, 0.5F, 0.6F), new x(11266L, 11733L, 7F, 7F, -0.034F, 0.376F), new x(4, 11266L, 11733L, 0.02F, 0.02F), new x(5, 11266L, 11733L, 0.114F, 0.114F), 
            new x(3, 11733L, 13290L, 0.6F, 0.6F), new x(11733L, 13290L, 7F, 7F, -0.034F, 0.376F), new x(4, 11733L, 13290L, 0.02F, 0.02F), new x(5, 11733L, 13290L, 0.114F, 0.114F), new x(3, 13290L, 14300L, 0.6F, 0.68F), new x(13290L, 14300L, 7F, 0.0F, -0.034F, 0.376F), new x(4, 13290L, 14300L, 0.02F, 0.0F), new x(5, 13290L, 14300L, 0.114F, 0.114F), new x(3, 14300L, 20000L, 0.68F, 0.68F), new x(14300L, 20000L, 0.0F, 0.0F, -0.034F, 0.376F), 
            new x(4, 14300L, 20000L, 0.0F, 0.0F), new x(5, 14300L, 20000L, 0.114F, 0.114F)
        });
    }

    public final h a(long l1)
    {
        if (l1 < 3210L) goto _L2; else goto _L1
_L1:
        if (l1 >= 3600L) goto _L4; else goto _L3
_L3:
        l = (List)a.get(3);
_L6:
        f.size();
        k.a(l);
        if (s != null)
        {
            s.a(l1);
        }
        if (C != null)
        {
            C.a(l1);
        }
        if (r != null)
        {
            r.a(l1);
        }
        if (t != null)
        {
            t.a(l1);
        }
        return k;
_L4:
        if (l1 < 4400L)
        {
            l = (List)a.get(1);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 6333L)
        {
            l = (List)a.get(3);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 6599L)
        {
            l = (List)a.get(1);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 6999L)
        {
            l = (List)a.get(4);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 7866L)
        {
            l = (List)a.get(2);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 9866L)
        {
            l = (List)a.get(3);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 10666L)
        {
            l = (List)a.get(2);
            continue; /* Loop/switch isn't completed */
        }
        if (l1 < 11533L)
        {
            l = (List)a.get(1);
            continue; /* Loop/switch isn't completed */
        }
_L2:
        l = (List)a.get(0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a()
    {
        ArrayList arraylist = new ArrayList();
        if (h != null)
        {
            arraylist.add(h);
        }
        arraylist.add(B);
        ArrayList arraylist1 = new ArrayList();
        if (e.size() > 0)
        {
            arraylist1.add(e.get(0));
        }
        if (h != null)
        {
            arraylist1.add(h);
        }
        arraylist1.add(B);
        ArrayList arraylist2 = new ArrayList();
        if (e.size() > 0)
        {
            arraylist2.add(e.get(0));
        }
        if (e.size() > 1)
        {
            arraylist2.add(e.get(1));
        }
        if (h != null)
        {
            arraylist2.add(h);
        }
        arraylist2.add(B);
        ArrayList arraylist3 = new ArrayList();
        if (e.size() > 0)
        {
            arraylist3.add(e.get(0));
        }
        arraylist3.add(B);
        ArrayList arraylist4 = new ArrayList();
        if (e.size() > 0)
        {
            arraylist4.add(e.get(0));
        }
        if (e.size() > 1)
        {
            arraylist4.add(e.get(1));
        }
        arraylist4.add(B);
        a.add(arraylist);
        a.add(arraylist1);
        a.add(arraylist2);
        a.add(arraylist3);
        a.add(arraylist4);
    }

    public final void a(e e1)
    {
        super.a(e1);
        if (B != null)
        {
            B.a(o);
        }
    }

    protected final void b()
    {
        c.clear();
        c.add(B);
    }

    protected final void c()
    {
        b.clear();
        if (e.size() > 0)
        {
            b.addAll(e);
        }
        if (h != null)
        {
            b.add(h);
        }
        b.add(B);
        if (j != null)
        {
            b.add(j);
        }
    }

    protected final void d()
    {
        if (f.size() > 0)
        {
            c.removeAll(f);
            c.addAll(f);
            b.removeAll(f);
            b.addAll(f);
            for (int i = 0; i < a.size(); i++)
            {
                boolean flag = ((List)a.get(i)).remove(j);
                boolean flag1 = ((List)a.get(i)).remove(B);
                ((List)a.get(i)).removeAll(f);
                ((List)a.get(i)).addAll(f);
                if (flag1)
                {
                    ((List)a.get(i)).add(B);
                }
                if (flag)
                {
                    ((List)a.get(i)).add(j);
                }
            }

        }
    }

    public final void e()
    {
        super.e();
        f();
    }

    protected final void f()
    {
        if (r == null)
        {
            if (r == null)
            {
                r = new com.roidapp.videolib.b.k();
            }
            if (s == null)
            {
                s = new com.roidapp.videolib.b.k();
            }
            if (C == null)
            {
                C = new com.roidapp.videolib.b.k();
            }
            r.a();
            C.a();
            s.a();
            for (int i = 0; i < p.length; i++)
            {
                r.a(p[i]);
            }

            for (int j = 0; j < z.length; j++)
            {
                s.a(z[j]);
            }

            for (int i1 = 0; i1 < A.length; i1++)
            {
                C.a(A[i1]);
            }

            if (h != null)
            {
                r.a(h);
            }
            if (e.size() > 0)
            {
                s.a((h)e.get(0));
            }
            if (e.size() > 1)
            {
                C.a((h)e.get(1));
                return;
            }
        }
    }

    public final int g()
    {
        return 2;
    }

    public final void h()
    {
        b.clear();
        a.clear();
        if (k != null)
        {
            k.a(c);
            k.i();
        }
        c.clear();
        k = null;
        if (C != null)
        {
            C.a();
        }
        if (s != null)
        {
            s.a();
        }
        if (r != null)
        {
            r.a();
        }
        if (t != null)
        {
            t.a();
        }
        s = null;
        t = null;
        r = null;
        h = null;
        e.clear();
        j = null;
        i = null;
        B = null;
        o = null;
        super.h();
    }

    static 
    {
        x = u.c;
    }
}
