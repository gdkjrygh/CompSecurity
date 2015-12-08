// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dk, dl, dm

public interface dj
    extends IInterface
{
    public static abstract class a extends Binder
        implements dj
    {

        public static dj a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof dj))
            {
                return (dj)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            com.google.android.gms.a.a a3 = null;
            String s = null;
            Object obj = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a3 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj1 = null;
                }
                a(a3, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj1)), parcel.readString(), com.google.android.gms.internal.dk.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = a();
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((com.google.android.gms.a.a) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a3 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                }
                a(a3, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.internal.dk.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                b();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a3 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                AdRequestParcel adrequestparcel;
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    adrequestparcel = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    adrequestparcel = null;
                }
                a(a3, ((AdSizeParcel) (obj)), adrequestparcel, parcel.readString(), parcel.readString(), com.google.android.gms.internal.dk.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.a.a a1 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                a(a1, ((AdRequestParcel) (obj)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.dk.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                e();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.a.a a2 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                a(a2, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.ads.internal.reward.mediation.client.zza.zza.zzad(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                }
                a(((AdRequestParcel) (obj)), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                f();
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                boolean flag = g();
                parcel1.writeNoException();
                if (flag)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                parcel1.writeInt(j);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a3 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                NativeAdOptionsParcel nativeadoptionsparcel;
                String s1;
                dk dk;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR.zzb(parcel);
                } else
                {
                    obj = null;
                }
                s = parcel.readString();
                s1 = parcel.readString();
                dk = com.google.android.gms.internal.dk.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    nativeadoptionsparcel = NativeAdOptionsParcel.CREATOR.zzf(parcel);
                } else
                {
                    nativeadoptionsparcel = null;
                }
                a(a3, ((AdRequestParcel) (obj)), s, s1, dk, nativeadoptionsparcel, parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = h();
                parcel1.writeNoException();
                parcel = a3;
                if (obj != null)
                {
                    parcel = ((dl) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = i();
                parcel1.writeNoException();
                parcel = s;
                break;
            }
            if (obj != null)
            {
                parcel = ((dm) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    private static class a.a
        implements dj
    {

        private IBinder a;

        public com.google.android.gms.a.a a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.a.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.a.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, zza zza1, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (zza1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = zza1.asBinder();
            parcel.writeStrongBinder(a1);
            parcel.writeString(s1);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, dk dk1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (dk1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = dk1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            a1 = obj;
            if (dk1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            a1 = dk1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            a1 = obj;
            if (dk1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            a1 = dk1.asBinder();
            parcel.writeStrongBinder(a1);
            if (nativeadoptionsparcel == null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            parcel.writeInt(1);
            nativeadoptionsparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeStringList(list);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(com.google.android.gms.a.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dk dk1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            a1 = obj;
            if (dk1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            a1 = dk1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(com.google.android.gms.a.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dk dk1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            a1 = obj;
            if (dk1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            a1 = dk1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(AdRequestParcel adrequestparcel, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestparcel;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public void b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(4, parcel, parcel1, 0);
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

        public void c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(5, parcel, parcel1, 0);
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

        public void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(8, parcel, parcel1, 0);
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

        public void e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(9, parcel, parcel1, 0);
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

        public void f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(12, parcel, parcel1, 0);
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

        public boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public dl h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            dl dl;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            dl = com.google.android.gms.internal.dl.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return dl;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public dm i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            dm dm;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            dm = com.google.android.gms.internal.dm.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return dm;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract com.google.android.gms.a.a a()
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, zza zza, String s1)
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, dk dk)
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk)
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk, NativeAdOptionsParcel nativeadoptionsparcel, List list)
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dk dk)
        throws RemoteException;

    public abstract void a(com.google.android.gms.a.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dk dk)
        throws RemoteException;

    public abstract void a(AdRequestParcel adrequestparcel, String s)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;

    public abstract void c()
        throws RemoteException;

    public abstract void d()
        throws RemoteException;

    public abstract void e()
        throws RemoteException;

    public abstract void f()
        throws RemoteException;

    public abstract boolean g()
        throws RemoteException;

    public abstract dl h()
        throws RemoteException;

    public abstract dm i()
        throws RemoteException;
}
