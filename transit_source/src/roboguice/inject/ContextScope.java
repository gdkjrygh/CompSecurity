// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import roboguice.util.RoboContext;

public class ContextScope
    implements Scope
{

    protected Application application;
    protected Map applicationScopedObjects;
    protected ThreadLocal contextThreadLocal;

    public ContextScope(Application application1)
    {
        contextThreadLocal = new ThreadLocal();
        applicationScopedObjects = new HashMap();
        application = application1;
        enter(application1);
    }

    public void enter(Context context)
    {
        roboguice/inject/ContextScope;
        JVM INSTR monitorenter ;
        Object obj;
        Map map;
        obj = getContextStack();
        map = getScopedObjectMap(context);
        ((Stack) (obj)).push(new WeakReference(context));
        obj = context.getClass();
_L2:
        Class class1;
        map.put(Key.get(((Class) (obj))), context);
        class1 = ((Class) (obj)).getSuperclass();
        obj = class1;
        if (class1 != java/lang/Object) goto _L2; else goto _L1
_L1:
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
        return;
        context;
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void exit(Context context)
    {
        roboguice/inject/ContextScope;
        JVM INSTR monitorenter ;
        Context context1 = (Context)((WeakReference)getContextStack().pop()).get();
        if (context1 == null || context1 == context)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        throw new IllegalArgumentException(String.format("Scope for %s must be opened before it can be closed", new Object[] {
            context
        }));
        context;
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
        throw context;
        roboguice/inject/ContextScope;
        JVM INSTR monitorexit ;
    }

    public Stack getContextStack()
    {
        Stack stack1 = (Stack)contextThreadLocal.get();
        Stack stack = stack1;
        if (stack1 == null)
        {
            stack = new Stack();
            contextThreadLocal.set(stack);
        }
        return stack;
    }

    protected Map getScopedObjectMap(Context context)
    {
        Context context1;
        for (context1 = context; !(context1 instanceof RoboContext) && !(context1 instanceof Application) && (context1 instanceof ContextWrapper); context1 = ((ContextWrapper)context1).getBaseContext()) { }
        if (context1 instanceof Application)
        {
            return applicationScopedObjects;
        }
        if (!(context1 instanceof RoboContext))
        {
            throw new IllegalArgumentException(String.format("%s does not appear to be a RoboGuice context (instanceof RoboContext)", new Object[] {
                context
            }));
        } else
        {
            return ((RoboContext)context1).getScopedObjectMap();
        }
    }

    public Provider scope(final Key key, final Provider unscoped)
    {
        return new Provider() {

            final ContextScope this$0;
            final Key val$key;
            final Provider val$unscoped;

            public Object get()
            {
                roboguice/inject/ContextScope;
                JVM INSTR monitorenter ;
                Map map;
                Context context = (Context)((WeakReference)getContextStack().peek()).get();
                map = getScopedObjectMap(context);
                if (map != null)
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                roboguice/inject/ContextScope;
                JVM INSTR monitorexit ;
                return null;
                Object obj1 = map.get(key);
                Object obj;
                obj = obj1;
                if (obj1 != null)
                {
                    break MISSING_BLOCK_LABEL_95;
                }
                obj = obj1;
                if (!map.containsKey(key))
                {
                    obj = unscoped.get();
                    map.put(key, obj);
                }
                roboguice/inject/ContextScope;
                JVM INSTR monitorexit ;
                return obj;
                Exception exception;
                exception;
                roboguice/inject/ContextScope;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = ContextScope.this;
                key = key1;
                unscoped = provider;
                super();
            }
        };
    }
}
