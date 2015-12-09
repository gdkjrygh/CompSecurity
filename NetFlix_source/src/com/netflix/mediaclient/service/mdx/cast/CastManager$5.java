// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;


// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class val.friendlyName
    implements Runnable
{

    final CastManager this$0;
    final String val$friendlyName;
    final String val$location;
    final String val$uuid;

    public void run()
    {
        CastManager.access$1400(CastManager.this, val$uuid, val$location, val$friendlyName);
    }

    ()
    {
        this$0 = final_castmanager;
        val$uuid = s;
        val$location = s1;
        val$friendlyName = String.this;
        super();
    }
}
