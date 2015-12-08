// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.async.Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.data:
//            FilteredDataList, DataList, Filter, RefreshTask, 
//            Data

public final class FilteredDataRow extends FilteredDataList
{

    private final Object rowId;

    public FilteredDataRow(DataList datalist, Object obj, Filter filter, int ai[])
    {
        super(datalist, filter, ai, datalist.primaryKey);
        rowId = obj;
    }

    protected final RefreshTask makeRefreshTask()
    {
        int i = sourceList.findPositionForId(rowId);
        if (i == -1)
        {
            return null;
        } else
        {
            Data data = sourceList.getData(i);
            return new FilteredDataList.FilterRefreshTask(Queues.BIND_IMMEDIATE, filter, sourceList, data) {

                final FilteredDataRow this$0;
                final Data val$rowData;

                protected final List getSourceData()
                {
                    if (rowData == null)
                    {
                        return null;
                    } else
                    {
                        ArrayList arraylist = new ArrayList(1);
                        arraylist.add(rowData);
                        return arraylist;
                    }
                }

            
            {
                this$0 = FilteredDataRow.this;
                rowData = data;
                super(final_datalist, executor, filter, datalist1);
            }
            };
        }
    }
}
