// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.List;

final class kux
    implements kuv
{

    private IBinder a;

    kux(IBinder ibinder)
    {
        a = ibinder;
    }

    public final kok a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        kok kok1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        kok1 = kol.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return kok1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
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

    public final void a(kok kok1, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        kok1 = obj;
        if (kuy1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        kok1 = kuy1.asBinder();
        parcel.writeStrongBinder(kok1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final void a(kok kok1, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        kok1 = obj;
        if (kuy1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        kok1 = kuy1.asBinder();
        parcel.writeStrongBinder(kok1);
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
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(kok kok1, AdRequestParcel adrequestparcel, String s, jpt jpt1, String s1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        kok1 = obj;
        if (jpt1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        kok1 = jpt1.asBinder();
        parcel.writeStrongBinder(kok1);
        parcel.writeString(s1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final void a(kok kok1, AdRequestParcel adrequestparcel, String s, kuy kuy1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        kok1 = obj;
        if (kuy1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        kok1 = kuy1.asBinder();
        parcel.writeStrongBinder(kok1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final void a(kok kok1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
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
        kok1 = obj;
        if (kuy1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        kok1 = kuy1.asBinder();
        parcel.writeStrongBinder(kok1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(kok kok1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, kuy kuy1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
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
        kok1 = obj;
        if (kuy1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        kok1 = kuy1.asBinder();
        parcel.writeStrongBinder(kok1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
        parcel.writeInt(0);
          goto _L7
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
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

    public final void c()
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

    public final void d()
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

    public final void e()
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

    public final void f()
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

    public final boolean g()
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

    public final kvb h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        kvb kvb;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        kvb = kvc.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return kvb;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final kve i()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        kve kve;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        kve = kvf.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return kve;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
