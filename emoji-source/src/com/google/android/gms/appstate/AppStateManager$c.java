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

            final Status yJ;
            final AppStateManager.c yP;

            public AppStateBuffer getStateBuffer()
            {
                return new AppStateBuffer(null);
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                yP = AppStateManager.c.this;
                yJ = status;
                super();
            }
        };
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
