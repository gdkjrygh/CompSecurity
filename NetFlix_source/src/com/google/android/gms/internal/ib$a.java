// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            ib

private static abstract class <init> extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.e.LoadPeopleResult ab(Status status)
    {
        return new com.google.android.gms.plus.People.LoadPeopleResult(status) {

            final ib.a UH;
            final Status wz;

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
                return wz;
            }

            public void release()
            {
            }

            
            {
                UH = ib.a.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return ab(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
