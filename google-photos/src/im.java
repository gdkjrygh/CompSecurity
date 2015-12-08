// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class im
    implements aji, dhf, ds, dwg, iz, jyk, kuf, luj, sb
{

    public final Toolbar a;
    public final Drawable b;
    public final CharSequence c;
    public ahs d;
    public int e;
    public Set f;
    public Comparator g;
    public final dzl h;
    public final dum i;
    public final dzy j;
    public final am k;
    public volatile Object l;
    public int m;
    private Object n;

    public im()
    {
        e = 0;
        f = new HashSet();
        g = new aja(this);
    }

    public static boolean a(List list, ahn ahn1)
    {
        ahn1 = ahn1.mConnectedInputPortArray;
        int j1 = ahn1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj = ((ajo) (ahn1[i1])).h;
            if (obj == null)
            {
                continue;
            }
            obj = ((aju) (obj)).a;
            if (obj != null && !list.contains(obj))
            {
                return false;
            }
        }

        return true;
    }

    public int a(Object obj, Object obj1)
    {
        return 1;
    }

    public void a(int i1)
    {
        if (i1 == 0)
        {
            a.c(c);
            return;
        } else
        {
            a.b(i1);
            return;
        }
    }

    public void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2)
    {
        throw new NullPointerException();
    }

    public void a(ahs ahs1)
    {
        ahs ahs2 = d;
        d = ahs1.j();
        if (ahs2 != null)
        {
            ahs2.i();
        }
    }

    public void a(Context context)
    {
        j.a.a(nup.q, h.g, i.c);
    }

    public void a(Drawable drawable, int i1)
    {
        a.b(drawable);
        a(i1);
    }

    public void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public void a(View view)
    {
        if (((ojb)view.getLayoutParams()).b == -1)
        {
            return;
        } else
        {
            throw new NullPointerException();
        }
    }

    public void a(Object obj, krr krr1)
    {
        b(obj, krr1);
    }

    public void a(kah kah)
    {
        b.f(kah, "Notifier must not be null");
        throw new NullPointerException();
    }

    public void a(kxu kxu, Map map)
    {
        "1".equals(map.get("transparentBackground"));
    }

    public void a(ahn aahn[], ajh ajh1)
    {
        int i1;
        long l1;
        l1 = aiw.o();
        i1 = 0;
_L5:
        if (i1 >= aahn.length) goto _L2; else goto _L1
_L1:
        ahn ahn1;
        ahn1 = aahn[e];
        e = (e + 1) % aahn.length;
        if (!ahn1.mIsSleeping.get()) goto _L4; else goto _L3
_L3:
        l1 = aiw.n();
_L7:
        i1++;
          goto _L5
_L4:
        if (!ahn1.k()) goto _L7; else goto _L6
_L6:
        l1 = 0L;
        aahn = ahn1;
_L9:
        ajh1.a = aahn;
        ajh1.b = l1;
        return;
_L2:
        aahn = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(String s, Intent intent)
    {
        Object obj = null;
        if (s == null || intent == null)
        {
            return false;
        }
        jqc.j();
        String s1;
        if (intent == null)
        {
            s1 = null;
        } else
        {
            s1 = intent.getStringExtra("INAPP_PURCHASE_DATA");
        }
        jqc.j();
        if (intent == null)
        {
            intent = obj;
        } else
        {
            intent = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        }
        if (s1 == null || intent == null)
        {
            return false;
        }
        jqc.j();
        if (!s.equals(jpo.a(s1)))
        {
            b.m("Developer payload not match.");
            return false;
        } else
        {
            return true;
        }
    }

    public boolean a(ktm ktm)
    {
        throw new NullPointerException();
    }

    public ahn[] a(ahn aahn[])
    {
        e = 0;
        if (f.contains(aahn))
        {
            return aahn;
        } else
        {
            aahn = b(aahn);
            f.add(aahn);
            return aahn;
        }
    }

    public int a_(Object obj)
    {
        return b(obj);
    }

    public int b(Object obj)
    {
        throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(0).toString());
    }

    public View b(int i1)
    {
        if (i1 == -1)
        {
            return null;
        } else
        {
            throw new NullPointerException();
        }
    }

    public final Object b()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return null;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (n == null)
        {
            n = new CancellationSignal();
        }
        obj = n;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(MenuItem menuitem)
    {
        (new gqu()).a(k.h(), "debug_media");
    }

    public void b(Object obj, krr krr1)
    {
        try
        {
            krr1.c(0);
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(0).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
    }

    public void b(kah kah)
    {
        kah = ((kah) (l));
    }

    public ahn[] b(ahn aahn[])
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(aahn));
        aahn = new ArrayList(aahn.length);
        ArrayList arraylist1;
        for (; arraylist.size() > 0; aahn.addAll(arraylist1))
        {
            arraylist1 = new ArrayList();
            int i1 = arraylist.size();
            for (int j1 = 0; j1 < i1; j1++)
            {
                ahn ahn1 = (ahn)arraylist.get(j1);
                if (a(aahn, ahn1))
                {
                    arraylist1.add(ahn1);
                    arraylist.remove(j1);
                    i1--;
                }
            }

            Collections.sort(arraylist1, g);
        }

        return (ahn[])aahn.toArray(new ahn[aahn.size()]);
    }

    public Drawable c()
    {
        return b;
    }

    public Context d()
    {
        return a.getContext();
    }

    public boolean e()
    {
        return true;
    }

    public ahs h()
    {
        ahs ahs1 = d.j();
        i_();
        return ahs1;
    }

    public boolean h_()
    {
        return d != null;
    }

    public void i()
    {
        f.clear();
    }

    public void i_()
    {
        if (d != null)
        {
            d.i();
            d = null;
        }
    }

    public jnr j()
    {
        return null;
    }

    public boolean k()
    {
        return false;
    }

    public Set l()
    {
        return null;
    }

    public void m()
    {
        l = null;
    }

    public boolean n()
    {
        throw new NullPointerException();
    }

    public int o()
    {
        throw new NullPointerException();
    }

    public boolean p()
    {
        throw new NullPointerException();
    }

    public void q()
    {
        throw new NullPointerException();
    }
}
