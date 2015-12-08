// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            Validate

public final class CallbackManagerImpl
    implements CallbackManager
{

    private static Map staticCallbacks = new HashMap();
    private Map callbacks;

    public CallbackManagerImpl()
    {
        callbacks = new HashMap();
    }

    private static Callback getStaticCallback(Integer integer)
    {
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorenter ;
        integer = (Callback)staticCallbacks.get(integer);
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorexit ;
        return integer;
        integer;
        throw integer;
    }

    public static void registerStaticCallback(int i, Callback callback)
    {
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorenter ;
        boolean flag;
        Validate.notNull(callback, "callback");
        flag = staticCallbacks.containsKey(Integer.valueOf(i));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorexit ;
        return;
_L2:
        staticCallbacks.put(Integer.valueOf(i), callback);
        if (true) goto _L1; else goto _L3
_L3:
        callback;
        throw callback;
    }

    private static boolean runStaticCallback(int i, int j, Intent intent)
    {
        Callback callback = getStaticCallback(Integer.valueOf(i));
        if (callback != null)
        {
            return callback.onActivityResult(j, intent);
        } else
        {
            return false;
        }
    }

    public boolean onActivityResult(int i, int j, Intent intent)
    {
        Callback callback = (Callback)callbacks.get(Integer.valueOf(i));
        if (callback != null)
        {
            return callback.onActivityResult(j, intent);
        } else
        {
            return runStaticCallback(i, j, intent);
        }
    }

    public void registerCallback(int i, Callback callback)
    {
        Validate.notNull(callback, "callback");
        callbacks.put(Integer.valueOf(i), callback);
    }


    private class Callback
    {

        public abstract boolean onActivityResult(int i, Intent intent);
    }

}
