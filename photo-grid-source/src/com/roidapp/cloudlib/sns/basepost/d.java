// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            e, f

public final class d
{

    private static ExecutorService a;
    private static d c;
    private List b;

    public d()
    {
        b = new ArrayList();
    }

    public static d a()
    {
        if (c == null)
        {
            c = new d();
        }
        return c;
    }

    static List a(d d1)
    {
        return d1.b;
    }

    static List a(d d1, List list)
    {
        d1.b = list;
        return list;
    }

    public static List a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int i;
        try
        {
            s = (new JSONObject(s)).getJSONArray("data");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        i = 0;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(s.getLong(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_33;
_L1:
        return arraylist;
    }

    public final void a(long l)
    {
        b.add(Long.valueOf(l));
        if (b.size() > 50)
        {
            b.remove(0);
        }
    }

    public final void b()
    {
        if (a == null)
        {
            a = Executors.newCachedThreadPool();
        }
        a.execute(new e(this));
    }

    public final List c()
    {
        return b;
    }

    public final void d()
    {
        if (a == null)
        {
            a = Executors.newCachedThreadPool();
        }
        a.execute(new f(this));
    }
}
