// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager

static final class FullSpanItem.mGapPerSpan
{
    static class FullSpanItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new FullSpanItem(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new FullSpanItem[i];
            }

        };
        int mGapDir;
        int mGapPerSpan[];
        boolean mHasUnwantedGapAfter;
        int mPosition;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder("FullSpanItem{mPosition=")).append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mPosition);
            parcel.writeInt(mGapDir);
            if (mHasUnwantedGapAfter)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
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


        public FullSpanItem()
        {
        }

        public FullSpanItem(Parcel parcel)
        {
            boolean flag = true;
            super();
            mPosition = parcel.readInt();
            mGapDir = parcel.readInt();
            int i;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            mHasUnwantedGapAfter = flag;
            i = parcel.readInt();
            if (i > 0)
            {
                mGapPerSpan = new int[i];
                parcel.readIntArray(mGapPerSpan);
            }
        }
    }


    int mData[];
    List mFullSpanItems;

    final void clear()
    {
        throw new NullPointerException();
    }

    final void ensureSize(int i)
    {
        if (mData == null)
        {
            mData = new int[Math.max(i, 10) + 1];
            Arrays.fill(mData, -1);
        } else
        if (i >= mData.length)
        {
            int ai[] = mData;
            int j;
            for (j = mData.length; j <= i; j *= 2) { }
            mData = new int[j];
            System.arraycopy(ai, 0, mData, 0, ai.length);
            Arrays.fill(mData, ai.length, mData.length, -1);
            return;
        }
    }

    final void offsetForAddition(int i, int j)
    {
        throw new NullPointerException();
    }

    final void offsetForRemoval(int i, int j)
    {
        throw new NullPointerException();
    }
}
