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

public final class km
    implements Moments
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public com.google.android.gms.plus.Moments.LoadMomentsResult an(Status status)
        {
            return new com.google.android.gms.plus.Moments.LoadMomentsResult(this, status) {

                final a aci;
                final Status yG;

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
                    return yG;
                }

                public String getUpdated()
                {
                    return null;
                }

                public void release()
                {
                }

            
            {
                aci = a1;
                yG = status;
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


    public km()
    {
    }

    public PendingResult load(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final km acb;

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
                acb = km.this;
                super();
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        return googleapiclient.a(new a(i, s, uri, s1, s2) {

            final int PJ;
            final km acb;
            final String acc;
            final Uri acd;
            final String ace;
            final String acf;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, PJ, acc, acd, ace, acf);
            }

            
            {
                acb = km.this;
                PJ = i;
                acc = s;
                acd = uri;
                ace = s1;
                acf = s2;
                super();
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new b(s) {

            final km acb;
            final String ach;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.removeMoment(ach);
                b(Status.Ek);
            }

            
            {
                acb = km.this;
                ach = s;
                super();
            }
        });
    }

    public PendingResult write(GoogleApiClient googleapiclient, Moment moment)
    {
        return googleapiclient.b(new c(moment) {

            final km acb;
            final Moment acg;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.a(this, acg);
            }

            
            {
                acb = km.this;
                acg = moment;
                super();
            }
        });
    }
}
