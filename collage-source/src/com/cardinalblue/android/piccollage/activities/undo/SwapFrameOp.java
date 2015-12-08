// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.activities.undo.a.e;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;

public class SwapFrameOp extends com.cardinalblue.android.piccollage.UndoManager.UndoOperation
{
    public static class SwapUnit
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SwapUnit a(Parcel parcel)
            {
                return new SwapUnit(parcel);
            }

            public SwapUnit[] a(int i)
            {
                return new SwapUnit[i];
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
        public final long a;
        public final long b;
        public final int c;
        public final int d;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(a);
            parcel.writeLong(b);
            parcel.writeInt(c);
            parcel.writeInt(d);
        }


        public SwapUnit(long l, int i)
        {
            a = l;
            c = i;
            b = -1L;
            d = -1;
        }

        public SwapUnit(long l, long l1, int i, int j)
        {
            a = l;
            b = l1;
            c = i;
            d = j;
        }

        protected SwapUnit(Parcel parcel)
        {
            a = parcel.readLong();
            b = parcel.readLong();
            c = parcel.readInt();
            d = parcel.readInt();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public SwapFrameOp a(Parcel parcel)
        {
            return new SwapFrameOp(parcel);
        }

        public SwapFrameOp[] a(int i)
        {
            return new SwapFrameOp[i];
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
    private final SwapUnit a;
    private final SwapUnit b;

    protected SwapFrameOp(Parcel parcel)
    {
        a = (SwapUnit)parcel.readParcelable(com/cardinalblue/android/piccollage/activities/undo/SwapFrameOp$SwapUnit.getClassLoader());
        b = (SwapUnit)parcel.readParcelable(com/cardinalblue/android/piccollage/activities/undo/SwapFrameOp$SwapUnit.getClassLoader());
    }

    public SwapFrameOp(SwapUnit swapunit, SwapUnit swapunit1)
    {
        a = swapunit;
        b = swapunit1;
    }

    public void b()
    {
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new e(a));
    }

    public void d()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new e(b));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeParcelable(b, 0);
    }

}
