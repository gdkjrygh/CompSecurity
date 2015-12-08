// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            km

private static abstract class <init> extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.e.LoadPeopleResult ao(Status status)
    {
        return new com.google.android.gms.plus.People.LoadPeopleResult(status) {

            final km.a acq;
            final Status yJ;

            public String getNextPageToken()
            {
                return null;
            }

            public PersonBuffer getPersonBuffer()
            {
                return null;
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                acq = km.a.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ao(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
