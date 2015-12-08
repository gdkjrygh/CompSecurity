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
//            zzba, zzbg, zzbh, zzbk, 
//            zzbl, zzcj, zzfo, zzfs, 
//            zzax, zzay, zzbb

public interface zzbi
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzbi
    {

        public static zzbi zzg(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iinterface != null && (iinterface instanceof zzbi))
            {
                return (zzbi)iinterface;
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
            zzd zzd1 = null;
            Object obj2 = null;
            Object obj = null;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zzd1 = zzac();
                parcel1.writeNoException();
                parcel = obj;
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                destroy();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                boolean flag1 = isReady();
                parcel1.writeNoException();
                if (flag1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                Object obj1 = zzd1;
                if (parcel.readInt() != 0)
                {
                    obj1 = zzax.CREATOR.zzb(parcel);
                }
                boolean flag2 = zza(((zzax) (obj1)));
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag2)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                pause();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                resume();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzbh.zza.zzf(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzbk.zza.zzi(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                showInterstitial();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                stopLoading();
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zzan();
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = zzad();
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

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zzba zzba1 = obj2;
                if (parcel.readInt() != 0)
                {
                    zzba1 = zzba.CREATOR.zzc(parcel);
                }
                zza(zzba1);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzfo.zza.zzz(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzfs.zza.zzD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = getMediationAdapterClassName();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzcj.zza.zzn(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzbg.zza.zze(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                zza(zzbl.zza.zzj(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }
    }

    static class zza.zza
        implements zzbi
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(2, parcel, parcel1, 0);
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

        public String getMediationAdapterClassName()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isReady()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public void resume()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(6, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public void stopLoading()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(10, parcel, parcel1, 0);
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

        public void zza(zzba zzba1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzba1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            zzba1.writeToParcel(parcel, 0);
_L1:
            zzle.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            zzba1;
            parcel1.recycle();
            parcel.recycle();
            throw zzba1;
        }

        public void zza(zzbg zzbg1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzbg1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzbg1 = zzbg1.asBinder();
_L1:
            parcel.writeStrongBinder(zzbg1);
            zzle.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzbg1 = null;
              goto _L1
            zzbg1;
            parcel1.recycle();
            parcel.recycle();
            throw zzbg1;
        }

        public void zza(zzbh zzbh1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzbh1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzbh1 = zzbh1.asBinder();
_L1:
            parcel.writeStrongBinder(zzbh1);
            zzle.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzbh1 = null;
              goto _L1
            zzbh1;
            parcel1.recycle();
            parcel.recycle();
            throw zzbh1;
        }

        public void zza(zzbk zzbk1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzbk1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzbk1 = zzbk1.asBinder();
_L1:
            parcel.writeStrongBinder(zzbk1);
            zzle.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzbk1 = null;
              goto _L1
            zzbk1;
            parcel1.recycle();
            parcel.recycle();
            throw zzbk1;
        }

        public void zza(zzbl zzbl1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzbl1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzbl1 = zzbl1.asBinder();
_L1:
            parcel.writeStrongBinder(zzbl1);
            zzle.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzbl1 = null;
              goto _L1
            zzbl1;
            parcel1.recycle();
            parcel.recycle();
            throw zzbl1;
        }

        public void zza(zzcj zzcj1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzcj1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzcj1 = zzcj1.asBinder();
_L1:
            parcel.writeStrongBinder(zzcj1);
            zzle.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzcj1 = null;
              goto _L1
            zzcj1;
            parcel1.recycle();
            parcel.recycle();
            throw zzcj1;
        }

        public void zza(zzfo zzfo1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzfo1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzfo1 = zzfo1.asBinder();
_L1:
            parcel.writeStrongBinder(zzfo1);
            zzle.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzfo1 = null;
              goto _L1
            zzfo1;
            parcel1.recycle();
            parcel.recycle();
            throw zzfo1;
        }

        public void zza(zzfs zzfs1, String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzfs1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            zzfs1 = zzfs1.asBinder();
_L1:
            parcel.writeStrongBinder(zzfs1);
            parcel.writeString(s);
            zzle.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzfs1 = null;
              goto _L1
            zzfs1;
            parcel1.recycle();
            parcel.recycle();
            throw zzfs1;
        }

        public boolean zza(zzax zzax1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (zzax1 == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            zzax1.writeToParcel(parcel, 0);
_L1:
            int i;
            zzle.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            parcel.writeInt(0);
              goto _L1
            zzax1;
            parcel1.recycle();
            parcel.recycle();
            throw zzax1;
        }

        public zzd zzac()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzau(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzba zzad()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            zzba zzba1 = zzba.CREATOR.zzc(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return zzba1;
_L2:
            zzba1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zzan()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            zzle.transact(11, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract void destroy();

    public abstract String getMediationAdapterClassName();

    public abstract boolean isReady();

    public abstract void pause();

    public abstract void resume();

    public abstract void showInterstitial();

    public abstract void stopLoading();

    public abstract void zza(zzba zzba);

    public abstract void zza(zzbg zzbg);

    public abstract void zza(zzbh zzbh);

    public abstract void zza(zzbk zzbk);

    public abstract void zza(zzbl zzbl);

    public abstract void zza(zzcj zzcj);

    public abstract void zza(zzfo zzfo);

    public abstract void zza(zzfs zzfs, String s);

    public abstract boolean zza(zzax zzax);

    public abstract zzd zzac();

    public abstract zzba zzad();

    public abstract void zzan();
}
