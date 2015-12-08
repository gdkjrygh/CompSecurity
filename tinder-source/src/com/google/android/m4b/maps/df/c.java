// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.q;

public interface c
    extends IInterface
{
    public static abstract class a extends Binder
        implements c
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                q q1 = StreetViewPanoramaLocation.CREATOR;
                parcel = q.a(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    static final class a.a
        implements c
    {

        private IBinder a;

        public final void a(StreetViewPanoramaLocation streetviewpanoramalocation)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
            if (streetviewpanoramalocation == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            streetviewpanoramalocation.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramalocation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramalocation;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(StreetViewPanoramaLocation streetviewpanoramalocation);
}
