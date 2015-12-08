// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            e, g, zzu, zzw, 
//            zzas, zzaa, zzs, zzaw, 
//            zzac, zzae, zzy, zzaz

public abstract class f extends Binder
    implements e
{

    public f()
    {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static e a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (iinterface != null && (iinterface instanceof e))
        {
            return (e)iinterface;
        } else
        {
            return new g(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (parcel.readInt() != 0)
            {
                obj = (zzu)zzu.CREATOR.createFromParcel(parcel);
            }
            a(((zzu) (obj)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (zzw)zzw.CREATOR.createFromParcel(parcel);
            }
            a(((zzw) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (zzas)zzas.CREATOR.createFromParcel(parcel);
            }
            a(((zzas) (obj)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (zzaa)zzaa.CREATOR.createFromParcel(parcel);
            }
            a(((zzaa) (obj)));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = DataHolder.CREATOR;
                obj = h.a(parcel);
            }
            a(((DataHolder) (obj)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (zzs)zzs.CREATOR.createFromParcel(parcel);
            }
            a(((zzs) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (zzaw)zzaw.CREATOR.createFromParcel(parcel);
            }
            a(((zzaw) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (zzac)zzac.CREATOR.createFromParcel(parcel);
            }
            a(((zzac) (obj)));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (zzae)zzae.CREATOR.createFromParcel(parcel);
            }
            a(((zzae) (obj)));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (zzy)zzy.CREATOR.createFromParcel(parcel);
            }
            a(((zzy) (obj)));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = Status.CREATOR;
                obj = w.a(parcel);
            }
            a(((Status) (obj)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            obj = obj11;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (zzaz)zzaz.CREATOR.createFromParcel(parcel);
        }
        a(((zzaz) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
