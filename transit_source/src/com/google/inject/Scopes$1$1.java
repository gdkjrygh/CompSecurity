// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.CircularDependencyProxy;
import com.google.inject.internal.InternalInjectorCreator;

// Referenced classes of package com.google.inject:
//            Provider, Scopes, ProvisionException, Scope, 
//            Key

class val.creator
    implements Provider
{

    private volatile Object instance;
    final LETON this$0;
    final Provider val$creator;

    public Object get()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/google/inject/internal/InternalInjectorCreator;
        JVM INSTR monitorenter ;
        Object obj;
        if (instance != null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = val$creator.get();
        if (!(obj instanceof CircularDependencyProxy))
        {
            break MISSING_BLOCK_LABEL_39;
        }
        com/google/inject/internal/InternalInjectorCreator;
        JVM INSTR monitorexit ;
        return obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = Scopes.access$000();
        if (instance != null && instance != obj)
        {
            throw new ProvisionException("Provider was reentrant while creating a singleton");
        }
        break MISSING_BLOCK_LABEL_81;
        obj;
        com/google/inject/internal/InternalInjectorCreator;
        JVM INSTR monitorexit ;
        throw obj;
        instance = obj;
        com/google/inject/internal/InternalInjectorCreator;
        JVM INSTR monitorexit ;
_L2:
        Object obj1 = instance;
        if (obj1 == Scopes.access$000())
        {
            obj1 = null;
        }
        return obj1;
    }

    public String toString()
    {
        return String.format("%s[%s]", new Object[] {
            val$creator, Scopes.SINGLETON
        });
    }

    ception()
    {
        this$0 = final_ception;
        val$creator = Provider.this;
        super();
    }

    // Unreferenced inner class com/google/inject/Scopes$1

/* anonymous class */
    static final class Scopes._cls1
        implements Scope
    {

        public Provider scope(Key key, Provider provider)
        {
            return provider. new Scopes._cls1._cls1();
        }

        public String toString()
        {
            return "Scopes.SINGLETON";
        }

    }

}
