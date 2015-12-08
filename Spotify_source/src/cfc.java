// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.List;

final class cfc
    implements cfa
{

    private IBinder a;

    cfc(IBinder ibinder)
    {
        a = ibinder;
    }

    public final byb a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byb byb1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        byb1 = byc.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return byb1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(byb byb1, AdRequestParcel adrequestparcel, String s, bju bju1, String s1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        byb1 = obj;
        if (bju1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        byb1 = bju1.asBinder();
        parcel.writeStrongBinder(byb1);
        parcel.writeString(s1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
          goto _L5
    }

    public final void a(byb byb1, AdRequestParcel adrequestparcel, String s, cfd cfd1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        byb1 = obj;
        if (cfd1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        byb1 = cfd1.asBinder();
        parcel.writeStrongBinder(byb1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
          goto _L5
    }

    public final void a(byb byb1, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        byb1 = obj;
        if (cfd1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        byb1 = cfd1.asBinder();
        parcel.writeStrongBinder(byb1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
          goto _L5
    }

    public final void a(byb byb1, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        byb1 = obj;
        if (cfd1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        byb1 = cfd1.asBinder();
        parcel.writeStrongBinder(byb1);
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
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(byb byb1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, cfd cfd1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
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
        byb1 = obj;
        if (cfd1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        byb1 = cfd1.asBinder();
        parcel.writeStrongBinder(byb1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(byb byb1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
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
        byb1 = obj;
        if (cfd1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        byb1 = cfd1.asBinder();
        parcel.writeStrongBinder(byb1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
        parcel.writeInt(0);
          goto _L7
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

    public final cfj h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        cfj cfj;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        cfj = cfk.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return cfj;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final cfm i()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        cfm cfm;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        cfm = cfn.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return cfm;
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
