// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.pandora.android.view:
//            SlidingDrawer

private class <init> extends Handler
{

    final SlidingDrawer a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1000: 
            SlidingDrawer.c(a);
            break;
        }
    }

    private (SlidingDrawer slidingdrawer)
    {
        a = slidingdrawer;
        super();
    }

    a(SlidingDrawer slidingdrawer, a a1)
    {
        this(slidingdrawer);
    }
}
