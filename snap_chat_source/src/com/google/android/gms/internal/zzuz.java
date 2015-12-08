// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.ConnectionResultCreator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

// Referenced classes of package com.google.android.gms.internal:
//            zzut

public interface zzuz
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzuz
    {

        public static zzuz zzcE(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (iinterface != null && (iinterface instanceof zzuz))
            {
                return (zzuz)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = ConnectionResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (zzut)zzut.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                zza(((ConnectionResult) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = Status.CREATOR.createFromParcel(parcel);
            }
            zzaM(((Status) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }
    }

    static class zza.zza
        implements zzuz
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public void zza(ConnectionResult connectionresult, zzut zzut1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (connectionresult == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            connectionresult.writeToParcel(parcel, 0);
_L3:
            if (zzut1 == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            zzut1.writeToParcel(parcel, 0);
_L4:
            zzle.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            connectionresult;
            parcel1.recycle();
            parcel.recycle();
            throw connectionresult;
            parcel.writeInt(0);
              goto _L4
        }

        public void zzaM(Status status)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zzle.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract void zza(ConnectionResult connectionresult, zzut zzut);

    public abstract void zzaM(Status status);
}
