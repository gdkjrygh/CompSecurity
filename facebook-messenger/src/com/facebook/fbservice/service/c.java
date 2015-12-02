// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.executors.i;
import com.facebook.common.executors.j;
import javax.inject.a;

class c
    implements a
{

    private String a;

    public c(String s)
    {
        a = s;
    }

    public i a()
    {
        HandlerThread handlerthread = new HandlerThread(a);
        handlerthread.start();
        return new j(new Handler(handlerthread.getLooper()));
    }

    public Object b()
    {
        return a();
    }
}
