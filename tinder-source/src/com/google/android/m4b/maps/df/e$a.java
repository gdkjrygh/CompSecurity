// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.model.r;

// Referenced classes of package com.google.android.m4b.maps.df:
//            e

public static abstract class a.a extends Binder
    implements e
{
    static final class a
        implements e
    {

        private IBinder a;

        public final void a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaLongClickListener");
            if (streetviewpanoramaorientation == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            streetviewpanoramaorientation.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramaorientation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramaorientation;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaLongClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaLongClickListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            r r1 = StreetViewPanoramaOrientation.CREATOR;
            parcel = r.a(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
