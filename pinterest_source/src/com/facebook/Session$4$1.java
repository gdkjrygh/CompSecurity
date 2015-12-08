// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


class usCallback
    implements Runnable
{

    final l.exception this$1;
    final usCallback val$callback;

    public void run()
    {
        val$callback.call(_fld0, newState, exception);
    }

    usCallback()
    {
        this$1 = final_uscallback;
        val$callback = usCallback.this;
        super();
    }
}
