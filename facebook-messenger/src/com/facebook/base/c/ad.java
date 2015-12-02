// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.os.HandlerThread;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            b

class ad extends d
{

    private ad()
    {
    }

    ad(b b1)
    {
        this();
    }

    public HandlerThread a()
    {
        HandlerThread handlerthread = new HandlerThread("background_handler_thread");
        handlerthread.start();
        return handlerthread;
    }

    public Object b()
    {
        return a();
    }
}
