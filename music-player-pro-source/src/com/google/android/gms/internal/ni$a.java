// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;
import com.google.android.gms.location.d;
import com.google.android.gms.location.e;
import com.google.android.gms.location.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ni, nn, nl, nm, 
//            nu, nv, oh, oi, 
//            oe, of, ny, nz, 
//            ns, nt, nq, nr, 
//            oc, nw, nx, nh, 
//            og

public static abstract class a.le extends Binder
    implements ni
{
    private static class a
        implements ni
    {

        private IBinder le;

        public void S(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            le.transact(12, parcel, parcel1, 0);
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

        public void a(long l, boolean flag, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeLong(l);
            if (!flag)
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L1:
            le.transact(5, parcel, parcel1, 0);
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
            le.transact(6, parcel, parcel1, 0);
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

        public void a(PendingIntent pendingintent, nh nh1, String s)
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
            if (nh1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            pendingintent = nh1.asBinder();
_L4:
            parcel.writeStrongBinder(pendingintent);
            parcel.writeString(s);
            le.transact(2, parcel, parcel1, 0);
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

        public void a(Location location, int j)
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
            parcel.writeInt(j);
            le.transact(26, parcel, parcel1, 0);
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

        public void a(nh nh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (nh1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            nh1 = nh1.asBinder();
_L1:
            parcel.writeStrongBinder(nh1);
            parcel.writeString(s);
            le.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            nh1 = null;
              goto _L1
            nh1;
            parcel1.recycle();
            parcel.recycle();
            throw nh1;
        }

        public void a(nl nl1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (nl1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nl1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            le.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            nl1;
            parcel1.recycle();
            parcel.recycle();
            throw nl1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(nl nl1, b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (nl1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nl1.writeToParcel(parcel, 0);
_L3:
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            nl1 = b1.asBinder();
_L4:
            parcel.writeStrongBinder(nl1);
            le.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            nl1;
            parcel1.recycle();
            parcel.recycle();
            throw nl1;
            nl1 = null;
              goto _L4
        }

        public void a(ns ns1, oh oh1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (ns1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ns1.writeToParcel(parcel, 0);
_L5:
            if (oh1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L6:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L7:
            le.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            ns1;
            parcel1.recycle();
            parcel.recycle();
            throw ns1;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void a(nu nu1, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (nu1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nu1.writeToParcel(parcel, 0);
_L5:
            if (oh1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L6:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            nu1 = og1.asBinder();
_L7:
            parcel.writeStrongBinder(nu1);
            le.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            nu1;
            parcel1.recycle();
            parcel.recycle();
            throw nu1;
_L4:
            parcel.writeInt(0);
              goto _L6
            nu1 = null;
              goto _L7
        }

        public void a(nw nw1, oh oh1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (nw1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nw1.writeToParcel(parcel, 0);
_L3:
            if (oh1 == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L4:
            le.transact(25, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            nw1;
            parcel.recycle();
            throw nw1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(ny ny1, oh oh1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (ny1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ny1.writeToParcel(parcel, 0);
_L5:
            if (oh1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L6:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L7:
            le.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            ny1;
            parcel1.recycle();
            parcel.recycle();
            throw ny1;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public void a(oc oc1, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (oc1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oc1.writeToParcel(parcel, 0);
_L5:
            if (oh1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L6:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            oc1 = og1.asBinder();
_L7:
            parcel.writeStrongBinder(oc1);
            le.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            oc1;
            parcel1.recycle();
            parcel.recycle();
            throw oc1;
_L4:
            parcel.writeInt(0);
              goto _L6
            oc1 = null;
              goto _L7
        }

        public void a(oe oe1, LatLngBounds latlngbounds, List list, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (oe1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oe1.writeToParcel(parcel, 0);
_L7:
            if (latlngbounds == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L8:
            parcel.writeStringList(list);
            if (oh1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L9:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            oe1 = og1.asBinder();
_L10:
            parcel.writeStrongBinder(oe1);
            le.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            oe1;
            parcel1.recycle();
            parcel.recycle();
            throw oe1;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            oe1 = null;
              goto _L10
        }

        public void a(oh oh1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (oh1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            le.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            oh1;
            parcel1.recycle();
            parcel.recycle();
            throw oh1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, nh nh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (geofencingrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            geofencingrequest.writeToParcel(parcel, 0);
_L5:
            if (pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            if (nh1 == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            geofencingrequest = nh1.asBinder();
_L7:
            parcel.writeStrongBinder(geofencingrequest);
            le.transact(57, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            geofencingrequest;
            parcel1.recycle();
            parcel.recycle();
            throw geofencingrequest;
_L4:
            parcel.writeInt(0);
              goto _L6
            geofencingrequest = null;
              goto _L7
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
            le.transact(9, parcel, parcel1, 0);
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

        public void a(LocationRequest locationrequest, b b1)
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
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            locationrequest = b1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            le.transact(8, parcel, parcel1, 0);
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

        public void a(LocationRequest locationrequest, b b1, String s)
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
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            locationrequest = b1.asBinder();
_L4:
            parcel.writeStrongBinder(locationrequest);
            parcel.writeString(s);
            le.transact(20, parcel, parcel1, 0);
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

        public void a(b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            le.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            b1 = null;
              goto _L1
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
        }

        public void a(LatLng latlng, nu nu1, oh oh1, og og1)
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
            if (nu1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            nu1.writeToParcel(parcel, 0);
_L8:
            if (oh1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L9:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            latlng = og1.asBinder();
_L10:
            parcel.writeStrongBinder(latlng);
            le.transact(16, parcel, parcel1, 0);
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

        public void a(LatLngBounds latlngbounds, int j, nu nu1, oh oh1, og og1)
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
            parcel.writeInt(j);
            if (nu1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            nu1.writeToParcel(parcel, 0);
_L8:
            if (oh1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L9:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            latlngbounds = og1.asBinder();
_L10:
            parcel.writeStrongBinder(latlngbounds);
            le.transact(14, parcel, parcel1, 0);
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

        public void a(LatLngBounds latlngbounds, int j, String s, nu nu1, oh oh1, og og1)
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
            parcel.writeInt(j);
            parcel.writeString(s);
            if (nu1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            nu1.writeToParcel(parcel, 0);
_L8:
            if (oh1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L9:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_176;
            }
            latlngbounds = og1.asBinder();
_L10:
            parcel.writeStrongBinder(latlngbounds);
            le.transact(47, parcel, parcel1, 0);
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

        public void a(String s, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            if (oh1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L3:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = og1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            le.transact(15, parcel, parcel1, 0);
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

        public void a(String s, LatLngBounds latlngbounds, nq nq1, oh oh1, og og1)
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
            if (nq1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            nq1.writeToParcel(parcel, 0);
_L8:
            if (oh1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L9:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            s = og1.asBinder();
_L10:
            parcel.writeStrongBinder(s);
            le.transact(55, parcel, parcel1, 0);
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

        public void a(List list, PendingIntent pendingintent, nh nh1, String s)
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
            if (nh1 == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            list = nh1.asBinder();
_L4:
            parcel.writeStrongBinder(list);
            parcel.writeString(s);
            le.transact(1, parcel, parcel1, 0);
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

        public void a(List list, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeStringList(list);
            if (oh1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L3:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            list = og1.asBinder();
_L4:
            parcel.writeStrongBinder(list);
            le.transact(58, parcel, parcel1, 0);
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

        public void a(String as[], nh nh1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeStringArray(as);
            if (nh1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            as = nh1.asBinder();
_L1:
            parcel.writeStrongBinder(as);
            parcel.writeString(s);
            le.transact(3, parcel, parcel1, 0);
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
            return le;
        }

        public void b(PendingIntent pendingintent)
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
            le.transact(11, parcel, parcel1, 0);
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

        public void b(Location location)
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
            le.transact(13, parcel, parcel1, 0);
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

        public void b(oh oh1, PendingIntent pendingintent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (oh1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L3:
            if (pendingintent == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L4:
            le.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            oh1;
            parcel1.recycle();
            parcel.recycle();
            throw oh1;
            parcel.writeInt(0);
              goto _L4
        }

        public void b(String s, oh oh1, og og1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            if (oh1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            oh1.writeToParcel(parcel, 0);
_L3:
            if (og1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = og1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            le.transact(42, parcel, parcel1, 0);
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

        public Location bZ(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            le.transact(21, parcel, parcel1, 0);
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

        public e ca(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel.writeString(s);
            le.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = e.CREATOR.cK(parcel1);
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

        public Location ni()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            le.transact(7, parcel, parcel1, 0);
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

        public IBinder nj()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            le.transact(51, parcel, parcel1, 0);
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

        public IBinder nk()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            le.transact(54, parcel, parcel1, 0);
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

        a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public static ni aO(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (iinterface != null && (iinterface instanceof ni))
        {
            return (ni)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        throws RemoteException
    {
        boolean flag = false;
        Object obj8 = null;
        Object obj9 = null;
        oh oh4 = null;
        Object obj4 = null;
        String s1 = null;
        Object obj1 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj3 = null;
        Object obj = null;
        Object obj7 = null;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

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
            a(((List) (obj1)), ((PendingIntent) (obj)), aN(parcel.readStrongBinder()), parcel.readString());
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
            a(((GeofencingRequest) (obj)), ((PendingIntent) (obj1)), aN(parcel.readStrongBinder()));
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
            a(((PendingIntent) (obj)), aN(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(parcel.createStringArray(), aN(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(aN(parcel.readStrongBinder()), parcel.readString());
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
            parcel = ni();
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
                obj = LocationRequest.CREATOR.cJ(parcel);
            }
            a(((LocationRequest) (obj)), com.google.android.gms.location.L(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = LocationRequest.CREATOR.cJ(parcel);
            }
            a(((LocationRequest) (obj)), com.google.android.gms.location.L(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LocationRequest.CREATOR.cJ(parcel);
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
                obj = nl.CREATOR.cM(parcel);
            }
            a(((nl) (obj)), com.google.android.gms.location.L(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = nl.CREATOR.cM(parcel);
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
            a(com.google.android.gms.location.L(parcel.readStrongBinder()));
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
            S(flag);
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
            b(parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.dd(parcel);
            } else
            {
                obj = null;
            }
            j = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                obj1 = nu.CREATOR.cQ(parcel);
            } else
            {
                obj1 = null;
            }
            if (parcel.readInt() != 0)
            {
                oh4 = oh.CREATOR.cW(parcel);
            } else
            {
                oh4 = null;
            }
            a(((LatLngBounds) (obj)), j, ((nu) (obj1)), oh4, aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.dd(parcel);
            } else
            {
                obj = null;
            }
            j = parcel.readInt();
            s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj1 = nu.CREATOR.cQ(parcel);
            } else
            {
                obj1 = null;
            }
            if (parcel.readInt() != 0)
            {
                oh4 = oh.CREATOR.cW(parcel);
            }
            a(((LatLngBounds) (obj)), j, s1, ((nu) (obj1)), oh4, aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj1 = parcel.readString();
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = oh.CREATOR.cW(parcel);
            }
            a(((String) (obj1)), ((oh) (obj)), aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            Object obj2;
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR.de(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = nu.CREATOR.cQ(parcel);
            } else
            {
                obj1 = null;
            }
            obj2 = s1;
            if (parcel.readInt() != 0)
            {
                obj2 = oh.CREATOR.cW(parcel);
            }
            a(((LatLng) (obj)), ((nu) (obj1)), ((oh) (obj2)), aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = nu.CREATOR.cQ(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = oh.CREATOR.cW(parcel);
            }
            a(((nu) (obj)), ((oh) (obj1)), aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            String s = parcel.readString();
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = oh.CREATOR.cW(parcel);
            }
            b(s, ((oh) (obj)), aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 58: // ':'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            java.util.ArrayList arraylist = parcel.createStringArrayList();
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = oh.CREATOR.cW(parcel);
            }
            a(arraylist, ((oh) (obj)), aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            LatLngBounds latlngbounds;
            oh oh5;
            java.util.ArrayList arraylist1;
            if (parcel.readInt() != 0)
            {
                obj = oe.CREATOR.cV(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                latlngbounds = LatLngBounds.CREATOR.dd(parcel);
            } else
            {
                latlngbounds = null;
            }
            arraylist1 = parcel.createStringArrayList();
            if (parcel.readInt() != 0)
            {
                oh5 = oh.CREATOR.cW(parcel);
            } else
            {
                oh5 = null;
            }
            a(((oe) (obj)), latlngbounds, arraylist1, oh5, aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            oh oh1;
            if (parcel.readInt() != 0)
            {
                obj = ny.CREATOR.cS(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                oh1 = oh.CREATOR.cW(parcel);
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
                obj = oh.CREATOR.cW(parcel);
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
                obj = ns.CREATOR.cP(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                oh2 = oh.CREATOR.cW(parcel);
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
                obj = oh.CREATOR.cW(parcel);
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
            String s2 = parcel.readString();
            nq nq1;
            oh oh6;
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.dd(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                nq1 = nq.CREATOR.cO(parcel);
            } else
            {
                nq1 = null;
            }
            if (parcel.readInt() != 0)
            {
                oh6 = oh.CREATOR.cW(parcel);
            } else
            {
                oh6 = null;
            }
            a(s2, ((LatLngBounds) (obj)), nq1, oh6, aP(parcel.readStrongBinder()));
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
                oh3 = oh.CREATOR.cW(parcel);
            }
            a(((oc) (obj)), oh3, aP(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = bZ(parcel.readString());
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
                parcel1 = nw.CREATOR.cR(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj = oh.CREATOR.cW(parcel);
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
            parcel = ca(parcel.readString());
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
            parcel = nj();
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 54: // '6'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            parcel = nk();
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }
}
