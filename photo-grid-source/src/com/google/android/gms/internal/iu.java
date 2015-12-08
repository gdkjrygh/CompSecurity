// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.b.a;
import com.google.android.gms.b.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            is, iv, jc, jf, 
//            jb, je

final class iu
    implements is
{

    private IBinder a;

    iu(IBinder ibinder)
    {
        a = ibinder;
    }

    public final a a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        a a1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.b.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
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

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, zza zza1, String s1)
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

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, iv iv1)
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
        if (iv1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        a1 = iv1.asBinder();
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

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv1)
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
        if (iv1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        a1 = iv1.asBinder();
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

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
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
        if (iv1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        a1 = iv1.asBinder();
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

    public final void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, iv iv1)
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
        if (iv1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a1 = iv1.asBinder();
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

    public final void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, iv iv1)
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
        if (iv1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        a1 = iv1.asBinder();
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
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
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

    public final jb h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        jb jb;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        jb = com.google.android.gms.internal.jc.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return jb;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final je i()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        je je;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        je = com.google.android.gms.internal.jf.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return je;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Bundle j()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Bundle k()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final Bundle l()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
