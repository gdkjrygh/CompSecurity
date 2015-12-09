// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.async.AsyncUtil;
import com.google.android.libraries.bind.util.Util;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataList, DataException, DataChange, Snapshot, 
//            Data

public abstract class RefreshTask
    implements Runnable
{

    final AtomicBoolean cancelled = new AtomicBoolean();
    protected final DataList dataList;
    boolean executed;
    final Executor executor;
    protected final Snapshot previousSnapshot;

    public RefreshTask(DataList datalist, Executor executor1)
    {
        dataList = datalist;
        executor = executor1;
        AsyncUtil.checkMainThread();
        previousSnapshot = datalist.snapshot;
    }

    protected abstract List getFreshData()
        throws DataException;

    protected void postRefresh(Snapshot snapshot, DataChange datachange)
    {
        dataList.postRefresh(this, snapshot, datachange, null);
    }

    public void run()
    {
        if (!cancelled.get()) goto _L2; else goto _L1
_L1:
        Object obj1;
        return;
_L2:
        if ((obj1 = getFreshData()) == null) goto _L1; else goto _L3
_L3:
        if (cancelled.get()) goto _L1; else goto _L4
_L4:
        Object obj = new DataChange[1];
        int i;
        if (previousSnapshot.list == Snapshot.INVALID_LIST)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        obj[0] = DataChange.AFFECTS_PRIMARY_KEY;
        i = 1;
_L9:
        if (i == 0) goto _L1; else goto _L7
_L7:
        obj1 = new Snapshot(dataList.primaryKey, ((List) (obj1)));
        obj = obj[0];
_L23:
        if (cancelled.get()) goto _L1; else goto _L8
_L8:
        postRefresh(((Snapshot) (obj1)), ((DataChange) (obj)));
        return;
_L6:
        List list;
        list = previousSnapshot.list;
        if (((List) (obj1)).size() == list.size())
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj[0] = DataChange.AFFECTS_PRIMARY_KEY;
        i = 1;
          goto _L9
        int k = list.size();
        i = 0;
_L24:
        if (i >= k) goto _L11; else goto _L10
_L10:
        if (Util.objectsEqual(((Data)list.get(i)).get(previousSnapshot.primaryKey), ((Data)((List) (obj1)).get(i)).get(dataList.primaryKey))) goto _L13; else goto _L12
_L12:
        obj[0] = DataChange.AFFECTS_PRIMARY_KEY;
        i = 1;
          goto _L9
_L11:
        int ai[];
        obj[0] = DataChange.DOESNT_AFFECT_PRIMARY_KEY;
        ai = dataList.equalityFields();
        i = 0;
_L22:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        Data data;
        Data data1;
        data = (Data)list.get(i);
        data1 = (Data)((List) (obj1)).get(i);
        if (ai != null) goto _L15; else goto _L14
_L14:
        boolean flag = data.equals(data1);
          goto _L16
_L15:
        int l = ai.length;
        int j = 0;
_L20:
        int i1;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ai[j];
        flag = Util.objectsEqual(data.get(i1), data1.get(i1));
        if (flag) goto _L18; else goto _L17
_L17:
        flag = false;
          goto _L16
_L18:
        j++;
        if (true) goto _L20; else goto _L19
_L19:
        flag = true;
          goto _L16
_L26:
        i++;
        if (true) goto _L22; else goto _L21
_L21:
        i = 0;
          goto _L9
        DataException dataexception;
        dataexception;
        obj1 = new Snapshot(dataList.primaryKey, dataexception);
        dataexception = new DataChange(dataexception);
          goto _L23
_L13:
        i++;
          goto _L24
_L16:
        if (flag) goto _L26; else goto _L25
_L25:
        i = 1;
          goto _L9
    }
}
