// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.a;
import com.google.android.gms.maps.model.internal.ae;
import com.google.android.gms.maps.model.internal.f;
import com.google.android.gms.maps.model.internal.m;
import com.google.android.gms.maps.model.internal.s;
import com.google.android.gms.maps.model.internal.v;
import com.google.android.gms.maps.model.internal.y;
import com.google.android.gms.maps.model.internal.zzc;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzp;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.n;
import com.google.android.gms.maps.model.o;
import com.google.android.gms.maps.model.p;

// Referenced classes of package com.google.android.gms.maps.internal:
//            d, f, ai, g, 
//            i, ab, p, at, 
//            av, bf, bh, bl, 
//            bn, br, bt, bu, 
//            bw, az, bb, an, 
//            ap, ca, cc, bx, 
//            bz, cp, cr, bi, 
//            bk, aw, ay, bp, 
//            aq, as

public abstract class e extends Binder
    implements d
{

    public static d a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof d))
        {
            return (d)iinterface;
        } else
        {
            return new com.google.android.gms.maps.internal.f(ibinder);
        }
    }

    public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag13 = false;
        boolean flag3 = false;
        boolean flag14 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        Object obj6 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj5 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj1 = null;
        Object obj23 = null;
        ae ae1 = null;
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
            a(k.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(k.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(k.a(parcel.readStrongBinder()), com.google.android.gms.maps.internal.ai.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(k.a(parcel.readStrongBinder()), parcel.readInt(), com.google.android.gms.maps.internal.ai.a(parcel.readStrongBinder()));
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
                obj1 = PolylineOptions.CREATOR;
                parcel = p.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((a) (obj1)).asBinder();
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
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((v) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = MarkerOptions.CREATOR;
                parcel = n.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((s) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = GroundOverlayOptions.CREATOR;
                parcel = com.google.android.gms.maps.model.k.a(parcel);
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

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = TileOverlayOptions.CREATOR;
                parcel = com.google.android.gms.maps.model.v.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((y) (obj)).asBinder();
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
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj7;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                if (obj != null && (obj instanceof g))
                {
                    parcel = (g)obj;
                } else
                {
                    parcel = new i(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = k();
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((ab) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = l();
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.internal.p) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj10;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                if (obj != null && (obj instanceof at))
                {
                    parcel = (at)obj;
                } else
                {
                    parcel = new av(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj11;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                if (obj != null && (obj instanceof bf))
                {
                    parcel = (bf)obj;
                } else
                {
                    parcel = new bh(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj12;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                if (obj != null && (obj instanceof bl))
                {
                    parcel = (bl)obj;
                } else
                {
                    parcel = new bn(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj13;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                if (obj != null && (obj instanceof br))
                {
                    parcel = (br)obj;
                } else
                {
                    parcel = new bt(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj14;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                if (obj != null && (obj instanceof bu))
                {
                    parcel = (bu)obj;
                } else
                {
                    parcel = new bw(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj15;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                if (obj != null && (obj instanceof az))
                {
                    parcel = (az)obj;
                } else
                {
                    parcel = new bb(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj16;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                if (obj != null && (obj instanceof an))
                {
                    parcel = (an)obj;
                } else
                {
                    parcel = new ap(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = CircleOptions.CREATOR;
                parcel = j.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.model.internal.j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj17;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                if (obj != null && (obj instanceof ca))
                {
                    parcel = (ca)obj;
                } else
                {
                    parcel = new cc(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj18;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                if (obj != null && (obj instanceof bx))
                {
                    parcel = (bx)obj;
                } else
                {
                    parcel = new bz(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = parcel.readStrongBinder();
            if (obj == null)
            {
                obj = obj19;
            } else
            {
                obj1 = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                if (obj1 != null && (obj1 instanceof cp))
                {
                    obj = (cp)obj1;
                } else
                {
                    obj = new cr(((IBinder) (obj)));
                }
            }
            a(((cp) (obj)), k.a(parcel.readStrongBinder()));
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
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj20;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                if (obj != null && (obj instanceof bi))
                {
                    parcel = (bi)obj;
                } else
                {
                    parcel = new bk(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = n();
            parcel1.writeNoException();
            parcel = obj21;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.model.internal.p) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj22;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                if (obj != null && (obj instanceof aw))
                {
                    parcel = (aw)obj;
                } else
                {
                    parcel = new ay(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.internal.bp.a(parcel.readStrongBinder()));
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
            obj = obj24;
            if (parcel.readInt() != 0)
            {
                obj = zzc.CREATOR;
                obj = com.google.android.gms.maps.model.internal.e.a(parcel);
            }
            a(((zzc) (obj)));
            parcel1.writeNoException();
            return true;

        case 65: // 'A'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj25;
            if (parcel.readInt() != 0)
            {
                obj = zzc.CREATOR;
                obj = com.google.android.gms.maps.model.internal.e.a(parcel);
            }
            b(((zzc) (obj)));
            parcel1.writeNoException();
            return true;

        case 66: // 'B'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj26;
            if (parcel.readInt() != 0)
            {
                obj = zzc.CREATOR;
                obj = com.google.android.gms.maps.model.internal.e.a(parcel);
            }
            a(((zzc) (obj)), com.google.android.gms.maps.internal.ai.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 67: // 'C'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj27;
            if (parcel.readInt() != 0)
            {
                obj = zzc.CREATOR;
                obj = com.google.android.gms.maps.model.internal.e.a(parcel);
            }
            a(((zzc) (obj)), parcel.readInt(), com.google.android.gms.maps.internal.ai.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 68: // 'D'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = MarkerOptions.CREATOR;
                obj = n.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                ae1 = zzp.CREATOR;
                parcel = ae.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((MarkerOptions) (obj)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((s) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 69: // 'E'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj23;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                if (obj != null && (obj instanceof aq))
                {
                    parcel = (aq)obj;
                } else
                {
                    parcel = new as(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 70: // 'F'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = GroundOverlayOptions.CREATOR;
            obj = com.google.android.gms.maps.model.k.a(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            f f3 = zze.CREATOR;
            parcel = f.a(parcel);
        } else
        {
            parcel = null;
        }
        obj = a(((GroundOverlayOptions) (obj)), parcel);
        parcel1.writeNoException();
        parcel = ae1;
        if (obj != null)
        {
            parcel = ((m) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
