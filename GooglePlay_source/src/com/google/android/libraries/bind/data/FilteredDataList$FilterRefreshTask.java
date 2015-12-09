// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.async.AsyncUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.bind.data:
//            RefreshTask, FilteredDataList, DataList, Snapshot, 
//            Filter, DataException, Data, DataChange

protected static class filter extends RefreshTask
{

    protected final Filter filter;
    protected final int newSourceDataVersion;
    protected final DataException sourceException;
    protected final Snapshot sourceSnapshot;

    protected final List getFreshData()
        throws DataException
    {
        if (sourceException != null)
        {
            throw sourceException;
        }
        List list1 = getSourceData();
        List list;
        if (super.cancelled.get())
        {
            list = null;
        } else
        {
            list = list1;
            if (filter != null)
            {
                ArrayList arraylist = new ArrayList(list1.size());
                Object obj = arraylist;
                if (filter != null)
                {
                    for (obj = list1.iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((Data)((Iterator) (obj)).next())) { }
                    if (super.cancelled.get())
                    {
                        return null;
                    }
                    obj = filter.transform$7ddb133f(arraylist);
                }
                return ((List) (obj));
            }
        }
        return list;
    }

    protected List getSourceData()
    {
        return sourceSnapshot.list;
    }

    protected final void postRefresh(Snapshot snapshot, DataChange datachange)
    {
        dataList.postRefresh(this, snapshot, datachange, Integer.valueOf(newSourceDataVersion));
    }

    public (DataList datalist, Executor executor, Filter filter1, DataList datalist1)
    {
        if (filter1 != null)
        {
            executor = filter1.executor();
        }
        super(datalist, executor);
        AsyncUtil.checkMainThread();
        sourceSnapshot = datalist1.snapshot;
        newSourceDataVersion = datalist1.dataVersion;
        sourceException = datalist1.snapshot.exception;
        filter = filter1;
    }
}
