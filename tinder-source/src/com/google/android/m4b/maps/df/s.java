// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.i;
import com.google.android.m4b.maps.model.internal.d;

// Referenced classes of package com.google.android.m4b.maps.df:
//            k, q, y, x, 
//            j

public interface s
    extends IInterface
{
    public static abstract class a extends Binder
        implements s
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
        {
            x x1 = null;
            b b2 = null;
            Object obj = null;
            switch (l)
            {
            default:
                return super.onTransact(l, parcel, parcel1, i1);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.ICreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                x1 = b(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj;
                if (x1 != null)
                {
                    parcel = x1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                b2 = com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                Object obj1 = x1;
                if (parcel.readInt() != 0)
                {
                    obj1 = GoogleMapOptions.CREATOR;
                    obj1 = com.google.android.m4b.maps.d.a(parcel);
                }
                parcel = a(b2, ((GoogleMapOptions) (obj1)));
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel.asBinder());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel.asBinder());
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel.asBinder());
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                b b1 = com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder());
                Object obj2 = b2;
                if (parcel.readInt() != 0)
                {
                    obj2 = StreetViewPanoramaOptions.CREATOR;
                    obj2 = i.a(parcel);
                }
                parcel = a(b1, ((StreetViewPanoramaOptions) (obj2)));
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel.asBinder());
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                parcel = c(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel.asBinder());
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.ICreator");
        }
    }


    public abstract k a(b b1, StreetViewPanoramaOptions streetviewpanoramaoptions);

    public abstract q a();

    public abstract y a(b b1, GoogleMapOptions googlemapoptions);

    public abstract void a(b b1);

    public abstract void a(b b1, int i);

    public abstract x b(b b1);

    public abstract d b();

    public abstract j c(b b1);
}
