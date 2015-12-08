// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequestCreator;
import com.google.android.gms.location.a;
import com.google.android.gms.location.b;
import com.google.android.gms.location.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBoundsCreator;
import com.google.android.gms.maps.model.LatLngCreator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jd, jk, ka, jm, 
//            jy, jo, jq, ju, 
//            jh, jn, kb, jw, 
//            jr, jl, jp

public interface je
    extends IInterface
{
    public static abstract class a extends Binder
        implements je
    {

        public static je as(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (iinterface != null && (iinterface instanceof je))
            {
                return (je)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            ka ka4 = null;
            Object obj4 = null;
            String s2 = null;
            Object obj1 = null;
            Object obj5 = null;
            Object obj3 = null;
            Object obj7 = null;
            Object obj = null;
            Object obj6 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj1 = parcel.createTypedArrayList(jh.CREATOR);
                if (parcel.readInt() != 0)
                {
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((List) (obj1)), ((PendingIntent) (obj)), jd.a.ar(parcel.readStrongBinder()), parcel.readString());
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
                a(((PendingIntent) (obj)), jd.a.ar(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createStringArray(), jd.a.ar(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(jd.a.ar(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                long l = parcel.readLong();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(l, flag, parcel);
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
                removeActivityUpdates(parcel);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = iW();
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
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.createFromParcel(parcel);
                }
                a(((LocationRequest) (obj)), com.google.android.gms.location.a.a.aq(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.createFromParcel(parcel);
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
                a(((LocationRequest) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(com.google.android.gms.location.a.a.aq(parcel.readStrongBinder()));
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
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                setMockMode(flag);
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
                setMockLocation(parcel);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj1 = jm.CREATOR.bv(parcel);
                } else
                {
                    obj1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    ka4 = ka.CREATOR.bB(parcel);
                } else
                {
                    ka4 = null;
                }
                a(((LatLngBounds) (obj)), i, ((jm) (obj1)), ka4, jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                i = parcel.readInt();
                s2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj1 = jm.CREATOR.bv(parcel);
                } else
                {
                    obj1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    ka4 = ka.CREATOR.bB(parcel);
                }
                a(((LatLngBounds) (obj)), i, s2, ((jm) (obj1)), ka4, jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj1 = parcel.readString();
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
                }
                a(((String) (obj1)), ((ka) (obj)), jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                Object obj2;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = jm.CREATOR.bv(parcel);
                } else
                {
                    obj1 = null;
                }
                obj2 = s2;
                if (parcel.readInt() != 0)
                {
                    obj2 = ka.CREATOR.bB(parcel);
                }
                a(((LatLng) (obj)), ((jm) (obj1)), ((ka) (obj2)), jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = jm.CREATOR.bv(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = ka.CREATOR.bB(parcel);
                }
                a(((jm) (obj)), ((ka) (obj1)), jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                String s = parcel.readString();
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
                }
                b(s, ((ka) (obj)), jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                String s1 = parcel.readString();
                java.util.ArrayList arraylist = parcel.createStringArrayList();
                java.util.ArrayList arraylist1 = parcel.createTypedArrayList(jw.CREATOR);
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
                } else
                {
                    obj = null;
                }
                a(s1, arraylist, arraylist1, ((ka) (obj)), jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ka ka1;
                if (parcel.readInt() != 0)
                {
                    obj = jq.CREATOR.bx(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    ka1 = ka.CREATOR.bB(parcel);
                } else
                {
                    ka1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((jq) (obj)), ka1, parcel);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
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
                a(((ka) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ka ka2;
                if (parcel.readInt() != 0)
                {
                    obj = jk.CREATOR.bu(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    ka2 = ka.CREATOR.bB(parcel);
                } else
                {
                    ka2 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((jk) (obj)), ka2, parcel);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
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
                b(((ka) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                String s3 = parcel.readString();
                jm jm1;
                ka ka5;
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    jm1 = jm.CREATOR.bv(parcel);
                } else
                {
                    jm1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    ka5 = ka.CREATOR.bB(parcel);
                } else
                {
                    ka5 = null;
                }
                a(s3, ((LatLngBounds) (obj)), jm1, ka5, jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ka ka3;
                if (parcel.readInt() != 0)
                {
                    obj = (ju)ju.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                ka3 = obj3;
                if (parcel.readInt() != 0)
                {
                    ka3 = ka.CREATOR.bB(parcel);
                }
                a(((ju) (obj)), ka3, jy.a.au(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.createFromParcel(parcel);
                }
                a(((LocationRequest) (obj)), com.google.android.gms.location.a.a.aq(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = bo(parcel.readString());
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

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = jo.CREATOR.bw(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj = ka.CREATOR.bB(parcel);
                }
                a(parcel1, ((ka) (obj)));
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                Location location;
                if (parcel.readInt() != 0)
                {
                    location = (Location)Location.CREATOR.createFromParcel(parcel);
                } else
                {
                    location = null;
                }
                a(location, parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = bp(parcel.readString());
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
                parcel = iX();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }

    private static class a.a
        implements je
    {

        private IBinder kq;

        public void a(long l, boolean flag, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeLong(l);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            kq.transact(5, parcel, parcel1, 0);
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

        public void a(PendingIntent pendingintent)
            throws RemoteException
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
            kq.transact(11, parcel, parcel1, 0);
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

        public void a(PendingIntent pendingintent, jd jd1, String s)
            throws RemoteException
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
            if (jd1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            pendingintent = jd1.asBinder();
_L4:
            parcel.writeStrongBinder(pendingintent);
            parcel.writeString(s);
            kq.transact(2, parcel, parcel1, 0);
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

        public void a(Location location, int i)
            throws RemoteException
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
            parcel.writeInt(i);
            kq.transact(26, parcel, parcel1, 0);
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

        public void a(jd jd1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (jd1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            jd1 = jd1.asBinder();
_L1:
            parcel.writeStrongBinder(jd1);
            parcel.writeString(s);
            kq.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            jd1 = null;
              goto _L1
            jd1;
            parcel1.recycle();
            parcel.recycle();
            throw jd1;
        }

        public void a(jk jk1, ka ka1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (jk1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            jk1.writeToParcel(parcel, 0);
_L5:
            if (ka1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L6:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L7:
            kq.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            jk1;
            parcel1.recycle();
            parcel.recycle();
            throw jk1;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void a(jm jm1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (jm1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            jm1.writeToParcel(parcel, 0);
_L5:
            if (ka1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L6:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            jm1 = jy1.asBinder();
_L7:
            parcel.writeStrongBinder(jm1);
            kq.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            jm1;
            parcel1.recycle();
            parcel.recycle();
            throw jm1;
_L4:
            parcel.writeInt(0);
              goto _L6
            jm1 = null;
              goto _L7
        }

        public void a(jo jo1, ka ka1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (jo1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            jo1.writeToParcel(parcel, 0);
_L3:
            if (ka1 == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L4:
            kq.transact(25, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            jo1;
            parcel.recycle();
            throw jo1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(jq jq1, ka ka1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (jq1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            jq1.writeToParcel(parcel, 0);
_L5:
            if (ka1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L6:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L7:
            kq.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            jq1;
            parcel1.recycle();
            parcel.recycle();
            throw jq1;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void a(ju ju1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (ju1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ju1.writeToParcel(parcel, 0);
_L5:
            if (ka1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L6:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            ju1 = jy1.asBinder();
_L7:
            parcel.writeStrongBinder(ju1);
            kq.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            ju1;
            parcel1.recycle();
            parcel.recycle();
            throw ju1;
_L4:
            parcel.writeInt(0);
              goto _L6
            ju1 = null;
              goto _L7
        }

        public void a(ka ka1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (ka1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            kq.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            ka1;
            parcel1.recycle();
            parcel.recycle();
            throw ka1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(LocationRequest locationrequest, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            kq.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(LocationRequest locationrequest, com.google.android.gms.location.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            locationrequest = a1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            kq.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            locationrequest = null;
              goto _L4
        }

        public void a(LocationRequest locationrequest, com.google.android.gms.location.a a1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            locationrequest.writeToParcel(parcel, 0);
_L3:
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            locationrequest = a1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            parcel.writeString(s);
            kq.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            locationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw locationrequest;
            locationrequest = null;
              goto _L4
        }

        public void a(com.google.android.gms.location.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            kq.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void a(LatLng latlng, jm jm1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (latlng == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L7:
            if (jm1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            jm1.writeToParcel(parcel, 0);
_L8:
            if (ka1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L9:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            latlng = jy1.asBinder();
_L10:
            parcel.writeStrongBinder(latlng);
            kq.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            latlng = null;
              goto _L10
        }

        public void a(LatLngBounds latlngbounds, int i, jm jm1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (latlngbounds == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L7:
            parcel.writeInt(i);
            if (jm1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            jm1.writeToParcel(parcel, 0);
_L8:
            if (ka1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L9:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            latlngbounds = jy1.asBinder();
_L10:
            parcel.writeStrongBinder(latlngbounds);
            kq.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            latlngbounds = null;
              goto _L10
        }

        public void a(LatLngBounds latlngbounds, int i, String s, jm jm1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (latlngbounds == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L7:
            parcel.writeInt(i);
            parcel.writeString(s);
            if (jm1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            jm1.writeToParcel(parcel, 0);
_L8:
            if (ka1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L9:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_176;
            }
            latlngbounds = jy1.asBinder();
_L10:
            parcel.writeStrongBinder(latlngbounds);
            kq.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            latlngbounds = null;
              goto _L10
        }

        public void a(String s, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            if (ka1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L3:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = jy1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public void a(String s, LatLngBounds latlngbounds, jm jm1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            if (latlngbounds == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L7:
            if (jm1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            jm1.writeToParcel(parcel, 0);
_L8:
            if (ka1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L9:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            s = jy1.asBinder();
_L10:
            parcel.writeStrongBinder(s);
            kq.transact(45, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            s = null;
              goto _L10
        }

        public void a(String s, List list, List list1, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeTypedList(list1);
            if (ka1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L3:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            s = jy1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public void a(List list, PendingIntent pendingintent, jd jd1, String s)
            throws RemoteException
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
            if (jd1 == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            list = jd1.asBinder();
_L4:
            parcel.writeStrongBinder(list);
            parcel.writeString(s);
            kq.transact(1, parcel, parcel1, 0);
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

        public void a(String as[], jd jd1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeStringArray(as);
            if (jd1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            as = jd1.asBinder();
_L1:
            parcel.writeStrongBinder(as);
            parcel.writeString(s);
            kq.transact(3, parcel, parcel1, 0);
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

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(ka ka1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (ka1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            kq.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            ka1;
            parcel1.recycle();
            parcel.recycle();
            throw ka1;
            parcel.writeInt(0);
              goto _L4
        }

        public void b(String s, ka ka1, jy jy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            if (ka1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ka1.writeToParcel(parcel, 0);
_L3:
            if (jy1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = jy1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public Location bo(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            kq.transact(21, parcel, parcel1, 0);
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

        public b bp(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            kq.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = b.CREATOR.bs(parcel1);
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

        public Location iW()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            kq.transact(7, parcel, parcel1, 0);
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

        public IBinder iX()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            kq.transact(51, parcel, parcel1, 0);
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

        public void removeActivityUpdates(PendingIntent pendingintent)
            throws RemoteException
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
            kq.transact(6, parcel, parcel1, 0);
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

        public void setMockLocation(Location location)
            throws RemoteException
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
            kq.transact(13, parcel, parcel1, 0);
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

        public void setMockMode(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(12, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void a(long l, boolean flag, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(PendingIntent pendingintent, jd jd, String s)
        throws RemoteException;

    public abstract void a(Location location, int i)
        throws RemoteException;

    public abstract void a(jd jd, String s)
        throws RemoteException;

    public abstract void a(jk jk, ka ka, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(jm jm, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(jo jo, ka ka)
        throws RemoteException;

    public abstract void a(jq jq, ka ka, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(ju ju, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(ka ka, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, com.google.android.gms.location.a a1)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, com.google.android.gms.location.a a1, String s)
        throws RemoteException;

    public abstract void a(com.google.android.gms.location.a a1)
        throws RemoteException;

    public abstract void a(LatLng latlng, jm jm, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(LatLngBounds latlngbounds, int i, jm jm, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(LatLngBounds latlngbounds, int i, String s, jm jm, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(String s, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(String s, LatLngBounds latlngbounds, jm jm, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(String s, List list, List list1, ka ka, jy jy)
        throws RemoteException;

    public abstract void a(List list, PendingIntent pendingintent, jd jd, String s)
        throws RemoteException;

    public abstract void a(String as[], jd jd, String s)
        throws RemoteException;

    public abstract void b(ka ka, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void b(String s, ka ka, jy jy)
        throws RemoteException;

    public abstract Location bo(String s)
        throws RemoteException;

    public abstract b bp(String s)
        throws RemoteException;

    public abstract Location iW()
        throws RemoteException;

    public abstract IBinder iX()
        throws RemoteException;

    public abstract void removeActivityUpdates(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void setMockLocation(Location location)
        throws RemoteException;

    public abstract void setMockMode(boolean flag)
        throws RemoteException;
}
