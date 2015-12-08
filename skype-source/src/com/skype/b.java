// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.skype:
//            a, ObjectInterfaceFactory, NativeWeakRef

class b
{

    private static volatile b instance;
    private final ReferenceQueue queue = new ReferenceQueue();
    private final Set referencesSet = Collections.newSetFromMap(new ConcurrentHashMap());
    private Thread thread;

    private b()
    {
        thread = new Thread("ShutdownManager") {

            final b this$0;

            public final void run()
            {
                do
                {
                    try
                    {
                        NativeWeakRef nativeweakref = (NativeWeakRef)queue.remove();
                        referencesSet.remove(nativeweakref);
                        nativeweakref.destroyNativeObject();
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                } while (true);
            }

            
            {
                this$0 = b.this;
                super(s);
            }
        };
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    public static b getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/skype/b;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new b();
        }
        com/skype/b;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/skype/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void addDestructibleObject(ObjectInterfaceFactory objectinterfacefactory, a a1)
    {
        referencesSet.add(a1.createNativeWeakRef(objectinterfacefactory, queue));
    }


}
