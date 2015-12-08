// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.AppEventsLoggerUtility;
import com.facebook.internal.a;
import com.facebook.internal.m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class f
{

    private List a;
    private List b;
    private int c;
    private a d;
    private String e;
    private String f;
    private final int g = 1000;

    private static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            m.a("Encoding exception: ", s);
            return null;
        }
        return s;
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int a(GraphRequest graphrequest, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        JSONArray jsonarray;
        int i;
        i = c;
        b.addAll(a);
        a.clear();
        jsonarray = new JSONArray();
        obj = b.iterator();
_L3:
        Object obj1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        obj1 = (pEvent)((Iterator) (obj)).next();
        if (flag) goto _L2; else goto _L1
_L1:
        if (((pEvent) (obj1)).b) goto _L3; else goto _L2
_L2:
        jsonarray.put(((pEvent) (obj1)).a);
          goto _L3
        graphrequest;
        this;
        JVM INSTR monitorexit ;
        throw graphrequest;
        if (jsonarray.length() != 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        this;
        JVM INSTR monitorexit ;
        return 0;
        this;
        JVM INSTR monitorexit ;
        obj1 = AppEventsLoggerUtility.a(com.facebook.internal.lity.GraphAPIActivityType.b, d, f, flag1, AppEventsLogger.f());
        obj = obj1;
        if (c <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ((JSONObject) (obj1)).put("num_skipped_events", i);
        obj = obj1;
_L5:
        graphrequest.c = ((JSONObject) (obj));
        Object obj2 = graphrequest.d;
        obj = obj2;
        if (obj2 == null)
        {
            obj = new Bundle();
        }
        obj2 = jsonarray.toString();
        if (obj2 != null)
        {
            ((Bundle) (obj)).putByteArray("custom_events_file", a(((String) (obj2))));
            graphrequest.f = obj2;
        }
        graphrequest.d = ((Bundle) (obj));
        return jsonarray.length();
        JSONException jsonexception;
        jsonexception;
        jsonexception = new JSONObject();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(pEvent pevent)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.size() + b.size() < 1000) goto _L2; else goto _L1
_L1:
        c = c + 1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.add(pevent);
        if (true) goto _L4; else goto _L3
_L3:
        pevent;
        throw pevent;
    }

    public final void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        a.addAll(list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a.addAll(b);
        b.clear();
        c = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final List b()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        list = a;
        a = new ArrayList();
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public pEvent(a a1, String s, String s1)
    {
        a = new ArrayList();
        b = new ArrayList();
        d = a1;
        e = s;
        f = s1;
    }
}
