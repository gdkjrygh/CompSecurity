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
import com.google.android.gms.common.data.f;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesService, IGamesCallbacks

private static class le
    implements IGamesService
{

    private IBinder le;

    public void O(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5068, parcel, parcel1, 0);
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

    public void P(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12026, parcel, parcel1, 0);
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

    public void Q(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(13001, parcel, parcel1, 0);
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

    public int a(IGamesCallbacks igamescallbacks, byte abyte0[], String s1, String s2)
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
        int i1;
        parcel.writeStrongBinder(igamescallbacks);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(5033, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public Intent a(int i1, int j1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(9008, parcel, parcel1, 0);
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

    public Intent a(int i1, byte abyte0[], int j1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(j1);
        parcel.writeString(s1);
        le.transact(10012, parcel, parcel1, 0);
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

    public Intent a(AchievementEntity achievemententity)
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
        le.transact(13005, parcel, parcel1, 0);
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

    public Intent a(ZInvitationCluster zinvitationcluster, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(10021, parcel, parcel1, 0);
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

    public Intent a(GameRequestCluster gamerequestcluster, String s1)
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
        parcel.writeString(s1);
        le.transact(10022, parcel, parcel1, 0);
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

    public Intent a(RoomEntity roomentity, int i1)
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
        parcel.writeInt(i1);
        le.transact(9011, parcel, parcel1, 0);
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

    public Intent a(String s1, boolean flag, boolean flag1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (flag1)
        {
            j1 = ((flag2) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeInt(i1);
        le.transact(12001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeTypedArray(aparticipantentity, 0);
        parcel.writeString(s1);
        parcel.writeString(s2);
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
        le.transact(9031, parcel, parcel1, 0);
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

    public Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeTypedArray(aparticipantentity, 0);
        parcel.writeString(s1);
        parcel.writeString(s2);
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
        parcel.writeString(s3);
        le.transact(14003, parcel, parcel1, 0);
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

    public void a(long l1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(8019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void a(IBinder ibinder, Bundle bundle)
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
        le.transact(5005, parcel, parcel1, 0);
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

    public void a(Contents contents)
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
        le.transact(12019, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks)
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
        le.transact(5002, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1)
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
        parcel.writeInt(i1);
        le.transact(10016, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, int j1, int k1)
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
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        le.transact(10009, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, int j1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5044, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, int j1, String as[], Bundle bundle)
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
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(8004, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, String s1, String as[], boolean flag)
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
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(14002, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5015, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int i1, int ai[])
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
        parcel.writeInt(i1);
        parcel.writeIntArray(ai);
        le.transact(10018, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, long l1)
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
        parcel.writeLong(l1);
        le.transact(5058, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, long l1, String s1)
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
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(8018, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, Bundle bundle, int i1, int j1)
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
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        le.transact(5021, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
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
        parcel.writeInt(i1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
          goto _L5
_L7:
        parcel.writeInt(i1);
        parcel.writeLong(l1);
        le.transact(5030, parcel, parcel1, 0);
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
        i1 = 0;
          goto _L7
_L5:
        if (!flag) goto _L9; else goto _L8
_L8:
        i1 = ((flag1) ? 1 : 0);
          goto _L7
    }

    public void a(IGamesCallbacks igamescallbacks, IBinder ibinder, String s1, boolean flag, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeLong(l1);
        le.transact(5031, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5014, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(10011, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5019, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(5025, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(8023, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5045, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag3)
        {
            i1 = ((flag4) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(6501, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int i1, int ai[])
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeIntArray(ai);
        le.transact(10019, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, long l1)
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
        parcel.writeString(s1);
        parcel.writeLong(l1);
        le.transact(5016, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, long l1, String s2)
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
        parcel.writeString(s1);
        parcel.writeLong(l1);
        parcel.writeString(s2);
        le.transact(7002, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
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
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(5023, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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
        parcel.writeString(s1);
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
        le.transact(12007, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(5038, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        le.transact(8001, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        le.transact(10010, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5039, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(9028, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
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
        le.transact(12033, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6002, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int ai[], int i1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeIntArray(ai);
        parcel.writeInt(i1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12015, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[])
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        le.transact(10008, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[], boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12028, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5054, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], String s2, ParticipantResult aparticipantresult[])
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
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s2);
        parcel.writeTypedArray(aparticipantresult, 0);
        le.transact(8007, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
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
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        parcel.writeTypedArray(aparticipantresult, 0);
        le.transact(8008, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, int ai[])
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
        parcel.writeString(s1);
        parcel.writeIntArray(ai);
        le.transact(8017, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String s1, String as[], int i1, byte abyte0[], int j1)
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
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeInt(i1);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(j1);
        le.transact(10005, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6001, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 1;
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
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(5063, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, boolean flag, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeStringArray(as);
        le.transact(12031, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int ai[])
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
        le.transact(8003, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, int ai[], int i1, boolean flag)
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
        parcel.writeInt(i1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12010, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String as[])
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
        le.transact(10006, parcel, parcel1, 0);
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

    public void a(IGamesCallbacks igamescallbacks, String as[], boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12029, parcel, parcel1, 0);
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

    public void a(String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        le.transact(13002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    public int b(byte abyte0[], String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeByteArray(abyte0);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        le.transact(5034, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public Intent b(int i1, int j1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(9009, parcel, parcel1, 0);
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

    public Intent b(int ai[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeIntArray(ai);
        le.transact(12030, parcel, parcel1, 0);
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

    public void b(long l1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(8021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void b(IGamesCallbacks igamescallbacks)
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
        le.transact(5017, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5046, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, long l1)
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
        parcel.writeLong(l1);
        le.transact(8012, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, long l1, String s1)
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
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(8020, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5018, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, int i1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(12023, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5020, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(7003, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(10017, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5501, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
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
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(5024, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(5041, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(5040, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(12018, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6506, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6502, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6503, parcel, parcel1, 0);
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

    public void b(IGamesCallbacks igamescallbacks, String as[])
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
        le.transact(10007, parcel, parcel1, 0);
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

    public void b(String s1, String s2, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        le.transact(5051, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public Intent bE(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(12034, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public String bG(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(5064, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public String bH(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(5035, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void bI(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(5050, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public int bJ(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(5060, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public Uri bK(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(5066, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Uri)Uri.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void bL(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(8002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public Intent bM(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(9004, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public ParcelFileDescriptor bN(String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        le.transact(9030, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void c(long l1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(10004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void c(IGamesCallbacks igamescallbacks)
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
        le.transact(5022, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(5048, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, long l1)
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
        parcel.writeLong(l1);
        le.transact(10001, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, long l1, String s1)
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
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(10003, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5032, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1, int i1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(12024, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(9001, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(8011, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12003, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6504, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(8027, parcel, parcel1, 0);
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

    public void c(IGamesCallbacks igamescallbacks, String as[])
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
        le.transact(10020, parcel, parcel1, 0);
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

    public void c(String s1, String s2, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i1);
        le.transact(8026, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void d(long l1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(12014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void d(IGamesCallbacks igamescallbacks)
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
        le.transact(5026, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(6003, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, long l1)
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
        parcel.writeLong(l1);
        le.transact(12011, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, long l1, String s1)
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
        parcel.writeLong(l1);
        parcel.writeString(s1);
        le.transact(12013, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5037, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(9020, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(8015, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(6505, parcel, parcel1, 0);
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

    public void d(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12002, parcel, parcel1, 0);
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

    public void dT(int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        le.transact(5036, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks)
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
        le.transact(5027, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
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
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(6004, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5042, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(12021, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(8016, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12006, parcel, parcel1, 0);
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

    public void e(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12032, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks)
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
        le.transact(5047, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5043, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
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
        parcel.writeString(s1);
        parcel.writeInt(i1);
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (flag1)
        {
            i1 = ((flag2) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        le.transact(12022, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks, String s1, String s2)
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
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(12009, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(13006, parcel, parcel1, 0);
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

    public void f(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(12016, parcel, parcel1, 0);
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

    public Bundle fX()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5004, parcel, parcel1, 0);
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

    public void g(IGamesCallbacks igamescallbacks)
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
        le.transact(5049, parcel, parcel1, 0);
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

    public void g(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5052, parcel, parcel1, 0);
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

    public void g(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(13003, parcel, parcel1, 0);
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

    public ParcelFileDescriptor h(Uri uri)
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
        le.transact(6507, parcel, parcel1, 0);
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

    public RoomEntity h(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
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
        parcel.writeString(s1);
        le.transact(5053, parcel, parcel1, 0);
        parcel1.readException();
        igamescallbacks = obj;
        if (parcel1.readInt() != 0)
        {
            igamescallbacks = (RoomEntity)RoomEntity.CREATOR.FromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return igamescallbacks;
        igamescallbacks = null;
          goto _L1
        igamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamescallbacks;
    }

    public void h(IGamesCallbacks igamescallbacks)
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
        le.transact(5056, parcel, parcel1, 0);
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

    public void h(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
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
            i1 = 1;
        }
        parcel.writeInt(i1);
        le.transact(13004, parcel, parcel1, 0);
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

    public void i(IGamesCallbacks igamescallbacks)
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
        le.transact(5062, parcel, parcel1, 0);
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

    public void i(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5061, parcel, parcel1, 0);
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

    public void j(IGamesCallbacks igamescallbacks)
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
        le.transact(11001, parcel, parcel1, 0);
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

    public void j(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(5057, parcel, parcel1, 0);
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

    public void k(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(7001, parcel, parcel1, 0);
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

    public void l(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(8005, parcel, parcel1, 0);
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

    public int lA()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(10023, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int lB()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(12035, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int lC()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(12036, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void lE()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5006, parcel, parcel1, 0);
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

    public DataHolder lG()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5013, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        DataHolder dataholder = DataHolder.CREATOR.B(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return dataholder;
_L2:
        dataholder = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean lH()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5067, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
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

    public DataHolder lI()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5502, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        DataHolder dataholder = DataHolder.CREATOR.B(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return dataholder;
_L2:
        dataholder = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void lJ()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(8022, parcel, parcel1, 0);
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

    public Intent lK()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9013, parcel, parcel1, 0);
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

    public void lL()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(11002, parcel, parcel1, 0);
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

    public boolean lM()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(12025, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
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

    public String lh()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String li()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5012, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Intent ll()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9003, parcel, parcel1, 0);
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

    public Intent lm()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9005, parcel, parcel1, 0);
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

    public Intent ln()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9006, parcel, parcel1, 0);
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

    public Intent lo()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9007, parcel, parcel1, 0);
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

    public Intent lt()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9010, parcel, parcel1, 0);
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

    public Intent lu()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9012, parcel, parcel1, 0);
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

    public int lv()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(9019, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String lw()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int lx()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(8024, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Intent ly()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(10015, parcel, parcel1, 0);
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

    public int lz()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        le.transact(10013, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void m(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(8006, parcel, parcel1, 0);
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

    public void n(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(8009, parcel, parcel1, 0);
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

    public void o(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(8010, parcel, parcel1, 0);
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

    public void o(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(12017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void p(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(8014, parcel, parcel1, 0);
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

    public void p(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(5029, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void q(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        le.transact(5001, parcel, parcel1, 0);
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

    public void q(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(9002, parcel, parcel1, 0);
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

    public void q(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(5028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void r(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        le.transact(5059, parcel, parcel1, 0);
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

    public void r(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(12020, parcel, parcel1, 0);
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

    public void s(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        le.transact(8013, parcel, parcel1, 0);
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

    public void s(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(12005, parcel, parcel1, 0);
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

    public void s(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(5055, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void t(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        le.transact(10002, parcel, parcel1, 0);
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

    public void t(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(12027, parcel, parcel1, 0);
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

    public void t(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(10014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void t(String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(5065, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public Intent u(String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeInt(i1);
        le.transact(14001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Intent)Intent.CREATOR.FromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void u(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        le.transact(12012, parcel, parcel1, 0);
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

    public void u(IGamesCallbacks igamescallbacks, String s1)
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
        parcel.writeString(s1);
        le.transact(12008, parcel, parcel1, 0);
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

    public void u(String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(8025, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    ity(IBinder ibinder)
    {
        le = ibinder;
    }
}
