// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal:
//            IPeopleService, IPeopleCallbacks, ParcelableLoadImageOptions

private static final class mRemote
    implements IPeopleService
{

    private IBinder mRemote;

    public final void addCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(701, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void addCircle26(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        mRemote.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void addPeopleToCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        mRemote.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void blockPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void identityGetByIds(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, List list, ParcelableGetOptions parcelablegetoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (accounttoken == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        accounttoken.writeToParcel(parcel, 0);
_L6:
        parcel.writeStringList(list);
        if (parcelablegetoptions == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        parcel.writeInt(1);
        parcelablegetoptions.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
        parcel.writeInt(0);
          goto _L7
    }

    public final ICancelToken identityList(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, ParcelableListOptions parcelablelistoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (accounttoken == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        accounttoken.writeToParcel(parcel, 0);
_L6:
        if (parcelablelistoptions == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        parcel.writeInt(1);
        parcelablelistoptions.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(601, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
        parcel.writeInt(0);
          goto _L7
    }

    public final void internalCall(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(304, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final boolean isSyncToContactsEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        mRemote.transact(16, parcel, parcel1, 0);
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

    public final void loadAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(101, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadAutocompleteList(IPeopleCallbacks ipeoplecallbacks, String s, String s1, boolean flag, String s2, String s3, int i, 
            int j, int k, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(507, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadAvatar(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(502, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadAvatarByReference(IPeopleCallbacks ipeoplecallbacks, AvatarReference avatarreference, ParcelableLoadImageOptions parcelableloadimageoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (avatarreference == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        avatarreference.writeToParcel(parcel, 0);
_L6:
        if (parcelableloadimageoptions == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        parcel.writeInt(1);
        parcelableloadimageoptions.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(508, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
        parcel.writeInt(0);
          goto _L7
    }

    public final void loadAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadContactImage(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(503, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadContactImageLegacy(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadContactsGaiaIds(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(403, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadContactsGaiaIds24(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadLog(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(302, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final ICancelToken loadOwnerAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(505, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadOwnerAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(506, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadOwnerCoverPhotoLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(301, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadOwners(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
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
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(305, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadOwners1(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        int i;
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
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeople(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeInt(i1);
        mRemote.transact(404, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeople20(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        mRemote.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeople400(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        parcel.writeInt(k);
        mRemote.transact(401, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleForAggregation(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1, int l, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(l);
        parcel.writeInt(i1);
        mRemote.transact(402, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleForAggregation200(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        parcel.writeInt(i);
        parcel.writeInt(j);
        mRemote.transact(201, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleForAggregation201(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        mRemote.transact(202, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleForAggregation202(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        mRemote.transact(203, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleForAggregation8(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int j;
        j = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            j = 1;
        }
        parcel.writeInt(j);
        parcel.writeInt(i);
        mRemote.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleLive(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        mRemote.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadPeopleOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final ICancelToken loadPhoneNumbers(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(1201, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final ICancelToken loadRemoteImage(IPeopleCallbacks ipeoplecallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        mRemote.transact(504, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void loadRemoteImageLegacy(IPeopleCallbacks ipeoplecallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        mRemote.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final Bundle registerDataChangedListener(IPeopleCallbacks ipeoplecallbacks, boolean flag, String s, String s1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int j;
        j = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (flag)
        {
            j = 1;
        }
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        mRemote.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L4; else goto _L3
_L3:
        ipeoplecallbacks = (Bundle)Bundle.CREATOR.romParcel(parcel1);
_L6:
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        ipeoplecallbacks = null;
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final void removeCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        mRemote.transact(204, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final Bundle requestSync(String s, String s1, long l, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        int i;
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
        mRemote.transact(205, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final Bundle requestSyncOld(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final Bundle requestSyncOld19(String s, String s1, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        mRemote.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final Bundle requestSyncOld25(String s, String s1, long l, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final ICancelToken sendAutocompleteFeedback(IPeopleCallbacks ipeoplecallbacks, DataHolder dataholder, int i, int j, long l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        if (dataholder == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeLong(l);
        mRemote.transact(602, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final ICancelToken sendInteractionFeedback(IPeopleCallbacks ipeoplecallbacks, String s, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeInt(i);
        mRemote.transact(509, parcel, parcel1, 0);
        parcel1.readException();
        ipeoplecallbacks = com.google.android.gms.common.internal.ace(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ipeoplecallbacks;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void setAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_138;
_L6:
        parcel.writeInt(i);
        mRemote.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
        break MISSING_BLOCK_LABEL_138;
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
        while (!flag) 
        {
            i = 0;
            break;
        }
          goto _L6
    }

    public final void setAvatarOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final void setHasShownAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(102, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void setSyncToContactsEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(15, parcel, parcel1, 0);
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

    public final void setSyncToContactsSettings(IPeopleCallbacks ipeoplecallbacks, String s, boolean flag, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        mRemote.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void starPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        mRemote.transact(603, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final Bundle startSync(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final Bundle syncRawContact(Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L3:
        mRemote.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        uri = (Bundle)Bundle.CREATOR.romParcel(parcel1);
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

    public final void updateCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, int i, String s4)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeInt(i);
        parcel.writeString(s4);
        mRemote.transact(303, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    public final void updatePersonCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeStringList(list1);
        if (favadiagnosticsentity == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        favadiagnosticsentity.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ipeoplecallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
          goto _L5
    }

    public final void updatePersonCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (ipeoplecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(ipeoplecallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeStringList(list1);
        mRemote.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ipeoplecallbacks = null;
          goto _L1
        ipeoplecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw ipeoplecallbacks;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
