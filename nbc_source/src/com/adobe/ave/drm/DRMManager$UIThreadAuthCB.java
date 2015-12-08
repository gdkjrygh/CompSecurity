// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.os.Handler;

// Referenced classes of package com.adobe.ave.drm:
//            DRMAuthenticationCompleteCallback, DRMManager

class cb
    implements DRMAuthenticationCompleteCallback
{

    DRMAuthenticationCompleteCallback cb;
    final DRMManager this$0;

    public void AuthenticationComplete(final byte authenticationToken[])
    {
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadAuthCB this$1;
            final byte val$authenticationToken[];

            public void run()
            {
                cb.AuthenticationComplete(authenticationToken);
            }

            
            {
                this$1 = DRMManager.UIThreadAuthCB.this;
                authenticationToken = abyte0;
                super();
            }
        });
    }

    public allback(DRMAuthenticationCompleteCallback drmauthenticationcompletecallback)
    {
        this$0 = DRMManager.this;
        super();
        cb = drmauthenticationcompletecallback;
    }
}
