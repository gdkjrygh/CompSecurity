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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.model.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            rg, ld, le, qp, 
//            qq, qw, qx, kh, 
//            rk, rl, qy, qz, 
//            rf

public static abstract class a.ld extends Binder
    implements rg
{
    static final class a
        implements rg
    {

        private IBinder ld;

        public final Bundle I(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            ld.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle J(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            ld.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle a(rf rf1, boolean flag, String s, String s1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            int k;
            obj = null;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            ld.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = obj;
            if (parcel1.readInt() != 0)
            {
                rf1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final Bundle a(String s, String s1, long l, boolean flag)
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
            ld.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle a(String s, String s1, long l, boolean flag, boolean flag1)
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
            ld.transact(205, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final kh a(rf rf1, DataHolder dataholder, int i, int k, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (dataholder == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            parcel.writeInt(k);
            parcel.writeLong(l);
            ld.transact(602, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
              goto _L5
        }

        public final kh a(rf rf1, qp qp1, qy qy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (qp1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            qp1.writeToParcel(parcel, 0);
_L6:
            if (qy1 == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            parcel.writeInt(1);
            qy1.writeToParcel(parcel, 0);
_L7:
            ld.transact(601, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
            parcel.writeInt(0);
              goto _L7
        }

        public final kh a(rf rf1, AvatarReference avatarreference, rk rk1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (avatarreference == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            avatarreference.writeToParcel(parcel, 0);
_L6:
            if (rk1 == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            parcel.writeInt(1);
            rk1.writeToParcel(parcel, 0);
_L7:
            ld.transact(508, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
            parcel.writeInt(0);
              goto _L7
        }

        public final kh a(rf rf1, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeInt(i);
            ld.transact(509, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final kh a(rf rf1, String s, String s1, boolean flag, String s2, String s3, int i, 
                int k, int l, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeInt(i);
            parcel.writeInt(k);
            parcel.writeInt(l);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            ld.transact(507, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeLong(l);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ld.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(302, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
              goto _L5
        }

        public final void a(rf rf1, qp qp1, List list, qw qw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (qp1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            qp1.writeToParcel(parcel, 0);
_L6:
            parcel.writeStringList(list);
            if (qw1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            parcel.writeInt(1);
            qw1.writeToParcel(parcel, 0);
_L7:
            ld.transact(501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
            parcel.writeInt(0);
              goto _L7
        }

        public final void a(rf rf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            ld.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, int i, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(k);
            ld.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            ld.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            ld.transact(403, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, int i, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(k);
            ld.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            ld.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
              goto _L5
        }

        public final void a(rf rf1, String s, String s1, Uri uri, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
            break MISSING_BLOCK_LABEL_138;
_L6:
            parcel.writeInt(i);
            ld.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
            break MISSING_BLOCK_LABEL_138;
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
            while (!flag) 
            {
                i = 0;
                break;
            }
              goto _L6
        }

        public final void a(rf rf1, String s, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            ld.transact(204, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, int i, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            parcel.writeString(s3);
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, int i, String s3, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            ld.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, int i, boolean flag, int k, 
                int l, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            parcel.writeInt(l);
            parcel.writeString(s3);
            ld.transact(202, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, int i, boolean flag, int k, 
                int l, String s3, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_149;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            parcel.writeInt(l);
            parcel.writeString(s3);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            ld.transact(203, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, int i, boolean flag, int k, 
                int l, String s3, boolean flag1, int i1, int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            parcel.writeInt(l);
            parcel.writeString(s3);
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            ld.transact(402, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            ld.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, String s3, int i, String s4)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeInt(i);
            parcel.writeString(s4);
            ld.transact(303, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            ld.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, int i, boolean flag, 
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
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            ld.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            ld.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int k, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            parcel.writeInt(i1);
            ld.transact(401, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int k, int i1, int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            parcel.writeInt(k);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            ld.transact(404, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, List list1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            ld.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, List list, List list1, ld ld1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            if (ld1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ld1.writeToParcel(parcel, 0);
_L6:
            ld.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
              goto _L5
        }

        public final void a(rf rf1, String s, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ld.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, boolean flag, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            parcel.writeInt(i);
            ld.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, String s1, String s2, boolean flag, int i, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int l;
            l = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                l = 1;
            }
            parcel.writeInt(l);
            parcel.writeInt(i);
            parcel.writeInt(k);
            ld.transact(201, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, String s, boolean flag, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeStringArray(as);
            ld.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, boolean flag, boolean flag1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
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
            ld.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void a(rf rf1, boolean flag, boolean flag1, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            int k;
            if (flag)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            if (flag1)
            {
                k = ((flag2) ? 1 : 0);
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            ld.transact(305, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final IBinder asBinder()
        {
            return ld;
        }

        public final Bundle b(String s, String s1, long l)
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
            ld.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final kh b(rf rf1, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeLong(l);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ld.transact(503, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final kh b(rf rf1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            ld.transact(504, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final kh b(rf rf1, String s, int i, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(k);
            ld.transact(502, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final kh b(rf rf1, String s, String s1, int i, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(k);
            ld.transact(505, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void b(rf rf1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null) goto _L2; else goto _L1
_L1:
            rf1 = rf1.asBinder();
_L5:
            parcel.writeStrongBinder(rf1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(304, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            rf1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
              goto _L5
        }

        public final void b(rf rf1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            ld.transact(101, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void b(rf rf1, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            ld.transact(301, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void b(rf rf1, String s, String s1, String s2, int i, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            parcel.writeString(s3);
            ld.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void b(rf rf1, String s, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ld.transact(603, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final kh c(rf rf1, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            ld.transact(506, parcel, parcel1, 0);
            parcel1.readException();
            rf1 = kh.a.aY(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return rf1;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
        }

        public final void c(rf rf1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (rf1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            rf1 = rf1.asBinder();
_L1:
            parcel.writeStrongBinder(rf1);
            parcel.writeString(s);
            parcel.writeString(s1);
            ld.transact(102, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            rf1 = null;
              goto _L1
            rf1;
            parcel1.recycle();
            parcel.recycle();
            throw rf1;
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
            ld.transact(16, parcel, parcel1, 0);
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

        public final Bundle j(Uri uri)
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
            ld.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            uri = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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
            ld.transact(15, parcel, parcel1, 0);
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

        a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public static rg dq(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (iinterface != null && (iinterface instanceof rg))
        {
            return (rg)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        rf rf27;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.people.internal.IPeopleService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf = dp(parcel.readStrongBinder());
            boolean flag;
            boolean flag24;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag24 = true;
            } else
            {
                flag24 = false;
            }
            a(rf, flag, flag24, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 305: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf1 = dp(parcel.readStrongBinder());
            boolean flag1;
            boolean flag25;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag25 = true;
            } else
            {
                flag25 = false;
            }
            a(rf1, flag1, flag25, parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf2 = dp(parcel.readStrongBinder());
            String s2 = parcel.readString();
            String s20 = parcel.readString();
            String s36 = parcel.readString();
            java.util.ArrayList arraylist1 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(rf2, s2, s20, s36, arraylist1, i, flag2, parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf3 = dp(parcel.readStrongBinder());
            long l1 = parcel.readLong();
            boolean flag3;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            a(rf3, l1, flag3);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf4 = dp(parcel.readStrongBinder());
            String s3 = parcel.readString();
            String s21 = parcel.readString();
            String s37 = parcel.readString();
            boolean flag4;
            if (parcel.readInt() != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            a(rf4, s3, s21, s37, flag4);
            parcel1.writeNoException();
            return true;

        case 603: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf5 = dp(parcel.readStrongBinder());
            String s4 = parcel.readString();
            String s22 = parcel.readString();
            String s38 = parcel.readString();
            boolean flag5;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            b(rf5, s4, s22, s38, flag5);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = j(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf6 = dp(parcel.readStrongBinder());
            String s5 = parcel.readString();
            String s23 = parcel.readString();
            String s39 = parcel.readString();
            boolean flag6;
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            a(rf6, s5, s23, s39, flag6, parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 201: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf7 = dp(parcel.readStrongBinder());
            String s6 = parcel.readString();
            String s24 = parcel.readString();
            String s40 = parcel.readString();
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            a(rf7, s6, s24, s40, flag7, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 202: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf8 = dp(parcel.readStrongBinder());
            String s7 = parcel.readString();
            String s25 = parcel.readString();
            String s41 = parcel.readString();
            i = parcel.readInt();
            boolean flag8;
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            a(rf8, s7, s25, s41, i, flag8, parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 203: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf9 = dp(parcel.readStrongBinder());
            String s8 = parcel.readString();
            String s26 = parcel.readString();
            String s42 = parcel.readString();
            i = parcel.readInt();
            String s51;
            int k;
            boolean flag9;
            boolean flag26;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            j = parcel.readInt();
            k = parcel.readInt();
            s51 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag26 = true;
            } else
            {
                flag26 = false;
            }
            a(rf9, s8, s26, s42, i, flag9, j, k, s51, flag26);
            parcel1.writeNoException();
            return true;

        case 402: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf10 = dp(parcel.readStrongBinder());
            String s9 = parcel.readString();
            String s27 = parcel.readString();
            String s43 = parcel.readString();
            i = parcel.readInt();
            String s52;
            int l;
            boolean flag10;
            boolean flag27;
            if (parcel.readInt() != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            j = parcel.readInt();
            l = parcel.readInt();
            s52 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag27 = true;
            } else
            {
                flag27 = false;
            }
            a(rf10, s9, s27, s43, i, flag10, j, l, s52, flag27, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf11 = dp(parcel.readStrongBinder());
            String s10 = parcel.readString();
            boolean flag11;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            a(rf11, s10, flag11, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf12 = dp(parcel.readStrongBinder());
            boolean flag12;
            if (parcel.readInt() != 0)
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            parcel = a(rf12, flag12, parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = I(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf13 = dp(parcel.readStrongBinder());
            String s11 = parcel.readString();
            String s28 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(rf13, s11, s28, parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            boolean flag13;
            if (parcel.readInt() != 0)
            {
                flag13 = true;
            } else
            {
                flag13 = false;
            }
            setSyncToContactsEnabled(flag13);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            boolean flag14 = isSyncToContactsEnabled();
            parcel1.writeNoException();
            if (flag14)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = J(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf23 = dp(parcel.readStrongBinder());
            String s29 = parcel.readString();
            String s44 = parcel.readString();
            Uri uri;
            boolean flag15;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                uri = null;
            }
            if (parcel.readInt() != 0)
            {
                flag15 = true;
            } else
            {
                flag15 = false;
            }
            a(rf23, s29, s44, uri, flag15);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf14 = dp(parcel.readStrongBinder());
            String s12 = parcel.readString();
            String s30 = parcel.readString();
            String s45 = parcel.readString();
            i = parcel.readInt();
            String s53 = parcel.readString();
            boolean flag16;
            if (parcel.readInt() != 0)
            {
                flag16 = true;
            } else
            {
                flag16 = false;
            }
            a(rf14, s12, s30, s45, i, s53, flag16);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(parcel.readString(), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf15 = dp(parcel.readStrongBinder());
            String s13 = parcel.readString();
            String s31 = parcel.readString();
            String s46 = parcel.readString();
            java.util.ArrayList arraylist2 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag17;
            if (parcel.readInt() != 0)
            {
                flag17 = true;
            } else
            {
                flag17 = false;
            }
            a(rf15, s13, s31, s46, arraylist2, i, flag17, parcel.readLong(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 401: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf16 = dp(parcel.readStrongBinder());
            String s14 = parcel.readString();
            String s32 = parcel.readString();
            String s47 = parcel.readString();
            java.util.ArrayList arraylist3 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag18;
            if (parcel.readInt() != 0)
            {
                flag18 = true;
            } else
            {
                flag18 = false;
            }
            a(rf16, s14, s32, s47, arraylist3, i, flag18, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 404: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf17 = dp(parcel.readStrongBinder());
            String s15 = parcel.readString();
            String s33 = parcel.readString();
            String s48 = parcel.readString();
            java.util.ArrayList arraylist4 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag19;
            if (parcel.readInt() != 0)
            {
                flag19 = true;
            } else
            {
                flag19 = false;
            }
            a(rf17, s15, s33, s48, arraylist4, i, flag19, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf18 = dp(parcel.readStrongBinder());
            String s16 = parcel.readString();
            String s34 = parcel.readString();
            String s49 = parcel.readString();
            java.util.ArrayList arraylist5 = parcel.createStringArrayList();
            java.util.ArrayList arraylist6 = parcel.createStringArrayList();
            if (parcel.readInt() != 0)
            {
                le le1 = ld.CREATOR;
                parcel = le.bX(parcel);
            } else
            {
                parcel = null;
            }
            a(rf18, s16, s34, s49, arraylist5, arraylist6, parcel);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 403: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            String s = parcel.readString();
            String s17 = parcel.readString();
            long l2 = parcel.readLong();
            boolean flag20;
            if (parcel.readInt() != 0)
            {
                flag20 = true;
            } else
            {
                flag20 = false;
            }
            parcel = a(s, s17, l2, flag20);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 205: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            String s1 = parcel.readString();
            String s18 = parcel.readString();
            long l3 = parcel.readLong();
            boolean flag21;
            boolean flag28;
            if (parcel.readInt() != 0)
            {
                flag21 = true;
            } else
            {
                flag21 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag28 = true;
            } else
            {
                flag28 = false;
            }
            parcel = a(s1, s18, l3, flag21, flag28);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 101: // 'e'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 102: // 'f'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            c(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 204: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 301: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 302: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf19 = dp(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(rf19, parcel);
            parcel1.writeNoException();
            return true;

        case 303: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 304: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf20 = dp(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(rf20, parcel);
            parcel1.writeNoException();
            return true;

        case 501: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf24 = dp(parcel.readStrongBinder());
            Object obj;
            java.util.ArrayList arraylist;
            if (parcel.readInt() != 0)
            {
                obj = qp.CREATOR;
                obj = qq.gG(parcel);
            } else
            {
                obj = null;
            }
            arraylist = parcel.createStringArrayList();
            if (parcel.readInt() != 0)
            {
                qx qx1 = qw.CREATOR;
                parcel = qx.gH(parcel);
            } else
            {
                parcel = null;
            }
            a(rf24, ((qp) (obj)), arraylist, parcel);
            parcel1.writeNoException();
            return true;

        case 502: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 503: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf21 = dp(parcel.readStrongBinder());
            long l4 = parcel.readLong();
            boolean flag22;
            if (parcel.readInt() != 0)
            {
                flag22 = true;
            } else
            {
                flag22 = false;
            }
            parcel = b(rf21, l4, flag22);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 504: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(dp(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 505: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 506: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = c(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 507: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf22 = dp(parcel.readStrongBinder());
            String s19 = parcel.readString();
            String s35 = parcel.readString();
            String s50;
            String s54;
            int i1;
            boolean flag23;
            boolean flag29;
            if (parcel.readInt() != 0)
            {
                flag23 = true;
            } else
            {
                flag23 = false;
            }
            s50 = parcel.readString();
            s54 = parcel.readString();
            i = parcel.readInt();
            j = parcel.readInt();
            i1 = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                flag29 = true;
            } else
            {
                flag29 = false;
            }
            parcel = a(rf22, s19, s35, flag23, s50, s54, i, j, i1, flag29);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 508: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf25 = dp(parcel.readStrongBinder());
            Object obj1;
            if (parcel.readInt() != 0)
            {
                obj1 = AvatarReference.CREATOR;
                obj1 = b.gL(parcel);
            } else
            {
                obj1 = null;
            }
            if (parcel.readInt() != 0)
            {
                rl rl1 = rk.CREATOR;
                parcel = rl.gJ(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(rf25, ((AvatarReference) (obj1)), parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 509: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = a(dp(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 601: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf rf26 = dp(parcel.readStrongBinder());
            Object obj2;
            if (parcel.readInt() != 0)
            {
                obj2 = qp.CREATOR;
                obj2 = qq.gG(parcel);
            } else
            {
                obj2 = null;
            }
            if (parcel.readInt() != 0)
            {
                qz qz1 = qy.CREATOR;
                parcel = qz.gI(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(rf26, ((qp) (obj2)), parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 602: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            rf27 = dp(parcel.readStrongBinder());
            break;
        }
        Object obj3;
        if (parcel.readInt() != 0)
        {
            obj3 = DataHolder.CREATOR;
            obj3 = e.bO(parcel);
        } else
        {
            obj3 = null;
        }
        parcel = a(rf27, ((DataHolder) (obj3)), parcel.readInt(), parcel.readInt(), parcel.readLong());
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel = parcel.asBinder();
        } else
        {
            parcel = null;
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
