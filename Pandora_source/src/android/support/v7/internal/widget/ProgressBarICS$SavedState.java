// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.widget:
//            ProgressBarICS

static class <init> extends android.view.ressBarICS.SavedState
{

    public static final android.os.ogressBarICS.SavedState.b CREATOR = new android.os.Parcelable.Creator() {

        public ProgressBarICS.SavedState a(Parcel parcel)
        {
            return new ProgressBarICS.SavedState(parcel, null);
        }

        public ProgressBarICS.SavedState[] a(int i)
        {
            return new ProgressBarICS.SavedState[i];
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
    int a;
    int b;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.oParcel(parcel, i);
        parcel.writeInt(a);
        parcel.writeInt(b);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
        b = parcel.readInt();
    }

    b(Parcel parcel, b b1)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
