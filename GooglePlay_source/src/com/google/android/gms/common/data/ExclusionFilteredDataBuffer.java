// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.common.data:
//            FilteredDataBuffer, ExclusionFilterable, DataBufferObserverSet, AbstractDataBuffer, 
//            EntityBuffer, DataHolder, DataBuffer, DataBufferObserver

public final class ExclusionFilteredDataBuffer extends FilteredDataBuffer
    implements DataBufferObserver.Observable, ExclusionFilterable
{

    private AbstractDataBuffer mAbstractDataBuffer;
    private final HashSet mExcludedPositionSet = new HashSet();
    private DataBufferObserverSet mObserverSet;
    private final String mStringColumnName;

    public ExclusionFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer, String s)
    {
        super(abstractdatabuffer);
        mAbstractDataBuffer = abstractdatabuffer;
        mStringColumnName = s;
        mObserverSet = new DataBufferObserverSet();
    }

    private ArrayList getPositions(String s, ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        if (arraylist != null)
        {
            arraylist.clear();
        }
        DataHolder dataholder = mAbstractDataBuffer.mDataHolder;
        String s1 = mStringColumnName;
        boolean flag = mAbstractDataBuffer instanceof EntityBuffer;
        int j = 0;
        int i = 0;
        int j1 = mAbstractDataBuffer.getCount();
        while (i < j1) 
        {
            String s2;
            int k;
            int l;
            int i1;
            if (flag)
            {
                k = ((EntityBuffer)mAbstractDataBuffer).getRowIndex(i);
            } else
            {
                k = i;
            }
            s2 = dataholder.getString(s1, k, dataholder.getWindowIndex(k));
            l = j;
            i1 = l;
            k = j;
            if (arraylist != null)
            {
                if (mExcludedPositionSet.contains(Integer.valueOf(i)))
                {
                    i1 = -j - 1;
                    k = j;
                } else
                {
                    k = j + 1;
                    i1 = l;
                }
            }
            if (!TextUtils.isEmpty(s2) && s2.equals(s))
            {
                arraylist1.add(Integer.valueOf(i));
                if (arraylist != null)
                {
                    arraylist.add(Integer.valueOf(i1));
                }
            }
            i++;
            j = k;
        }
        return arraylist1;
    }

    public final void addObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.addObserver(databufferobserver);
    }

    public final int computeRealPosition(int i)
    {
        if (mExcludedPositionSet.isEmpty())
        {
            return i;
        }
        if (i < 0 || i >= getCount())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        }
        int k = 0;
        int j = 0;
        for (int i1 = mDataBuffer.getCount(); j < i1;)
        {
            int l = k;
            if (!mExcludedPositionSet.contains(Integer.valueOf(j)))
            {
                if (k == i)
                {
                    return j;
                }
                l = k + 1;
            }
            j++;
            k = l;
        }

        return -1;
    }

    public final void filterOut(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            ArrayList arraylist = null;
            if (mObserverSet.hasObservers())
            {
                arraylist = new ArrayList();
            }
            s = getPositions(s, arraylist);
            if (mObserverSet.hasObservers())
            {
                int i1 = 0;
                int l = 0;
                int k = s.size() - 1;
                while (k >= 0) 
                {
                    int j1 = ((Integer)arraylist.get(k)).intValue();
                    int i;
                    int j;
                    boolean flag;
                    if (j1 < 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    i = i1;
                    j = l;
                    if (!flag)
                    {
                        i = ((Integer)s.get(k)).intValue();
                        mExcludedPositionSet.add(Integer.valueOf(i));
                        if (l == 0)
                        {
                            i = j1;
                            j = 1;
                        } else
                        if (j1 == i1 - 1)
                        {
                            i = i1 - 1;
                            j = l + 1;
                        } else
                        {
                            mObserverSet.onDataRangeRemoved(i1, l);
                            i = j1;
                            j = 1;
                        }
                    }
                    k--;
                    i1 = i;
                    l = j;
                }
                if (l > 0)
                {
                    mObserverSet.onDataRangeRemoved(i1, l);
                    return;
                }
            } else
            {
                mExcludedPositionSet.addAll(s);
                return;
            }
        }
    }

    public final int getCount()
    {
        return mDataBuffer.getCount() - mExcludedPositionSet.size();
    }

    public final void release()
    {
        super.release();
        mObserverSet.mObserverSet.clear();
    }

    public final void removeObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.removeObserver(databufferobserver);
    }
}
