// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.model.c;
import com.google.android.m4b.maps.model.d;
import com.google.android.m4b.maps.model.i;
import com.google.android.m4b.maps.model.internal.e;
import com.google.android.m4b.maps.model.internal.f;
import com.google.android.m4b.maps.model.internal.g;
import com.google.android.m4b.maps.model.internal.j;
import com.google.android.m4b.maps.model.internal.k;
import com.google.android.m4b.maps.model.internal.l;
import com.google.android.m4b.maps.model.internal.m;
import com.google.android.m4b.maps.model.internal.n;

// Referenced classes of package com.google.android.m4b.maps.df:
//            r, aa, ab, ac, 
//            ae, af, ag, ah, 
//            ai, aj, ak, al, 
//            am, an, h, u, 
//            w, z, g, l

public interface t
    extends IInterface
{
    public static abstract class a extends Binder
        implements t
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
        {
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag13 = false;
            boolean flag3 = false;
            boolean flag14 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            Object obj7 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj5 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj6 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = e();
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                float f1 = f();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                float f2 = g();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                b(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()), com.google.android.m4b.maps.df.r.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()), parcel.readInt(), com.google.android.m4b.maps.df.r.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                h();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    obj2 = PolylineOptions.CREATOR;
                    parcel = com.google.android.m4b.maps.model.n.a(parcel);
                } else
                {
                    parcel = null;
                }
                obj2 = a(parcel);
                parcel1.writeNoException();
                parcel = obj;
                if (obj2 != null)
                {
                    parcel = ((m) (obj2)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                l l1;
                if (parcel.readInt() != 0)
                {
                    parcel = PolygonOptions.CREATOR.a(parcel);
                } else
                {
                    parcel = null;
                }
                l1 = a(parcel);
                parcel1.writeNoException();
                parcel = obj7;
                if (l1 != null)
                {
                    parcel = l1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                k k2;
                if (parcel.readInt() != 0)
                {
                    com.google.android.m4b.maps.model.k k1 = MarkerOptions.CREATOR;
                    parcel = com.google.android.m4b.maps.model.k.a(parcel);
                } else
                {
                    parcel = null;
                }
                k2 = a(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj2));
                if (k2 != null)
                {
                    parcel = k2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                f f3;
                if (parcel.readInt() != 0)
                {
                    com.google.android.m4b.maps.model.e e1 = GroundOverlayOptions.CREATOR;
                    parcel = com.google.android.m4b.maps.model.e.a(parcel);
                } else
                {
                    parcel = null;
                }
                f3 = a(parcel);
                parcel1.writeNoException();
                parcel = obj3;
                if (f3 != null)
                {
                    parcel = f3.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                n n1;
                if (parcel.readInt() != 0)
                {
                    com.google.android.m4b.maps.model.t t1 = TileOverlayOptions.CREATOR;
                    parcel = com.google.android.m4b.maps.model.t.a(parcel);
                } else
                {
                    parcel = null;
                }
                n1 = a(parcel);
                parcel1.writeNoException();
                parcel = obj4;
                if (n1 != null)
                {
                    parcel = n1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                q();
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                i1 = p();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                flag5 = j();
                parcel1.writeNoException();
                if (flag5)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                parcel1.writeInt(i1);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                a(flag5);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag6 = k();
                parcel1.writeNoException();
                i1 = ((flag) ? 1 : 0);
                if (flag6)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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
                i1 = ((flag1) ? 1 : 0);
                if (flag7)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag8 = n();
                parcel1.writeNoException();
                i1 = ((flag2) ? 1 : 0);
                if (flag8)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag9 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                e(flag9);
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = o();
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj8;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                    if (iinterface != null && (iinterface instanceof w))
                    {
                        parcel = (w)iinterface;
                    } else
                    {
                        parcel = new w.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                com.google.android.m4b.maps.df.l l2 = s();
                parcel1.writeNoException();
                parcel = obj9;
                if (l2 != null)
                {
                    parcel = l2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                com.google.android.m4b.maps.df.g g1 = r();
                parcel1.writeNoException();
                parcel = obj10;
                if (g1 != null)
                {
                    parcel = g1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj11;
                } else
                {
                    IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnCameraChangeListener");
                    if (iinterface1 != null && (iinterface1 instanceof aa))
                    {
                        parcel = (aa)iinterface1;
                    } else
                    {
                        parcel = new aa.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj12;
                } else
                {
                    IInterface iinterface2 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapClickListener");
                    if (iinterface2 != null && (iinterface2 instanceof ae))
                    {
                        parcel = (ae)iinterface2;
                    } else
                    {
                        parcel = new ae.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj13;
                } else
                {
                    IInterface iinterface3 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapLongClickListener");
                    if (iinterface3 != null && (iinterface3 instanceof ag))
                    {
                        parcel = (ag)iinterface3;
                    } else
                    {
                        parcel = new ag.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj14;
                } else
                {
                    IInterface iinterface4 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
                    if (iinterface4 != null && (iinterface4 instanceof aj))
                    {
                        parcel = (aj)iinterface4;
                    } else
                    {
                        parcel = new aj.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj15;
                } else
                {
                    IInterface iinterface5 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                    if (iinterface5 != null && (iinterface5 instanceof ak))
                    {
                        parcel = (ak)iinterface5;
                    } else
                    {
                        parcel = new ak.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj16;
                } else
                {
                    IInterface iinterface6 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
                    if (iinterface6 != null && (iinterface6 instanceof ac))
                    {
                        parcel = (ac)iinterface6;
                    } else
                    {
                        parcel = new ac.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj17;
                } else
                {
                    IInterface iinterface7 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                    if (iinterface7 != null && (iinterface7 instanceof u))
                    {
                        parcel = (u)iinterface7;
                    } else
                    {
                        parcel = new u.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                e e2;
                if (parcel.readInt() != 0)
                {
                    d d1 = CircleOptions.CREATOR;
                    parcel = com.google.android.m4b.maps.model.d.a(parcel);
                } else
                {
                    parcel = null;
                }
                e2 = a(parcel);
                parcel1.writeNoException();
                parcel = obj5;
                if (e2 != null)
                {
                    parcel = e2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj18;
                } else
                {
                    IInterface iinterface8 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
                    if (iinterface8 != null && (iinterface8 instanceof am))
                    {
                        parcel = (am)iinterface8;
                    } else
                    {
                        parcel = new am.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj19;
                } else
                {
                    IInterface iinterface9 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
                    if (iinterface9 != null && (iinterface9 instanceof al))
                    {
                        parcel = (al)iinterface9;
                    } else
                    {
                        parcel = new al.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                Object obj1 = parcel.readStrongBinder();
                if (obj1 == null)
                {
                    obj1 = obj20;
                } else
                {
                    IInterface iinterface15 = ((IBinder) (obj1)).queryLocalInterface("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                    if (iinterface15 != null && (iinterface15 instanceof h))
                    {
                        obj1 = (h)iinterface15;
                    } else
                    {
                        obj1 = new h.a.a(((IBinder) (obj1)));
                    }
                }
                a(((h) (obj1)), com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag10 = m();
                parcel1.writeNoException();
                i1 = ((flag3) ? 1 : 0);
                if (flag10)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag11 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                d(flag11);
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj21;
                } else
                {
                    IInterface iinterface10 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
                    if (iinterface10 != null && (iinterface10 instanceof af))
                    {
                        parcel = (af)iinterface10;
                    } else
                    {
                        parcel = new af.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                g g2 = E();
                parcel1.writeNoException();
                parcel = obj22;
                if (g2 != null)
                {
                    parcel = g2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj23;
                } else
                {
                    IInterface iinterface11 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                    if (iinterface11 != null && (iinterface11 instanceof ab))
                    {
                        parcel = (ab)iinterface11;
                    } else
                    {
                        parcel = new ab.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj24;
                } else
                {
                    IInterface iinterface12 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                    if (iinterface12 != null && (iinterface12 instanceof z))
                    {
                        parcel = (z)iinterface12;
                    } else
                    {
                        parcel = new z.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                j j2;
                if (parcel.readInt() != 0)
                {
                    i i2 = MapsEngineLayerOptions.CREATOR;
                    parcel = i.a(parcel);
                } else
                {
                    parcel = null;
                }
                j2 = a(parcel);
                parcel1.writeNoException();
                parcel = obj6;
                if (j2 != null)
                {
                    parcel = j2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj25;
                } else
                {
                    IInterface iinterface13 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                    if (iinterface13 != null && (iinterface13 instanceof ai))
                    {
                        parcel = (ai)iinterface13;
                    } else
                    {
                        parcel = new ai.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a(ah.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 54: // '6'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 56: // '8'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 57: // '9'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                a();
                parcel1.writeNoException();
                return true;

            case 58: // ':'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 59: // ';'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                boolean flag12 = C();
                parcel1.writeNoException();
                i1 = ((flag4) ? 1 : 0);
                if (flag12)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 60: // '<'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                b(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 80: // 'P'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj26;
                } else
                {
                    IInterface iinterface14 = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnPoiClickListener");
                    if (iinterface14 != null && (iinterface14 instanceof an))
                    {
                        parcel = (an)iinterface14;
                    } else
                    {
                        parcel = new an.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 81: // 'Q'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                c(parcel);
                parcel1.writeNoException();
                return true;

            case 82: // 'R'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                D();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IGoogleMapDelegate");
        }
    }

    static final class a.a
        implements t
    {

        private IBinder a;

        public final boolean C()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(59, parcel, parcel1, 0);
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

        public final void D()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(82, parcel, parcel1, 0);
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

        public final g E()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            g g1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            g1 = com.google.android.m4b.maps.model.internal.g.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return g1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final e a(CircleOptions circleoptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (circleoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            circleoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            circleoptions = com.google.android.m4b.maps.model.internal.e.a.a(parcel1.readStrongBinder());
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

        public final f a(GroundOverlayOptions groundoverlayoptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (groundoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            groundoverlayoptions = com.google.android.m4b.maps.model.internal.f.a.a(parcel1.readStrongBinder());
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

        public final j a(MapsEngineLayerOptions mapsenginelayeroptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (mapsenginelayeroptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            mapsenginelayeroptions.writeToParcel(parcel, 0);
_L1:
            a.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            mapsenginelayeroptions = com.google.android.m4b.maps.model.internal.j.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return mapsenginelayeroptions;
            parcel.writeInt(0);
              goto _L1
            mapsenginelayeroptions;
            parcel1.recycle();
            parcel.recycle();
            throw mapsenginelayeroptions;
        }

        public final k a(MarkerOptions markeroptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (markeroptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            markeroptions.writeToParcel(parcel, 0);
_L1:
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            markeroptions = com.google.android.m4b.maps.model.internal.k.a.a(parcel1.readStrongBinder());
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

        public final l a(PolygonOptions polygonoptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (polygonoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polygonoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            polygonoptions = com.google.android.m4b.maps.model.internal.l.a.a(parcel1.readStrongBinder());
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

        public final m a(PolylineOptions polylineoptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (polylineoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            polylineoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            polylineoptions = com.google.android.m4b.maps.model.internal.m.a.a(parcel1.readStrongBinder());
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

        public final n a(TileOverlayOptions tileoverlayoptions)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (tileoverlayoptions == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            tileoverlayoptions = com.google.android.m4b.maps.model.internal.n.a.a(parcel1.readStrongBinder());
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

        public final void a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void a(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i);
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

        public final void a(int i, int l, int i1, int j1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            parcel.writeInt(i);
            parcel.writeInt(l);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
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

        public final void a(Bundle bundle)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void a(b b1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(4, parcel, parcel1, 0);
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

        public final void a(b b1, int i, r r1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            parcel.writeInt(i);
            b1 = obj;
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            b1 = r1.asBinder();
            parcel.writeStrongBinder(b1);
            a.transact(7, parcel, parcel1, 0);
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

        public final void a(b b1, r r1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            b1 = obj;
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            b1 = r1.asBinder();
            parcel.writeStrongBinder(b1);
            a.transact(6, parcel, parcel1, 0);
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

        public final void a(aa aa1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (aa1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            aa1 = aa1.asBinder();
_L1:
            parcel.writeStrongBinder(aa1);
            a.transact(27, parcel, parcel1, 0);
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

        public final void a(ab ab1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            a.transact(45, parcel, parcel1, 0);
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

        public final void a(ac ac1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            a.transact(32, parcel, parcel1, 0);
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

        public final void a(ae ae1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ae1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ae1 = ae1.asBinder();
_L1:
            parcel.writeStrongBinder(ae1);
            a.transact(28, parcel, parcel1, 0);
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

        public final void a(af af1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            a.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public final void a(ag ag1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ag1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ag1 = ag1.asBinder();
_L1:
            parcel.writeStrongBinder(ag1);
            a.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ag1 = null;
              goto _L1
            ag1;
            parcel1.recycle();
            parcel.recycle();
            throw ag1;
        }

        public final void a(ah ah1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ah1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ah1 = ah1.asBinder();
_L1:
            parcel.writeStrongBinder(ah1);
            a.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ah1 = null;
              goto _L1
            ah1;
            parcel1.recycle();
            parcel.recycle();
            throw ah1;
        }

        public final void a(ai ai1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ai1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ai1 = ai1.asBinder();
_L1:
            parcel.writeStrongBinder(ai1);
            a.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ai1 = null;
              goto _L1
            ai1;
            parcel1.recycle();
            parcel.recycle();
            throw ai1;
        }

        public final void a(aj aj1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (aj1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            aj1 = aj1.asBinder();
_L1:
            parcel.writeStrongBinder(aj1);
            a.transact(30, parcel, parcel1, 0);
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

        public final void a(ak ak1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (ak1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ak1 = ak1.asBinder();
_L1:
            parcel.writeStrongBinder(ak1);
            a.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ak1 = null;
              goto _L1
            ak1;
            parcel1.recycle();
            parcel.recycle();
            throw ak1;
        }

        public final void a(al al1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (al1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            al1 = al1.asBinder();
_L1:
            parcel.writeStrongBinder(al1);
            a.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            al1 = null;
              goto _L1
            al1;
            parcel1.recycle();
            parcel.recycle();
            throw al1;
        }

        public final void a(am am1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (am1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            am1 = am1.asBinder();
_L1:
            parcel.writeStrongBinder(am1);
            a.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            am1 = null;
              goto _L1
            am1;
            parcel1.recycle();
            parcel.recycle();
            throw am1;
        }

        public final void a(an an1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (an1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            an1 = an1.asBinder();
_L1:
            parcel.writeStrongBinder(an1);
            a.transact(80, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            an1 = null;
              goto _L1
            an1;
            parcel1.recycle();
            parcel.recycle();
            throw an1;
        }

        public final void a(h h1, b b1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (h1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            h1 = h1.asBinder();
_L1:
            parcel.writeStrongBinder(h1);
            h1 = obj;
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            h1 = b1.asBinder();
            parcel.writeStrongBinder(h1);
            a.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            h1 = null;
              goto _L1
            h1;
            parcel1.recycle();
            parcel.recycle();
            throw h1;
        }

        public final void a(u u1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (u1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            u1 = u1.asBinder();
_L1:
            parcel.writeStrongBinder(u1);
            a.transact(33, parcel, parcel1, 0);
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

        public final void a(w w1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(24, parcel, parcel1, 0);
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

        public final void a(z z1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (z1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            z1 = z1.asBinder();
_L1:
            parcel.writeStrongBinder(z1);
            a.transact(48, parcel, parcel1, 0);
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

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void b(Bundle bundle)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void b(b b1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(5, parcel, parcel1, 0);
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

        public final void b(String s1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final boolean b(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
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

        public final void c()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void c(Bundle bundle)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            a.transact(81, parcel, parcel1, 0);
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

        public final void d()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void d(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final CameraPosition e()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = CameraPosition.CREATOR;
            obj = com.google.android.m4b.maps.model.c.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((CameraPosition) (obj));
_L2:
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void e(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final float f()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final float g()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final void h()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final boolean j()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(17, parcel, parcel1, 0);
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

        public final boolean k()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(19, parcel, parcel1, 0);
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

        public final boolean m()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(40, parcel, parcel1, 0);
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

        public final boolean n()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(21, parcel, parcel1, 0);
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

        public final Location o()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final int p()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void q()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
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

        public final com.google.android.m4b.maps.df.g r()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.m4b.maps.df.g g1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            g1 = com.google.android.m4b.maps.df.g.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return g1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final com.google.android.m4b.maps.df.l s()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.m4b.maps.df.l l;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            a.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            l = com.google.android.m4b.maps.df.l.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return l;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract boolean C();

    public abstract void D();

    public abstract g E();

    public abstract e a(CircleOptions circleoptions);

    public abstract f a(GroundOverlayOptions groundoverlayoptions);

    public abstract j a(MapsEngineLayerOptions mapsenginelayeroptions);

    public abstract k a(MarkerOptions markeroptions);

    public abstract l a(PolygonOptions polygonoptions);

    public abstract m a(PolylineOptions polylineoptions);

    public abstract n a(TileOverlayOptions tileoverlayoptions);

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(int i, int l, int i1, int j1);

    public abstract void a(Bundle bundle);

    public abstract void a(b b1);

    public abstract void a(b b1, int i, r r1);

    public abstract void a(b b1, r r1);

    public abstract void a(aa aa);

    public abstract void a(ab ab);

    public abstract void a(ac ac);

    public abstract void a(ae ae);

    public abstract void a(af af);

    public abstract void a(ag ag);

    public abstract void a(ah ah);

    public abstract void a(ai ai);

    public abstract void a(aj aj);

    public abstract void a(ak ak);

    public abstract void a(al al);

    public abstract void a(am am);

    public abstract void a(an an);

    public abstract void a(h h1, b b1);

    public abstract void a(u u);

    public abstract void a(w w);

    public abstract void a(z z);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void b(b b1);

    public abstract void b(String s1);

    public abstract boolean b(boolean flag);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract void d();

    public abstract void d(boolean flag);

    public abstract CameraPosition e();

    public abstract void e(boolean flag);

    public abstract float f();

    public abstract float g();

    public abstract void h();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean m();

    public abstract boolean n();

    public abstract Location o();

    public abstract int p();

    public abstract void q();

    public abstract com.google.android.m4b.maps.df.g r();

    public abstract com.google.android.m4b.maps.df.l s();
}
