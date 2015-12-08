// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.Utility;
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

// Referenced classes of package com.facebook:
//            AppEventsLogger

static class context
{

    static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    private static Object staticLock = new Object();
    private Context context;
    private HashMap persistedEvents;

    public static void persistEvents(Context context1, Pair pair, te te)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(pair, te);
        persistEvents(context1, ((Map) (hashmap)));
    }

    public static void persistEvents(Context context1, Map map)
    {
        Object obj = staticLock;
        obj;
        JVM INSTR monitorenter ;
        context1 = readAndClearStore(context1);
        map = map.entrySet().iterator();
_L2:
        if (map.hasNext())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context1.write();
        return;
        java.util.pIdPair pidpair = (java.util.ts.write)map.next();
        List list = ((te)pidpair.State()).getEventsToPersist();
        if (list.size() != 0)
        {
            context1.addEvents((Pair)pidpair.pIdPair(), list);
        }
        if (true) goto _L2; else goto _L1
_L1:
        context1;
        obj;
        JVM INSTR monitorexit ;
        throw context1;
    }

    public static Pair readAndClearStore(Context context1)
    {
        synchronized (staticLock)
        {
            context1 = new <init>(context1);
            context1.readAndClearStore();
        }
        return context1;
        context1;
        obj;
        JVM INSTR monitorexit ;
        throw context1;
    }

    private void readAndClearStore()
    {
        Object obj1;
        Object obj2;
        Object obj4;
        obj4 = null;
        obj1 = null;
        obj2 = null;
        Object obj = new ObjectInputStream(new BufferedInputStream(context.openFileInput("AppEventsLogger.persistedevents")));
        obj1 = (HashMap)((ObjectInputStream) (obj)).readObject();
        context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        persistedEvents = ((HashMap) (obj1));
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return;
        obj;
        obj = obj2;
_L6:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return;
        Object obj3;
        obj3;
        obj = obj4;
_L4:
        obj1 = obj;
        Log.d(AppEventsLogger.access$1(), (new StringBuilder("Got unexpected exception: ")).append(((Exception) (obj3)).toString()).toString());
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return;
        obj;
_L2:
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        throw obj;
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void write()
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedevents", 0)));
        ((ObjectOutputStream) (obj1)).writeObject(persistedEvents);
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        return;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L4:
        obj = obj1;
        Log.d(AppEventsLogger.access$1(), (new StringBuilder("Got unexpected exception: ")).append(((Exception) (obj2)).toString()).toString());
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        return;
        obj1;
_L2:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addEvents(Pair pair, List list)
    {
        if (!persistedEvents.containsKey(pair))
        {
            persistedEvents.put(pair, new ArrayList());
        }
        ((List)persistedEvents.get(pair)).addAll(list);
    }

    public List getEvents(Pair pair)
    {
        return (List)persistedEvents.get(pair);
    }

    public Set keySet()
    {
        return persistedEvents.keySet();
    }


    private Pair(Context context1)
    {
        persistedEvents = new HashMap();
        context = context1;
    }
}
