// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.Context;
import com.google.inject.Provider;

// Referenced classes of package roboguice.inject:
//            ContextScope

public class ContextScopedProvider
{

    protected Provider provider;
    protected ContextScope scope;

    public ContextScopedProvider()
    {
    }

    public Object get(Context context)
    {
        roboguice/inject/ContextScope;
        JVM INSTR monitorenter ;
        scope.enter(context);
        Object obj = provider.get();
        scope.exit(context);
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        scope.exit(context);
        throw exception;
        context;
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
        throw context;
    }
}
