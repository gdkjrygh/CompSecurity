// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import android.text.TextUtils;
import com.qihoo360.mobilesafe.assist.SysclearAsyncTask19;
import com.qihoo360.mobilesafe.core.b.b;
import com.qihoo360.mobilesafe.core.b.d;
import com.qihoo360.mobilesafe.core.b.e;
import com.qihoo360.mobilesafe.core.d.c;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            b

class h extends SysclearAsyncTask19
{

    boolean c;
    List d;
    List e;
    List f;
    final com.qihoo360.mobilesafe.core.b g;
    private d h;

    protected volatile transient Object a(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected transient Void a(Void avoid[])
    {
        g.();
        c(new Integer[] {
            Integer.valueOf(0)
        });
        List list = com.qihoo360.mobilesafe.core.d.c.a(com.qihoo360.mobilesafe.core.b.a(g), b(g), com.qihoo360.mobilesafe.core.b.c(g));
        avoid = (List)list.get(0);
        List list1 = (List)list.get(1);
        ArrayList arraylist = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.b.a(g)).a();
        if (avoid != null && !avoid.isEmpty())
        {
            List list2 = d(g).a(avoid, com.qihoo360.mobilesafe.core.b.a(g));
            Object obj;
            if (list2 != null && list2.size() == 4)
            {
                avoid = (List)list2.get(0);
                com.qihoo360.mobilesafe.core.b.a(g, e, (List)list2.get(1));
                obj = (List)list2.get(2);
                com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.b.a(g)).a((List)list2.get(3));
            } else
            {
                obj = null;
                avoid = null;
            }
            obj = e(g).b(((List) (obj)));
            if (obj != null && ((List) (obj)).size() == 3)
            {
                com.qihoo360.mobilesafe.core.b.a(g, d, (List)((List) (obj)).get(0));
                com.qihoo360.mobilesafe.core.b.a(g, e, (List)((List) (obj)).get(1));
                com.qihoo360.mobilesafe.core.b.a(g, arraylist, (List)((List) (obj)).get(2));
            }
            avoid = e(g).a(avoid);
            if (avoid != null && avoid.size() == 3)
            {
                com.qihoo360.mobilesafe.core.b.a(g, d, (List)avoid.get(0));
                com.qihoo360.mobilesafe.core.b.a(g, e, (List)avoid.get(1));
                com.qihoo360.mobilesafe.core.b.a(g, arraylist, (List)avoid.get(2));
            }
            avoid = d(g).b(arraylist, com.qihoo360.mobilesafe.core.b.a(g));
            if (avoid != null && avoid.size() == 2)
            {
                com.qihoo360.mobilesafe.core.b.a(g, e, (List)avoid.get(0));
                com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.b.a(g)).a((List)avoid.get(1));
            }
        }
        if (d == null || d.isEmpty()) goto _L2; else goto _L1
_L1:
        avoid = d.iterator();
_L9:
        if (avoid.hasNext()) goto _L3; else goto _L2
_L2:
        if (e == null || e.isEmpty()) goto _L5; else goto _L4
_L4:
        avoid = e.iterator();
_L10:
        if (avoid.hasNext()) goto _L6; else goto _L5
_L5:
        f.addAll(com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.b.a(g)).e());
        if (list1 == null || list1.size() <= 0) goto _L8; else goto _L7
_L7:
        avoid = list1.iterator();
_L11:
        if (avoid.hasNext())
        {
            break MISSING_BLOCK_LABEL_716;
        }
_L8:
        if (c)
        {
            b(g, d, e);
        }
        return null;
_L3:
        obj = (ProcessInfo)avoid.next();
        if (obj != null)
        {
            obj.flag = 0;
        }
          goto _L9
_L6:
        obj = (ProcessInfo)avoid.next();
        if (obj != null)
        {
            obj.flag = 3;
            if (!TextUtils.isEmpty(((ProcessInfo) (obj)).packageName))
            {
                f.add(((ProcessInfo) (obj)).packageName);
            }
        }
          goto _L10
        obj = ((ProcessInfo)avoid.next()).packageName;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            f.add(obj);
        }
          goto _L11
    }

    protected void a()
    {
        super.a();
        g.();
        if (h != null)
        {
            h.a();
        }
    }

    protected volatile void a(Object obj)
    {
        a((Void)obj);
    }

    protected void a(Void void1)
    {
        super.a(void1);
        g.c();
        if (h != null)
        {
            h.a(d, e);
            h.a(f);
        }
    }

    protected transient void a(Integer ainteger[])
    {
        super.b(ainteger);
        if (h != null)
        {
            h.b();
        }
    }

    protected transient void b(Object aobj[])
    {
        a((Integer[])aobj);
    }

    public rocessInfo(com.qihoo360.mobilesafe.core.b b1, boolean flag, d d1)
    {
        g = b1;
        super();
        c = flag;
        h = d1;
    }
}
