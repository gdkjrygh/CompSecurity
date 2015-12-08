// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            kn

private static abstract class <init> extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.e.LoadPeopleResult ao(Status status)
    {
        return new com.google.android.gms.plus.People.LoadPeopleResult(status) {

            final kn.a acn;
            final Status yG;

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
                return yG;
            }

            public void release()
            {
            }

            
            {
                acn = kn.a.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ao(status);
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
