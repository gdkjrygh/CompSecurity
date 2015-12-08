// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.internal:
//            er, eq

private static class dG
    implements er
{

    private IBinder dG;

    public String L(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        dG.transact(5064, parcel, parcel1, 0);
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

    public String M(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        dG.transact(5035, parcel, parcel1, 0);
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

    public void N(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        dG.transact(5050, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public int O(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        dG.transact(5060, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Uri P(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        dG.transact(5066, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Uri)Uri.CREATOR.createFromParcel(parcel1);
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

    public int a(eq eq1, byte abyte0[], String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        eq1 = eq1.asBinder();
_L1:
        int i1;
        parcel.writeStrongBinder(eq1);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(5033, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
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
        dG.transact(5005, parcel, parcel1, 0);
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

    public void a(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, int i1, int j1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(5044, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(5015, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeLong(l1);
        dG.transact(5058, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, Bundle bundle, int i1, int j1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L5:
        parcel.writeStrongBinder(eq1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        dG.transact(5021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
          goto _L5
    }

    public void a(eq eq1, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L6:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(5030, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L6
_L4:
        parcel.writeInt(0);
          goto _L5
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
_L9:
        i1 = 0;
          goto _L7
_L5:
        if (!flag) goto _L9; else goto _L8
_L8:
        i1 = ((flag1) ? 1 : 0);
          goto _L7
    }

    public void a(eq eq1, IBinder ibinder, String s, boolean flag, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeLong(l1);
        dG.transact(5031, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, int i1, int j1, int k1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(5019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L5:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(5025, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
          goto _L5
    }

    public void a(eq eq1, String s, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
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
        dG.transact(5045, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag4;
        flag4 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
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
        dG.transact(6501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeLong(l1);
        dG.transact(5016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, long l1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeLong(l1);
        parcel.writeString(s1);
        dG.transact(7002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L5:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(5023, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
          goto _L5
    }

    public void a(eq eq1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
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
        dG.transact(5039, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(5054, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, String s, boolean flag, long al[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeLongArray(al);
        dG.transact(5011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(eq eq1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(5063, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void a(String s, String s1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i1);
        dG.transact(5051, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public int b(byte abyte0[], String s, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        dG.transact(5034, parcel, parcel1, 0);
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

    public void b(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(5046, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, int i1, int j1, int k1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(5020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L5:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(7003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
          goto _L5
    }

    public void b(eq eq1, String s, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
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
        dG.transact(5501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null) goto _L2; else goto _L1
_L1:
        eq1 = eq1.asBinder();
_L5:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(5024, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        eq1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
          goto _L5
    }

    public void b(eq eq1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(5038, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
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
        dG.transact(5040, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, String s1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6506, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6502, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void b(eq eq1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void bT()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5006, parcel, parcel1, 0);
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

    public d bU()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5013, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        d d1 = d.CREATOR.h(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return d1;
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean bV()
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
        dG.transact(5067, parcel, parcel1, 0);
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

    public d bW()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5502, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        d d1 = d.CREATOR.h(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return d1;
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Bundle ba()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

    public void c(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5022, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void c(eq eq1, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(5048, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void c(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void c(eq eq1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(5041, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void c(eq eq1, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6504, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void c(eq eq1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6503, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void clearNotifications(int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        dG.transact(5036, parcel, parcel1, 0);
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

    public void d(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5026, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void d(eq eq1, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(6003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void d(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void d(eq eq1, String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(6505, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public ParcelFileDescriptor e(Uri uri)
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
        dG.transact(6507, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        uri = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
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

    public void e(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5027, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void e(eq eq1, int i1, boolean flag, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
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
        dG.transact(6004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void e(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5032, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void f(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        dG.transact(5001, parcel, parcel1, 0);
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

    public void f(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5047, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void f(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5037, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void f(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(5065, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void g(long l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        dG.transact(5059, parcel, parcel1, 0);
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

    public void g(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5049, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void g(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5042, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public String getAppId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5003, parcel, parcel1, 0);
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

    public String getCurrentAccountName()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5007, parcel, parcel1, 0);
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

    public String getCurrentPlayerId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        dG.transact(5012, parcel, parcel1, 0);
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

    public void h(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5056, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void h(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5043, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void i(eq eq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        dG.transact(5062, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void i(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5052, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void i(String s, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        dG.transact(5029, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public int j(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        eq1 = eq1.asBinder();
_L1:
        int i1;
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5053, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void j(String s, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        dG.transact(5028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void k(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5061, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void k(String s, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        dG.transact(5055, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void l(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(5057, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void m(eq eq1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (eq1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        eq1 = eq1.asBinder();
_L1:
        parcel.writeStrongBinder(eq1);
        parcel.writeString(s);
        dG.transact(7001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eq1 = null;
          goto _L1
        eq1;
        parcel1.recycle();
        parcel.recycle();
        throw eq1;
    }

    public void setUseNewPlayerNotificationsFirstParty(boolean flag)
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
        dG.transact(5068, parcel, parcel1, 0);
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

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
