// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.games.video.VideoConfiguration;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.client:
//            IPlayGamesService, IPlayGamesCallbacks

public static abstract class attachInterface extends Binder
    implements IPlayGamesService
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IPlayGamesService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.client.IPlayGamesService");
        if (iinterface != null && (iinterface instanceof IPlayGamesService))
        {
            return (IPlayGamesService)iinterface;
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
            parcel1.writeString("com.google.android.gms.games.client.IPlayGamesService");
            return true;

        case 1001: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks = b.asInterface(parcel.readStrongBinder());
            i = parcel.readInt();
            j = parcel.readInt();
            boolean flag;
            boolean flag5;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            loadGameCollection(iplaygamescallbacks, i, j, flag, flag5);
            parcel1.writeNoException();
            return true;

        case 1002: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            loadGame(b.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1003: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks1 = b.asInterface(parcel.readStrongBinder());
            String s = parcel.readString();
            i = parcel.readInt();
            boolean flag1;
            boolean flag6;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            loadRecentlyPlayedGames(iplaygamescallbacks1, s, i, flag1, flag6);
            parcel1.writeNoException();
            return true;

        case 1004: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks2 = b.asInterface(parcel.readStrongBinder());
            String s1 = parcel.readString();
            i = parcel.readInt();
            boolean flag2;
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            loadCommonGames(iplaygamescallbacks2, s1, i, flag2, flag7);
            parcel1.writeNoException();
            return true;

        case 1005: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks3 = b.asInterface(parcel.readStrongBinder());
            String s2 = parcel.readString();
            i = parcel.readInt();
            boolean flag3;
            boolean flag8;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            loadDisjointGames(iplaygamescallbacks3, s2, i, flag3, flag8);
            parcel1.writeNoException();
            return true;

        case 1006: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks4 = b.asInterface(parcel.readStrongBinder());
            String s3 = parcel.readString();
            i = parcel.readInt();
            boolean flag4;
            boolean flag9;
            if (parcel.readInt() != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            searchForGames(iplaygamescallbacks4, s3, i, flag4, flag9);
            parcel1.writeNoException();
            return true;

        case 1007: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            loadExperiments(b.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 1008: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            logEvent(parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 2002: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            IPlayGamesCallbacks iplaygamescallbacks5 = b.asInterface(parcel.readStrongBinder());
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (VideoConfiguration)VideoConfiguration.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            launchGameForRecording(iplaygamescallbacks5, s4, s5, parcel);
            parcel1.writeNoException();
            return true;

        case 2003: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            listVideos(b.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3001: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesService");
            parcel = getExperiments();
            parcel1.writeNoException();
            parcel1.writeList(parcel);
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.games.client.IPlayGamesService");
    }
}
