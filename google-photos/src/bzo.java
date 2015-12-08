// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class bzo
{

    public static final String a;
    public static final String b;
    private static final String c;
    private final ddc d = new bzp(this, cvm, "exported_videos.pb");
    private final dez e = new bzq(this, 50);
    private final Context f;

    public bzo(Context context)
    {
        f = (Context)b.a(context, "context", null);
    }

    static dez a(bzo bzo1)
    {
        return bzo1.e;
    }

    static String a()
    {
        return c;
    }

    static void a(bzo bzo1, String s)
    {
        bzo1.a(s);
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        d.a(f);
        e.a(Collections.singletonList(s));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static Context b(bzo bzo1)
    {
        return bzo1.f;
    }

    static ddc c(bzo bzo1)
    {
        return bzo1.d;
    }

    public final String a(String s, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d.a(f);
        s = (cvl)e.a(s, s1);
        if (s == null || !flag) goto _L2; else goto _L1
_L1:
        if (!((cvl) (s)).d) goto _L4; else goto _L3
_L3:
        s = ((cvl) (s)).c;
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
_L4:
        s = null;
        continue; /* Loop/switch isn't completed */
_L2:
        if (s == null)
        {
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        s = ((cvl) (s)).c;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    public final void a(String s, String s1, String s2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        d.a(f);
        obj = new cvl();
        obj.a = s;
        obj.b = s1;
        obj.c = s2;
        obj.d = flag;
        e.d(obj);
        s1 = e;
        s = new bzr(this, s, s2);
        s2 = new ArrayList();
        obj = ((dez) (s1)).b.iterator();
_L2:
        String s3;
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_157;
            }
            s3 = (String)((Iterator) (obj)).next();
            obj1 = ((dez) (s1)).a.get(s3);
        } while (obj1 == null);
        if (!s.a(obj1)) goto _L2; else goto _L1
_L1:
        s2.add(s3);
          goto _L2
        s;
        throw s;
        s1.a(s2);
        this;
        JVM INSTR monitorexit ;
    }

    static 
    {
        String s = bzo.getSimpleName();
        c = s;
        String s1 = String.valueOf(bzs.getSimpleName());
        a = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(".").append(s1).toString();
        s = c;
        s1 = String.valueOf(bzt.getSimpleName());
        b = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(".").append(s1).toString();
    }
}
