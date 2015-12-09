// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.spotify.cosmos.android:
//            Cosmos, Resolver

public class LifeCycleInspector
{

    private static final Map REFS = new HashMap();
    private static final int WATCHDOG_TIMEOUT = 1000;
    private static boolean sEnabled = false;

    public LifeCycleInspector()
    {
    }

    private static void addRef(String s, Resolver resolver)
    {
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorenter ;
        List list = (List)REFS.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = new LinkedList();
        REFS.put(s, obj);
        ((List) (obj)).add(resolver);
        logCosmosRefs();
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorexit ;
        return;
        s;
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void assertNoConnectedResolvers()
    {
        boolean flag;
        Iterator iterator = REFS.entrySet().iterator();
        flag = false;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Iterator iterator1 = ((List)entry.getValue()).iterator();
                boolean flag1 = flag;
                do
                {
                    flag = flag1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    if (((Resolver)iterator1.next()).isConnected())
                    {
                        Logger.c("Shutdown stopped, cosmos resolver is still connected ~ %s", new Object[] {
                            entry.getKey()
                        });
                        flag1 = true;
                    }
                } while (true);
            }
        } while (true);
        Assertion.b(flag, "Not all cosmos resolvers are disconnected");
        return;
    }

    public static void enable()
    {
        sEnabled = true;
    }

    private static void logCosmosRefs()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = REFS.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = (List)entry.getValue();
            if (((List) (obj1)).size() > 0)
            {
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append("[ ");
                obj1 = ((List) (obj1)).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    Object obj = (Resolver)((Iterator) (obj1)).next();
                    if (((Resolver) (obj)).isConnected() || ((Resolver) (obj)).isConnecting())
                    {
                        obj = "connected";
                    } else
                    {
                        obj = "disconnected";
                    }
                    stringbuilder.append(((String) (obj)));
                    stringbuilder.append(" ");
                }
                stringbuilder.append("] ");
            }
        } while (true);
    }

    public static void noteNewInstance(Resolver resolver)
    {
        if (sEnabled)
        {
            addRef((new Exception()).getStackTrace()[2].getClassName(), resolver);
        }
    }

    public static void noteRemoval(Resolver resolver)
    {
        if (sEnabled)
        {
            removeRef(resolver);
        }
    }

    public static void onServiceShutdown()
    {
        if (sEnabled)
        {
            (new Handler()).postDelayed(new Runnable() {

                public final void run()
                {
                    LifeCycleInspector.assertNoConnectedResolvers();
                }

            }, 1000L);
        }
    }

    private static void removeRef(Resolver resolver)
    {
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorenter ;
        Iterator iterator = REFS.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((List)entry.getValue()).contains(resolver))
            {
                ((List)entry.getValue()).remove(resolver);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_79;
        resolver;
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorexit ;
        throw resolver;
        logCosmosRefs();
        com/spotify/cosmos/android/Cosmos;
        JVM INSTR monitorexit ;
    }


}
