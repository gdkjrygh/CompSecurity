// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cn;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.y;
import com.pandora.radio.util.b;
import com.pandora.radio.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p.bz.w;
import p.cm.o;
import p.cw.c;
import p.dd.at;
import p.dd.bh;

// Referenced classes of package p.cn:
//            d, c, a

public class e extends b
{

    private static e d = new e();
    private final d a = new d(50);
    private String b;
    private boolean c;
    private Map e;
    private final String f = UUID.randomUUID().toString();

    private e()
    {
        c = false;
        com.pandora.android.provider.b.a.e().c(this);
        com.pandora.android.provider.b.a.b().b(this);
        e = new HashMap(3);
        c();
    }

    static Map a(e e1)
    {
        return e1.e;
    }

    public static e a()
    {
        return d;
    }

    private void a(bh bh1)
    {
        bh1 = bh1.b;
        if (bh1 != null)
        {
            c = a(((aa) (bh1)));
            if (!c)
            {
                a.a(bh1);
                c(bh1);
                return;
            }
        }
    }

    static String b(e e1)
    {
        return e1.b;
    }

    static d c(e e1)
    {
        return e1.a;
    }

    private void c(aa aa1)
    {
        d d1 = e(aa1.r());
        if (d1 != null && d1.b(aa1))
        {
            d1.a(aa1);
        }
    }

    private d e(String s)
    {
        return (d)e.get(s);
    }

    public aa a(int j)
    {
        return a.a(j);
    }

    public aa a(String s, int j)
    {
        s = e(s);
        if (s == null)
        {
            throw new IllegalArgumentException("SessionHistory hasn't load this stationId, please call loadFromSessionHistory before calling this method again.");
        } else
        {
            return s.a(j);
        }
    }

    public void a(String s)
    {
        if (!s.equals(b) && e(s) != null)
        {
            e.remove(s);
        }
    }

    public boolean a(aa aa1)
    {
        return aa1 != null && (i.a(aa1.w()) || aa1.l() == ac.b || aa1.k());
    }

    public int b(String s)
    {
        s = e(s);
        if (s == null)
        {
            return 0;
        } else
        {
            return s.a();
        }
    }

    public String b(String s, int j)
    {
        return a.a(s, j);
    }

    public void b()
    {
        p.cn.c.a().b(f);
    }

    public boolean b(aa aa1)
    {
        aa aa2;
        if (aa1 != null)
        {
            if ((aa2 = a.a(a.d())) != null && aa2.w().equals(aa1.w()))
            {
                return true;
            }
        }
        return false;
    }

    public int c(String s)
    {
        return a.a(s);
    }

    public void c()
    {
        (new a()).execute(new Object[] {
            f, a.b().toArray(new d.a[0])
        });
        a.c();
        com.pandora.android.provider.b.a.e().a(new w());
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public int d()
    {
        return a.a();
    }

    public void d(String s)
    {
        (new o(s) {

            final String a;
            final e b;

            public void a(aa aaa[])
            {
                d d1 = new d(50);
                e.a(b).put(a, d1);
                int k = aaa.length;
                for (int j = 0; j < k; j++)
                {
                    d1.a(aaa[j]);
                }

                if (a.equals(p.cn.e.b(b)))
                {
                    d1.a(p.cn.e.c(b));
                }
                com.pandora.android.provider.b.a.e().a(new p.bz.o(a));
            }

            public void onPostExecute(Object obj)
            {
                a((aa[])obj);
            }

            
            {
                b = e.this;
                a = s;
                super();
            }
        }).execute(new String[] {
            s
        });
    }

    public String e()
    {
        return a.e();
    }

    public void onStationData(at at1)
    {
        if (at1.a != null)
        {
            b = at1.a.h();
        }
    }

    public void onTrackState(bh bh1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 5: // '\005'
            a(bh1);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

}
