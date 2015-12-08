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

public final class kn
    implements People
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.People.LoadPeopleResult ao(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

                final a acn;
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
                acn = a1;
                yG = status;
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


    public kn()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.a(googleapiclient, Plus.yE).getCurrentPerson();
    }

    public PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.a(new a(collection) {

            final kn ack;
            final Collection acl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, acl);
            }

            
            {
                ack = kn.this;
                acl = collection;
                super();
            }
        });
    }

    public transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.a(new a(as) {

            final kn ack;
            final String acm[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.d(this, acm);
            }

            
            {
                ack = kn.this;
                acm = as;
                super();
            }
        });
    }

    public PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final kn ack;

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
                ack = kn.this;
                super();
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.a(new a(i, s) {

            final String acc;
            final int acj;
            final kn ack;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.a(this, acj, acc));
            }

            
            {
                ack = kn.this;
                acj = i;
                acc = s;
                super();
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new a(s) {

            final String acc;
            final kn ack;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                a(e1.r(this, acc));
            }

            
            {
                ack = kn.this;
                acc = s;
                super();
            }
        });
    }
}
