// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.async.AsyncUtil;
import com.google.android.libraries.bind.async.Queues;
import com.google.android.libraries.bind.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataList, Snapshot, DataChange, Filter, 
//            DataObserver, RefreshTask, DataException, Data

public class FilteredDataList extends DataList
{
    protected static class FilterRefreshTask extends RefreshTask
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

        public FilterRefreshTask(DataList datalist, Executor executor, Filter filter1, DataList datalist1)
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


    private final int equalityFields[];
    protected final Filter filter;
    private final DataObserver refreshObserver = new DataObserver() {

        final FilteredDataList this$0;
        final boolean val$clearOnInvalidation = false;

        public final void onDataChanged(DataChange datachange)
        {
            if (datachange.isInvalidation && clearOnInvalidation)
            {
                update$600ed7f(DataChange.INVALIDATION);
            }
            invalidateData();
        }

            
            {
                this$0 = FilteredDataList.this;
                super();
            }
    };
    protected final DataList sourceList;

    public FilteredDataList(DataList datalist, Filter filter1, int ai[], int i)
    {
        super(i);
        boolean flag;
        if (datalist != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Util.checkPrecondition(flag);
        filter = filter1;
        sourceList = datalist;
        equalityFields = ai;
    }

    protected final int[] equalityFields()
    {
        return equalityFields;
    }

    public final boolean isDirty()
    {
        return super.isDirty() || sourceList.dataVersion != 0;
    }

    protected RefreshTask makeRefreshTask()
    {
        com.google.android.libraries.bind.async.Queue queue;
        if (sourceList.snapshot.hasException())
        {
            queue = Queues.BIND_IMMEDIATE;
        } else
        {
            queue = Queues.BIND_CPU;
        }
        return new FilterRefreshTask(this, queue, filter, sourceList);
    }

    protected final void onRegisterForInvalidation()
    {
        sourceList.registerDataObserver(refreshObserver);
    }

    protected final void onUnregisterForInvalidation()
    {
        sourceList.unregisterDataObserver(refreshObserver);
    }

    public final void refresh()
    {
        if (sourceList.hasRefreshedOnce() || sourceList.snapshot.hasException())
        {
            super.refresh();
            return;
        } else
        {
            update$600ed7f(DataChange.INVALIDATION);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder(super.toString())).append("\n\nParent:").append(sourceList.toString()).toString();
    }
}
