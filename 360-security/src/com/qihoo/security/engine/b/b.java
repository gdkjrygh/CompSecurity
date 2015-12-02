// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.content.Context;
import android.util.SparseArray;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.d.c;
import com.qihoo.security.engine.d.e;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.DeepScanItem;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import com.qihoo.security.services.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.qihoo.security.engine.b:
//            c, d

public class b
    implements com.qihoo.security.engine.d.c.a
{

    final Context a;
    final com.qihoo.security.engine.b.c b;
    final LinkedList c = new LinkedList();
    final Executor d = Executors.newSingleThreadExecutor();
    volatile boolean e;
    volatile boolean f;
    private int g;
    private final SparseArray h = new SparseArray();

    b(Context context, com.qihoo.security.engine.b.c c1)
    {
        g = 0;
        e = true;
        f = false;
        a = context;
        b = c1;
    }

    private int d()
    {
        Iterator iterator = c.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                return i;
            }
            i = ((c)iterator.next()).e() + i;
        } while (true);
    }

    public int a(com.qihoo.security.engine.d.b b1)
    {
        int i = 0;
        ApkInfo apkinfo = b1.a(0).apkInfo;
        if (apkinfo != null)
        {
            apkinfo.addUpExts("v5t", (new StringBuilder(String.valueOf(QVSEnv.LAST_UPDATE_TIME_STAMP))).toString());
        }
        if (f)
        {
            i = 0x80004004;
        } else
        if (!"1".equals(b.a("debug.idle_enumerator")))
        {
            int j = b.f.a(b1);
            i = j;
            if (f)
            {
                try
                {
                    b.e.e().a(new ScanResult(b1));
                }
                // Misplaced declaration of an exception variable
                catch (com.qihoo.security.engine.d.b b1)
                {
                    return j;
                }
                return j;
            }
        }
        return i;
    }

    void a()
    {
        g = 0;
        e = true;
        f = false;
        c.clear();
    }

    public void a(int i, String s, String s1)
    {
        HashMap hashmap1 = (HashMap)h.get(i);
        HashMap hashmap = hashmap1;
        if (hashmap1 == null)
        {
            hashmap = new HashMap();
            h.put(i, hashmap);
        }
        hashmap.put(s, s1);
    }

    public void a(c c1)
    {
label0:
        {
            c1.c();
            if (c1.a() == 99)
            {
                e = true;
                if (!f)
                {
                    break label0;
                }
                b.l();
            }
            return;
        }
        int i = d();
        b.h.a(i);
        b.k();
    }

    void a(DeepScanItem deepscanitem)
    {
        deepscanitem.enumeratorId;
        JVM INSTR tableswitch 3 4: default 28
    //                   3 29
    //                   4 99;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        Object obj = new e(a, deepscanitem.content, this);
_L6:
        deepscanitem = (HashMap)h.get(deepscanitem.enumeratorId);
        if (deepscanitem == null) goto _L5; else goto _L4
_L4:
        deepscanitem = deepscanitem.entrySet().iterator();
_L7:
        if (deepscanitem.hasNext())
        {
            break MISSING_BLOCK_LABEL_119;
        }
_L5:
        ((c) (obj)).b();
        c.add(obj);
        return;
_L3:
        obj = new com.qihoo.security.engine.d.d(a, deepscanitem.content, this);
          goto _L6
        java.util.Map.Entry entry = (java.util.Map.Entry)deepscanitem.next();
        ((c) (obj)).a((String)entry.getKey(), (String)entry.getValue());
          goto _L7
    }

    void b()
    {
        e = false;
        int i = d();
        b.h.b(i);
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                d.execute(new com.qihoo.security.engine.d.a(this));
                return;
            }
            c c1 = (c)iterator.next();
            d.execute(c1);
        } while (true);
    }

    void c()
    {
        g = 0;
        f = true;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((c)iterator.next()).f();
        } while (true);
    }
}
