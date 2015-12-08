// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package yuku.ambilwarna.widget:
//            AmbilWarnaPreference

private static class value extends android.preference.ate
{

    public static final android.os..SavedState.value CREATOR = new android.os.Parcelable.Creator() {

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AmbilWarnaPreference.SavedState createFromParcel(Parcel parcel)
        {
            return new AmbilWarnaPreference.SavedState(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public AmbilWarnaPreference.SavedState[] newArray(int i)
        {
            return new AmbilWarnaPreference.SavedState[i];
        }

    };
    int value;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.oParcel(parcel, i);
        parcel.writeInt(value);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        value = parcel.readInt();
    }

    public value(Parcelable parcelable)
    {
        super(parcelable);
    }
}
