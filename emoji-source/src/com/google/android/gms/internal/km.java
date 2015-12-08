// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class km
    implements People
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.People.LoadPeopleResult ao(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

                final a acq;
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
                acq = a1;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ao(status);
        }

        private a()
        {
        }

    }


    public km()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.a(googleapiclient, Plus.yH).getCurrentPerson();
    }

    public PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.a(new a(collection) {

            final km acn;
            final Collection aco;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, aco);
            }

            
            {
                acn = km.this;
                aco = collection;
                super();
            }
        });
    }

    public transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.a(new a(as) {

            final km acn;
            final String acp[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.d(this, acp);
            }

            
            {
                acn = km.this;
                acp = as;
                super();
            }
        });
    }

    public PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final km acn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.l(this);
            }

            
            {
                acn = km.this;
                super();
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.a(new a(i, s) {

            final String acf;
            final int acm;
            final km acn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.a(this, acm, acf));
            }

            
            {
                acn = km.this;
                acm = i;
                acf = s;
                super();
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new a(s) {

            final String acf;
            final km acn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.r(this, acf));
            }

            
            {
                acn = km.this;
                acf = s;
                super();
            }
        });
    }
}
