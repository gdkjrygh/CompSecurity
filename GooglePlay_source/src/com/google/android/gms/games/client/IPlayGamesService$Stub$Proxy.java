// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.games.video.VideoConfiguration;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.client:
//            IPlayGamesService, IPlayGamesCallbacks

private static final class mRemote
    implements IPlayGamesService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final List getExperiments()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        java.util.ArrayList arraylist;
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        mRemote.transact(3001, parcel, parcel1, 0);
        parcel1.readException();
        arraylist = parcel1.readArrayList(getClass().getClassLoader());
        parcel1.recycle();
        parcel.recycle();
        return arraylist;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void launchGameForRecording(IPlayGamesCallbacks iplaygamescallbacks, String s, String s1, VideoConfiguration videoconfiguration)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null) goto _L2; else goto _L1
_L1:
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(iplaygamescallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (videoconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        videoconfiguration.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(2002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        iplaygamescallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
          goto _L5
    }

    public final void listVideos(IPlayGamesCallbacks iplaygamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
        parcel.writeString(s);
        mRemote.transact(2003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadCommonGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
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
        mRemote.transact(1004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadDisjointGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
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
        mRemote.transact(1005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadExperiments(IPlayGamesCallbacks iplaygamescallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
        mRemote.transact(1007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadGame(IPlayGamesCallbacks iplaygamescallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
        parcel.writeString(s);
        mRemote.transact(1002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadGameCollection(IPlayGamesCallbacks iplaygamescallbacks, int i, int j, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
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
        mRemote.transact(1001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void loadRecentlyPlayedGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
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
        mRemote.transact(1003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    public final void logEvent(String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        mRemote.transact(1008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void searchForGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesService");
        if (iplaygamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        iplaygamescallbacks = iplaygamescallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iplaygamescallbacks);
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
        mRemote.transact(1006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iplaygamescallbacks = null;
          goto _L1
        iplaygamescallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iplaygamescallbacks;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
