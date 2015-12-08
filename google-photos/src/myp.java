// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class myp extends myg
    implements myd
{

    private static final onh b = new onh("debug.experiments");
    private List c;
    private HashSet d;
    private boolean e;
    private final HashMap f = new HashMap(2);
    private final ArrayList g = new ArrayList();
    private final mym h;
    private final mye i;

    public myp(Context context, mym mym1, mye mye1)
    {
        super(context);
        h = mym1;
        i = mye1;
        h.a(this);
        new myj(context);
    }

    static void a(myp myp1)
    {
        int k = myp1.g.size();
        for (int j = 0; j < k; j++)
        {
            ((myd)myp1.g.get(j)).a();
        }

    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        List list = olm.c(a, myc);
        this;
        JVM INSTR monitorenter ;
        int k;
        if (e)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c = list;
        k = c.size();
        d = new HashSet(k);
        int j = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        d.add(((myc)c.get(j)).d);
        j++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        synchronized (f)
        {
            f.clear();
        }
        b.a(new myq(this));
        return;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(myd myd1)
    {
        g.add(myd1);
    }

    public final boolean a(String s)
    {
        List list = b();
        int k = list.size();
        ArrayList arraylist = new ArrayList(k);
        for (int j = 0; j < k; j++)
        {
            arraylist.add(((myc)list.get(j)).d);
        }

        return h.a(arraylist, s);
    }

    public final List b()
    {
        c();
        return Collections.unmodifiableList(c);
    }

    public final String c(myc myc1, String s)
    {
        String s1;
        s1 = myc1.b;
        c();
        if (!d.contains(myc1.d))
        {
            Log.e("ExperimentServiceImpl", String.format("Experiment %s has not been registered", new Object[] {
                myc1.d
            }));
        }
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        Map map = (Map)f.get(s);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        map = h.a(s);
        obj = map;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        f.put(s, map);
        obj = map;
        hashmap;
        JVM INSTR monitorexit ;
        boolean flag;
        if (obj != null)
        {
            s = (String)((Map) (obj)).get(myc1.d);
            int j;
            if (s == null)
            {
                s = s1;
            }
        } else
        {
            s = s1;
        }
        j = myc1.c;
        myr.a[j - 1];
        JVM INSTR tableswitch 1 3: default 180
    //                   1 243
    //                   2 249
    //                   3 255;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L6:
        obj = s;
        if (flag)
        {
            obj = myc1.e.a;
            s1 = ((String) (obj));
            if (obj == null)
            {
                s1 = i.a(myc1);
            }
            obj = s;
            if (s1 != null)
            {
                obj = s1;
            }
        }
        return ((String) (obj));
        myc1;
        hashmap;
        JVM INSTR monitorexit ;
        throw myc1;
_L2:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L3:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
