// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, z, j, gs

public class curlew extends LinkedBlockingQueue
{

    String a;

    public curlew()
    {
        a = null;
    }

    public boolean add(Object obj)
    {
        if (!ci.b().j)
        {
            return super.add(obj);
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        Field afield[];
        int k;
        afield = obj.getClass().getDeclaredFields();
        k = afield.length;
        int i = 0;
_L11:
        if (i >= k) goto _L2; else goto _L3
_L3:
        Object obj2 = afield[i];
        if (!((Field) (obj2)).getType().equals(java/util/Map)) goto _L5; else goto _L4
_L4:
        a = ((Field) (obj2)).getName();
_L2:
        if (a == null) goto _L7; else goto _L6
_L6:
        z z1;
        boolean flag;
        Field field = obj.getClass().getDeclaredField(a);
        field.setAccessible(true);
        obj2 = new HashMap((Map)field.get(obj));
        z1 = z.a();
        flag = ci.b().j;
        if (!flag) goto _L7; else goto _L8
_L8:
        JSONObject jsonobject = new JSONObject(((Map) (obj2)));
        Object obj1 = null;
        if (!((Map) (obj2)).containsKey("&t")) goto _L10; else goto _L9
_L9:
        flag = ((String)((Map) (obj2)).get("&t")).equals("screenview");
        if (!flag) goto _L10; else goto _L7
_L7:
        return super.add(obj);
_L5:
        i++;
          goto _L11
_L10:
        if (((Map) (obj2)).containsKey("&ev"))
        {
            obj1 = ((Map) (obj2)).get("&ev");
        }
        if (!((Map) (obj2)).containsKey("&ea"))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj2 = (String)((Map) (obj2)).get("&ea");
_L12:
        ci.b().d.a("googleAnalytics", ((String) (obj2)), obj1, jsonobject);
          goto _L7
        Exception exception;
        exception;
        try
        {
            gs.b(z1.getClass().getCanonicalName(), exception);
        }
        catch (Exception exception1)
        {
            gs.b("GA Break adding", exception1);
        }
          goto _L7
        obj2 = "";
          goto _L12
    }

    public boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public Object poll()
    {
        return super.poll();
    }
}
