// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;

final class gf
    implements gd
{

    private IBinder a;

    gf(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a()
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void a(Bundle bundle)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel.recycle();
        throw bundle;
    }

    public final void a(fw fw1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        if (fw1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        fw1.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        fw1;
        parcel.recycle();
        throw fw1;
    }

    public final void a(hz hz1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        if (hz1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        hz1.writeToParcel(parcel, 0);
_L1:
        a.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        hz1;
        parcel.recycle();
        throw hz1;
    }

    public final void a(ib ib1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        if (ib1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        ib1.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ib1;
        parcel.recycle();
        throw ib1;
    }

    public final void a(CharSequence charsequence)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        TextUtils.writeToParcel(charsequence, parcel, 0);
_L1:
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        charsequence;
        parcel.recycle();
        throw charsequence;
    }

    public final void a(String s, Bundle bundle)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        parcel.writeString(s);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(List list)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
        parcel.writeTypedList(list);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        list;
        parcel.recycle();
        throw list;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
