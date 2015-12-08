// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

abstract class gleApiClient extends com.google.android.gms.plus.a
{

    public com.google.android.gms.plus.ts.LoadMomentsResult aB(Status status)
    {
        class _cls1
            implements com.google.android.gms.plus.Moments.LoadMomentsResult
        {

            final Status DS;
            final pb.a aog;

            public MomentBuffer getMomentBuffer()
            {
                return null;
            }

            public String getNextPageToken()
            {
                return null;
            }

            public Status getStatus()
            {
                return DS;
            }

            public String getUpdated()
            {
                return null;
            }

            public void release()
            {
            }

            _cls1(Status status)
            {
                aog = pb.a.this;
                DS = status;
                super();
            }
        }

        return new _cls1(status);
    }

    public Result c(Status status)
    {
        return aB(status);
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
