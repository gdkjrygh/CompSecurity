// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.analytics.internal.Command;

public abstract class jtg extends Binder
    implements jtf
{

    public static jtf a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
        if (iinterface != null && (iinterface instanceof jtf))
        {
            return (jtf)iinterface;
        } else
        {
            return new jth(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            a();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }
}
