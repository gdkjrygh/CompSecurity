// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;

// Referenced classes of package com.google.android.m4b.maps.df:
//            i, f

public interface k
    extends IInterface
{
    public static abstract class a extends Binder
        implements k
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int l)
        {
            Object obj1 = null;
            Object obj2 = null;
            i i1 = null;
            Object obj = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                i1 = a();
                parcel1.writeNoException();
                parcel = obj;
                if (i1 != null)
                {
                    parcel = i1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                Bundle bundle = obj1;
                if (parcel.readInt() != 0)
                {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                Bundle bundle1 = obj2;
                if (parcel.readInt() != 0)
                {
                    bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                b(bundle1);
                parcel1.writeNoException();
                if (bundle1 != null)
                {
                    parcel1.writeInt(1);
                    bundle1.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                b b1 = e();
                parcel1.writeNoException();
                parcel = i1;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                a(f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
        }
    }


    public abstract i a();

    public abstract void a(Bundle bundle);

    public abstract void a(f f);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();

    public abstract b e();
}
