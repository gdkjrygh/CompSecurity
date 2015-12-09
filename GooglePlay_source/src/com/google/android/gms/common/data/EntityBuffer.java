// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, DataHolder

public abstract class EntityBuffer extends AbstractDataBuffer
{

    private boolean mEntitiesIndexed;
    private ArrayList mEntityOffsets;

    public EntityBuffer(DataHolder dataholder)
    {
        super(dataholder);
        mEntitiesIndexed = false;
    }

    private void indexEntities()
    {
        this;
        JVM INSTR monitorenter ;
        if (mEntitiesIndexed) goto _L2; else goto _L1
_L1:
        int k;
        k = mDataHolder.mRowCount;
        mEntityOffsets = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        mEntityOffsets.add(Integer.valueOf(0));
        s1 = getPrimaryDataMarkerColumn();
        int i = mDataHolder.getWindowIndex(0);
        obj = mDataHolder.getString(s1, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s;
        int l;
        l = mDataHolder.getWindowIndex(j);
        s = mDataHolder.getString(s1, j, l);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        throw new NullPointerException((new StringBuilder("Missing value for markerColumn: ")).append(s1).append(", at row: ").append(j).append(", for window: ").append(l).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1 = obj;
        if (s.equals(obj)) goto _L7; else goto _L6
_L6:
        obj1 = s;
        mEntityOffsets.add(Integer.valueOf(j));
          goto _L7
_L4:
        mEntitiesIndexed = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        j++;
        obj = obj1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Object get(int i)
    {
        int l;
        indexEntities();
        l = getRowIndex(i);
        if (i >= 0 && i != mEntityOffsets.size()) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return getEntry(l, j);
_L2:
        int k;
        if (i == mEntityOffsets.size() - 1)
        {
            k = mDataHolder.mRowCount - ((Integer)mEntityOffsets.get(i)).intValue();
        } else
        {
            k = ((Integer)mEntityOffsets.get(i + 1)).intValue() - ((Integer)mEntityOffsets.get(i)).intValue();
        }
        j = k;
        if (k == 1)
        {
            i = getRowIndex(i);
            int i1 = mDataHolder.getWindowIndex(i);
            String s = getChildDataMarkerColumn();
            j = k;
            if (s != null)
            {
                j = k;
                if (mDataHolder.getString(s, i, i1) == null)
                {
                    j = 0;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getChildDataMarkerColumn()
    {
        return null;
    }

    public final int getCount()
    {
        indexEntities();
        return mEntityOffsets.size();
    }

    public abstract Object getEntry(int i, int j);

    public abstract String getPrimaryDataMarkerColumn();

    public final int getRowIndex(int i)
    {
        if (i < 0 || i >= mEntityOffsets.size())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)mEntityOffsets.get(i)).intValue();
        }
    }
}
