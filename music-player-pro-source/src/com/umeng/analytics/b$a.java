// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import com.umeng.common.Log;
import java.util.Map;

// Referenced classes of package com.umeng.analytics:
//            b

private final class d extends Thread
{

    final b a;
    private final Object b;
    private Context c;
    private int d;
    private String e;
    private String f;
    private int g;
    private long h;
    private Map i;
    private String j;

    public void run()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int k = d;
        if (k != 0) goto _L2; else goto _L1
_L1:
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Log.b("MobclickAgent", "unexpected null context in invokehander flag=0");
        obj;
        JVM INSTR monitorexit ;
        return;
        com.umeng.analytics.b.a(a, c);
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        catch (Exception exception)
        {
            Log.b("MobclickAgent", "Exception occurred in invokehander.", exception);
        }
        return;
        obj1;
        Log.b("MobclickAgent", "unexpected null context in invokehander flag=0", ((Exception) (obj1)));
          goto _L3
_L2:
label0:
        {
            if (d != 1)
            {
                break label0;
            }
            com.umeng.analytics.b.b(a, c);
        }
          goto _L3
label1:
        {
            if (d != 2)
            {
                break label1;
            }
            com.umeng.analytics.b.c(a, c);
        }
          goto _L3
label2:
        {
            if (d != 3)
            {
                break label2;
            }
            com.umeng.analytics.b.a(a, c, e, f, h, g);
        }
          goto _L3
label3:
        {
            if (d != 4)
            {
                break label3;
            }
            com.umeng.analytics.b.a(a, c, e, i, h);
        }
          goto _L3
        if (d != 5) goto _L5; else goto _L4
_L4:
        com.umeng.analytics.b.a(a, c, e, i, j);
          goto _L3
_L5:
        if (d != 6) goto _L3; else goto _L6
_L6:
        com.umeng.analytics.b.a(a, c, e, j);
          goto _L3
    }

    (b b1, Context context, int k)
    {
        a = b1;
        super();
        b = new Object();
        c = context.getApplicationContext();
        d = k;
    }

    d(b b1, Context context, String s, String s1, long l, int k, 
            int i1)
    {
        a = b1;
        super();
        b = new Object();
        c = context.getApplicationContext();
        e = s;
        f = s1;
        g = k;
        d = i1;
        h = l;
    }

    h(b b1, Context context, String s, Map map, long l, int k)
    {
        a = b1;
        super();
        b = new Object();
        c = context.getApplicationContext();
        e = s;
        i = map;
        d = k;
        h = l;
    }

    h(b b1, Context context, String s, Map map, String s1, int k)
    {
        a = b1;
        super();
        b = new Object();
        c = context.getApplicationContext();
        e = s;
        i = map;
        j = s1;
        d = k;
    }
}
