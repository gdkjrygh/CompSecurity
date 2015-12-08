// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            nt

private static abstract class <init> extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.e.LoadPeopleResult aD(Status status)
    {
        return new com.google.android.gms.plus.People.LoadPeopleResult(status) {

            final Status CW;
            final nt.a ama;

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
                return CW;
            }

            public void release()
            {
            }

            
            {
                ama = nt.a.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return aD(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
