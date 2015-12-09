// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.os.Handler;
import com.google.android.libraries.bind.async.AsyncUtil;
import com.google.android.libraries.bind.logging.Logd;
import com.google.android.libraries.bind.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.bind.data:
//            PriorityDataObservable, Snapshot, RefreshTask, FilteredDataRow, 
//            Data, DataException, DataObserver, Filter, 
//            DataChange

public class DataList
{

    protected RefreshTask currentRefreshTask;
    private boolean dataDirty;
    private CopyOnWriteArraySet dataListListeners;
    int dataVersion;
    private final Snapshot invalidSnapshot;
    private boolean isAutoRefreshing;
    protected Logd logd;
    private final PriorityDataObservable observable;
    protected final int primaryKey;
    private boolean registeredForInvalidation;
    Snapshot snapshot;
    protected boolean stopAutoRefreshAfterRefresh;

    public DataList(int i)
    {
        this(i, null);
    }

    public DataList(int i, List list)
    {
        observable = new PriorityDataObservable();
        dataListListeners = new CopyOnWriteArraySet();
        primaryKey = i;
        invalidSnapshot = new Snapshot(i);
        if (list != null)
        {
            snapshot = new Snapshot(i, list);
            dataVersion = 1;
            return;
        } else
        {
            snapshot = invalidSnapshot;
            return;
        }
    }

    private boolean hasDataSetObservers()
    {
        return observable.size() > 0;
    }

    private Logd logd()
    {
        if (logd == null)
        {
            logd = Logd.get(getClass());
        }
        return logd;
    }

