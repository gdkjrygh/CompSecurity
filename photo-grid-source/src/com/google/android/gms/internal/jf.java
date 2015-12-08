// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.b;

// Referenced classes of package com.google.android.gms.internal:
//            je, jg, dw

public abstract class jf extends Binder
    implements je
{

    public jf()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public static je a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        if (iinterface != null && (iinterface instanceof je))
        {
            return (je)iinterface;
        } else
        {
            return new jg(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeList(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = c();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = d();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = e();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = f();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            g();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            a(b.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            b(b.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            boolean flag2 = h();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            boolean flag3 = i();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            parcel = j();
            parcel1.writeNoException();
            break;
        }
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
    }
}
