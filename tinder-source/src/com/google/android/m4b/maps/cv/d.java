// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.e.c;

// Referenced classes of package com.google.android.m4b.maps.cv:
//            c

public interface d
    extends IInterface
{
    public static abstract class a extends Binder
        implements d
    {

        public static d a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (iinterface != null && (iinterface instanceof d))
            {
                return (d)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                parcel1 = parcel.readStrongBinder();
                break;
            }
            if (parcel1 == null)
            {
                parcel1 = null;
            } else
            {
                IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (iinterface != null && (iinterface instanceof com.google.android.m4b.maps.cv.c))
                {
                    parcel1 = (com.google.android.m4b.maps.cv.c)iinterface;
                } else
                {
                    parcel1 = new c.a.a(parcel1);
                }
            }
            if (parcel.readInt() != 0)
            {
                obj = c.CREATOR;
                obj = com.google.android.m4b.maps.e.d.a(parcel);
            }
            a(parcel1, ((c) (obj)));
            return true;
        }
    }

    static final class a.a
        implements d
    {

        private IBinder a;

        public final void a(com.google.android.m4b.maps.cv.c c1, c c2)
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = c1.asBinder();
            parcel.writeStrongBinder(ibinder);
            if (c2 == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            parcel.writeInt(1);
            c2.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            c1;
            parcel.recycle();
            throw c1;
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


    public abstract void a(com.google.android.m4b.maps.cv.c c, c c1);
}
