// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.ResponderAdapter;

// Referenced classes of package com.addlive.impl:
//            ADLServiceImpl, Log, AerPublisher

class er extends ResponderAdapter
{

    final ADLServiceImpl this$0;
    final String val$cause;
    final String val$credentials;

    public volatile void resultHandler(Object obj)
    {
        resultHandler((String)obj);
    }

    public void resultHandler(String s)
    {
        Log.d("AddLive_SDK", "Sending AER");
        (new AerPublisher(ADLServiceImpl.access$100(ADLServiceImpl.this))).publish(val$credentials, val$cause);
    }

    er()
    {
        this$0 = final_adlserviceimpl;
        val$credentials = s;
        val$cause = String.this;
        super();
    }
}
