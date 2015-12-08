// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            pc

private static abstract class gleApiClient extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.e.LoadPeopleResult aC(Status status)
    {
        return new com.google.android.gms.plus.People.LoadPeopleResult(status) {

            final Status DS;
            final pc.a aol;

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
                return DS;
            }

            public void release()
            {
            }

            
            {
                aol = pc.a.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return aC(status);
    }

    private gleApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    gleApiClient(GoogleApiClient googleapiclient, gleApiClient gleapiclient)
    {
        this(googleapiclient);
    }
}
