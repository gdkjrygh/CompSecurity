// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.os.Bundle;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            r, b

public final class q
    implements b, com.roidapp.cloudlib.a.b
{

    private static q a;
    private Queue b;

    public q()
    {
    }

    public static Bundle a(r r1)
    {
        if (r1 == null)
        {
            return null;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putInt("adType", com.roidapp.cloudlib.ads.r.a(r1));
            bundle.putString("playUrl", com.roidapp.cloudlib.ads.r.b(r1));
            bundle.putString("resUrl", r.c(r1));
            bundle.putString("package", r.d(r1));
            bundle.putString("url", r.e(r1));
            return bundle;
        }
    }

    public static void a()
    {
        a = new q();
    }

    public static q b()
    {
        return a;
    }

    public static boolean b(r r1)
    {
        while (r1 == null || com.roidapp.cloudlib.ads.r.a(r1) != 1 || !com.roidapp.baselib.d.a.a(com.roidapp.cloudlib.ads.b.a(r.c(r1)), false) || r.d(r1) != null && n.a(aj.a(), r.d(r1))) 
        {
            return false;
        }
        return true;
    }

    private void d()
    {
        if (b != null)
        {
            x x1 = (x)b.poll();
            if (x1 != null && x1.a != null && x1.b != null)
            {
                t.a().execute(new com.roidapp.baselib.e.a((String)x1.a, (new StringBuilder()).append((String)x1.b).append(".tmp").toString(), this));
            }
        }
    }

    public final r a(JSONObject jsonobject)
    {
        r r1 = new r(this);
        com.roidapp.cloudlib.ads.r.a(r1, jsonobject.optInt("adType"));
        com.roidapp.cloudlib.ads.r.a(r1, jsonobject.optString("playUrl", null));
        com.roidapp.cloudlib.ads.r.b(r1, jsonobject.optString("resUrl", null));
        r.c(r1, jsonobject.optString("package", null));
        r.d(r1, jsonobject.optString("url", null));
        return r1;
    }

    public final void a(int i)
    {
    }

    public final void a(int i, Exception exception)
    {
        d();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        if (obj != null)
        {
            File file = new File(((String) (obj)));
            if (file.exists() && ((String) (obj)).endsWith(".tmp"))
            {
                file.renameTo(new File(((String) (obj)).substring(0, ((String) (obj)).length() - 4)));
            }
        }
        d();
    }

    public final void c()
    {
        Object obj;
        if (b == null)
        {
            if ((obj = com.roidapp.cloudlib.a.a.a(aj.a()).c("ad", "pushAdRes")) != null && !((List) (obj)).isEmpty())
            {
                b = new LinkedList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    String s1 = com.roidapp.cloudlib.ads.b.a(s);
                    if (s1 != null && !com.roidapp.baselib.d.a.a(s1, false))
                    {
                        b.add(new x(s, s1));
                    }
                } while (true);
                d();
                return;
            }
        }
    }
}
