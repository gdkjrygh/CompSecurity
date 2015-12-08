// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private static class openSubMenuId
    implements Parcelable
{

    public static final android.os.ter.SavedState._cls1 CREATOR = new _cls1();
    public int openSubMenuId;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(openSubMenuId);
    }


    _cls1()
    {
    }

    _cls1(Parcel parcel)
    {
        openSubMenuId = parcel.readInt();
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ActionMenuPresenter.SavedState createFromParcel(Parcel parcel)
        {
            return new ActionMenuPresenter.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ActionMenuPresenter.SavedState[] newArray(int i)
        {
            return new ActionMenuPresenter.SavedState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
