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
//            t, ah

public interface y
    extends IInterface
{
    public static abstract class a extends Binder
        implements y
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj1 = null;
            Object obj2 = null;
            t t1 = null;
            Object obj3 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IMapViewDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                t1 = a();
                parcel1.writeNoException();
                parcel = obj;
                if (t1 != null)
                {
                    parcel = t1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                Bundle bundle = obj1;
                if (parcel.readInt() != 0)
                {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                e();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                b b1 = f();
                parcel1.writeNoException();
                parcel = t1;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                a(ah.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                Bundle bundle2 = obj3;
                if (parcel.readInt() != 0)
                {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                c(bundle2);
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                g();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IMapViewDelegate");
        }
    }


    public abstract t a();

    public abstract void a(Bundle bundle);

    public abstract void a(ah ah);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract void d();

    public abstract void e();

    public abstract b f();

    public abstract void g();
}
