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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import java.util.ArrayList;

public final class AppContentsImpl
    implements AppContents
{
    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult() {

                final LoadsImpl this$0;
                final Status val$status;

                public final AppContentSectionBuffer getSections()
                {
                    boolean flag = true;
                    ArrayList arraylist = new ArrayList();
                    DataHolder dataholder = DataHolder.empty(14);
                    arraylist.add(0, dataholder);
                    arraylist.add(1, dataholder);
                    arraylist.add(2, dataholder);
                    arraylist.add(3, dataholder);
                    arraylist.add(4, dataholder);
                    if (arraylist.size() != 6)
                    {
                        flag = false;
                    }
                    Preconditions.checkState(flag, "The number of data holders here should match the number created by the app content agent");
                    return new AppContentSectionBuffer(arraylist);
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public AppContentsImpl()
    {
    }

    public final transient void invalidateAppContentCacheFirstParty(GoogleApiClient googleapiclient, String as[])
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((IGamesService)googleapiclient.getService()).invalidateAppContentCacheFirstParty(as);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult loadFirstParty$6b0b0641(final GoogleApiClient final_googleapiclient, String s, String as[])
    {
        return final_googleapiclient.enqueue(new LoadsImpl(false) {

            final AppContentsImpl this$0;
            final int val$clientVersion = 1;
            final String val$experimentOverride[];
            final boolean val$forceReload = false;
            final String val$screenName;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                int i = clientVersion;
                String s1 = screenName;
                String as1[] = experimentOverride;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadAppContentFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.AppContentLoadedBinderCallbacks(this), i, s1, as1, flag);
            }

            
            {
                this$0 = AppContentsImpl.this;
                screenName = s;
                experimentOverride = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
