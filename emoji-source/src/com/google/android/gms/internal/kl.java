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

public final class kl
    implements Moments
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.Moments.LoadMomentsResult an(Status status)
        {
            return new com.google.android.gms.plus.Moments.LoadMomentsResult(this, status) {

                final a acl;
                final Status yJ;

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
                    return yJ;
                }

                public String getUpdated()
                {
                    return null;
                }

                public void release()
                {
                }

            
            {
                acl = a1;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return an(status);
        }

        private a()
        {
        }

    }

    private static abstract class b extends com.google.android.gms.plus.Plus.a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private b()
        {
        }

    }

    private static abstract class c extends com.google.android.gms.plus.Plus.a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private c()
        {
        }

    }


    public kl()
    {
    }

    public PendingResult load(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final kl ace;

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
                ace = kl.this;
                super();
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        return googleapiclient.a(new a(i, s, uri, s1, s2) {

            final int PM;
            final kl ace;
            final String acf;
            final Uri acg;
            final String ach;
            final String aci;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, PM, acf, acg, ach, aci);
            }

            
            {
                ace = kl.this;
                PM = i;
                acf = s;
                acg = uri;
                ach = s1;
                aci = s2;
                super();
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new b(s) {

            final kl ace;
            final String ack;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.removeMoment(ack);
                b(Status.En);
            }

            
            {
                ace = kl.this;
                ack = s;
                super();
            }
        });
    }

    public PendingResult write(GoogleApiClient googleapiclient, Moment moment)
    {
        return googleapiclient.b(new c(moment) {

            final kl ace;
            final Moment acj;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, acj);
            }

            
            {
                ace = kl.this;
                acj = moment;
                super();
            }
        });
    }
}
