// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;

public final class NotificationsImpl
    implements Notifications
{
    private static abstract class ContactSettingLoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Notifications.ContactSettingLoadResult() {

                final ContactSettingLoadImpl this$0;
                final Status val$status;

                public final DataHolder getDataHolder()
                {
                    return DataHolder.empty(14);
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_contactsettingloadimpl;
                status = Status.this;
                super();
            }
            };
        }

        private ContactSettingLoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        ContactSettingLoadImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class ContactSettingUpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        private ContactSettingUpdateImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        ContactSettingUpdateImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class InboxCountImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Notifications.InboxCountResult() {

                final InboxCountImpl this$0;
                final Status val$status;

                public final int getActivityCount(String s)
                {
                    return 0;
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final int getTotalCount()
                {
                    return 0;
                }

                public final boolean hasNewActivity()
                {
                    return false;
                }

            
            {
                this$0 = final_inboxcountimpl;
                status = Status.this;
                super();
            }
            };
        }

        private InboxCountImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        InboxCountImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public NotificationsImpl()
    {
    }

    public final void clear(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((IGamesService)googleapiclient.getService()).clearNotifications(i);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void clearFirstParty(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        ((IGamesService)googleapiclient.getService()).clearNotificationsFirstParty(s, i);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult getInboxActivityCounts(GoogleApiClient googleapiclient)
    {
        return googleapiclient.enqueue(new InboxCountImpl(googleapiclient) {

            final NotificationsImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IGamesService)((GamesClientImpl)client).getService()).getInboxActivityCountsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.InboxCountsLoadedBinderCallback(this), null);
            }

            
            {
                this$0 = NotificationsImpl.this;
                super(googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadContactSettingsInternalV2$4b6585cf(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new ContactSettingLoadImpl(false) {

            final NotificationsImpl this$0;
            final boolean val$forceReload = false;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadContactSettingsInternalV2(new com.google.android.gms.games.internal.GamesClientImpl.ContactSettingsLoadedBinderCallback(this), flag);
            }

            
            {
                this$0 = NotificationsImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult muteGameInternal(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new com.google.android.gms.games.Games.BaseGamesApiMethodImpl(s) {

            final NotificationsImpl this$0;
            final String val$externalGameId;

            public final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult() {

                    final _cls1 this$1;
                    final Status val$status;

                    public final String getExternalGameId()
                    {
                        return externalGameId;
                    }

                    public final Status getStatus()
                    {
                        return status;
                    }

                    public final boolean isMuted()
                    {
                        return false;
                    }

            
            {
                this$1 = final__pcls1;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).setGameMuteStatusInternal(this, externalGameId, true);
            }

            
            {
                this$0 = NotificationsImpl.this;
                externalGameId = s;
                super(final_googleapiclient);
            }
        });
    }

    public final void notificationOpenedFirstParty(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        ((IGamesService)googleapiclient.getService()).notificationOpenedFirstParty();
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void setAllowLevelUpNotificationsFirstParty(GoogleApiClient googleapiclient, boolean flag)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((IGamesService)googleapiclient.getService()).setAllowLevelUpNotificationsFirstParty(flag);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final boolean shouldAllowLevelUpNotificationsFirstParty(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).shouldAllowLevelUpNotificationsFirstParty();
    }

    public final PendingResult unmuteGameInternal(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new com.google.android.gms.games.Games.BaseGamesApiMethodImpl(s) {

            final NotificationsImpl this$0;
            final String val$externalGameId;

            public final volatile Result createFailedResult(Status status)
            {
                return status. new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult() {

                    final _cls2 this$1;
                    final Status val$status;

                    public final String getExternalGameId()
                    {
                        return externalGameId;
                    }

                    public final Status getStatus()
                    {
                        return status;
                    }

                    public final boolean isMuted()
                    {
                        return false;
                    }

            
            {
                this$1 = final__pcls2;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).setGameMuteStatusInternal(this, externalGameId, false);
            }

            
            {
                this$0 = NotificationsImpl.this;
                externalGameId = s;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult updateContactSettingsInternal(final GoogleApiClient final_googleapiclient, final boolean enableMobileNotifications, Bundle bundle)
    {
        return final_googleapiclient.execute(new ContactSettingUpdateImpl(bundle) {

            final NotificationsImpl this$0;
            final Bundle val$channelSettings;
            final boolean val$enableMobileNotifications;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = enableMobileNotifications;
                Bundle bundle1 = channelSettings;
                ((IGamesService)client.getService()).updateContactSettingsInternal(new com.google.android.gms.games.internal.GamesClientImpl.ContactSettingsUpdatedBinderCallback(this), flag, bundle1);
            }

            
            {
                this$0 = NotificationsImpl.this;
                enableMobileNotifications = flag;
                channelSettings = bundle;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
