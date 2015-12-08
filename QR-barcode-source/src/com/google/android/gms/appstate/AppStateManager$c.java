// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager, AppStateBuffer

private static abstract class <init> extends <init>
{

    public Result c(Status status)
    {
        return h(status);
    }

    public ateListResult h(Status status)
    {
        return new AppStateManager.StateListResult(status) {

            final Status CW;
            final AppStateManager.c Dc;

            public AppStateBuffer getStateBuffer()
            {
                return new AppStateBuffer(null);
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Dc = AppStateManager.c.this;
                CW = status;
                super();
            }
        };
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
