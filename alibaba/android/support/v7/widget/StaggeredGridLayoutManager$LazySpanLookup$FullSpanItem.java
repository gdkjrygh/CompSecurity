// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager

static class mGapPerSpan
    implements Parcelable
{

    public static final android.os.p.FullSpanItem.mGapPerSpan CREATOR = new android.os.Parcelable.Creator() {

        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    int mGapDir;
    int mGapPerSpan[];
    int mPosition;

    public int describeContents()
    {
        return 0;
    }

    int getGapForSpan(int i)
    {
        if (mGapPerSpan == null)
        {
            return 0;
        } else
        {
            return mGapPerSpan[i];
        }
    }

    public void invalidateSpanGaps()
    {
        mGapPerSpan = null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mPosition);
        parcel.writeInt(mGapDir);
        if (mGapPerSpan != null && mGapPerSpan.length > 0)
        {
            parcel.writeInt(mGapPerSpan.length);
            parcel.writeIntArray(mGapPerSpan);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }


    public _cls1()
    {
    }

    public _cls1(Parcel parcel)
    {
        mPosition = parcel.readInt();
        mGapDir = parcel.readInt();
        int i = parcel.readInt();
        if (i > 0)
        {
            mGapPerSpan = new int[i];
            parcel.readIntArray(mGapPerSpan);
        }
    }
}
