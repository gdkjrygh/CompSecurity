// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.i;

// Referenced classes of package com.google.android.m4b.maps.df:
//            i, f

public interface j
    extends IInterface
{
    public static abstract class a extends Binder
        implements j
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
        {
            Object obj = null;
            Object obj1 = null;
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = StreetViewPanoramaOptions.CREATOR;
                    obj = i.a(parcel);
                }
                if (parcel.readInt() != 0)
                {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((StreetViewPanoramaOptions) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                e();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                boolean flag = f();
                parcel1.writeNoException();
                if (flag)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                parcel1.writeInt(k);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a(com.google.android.m4b.maps.df.f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
        }
    }


    public abstract b a(b b1, Bundle bundle);

    public abstract com.google.android.m4b.maps.df.i a();

    public abstract void a(Bundle bundle);

    public abstract void a(StreetViewPanoramaOptions streetviewpanoramaoptions);

    public abstract void a(f f1);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();
}
