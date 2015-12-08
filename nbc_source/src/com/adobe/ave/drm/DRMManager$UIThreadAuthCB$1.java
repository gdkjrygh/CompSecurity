// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMManager, DRMAuthenticationCompleteCallback

class val.authenticationToken
    implements Runnable
{

    final val.authenticationToken this$1;
    final byte val$authenticationToken[];

    public void run()
    {
        .AuthenticationComplete(val$authenticationToken);
    }

    lback()
    {
        this$1 = final_lback;
        val$authenticationToken = _5B_B.this;
        super();
    }
}
