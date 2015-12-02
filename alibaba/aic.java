// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class aic
{

    private static Map a = null;
    private static Map b = null;

    public static Map a(Context context, Map map)
    {
        aic;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            d(context, map);
        }
        context = b;
        aic;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void a()
    {
        aic;
        JVM INSTR monitorenter ;
        a = null;
        b = null;
        aic;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String b(Context context, Map map)
    {
        aic;
        JVM INSTR monitorenter ;
        c(context, map);
        map = a;
        if (map != null) goto _L2; else goto _L1
_L1:
        context = null;
_L6:
        context = aiu.a(context);
        aic;
        JVM INSTR monitorexit ;
        return context;
_L2:
        StringBuffer stringbuffer;
        ArrayList arraylist;
        stringbuffer = new StringBuffer();
        arraylist = new ArrayList(map.keySet());
        Collections.sort(arraylist);
        int i = 0;
_L4:
        String s;
        String s1;
        StringBuilder stringbuilder;
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)arraylist.get(i);
        s1 = (String)map.get(s);
        stringbuilder = new StringBuilder();
        if (i == 0)
        {
            context = "";
        } else
        {
            context = "&";
        }
        stringbuffer.append(stringbuilder.append(context).append(s).append("=").append(s1).toString());
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        context = stringbuffer.toString();
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
    }

    private static Map c(Context context, Map map)
    {
        aic;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            d(context, map);
        }
        context = a;
        aic;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static void d(Context context, Map map)
    {
        aic;
        JVM INSTR monitorenter ;
        b = new TreeMap();
        a = new TreeMap();
        b.putAll(ahy.a(context, map));
        b.putAll(aia.a(context));
        map = b;
        aiw aiw1 = aiw.a();
        HashMap hashmap = new HashMap();
        hashmap.put("AD1", aiw.a(context));
        hashmap.put("AD2", aiw.b(context));
        hashmap.put("AD3", aiw.c(context));
        hashmap.put("AD5", aiw.d(context));
        hashmap.put("AD6", aiw.e(context));
        hashmap.put("AD7", aiw.f(context));
        hashmap.put("AD8", aiw.g(context));
        hashmap.put("AD9", aiw.h(context));
        hashmap.put("AD10", aiw.i(context));
        hashmap.put("AD11", aiw.b());
        hashmap.put("AD12", aiw1.c());
        hashmap.put("AD13", aiw.d());
        hashmap.put("AD14", aiw.e());
        hashmap.put("AD15", aiw.f());
        hashmap.put("AD16", aiw.g());
        map.putAll(hashmap);
        a.putAll(b);
        a.putAll(ahx.a(context));
        aic;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

}
