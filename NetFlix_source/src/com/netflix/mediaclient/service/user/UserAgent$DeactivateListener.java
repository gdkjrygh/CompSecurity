// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent

private class <init>
    implements EventListener
{

    final UserAgent this$0;

    public void received(UIEvent uievent)
    {
        Log.d("nf_service_useragent", "Received a deactivate event ");
    }

    private ()
    {
        this$0 = UserAgent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
