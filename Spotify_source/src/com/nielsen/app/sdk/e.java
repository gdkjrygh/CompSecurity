// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.nielsen.app.sdk:
//            d, a, c, h, 
//            AppConfig, AppCache, g

class e
    implements Closeable
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final String f[] = {
        "IMPRESSION", "VIEW", "PATTERN", "STREAM", "DAYPART"
    };
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final String o[] = {
        "ID3RAW", "DPR", "DPRID3", "MTVR", "OCR", "LEGACY", "DRM", "NONE"
    };
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    private static e v = null;
    private static boolean y = false;
    private List s;
    private AppConfig t;
    private h u;
    private g w;
    private d x;

    private e()
    {
        s = new LinkedList();
        t = null;
        u = null;
        w = null;
        x = null;
    }

    public static e b()
    {
        com/nielsen/app/sdk/e;
        JVM INSTR monitorenter ;
        e e2;
        if (v == null)
        {
            e e1 = new e();
            v = e1;
            e1.a();
        }
        e2 = v;
        com/nielsen/app/sdk/e;
        JVM INSTR monitorexit ;
        return e2;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean g()
    {
        return y;
    }

    public d a(int i1)
    {
        for (Iterator iterator = s.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (d1.b() == i1)
            {
                return d1;
            }
        }

        return null;
    }

    public void a()
    {
        try
        {
            t = com.nielsen.app.sdk.a.n();
            u = com.nielsen.app.sdk.a.m();
            f();
            return;
        }
        catch (Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 7, 'E', "Could not initialize the processor manager object", new Object[0]);
        }
    }

    protected boolean a(int i1, String s1)
    {
        int k1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (u.a()) goto _L2; else goto _L1
_L1:
        boolean flag = u.d();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = false;
_L24:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        Object obj;
        Object obj1;
        obj = com.nielsen.app.sdk.a.o();
        obj1 = new char[1];
        obj1[0] = ' ';
        long l1 = t.a(-1L, ((char []) (obj1)));
        int j1;
        if (((AppCache) (obj)).c() == 0L)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        flag = t.h();
        if (j1 == 0 || !flag) goto _L5; else goto _L4
_L4:
        obj.getClass();
        obj = new AppCache.ProcessorData(((AppCache) (obj)), -1L, -1, i1, l1, obj1[0], s1);
        j1 = k1;
_L19:
        if (j1 >= s.size()) goto _L7; else goto _L6
_L6:
        obj1 = (d)s.get(j1);
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        k1 = ((d) (obj1)).b();
        i1;
        JVM INSTR tableswitch 0 5: default 467
    //                   0 231
    //                   1 231
    //                   2 231
    //                   3 485
    //                   4 250
    //                   5 231;
           goto _L10 _L11 _L11 _L11 _L12 _L13 _L11
_L10:
        com.nielsen.app.sdk.c.a(8, 'W', "Inexpected message type (%s)", new Object[] {
            Integer.valueOf(i1)
        });
          goto _L14
_L21:
        ((d) (obj1)).d().put(obj);
          goto _L14
        s1;
        throw s1;
_L13:
        k1;
        JVM INSTR lookupswitch 2: default 280
    //                   1: 283
    //                   6: 283;
           goto _L14 _L15 _L15
_L15:
        if (((d) (obj1)).g())
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L14
_L9:
        com.nielsen.app.sdk.c.a(8, 'E', "Could not send message(%s) to processor id(%d), it is not available", new Object[] {
            s1, Integer.valueOf(j1)
        });
          goto _L14
_L7:
        w = null;
        x = null;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L18:
        ((AppCache) (obj)).a(0, -1, i1, l1, s1);
        if (!flag) goto _L17; else goto _L16
_L16:
        if (w == null)
        {
            w = new g();
        }
        if (w != null)
        {
            w.b();
        }
          goto _L17
_L22:
        if (x == null)
        {
            x = a(0);
        }
        if (x != null)
        {
            com.nielsen.app.sdk.c.a('I', "Send ID3 to default processor", new Object[0]);
            obj.getClass();
            obj1 = new AppCache.ProcessorData(((AppCache) (obj)), -1L, -1, i1, l1, obj1[0], s1);
            x.d().put(obj1);
        }
          goto _L18
_L14:
        j1++;
          goto _L19
_L12:
        k1;
        JVM INSTR tableswitch 0 3: default 516
    //                   0 231
    //                   1 516
    //                   2 231
    //                   3 231;
           goto _L14 _L11 _L14 _L11 _L11
_L11:
        if (true) goto _L21; else goto _L20
_L20:
_L5:
        i1;
        JVM INSTR tableswitch 0 5: default 560
    //                   0 389
    //                   1 389
    //                   2 389
    //                   3 389
    //                   4 338
    //                   5 389;
           goto _L18 _L22 _L22 _L22 _L22 _L18 _L22
_L17:
        flag = true;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public boolean a(long l1)
    {
        if (!y)
        {
            return false;
        } else
        {
            com.nielsen.app.sdk.c.a('I', "PLAYHEAD: %d", new Object[] {
                Long.valueOf(l1)
            });
            return a(4, String.valueOf(l1));
        }
    }

    public boolean a(String s1)
    {
        com.nielsen.app.sdk.c.a('I', "METADATA: %s", new Object[] {
            s1
        });
        return a(5, s1);
    }

    public d b(int i1)
    {
        Object obj = null;
        d d1 = obj;
        if (i1 >= 0)
        {
            d1 = obj;
            if (i1 < s.size())
            {
                d1 = (d)s.get(i1);
            }
        }
        return d1;
    }

    public boolean b(String s1)
    {
        if (!y)
        {
            return false;
        } else
        {
            com.nielsen.app.sdk.c.a('I', "ID3: %s", new Object[] {
                s1
            });
            return a(3, s1);
        }
    }

    public void c()
    {
        try
        {
            e();
            return;
        }
        catch (Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 7, 'E', "Problems while closing all the processors", new Object[0]);
        }
    }

    public boolean c(String s1)
    {
        com.nielsen.app.sdk.c.a('I', "PLAYINFO: %s", new Object[] {
            s1
        });
        boolean flag = a(1, s1);
        if (flag)
        {
            y = true;
        }
        return flag;
    }

    public void close()
    {
        c();
    }

    public List d()
    {
        return s;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        char ac[];
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ac = new char[1];
        ac[0] = ' ';
        long l1 = t.a(-1L, ac);
        for (Iterator iterator = s.iterator(); iterator.hasNext(); ((d)iterator.next()).b(l1, ac[0])) { }
        break MISSING_BLOCK_LABEL_78;
        Exception exception;
        exception;
        throw exception;
        s.clear();
        x = null;
        this;
        JVM INSTR monitorexit ;
    }

    public void f()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        Object obj = t.c();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        throw new Exception("No parameters management object on the configuration object");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int j1 = ((AppConfig.a) (obj)).e();
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        d d1 = new d(i1, ((AppConfig.a) (obj)));
        d1.start();
        s.add(d1);
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        break MISSING_BLOCK_LABEL_102;
        exception;
        com.nielsen.app.sdk.c.a(7, 'E', "Could not start data processor for index(%d)", new Object[] {
            Integer.valueOf(i1)
        });
          goto _L3
    }

    public boolean h()
    {
        com.nielsen.app.sdk.c.a('I', "SESSION STOP", new Object[0]);
        boolean flag = a(2, "");
        if (flag)
        {
            y = false;
        }
        return flag;
    }

}
