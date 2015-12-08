// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, j, x

final class y
    implements Runnable
{

    final x a;

    y(x x)
    {
        a = x;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = Class.forName("com.adobe.mobile.AnalyticsWorker");
        obj = ((Class) (obj)).getMethod("sharedInstance", new Class[0]).invoke(obj, new Object[0]);
        obj2 = Class.forName("com.adobe.mobile.AbstractDatabaseBacking");
        obj1 = ((Class) (obj2)).getDeclaredField("dbMutex");
        ((Field) (obj1)).setAccessible(true);
        obj1 = ((Field) (obj1)).get(obj);
        obj1;
        JVM INSTR monitorenter ;
        obj2 = ((Class) (obj2)).getDeclaredField("database");
        ((Field) (obj2)).setAccessible(true);
        obj2 = ((SQLiteDatabase)((Field) (obj2)).get(obj)).query("HITS", new String[] {
            "ID", "URL", "TIMESTAMP"
        }, null, null, null, null, "ID ASC", "1");
        if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = ((Cursor) (obj2)).getString(1);
        ((Cursor) (obj2)).close();
_L9:
        if (obj == null) goto _L4; else goto _L3
_L3:
        String as[];
        obj1 = new JSONObject();
        as = URLDecoder.decode(((String) (obj)), "UTF-8").split("&");
        int i;
        obj = "";
        i = 0;
_L6:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (as[i].contains("action="))
        {
            int k = as[i].indexOf("=");
            obj = as[i].substring(k + 1);
        }
        i++;
        if (true) goto _L6; else goto _L5
        obj;
        obj1;
        JVM INSTR monitorexit ;
        int l;
        byte byte0;
        try
        {
            throw obj;
        }
        catch (Exception exception) { }
          goto _L4
_L10:
        i = byte0;
        if (l >= as.length)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (!as[l].equals(".a"))
        {
            break MISSING_BLOCK_LABEL_355;
        }
        i = l + 1;
_L8:
        if (i >= as.length || as[i].equals(".c"))
        {
            break; /* Loop/switch isn't completed */
        }
        l = as[i].indexOf("=");
        ((JSONObject) (obj1)).put(as[i].substring(0, l), as[i].substring(l + 1));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        as = ci.b().d;
        if (((JSONObject) (obj1)).length() == 0)
        {
            obj1 = null;
        }
        as.a("adobe", ((String) (obj)), null, ((JSONObject) (obj1)));
        return;
_L2:
        obj = null;
          goto _L9
_L4:
        return;
_L5:
        byte0 = 13;
        l = 0;
          goto _L10
        l++;
          goto _L10
    }
}
