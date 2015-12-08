// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.aw;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.a:
//            a, r, i

final class q
{

    private static Object a = new Object();
    private Context b;
    private HashMap c;

    private q(Context context)
    {
        c = new HashMap();
        b = context;
    }

    public static q a(Context context)
    {
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        q q1 = new q(context);
        Object obj = null;
        context = new ObjectInputStream(new BufferedInputStream(q1.b.openFileInput("AppEventsLogger.persistedevents")));
        obj = context;
        HashMap hashmap = (HashMap)context.readObject();
        obj = context;
        q1.b.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        obj = context;
        q1.c = hashmap;
        aw.a(context);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return q1;
_L4:
        aw.a(context);
          goto _L1
        context;
        obj1;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context = null;
_L3:
        obj = context;
        Log.d(com.facebook.a.a.f(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        aw.a(context);
          goto _L1
_L2:
        aw.a(((java.io.Closeable) (obj)));
        throw context;
        context;
          goto _L2
        exception;
          goto _L3
        obj;
          goto _L4
        context;
        context = ((Context) (obj));
          goto _L4
        context;
        obj = null;
          goto _L2
    }

    public static void a(Context context, i j, r r1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(j, r1);
        a(context, ((Map) (hashmap)));
    }

    private static void a(Context context, Map map)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        q q1;
        q1 = a(context);
        context = map.entrySet().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)context.next();
            map = ((r)((java.util.Map.Entry) (obj1)).getValue()).b();
            if (map.size() != 0)
            {
                obj1 = (i)((java.util.Map.Entry) (obj1)).getKey();
                if (!q1.c.containsKey(obj1))
                {
                    q1.c.put(obj1, new ArrayList());
                }
                ((List)q1.c.get(obj1)).addAll(map);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_134;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        map = new ObjectOutputStream(new BufferedOutputStream(q1.b.openFileOutput("AppEventsLogger.persistedevents", 0)));
        context = map;
        map.writeObject(q1.c);
        aw.a(map);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        map = null;
_L3:
        context = map;
        Log.d(com.facebook.a.a.f(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        aw.a(map);
          goto _L1
_L2:
        aw.a(context);
        throw map;
        map;
          goto _L2
        exception;
          goto _L3
        map;
        context = null;
          goto _L2
    }

    public final List a(i j)
    {
        return (List)c.get(j);
    }

    public final Set a()
    {
        return c.keySet();
    }

}
