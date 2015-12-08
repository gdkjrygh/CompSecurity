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

public final class pc
    implements People
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.People.LoadPeopleResult aC(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

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

            
            {
                aol = a1;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aC(status);
        }

        private a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public pc()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.a(googleapiclient, Plus.DQ).getCurrentPerson();
    }

    public PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.a(new a(googleapiclient, collection) {

            final pc aoi;
            final Collection aoj;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, aoj);
            }

            
            {
                aoi = pc.this;
                aoj = collection;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.a(new a(googleapiclient, as) {

            final pc aoi;
            final String aok[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.d(this, aok);
            }

            
            {
                aoi = pc.this;
                aok = as;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a(googleapiclient) {

            final pc aoi;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.k(this);
            }

            
            {
                aoi = pc.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.a(new a(googleapiclient, i, s) {

            final String aoa;
            final int aoh;
            final pc aoi;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.a(this, aoh, aoa));
            }

            
            {
                aoi = pc.this;
                aoh = i;
                aoa = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new a(googleapiclient, s) {

            final String aoa;
            final pc aoi;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.q(this, aoa));
            }

            
            {
                aoi = pc.this;
                aoa = s;
                super(googleapiclient);
            }
        });
    }
}
