// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzax, zzdt, zzba, zzbb, 
//            zzay

public interface zzds
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzds
    {

        public static zzds zzs(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof zzds))
            {
                return (zzds)iinterface;
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
            Object obj1 = null;
            zzba zzba1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd2 = com.google.android.gms.dynamic.zzd.zza.zzau(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    zzba1 = zzba.CREATOR.zzc(parcel);
                } else
                {
                    zzba1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = zzax.CREATOR.zzb(parcel);
                } else
                {
                    obj1 = null;
                }
                zza(zzd2, zzba1, ((zzax) (obj1)), parcel.readString(), zzdt.zza.zzt(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = getView();
                parcel1.writeNoException();
                parcel = zzba1;
                if (obj1 != null)
                {
                    parcel = ((zzd) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd3 = com.google.android.gms.dynamic.zzd.zza.zzau(parcel.readStrongBinder());
                Object obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = zzax.CREATOR.zzb(parcel);
                }
                zza(zzd3, ((zzax) (obj)), parcel.readString(), zzdt.zza.zzt(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                showInterstitial();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                destroy();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd4 = com.google.android.gms.dynamic.zzd.zza.zzau(parcel.readStrongBinder());
                zzba zzba2;
                zzax zzax2;
                if (parcel.readInt() != 0)
                {
                    zzba2 = zzba.CREATOR.zzc(parcel);
                } else
                {
                    zzba2 = null;
                }
                if (parcel.readInt() != 0)
                {
                    zzax2 = zzax.CREATOR.zzb(parcel);
                } else
                {
                    zzax2 = null;
                }
                zza(zzd4, zzba2, zzax2, parcel.readString(), parcel.readString(), zzdt.zza.zzt(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                zzd zzd1 = com.google.android.gms.dynamic.zzd.zza.zzau(parcel.readStrongBinder());
                zzax zzax1;
                if (parcel.readInt() != 0)
                {
                    zzax1 = zzax.CREATOR.zzb(parcel);
                } else
                {
                    zzax1 = null;
                }
                zza(zzd1, zzax1, parcel.readString(), parcel.readString(), zzdt.zza.zzt(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                pause();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                resume();
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    static class zza.zza
        implements zzds
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public void destroy()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzle.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd getView()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzle.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzau(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void pause()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzle.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void resume()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzle.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void showInterstitial()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzle.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zza(zzd zzd1, zzax zzax1, String s, zzdt zzdt1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzax1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            zzax1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzdt1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzdt1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zzle.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        public void zza(zzd zzd1, zzax zzax1, String s, String s1, zzdt zzdt1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzax1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            zzax1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            zzd1 = obj;
            if (zzdt1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzd1 = zzdt1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zzle.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        public void zza(zzd zzd1, zzba zzba1, zzax zzax1, String s, zzdt zzdt1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzba1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            zzba1.writeToParcel(parcel, 0);
_L6:
            if (zzax1 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            zzax1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzdt1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            zzd1 = zzdt1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
            parcel.writeInt(0);
              goto _L7
        }

        public void zza(zzd zzd1, zzba zzba1, zzax zzax1, String s, String s1, zzdt zzdt1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzba1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            zzba1.writeToParcel(parcel, 0);
_L6:
            if (zzax1 == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            parcel.writeInt(1);
            zzax1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            zzd1 = obj;
            if (zzdt1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            zzd1 = zzdt1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zzle.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
            parcel.writeInt(0);
              goto _L7
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract void destroy();

    public abstract zzd getView();

    public abstract void pause();

    public abstract void resume();

    public abstract void showInterstitial();

    public abstract void zza(zzd zzd, zzax zzax, String s, zzdt zzdt);

    public abstract void zza(zzd zzd, zzax zzax, String s, String s1, zzdt zzdt);

    public abstract void zza(zzd zzd, zzba zzba, zzax zzax, String s, zzdt zzdt);

    public abstract void zza(zzd zzd, zzba zzba, zzax zzax, String s, String s1, zzdt zzdt);
}
