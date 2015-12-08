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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl
    implements Acls
{
    private static abstract class LoadNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new com.google.android.gms.games.internal.game.Acls.LoadAclResult(status) {

                final Status val$status;

                public final DataHolder getDataHolder()
                {
                    return DataHolder.empty(14);
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                status = status1;
                super();
            }
            };
        }

        private LoadNotifyAclImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadNotifyAclImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class UpdateNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        private UpdateNotifyAclImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        UpdateNotifyAclImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public AclsImpl()
    {
    }

    public final PendingResult loadNotifyAclInternal(GoogleApiClient googleapiclient)
    {
        return googleapiclient.enqueue(new LoadNotifyAclImpl(googleapiclient) {

            final AclsImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IGamesService)((GamesClientImpl)client).getService()).loadNotifyAclInternal(new com.google.android.gms.games.internal.GamesClientImpl.NotifyAclLoadedBinderCallback(this));
            }

            
            {
                this$0 = AclsImpl.this;
                super(googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult updateNotifyAclInternal(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new UpdateNotifyAclImpl(s) {

            final AclsImpl this$0;
            final String val$aclData;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = aclData;
                ((IGamesService)client.getService()).updateNotifyAclInternal(new com.google.android.gms.games.internal.GamesClientImpl.NotifyAclUpdatedBinderCallback(this), s1);
            }

            
            {
                this$0 = AclsImpl.this;
                aclData = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
