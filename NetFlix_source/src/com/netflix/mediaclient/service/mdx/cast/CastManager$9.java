// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;


// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class val.reqUrl
    implements Runnable
{

    final CastManager this$0;
    final String val$msg;
    final String val$reqUrl;
    final String val$uuid;

    public void run()
    {
        CastManager.access$1800(CastManager.this, val$msg, val$uuid, val$reqUrl);
    }

    ()
    {
        this$0 = final_castmanager;
        val$msg = s;
        val$uuid = s1;
        val$reqUrl = String.this;
        super();
    }
}
