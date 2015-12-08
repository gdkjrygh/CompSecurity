// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public final class pb
    implements Moments
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.Moments.LoadMomentsResult aB(Status status)
        {
            return new com.google.android.gms.plus.Moments.LoadMomentsResult(this, status) {

                final Status DS;
                final a aog;

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

            
            {
                aog = a1;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aB(status);
        }

        private a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class b extends com.google.android.gms.plus.Plus.a
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class c extends com.google.android.gms.plus.Plus.a
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public pb()
    {
    }

    public PendingResult load(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a(googleapiclient) {

            final pb anZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.j(this);
            }

            
            {
                anZ = pb.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        return googleapiclient.a(new a(googleapiclient, i, s, uri, s1, s2) {

            final int aaI;
            final pb anZ;
            final String aoa;
            final Uri aob;
            final String aoc;
            final String aod;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, aaI, aoa, aob, aoc, aod);
            }

            
            {
                anZ = pb.this;
                aaI = i;
                aoa = s;
                aob = uri;
                aoc = s1;
                aod = s2;
                super(googleapiclient);
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new b(googleapiclient, s) {

            final pb anZ;
            final String aof;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.removeMoment(aof);
                b(Status.Kw);
            }

            
            {
                anZ = pb.this;
                aof = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult write(GoogleApiClient googleapiclient, Moment moment)
    {
        return googleapiclient.b(new c(googleapiclient, moment) {

            final pb anZ;
            final Moment aoe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, aoe);
            }

            
            {
                anZ = pb.this;
                aoe = moment;
                super(googleapiclient);
            }
        });
    }
}
