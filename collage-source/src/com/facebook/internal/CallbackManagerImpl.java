// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            Validate

public final class CallbackManagerImpl
    implements CallbackManager
{
    public static interface Callback
    {

        public abstract boolean onActivityResult(int i, Intent intent);
    }

    public static final class RequestCodeOffset extends Enum
    {

        private static final RequestCodeOffset $VALUES[];
        public static final RequestCodeOffset AppGroupCreate;
        public static final RequestCodeOffset AppGroupJoin;
        public static final RequestCodeOffset AppInvite;
        public static final RequestCodeOffset GameRequest;
        public static final RequestCodeOffset Like;
        public static final RequestCodeOffset Login;
        public static final RequestCodeOffset Message;
        public static final RequestCodeOffset Share;
        private final int offset;

        public static RequestCodeOffset valueOf(String s)
        {
            return (RequestCodeOffset)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
        }

        public static RequestCodeOffset[] values()
        {
            return (RequestCodeOffset[])$VALUES.clone();
        }

        public int toRequestCode()
        {
            return FacebookSdk.getCallbackRequestCodeOffset() + offset;
        }

        static 
        {
            Login = new RequestCodeOffset("Login", 0, 0);
            Share = new RequestCodeOffset("Share", 1, 1);
            Message = new RequestCodeOffset("Message", 2, 2);
            Like = new RequestCodeOffset("Like", 3, 3);
            GameRequest = new RequestCodeOffset("GameRequest", 4, 4);
            AppGroupCreate = new RequestCodeOffset("AppGroupCreate", 5, 5);
            AppGroupJoin = new RequestCodeOffset("AppGroupJoin", 6, 6);
            AppInvite = new RequestCodeOffset("AppInvite", 7, 7);
            $VALUES = (new RequestCodeOffset[] {
                Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite
            });
        }

        private RequestCodeOffset(String s, int i, int j)
        {
            super(s, i);
            offset = j;
        }
    }


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

}
