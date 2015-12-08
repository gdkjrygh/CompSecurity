// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ch

public class cs
{
    public class a
    {

        public String a;
        public String b;
        public long c;
        public long d;
        public long e;
        final cs f;

        public String toString()
        {
            return (new StringBuilder()).append("\"").append(a).append("\" - \"").append(b).append("\" - ").append(c).append("ms, ").append(d).append("ms, ").append(e).append("ms").toString();
        }

        public a()
        {
            f = cs.this;
            super();
        }
    }


    private Map a;
    private File b;
    private boolean c;

    public cs(Context context)
    {
        c = true;
        b = context.getFilesDir();
        a = new HashMap();
        d();
    }

    private void c()
    {
        Object obj = new ArrayList();
        long l = (new GregorianCalendar()).getTimeInMillis();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a2 = (a)iterator.next();
            if (l - a2.d >= a2.c)
            {
                ((List) (obj)).add(a2);
            }
        } while (true);
        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.remove(a1.a))
        {
            a1 = (a)((Iterator) (obj)).next();
            ct.d((new StringBuilder()).append("Cleaning cookie: ").append(a1.toString()).toString());
        }

    }

    private void d()
    {
        Object obj;
        ct.d("Loading cookies...");
        obj = ch.a(b, "cookies.cookies").getAbsoluteFile();
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = ct.a(((File) (obj)));
        HashMap hashmap;
        obj = (new JSONObject(((String) (obj)))).getJSONArray("cookies");
        hashmap = new HashMap(((JSONArray) (obj)).length());
        int i = 0;
_L2:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        a a1 = new a();
        a1.a = jsonobject.getString("key");
        a1.b = jsonobject.getString("value");
        a1.c = jsonobject.getLong("lifeTimeMS");
        a1.d = jsonobject.getLong("localTimeMS");
        a1.e = jsonobject.getLong("serverTimeMS");
        ct.d((new StringBuilder()).append("Loading cookie: ").append(a1.toString()).toString());
        hashmap.put(a1.a, a1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            a = hashmap;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        ct.d("Cookies loaded.");
        return;
    }

    public JSONArray a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        c();
        obj = new JSONArray();
        iterator = a.values().iterator();
_L1:
        a a1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        a1 = (a)iterator.next();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", a1.a);
        jsonobject.put("value", a1.b);
        ((JSONArray) (obj)).put(jsonobject);
          goto _L1
        Exception exception;
        exception;
        ct.a(exception);
          goto _L1
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((JSONArray) (obj));
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1.c > 0L) goto _L2; else goto _L1
_L1:
        if (a.containsKey(a1.a))
        {
            ct.d((new StringBuilder()).append("Removing cookie: ").append(a1.toString()).toString());
            a.remove(a1.a);
            c = true;
        }
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a.containsKey(a1.a)) goto _L4; else goto _L3
_L3:
        ct.d((new StringBuilder()).append("Adding cookie: ").append(a1.toString()).toString());
        a.put(a1.a, a1);
        c = true;
          goto _L5
        a1;
        throw a1;
_L4:
        if (((a)a.get(a1.a)).e >= a1.e) goto _L5; else goto _L6
_L6:
        ct.d((new StringBuilder()).append("Updating cookie: ").append(a1.toString()).toString());
        a.remove(a1.a);
        a.put(a1.a, a1);
        c = true;
          goto _L5
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = new a();
        long l = (new GregorianCalendar()).getTimeInMillis();
        a1.a = s;
        a1.b = s1;
        a1.c = 0x7fffffffffffffffL;
        a1.e = l;
        a1.d = l;
        a(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(JSONArray jsonarray, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = (new GregorianCalendar()).getTimeInMillis();
        int i = 0;
_L1:
        int j = jsonarray.length();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        JSONObject jsonobject = jsonarray.getJSONObject(i);
        a a1 = new a();
        a1.a = jsonobject.getString("name");
        a1.b = jsonobject.getString("value");
        a1.c = jsonobject.getLong("lifetime");
        a1.e = l;
        a1.d = l1;
        a(a1);
_L2:
        i++;
          goto _L1
        Exception exception;
        exception;
        ct.a(exception);
          goto _L2
        jsonarray;
        throw jsonarray;
        this;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        ct.d("Saving cookies...");
        if (c) goto _L2; else goto _L1
_L1:
        ct.d("No changes in cookies detected, no need to save.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Object obj1;
        Iterator iterator;
        c = false;
        obj = new JSONObject();
        obj1 = new JSONArray();
        iterator = a.values().iterator();
_L3:
        a a1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        a1 = (a)iterator.next();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", a1.a);
        jsonobject.put("value", a1.b);
        jsonobject.put("localTimeMS", a1.d);
        jsonobject.put("serverTimeMS", a1.e);
        jsonobject.put("lifeTimeMS", a1.c);
        ((JSONArray) (obj1)).put(jsonobject);
          goto _L3
        Exception exception1;
        exception1;
        ct.a(exception1);
          goto _L3
        obj;
        throw obj;
        File file = ch.a(b, "cookies.cookies").getAbsoluteFile();
        if (file.exists())
        {
            file.delete();
        }
        file.createNewFile();
        ((JSONObject) (obj)).put("cookies", obj1);
        obj = ((JSONObject) (obj)).toString();
        obj1 = new FileOutputStream(file);
        ((FileOutputStream) (obj1)).write(((String) (obj)).getBytes());
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
_L6:
        ct.d("Cookies saved.");
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        ct.a(exception);
          goto _L6
        exception;
        ct.a(exception);
          goto _L6
    }
}
