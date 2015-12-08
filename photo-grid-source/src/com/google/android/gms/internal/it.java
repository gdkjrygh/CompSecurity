// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzi;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.b.a;
import com.google.android.gms.b.b;

// Referenced classes of package com.google.android.gms.internal:
//            is, iu, iw, jb, 
//            je

public abstract class it extends Binder
    implements is
{

    public it()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static is a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof is))
        {
            return (is)iinterface;
        } else
        {
            return new iu(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        a a3 = null;
        String s = null;
        AdSizeParcel adsizeparcel = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a3 = b.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel);
            } else
            {
                adsizeparcel = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = AdRequestParcel.CREATOR.zzb(parcel);
            } else
            {
                obj1 = null;
            }
            a(a3, adsizeparcel, ((AdRequestParcel) (obj1)), parcel.readString(), com.google.android.gms.internal.iw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = a();
            parcel1.writeNoException();
            parcel = adsizeparcel;
            if (obj1 != null)
            {
                parcel = ((a) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a3 = b.a(parcel.readStrongBinder());
            Object obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = AdRequestParcel.CREATOR.zzb(parcel);
            }
            a(a3, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.internal.iw.a(parcel.readStrongBinder()));
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
            a3 = b.a(parcel.readStrongBinder());
            AdSizeParcel adsizeparcel1;
            AdRequestParcel adrequestparcel4;
            if (parcel.readInt() != 0)
            {
                adsizeparcel1 = AdSizeParcel.CREATOR.zzc(parcel);
            } else
            {
                adsizeparcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                adrequestparcel4 = AdRequestParcel.CREATOR.zzb(parcel);
            } else
            {
                adrequestparcel4 = null;
            }
            a(a3, adsizeparcel1, adrequestparcel4, parcel.readString(), parcel.readString(), com.google.android.gms.internal.iw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a a1 = b.a(parcel.readStrongBinder());
            AdRequestParcel adrequestparcel;
            if (parcel.readInt() != 0)
            {
                adrequestparcel = AdRequestParcel.CREATOR.zzb(parcel);
            } else
            {
                adrequestparcel = null;
            }
            a(a1, adrequestparcel, parcel.readString(), parcel.readString(), com.google.android.gms.internal.iw.a(parcel.readStrongBinder()));
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
            a a2 = b.a(parcel.readStrongBinder());
            AdRequestParcel adrequestparcel1;
            if (parcel.readInt() != 0)
            {
                adrequestparcel1 = AdRequestParcel.CREATOR.zzb(parcel);
            } else
            {
                adrequestparcel1 = null;
            }
            a(a2, adrequestparcel1, parcel.readString(), com.google.android.gms.ads.internal.reward.mediation.client.zza.zza.zzae(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            AdRequestParcel adrequestparcel2 = obj2;
            if (parcel.readInt() != 0)
            {
                adrequestparcel2 = AdRequestParcel.CREATOR.zzb(parcel);
            }
            a(adrequestparcel2, parcel.readString());
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
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a3 = b.a(parcel.readStrongBinder());
            AdRequestParcel adrequestparcel3;
            NativeAdOptionsParcel nativeadoptionsparcel;
            String s1;
            iv iv;
            if (parcel.readInt() != 0)
            {
                adrequestparcel3 = AdRequestParcel.CREATOR.zzb(parcel);
            } else
            {
                adrequestparcel3 = null;
            }
            s = parcel.readString();
            s1 = parcel.readString();
            iv = com.google.android.gms.internal.iw.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                nativeadoptionsparcel = NativeAdOptionsParcel.CREATOR.zze(parcel);
            } else
            {
                nativeadoptionsparcel = null;
            }
            a(a3, adrequestparcel3, s, s1, iv, nativeadoptionsparcel, parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            jb jb1 = h();
            parcel1.writeNoException();
            parcel = a3;
            if (jb1 != null)
            {
                parcel = jb1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            je je1 = i();
            parcel1.writeNoException();
            parcel = s;
            if (je1 != null)
            {
                parcel = je1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = j();
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

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = k();
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

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = l();
            parcel1.writeNoException();
            break;
        }
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
    }
}
