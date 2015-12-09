// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;


// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class val.id
    implements Runnable
{

    final CastManager this$0;
    final String val$id;

    public void run()
    {
        CastManager.access$1600(CastManager.this, false, val$id);
    }

    ()
    {
        this$0 = final_castmanager;
        val$id = String.this;
        super();
    }
}
