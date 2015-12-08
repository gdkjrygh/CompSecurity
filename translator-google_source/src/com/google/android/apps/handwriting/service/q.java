// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            o, l

final class q
    implements o
{

    private IBinder a;

    q(IBinder ibinder)
    {
        a = ibinder;
    }

    public final int a(String s, StrokeList strokelist, l l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
        parcel.writeString(s);
        if (strokelist == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        strokelist.writeToParcel(parcel, 0);
_L3:
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = l1.asBinder();
_L4:
        int i;
        parcel.writeStrongBinder(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public final int a(String s, StrokeList strokelist, String s1, String s2, l l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
        parcel.writeString(s);
        if (strokelist == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        strokelist.writeToParcel(parcel, 0);
_L3:
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s = l1.asBinder();
_L4:
        int i;
        parcel.writeStrongBinder(s);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public final void a(Intent intent, l l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
        if (intent == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        intent.writeToParcel(parcel, 0);
_L3:
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        intent = l1.asBinder();
_L4:
        parcel.writeStrongBinder(intent);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        intent;
        parcel1.recycle();
        parcel.recycle();
        throw intent;
        intent = null;
          goto _L4
    }

    public final void a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.apps.handwriting.service.IHandwritingRecognitionService");
        parcel.writeString(s);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
