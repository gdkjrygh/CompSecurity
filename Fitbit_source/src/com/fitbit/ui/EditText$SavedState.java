// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.fitbit.ui:
//            EditText

private static class init> extends android.view.
{

    public static final android.os.te.b CREATOR = new _cls1();
    String a;
    int b;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
        parcel.writeInt(b);
    }


    _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
        b = parcel.readInt();
    }

    public b(Parcelable parcelable)
    {
        super(parcelable);
    }

    /* block-local class not found */
    class _cls1 {}

}
