// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;

public abstract class ge extends Binder
    implements gd
{

    public ge()
    {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    public static gd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (iinterface != null && (iinterface instanceof gd))
        {
            return (gd)iinterface;
        } else
        {
            return new gf(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            s = parcel.readString();
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(s, parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            a();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            parcel1 = s;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ib)ib.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (fw)fw.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            a(parcel.createTypedArrayList(hm.CREATOR));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            parcel1 = obj4;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (hz)hz.CREATOR.createFromParcel(parcel);
        }
        a(parcel1);
        return true;
    }
}
