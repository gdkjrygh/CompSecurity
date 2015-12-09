// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import com.aviary.android.feather.common.utils.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j, g

public class h extends j
{

    Object a;
    int b;
    int c;
    int d;
    float e;
    List f;

    public h(int i, float f1, int l, int i1)
    {
        a = new Object();
        f = new LinkedList();
        b = i;
        e = f1;
        c = l;
        d = i1;
    }

    public Object a()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj1;
        jsonobject.accumulate("blursize", Integer.valueOf(b));
        jsonobject.accumulate("radius", Float.valueOf(e));
        jsonobject.accumulate("color", (new StringBuilder()).append("0x").append(k.a(Integer.toHexString(c), '0', 8)).toString());
        jsonobject.accumulate("erase", Integer.valueOf(d));
        obj1 = new JSONArray();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((JSONArray) (obj1)).put(((g)iterator.next()).a())) { }
        break MISSING_BLOCK_LABEL_158;
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
        return jsonobject;
        obj;
        JVM INSTR monitorexit ;
        jsonobject.accumulate("commands", obj1);
        return jsonobject;
    }

    public void a(g g1)
    {
        synchronized (a)
        {
            f.add(g1);
        }
        return;
        g1;
        obj;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public Object clone()
    {
        Object obj1 = new h(b, e, c, d);
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = f.iterator();
_L2:
        Object obj2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            obj2 = ((g)iterator.next()).clone();
        } while (obj2 == null);
        ((h) (obj1)).a((g)((g)obj2).clone());
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }
}
