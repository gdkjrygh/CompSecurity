// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;

public abstract class aud extends Binder
    implements auc
{

    public static auc a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof auc))
        {
            return (auc)iinterface;
        } else
        {
            return new aue(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
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
        Object obj5 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj1 = null;
        azi azi1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

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
            float f = b();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f1 = c();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(aag.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(aag.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(aag.a(parcel.readStrongBinder()), avh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(aag.a(parcel.readStrongBinder()), parcel.readInt(), avh.a(parcel.readStrongBinder()));
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
                parcel = azq.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((aye) (obj1)).asBinder();
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
                parcel = ((ayz) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = MarkerOptions.CREATOR;
                parcel = azo.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((ayw) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = GroundOverlayOptions.CREATOR;
                parcel = azl.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((ayq) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = TileOverlayOptions.CREATOR;
                parcel = azw.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((azc) (obj)).asBinder();
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
            i = f();
            parcel1.writeNoException();
            parcel1.writeInt(i);
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
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
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
            i = ((flag) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
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
            i = ((flag1) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag8 = i();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag8)
            {
                i = 1;
            }
            parcel1.writeInt(i);
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
            a(aug.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = k();
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((ava) (obj)).asBinder();
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
                parcel = ((auo) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(avt.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awf.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awl.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awr.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awu.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(avz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(avn.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = CircleOptions.CREATOR;
                parcel = azk.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((ayn) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(axa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(axs.a(parcel.readStrongBinder()), aag.a(parcel.readStrongBinder()));
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
            i = ((flag3) ? 1 : 0);
            if (flag10)
            {
                i = 1;
            }
            parcel1.writeInt(i);
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
            a(awi.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = n();
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((ayt) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(avw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(awo.a(parcel.readStrongBinder()));
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
            i = ((flag4) ? 1 : 0);
            if (flag12)
            {
                i = 1;
            }
            parcel1.writeInt(i);
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
                obj = CameraUpdateParcelable.CREATOR;
                obj = ayi.a(parcel);
            }
            a(((CameraUpdateParcelable) (obj)));
            parcel1.writeNoException();
            return true;

        case 65: // 'A'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj11;
            if (parcel.readInt() != 0)
            {
                obj = CameraUpdateParcelable.CREATOR;
                obj = ayi.a(parcel);
            }
            b(((CameraUpdateParcelable) (obj)));
            parcel1.writeNoException();
            return true;

        case 66: // 'B'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj12;
            if (parcel.readInt() != 0)
            {
                obj = CameraUpdateParcelable.CREATOR;
                obj = ayi.a(parcel);
            }
            a(((CameraUpdateParcelable) (obj)), avh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 67: // 'C'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obj = obj13;
            if (parcel.readInt() != 0)
            {
                obj = CameraUpdateParcelable.CREATOR;
                obj = ayi.a(parcel);
            }
            a(((CameraUpdateParcelable) (obj)), parcel.readInt(), avh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 68: // 'D'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj = MarkerOptions.CREATOR;
                obj = azo.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                azi1 = MarkerOptionsParcelable.CREATOR;
                parcel = azi.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((MarkerOptions) (obj)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((ayw) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 69: // 'E'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(avq.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 70: // 'F'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = GroundOverlayOptions.CREATOR;
            obj = azl.a(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            ayj ayj1 = GroundOverlayOptionsParcelable.CREATOR;
            parcel = ayj.a(parcel);
        } else
        {
            parcel = null;
        }
        obj = a(((GroundOverlayOptions) (obj)), parcel);
        parcel1.writeNoException();
        parcel = azi1;
        if (obj != null)
        {
            parcel = ((ayq) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
