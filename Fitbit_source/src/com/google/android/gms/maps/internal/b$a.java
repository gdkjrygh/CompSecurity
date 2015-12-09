// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.aa;
import com.google.android.gms.maps.model.ai;
import com.google.android.gms.maps.model.internal.b;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.maps.model.internal.e;
import com.google.android.gms.maps.model.internal.f;
import com.google.android.gms.maps.model.internal.g;
import com.google.android.gms.maps.model.internal.i;
import com.google.android.gms.maps.model.internal.j;
import com.google.android.gms.maps.model.internal.k;
import com.google.android.gms.maps.model.internal.m;
import com.google.android.gms.maps.model.internal.n;
import com.google.android.gms.maps.model.internal.o;
import com.google.android.gms.maps.model.internal.p;
import com.google.android.gms.maps.model.internal.r;
import com.google.android.gms.maps.model.q;
import com.google.android.gms.maps.model.w;
import com.google.android.gms.maps.model.y;

// Referenced classes of package com.google.android.gms.maps.internal:
//            b, j, f, o, 
//            aa, ab, ac, ad, 
//            ae, aj, c, q, 
//            r, s, t, u, 
//            w, x, z

public static abstract class a.a extends Binder
    implements com.google.android.gms.maps.internal.b
{
    private static class a
        implements com.google.android.gms.maps.internal.b
    {

        private IBinder a;

        public CameraPosition a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            CameraPosition cameraposition = CameraPosition.CREATOR.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return cameraposition;
_L2:
            cameraposition = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public b a(PolylineOptions polylineoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polylineoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polylineoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            polylineoptions = com.google.android.gms.maps.model.internal.b.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return polylineoptions;
            parcel.writeInt(0);
              goto _L1
            polylineoptions;
            parcel1.recycle();
            parcel.recycle();
            throw polylineoptions;
        }

        public i a(CircleOptions circleoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (circleoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            circleoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            circleoptions = com.google.android.gms.maps.model.internal.i.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return circleoptions;
            parcel.writeInt(0);
              goto _L1
            circleoptions;
            parcel1.recycle();
            parcel.recycle();
            throw circleoptions;
        }

        public j a(GroundOverlayOptions groundoverlayoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.gms.maps.model.internal.j.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return groundoverlayoptions;
            parcel.writeInt(0);
              goto _L1
            groundoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw groundoverlayoptions;
        }

        public j a(GroundOverlayOptions groundoverlayoptions, e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundoverlayoptions == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            groundoverlayoptions.writeToParcel(parcel, 0);
_L3:
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            parcel.writeInt(1);
            e1.writeToParcel(parcel, 0);
_L4:
            a.transact(70, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.gms.maps.model.internal.j.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return groundoverlayoptions;
_L2:
            parcel.writeInt(0);
              goto _L3
            groundoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw groundoverlayoptions;
            parcel.writeInt(0);
              goto _L4
        }

        public m a(MarkerOptions markeroptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markeroptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            markeroptions.writeToParcel(parcel, 0);
_L1:
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.gms.maps.model.internal.m.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return markeroptions;
            parcel.writeInt(0);
              goto _L1
            markeroptions;
            parcel1.recycle();
            parcel.recycle();
            throw markeroptions;
        }

        public m a(MarkerOptions markeroptions, p p1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markeroptions == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            markeroptions.writeToParcel(parcel, 0);
_L3:
            if (p1 == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            parcel.writeInt(1);
            p1.writeToParcel(parcel, 0);
_L4:
            a.transact(68, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.gms.maps.model.internal.m.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return markeroptions;
_L2:
            parcel.writeInt(0);
              goto _L3
            markeroptions;
            parcel1.recycle();
            parcel.recycle();
            throw markeroptions;
            parcel.writeInt(0);
              goto _L4
        }

        public n a(PolygonOptions polygonoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polygonoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polygonoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            polygonoptions = com.google.android.gms.maps.model.internal.n.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return polygonoptions;
            parcel.writeInt(0);
              goto _L1
            polygonoptions;
            parcel1.recycle();
            parcel.recycle();
            throw polygonoptions;
        }

        public o a(TileOverlayOptions tileoverlayoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (tileoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            tileoverlayoptions = com.google.android.gms.maps.model.internal.o.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return tileoverlayoptions;
            parcel.writeInt(0);
              goto _L1
            tileoverlayoptions;
            parcel1.recycle();
            parcel.recycle();
            throw tileoverlayoptions;
        }

        public void a(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i1);
            a.transact(16, parcel, parcel1, 0);
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

        public void a(int i1, int j1, int k1, int l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            parcel.writeInt(l1);
            a.transact(39, parcel, parcel1, 0);
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

        public void a(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            a.transact(54, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void a(com.google.android.gms.dynamic.e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
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

        public void a(com.google.android.gms.dynamic.e e1, int i1, com.google.android.gms.maps.internal.o o1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            parcel.writeInt(i1);
            e1 = obj;
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            e1 = o1.asBinder();
            parcel.writeStrongBinder(e1);
            a.transact(7, parcel, parcel1, 0);
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

        public void a(com.google.android.gms.dynamic.e e1, com.google.android.gms.maps.internal.o o1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            e1 = obj;
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            e1 = o1.asBinder();
            parcel.writeStrongBinder(e1);
            a.transact(6, parcel, parcel1, 0);
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

        public void a(com.google.android.gms.maps.internal.aa aa1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (aa1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            aa1 = aa1.asBinder();
_L1:
            parcel.writeStrongBinder(aa1);
            a.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            aa1 = null;
              goto _L1
            aa1;
            parcel1.recycle();
            parcel.recycle();
            throw aa1;
        }

        public void a(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            a.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void a(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            a.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void a(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            a.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void a(ae ae1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (ae1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ae1 = ae1.asBinder();
_L1:
            parcel.writeStrongBinder(ae1);
            a.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ae1 = null;
              goto _L1
            ae1;
            parcel1.recycle();
            parcel.recycle();
            throw ae1;
        }

        public void a(aj aj1, com.google.android.gms.dynamic.e e1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (aj1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            aj1 = aj1.asBinder();
_L1:
            parcel.writeStrongBinder(aj1);
            aj1 = obj;
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            aj1 = e1.asBinder();
            parcel.writeStrongBinder(aj1);
            a.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            aj1 = null;
              goto _L1
            aj1;
            parcel1.recycle();
            parcel.recycle();
            throw aj1;
        }

        public void a(com.google.android.gms.maps.internal.c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public void a(com.google.android.gms.maps.internal.q q1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            q1 = q1.asBinder();
_L1:
            parcel.writeStrongBinder(q1);
            a.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            q1 = null;
              goto _L1
            q1;
            parcel1.recycle();
            parcel.recycle();
            throw q1;
        }

        public void a(com.google.android.gms.maps.internal.r r1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            r1 = r1.asBinder();
_L1:
            parcel.writeStrongBinder(r1);
            a.transact(69, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            r1 = null;
              goto _L1
            r1;
            parcel1.recycle();
            parcel.recycle();
            throw r1;
        }

        public void a(s s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            s1 = s1.asBinder();
_L1:
            parcel.writeStrongBinder(s1);
            a.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1 = null;
              goto _L1
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void a(t t1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (t1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            t1 = t1.asBinder();
_L1:
            parcel.writeStrongBinder(t1);
            a.transact(45, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            t1 = null;
              goto _L1
            t1;
            parcel1.recycle();
            parcel.recycle();
            throw t1;
        }

        public void a(u u1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (u1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            u1 = u1.asBinder();
_L1:
            parcel.writeStrongBinder(u1);
            a.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            u1 = null;
              goto _L1
            u1;
            parcel1.recycle();
            parcel.recycle();
            throw u1;
        }

        public void a(com.google.android.gms.maps.internal.w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public void a(x x1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (x1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            x1 = x1.asBinder();
_L1:
            parcel.writeStrongBinder(x1);
            a.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            x1 = null;
              goto _L1
            x1;
            parcel1.recycle();
            parcel.recycle();
            throw x1;
        }

        public void a(z z1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            z1 = z1.asBinder();
_L1:
            parcel.writeStrongBinder(z1);
            a.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            z1 = null;
              goto _L1
            z1;
            parcel1.recycle();
            parcel.recycle();
            throw z1;
        }

        public void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L1:
            a.transact(64, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public void a(c c1, int i1, com.google.android.gms.maps.internal.o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L3:
            parcel.writeInt(i1);
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            c1 = o1.asBinder();
_L4:
            parcel.writeStrongBinder(c1);
            a.transact(67, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
            c1 = null;
              goto _L4
        }

        public void a(c c1, com.google.android.gms.maps.internal.o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L3:
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            c1 = o1.asBinder();
_L4:
            parcel.writeStrongBinder(c1);
            a.transact(66, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
            c1 = null;
              goto _L4
        }

        public void a(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel.writeString(s1);
            a.transact(61, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(18, parcel, parcel1, 0);
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

        public IBinder asBinder()
        {
            return a;
        }

        public float b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void b(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            a.transact(60, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() != 0)
            {
                bundle.readFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void b(com.google.android.gms.dynamic.e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            a.transact(5, parcel, parcel1, 0);
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

        public void b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L1:
            a.transact(65, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public boolean b(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
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

        public float c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void c(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(22, parcel, parcel1, 0);
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

        public void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(8, parcel, parcel1, 0);
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

        public void d(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(41, parcel, parcel1, 0);
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

        public void e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(14, parcel, parcel1, 0);
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

        public int f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(17, parcel, parcel1, 0);
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

        public boolean h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(19, parcel, parcel1, 0);
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

        public boolean i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(21, parcel, parcel1, 0);
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

        public Location j()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(23, parcel, parcel1, 0);
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

        public com.google.android.gms.maps.internal.j k()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.internal.j j1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            j1 = com.google.android.gms.maps.internal.j.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return j1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public com.google.android.gms.maps.internal.f l()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.internal.f f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            f1 = com.google.android.gms.maps.internal.f.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean m()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(40, parcel, parcel1, 0);
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

        public k n()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            k k1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            k1 = com.google.android.gms.maps.model.internal.k.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return k1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void o()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(55, parcel, parcel1, 0);
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

        public void p()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(56, parcel, parcel1, 0);
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

        public void q()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(57, parcel, parcel1, 0);
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

        public void r()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(58, parcel, parcel1, 0);
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

        public boolean s()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a.transact(59, parcel, parcel1, 0);
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static com.google.android.gms.maps.internal.b a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.internal.b))
        {
            return (com.google.android.gms.maps.internal.b)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
        throws RemoteException
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag13 = false;
        boolean flag3 = false;
        boolean flag14 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj6 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        b b1 = null;
        Object obj1 = null;
        Object obj = null;
        switch (l)
        {
        default:
            return super.onTransact(l, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f1 = b();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f2 = c();
            parcel1.writeNoException();
            parcel1.writeFloat(f2);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()), parcel.readInt(), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = PolylineOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            b1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = PolygonOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((n) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = MarkerOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((m) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = GroundOverlayOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = TileOverlayOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((o) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            l = f();
            parcel1.writeNoException();
            parcel1.writeInt(l);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            flag5 = g();
            parcel1.writeNoException();
            if (flag5)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            parcel1.writeInt(l);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            a(flag5);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag6 = h();
            parcel1.writeNoException();
            l = ((flag) ? 1 : 0);
            if (flag6)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            flag7 = b(flag7);
            parcel1.writeNoException();
            l = ((flag1) ? 1 : 0);
            if (flag7)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag8 = i();
            parcel1.writeNoException();
            l = ((flag2) ? 1 : 0);
            if (flag8)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag9 = flag13;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            c(flag9);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = j();
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

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = k();
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.internal.j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = l();
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.internal.f) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = CircleOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((i) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()), com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag10 = m();
            parcel1.writeNoException();
            l = ((flag3) ? 1 : 0);
            if (flag10)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag11 = flag14;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            }
            d(flag11);
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = n();
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((k) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 54: // '6'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 55: // '7'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            o();
            parcel1.writeNoException();
            return true;

        case 56: // '8'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            p();
            parcel1.writeNoException();
            return true;

        case 57: // '9'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            q();
            parcel1.writeNoException();
            return true;

        case 58: // ':'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            r();
            parcel1.writeNoException();
            return true;

        case 59: // ';'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag12 = s();
            parcel1.writeNoException();
            l = ((flag4) ? 1 : 0);
            if (flag12)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 60: // '<'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
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
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 64: // '@'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = c.CREATOR.a(parcel);
            }
            a(((c) (obj)));
            parcel1.writeNoException();
            return true;

        case 65: // 'A'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj11;
            if (parcel.readInt() != 0)
            {
                obj = c.CREATOR.a(parcel);
            }
            b(((c) (obj)));
            parcel1.writeNoException();
            return true;

        case 66: // 'B'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj12;
            if (parcel.readInt() != 0)
            {
                obj = c.CREATOR.a(parcel);
            }
            a(((c) (obj)), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 67: // 'C'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj13;
            if (parcel.readInt() != 0)
            {
                obj = c.CREATOR.a(parcel);
            }
            a(((c) (obj)), parcel.readInt(), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 68: // 'D'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = MarkerOptions.CREATOR.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = p.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((MarkerOptions) (obj)), parcel);
            parcel1.writeNoException();
            parcel = b1;
            if (obj != null)
            {
                parcel = ((m) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 69: // 'E'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 70: // 'F'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = GroundOverlayOptions.CREATOR.a(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            parcel = e.CREATOR.a(parcel);
        } else
        {
            parcel = null;
        }
        obj = a(((GroundOverlayOptions) (obj)), parcel);
        parcel1.writeNoException();
        parcel = obj1;
        if (obj != null)
        {
            parcel = ((j) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
