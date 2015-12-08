// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.Context;
import com.google.inject.Key;
import com.google.inject.Provider;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Stack;

// Referenced classes of package roboguice.inject:
//            ContextScope

class val.unscoped
    implements Provider
{

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
        Object obj1 = map.get(val$key);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = obj1;
        if (!map.containsKey(val$key))
        {
            obj = val$unscoped.get();
            map.put(val$key, obj);
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

    ()
    {
        this$0 = final_contextscope;
        val$key = key1;
        val$unscoped = Provider.this;
        super();
    }
}
