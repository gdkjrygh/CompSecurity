// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import com.aviary.android.feather.headless.filters.MoaJavaToolStrokeResult;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j, k

public class l extends j
{

    private Object a;
    private List b;
    private double c;
    private com.aviary.android.feather.headless.filters.NativeToolFilter.a d;
    private MoaJavaToolStrokeResult e;

    public l(com.aviary.android.feather.headless.filters.NativeToolFilter.a a1, double d1)
    {
        a = new Object();
        b = new LinkedList();
        d = a1;
        c = d1;
    }

    public Object a()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj1;
        jsonobject.accumulate("brushmode", d.name().toLowerCase());
        jsonobject.accumulate("radius", Double.valueOf(c));
        obj1 = new JSONArray();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((JSONArray) (obj1)).put(((k)iterator.next()).a())) { }
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
        }
_L3:
        return jsonobject;
_L1:
        obj;
        JVM INSTR monitorexit ;
        jsonobject.accumulate("pointlist", obj1);
        if (e == null) goto _L3; else goto _L2
_L2:
        jsonobject.put("initparams", e.e());
        return jsonobject;
    }

    public void a(float f, float f1)
    {
        synchronized (a)
        {
            b.add(new k(f, f1));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(MoaJavaToolStrokeResult moajavatoolstrokeresult)
    {
        try
        {
            e = (MoaJavaToolStrokeResult)moajavatoolstrokeresult.clone();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MoaJavaToolStrokeResult moajavatoolstrokeresult)
        {
            moajavatoolstrokeresult.printStackTrace();
        }
    }

    public void a(k k1)
    {
        synchronized (a)
        {
            b.add(k1);
        }
        return;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public void a(float af[])
    {
        synchronized (a)
        {
            b.add(new k(af[0], af[1]));
        }
        return;
        af;
        obj;
        JVM INSTR monitorexit ;
        throw af;
    }

    public Object clone()
    {
        Object obj1 = new l(d, c);
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((l) (obj1)).a((k)((k)iterator.next()).clone())) { }
        break MISSING_BLOCK_LABEL_69;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }
}
