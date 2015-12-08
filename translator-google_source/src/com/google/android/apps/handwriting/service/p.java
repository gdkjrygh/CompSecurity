// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            o, q, m

public abstract class p extends Binder
    implements o
{

    public p()
    {
        attachInterface(this, "com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
    }

    public static o a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
        if (iinterface != null && (iinterface instanceof o))
        {
            return (o)iinterface;
        } else
        {
            return new q(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        Object obj1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (Intent)Intent.CREATOR.createFromParcel(parcel);
            }
            a(((Intent) (obj)), m.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (StrokeList)StrokeList.CREATOR.createFromParcel(parcel);
            }
            i = a(s, ((StrokeList) (obj)), m.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
            String s1 = parcel.readString();
            StrokeList strokelist;
            if (parcel.readInt() != 0)
            {
                strokelist = (StrokeList)StrokeList.CREATOR.createFromParcel(parcel);
            } else
            {
                strokelist = null;
            }
            i = a(s1, strokelist, parcel.readString(), parcel.readString(), m.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
