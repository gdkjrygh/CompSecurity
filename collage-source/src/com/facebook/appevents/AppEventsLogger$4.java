// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.internal.Utility;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class cessTokenAppIdPair
    implements Runnable
{

    public void run()
    {
        Object obj1 = new HashSet();
        Object obj = AppEventsLogger.access$400();
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = AppEventsLogger.access$500().keySet().iterator(); iterator1.hasNext(); ((Set) (obj1)).add(((cessTokenAppIdPair)iterator1.next()).getApplicationId())) { }
        break MISSING_BLOCK_LABEL_64;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        for (Iterator iterator = ((Set) (obj1)).iterator(); iterator.hasNext(); Utility.queryAppSettings((String)iterator.next(), true)) { }
        return;
    }

    cessTokenAppIdPair()
    {
    }
}
