// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.common.eventbus.TypedEvent;
import com.facebook.common.eventbus.TypedHandler;

public class Handler extends TypedEvent
{

    private void a(Handler handler)
    {
        class Handler
            implements TypedHandler
        {

            public abstract void h();
        }

        handler.h();
    }

    public final volatile void a(TypedHandler typedhandler)
    {
        a((Handler)typedhandler);
    }

    public Handler()
    {
    }
}
