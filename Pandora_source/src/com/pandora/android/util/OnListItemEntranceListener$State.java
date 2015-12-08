// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

// Referenced classes of package com.pandora.android.util:
//            OnListItemEntranceListener

private static class _cls1
    implements Parcelable
{

    public static final android.os.istener.State.c CREATOR = new android.os.Parcelable.Creator() {

        public OnListItemEntranceListener.State a(Parcel parcel)
        {
            return null;
        }

        public OnListItemEntranceListener.State[] a(int i)
        {
            return new OnListItemEntranceListener.State[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final int a;
    private final int b;
    private final SparseArray c;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeSparseArray(c);
    }

}
