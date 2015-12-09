// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dj;

import android.text.TextUtils;
import android.util.SparseArray;
import com.pandora.radio.data.o;
import com.pandora.radio.util.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p.dd.a;
import p.dd.an;

// Referenced classes of package p.dj:
//            b, a

public class c
    implements b
{

    private static final long a;
    private p.cw.c b;
    private SparseArray c;
    private SparseArray d;
    private Map e;
    private Set f;

    public c(p.cw.c c1)
    {
        c = new SparseArray();
        d = new SparseArray();
        e = new TreeMap();
        f = new HashSet();
        b = c1;
        b.b(this);
        c1 = p.dj.b.a.values();
        int j = c1.length;
        for (int i = 0; i < j; i++)
        {
            b(c1[i]);
        }

        c();
    }

    private void b(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Set set;
        long l = b.j().B();
        if (Math.abs(System.currentTimeMillis() - l) > a)
        {
            b.j().c(System.currentTimeMillis());
            b.j().a(null);
        }
        if (!f.contains(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        set = b.j().C();
        Object obj;
        obj = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = new HashSet();
        if (!((Set) (obj)).contains(String.valueOf(i)))
        {
            b.o().a(i, flag);
            ((Set) (obj)).add(String.valueOf(i));
            b.j().a(((Set) (obj)));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(b.a a1)
    {
        if (a1.j > 0 && !TextUtils.isEmpty(a1.k))
        {
            c.put(a1.j, a1.k);
            p.dj.a a2 = (p.dj.a)e.get(Integer.valueOf(a1.j));
            int i;
            if (a2 != null)
            {
                i = a2.b() | 1;
            } else
            {
                i = 1;
            }
            e.put(Integer.valueOf(a1.j), new p.dj.a(a1.j, a1.k, i));
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid test id or name!");
        }
    }

    private void c()
    {
        Iterator iterator = b.j().t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            p.dj.a a1 = (p.dj.a)e.get(Integer.valueOf(i));
            if (a1 != null)
            {
                a1.a(true);
            }
        } while (true);
    }

    private void d()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = e.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.dj.a a1 = (p.dj.a)iterator.next();
            if (a1.f())
            {
                arraylist.add(Integer.valueOf(a1.a()));
            }
        } while (true);
        b.j().a(arraylist);
    }

    public void a()
    {
        b.c(this);
    }

    public void a(int i, boolean flag)
    {
        p.dj.a a1 = (p.dj.a)e.get(Integer.valueOf(i));
        if (a1 != null && a1.f() != flag)
        {
            a1.a(flag);
            if (flag && i == p.dj.b.a.a.j)
            {
                b.o().a(p.dj.b.a.a.j);
            }
            d();
            b.j().e(true);
            b.a(new a(a1));
        }
    }

    public void a(JSONArray jsonarray, JSONArray jsonarray1)
    {
        boolean flag = false;
        if (jsonarray1 != null)
        {
            f.clear();
            for (int i = 0; i < jsonarray1.length(); i++)
            {
                int i1 = jsonarray1.optInt(i);
                if (i1 > 0)
                {
                    f.add(Integer.valueOf(i1));
                }
            }

        }
        if (b.j().u())
        {
            return;
        }
        a(false);
        jsonarray1 = new ArrayList();
        int j = ((flag) ? 1 : 0);
        while (j < jsonarray.length()) 
        {
            Object obj = jsonarray.optJSONObject(j);
            if (obj == null)
            {
                continue;
            }
            int l = ((JSONObject) (obj)).optInt("id");
            obj = ((JSONObject) (obj)).optString("name");
            if (l > 0)
            {
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    p.df.a.c("ABTestManagerImpl", (new StringBuilder()).append("Empty name for test ").append(l).toString());
                }
                d.put(l, obj);
                String s = (String)c.get(l);
                if (s != null)
                {
                    e.put(Integer.valueOf(l), new p.dj.a(l, s, 3));
                    jsonarray1.add(Integer.valueOf(l));
                } else
                {
                    e.put(Integer.valueOf(l), new p.dj.a(l, ((String) (obj)), 2));
                }
            }
            j++;
        }
        b.j().a(jsonarray1);
    }

    public void a(boolean flag)
    {
        int i = 0;
        c.clear();
        d.clear();
        e.clear();
        o o1 = b.j();
        o1.a(null);
        o1.e(false);
        if (flag)
        {
            f.clear();
            o1.c(0L);
            o1.a(null);
        }
        b.a aa[] = p.dj.b.a.values();
        for (int j = aa.length; i < j; i++)
        {
            b(aa[i]);
        }

    }

    public boolean a(b.a a1)
    {
        p.dj.a a2 = (p.dj.a)e.get(Integer.valueOf(a1.j));
        boolean flag;
        if (a2 != null && a2.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(a1.j, flag);
        return flag;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); arraylist.add(new p.dj.a((p.dj.a)iterator.next()))) { }
        return arraylist;
    }

    public void onSignInState(an an1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        p.dj._cls1.a[an1.b.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (a(p.dj.b.a.a))
        {
            b.o().a(p.dj.b.a.a.j);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
