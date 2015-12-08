// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            FragmentTabHost

static class <init> extends android.view.avedState
{

    public static final android.os..SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FragmentTabHost.SavedState(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new FragmentTabHost.SavedState[i];
        }

    };
    String a;

    public String toString()
    {
        return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeString(a);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    a(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
