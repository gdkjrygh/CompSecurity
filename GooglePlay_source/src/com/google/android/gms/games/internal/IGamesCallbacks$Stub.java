// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesCallbacks

public static abstract class attachInterface extends Binder
    implements IGamesCallbacks
{
    private static final class Proxy
        implements IGamesCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onAchievementUpdated(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onAchievementsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onAuthTokenLoaded(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onConnectedToRoom(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onContactSettingsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onContactSettingsUpdated(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            mRemote.transact(5040, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onDisconnectedFromRoom(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onEventsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onExtendedGamesLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onExtendedPlayersLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onGameInstancesLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onGameMuteStatusChanged(int i, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(5034, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onGameMuteStatusLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onGameSearchSuggestionsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(9001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onGamesLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onInboxCountsLoaded(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final void onInvitationReceived(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onInvitationRemoved(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s);
            mRemote.transact(8010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onInvitationsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onJoinedRoom(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onLaunchGameForRecording(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            mRemote.transact(17002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onLeaderboardScoresLoaded(DataHolder dataholder, DataHolder dataholder1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (dataholder1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcel.writeInt(1);
            dataholder1.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onLeaderboardsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onLeftRoom(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(5020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onLoadAppContent(DataHolder adataholder[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeTypedArray(adataholder, 0);
            mRemote.transact(14001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            adataholder;
            parcel1.recycle();
            parcel.recycle();
            throw adataholder;
        }

        public final void onMessageSent(int i, int j, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeString(s);
            mRemote.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onMilestoneClaimed(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onNotifyAclLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onNotifyAclUpdated(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            mRemote.transact(5036, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onOwnerCoverPhotoUrisLoaded(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(11001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final void onP2PConnected(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s);
            mRemote.transact(6001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onP2PDisconnected(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s);
            mRemote.transact(6002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onPeerConnected(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPeerDeclined(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPeerDisconnected(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPeerInvitedToRoom(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPeerJoinedRoom(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPeerLeftRoom(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            mRemote.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPlayerLeaderboardScoreLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPlayerStatsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(15001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onPlayersLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onProfileSettingsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(13001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onProfileSettingsUpdated(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            mRemote.transact(13002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onQuestAccepted(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onQuestCompleted(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onQuestLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onQuestsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (realtimemessage == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            realtimemessage.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            realtimemessage;
            parcel1.recycle();
            parcel.recycle();
            throw realtimemessage;
        }

        public final void onRequestReceived(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRequestRemoved(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s);
            mRemote.transact(10002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onRequestSent(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRequestSummariesLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRequestsLoaded(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final void onRequestsUpdated(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRoomAutoMatching(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRoomConnected(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRoomConnecting(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onRoomCreated(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onScoreSubmitted(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onSignOutComplete()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            mRemote.transact(5016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onSnapshotCommitted(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onSnapshotConflict(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            if (contents == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L8:
            if (contents1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            contents1.writeToParcel(parcel, 0);
_L9:
            if (contents2 == null)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            parcel.writeInt(1);
            contents2.writeToParcel(parcel, 0);
_L10:
            mRemote.transact(12017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            parcel.writeInt(0);
              goto _L10
        }

        public final void onSnapshotDeleted(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(12012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onSnapshotOpened(DataHolder dataholder, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(12004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onSnapshotsLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchCanceled(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(8007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onTurnBasedMatchInitiated(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchLeft(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchReceived(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchRemoved(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s);
            mRemote.transact(8009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onTurnBasedMatchUpdated(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onTurnBasedMatchesLoaded(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final void onVideosLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(17001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onXpForGameCategoriesLoaded(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final void onXpStreamLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12013, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IGamesCallbacks asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        if (iinterface != null && (iinterface instanceof IGamesCallbacks))
        {
            return (IGamesCallbacks)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onAuthTokenLoaded(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onAchievementsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onAchievementUpdated(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator1 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLeaderboardsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj;
            if (parcel.readInt() != 0)
            {
                obj = DataHolder.CREATOR;
                obj = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator43 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLeaderboardScoresLoaded(((DataHolder) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 5006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator2 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onScoreSubmitted(parcel);
            parcel1.writeNoException();
            return true;

        case 5007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator3 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onPlayersLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator4 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onExtendedPlayersLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5009: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator5 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGamesLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5010: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator6 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onExtendedGamesLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5011: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator7 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGameInstancesLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5016: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onSignOutComplete();
            parcel1.writeNoException();
            return true;

        case 5017: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator8 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onInvitationsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5037: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator9 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onInvitationReceived(parcel);
            parcel1.writeNoException();
            return true;

        case 5018: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator10 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRoomCreated(parcel);
            parcel1.writeNoException();
            return true;

        case 5019: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator11 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onJoinedRoom(parcel);
            parcel1.writeNoException();
            return true;

        case 5020: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onLeftRoom(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5021: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator12 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRoomConnecting(parcel);
            parcel1.writeNoException();
            return true;

        case 5022: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator13 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRoomAutoMatching(parcel);
            parcel1.writeNoException();
            return true;

        case 5023: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator14 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRoomConnected(parcel);
            parcel1.writeNoException();
            return true;

        case 5024: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator15 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onConnectedToRoom(parcel);
            parcel1.writeNoException();
            return true;

        case 5025: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator16 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDisconnectedFromRoom(parcel);
            parcel1.writeNoException();
            return true;

        case 5026: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj1;
            if (parcel.readInt() != 0)
            {
                obj1 = DataHolder.CREATOR;
                obj1 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj1 = null;
            }
            onPeerInvitedToRoom(((DataHolder) (obj1)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5027: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj2;
            if (parcel.readInt() != 0)
            {
                obj2 = DataHolder.CREATOR;
                obj2 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj2 = null;
            }
            onPeerJoinedRoom(((DataHolder) (obj2)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5028: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj3;
            if (parcel.readInt() != 0)
            {
                obj3 = DataHolder.CREATOR;
                obj3 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj3 = null;
            }
            onPeerLeftRoom(((DataHolder) (obj3)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5029: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj4;
            if (parcel.readInt() != 0)
            {
                obj4 = DataHolder.CREATOR;
                obj4 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj4 = null;
            }
            onPeerDeclined(((DataHolder) (obj4)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5030: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj5;
            if (parcel.readInt() != 0)
            {
                obj5 = DataHolder.CREATOR;
                obj5 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj5 = null;
            }
            onPeerConnected(((DataHolder) (obj5)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5031: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj6;
            if (parcel.readInt() != 0)
            {
                obj6 = DataHolder.CREATOR;
                obj6 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj6 = null;
            }
            onPeerDisconnected(((DataHolder) (obj6)), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5032: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (RealTimeMessage)RealTimeMessage.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRealTimeMessageReceived(parcel);
            parcel1.writeNoException();
            return true;

        case 5033: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onMessageSent(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5034: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            String s = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onGameMuteStatusChanged(i, s, flag);
            parcel1.writeNoException();
            return true;

        case 5038: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator17 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGameMuteStatusLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5035: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator18 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onNotifyAclLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5036: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onNotifyAclUpdated(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5039: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator19 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onContactSettingsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 5040: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onContactSettingsUpdated(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onP2PConnected(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onP2PDisconnected(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator20 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onPlayerLeaderboardScoreLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 8002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchesLoaded(i, parcel);
            parcel1.writeNoException();
            return true;

        case 8003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator21 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 8004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator22 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchInitiated(parcel);
            parcel1.writeNoException();
            return true;

        case 8005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator23 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchUpdated(parcel);
            parcel1.writeNoException();
            return true;

        case 8006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator24 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchLeft(parcel);
            parcel1.writeNoException();
            return true;

        case 8007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onTurnBasedMatchCanceled(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator25 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTurnBasedMatchReceived(parcel);
            parcel1.writeNoException();
            return true;

        case 8009: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onTurnBasedMatchRemoved(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8010: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onInvitationRemoved(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 9001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator26 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGameSearchSuggestionsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 10001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator27 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRequestReceived(parcel);
            parcel1.writeNoException();
            return true;

        case 10002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onRequestRemoved(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 10003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator28 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRequestsUpdated(parcel);
            parcel1.writeNoException();
            return true;

        case 10004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator29 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRequestSent(parcel);
            parcel1.writeNoException();
            return true;

        case 10005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRequestsLoaded(i, parcel);
            parcel1.writeNoException();
            return true;

        case 10006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator30 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onRequestSummariesLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 11001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onOwnerCoverPhotoUrisLoaded(i, parcel);
            parcel1.writeNoException();
            return true;

        case 12001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator31 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSnapshotsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 12004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj7;
            if (parcel.readInt() != 0)
            {
                obj7 = DataHolder.CREATOR;
                obj7 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj7 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Contents)Contents.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSnapshotOpened(((DataHolder) (obj7)), parcel);
            parcel1.writeNoException();
            return true;

        case 12017: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            Object obj8;
            Contents contents;
            Contents contents1;
            String s1;
            if (parcel.readInt() != 0)
            {
                obj8 = DataHolder.CREATOR;
                obj8 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj8 = null;
            }
            s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                contents = (Contents)Contents.CREATOR.eateFromParcel(parcel);
            } else
            {
                contents = null;
            }
            if (parcel.readInt() != 0)
            {
                contents1 = (Contents)Contents.CREATOR.eateFromParcel(parcel);
            } else
            {
                contents1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Contents)Contents.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSnapshotConflict(((DataHolder) (obj8)), s1, contents, contents1, parcel);
            parcel1.writeNoException();
            return true;

        case 12005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator32 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSnapshotCommitted(parcel);
            parcel1.writeNoException();
            return true;

        case 12012: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onSnapshotDeleted(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onXpForGameCategoriesLoaded(i, parcel);
            parcel1.writeNoException();
            return true;

        case 12013: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator33 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onXpStreamLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 12011: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator34 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onEventsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 12006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator35 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onMilestoneClaimed(parcel);
            parcel1.writeNoException();
            return true;

        case 12007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator36 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onQuestAccepted(parcel);
            parcel1.writeNoException();
            return true;

        case 12014: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator37 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onQuestCompleted(parcel);
            parcel1.writeNoException();
            return true;

        case 12016: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator38 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onQuestLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 12008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator39 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onQuestsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 12015: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onInboxCountsLoaded(i, parcel);
            parcel1.writeNoException();
            return true;

        case 13001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator40 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onProfileSettingsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 13002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onProfileSettingsUpdated(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 14001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onLoadAppContent((DataHolder[])parcel.createTypedArray(DataHolder.CREATOR));
            parcel1.writeNoException();
            return true;

        case 15001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator41 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onPlayerStatsLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 17001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator42 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onVideosLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 17002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            onLaunchGameForRecording(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }
}
