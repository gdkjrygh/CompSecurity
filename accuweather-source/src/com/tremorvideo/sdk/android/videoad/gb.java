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
//            ct, ch, az

public class gb
{
    public class a
    {

        public String a;
        public String b;
        public long c;
        final gb d;

        public String toString()
        {
            return (new StringBuilder()).append("\"").append(a).append("\" - \"").append(b).append("\" - ").append(c).append("ms").toString();
        }

        public a()
        {
            d = gb.this;
            super();
        }
    }


    private Map a;
    private File b;
    private boolean c;
    private az d;

    public gb(Context context)
    {
        c = true;
        b = context.getFilesDir();
        a = new HashMap();
        c();
        b();
    }

    private void b()
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
            if (l >= a2.c)
            {
                ((List) (obj)).add(a2);
            }
        } while (true);
        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.remove(a1.a))
        {
            a1 = (a)((Iterator) (obj)).next();
            ct.d((new StringBuilder()).append("Cleaning data: ").append(a1.toString()).toString());
        }

    }

    private void c()
    {
        Object obj;
        ct.d("Loading data...");
        obj = ch.a(b, "savedata.savedata").getAbsoluteFile();
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = ct.a(((File) (obj)));
        HashMap hashmap;
        obj = (new JSONObject(((String) (obj)))).getJSONArray("savedata");
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
        a1.c = jsonobject.getLong("expirationDate");
        ct.d((new StringBuilder()).append("Loading data: ").append(a1.toString()).toString());
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
        ct.d("Data loaded.");
        return;
    }

    public String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder()).append(s).append(d.j()).toString();
        if (!a.containsKey(s)) goto _L2; else goto _L1
_L1:
        s = ((a)a.get(s)).b;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        ct.d("Saving data...");
        if (c) goto _L2; else goto _L1
_L1:
        ct.d("No changes in save data detected, no need to save.");
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
            break MISSING_BLOCK_LABEL_151;
        }
        a1 = (a)iterator.next();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", a1.a);
        jsonobject.put("value", a1.b);
        jsonobject.put("expirationDate", a1.c);
        ((JSONArray) (obj1)).put(jsonobject);
          goto _L3
        Exception exception1;
        exception1;
        ct.a(exception1);
          goto _L3
        obj;
        throw obj;
        File file = ch.a(b, "savedata.savedata").getAbsoluteFile();
        if (file.exists())
        {
            file.delete();
        }
        file.createNewFile();
        ((JSONObject) (obj)).put("savedata", obj1);
        obj = ((JSONObject) (obj)).toString();
        obj1 = new FileOutputStream(file);
        ((FileOutputStream) (obj1)).write(((String) (obj)).getBytes());
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
_L6:
        ct.d("Data saved.");
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

    public void a(az az1)
    {
        this;
        JVM INSTR monitorenter ;
        d = az1;
        this;
        JVM INSTR monitorexit ;
        return;
        az1;
        throw az1;
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        long l = d.e().getTimeInMillis();
        s = (new StringBuilder()).append(s).append(d.j()).toString();
        if (!a.containsKey(s))
        {
            a a1 = new a();
            a1.a = s;
            a1.b = s1;
            a1.c = l;
            a.put(s, a1);
            c = true;
        }
        s = (a)a.get(s);
        if (((a) (s)).b != s1 || ((a) (s)).c != l)
        {
            s.c = l;
            s.b = s1;
            c = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
