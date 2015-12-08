// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;


// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class val.uuid
    implements Runnable
{

    final CastManager this$0;
    final String val$uuid;

    public void run()
    {
        CastManager.access$1500(CastManager.this, val$uuid);
    }

    ()
    {
        this$0 = final_castmanager;
        val$uuid = String.this;
        super();
    }
}
