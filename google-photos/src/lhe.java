// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.ParcelableGeofence;

public abstract class lhe extends Binder
    implements lhd
{

    public static lhd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (iinterface != null && (iinterface instanceof lhd))
        {
            return (lhd)iinterface;
        } else
        {
            return new lhf(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag = false;
        IBinder ibinder = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj = null;
        Object obj1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj1 = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
            if (parcel.readInt() != 0)
            {
                obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            a(((java.util.List) (obj1)), ((PendingIntent) (obj)), lhb.a(parcel.readStrongBinder()), parcel.readString());
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
            a(((GeofencingRequest) (obj)), ((PendingIntent) (obj1)), lhb.a(parcel.readStrongBinder()));
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
            a(((PendingIntent) (obj)), lhb.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(parcel.createStringArray(), lhb.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(lhb.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            long l = parcel.readLong();
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

        case 65: // 'A'
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

        case 66: // 'B'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = c(parcel);
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
                obj = GestureRequest.CREATOR;
                obj = lii.a(parcel);
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
            parcel = a(((GestureRequest) (obj)), parcel);
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
            parcel = d(parcel);
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
                obj = lgt.a(parcel);
            }
            a(((com.google.android.gms.location.LocationRequest) (obj)), lin.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = ibinder;
            if (parcel.readInt() != 0)
            {
                obj = lgt.a(parcel);
            }
            a(((com.google.android.gms.location.LocationRequest) (obj)), lin.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = lgt.a(parcel);
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
            a(((com.google.android.gms.location.LocationRequest) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = LocationRequestInternal.CREATOR;
                obj = lhn.a(parcel);
            }
            a(((LocationRequestInternal) (obj)), lin.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0)
            {
                obj = LocationRequestInternal.CREATOR;
                obj = lhn.a(parcel);
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
            a(((LocationRequestInternal) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(lin.a(parcel.readStrongBinder()));
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
            e(parcel);
            parcel1.writeNoException();
            return true;

        case 59: // ';'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = lho.a(parcel);
            }
            a(((com.google.android.gms.location.internal.LocationRequestUpdateData) (obj)));
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
            obj1 = (LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(parcel);
        } else
        {
            obj1 = null;
        }
        ibinder = parcel.readStrongBinder();
        if (ibinder != null)
        {
            obj = ibinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            if (obj != null && (obj instanceof lhg))
            {
                obj = (lhg)obj;
            } else
            {
                obj = new lhi(ibinder);
            }
        }
        a(((LocationSettingsRequest) (obj1)), ((lhg) (obj)), parcel.readString());
        parcel1.writeNoException();
        return true;
    }
}
