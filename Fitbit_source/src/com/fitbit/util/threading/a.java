// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;

import com.fitbit.galileo.legacy.connection.ConnectionStateContext;
import java.util.Timer;

public class a extends Timer
{

    public a()
    {
    }

    public void a(ConnectionStateContext connectionstatecontext, a a1, long l)
    {
        schedule(new _cls1(connectionstatecontext, a1), l);
    }

    // Unreferenced inner class com/fitbit/util/threading/a$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls1 {}

}
