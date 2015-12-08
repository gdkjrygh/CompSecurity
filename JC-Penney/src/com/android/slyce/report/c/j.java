// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.slyce.report.c:
//            aa, l, an, k

class j extends aa
{

    private final Handler a = new Handler(Looper.getMainLooper());
    private final Map b = new HashMap();
    private final Set c = new HashSet();

    public j()
    {
    }

    private void a(View view, List list)
    {
        Set set = c;
        set;
        JVM INSTR monitorenter ;
        int i1 = list.size();
        int i = 0;
_L2:
        if (i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        l l1 = new l(view, (an)list.get(i), a);
        c.add(l1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        set;
        JVM INSTR monitorexit ;
        return;
        view;
        set;
        JVM INSTR monitorexit ;
        throw view;
    }

    static void a(j j1)
    {
        j1.d();
    }

    private void c()
    {
        if (Thread.currentThread() == a.getLooper().getThread())
        {
            d();
            return;
        } else
        {
            a.post(new k(this));
            return;
        }
    }

    private void d()
    {
        Iterator iterator = a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            Object obj = activity.getClass().getCanonicalName();
            View view = activity.getWindow().getDecorView().getRootView();
            List list;
            synchronized (b)
            {
                obj = (List)b.get(obj);
                list = (List)b.get(null);
            }
            if (obj != null)
            {
                a(view, ((List) (obj)));
            }
            if (list != null)
            {
                a(view, list);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_121;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Activity activity)
    {
        super.b(activity);
        c();
    }

    public void a(Object obj)
    {
        b((Activity)obj);
    }

    public void a(Map map)
    {
        Set set = c;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((l)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_46;
        map;
        set;
        JVM INSTR monitorexit ;
        throw map;
        c.clear();
        set;
        JVM INSTR monitorexit ;
        synchronized (b)
        {
            b.clear();
            b.putAll(map);
        }
        c();
        return;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void b(Activity activity)
    {
        super.a(activity);
    }

    public void b(Object obj)
    {
        a((Activity)obj);
    }
}
