// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

private static abstract class <init> extends com.google.android.gms.games.odImpl
{

    public Result c(Status status)
    {
        return new Result(status) {

            final EventsImpl.UpdateImpl Pp;
            final Status yG;

            public Status getStatus()
            {
                return yG;
            }

            
            {
                Pp = EventsImpl.UpdateImpl.this;
                yG = status;
                super();
            }
        };
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
