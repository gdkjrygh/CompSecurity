// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy

private class <init> extends TimerTask
{

    final GAServiceProxy this$0;

    public void run()
    {
        if (GAServiceProxy.access$400(GAServiceProxy.this) == CTING)
        {
            GAServiceProxy.access$500(GAServiceProxy.this);
        }
    }

    private ()
    {
        this$0 = GAServiceProxy.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
