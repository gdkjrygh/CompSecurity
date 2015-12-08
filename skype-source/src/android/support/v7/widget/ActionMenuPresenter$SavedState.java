// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private static class a
    implements Parcelable
{

    public static final android.os.ter.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ActionMenuPresenter.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ActionMenuPresenter.SavedState[i];
        }

    };
    public int a;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
    }


    _cls1()
    {
    }

    _cls1(Parcel parcel)
    {
        a = parcel.readInt();
    }
}
