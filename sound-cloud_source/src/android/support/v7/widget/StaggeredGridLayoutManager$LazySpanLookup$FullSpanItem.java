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

    public static final android.os.p.FullSpanItem._cls1 CREATOR = new _cls1();
    int mGapDir;
    int mGapPerSpan[];
    boolean mHasUnwantedGapAfter;
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


    public _cls1()
    {
    }

    public _cls1(Parcel parcel)
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

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
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
