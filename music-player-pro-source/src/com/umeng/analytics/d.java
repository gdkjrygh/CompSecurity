// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.common.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.umeng.analytics:
//            h, i

public class d
{

    private ArrayList a;
    private ArrayList b;
    private HashMap c;
    private HashMap d;
    private int e;

    public d()
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new HashMap();
        d = new HashMap();
        e = 10;
    }

    private JSONObject a(JSONObject jsonobject, String s)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        jsonobject1 = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        jsonobject1 = new JSONObject();
        int j = a.size();
        if (j <= 0) goto _L2; else goto _L1
_L1:
        if (!jsonobject1.isNull("event")) goto _L4; else goto _L3
_L3:
        jsonobject = new JSONArray();
        jsonobject1.put("event", jsonobject);
_L11:
        Object obj = a.iterator();
_L12:
        if (((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        a.clear();
_L2:
        j = b.size();
        if (j <= 0) goto _L8; else goto _L7
_L7:
        if (!jsonobject1.isNull("ekv")) goto _L10; else goto _L9
_L9:
        jsonobject = new JSONArray();
        obj = new JSONObject();
        b(((JSONObject) (obj)), s);
        jsonobject.put(obj);
        jsonobject1.put("ekv", jsonobject);
_L8:
        this;
        JVM INSTR monitorexit ;
        return jsonobject1;
_L4:
        jsonobject = jsonobject1.getJSONArray("event");
          goto _L11
_L6:
        JSONObject jsonobject3 = (JSONObject)((Iterator) (obj)).next();
        jsonobject3.put("session_id", s);
        jsonobject.put(jsonobject3);
          goto _L12
        jsonobject;
        jsonobject.printStackTrace();
          goto _L2
        jsonobject;
        throw jsonobject;
_L10:
        jsonobject = jsonobject1.getJSONArray("ekv");
        j = jsonobject.length() - 1;
          goto _L13
_L16:
        if (j != 0) goto _L8; else goto _L14
_L14:
        JSONObject jsonobject2 = new JSONObject();
        b(jsonobject2, s);
        jsonobject.put(jsonobject2);
          goto _L8
        jsonobject;
        jsonobject.printStackTrace();
          goto _L8
_L18:
        boolean flag = b((JSONObject)jsonobject.get(j), s);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 1;
        if (true) goto _L16; else goto _L15
_L15:
        j--;
_L13:
        if (j >= 0) goto _L18; else goto _L17
_L17:
        j = 0;
          goto _L16
    }

    private boolean b(JSONObject jsonobject, String s)
        throws Exception
    {
        JSONArray jsonarray;
        Iterator iterator;
        boolean flag;
        if (jsonobject.has(s))
        {
            jsonarray = jsonobject.getJSONArray(s);
            flag = true;
        } else
        {
            jsonarray = new JSONArray();
            flag = false;
        }
        iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                b.clear();
                jsonobject.put(s, jsonarray);
                return flag;
            }
            jsonarray.put((JSONObject)iterator.next());
        } while (true);
    }

    public int a()
    {
        return a.size() + b.size();
    }

    public void a(int j)
    {
        e = j;
    }

    public void a(Context context)
    {
        String s;
        if (a() > 0)
        {
            if ((s = h.e(context).getString("session_id", null)) != null)
            {
                h.a(context, a(h.i(context), s));
                return;
            }
        }
    }

    public void a(String s)
    {
        if (c.containsKey(s))
        {
            ((i)c.get(s)).a(Long.valueOf(System.currentTimeMillis()));
            return;
        } else
        {
            i j = new i(s);
            j.a(Long.valueOf(System.currentTimeMillis()));
            c.put(s, j);
            return;
        }
    }

    public void a(String s, Map map)
    {
        if (!d.containsKey(s))
        {
            d.put(s, map);
        }
    }

    public boolean a(Context context, String s, String s1, long l, int j)
    {
        this;
        JVM INSTR monitorenter ;
        String s2;
        String s3;
        context = new JSONObject();
        s3 = g.a();
        s2 = s3.split(" ")[0];
        s3 = s3.split(" ")[1];
        context.put("tag", s);
        context.put("date", s2);
        context.put("time", s3);
        context.put("acc", j);
        if (!TextUtils.isEmpty(s1))
        {
            context.put("label", s1);
        }
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        context.put("du", l);
        a.add(context);
_L1:
        boolean flag = b();
        this;
        JVM INSTR monitorexit ;
        return flag;
        context;
        context.printStackTrace();
          goto _L1
        context;
        throw context;
    }

    public boolean a(Context context, String s, Map map, long l)
    {
        this;
        JVM INSTR monitorenter ;
        context = new JSONObject();
        context.put("id", s);
        context.put("ts", System.currentTimeMillis());
        s = map.entrySet().iterator();
        int j = 0;
_L5:
        if (s.hasNext() && j < 10) goto _L2; else goto _L1
_L1:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        context.put("du", l);
        b.add(context);
_L3:
        boolean flag = b();
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        map = (java.util.Map.Entry)s.next();
        context.put((String)map.getKey(), (String)map.getValue());
        j++;
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
          goto _L3
        context;
        throw context;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public long b(String s)
    {
        if (c.containsKey(s))
        {
            return ((i)c.get(s)).a().longValue();
        } else
        {
            return -1L;
        }
    }

    public boolean b()
    {
        return a.size() + b.size() > e;
    }

    public Map c(String s)
    {
        if (c.containsKey(s) && ((i)c.get(s)).b() > 0)
        {
            return (Map)d.get(s);
        } else
        {
            return (Map)d.remove(s);
        }
    }
}
