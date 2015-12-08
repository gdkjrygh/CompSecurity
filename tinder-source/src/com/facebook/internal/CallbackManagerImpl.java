// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import com.facebook.d;
import com.facebook.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            n

public final class CallbackManagerImpl
    implements d
{
    public static final class RequestCodeOffset extends Enum
    {

        public static final RequestCodeOffset a;
        public static final RequestCodeOffset b;
        public static final RequestCodeOffset c;
        public static final RequestCodeOffset d;
        public static final RequestCodeOffset e;
        public static final RequestCodeOffset f;
        public static final RequestCodeOffset g;
        public static final RequestCodeOffset h;
        private static final RequestCodeOffset j[];
        private final int i;

        public static RequestCodeOffset valueOf(String s)
        {
            return (RequestCodeOffset)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
        }

        public static RequestCodeOffset[] values()
        {
            return (RequestCodeOffset[])j.clone();
        }

        public final int a()
        {
            return com.facebook.g.m() + i;
        }

        static 
        {
            a = new RequestCodeOffset("Login", 0, 0);
            b = new RequestCodeOffset("Share", 1, 1);
            c = new RequestCodeOffset("Message", 2, 2);
            d = new RequestCodeOffset("Like", 3, 3);
            e = new RequestCodeOffset("GameRequest", 4, 4);
            f = new RequestCodeOffset("AppGroupCreate", 5, 5);
            g = new RequestCodeOffset("AppGroupJoin", 6, 6);
            h = new RequestCodeOffset("AppInvite", 7, 7);
            j = (new RequestCodeOffset[] {
                a, b, c, d, e, f, g, h
            });
        }

        private RequestCodeOffset(String s, int k, int l)
        {
            super(s, k);
            i = l;
        }
    }

    public static interface a
    {

        public abstract boolean a(int i, Intent intent);
    }


    private static Map b = new HashMap();
    public Map a;

    public CallbackManagerImpl()
    {
        a = new HashMap();
    }

    private static a a(Integer integer)
    {
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorenter ;
        integer = (a)b.get(integer);
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorexit ;
        return integer;
        integer;
        throw integer;
    }

    public static void a(int i, a a1)
    {
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorenter ;
        boolean flag;
        n.a(a1, "callback");
        flag = b.containsKey(Integer.valueOf(i));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/internal/CallbackManagerImpl;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.put(Integer.valueOf(i), a1);
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    public final boolean a(int i, int j, Intent intent)
    {
        a a1 = (a)a.get(Integer.valueOf(i));
        if (a1 != null)
        {
            return a1.a(j, intent);
        }
        a1 = a(Integer.valueOf(i));
        if (a1 != null)
        {
            return a1.a(j, intent);
        } else
        {
            return false;
        }
    }

}
