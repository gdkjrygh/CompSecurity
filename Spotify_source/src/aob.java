// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.facebook.Request;
import com.facebook.model.GraphObject;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class aob
{

    private List a;
    private List b;
    private int c;
    private apo d;
    private String e;
    private String f;

    public aob(apo apo, String s, String s1)
    {
        a = new ArrayList();
        b = new ArrayList();
        d = apo;
        e = s;
        f = s1;
    }

    private static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            arp.a("Encoding exception: ", s);
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

    public final int a(Request request, boolean flag, boolean flag1, boolean flag2)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        JSONArray jsonarray;
        int i;
        i = c;
        b.addAll(a);
        a.clear();
        jsonarray = new JSONArray();
        iterator = b.iterator();
_L3:
        com.facebook.AppEventsLogger.AppEvent appevent;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        appevent = (com.facebook.AppEventsLogger.AppEvent)iterator.next();
        if (flag) goto _L2; else goto _L1
_L1:
        if (appevent.isImplicit) goto _L3; else goto _L2
_L2:
        jsonarray.put(appevent.jsonObject);
          goto _L3
        request;
        this;
        JVM INSTR monitorexit ;
        throw request;
        if (jsonarray.length() != 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        this;
        JVM INSTR monitorexit ;
        return 0;
        this;
        JVM INSTR monitorexit ;
        Object obj = com.facebook.model.GraphObject.Factory.create();
        ((GraphObject) (obj)).setProperty("event", "CUSTOM_APP_EVENTS");
        if (c > 0)
        {
            ((GraphObject) (obj)).setProperty("num_skipped_events", Integer.valueOf(i));
        }
        if (flag1)
        {
            arp.a(((GraphObject) (obj)), d, f, flag2);
        }
        Object obj1;
        try
        {
            arp.a(((GraphObject) (obj)), AppEventsLogger.f());
        }
        catch (Exception exception) { }
        ((GraphObject) (obj)).setProperty("application_package_name", e);
        request.b = ((GraphObject) (obj));
        obj1 = request.c;
        obj = obj1;
        if (obj1 == null)
        {
            obj = new Bundle();
        }
        obj1 = jsonarray.toString();
        if (obj1 != null)
        {
            ((Bundle) (obj)).putByteArray("custom_events_file", a(((String) (obj1))));
            request.e = obj1;
        }
        request.c = ((Bundle) (obj));
        return jsonarray.length();
    }

    public final void a(com.facebook.AppEventsLogger.AppEvent appevent)
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
        a.add(appevent);
        if (true) goto _L4; else goto _L3
_L3:
        appevent;
        throw appevent;
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
}
