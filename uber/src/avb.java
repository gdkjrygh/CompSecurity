// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class avb extends Binder
    implements ava
{

    public static ava a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (iinterface != null && (iinterface instanceof ava))
        {
            return (ava)iinterface;
        } else
        {
            return new avc(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag17 = false;
        boolean flag7 = false;
        boolean flag18 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            a(flag9);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag10;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            b(flag9);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag11;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            c(flag9);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag12;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            d(flag9);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag13;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            e(flag9);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag14;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            f(flag9);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag15;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            g(flag9);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag16;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            h(flag9);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = a();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = b();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = c();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = d();
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = e();
            parcel1.writeNoException();
            i = ((flag4) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = f();
            parcel1.writeNoException();
            i = ((flag5) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = g();
            parcel1.writeNoException();
            i = ((flag6) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag17;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            i(flag9);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = h();
            parcel1.writeNoException();
            i = ((flag7) ? 1 : 0);
            if (flag9)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = flag18;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            j(flag9);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag9 = i();
            parcel1.writeNoException();
            i = ((flag8) ? 1 : 0);
            break;
        }
        if (flag9)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }
}
