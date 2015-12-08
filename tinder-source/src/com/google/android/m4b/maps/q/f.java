// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.h.q;
import com.google.android.m4b.maps.o.a;
import com.google.android.m4b.maps.o.d;
import com.google.android.m4b.maps.o.g;
import com.google.android.m4b.maps.o.i;
import com.google.android.m4b.maps.o.k;
import com.google.android.m4b.maps.o.m;
import com.google.android.m4b.maps.o.n;
import com.google.android.m4b.maps.o.o;
import com.google.android.m4b.maps.o.p;
import com.google.android.m4b.maps.o.s;
import com.google.android.m4b.maps.o.u;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.q:
//            e, g, j, l, 
//            n, k, m

public interface f
    extends IInterface
{
    public static abstract class a extends Binder
        implements f
    {

        public static f a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (iinterface != null && (iinterface instanceof f))
            {
                return (f)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
        {
            boolean flag2 = false;
            boolean flag = false;
            IBinder ibinder = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj = null;
            Object obj1 = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj1 = parcel.createTypedArrayList(n.CREATOR);
                if (parcel.readInt() != 0)
                {
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((List) (obj1)), ((PendingIntent) (obj)), com.google.android.m4b.maps.q.e.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 57: // '9'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = (g)g.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj1 = null;
                }
                a(((g) (obj)), ((PendingIntent) (obj1)), com.google.android.m4b.maps.q.e.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((PendingIntent) (obj)), com.google.android.m4b.maps.q.e.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createStringArray(), com.google.android.m4b.maps.q.e.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(com.google.android.m4b.maps.q.e.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                long l1 = parcel.readLong();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(l1, flag, parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 64: // '@'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = a(parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 60: // '<'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = i.CREATOR;
                    obj = k.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = a(((i) (obj)), parcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 61: // '='
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = b(parcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = a();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = p.CREATOR;
                    obj = s.a(parcel);
                }
                a(((p) (obj)), com.google.android.m4b.maps.o.n.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = ibinder;
                if (parcel.readInt() != 0)
                {
                    obj = p.CREATOR;
                    obj = s.a(parcel);
                }
                a(((p) (obj)), com.google.android.m4b.maps.o.n.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = p.CREATOR;
                    obj = s.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((p) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 52: // '4'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = j.CREATOR;
                    obj = com.google.android.m4b.maps.q.k.a(parcel);
                }
                a(((j) (obj)), com.google.android.m4b.maps.o.n.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = j.CREATOR;
                    obj = com.google.android.m4b.maps.q.k.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((j) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(com.google.android.m4b.maps.o.n.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                c(parcel);
                parcel1.writeNoException();
                return true;

            case 59: // ';'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = l.CREATOR;
                    obj = com.google.android.m4b.maps.q.m.a(parcel);
                }
                a(((l) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                boolean flag1 = flag2;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                a(flag1);
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Location)Location.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = b(parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = (Location)Location.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((Location) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = c(parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 51: // '3'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 63: // '?'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = (u)u.CREATOR.createFromParcel(parcel);
            } else
            {
                obj1 = null;
            }
            ibinder = parcel.readStrongBinder();
            if (ibinder != null)
            {
                obj = ibinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                if (obj != null && (obj instanceof com.google.android.m4b.maps.q.g))
                {
                    obj = (com.google.android.m4b.maps.q.g)obj;
                } else
                {
                    obj = new g.a.a(ibinder);
                }
            }
            a(((u) (obj1)), ((com.google.android.m4b.maps.q.g) (obj)), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }

    static final class a.a
        implements f
    {

        private IBinder a;

        public final Location a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return location;
_L2:
            location = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final q a(i k, PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (k == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            k.writeToParcel(parcel, 0);
_L5:
            if (pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            a.transact(60, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            k = (q)q.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return k;
_L2:
            parcel.writeInt(0);
              goto _L5
            k;
            parcel1.recycle();
            parcel.recycle();
            throw k;
_L4:
            parcel.writeInt(0);
              goto _L6
            k = null;
              goto _L7
        }

        public final com.google.android.m4b.maps.o.a a(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            a.transact(64, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = com.google.android.m4b.maps.o.a.CREATOR;
            s = d.a(parcel1);
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

        public final void a(long l1, boolean flag, PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeLong(l1);
            if (!flag)
            {
                k = 0;
            }
            parcel.writeInt(k);
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        public final void a(PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        public final void a(PendingIntent pendingintent, e e1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            pendingintent = e1.asBinder();
_L4:
            parcel.writeStrongBinder(pendingintent);
            parcel.writeString(s);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
            pendingintent = null;
              goto _L4
        }

        public final void a(Location location)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public final void a(Location location, int k)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(k);
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public final void a(g g1, PendingIntent pendingintent, e e1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (g1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            g1.writeToParcel(parcel, 0);
_L5:
            if (pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            g1 = e1.asBinder();
_L7:
            parcel.writeStrongBinder(g1);
            a.transact(57, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            g1;
            parcel1.recycle();
            parcel.recycle();
            throw g1;
_L4:
            parcel.writeInt(0);
              goto _L6
            g1 = null;
              goto _L7
        }

        public final void a(n n1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            n1 = n1.asBinder();
_L1:
            parcel.writeStrongBinder(n1);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            n1 = null;
              goto _L1
            n1;
            parcel1.recycle();
            parcel.recycle();
            throw n1;
        }

        public final void a(p p1, PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (p1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            p1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            p1;
            parcel1.recycle();
            parcel.recycle();
            throw p1;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(p p1, n n1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (p1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            p1.writeToParcel(parcel, 0);
_L3:
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            p1 = n1.asBinder();
_L4:
            parcel.writeStrongBinder(p1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            p1;
            parcel1.recycle();
            parcel.recycle();
            throw p1;
            p1 = null;
              goto _L4
        }

        public final void a(p p1, n n1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (p1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            p1.writeToParcel(parcel, 0);
_L3:
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            p1 = n1.asBinder();
_L4:
            parcel.writeStrongBinder(p1);
            parcel.writeString(s);
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            p1;
            parcel1.recycle();
            parcel.recycle();
            throw p1;
            p1 = null;
              goto _L4
        }

        public final void a(u u1, com.google.android.m4b.maps.q.g g1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (u1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            u1.writeToParcel(parcel, 0);
_L3:
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            u1 = g1.asBinder();
_L4:
            parcel.writeStrongBinder(u1);
            parcel.writeString(s);
            a.transact(63, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            u1;
            parcel1.recycle();
            parcel.recycle();
            throw u1;
            u1 = null;
              goto _L4
        }

        public final void a(e e1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            parcel.writeString(s);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        public final void a(j j1, PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (j1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            j1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            a.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            j1;
            parcel1.recycle();
            parcel.recycle();
            throw j1;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(j j1, n n1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (j1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            j1.writeToParcel(parcel, 0);
_L3:
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            j1 = n1.asBinder();
_L4:
            parcel.writeStrongBinder(j1);
            a.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            j1;
            parcel1.recycle();
            parcel.recycle();
            throw j1;
            j1 = null;
              goto _L4
        }

        public final void a(l l1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            l1.writeToParcel(parcel, 0);
_L1:
            a.transact(59, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            l1;
            parcel1.recycle();
            parcel.recycle();
            throw l1;
        }

        public final void a(List list, PendingIntent pendingintent, e e1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeTypedList(list);
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            list = e1.asBinder();
_L4:
            parcel.writeStrongBinder(list);
            parcel.writeString(s);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
            list = null;
              goto _L4
        }

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            a.transact(12, parcel, parcel1, 0);
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

        public final void a(String as[], e e1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeStringArray(as);
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            as = e1.asBinder();
_L1:
            parcel.writeStrongBinder(as);
            parcel.writeString(s);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as = null;
              goto _L1
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final Location b(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            a.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Location)Location.CREATOR.createFromParcel(parcel1);
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

        public final IBinder b()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            ibinder = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return ibinder;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final q b(PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L3:
            a.transact(61, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            pendingintent = (q)q.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return pendingintent;
_L2:
            parcel.writeInt(0);
              goto _L3
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
            pendingintent = null;
              goto _L4
        }

        public final m c(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            a.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = m.CREATOR;
            s = o.a(parcel1);
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

        public final void c(PendingIntent pendingintent)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            pendingintent;
            parcel1.recycle();
            parcel.recycle();
            throw pendingintent;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract Location a();

    public abstract q a(i i, PendingIntent pendingintent);

    public abstract com.google.android.m4b.maps.o.a a(String s);

    public abstract void a(long l, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, e e, String s);

    public abstract void a(Location location);

    public abstract void a(Location location, int i);

    public abstract void a(g g, PendingIntent pendingintent, e e);

    public abstract void a(n n);

    public abstract void a(p p, PendingIntent pendingintent);

    public abstract void a(p p, n n);

    public abstract void a(p p, n n, String s);

    public abstract void a(u u, com.google.android.m4b.maps.q.g g, String s);

    public abstract void a(e e, String s);

    public abstract void a(j j, PendingIntent pendingintent);

    public abstract void a(j j, n n);

    public abstract void a(l l);

    public abstract void a(List list, PendingIntent pendingintent, e e, String s);

    public abstract void a(boolean flag);

    public abstract void a(String as[], e e, String s);

    public abstract Location b(String s);

    public abstract IBinder b();

    public abstract q b(PendingIntent pendingintent);

    public abstract m c(String s);

    public abstract void c(PendingIntent pendingintent);
}
