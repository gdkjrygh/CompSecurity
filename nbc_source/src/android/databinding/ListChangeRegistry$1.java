// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ListChangeRegistry, ObservableList

static final class stChanges extends fierCallback
{

    public void onNotifyCallback(ChangedCallback changedcallback, ObservableList observablelist, int i, stChanges stchanges)
    {
        switch (i)
        {
        default:
            changedcallback.onChanged(observablelist);
            return;

        case 1: // '\001'
            changedcallback.onItemRangeChanged(observablelist, stchanges.start, stchanges.count);
            return;

        case 2: // '\002'
            changedcallback.onItemRangeInserted(observablelist, stchanges.start, stchanges.count);
            return;

        case 3: // '\003'
            changedcallback.onItemRangeMoved(observablelist, stchanges.start, stchanges.to, stchanges.count);
            return;

        case 4: // '\004'
            changedcallback.onItemRangeRemoved(observablelist, stchanges.start, stchanges.count);
            break;
        }
    }

    public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
    {
        onNotifyCallback((ChangedCallback)obj, (ObservableList)obj1, i, (stChanges)obj2);
    }

    stChanges()
    {
    }
}
