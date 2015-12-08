// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesService, IGamesCallbacks, IGamesClient

private static final class mRemote
    implements IGamesService
{

    private IBinder mRemote;

    public final void acceptQuest(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(12008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void acceptRequests(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStringArray(as);
        mRemote.transact(10006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void acceptTurnBasedInvitation(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(8006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void acceptTurnBasedInvitationFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(8016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void cancelPopups()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5006, parcel, parcel1, 0);
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

    public final void cancelTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(8009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void claimMilestone(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(12009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void clearNotifications(int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
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

    public final void clearNotificationsFirstParty(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(5055, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void clearPendingEvents()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(15504, parcel, parcel1, 0);
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

    public final void clientDisconnecting(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(5001, parcel, parcel1, 0);
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

    public final void commitAndCloseSnapshot(IGamesCallbacks igamescallbacks, String s, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
        if (contents == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        parcel.writeInt(1);
        contents.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(12007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
        parcel.writeInt(0);
          goto _L7
    }

    public final ParcelFileDescriptor createNativeSocket(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(9030, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void createRoom(IGamesCallbacks igamescallbacks, IBinder ibinder, int i, String as[], Bundle bundle, boolean flag, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L6:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
          goto _L5
_L7:
        parcel.writeInt(i);
        parcel.writeLong(l);
        mRemote.transact(5030, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L6
_L4:
        parcel.writeInt(0);
          goto _L5
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
_L9:
        i = 0;
          goto _L7
_L5:
        if (!flag) goto _L9; else goto _L8
_L8:
        i = ((flag1) ? 1 : 0);
          goto _L7
    }

    public final String createSocketConnection(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(5035, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void createTurnBasedMatch(IGamesCallbacks igamescallbacks, int i, int j, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(8004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void declineInvitation(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(5028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void declineInvitationFirstParty(String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(5051, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void deleteSnapshot(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(12020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void discardSnapshotContents(Contents contents)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (contents == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        parcel.writeInt(1);
        contents.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(12019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        contents;
        parcel1.recycle();
        parcel.recycle();
        throw contents;
    }

    public final void dismissInvitation(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(5029, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void dismissInvitationFirstParty(String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(8026, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void dismissMatch(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(8002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void dismissPlayerSuggestionFirstParty(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(5050, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void dismissRequests(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStringArray(as);
        mRemote.transact(10007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void dismissRequestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        mRemote.transact(10008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void dismissTurnBasedMatchFirstParty(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(8025, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void finishTurnBasedMatch(IGamesCallbacks igamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        parcel.writeTypedArray(aparticipantresult, 0);
        mRemote.transact(8008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final Intent getAchievementDescriptionIntentRestricted(AchievementEntity achievemententity)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (achievemententity == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        achievemententity.writeToParcel(parcel, 0);
_L3:
        mRemote.transact(13005, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        achievemententity = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return achievemententity;
_L2:
        parcel.writeInt(0);
          goto _L3
        achievemententity;
        parcel1.recycle();
        parcel.recycle();
        throw achievemententity;
        achievemententity = null;
          goto _L4
    }

    public final Intent getAchievementsIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9005, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getAllLeaderboardsIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9003, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final String getAppId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getCompareProfileIntent(PlayerEntity playerentity)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (playerentity == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        playerentity.writeToParcel(parcel, 0);
_L3:
        mRemote.transact(15503, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        playerentity = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return playerentity;
_L2:
        parcel.writeInt(0);
          goto _L3
        playerentity;
        parcel1.recycle();
        parcel.recycle();
        throw playerentity;
        playerentity = null;
          goto _L4
    }

    public final Bundle getConnectionHint()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final String getCurrentAccountName()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final DataHolder getCurrentGame()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5502, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = DataHolder.CREATOR;
        obj = DataHolderCreator.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((DataHolder) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final DataHolder getCurrentPlayer()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5013, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = DataHolder.CREATOR;
        obj = DataHolderCreator.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((DataHolder) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final String getCurrentPlayerId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5012, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void getGamesAuthToken(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(19001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final Uri getGamesContentUriRestricted(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(5066, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Uri)Uri.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void getInboxActivityCountsFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(12027, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final Intent getInvitationInboxIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9007, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getLeaderboardIntent(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(9004, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final Intent getLeaderboardIntentV2(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(14001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final Intent getLeaderboardIntentV3(String s, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(18001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void getLeaderboardScore(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(8001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final Intent getMatchInboxIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9006, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getMaxRequestLifetimeDays()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(10023, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getMaxRequestPayloadSize()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(10013, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getMaxSnapshotCoverImageBytes()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(12036, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getMaxSnapshotDataBytes()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(12035, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getMaxTurnBasedMatchDataSize()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(8024, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getParcelCompatIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9013, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final ParcelFileDescriptor getParcelFileDescriptorFirstParty(Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L3:
        mRemote.transact(6507, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        uri = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uri;
_L2:
        parcel.writeInt(0);
          goto _L3
        uri;
        parcel1.recycle();
        parcel.recycle();
        throw uri;
        uri = null;
          goto _L4
    }

    public final Intent getParticipantListIntentRestricted(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeTypedArray(aparticipantentity, 0);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L5:
        if (uri1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri1.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(9031, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        aparticipantentity = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L7:
        parcel1.recycle();
        parcel.recycle();
        return aparticipantentity;
_L2:
        parcel.writeInt(0);
          goto _L5
        aparticipantentity;
        parcel1.recycle();
        parcel.recycle();
        throw aparticipantentity;
_L4:
        parcel.writeInt(0);
          goto _L6
        aparticipantentity = null;
          goto _L7
    }

    public final Intent getParticipantListIntentRestrictedV2(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeTypedArray(aparticipantentity, 0);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L5:
        if (uri1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s2);
        mRemote.transact(14003, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        aparticipantentity = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L7:
        parcel1.recycle();
        parcel.recycle();
        return aparticipantentity;
_L2:
        parcel.writeInt(0);
          goto _L5
        aparticipantentity;
        parcel1.recycle();
        parcel.recycle();
        throw aparticipantentity;
_L4:
        parcel.writeInt(0);
          goto _L6
        aparticipantentity = null;
          goto _L7
    }

    public final Intent getPlayerSearchIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9010, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getPlusUpgradeIntentFirstParty()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(16001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getPublicInvitationListIntentRestricted(ZInvitationCluster zinvitationcluster, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (zinvitationcluster == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zinvitationcluster.writeToParcel(parcel, 0);
_L3:
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(10021, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        zinvitationcluster = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return zinvitationcluster;
_L2:
        parcel.writeInt(0);
          goto _L3
        zinvitationcluster;
        parcel1.recycle();
        parcel.recycle();
        throw zinvitationcluster;
        zinvitationcluster = null;
          goto _L4
    }

    public final Intent getPublicRequestListIntentRestricted(GameRequestCluster gamerequestcluster, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (gamerequestcluster == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        gamerequestcluster.writeToParcel(parcel, 0);
_L3:
        parcel.writeString(s);
        mRemote.transact(10022, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        gamerequestcluster = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return gamerequestcluster;
_L2:
        parcel.writeInt(0);
          goto _L3
        gamerequestcluster;
        parcel1.recycle();
        parcel.recycle();
        throw gamerequestcluster;
        gamerequestcluster = null;
          goto _L4
    }

    public final Intent getQuestIntent(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(12034, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final Intent getQuestsIntent(int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeIntArray(ai);
        mRemote.transact(12030, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        ai = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ai;
_L2:
        ai = null;
        if (true) goto _L4; else goto _L3
_L3:
        ai;
        parcel1.recycle();
        parcel.recycle();
        throw ai;
    }

    public final Intent getRealTimeSelectOpponentsIntent(int i, int j, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(9009, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getRealTimeWaitingRoomIntent(RoomEntity roomentity, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (roomentity == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        roomentity.writeToParcel(parcel, 0);
_L3:
        parcel.writeInt(i);
        mRemote.transact(9011, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        roomentity = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return roomentity;
_L2:
        parcel.writeInt(0);
          goto _L3
        roomentity;
        parcel1.recycle();
        parcel.recycle();
        throw roomentity;
        roomentity = null;
          goto _L4
    }

    public final Intent getRequestInboxIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(10015, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getSdkVariant()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9019, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getSelectSnapshotIntent(String s, boolean flag, boolean flag1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (flag1)
        {
            j = ((flag2) ? 1 : 0);
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeInt(i);
        mRemote.transact(12001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final String getSelectedAccountForGameRestricted(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(5064, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final Intent getSendRequestIntent(int i, byte abyte0[], int j, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(j);
        parcel.writeString(s);
        mRemote.transact(10012, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        abyte0 = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
_L2:
        abyte0 = null;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public final Intent getSettingsIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(9012, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void getTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(8014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final Intent getTurnBasedSelectOpponentsIntent(int i, int j, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(9008, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Intent getVideoOverlayRecordingIntent()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(19002, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Intent intent = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void incrementAchievement(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(5025, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void incrementEvent(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(12017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void invalidateAppContentCacheFirstParty(String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeStringArray(as);
        mRemote.transact(15002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    public final void isGameMutedInternal(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5061, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void joinRoom(IGamesCallbacks igamescallbacks, IBinder ibinder, String s, boolean flag, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        mRemote.transact(5031, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void launchGameForRecordingRestricted(IGamesCallbacks igamescallbacks, String s, String s1, VideoConfiguration videoconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (videoconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        videoconfiguration.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(19003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void leaveRoom(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5032, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void leaveTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(8010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void leaveTurnBasedMatchDuringTurn(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(8011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void listVideos(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(19004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadAchievements(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5022, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadAchievementsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(5041, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadAchievementsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadAchievementsV2(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadAppContentFirstParty(IGamesCallbacks igamescallbacks, int i, String s, String as[], boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(14002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadCircledPlayersFirstParty(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5048, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadCommonGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(12021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadConnectedPlayers(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(8027, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadConnectedPlayersFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(8023, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadContactSettingsInternal(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5062, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadContactSettingsInternalV2(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12032, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadDisjointGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(12022, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadEvents(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadEventsById(IGamesCallbacks igamescallbacks, boolean flag, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        mRemote.transact(12031, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadGame(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5026, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadGameCollectionFirstParty(IGamesCallbacks igamescallbacks, int i, int j, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        parcel.writeInt(j);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5044, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadGameFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5042, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadGameInstancesFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5043, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadGameSearchSuggestionsFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(9002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitablePlayers(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5015, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitablePlayersFirstParty(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5046, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitationFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(7001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitations(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5027, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitationsFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5052, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitationsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6502, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitationsFirstPartyV3(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(10017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadInvitationsV2(IGamesCallbacks igamescallbacks, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        mRemote.transact(10016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboard(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(5038, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardFirstPartyV2(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6506, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6504, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboards(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardsFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5037, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6505, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadLeaderboardsV2(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6503, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadMoreScores(IGamesCallbacks igamescallbacks, Bundle bundle, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(5021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void loadMoreXpStreamFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(12024, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadNamedGameCollectionFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag4;
        flag4 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag3)
        {
            i = ((flag4) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(6501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadNotifyAclInternal(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5056, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadOwnerCoverPhotoUrisFirstParty(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(11001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayer(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayerCenteredScores(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayerCenteredScoresFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5040, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayerStats(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(17001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayerV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(13006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayers(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(9020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayersArray(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStringArray(as);
        mRemote.transact(10020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayersFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(12018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadPlayersInternal(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(9028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadProfileSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(13003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadQuests(IGamesCallbacks igamescallbacks, int ai[], int i, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeIntArray(ai);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadQuestsById(IGamesCallbacks igamescallbacks, String as[], boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeStringArray(as);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12029, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadQuestsByIdFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, String as[], boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadQuestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int ai[], int i, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeIntArray(ai);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12015, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRecentPlayersFirstParty(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5047, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRecentPlayersFirstPartyV2(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(6003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRecentlyPlayedGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5045, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRequestSummariesFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(10011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRequests(IGamesCallbacks igamescallbacks, int i, int j, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        mRemote.transact(10009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadRequestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        mRemote.transact(10010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadSnapshots(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadSnapshotsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadSuggestedPlayersFirstParty(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5049, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadSuggestedPlayersFirstPartyV2(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(6004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTopScores(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTopScoresFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5039, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTurnBasedMatches(IGamesCallbacks igamescallbacks, int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeIntArray(ai);
        mRemote.transact(8003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTurnBasedMatchesFirstParty(IGamesCallbacks igamescallbacks, String s, int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeIntArray(ai);
        mRemote.transact(8017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTurnBasedMatchesFirstPartyV2(IGamesCallbacks igamescallbacks, String s, int i, int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeIntArray(ai);
        mRemote.transact(10019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadTurnBasedMatchesV2(IGamesCallbacks igamescallbacks, int i, int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeInt(i);
        parcel.writeIntArray(ai);
        mRemote.transact(10018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadXpForGameCategoriesFirstParty(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(12005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void loadXpStreamFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(12023, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void notificationOpenedFirstParty()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(8022, parcel, parcel1, 0);
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

    public final void openSnapshot(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void openSnapshotV2(IGamesCallbacks igamescallbacks, String s, boolean flag, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int j;
        j = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            j = 1;
        }
        parcel.writeInt(j);
        parcel.writeInt(i);
        mRemote.transact(15001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void recordPlayerSuggestionActionFirstParty(String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(10014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void registerInvitationListener(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        mRemote.transact(5058, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerInvitationListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(8018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerInvitationPopupListenerRestricted(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(15502, parcel, parcel1, 0);
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

    public final void registerMatchUpdateListener(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        mRemote.transact(8012, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerMatchUpdateListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(8020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerPopupLocationInfoListener(IGamesClient igamesclient, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamesclient == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        igamesclient = igamesclient.asBinder();
_L1:
        parcel.writeStrongBinder(igamesclient);
        parcel.writeLong(l);
        mRemote.transact(15501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamesclient = null;
          goto _L1
        igamesclient;
        parcel1.recycle();
        parcel.recycle();
        throw igamesclient;
    }

    public final void registerQuestUpdateListener(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        mRemote.transact(12011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerQuestUpdateListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(12013, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerRequestListener(IGamesCallbacks igamescallbacks, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        mRemote.transact(10001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void registerRequestListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(10003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final RoomEntity registerWaitingRoomListenerRestricted(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5053, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L4; else goto _L3
_L3:
        igamescallbacks = (RoomEntity)RoomEntity.CREATOR.FromParcel(parcel1);
_L6:
        parcel1.recycle();
        parcel.recycle();
        return igamescallbacks;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        igamescallbacks = null;
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void rematchTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(8005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void rematchTurnBasedMatchFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(8015, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void resolveSnapshotConflict(IGamesCallbacks igamescallbacks, String s, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
        if (contents == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        parcel.writeInt(1);
        contents.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(12033, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
        parcel.writeInt(0);
          goto _L7
    }

    public final void revealAchievement(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(5023, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void searchForGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(9001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void searchForPlayersInternal(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(5501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final int sendReliableMessage(IGamesCallbacks igamescallbacks, byte abyte0[], String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(5033, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void sendRequestRestricted(IGamesCallbacks igamescallbacks, String s, String as[], int i, byte abyte0[], int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(j);
        mRemote.transact(10005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final int sendUnreliableMessage(byte abyte0[], String s, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        mRemote.transact(5034, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public final void setAchievementSteps(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(7003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void setAllowLevelUpNotificationsFirstParty(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(12026, parcel, parcel1, 0);
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

    public final void setGameMuteStatusInternal(IGamesCallbacks igamescallbacks, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5054, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void setIdentitySharingConfirmedInternal()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(11002, parcel, parcel1, 0);
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

    public final void setNearbyPlayerDetectionEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(13001, parcel, parcel1, 0);
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

    public final void setUseNewPlayerNotificationsFirstParty(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(5068, parcel, parcel1, 0);
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

    public final boolean shouldAllowLevelUpNotificationsFirstParty()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(12025, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean shouldUseNewPlayerNotificationsFirstParty()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        mRemote.transact(5067, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void showQuestStateChangedPopup(String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(13002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void showWelcomePopup(IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeStrongBinder(ibinder);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ibinder;
        parcel1.recycle();
        parcel.recycle();
        throw ibinder;
    }

    public final void signOut(IGamesCallbacks igamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        mRemote.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void submitScore(IGamesCallbacks igamescallbacks, String s, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeLong(l);
        mRemote.transact(5016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void submitScoreV2(IGamesCallbacks igamescallbacks, String s, long l, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeLong(l);
        parcel.writeString(s1);
        mRemote.transact(7002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void unlockAchievement(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(5024, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void unregisterInvitationListener(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(5059, parcel, parcel1, 0);
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

    public final void unregisterInvitationListenerFirstParty(long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(8019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void unregisterMatchUpdateListener(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(8013, parcel, parcel1, 0);
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

    public final void unregisterMatchUpdateListenerFirstParty(long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(8021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void unregisterQuestUpdateListener(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(12012, parcel, parcel1, 0);
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

    public final void unregisterQuestUpdateListenerFirstParty(long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(12014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void unregisterRequestListener(long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        mRemote.transact(10002, parcel, parcel1, 0);
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

    public final void unregisterRequestListenerFirstParty(long l, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l);
        parcel.writeString(s);
        mRemote.transact(10004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final int unregisterWaitingRoomListenerRestricted(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        mRemote.transact(5060, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void updateContactSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
        igamescallbacks = igamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igamescallbacks);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(5063, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
          goto _L5
    }

    public final void updateNotifyAclInternal(IGamesCallbacks igamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        mRemote.transact(5057, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void updateProfileSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(13004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public final void updateSelectedAccountForGameRestricted(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(5065, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void updateTurnBasedMatch(IGamesCallbacks igamescallbacks, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (igamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        igamescallbacks = igamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s1);
        parcel.writeTypedArray(aparticipantresult, 0);
        mRemote.transact(8007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    ity(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
