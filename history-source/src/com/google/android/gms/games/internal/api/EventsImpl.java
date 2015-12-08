// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
    implements Events
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.event.Events.LoadEventsResult O(Status status)
        {
            return new com.google.android.gms.games.event.Events.LoadEventsResult(this, status) {

                final Status DS;
                final LoadImpl aan;

                public EventBuffer getEvents()
                {
                    return new EventBuffer(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                aan = loadimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return O(status);
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result c(Status status)
        {
            return new Result(this, status) {

                final Status DS;
                final UpdateImpl aao;

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                aao = updateimpl;
                DS = status;
                super();
            }
            };
        }

        private UpdateImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public EventsImpl()
    {
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        GamesClientImpl gamesclientimpl = Games.e(googleapiclient);
        if (gamesclientimpl.isConnected())
        {
            gamesclientimpl.o(s, i);
            return;
        } else
        {
            googleapiclient.b(new UpdateImpl(googleapiclient, s, i) {

                final EventsImpl aak;
                final String aal;
                final int aam;

                public volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((GamesClientImpl)a1);
                }

                public void a(GamesClientImpl gamesclientimpl1)
                {
                    gamesclientimpl1.o(aal, aam);
                }

            
            {
                aak = EventsImpl.this;
                aal = s;
                aam = i;
                super(googleapiclient);
            }
            });
            return;
        }
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(googleapiclient, flag) {

            final boolean ZW;
            final EventsImpl aak;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.d(this, ZW);
            }

            
            {
                aak = EventsImpl.this;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.a(new LoadImpl(googleapiclient, flag, as) {

            final boolean ZW;
            final String aaj[];
            final EventsImpl aak;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, ZW, aaj);
            }

            
            {
                aak = EventsImpl.this;
                ZW = flag;
                aaj = as;
                super(googleapiclient);
            }
        });
    }
}
