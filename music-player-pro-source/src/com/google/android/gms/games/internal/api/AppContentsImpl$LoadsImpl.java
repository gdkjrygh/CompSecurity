// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AppContentsImpl

private static abstract class _cls1.DS extends com.google.android.gms.games.pl
{

    public com.google.android.gms.games.appcontent.Result N(Status status)
    {
        return new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult(status) {

            final Status DS;
            final AppContentsImpl.LoadsImpl aai;

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                aai = AppContentsImpl.LoadsImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return N(status);
    }
}
