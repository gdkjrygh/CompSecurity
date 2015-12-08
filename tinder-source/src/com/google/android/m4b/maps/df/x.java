// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.d;
import com.google.android.m4b.maps.da.b;

// Referenced classes of package com.google.android.m4b.maps.df:
//            t, ah

public interface x
    extends IInterface
{
    public static abstract class a extends Binder
        implements x
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj = null;
            Object obj1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                parcel = a();
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

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = GoogleMapOptions.CREATOR;
                    obj = com.google.android.m4b.maps.d.a(parcel);
                }
                if (parcel.readInt() != 0)
                {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((GoogleMapOptions) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
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

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                b b1 = com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                b1 = a(b1, parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                e();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                f();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
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

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                boolean flag = g();
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                a(ah.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
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

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                h();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IMapFragmentDelegate");
        }
    }


    public abstract b a(b b1, Bundle bundle);

    public abstract t a();

    public abstract void a(Bundle bundle);

    public abstract void a(GoogleMapOptions googlemapoptions);

    public abstract void a(ah ah);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract void h();
}
