// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            aj, ci, j

public class crocodile extends HashMap
{

    public crocodile()
    {
    }

    public Object get(Object obj)
    {
        String s;
        Object obj1;
        s = obj.toString();
        obj1 = super.get(obj);
        if (obj1 != null)
        {
            try
            {
                int i = obj1.getClass().getDeclaredFields()[0].getInt(obj1);
                (new Handler()).postDelayed(new aj(this, obj1, i, s), 4L);
            }
            catch (Throwable throwable) { }
        }
        return super.get(obj);
    }

    public Object put(Object obj, Object obj1)
    {
        int i = ((Integer)obj1.getClass().getFields()[0].get(obj1)).intValue();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Object obj2;
        if (obj.toString().split("\\.").length < 2)
        {
            ci.b().d.a("flurry", obj.toString(), Integer.valueOf(i), new JSONObject());
        }
        obj2 = super.put(obj, obj1);
        return obj2;
        Throwable throwable;
        throwable;
        try
        {
            if (obj.toString().split("\\.").length < 2)
            {
                ci.b().d.a("flurry", obj.toString(), Integer.valueOf(0), new JSONObject());
            }
        }
        catch (Throwable throwable1) { }
        return super.put(obj, obj1);
    }
}
