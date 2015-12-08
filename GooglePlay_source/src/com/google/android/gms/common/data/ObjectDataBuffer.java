// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, ObjectExclusionFilterable, DataBufferObserverSet, DataBufferObserver

public final class ObjectDataBuffer extends AbstractDataBuffer
    implements DataBufferObserver.Observable, ObjectExclusionFilterable
{

    public final ArrayList mEntityOffsets;
    public final HashSet mExcludedPositionSet;
    public final ArrayList mObjectList;
    public DataBufferObserverSet mObserverSet;

    public ObjectDataBuffer()
    {
        super(null);
        mExcludedPositionSet = new HashSet();
        mEntityOffsets = new ArrayList();
        mObjectList = new ArrayList();
        mObserverSet = new DataBufferObserverSet();
        filterEntities();
    }

    public ObjectDataBuffer(ArrayList arraylist)
    {
        super(null);
        mExcludedPositionSet = new HashSet();
        mEntityOffsets = new ArrayList();
        mObjectList = arraylist;
        mObserverSet = new DataBufferObserverSet();
        filterEntities();
    }

    public transient ObjectDataBuffer(Object aobj[])
    {
        super(null);
        mExcludedPositionSet = new HashSet();
        mEntityOffsets = new ArrayList();
        mObjectList = new ArrayList(Arrays.asList(aobj));
        mObserverSet = new DataBufferObserverSet();
        filterEntities();
    }

    public final void add(Object obj)
    {
        boolean flag1 = false;
        int i = mObjectList.size();
        mObjectList.add(obj);
        filterEntities();
        if (mObserverSet.hasObservers())
        {
            int j;
            boolean flag;
            if (!mExcludedPositionSet.contains(Integer.valueOf(i)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            j = mEntityOffsets.size();
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            flag = flag1;
            if (((Integer)mEntityOffsets.get(j - 1)).intValue() == i)
            {
                flag = true;
            }
            Asserts.checkState(flag);
            mObserverSet.onDataRangeInserted(j - 1, 1);
        }
    }

    public final void addObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.addObserver(databufferobserver);
    }

    public final void filterEntities()
    {
        mEntityOffsets.clear();
        int i = 0;
        for (int j = mObjectList.size(); i < j; i++)
        {
            if (!mExcludedPositionSet.contains(Integer.valueOf(i)))
            {
                mEntityOffsets.add(Integer.valueOf(i));
            }
        }

    }

    public final void filterOut(Object obj)
    {
        int j1 = -1;
        boolean flag1 = false;
        int i1 = -1;
        byte byte0 = -1;
        int l = 0;
        int k1 = mObjectList.size();
        while (l < k1) 
        {
            int j = i1;
            int i = byte0;
            int k = j1;
            boolean flag = flag1;
            if (!mExcludedPositionSet.contains(Integer.valueOf(l)))
            {
                j1++;
                if (obj.equals(mObjectList.get(l)))
                {
                    mExcludedPositionSet.add(Integer.valueOf(l));
                    flag1 = true;
                    j = i1;
                    i = byte0;
                    k = j1;
                    flag = flag1;
                    if (mObserverSet.hasObservers())
                    {
                        if (i1 < 0)
                        {
                            j = j1;
                            i = 1;
                            flag = flag1;
                            k = j1;
                        } else
                        {
                            i = byte0 + 1;
                            j = i1;
                            k = j1;
                            flag = flag1;
                        }
                    }
                } else
                {
                    j = i1;
                    i = byte0;
                    k = j1;
                    flag = flag1;
                    if (i1 >= 0)
                    {
                        filterEntities();
                        flag = false;
                        mObserverSet.onDataRangeRemoved(i1, byte0);
                        k = j1 - byte0;
                        j = -1;
                        i = -1;
                    }
                }
            }
            l++;
            i1 = j;
            byte0 = i;
            j1 = k;
            flag1 = flag;
        }
        if (flag1)
        {
            filterEntities();
        }
        if (i1 >= 0)
        {
            mObserverSet.onDataRangeRemoved(i1, byte0);
        }
    }

    public final void filterOutRaw(int i)
    {
        int k;
        byte byte0;
        boolean flag;
        flag = mExcludedPositionSet.add(Integer.valueOf(i));
        byte0 = -1;
        k = byte0;
        if (!mObserverSet.hasObservers()) goto _L2; else goto _L1
_L1:
        k = byte0;
        if (!flag) goto _L2; else goto _L3
_L3:
        int j;
        int l;
        j = 0;
        l = mEntityOffsets.size();
_L8:
        k = byte0;
        if (j >= l) goto _L2; else goto _L4
_L4:
        if (((Integer)mEntityOffsets.get(j)).intValue() != i) goto _L6; else goto _L5
_L5:
        k = j;
_L2:
        filterEntities();
        if (k >= 0)
        {
            mObserverSet.onDataRangeRemoved(k, 1);
        }
        return;
_L6:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Object get(int i)
    {
        return mObjectList.get(getRawPosition(i));
    }

    public final int getCount()
    {
        return mObjectList.size() - mExcludedPositionSet.size();
    }

    public final Bundle getMetadata()
    {
        return null;
    }

    public final int getRawPosition(int i)
    {
        if (i < 0 || i >= getCount())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)mEntityOffsets.get(i)).intValue();
        }
    }

    public final void insertRaw(int i, Object obj)
    {
        mObjectList.add(i, obj);
        int j = i;
        obj = new HashSet(mExcludedPositionSet.size());
        for (Iterator iterator = mExcludedPositionSet.iterator(); iterator.hasNext();)
        {
            Integer integer1 = (Integer)iterator.next();
            if (integer1.intValue() < i)
            {
                j--;
            } else
            {
                ((HashSet) (obj)).add(Integer.valueOf(integer1.intValue() + 1));
                iterator.remove();
            }
        }

        Integer integer;
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mExcludedPositionSet.add(integer))
        {
            integer = (Integer)((Iterator) (obj)).next();
        }

        filterEntities();
        if (mObserverSet.hasObservers())
        {
            mObserverSet.onDataRangeInserted(j, 1);
        }
    }

    public final void release()
    {
        mObserverSet.mObserverSet.clear();
    }

    public final void removeObserver(DataBufferObserver databufferobserver)
    {
        mObserverSet.removeObserver(databufferobserver);
    }

    public final void removeRaw(int i)
    {
        mObjectList.remove(i);
        boolean flag = mExcludedPositionSet.remove(Integer.valueOf(i));
        int j = i;
        Object obj = new HashSet(mExcludedPositionSet.size());
        for (Iterator iterator = mExcludedPositionSet.iterator(); iterator.hasNext();)
        {
            Integer integer1 = (Integer)iterator.next();
            if (integer1.intValue() < i)
            {
                j--;
            } else
            {
                iterator.remove();
                ((HashSet) (obj)).add(Integer.valueOf(integer1.intValue() - 1));
            }
        }

        Integer integer;
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mExcludedPositionSet.add(integer))
        {
            integer = (Integer)((Iterator) (obj)).next();
        }

        filterEntities();
        if (!flag && mObserverSet.hasObservers())
        {
            mObserverSet.onDataRangeRemoved(j, 1);
        }
    }

    public final boolean setRaw(int i, Object obj)
    {
        int j;
        mObjectList.set(i, obj);
        int k;
        boolean flag;
        if (!mExcludedPositionSet.contains(Integer.valueOf(i)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !mObserverSet.hasObservers()) goto _L2; else goto _L1
_L1:
        j = 0;
        k = mEntityOffsets.size();
_L7:
        if (j >= k) goto _L2; else goto _L3
_L3:
        if (((Integer)mEntityOffsets.get(j)).intValue() != i) goto _L5; else goto _L4
_L4:
        mObserverSet.onDataRangeChanged(j, 1);
_L2:
        return flag;
_L5:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void unfilterRaw(int i)
    {
        boolean flag;
        flag = mExcludedPositionSet.remove(Integer.valueOf(i));
        filterEntities();
        if (mObserverSet.hasObservers() && flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        byte byte0;
        int l;
        byte0 = -1;
        j = 0;
        l = mEntityOffsets.size();
_L4:
        int k;
        k = byte0;
        if (j >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Integer)mEntityOffsets.get(j)).intValue() != i)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        k = j;
        if (k < 0) goto _L1; else goto _L3
_L3:
        mObserverSet.onDataRangeInserted(k, 1);
        return;
        j++;
          goto _L4
    }
}
