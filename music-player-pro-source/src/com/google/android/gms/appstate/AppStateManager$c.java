// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager, AppStateBuffer

private static abstract class <init> extends <init>
{

    public Result c(Status status)
    {
        return g(status);
    }

    public ateListResult g(Status status)
    {
        return new AppStateManager.StateListResult(status) {

            final Status DS;
            final AppStateManager.c DY;

            public AppStateBuffer getStateBuffer()
            {
                return new AppStateBuffer(null);
            }

            public Status getStatus()
            {
                return DS;
            }

            
            {
                DY = AppStateManager.c.this;
                DS = status;
                super();
            }
        };
    }

    public _cls1.DS(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
