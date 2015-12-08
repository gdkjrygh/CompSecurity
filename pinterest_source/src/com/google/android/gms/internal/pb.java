// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.model.moments.Moment;

public final class pb
    implements Moments
{

    public pb()
    {
    }

    public final PendingResult load(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new _cls1(googleapiclient));
    }

    public final PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        return googleapiclient.a(new _cls2(googleapiclient, i, s, uri, s1, s2));
    }

    public final PendingResult remove(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new _cls4(googleapiclient, s));
    }

    public final PendingResult write(GoogleApiClient googleapiclient, Moment moment)
    {
        return googleapiclient.b(new _cls3(googleapiclient, moment));
    }

    private class _cls1 extends a
    {
        private class a extends com.google.android.gms.plus.Plus.a
        {

            public com.google.android.gms.plus.Moments.LoadMomentsResult aB(Status status)
            {
                class _cls1
                    implements com.google.android.gms.plus.Moments.LoadMomentsResult
                {

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

                    _cls1(Status status)
                    {
                        aog = a.this;
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

            private a(GoogleApiClient googleapiclient)
            {
                super(googleapiclient);
            }

            a(GoogleApiClient googleapiclient, _cls1 _pcls1)
            {
                this(googleapiclient);
            }
        }


        final pb anZ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.j(this);
        }

        _cls1(GoogleApiClient googleapiclient)
        {
            anZ = pb.this;
            super(googleapiclient, null);
        }
    }


    private class _cls2 extends a
    {

        final int aaI;
        final pb anZ;
        final String aoa;
        final Uri aob;
        final String aoc;
        final String aod;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.a(this, aaI, aoa, aob, aoc, aod);
        }

        _cls2(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
        {
            anZ = pb.this;
            aaI = i;
            aoa = s;
            aob = uri;
            aoc = s1;
            aod = s2;
            super(googleapiclient, null);
        }
    }


    private class _cls4 extends b
    {
        private class b extends com.google.android.gms.plus.Plus.a
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

            b(GoogleApiClient googleapiclient, _cls1 _pcls1)
            {
                this(googleapiclient);
            }
        }


        final pb anZ;
        final String aof;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.removeMoment(aof);
            b(Status.Kw);
        }

        _cls4(GoogleApiClient googleapiclient, String s)
        {
            anZ = pb.this;
            aof = s;
            super(googleapiclient, null);
        }
    }


    private class _cls3 extends c
    {
        private class c extends com.google.android.gms.plus.Plus.a
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

            c(GoogleApiClient googleapiclient, _cls1 _pcls1)
            {
                this(googleapiclient);
            }
        }


        final pb anZ;
        final Moment aoe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.a(this, aoe);
        }

        _cls3(GoogleApiClient googleapiclient, Moment moment)
        {
            anZ = pb.this;
            aoe = moment;
            super(googleapiclient, null);
        }
    }

}
