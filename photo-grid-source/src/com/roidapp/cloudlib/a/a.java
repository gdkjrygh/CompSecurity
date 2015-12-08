// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.a;

import android.content.Context;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import com.roidapp.cloudlib.al;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.a:
//            b

public final class a
    implements s
{

    private static a a;
    private static volatile boolean b;
    private File c;
    private Map d;
    private r e;
    private Queue f;

    private a(Context context)
    {
        c = context.getFileStreamPath("cloud_params");
        f = new ConcurrentLinkedQueue();
        if (c == null || !c.exists())
        {
            context = null;
        } else
        {
            context = com.roidapp.baselib.d.a.a(c, "utf-8");
        }
        a(context);
    }

    public static a a(Context context)
    {
        com/roidapp/cloudlib/a/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context);
        }
        context = a;
        com/roidapp/cloudlib/a/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean a(String s1)
    {
        HashMap hashmap;
        if (s1 == null)
        {
            return false;
        }
        hashmap = new HashMap();
        Iterator iterator;
        s1 = new JSONObject(s1);
        iterator = s1.keys();
_L4:
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_146;
            }
            s2 = (String)iterator.next();
        } while (s2 == null);
        JSONObject jsonobject;
        Iterator iterator1;
        jsonobject = s1.getJSONObject(s2);
        iterator1 = jsonobject.keys();
_L2:
        String s3;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = (String)iterator1.next();
        if (s3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s4 = jsonobject.optString(s3);
        if (s4 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap.put(f(s2, s3), s4);
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        s1.printStackTrace();
        s1 = null;
_L5:
        if (s1 != null)
        {
            d = s1;
            return true;
        } else
        {
            return false;
        }
        s1 = hashmap;
          goto _L5
    }

    private static String f(String s1, String s2)
    {
        return (new StringBuilder()).append(s1).append("_").append(s2).toString();
    }

    public final int a(String s1, String s2, int i)
    {
        s1 = a(s1, s2);
        int j = i;
        if (s1 != null)
        {
            try
            {
                j = Integer.parseInt(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return i;
            }
        }
        return j;
    }

    public final String a(String s1, String s2)
    {
        String s3 = null;
        Map map = d;
        if (map != null)
        {
            s3 = (String)map.get(f(s1, s2));
        }
        return s3;
    }

    public final void a(int i, Exception exception)
    {
        e = null;
        b = false;
    }

    public final void a(b b1)
    {
        if (!f.contains(b1))
        {
            f.add(b1);
        }
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        e = null;
        if (obj != null && a(((String) (obj))))
        {
            com.roidapp.baselib.d.a.a(((String) (obj)), c, "UTF-8");
            if (f != null)
            {
                for (obj = f.iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).c()) { }
            }
        }
    }

    public final boolean a()
    {
        if (b)
        {
            return false;
        }
        b = true;
        if (e != null)
        {
            e.f();
        }
        e = new r(al.a, this);
        t.a().execute(e);
        return true;
    }

    public final boolean a(String s1, String s2, boolean flag)
    {
        s1 = a(s1, s2);
        if (s1 == null)
        {
            return flag;
        } else
        {
            return "1".equals(s1);
        }
    }

    public final float b(String s1, String s2)
    {
        s1 = a(s1, s2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        float f1 = Float.parseFloat(s1);
        return f1;
        s1;
        s1.printStackTrace();
        return 0.5F;
    }

    public final boolean b(b b1)
    {
        return f.remove(b1);
    }

    public final List c(String s1, String s2)
    {
        s1 = a(s1, s2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        JSONArray jsonarray;
        int j;
        jsonarray = new JSONArray(s1);
        j = jsonarray.length();
        s1 = new ArrayList(j);
        int i = 0;
_L2:
        s2 = s1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.add(jsonarray.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
        s2;
        s1 = null;
_L4:
        s2.printStackTrace();
        s2 = s1;
_L1:
        return s2;
        s2;
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public final int[] d(String s1, String s2)
    {
        int ai[];
        String s3;
        Object obj = null;
        ai = null;
        s3 = a(s1, s2);
        s2 = obj;
        if (s3 == null) goto _L2; else goto _L1
_L1:
        s1 = ai;
        JSONArray jsonarray = new JSONArray(s3);
        s1 = ai;
        ai = new int[jsonarray.length()];
        int i = 0;
_L3:
        s1 = ai;
        s2 = ai;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ai;
        ai[i] = jsonarray.optInt(i);
        i++;
        if (true) goto _L3; else goto _L2
        s2;
        s2.printStackTrace();
        s2 = s1;
_L2:
        return s2;
    }

    public final Queue e(String s1, String s2)
    {
        s1 = a(s1, s2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        JSONArray jsonarray;
        int j;
        jsonarray = new JSONArray(s1);
        j = jsonarray.length();
        s1 = new LinkedList();
        int i = 0;
_L2:
        s2 = s1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = jsonarray.getString(i);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        int k = Integer.parseInt(s2);
        s1.add(Integer.valueOf(k));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        s2;
        s1 = null;
_L4:
        s2.printStackTrace();
        s2 = s1;
_L1:
        return s2;
        s2;
          goto _L3
        s2;
          goto _L4
        return null;
          goto _L3
    }
}
