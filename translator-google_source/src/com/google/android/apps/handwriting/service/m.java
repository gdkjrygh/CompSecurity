// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.handwriting.base.RecognitionResult;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            l, n

public abstract class m extends Binder
    implements l
{

    public m()
    {
        attachInterface(this, "com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
    }

    public static l a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
        if (iinterface != null && (iinterface instanceof l))
        {
            return (l)iinterface;
        } else
        {
            return new n(ibinder);
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
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                obj = (Intent)Intent.CREATOR.createFromParcel(parcel);
            }
            a(i, ((Intent) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
            i = parcel.readInt();
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (RecognitionResult)RecognitionResult.CREATOR.createFromParcel(parcel);
            }
            a(i, ((RecognitionResult) (obj)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.handwriting.service.IHandwritingRecognitionListener");
            i = parcel.readInt();
            j = parcel.readInt();
            obj = obj2;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        a(i, j, ((Intent) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
