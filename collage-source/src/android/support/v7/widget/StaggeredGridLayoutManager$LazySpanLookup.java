// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager

static class FullSpanItem.mGapPerSpan
{
    static class FullSpanItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public FullSpanItem createFromParcel(Parcel parcel)
            {
                return new FullSpanItem(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public FullSpanItem[] newArray(int i)
            {
                return new FullSpanItem[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
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
            return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
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


    private static final int MIN_SIZE = 10;
    int mData[];
    List mFullSpanItems;

    private int invalidateFullSpansAfter(int i)
    {
        int j;
        int k;
        if (mFullSpanItems == null)
        {
            return -1;
        }
        FullSpanItem fullspanitem = getFullSpanItem(i);
        if (fullspanitem != null)
        {
            mFullSpanItems.remove(fullspanitem);
        }
        k = mFullSpanItems.size();
        j = 0;
_L3:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (((FullSpanItem)mFullSpanItems.get(j)).mPosition < i) goto _L2; else goto _L1
_L1:
        if (j != -1)
        {
            FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
            mFullSpanItems.remove(j);
            return fullspanitem1.mPosition;
        } else
        {
            return -1;
        }
_L2:
        j++;
          goto _L3
        j = -1;
          goto _L1
    }

    private void offsetFullSpansForAddition(int i, int j)
    {
        if (mFullSpanItems != null)
        {
            int k = mFullSpanItems.size() - 1;
            while (k >= 0) 
            {
                FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
                if (fullspanitem.mPosition >= i)
                {
                    fullspanitem.mPosition = fullspanitem.mPosition + j;
                }
                k--;
            }
        }
    }

    private void offsetFullSpansForRemoval(int i, int j)
    {
        if (mFullSpanItems != null)
        {
            int k = mFullSpanItems.size() - 1;
            while (k >= 0) 
            {
                FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
                if (fullspanitem.mPosition >= i)
                {
                    if (fullspanitem.mPosition < i + j)
                    {
                        mFullSpanItems.remove(k);
                    } else
                    {
                        fullspanitem.mPosition = fullspanitem.mPosition - j;
                    }
                }
                k--;
            }
        }
    }

    public void addFullSpanItem(FullSpanItem fullspanitem)
    {
        if (mFullSpanItems == null)
        {
            mFullSpanItems = new ArrayList();
        }
        int j = mFullSpanItems.size();
        for (int i = 0; i < j; i++)
        {
            FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(i);
            if (fullspanitem1.mPosition == fullspanitem.mPosition)
            {
                mFullSpanItems.remove(i);
            }
            if (fullspanitem1.mPosition >= fullspanitem.mPosition)
            {
                mFullSpanItems.add(i, fullspanitem);
                return;
            }
        }

        mFullSpanItems.add(fullspanitem);
    }

    void clear()
    {
        if (mData != null)
        {
            Arrays.fill(mData, -1);
        }
        mFullSpanItems = null;
    }

    void ensureSize(int i)
    {
        if (mData == null)
        {
            mData = new int[Math.max(i, 10) + 1];
            Arrays.fill(mData, -1);
        } else
        if (i >= mData.length)
        {
            int ai[] = mData;
            mData = new int[sizeForPosition(i)];
            System.arraycopy(ai, 0, mData, 0, ai.length);
            Arrays.fill(mData, ai.length, mData.length, -1);
            return;
        }
    }

    int forceInvalidateAfter(int i)
    {
        if (mFullSpanItems != null)
        {
            for (int j = mFullSpanItems.size() - 1; j >= 0; j--)
            {
                if (((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
                {
                    mFullSpanItems.remove(j);
                }
            }

        }
        return invalidateAfter(i);
    }

    public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
    {
        if (mFullSpanItems != null) goto _L2; else goto _L1
_L1:
        FullSpanItem fullspanitem = null;
_L6:
        return fullspanitem;
_L2:
        int l;
        int i1;
        i1 = mFullSpanItems.size();
        l = 0;
_L9:
        if (l >= i1) goto _L4; else goto _L3
_L3:
        FullSpanItem fullspanitem1;
        fullspanitem1 = (FullSpanItem)mFullSpanItems.get(l);
        if (fullspanitem1.mPosition >= j)
        {
            return null;
        }
        if (fullspanitem1.mPosition < i)
        {
            continue; /* Loop/switch isn't completed */
        }
        fullspanitem = fullspanitem1;
        if (k == 0) goto _L6; else goto _L5
_L5:
        fullspanitem = fullspanitem1;
        if (fullspanitem1.mGapDir == k) goto _L6; else goto _L7
_L7:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        fullspanitem = fullspanitem1;
        if (fullspanitem1.mHasUnwantedGapAfter) goto _L6; else goto _L8
_L8:
        l++;
          goto _L9
_L4:
        return null;
    }

    public FullSpanItem getFullSpanItem(int i)
    {
        if (mFullSpanItems != null) goto _L2; else goto _L1
_L1:
        FullSpanItem fullspanitem = null;
_L4:
        return fullspanitem;
_L2:
        int j = mFullSpanItems.size() - 1;
label0:
        do
        {
label1:
            {
                if (j < 0)
                {
                    break label1;
                }
                FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
                fullspanitem = fullspanitem1;
                if (fullspanitem1.mPosition == i)
                {
                    break label0;
                }
                j--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    int getSpan(int i)
    {
        if (mData == null || i >= mData.length)
        {
            return -1;
        } else
        {
            return mData[i];
        }
    }

    int invalidateAfter(int i)
    {
        while (mData == null || i >= mData.length) 
        {
            return -1;
        }
        int j = invalidateFullSpansAfter(i);
        if (j == -1)
        {
            Arrays.fill(mData, i, mData.length, -1);
            return mData.length;
        } else
        {
            Arrays.fill(mData, i, j + 1, -1);
            return j + 1;
        }
    }

    void offsetForAddition(int i, int j)
    {
        if (mData == null || i >= mData.length)
        {
            return;
        } else
        {
            ensureSize(i + j);
            System.arraycopy(mData, i, mData, i + j, mData.length - i - j);
            Arrays.fill(mData, i, i + j, -1);
            offsetFullSpansForAddition(i, j);
            return;
        }
    }

    void offsetForRemoval(int i, int j)
    {
        if (mData == null || i >= mData.length)
        {
            return;
        } else
        {
            ensureSize(i + j);
            System.arraycopy(mData, i + j, mData, i, mData.length - i - j);
            Arrays.fill(mData, mData.length - j, mData.length, -1);
            offsetFullSpansForRemoval(i, j);
            return;
        }
    }

    void setSpan(int i, offsetFullSpansForRemoval offsetfullspansforremoval)
    {
        ensureSize(i);
        mData[i] = offsetfullspansforremoval.mData;
    }

    int sizeForPosition(int i)
    {
        int j;
        for (j = mData.length; j <= i; j *= 2) { }
        return j;
    }

    FullSpanItem.mGapPerSpan()
    {
    }
}
