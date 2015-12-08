// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;
import com.facebook.internal.U;
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
//            a

static final class c
{

    private static Object b = new Object();
    HashMap a;
    private Context c;

    public static text a(Context context)
    {
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        text text = new <init>(context);
        Object obj = null;
        context = new ObjectInputStream(new BufferedInputStream(text.c.openFileInput("AppEventsLogger.persistedevents")));
        obj = context;
        HashMap hashmap = (HashMap)context.readObject();
        obj = context;
        text.c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        obj = context;
        text.a = hashmap;
        U.a(context);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return text;
_L4:
        U.a(context);
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
        com.facebook.a.a.f();
        obj = context;
        (new StringBuilder("Got unexpected exception: ")).append(exception.toString());
        U.a(context);
          goto _L1
_L2:
        U.a(((java.io.Closeable) (obj)));
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

    public static void a(Context context, text text, text text1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(text, text1);
        a(context, ((Map) (hashmap)));
    }

    private static void a(Context context, Map map)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        text text;
        text = a(context);
        context = map.entrySet().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Entry)context.next();
            map = ((next)((java.util.Entry) (obj1)).getValue()).b();
            if (map.size() != 0)
            {
                obj1 = ()((java.util.Entry) (obj1)).getKey();
                if (!text.a.containsKey(obj1))
                {
                    text.a.put(obj1, new ArrayList());
                }
                ((List)text.a.get(obj1)).addAll(map);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_134;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        map = new ObjectOutputStream(new BufferedOutputStream(text.c.openFileOutput("AppEventsLogger.persistedevents", 0)));
        context = map;
        map.writeObject(text.a);
        U.a(map);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        map = null;
_L3:
        context = map;
        com.facebook.a.a.f();
        context = map;
        (new StringBuilder("Got unexpected exception: ")).append(exception.toString());
        U.a(map);
          goto _L1
_L2:
        U.a(context);
        throw map;
        map;
          goto _L2
        exception;
          goto _L3
        map;
        context = null;
          goto _L2
    }


    private text(Context context)
    {
        a = new HashMap();
        c = context;
    }
}
