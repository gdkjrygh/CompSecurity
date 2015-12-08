// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fk, ec, ed, fh

public static abstract class a.dG extends Binder
    implements fk
{
    private static class a
        implements fk
    {

        private IBinder dG;

        public void a(ec ec1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (ec1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ec1.writeToParcel(parcel, 0);
_L1:
            dG.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ec1;
            parcel1.recycle();
            parcel.recycle();
            throw ec1;
        }

        public void a(fh fh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            dG.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void a(fh fh1, int i, int j, int k, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeString(s);
            dG.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void a(fh fh1, int i, String s, Uri uri, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null) goto _L2; else goto _L1
_L1:
            fh1 = fh1.asBinder();
_L5:
            parcel.writeStrongBinder(fh1);
            parcel.writeInt(i);
            parcel.writeString(s);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s1);
            parcel.writeString(s2);
            dG.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            fh1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
              goto _L5
        }

        public void a(fh fh1, Uri uri, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null) goto _L2; else goto _L1
_L1:
            fh1 = fh1.asBinder();
_L5:
            parcel.writeStrongBinder(fh1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            dG.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            fh1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(fh fh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeString(s);
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void a(fh fh1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void a(fh fh1, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeStringList(list);
            dG.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public void b(fh fh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            dG.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void b(fh fh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeString(s);
            dG.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public void c(fh fh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeString(s);
            dG.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public String cW()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            dG.transact(41, parcel, parcel1, 0);
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

        public boolean cX()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            dG.transact(42, parcel, parcel1, 0);
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

        public String cY()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            dG.transact(43, parcel, parcel1, 0);
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

        public void clearDefaultAccount()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            dG.transact(6, parcel, parcel1, 0);
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

        public void d(fh fh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (fh1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            fh1 = fh1.asBinder();
_L1:
            parcel.writeStrongBinder(fh1);
            parcel.writeString(s);
            dG.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fh1 = null;
              goto _L1
            fh1;
            parcel1.recycle();
            parcel.recycle();
            throw fh1;
        }

        public String getAccountName()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            dG.transact(5, parcel, parcel1, 0);
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

        public void removeMoment(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcel.writeString(s);
            dG.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public static fk aq(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        if (iinterface != null && (iinterface instanceof fk))
        {
            return (fk)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Uri uri = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(an(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(an(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            b(an(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            if (parcel.readInt() != 0)
            {
                parcel = ec.CREATOR.s(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            parcel = getAccountName();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            clearDefaultAccount();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(an(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            fh fh = an(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                uri = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(fh, uri, parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            fh fh1 = an(parcel.readStrongBinder());
            i = parcel.readInt();
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(fh1, i, s, uri, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(an(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            removeMoment(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            c(an(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            b(an(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(an(parcel.readStrongBinder()), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            d(an(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            parcel = cW();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            boolean flag = cX();
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            parcel = cY();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }
}