    private void registerForInvalidation()
    {
        logd();
        boolean flag;
        if (!registeredForInvalidation)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Util.checkPrecondition(flag);
        registeredForInvalidation = true;
        onRegisterForInvalidation();
        if (isDirty() && (isAutoRefreshing || !hasRefreshedOnce()))
        {
            refresh();
        }
        for (Iterator iterator = dataListListeners.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    private void stopRefreshTask()
    {
        logd();
        if (currentRefreshTask != null)
        {
            currentRefreshTask.cancelled.set(true);
            currentRefreshTask = null;
        }
    }

    private void unregisterForInvalidation()
    {
        logd();
        Util.checkPrecondition(registeredForInvalidation);
        registeredForInvalidation = false;
        onUnregisterForInvalidation();
        for (Iterator iterator = dataListListeners.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected int[] equalityFields()
    {
        return null;
    }

    public final FilteredDataRow filterRow(Object obj, Filter filter, int ai[])
    {
        obj = new FilteredDataRow(this, obj, filter, ai);
        ((DataList) (obj)).logd();
        obj.stopAutoRefreshAfterRefresh = false;
        if (!((DataList) (obj)).isAutoRefreshing)
        {
            obj.isAutoRefreshing = true;
            if (((DataList) (obj)).isDirty() && ((DataList) (obj)).hasDataSetObservers())
            {
                ((DataList) (obj)).refresh();
            }
        }
        return ((FilteredDataRow) (obj));
    }

    protected void finalize()
        throws Throwable
    {
        if (registeredForInvalidation || observable.size() > 0)
        {
            logd().e("Leaked datalist", new Object[0]);
            logd().e("  Observables: %s", new Object[] {
                observable
            });
        }
        super.finalize();
    }

    public final int findPositionForId(Object obj)
    {
        AsyncUtil.checkMainThread();
        obj = (Integer)snapshot.primaryKeyIndex.get(obj);
        if (obj == null)
        {
            return -1;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public final int getCount()
    {
        AsyncUtil.checkMainThread();
        return snapshot.getCount();
    }

    public final Data getData(int i)
    {
        AsyncUtil.checkMainThread();
        Snapshot snapshot1 = snapshot;
        if (snapshot1.isInvalidPosition(i))
        {
            return null;
        } else
        {
            return (Data)snapshot1.list.get(i);
        }
    }

    public final Object getItemId(int i)
    {
        AsyncUtil.checkMainThread();
        Snapshot snapshot1 = snapshot;
        if (snapshot1.isInvalidPosition(i))
        {
            return null;
        } else
        {
            return ((Data)snapshot1.list.get(i)).get(snapshot1.primaryKey);
        }
    }

    public final boolean hasRefreshedOnce()
    {
        AsyncUtil.checkMainThread();
        return snapshot != invalidSnapshot;
    }

    public final void invalidateData()
    {
        AsyncUtil.checkMainThread();
        logd();
        dataDirty = true;
        if (isAutoRefreshing && hasDataSetObservers())
        {
            refresh();
        }
    }

    public boolean isDirty()
    {
        return dataDirty;
    }

    public final boolean isEmpty()
    {
        AsyncUtil.checkMainThread();
        return snapshot.list.isEmpty();
    }

    protected RefreshTask makeRefreshTask()
    {
        return null;
    }

    protected void onRegisterForInvalidation()
    {
    }

    protected void onUnregisterForInvalidation()
    {
    }

    public final void postRefresh(final RefreshTask refreshTask, final Snapshot snapshot, final DataChange change, final Integer optDataVersion)
    {
        refreshTask = new Runnable() {

            final DataList this$0;
            final DataChange val$change;
            final Integer val$optDataVersion;
            final RefreshTask val$refreshTask;
            final Snapshot val$snapshot;

            public final void run()
            {
                if (refreshTask == currentRefreshTask)
                {
                    update(snapshot, change, optDataVersion);
                    currentRefreshTask = null;
                }
            }

            
            {
                this$0 = DataList.this;
                refreshTask = refreshtask;
                snapshot = snapshot1;
                change = datachange;
                optDataVersion = integer;
                super();
            }
        };
        if (AsyncUtil.isMainThread())
        {
            refreshTask.run();
            return;
        } else
        {
            AsyncUtil.mainThreadHandler().post(refreshTask);
            return;
        }
    }

    public final int primaryKey()
    {
        return primaryKey;
    }

    public void refresh()
    {
        boolean flag = false;
        boolean flag1 = true;
        AsyncUtil.checkMainThread();
        logd();
        logd();
        stopRefreshTask();
        currentRefreshTask = makeRefreshTask();
        if (currentRefreshTask == null)
        {
            logd();
            if (!hasRefreshedOnce())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dataDirty = flag;
            return;
        }
        RefreshTask refreshtask = currentRefreshTask;
        if (!refreshtask.executed)
        {
            flag = true;
        }
        Util.checkPrecondition(flag);
        refreshtask.executor.execute(refreshtask);
        refreshtask.executed = true;
    }

    public final void registerDataObserver(DataObserver dataobserver)
    {
        AsyncUtil.checkMainThread();
        PriorityDataObservable prioritydataobservable = observable;
        if (dataobserver == null)
        {
            throw new IllegalArgumentException("Observer is null");
        }
        boolean flag = prioritydataobservable.observerEntries.isEmpty();
        dataobserver = new PriorityDataObservable.ObserverEntry(dataobserver, 0);
        prioritydataobservable.observerEntries.add(dataobserver);
        Collections.sort(prioritydataobservable.observerEntries);
        if (flag)
        {
            registerForInvalidation();
        }
        logd();
        observable.size();
        flag = registeredForInvalidation;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        String s1 = getClass().getSimpleName();
        String s2 = Data.keyName(primaryKey);
        int i = getCount();
        String s;
        if (snapshot.hasException())
        {
            s = snapshot.exception.getMessage();
        } else
        {
            s = "no";
        }
        return String.format(locale, "%s - primaryKey: %s, size: %d, exception: %s", new Object[] {
            s1, s2, Integer.valueOf(i), s
        });
    }

    public final void unregisterDataObserver(DataObserver dataobserver)
    {
        PriorityDataObservable prioritydataobservable;
        AsyncUtil.checkMainThread();
        prioritydataobservable = observable;
        if (dataobserver == null)
        {
            throw new IllegalArgumentException("Observer is null");
        }
        if (!prioritydataobservable.observerEntries.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            unregisterForInvalidation();
            stopRefreshTask();
        }
        logd();
        observable.size();
        flag = registeredForInvalidation;
        return;
_L2:
        int i = 0;
        do
        {
label0:
            {
                if (i < prioritydataobservable.observerEntries.size())
                {
                    if (((PriorityDataObservable.ObserverEntry)prioritydataobservable.observerEntries.get(i)).observer != dataobserver)
                    {
                        break label0;
                    }
                    prioritydataobservable.observerEntries.remove(i);
                }
                flag = prioritydataobservable.observerEntries.isEmpty();
            }
            if (true)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void update(Snapshot snapshot1, DataChange datachange, Integer integer)
    {
        AsyncUtil.checkMainThread();
        Snapshot snapshot2 = snapshot1;
        if (snapshot1 == null)
        {
            snapshot2 = invalidSnapshot;
        }
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!snapshot2.hasException())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        dataDirty = flag2;
        if (snapshot2 == invalidSnapshot)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (snapshot.hasException() || snapshot2.hasException())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || snapshot != invalidSnapshot || flag1)
        {
            snapshot = snapshot2;
            int i;
            if (integer == null)
            {
                i = dataVersion + 1;
            } else
            {
                i = integer.intValue();
            }
            dataVersion = i;
            logd();
            snapshot1 = (new ArrayList(observable.observerEntries)).iterator();
            while (snapshot1.hasNext()) 
            {
                ((PriorityDataObservable.ObserverEntry)snapshot1.next()).observer.onDataChanged(datachange);
            }
        }
    }

    public final void update$600ed7f(DataChange datachange)
    {
        update(null, datachange, null);
    }
}
