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
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.e;
import com.google.android.gms.location.o;
import com.google.android.gms.location.q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.s;
import com.google.android.gms.maps.model.u;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ce, nl, ns, oh, 
//            nu, ct, nw, ny, 
//            oc, oe, nq, nn, 
//            ci, cn, cu, cs, 
//            cp, cm, cl, co

public interface cf
    extends IInterface
{
    public static abstract class a extends Binder
        implements cf
    {

        public static cf a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        /* block-local class not found */
        class a {}

            if (iinterface != null && (iinterface instanceof cf))
            {
                return (cf)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            Object obj8 = null;
            Object obj9 = null;
            oh oh4 = null;
            Object obj4 = null;
            String s2 = null;
            Object obj1 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj3 = null;
            Object obj = null;
            Object obj7 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj1 = parcel.createTypedArrayList(nn.CREATOR);
                if (parcel.readInt() != 0)
                {
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((List) (obj1)), ((PendingIntent) (obj)), ce.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 57: // '9'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(parcel);
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
                a(((GeofencingRequest) (obj)), ((PendingIntent) (obj1)), ce.a.a(parcel.readStrongBinder()));
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
                a(((PendingIntent) (obj)), ce.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createStringArray(), ce.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(ce.a.a(parcel.readStrongBinder()), parcel.readString());
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
                a(parcel);
                parcel1.writeNoException();
                return true;

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
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.a(parcel);
                }
                a(((LocationRequest) (obj)), com.google.android.gms.location.o.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.a(parcel);
                }
                a(((LocationRequest) (obj)), com.google.android.gms.location.o.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LocationRequest.CREATOR.a(parcel);
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

            case 52: // '4'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = nl.CREATOR.a(parcel);
                }
                a(((nl) (obj)), com.google.android.gms.location.o.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = nl.CREATOR.a(parcel);
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
                a(((nl) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(com.google.android.gms.location.o.a.a(parcel.readStrongBinder()));
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
                b(parcel);
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                a(flag);
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

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj1 = nu.CREATOR.a(parcel);
                } else
                {
                    obj1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    oh4 = oh.CREATOR.a(parcel);
                } else
                {
                    oh4 = null;
                }
                a(((LatLngBounds) (obj)), i, ((nu) (obj1)), oh4, ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                i = parcel.readInt();
                s2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj1 = nu.CREATOR.a(parcel);
                } else
                {
                    obj1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    oh4 = oh.CREATOR.a(parcel);
                }
                a(((LatLngBounds) (obj)), i, s2, ((nu) (obj1)), oh4, ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                obj1 = parcel.readString();
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
                }
                a(((String) (obj1)), ((oh) (obj)), ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                Object obj2;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = nu.CREATOR.a(parcel);
                } else
                {
                    obj1 = null;
                }
                obj2 = s2;
                if (parcel.readInt() != 0)
                {
                    obj2 = oh.CREATOR.a(parcel);
                }
                a(((LatLng) (obj)), ((nu) (obj1)), ((oh) (obj2)), ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = nu.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = oh.CREATOR.a(parcel);
                }
                a(((nu) (obj)), ((oh) (obj1)), ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                String s1 = parcel.readString();
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
                }
                b(s1, ((oh) (obj)), ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 58: // ':'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                java.util.ArrayList arraylist = parcel.createStringArrayList();
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
                }
                a(arraylist, ((oh) (obj)), ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LatLngBounds latlngbounds;
                oh oh5;
                java.util.ArrayList arraylist1;
                if (parcel.readInt() != 0)
                {
                    obj = oe.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    latlngbounds = LatLngBounds.CREATOR.a(parcel);
                } else
                {
                    latlngbounds = null;
                }
                arraylist1 = parcel.createStringArrayList();
                if (parcel.readInt() != 0)
                {
                    oh5 = oh.CREATOR.a(parcel);
                } else
                {
                    oh5 = null;
                }
                a(((oe) (obj)), latlngbounds, arraylist1, oh5, ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oh oh1;
                if (parcel.readInt() != 0)
                {
                    obj = ny.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    oh1 = oh.CREATOR.a(parcel);
                } else
                {
                    oh1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ny) (obj)), oh1, parcel);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
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
                a(((oh) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oh oh2;
                if (parcel.readInt() != 0)
                {
                    obj = ns.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    oh2 = oh.CREATOR.a(parcel);
                } else
                {
                    oh2 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ns) (obj)), oh2, parcel);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
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
                b(((oh) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 55: // '7'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                String s3 = parcel.readString();
                nq nq1;
                oh oh6;
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    nq1 = nq.CREATOR.a(parcel);
                } else
                {
                    nq1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    oh6 = oh.CREATOR.a(parcel);
                } else
                {
                    oh6 = null;
                }
                a(s3, ((LatLngBounds) (obj)), nq1, oh6, ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oh oh3;
                if (parcel.readInt() != 0)
                {
                    obj = (oc)oc.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                oh3 = obj3;
                if (parcel.readInt() != 0)
                {
                    oh3 = oh.CREATOR.a(parcel);
                }
                a(((oc) (obj)), oh3, ct.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
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

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = nw.CREATOR.a(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj = oh.CREATOR.a(parcel);
                }
                a(parcel1, ((oh) (obj)));
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

            case 51: // '3'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 54: // '6'
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                parcel = c();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }


    public abstract Location a()
        throws RemoteException;

    public abstract Location a(String s)
        throws RemoteException;

    public abstract void a(long l, boolean flag, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(PendingIntent pendingintent, ce ce, String s)
        throws RemoteException;

    public abstract void a(Location location)
        throws RemoteException;

    public abstract void a(Location location, int i)
        throws RemoteException;

    public abstract void a(ce ce, String s)
        throws RemoteException;

    public abstract void a(nl nl, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(nl nl, o o)
        throws RemoteException;

    public abstract void a(ns ns, oh oh, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(nu nu, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(nw nw, oh oh)
        throws RemoteException;

    public abstract void a(ny ny, oh oh, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(oc oc, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(oe oe, LatLngBounds latlngbounds, List list, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(oh oh, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, ce ce)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, o o)
        throws RemoteException;

    public abstract void a(LocationRequest locationrequest, o o, String s)
        throws RemoteException;

    public abstract void a(o o)
        throws RemoteException;

    public abstract void a(LatLng latlng, nu nu, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(LatLngBounds latlngbounds, int i, nu nu, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(LatLngBounds latlngbounds, int i, String s, nu nu, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(String s, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(String s, LatLngBounds latlngbounds, nq nq, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(List list, PendingIntent pendingintent, ce ce, String s)
        throws RemoteException;

    public abstract void a(List list, oh oh, ct ct)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract void a(String as[], ce ce, String s)
        throws RemoteException;

    public abstract IBinder b()
        throws RemoteException;

    public abstract e b(String s)
        throws RemoteException;

    public abstract void b(PendingIntent pendingintent)
        throws RemoteException;

    public abstract void b(oh oh, PendingIntent pendingintent)
        throws RemoteException;

    public abstract void b(String s, oh oh, ct ct)
        throws RemoteException;

    public abstract IBinder c()
        throws RemoteException;
}
