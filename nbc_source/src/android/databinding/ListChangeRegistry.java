// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            CallbackRegistry, ObservableList

public class ListChangeRegistry extends CallbackRegistry
{
    static class ListChanges
    {

        public int count;
        public int start;
        public int to;

        ListChanges()
        {
        }
    }


    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final CallbackRegistry.NotifierCallback NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback() {

        public void onNotifyCallback(ObservableList.OnListChangedCallback onlistchangedcallback, ObservableList observablelist, int i, ListChanges listchanges)
        {
            switch (i)
            {
            default:
                onlistchangedcallback.onChanged(observablelist);
                return;

            case 1: // '\001'
                onlistchangedcallback.onItemRangeChanged(observablelist, listchanges.start, listchanges.count);
                return;

            case 2: // '\002'
                onlistchangedcallback.onItemRangeInserted(observablelist, listchanges.start, listchanges.count);
                return;

            case 3: // '\003'
                onlistchangedcallback.onItemRangeMoved(observablelist, listchanges.start, listchanges.to, listchanges.count);
                return;

            case 4: // '\004'
                onlistchangedcallback.onItemRangeRemoved(observablelist, listchanges.start, listchanges.count);
                break;
            }
        }

        public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
        {
            onNotifyCallback((ObservableList.OnListChangedCallback)obj, (ObservableList)obj1, i, (ListChanges)obj2);
        }

    };
    private static final int REMOVED = 4;
    private static final android.support.v4.util.Pools.SynchronizedPool sListChanges = new android.support.v4.util.Pools.SynchronizedPool(10);

    public ListChangeRegistry()
    {
        super(NOTIFIER_CALLBACK);
    }

    private static ListChanges acquire(int i, int j, int k)
    {
        ListChanges listchanges1 = (ListChanges)sListChanges.acquire();
        ListChanges listchanges = listchanges1;
        if (listchanges1 == null)
        {
            listchanges = new ListChanges();
        }
        listchanges.start = i;
        listchanges.to = j;
        listchanges.count = k;
        return listchanges;
    }

    public void notifyCallbacks(ObservableList observablelist, int i, ListChanges listchanges)
    {
        this;
        JVM INSTR monitorenter ;
        super.notifyCallbacks(observablelist, i, listchanges);
        if (listchanges == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        sListChanges.release(listchanges);
        this;
        JVM INSTR monitorexit ;
        return;
        observablelist;
        throw observablelist;
    }

    public volatile void notifyCallbacks(Object obj, int i, Object obj1)
    {
        notifyCallbacks((ObservableList)obj, i, (ListChanges)obj1);
    }

    public void notifyChanged(ObservableList observablelist)
    {
        notifyCallbacks(observablelist, 0, ((ListChanges) (null)));
    }

    public void notifyChanged(ObservableList observablelist, int i, int j)
    {
        notifyCallbacks(observablelist, 1, acquire(i, 0, j));
    }

    public void notifyInserted(ObservableList observablelist, int i, int j)
    {
        notifyCallbacks(observablelist, 2, acquire(i, 0, j));
    }

    public void notifyMoved(ObservableList observablelist, int i, int j, int k)
    {
        notifyCallbacks(observablelist, 3, acquire(i, j, k));
    }

    public void notifyRemoved(ObservableList observablelist, int i, int j)
    {
        notifyCallbacks(observablelist, 4, acquire(i, 0, j));
    }

}
