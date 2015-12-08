// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class pc
    implements People
{

    public pc()
    {
    }

    public final Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.a(googleapiclient, Plus.DQ).getCurrentPerson();
    }

    public final PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.a(new _cls4(googleapiclient, collection));
    }

    public final transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.a(new _cls5(googleapiclient, as));
    }

    public final PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new _cls3(googleapiclient));
    }

    public final PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.a(new _cls1(googleapiclient, i, s));
    }

    public final PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new _cls2(googleapiclient, s));
    }

    private class _cls4 extends a
    {
        private class a extends com.google.android.gms.plus.Plus.a
        {

            public com.google.android.gms.plus.People.LoadPeopleResult aC(Status status)
            {
                class _cls1
                    implements com.google.android.gms.plus.People.LoadPeopleResult
                {

                    final Status DS;
                    final a aol;

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

                    _cls1(Status status)
                    {
                        aol = a.this;
                        DS = status;
                        super();
                    }
                }

                return new _cls1(status);
            }

            public Result c(Status status)
            {
                return aC(status);
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


        final pc aoi;
        final Collection aoj;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.a(this, aoj);
        }

        _cls4(GoogleApiClient googleapiclient, Collection collection)
        {
            aoi = pc.this;
            aoj = collection;
            super(googleapiclient, null);
        }
    }


    private class _cls5 extends a
    {

        final pc aoi;
        final String aok[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.d(this, aok);
        }

        _cls5(GoogleApiClient googleapiclient, String as[])
        {
            aoi = pc.this;
            aok = as;
            super(googleapiclient, null);
        }
    }


    private class _cls3 extends a
    {

        final pc aoi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.k(this);
        }

        _cls3(GoogleApiClient googleapiclient)
        {
            aoi = pc.this;
            super(googleapiclient, null);
        }
    }


    private class _cls1 extends a
    {

        final String aoa;
        final int aoh;
        final pc aoi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            a(e1.a(this, aoh, aoa));
        }

        _cls1(GoogleApiClient googleapiclient, int i, String s)
        {
            aoi = pc.this;
            aoh = i;
            aoa = s;
            super(googleapiclient, null);
        }
    }


    private class _cls2 extends a
    {

        final String aoa;
        final pc aoi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            a(e1.q(this, aoa));
        }

        _cls2(GoogleApiClient googleapiclient, String s)
        {
            aoi = pc.this;
            aoa = s;
            super(googleapiclient, null);
        }
    }

}
