// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import com.facebook.AppEventsLogger;
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

public final class aoa
{

    private static Object b = new Object();
    public HashMap a;
    private Context c;

    private aoa(Context context)
    {
        a = new HashMap();
        c = context;
    }

    public static aoa a(Context context)
    {
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        aoa aoa1 = new aoa(context);
        Object obj = null;
        context = new ObjectInputStream(new BufferedInputStream(aoa1.c.openFileInput("AppEventsLogger.persistedevents")));
        obj = context;
        HashMap hashmap = (HashMap)context.readObject();
        obj = context;
        aoa1.c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        obj = context;
        aoa1.a = hashmap;
        arp.a(context);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return aoa1;
_L4:
        arp.a(context);
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
        Log.d(AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        arp.a(context);
          goto _L1
_L2:
        arp.a(((java.io.Closeable) (obj)));
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

    public static void a(Context context, com.facebook.AppEventsLogger.AccessTokenAppIdPair accesstokenappidpair, aob aob1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(accesstokenappidpair, aob1);
        a(context, ((Map) (hashmap)));
    }

    public static void a(Context context, Map map)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        aoa aoa1;
        aoa1 = a(context);
        context = map.entrySet().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)context.next();
            map = ((aob)((java.util.Map.Entry) (obj1)).getValue()).b();
            if (map.size() != 0)
            {
                obj1 = (com.facebook.AppEventsLogger.AccessTokenAppIdPair)((java.util.Map.Entry) (obj1)).getKey();
                if (!aoa1.a.containsKey(obj1))
                {
                    aoa1.a.put(obj1, new ArrayList());
                }
                ((List)aoa1.a.get(obj1)).addAll(map);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_134;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        map = new ObjectOutputStream(new BufferedOutputStream(aoa1.c.openFileOutput("AppEventsLogger.persistedevents", 0)));
        context = map;
        map.writeObject(aoa1.a);
        arp.a(map);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        map = null;
_L3:
        context = map;
        Log.d(AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        arp.a(map);
          goto _L1
_L2:
        arp.a(context);
        throw map;
        map;
          goto _L2
        exception;
          goto _L3
        map;
        context = null;
          goto _L2
    }

}
