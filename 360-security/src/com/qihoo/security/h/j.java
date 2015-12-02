// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.qihoo.security.h:
//            e

public class j
{

    private static final String f = com/qihoo/security/h/j.getSimpleName();
    public final int a;
    protected final Context b;
    protected final PackageManager c;
    public int d;
    protected final ArrayList e = new ArrayList();
    private final ConcurrentHashMap g = new ConcurrentHashMap();

    public j(int i, Context context)
    {
        d = -1;
        a = i;
        b = context.getApplicationContext();
        c = b.getPackageManager();
    }

    private boolean b(int i, e e1)
    {
        ArrayList arraylist;
        e1 = e1.a;
        arraylist = (ArrayList)g.get(Integer.valueOf(i));
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag = arraylist.remove(e1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
        return false;
    }

    protected void a(int i, e e1)
    {
        ArrayList arraylist;
        if (i == 1000 || i == 1001)
        {
            return;
        }
        arraylist = (ArrayList)g.get(Integer.valueOf(i));
        if (arraylist == null)
        {
            e1 = new ArrayList(1);
            g.put(Integer.valueOf(i), e1);
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!arraylist.contains(e1.a))
        {
            arraylist.add(e1.a);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
    }

    protected final void a(e e1, int i, Bundle bundle)
    {
        if (e1 == null)
        {
            return;
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            b(e1, bundle);
            return;

        case 2: // '\002'
            a(e1, bundle);
            return;

        case 3: // '\003'
            c(e1, bundle);
            break;
        }
    }

    protected void a(e e1, Bundle bundle)
    {
        int i = e1.c();
        if (b(e1.a))
        {
            e1.a(a, true);
            a(i, e1);
        } else
        if (e1.a(a))
        {
            if (a())
            {
                b(i, e1);
                e1.a(a, false);
                return;
            } else
            {
                a(i, e1);
                return;
            }
        }
    }

    protected void a(String s)
    {
        if (s != null && !e.contains(s))
        {
            e.add(s);
        }
    }

    protected boolean a()
    {
        return true;
    }

    protected void b(e e1, Bundle bundle)
    {
        if (e1.a(a))
        {
            a(e1.c(), e1);
        }
    }

    protected boolean b(String s)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (c.checkPermission(s1, s) == 0)
            {
                return true;
            }
        }

        return false;
    }

    protected void c(e e1, Bundle bundle)
    {
        if (e1.a(a))
        {
            b(e1.c(), e1);
        }
    }

}
