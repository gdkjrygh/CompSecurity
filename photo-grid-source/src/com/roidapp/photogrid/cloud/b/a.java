// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.e.b;
import com.roidapp.photogrid.MainPage;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;

// Referenced classes of package com.roidapp.photogrid.cloud.b:
//            b, c, d, e, 
//            f

public final class a
    implements b, Observer
{

    private static boolean c = true;
    private static final LinkedList g = new LinkedList();
    private boolean a;
    private volatile boolean b;
    private MainPage d;
    private e e;
    private d f;
    private final f h = new com.roidapp.photogrid.cloud.b.b(this);

    public a(MainPage mainpage)
    {
        d = mainpage;
    }

    static boolean a(a a1)
    {
        return a1.b;
    }

    private boolean a(d d1, String s)
    {
        if (b || d == null || d.h())
        {
            return false;
        } else
        {
            c c1 = new c();
            com.roidapp.photogrid.cloud.b.c.a(c1, h);
            com.roidapp.photogrid.cloud.b.c.a(c1, d1, s);
            c1.show(d.getSupportFragmentManager(), "PushDialogFragment");
            aj.a().getSharedPreferences("cloud_push_dialog", 0).edit().putBoolean(String.valueOf(d1.a), true).apply();
            return true;
        }
    }

    private boolean a(List list)
    {
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = flag3;
        if (list == null) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        list = list.iterator();
_L5:
        d d1;
        Object obj;
        int i;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = (d)list.next();
        if (d1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = aj.a();
        if (((Context) (obj)).getSharedPreferences("cloud_push_dialog", 0).getBoolean(String.valueOf(d1.a), false))
        {
            flag2 = false;
        } else
        {
label0:
            {
                i = n.c(((Context) (obj)));
                long l = System.currentTimeMillis() / 1000L;
                obj = Locale.getDefault().getCountry();
                boolean flag;
                if (l >= d1.c && l <= d1.d)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
                flag2 = false;
            }
        }
_L6:
        if (flag2 && !g.contains(d1))
        {
            g.addLast(d1);
        }
        if (true) goto _L5; else goto _L4
        boolean flag1;
        if (d1.b == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        Iterator iterator = d1.b.iterator();
        x x1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_346;
            }
            x1 = (x)iterator.next();
        } while (i < ((Integer)x1.a).intValue() || i > ((Integer)x1.b).intValue());
        flag1 = true;
_L7:
        if (!flag1)
        {
            flag2 = false;
        } else
        if (d1.j != null)
        {
            if (!d1.j.contains(obj))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        } else
        if (d1.k != null)
        {
            flag2 = d1.k.contains(obj);
        } else
        if (d1.j == null && d1.k == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
          goto _L6
_L4:
        flag2 = c();
_L2:
        return flag2;
        flag1 = false;
          goto _L7
    }

    static MainPage b(a a1)
    {
        return a1.d;
    }

    private boolean c()
    {
        if (a)
        {
            return false;
        }
        do
        {
            if (f != null)
            {
                break;
            }
            f = (d)g.pollFirst();
        } while (f == null && !g.isEmpty());
        if (f != null)
        {
            a = true;
            Object obj = f;
            String s = (new StringBuilder()).append(com.roidapp.baselib.d.a.a(d).getAbsolutePath()).append(File.separator).append(com.roidapp.baselib.d.a.b(((d) (obj)).g)).toString();
            if (com.roidapp.baselib.d.a.a(s, false))
            {
                a(((d) (obj)), s);
            } else
            {
                obj = new com.roidapp.baselib.e.a(((d) (obj)).g, s, this);
                t.a().submit(((Runnable) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final void a()
    {
        b = true;
        d = null;
        if (e != null)
        {
            e.deleteObservers();
        }
    }

    public final void a(int i)
    {
    }

    public final void a(int i, Exception exception)
    {
    }

    public final volatile void a(Object obj)
    {
        obj = (String)obj;
        a(f, ((String) (obj)));
    }

    public final boolean b()
    {
        if (c)
        {
            c = false;
            e = new e(aj.a());
            boolean flag = a(e.a());
            e.a(this);
            return flag;
        } else
        {
            return c();
        }
    }

    public final void update(Observable observable, Object obj)
    {
        if (!b && (obj instanceof List))
        {
            a((List)obj);
        }
    }

}
