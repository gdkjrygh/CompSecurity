// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.assist.SysclearAsyncTask19;
import com.qihoo360.mobilesafe.core.b.c;
import com.qihoo360.mobilesafe.core.b.d;
import com.qihoo360.mobilesafe.core.b.e;
import com.qihoo360.mobilesafe.core.d.f;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            ProcessState

public class b extends ProcessState
{
    class a extends SysclearAsyncTask19
    {

        boolean c;
        List d;
        List e;
        List f;
        final b g;
        private d h;

        protected volatile transient Object a(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected transient Void a(Void avoid[])
        {
            g.b();
            c(new Integer[] {
                Integer.valueOf(0)
            });
            List list = com.qihoo360.mobilesafe.core.d.c.a(b.a(g), b.b(g), c(g));
            avoid = (List)list.get(0);
            List list1 = (List)list.get(1);
            ArrayList arraylist = new ArrayList();
            d = new ArrayList();
            e = new ArrayList();
            f = new ArrayList();
            com.qihoo360.mobilesafe.core.b.e.a(b.a(g)).a();
            if (avoid != null && !avoid.isEmpty())
            {
                List list2 = d(g).a(avoid, b.a(g));
                Object obj;
                if (list2 != null && list2.size() == 4)
                {
                    avoid = (List)list2.get(0);
                    b.a(g, e, (List)list2.get(1));
                    obj = (List)list2.get(2);
                    com.qihoo360.mobilesafe.core.b.e.a(b.a(g)).a((List)list2.get(3));
                } else
                {
                    obj = null;
                    avoid = null;
                }
                obj = e(g).b(((List) (obj)));
                if (obj != null && ((List) (obj)).size() == 3)
                {
                    b.a(g, d, (List)((List) (obj)).get(0));
                    b.a(g, e, (List)((List) (obj)).get(1));
                    b.a(g, arraylist, (List)((List) (obj)).get(2));
                }
                avoid = e(g).a(avoid);
                if (avoid != null && avoid.size() == 3)
                {
                    b.a(g, d, (List)avoid.get(0));
                    b.a(g, e, (List)avoid.get(1));
                    b.a(g, arraylist, (List)avoid.get(2));
                }
                avoid = d(g).b(arraylist, b.a(g));
                if (avoid != null && avoid.size() == 2)
                {
                    b.a(g, e, (List)avoid.get(0));
                    com.qihoo360.mobilesafe.core.b.e.a(b.a(g)).a((List)avoid.get(1));
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
            f.addAll(com.qihoo360.mobilesafe.core.b.e.a(b.a(g)).e());
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
                b.b(g, d, e);
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
            g.();
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

        public a(boolean flag, d d1)
        {
            g = b.this;
            super();
            c = flag;
            h = d1;
        }
    }


    public static final ExecutorService a = Executors.newSingleThreadExecutor();
    private static final String c = com/qihoo360/mobilesafe/core/b.getSimpleName();
    private Context d;
    private ActivityManager e;
    private PackageManager f;
    private c g;
    private com.qihoo360.mobilesafe.core.b.b h;

    public b(Context context)
    {
        a(context);
    }

    static Context a(b b1)
    {
        return b1.d;
    }

    private void a(Context context)
    {
        d = context;
        b = ProcessState.State.STATE_NULL;
        f = d.getPackageManager();
        e = (ActivityManager)Utils.getSystemService(d, "activity");
        g = new c(d);
        h = new com.qihoo360.mobilesafe.core.b.b(d);
    }

    static void a(b b1, List list, List list1)
    {
        b1.a(list, list1);
    }

    private void a(List list, List list1)
    {
        if (list != null && list1 != null && !list1.isEmpty())
        {
            list.addAll(list1);
        }
    }

    static ActivityManager b(b b1)
    {
        return b1.e;
    }

    static List b(b b1, List list, List list1)
    {
        return b1.b(list, list1);
    }

    private List b(List list, List list1)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (list != null && !list.isEmpty())
        {
            arraylist.addAll(list);
        }
        if (list1 != null && !list1.isEmpty())
        {
            arraylist.addAll(list1);
        }
        if (arraylist == null || arraylist.isEmpty())
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (b == ProcessState.State.STATE_CANCEL)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        System.currentTimeMillis();
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        CountDownLatch countdownlatch;
        Iterator iterator;
        boolean flag;
        if (arraylist.isEmpty())
        {
            break MISSING_BLOCK_LABEL_200;
        }
        int i = arraylist.size();
        flag = com.qihoo360.mobilesafe.core.d.f.a().b();
        list1 = new CountDownLatch(1);
        countdownlatch = new CountDownLatch(i);
        list = Executors.newFixedThreadPool(5);
        iterator = arraylist.iterator();
_L1:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_166;
        }
        list1.countDown();
        try
        {
            countdownlatch.await();
        }
        // Misplaced declaration of an exception variable
        catch (List list1) { }
        list.shutdown();
        return arraylist;
        list.submit(new Runnable(countdownlatch, list1, (ProcessInfo)iterator.next(), flag) {

            final b a;
            private final CountDownLatch b;
            private final CountDownLatch c;
            private final ProcessInfo d;
            private final boolean e;

            public void run()
            {
                Exception exception1;
                try
                {
                    c.await();
                    System.currentTimeMillis();
                    com.qihoo360.mobilesafe.core.d.c.a(b.b(a), d, e);
                }
                catch (Exception exception)
                {
                    b.countDown();
                    return;
                }
                finally
                {
                    b.countDown();
                }
                b.countDown();
                return;
                throw exception1;
            }

            
            {
                a = b.this;
                b = countdownlatch;
                c = countdownlatch1;
                d = processinfo;
                e = flag;
                super();
            }
        });
          goto _L1
        list;
        return null;
    }

    static PackageManager c(b b1)
    {
        return b1.f;
    }

    static com.qihoo360.mobilesafe.core.b.b d(b b1)
    {
        return b1.h;
    }

    static c e(b b1)
    {
        return b1.g;
    }

    public void a(boolean flag, d d1)
    {
        (new a(flag, d1)).a(a, new Void[0]);
    }

}
