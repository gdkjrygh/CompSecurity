// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

static final class  extends Observable
{

    public final void a(int i, int j)
    {
        a(i, j, null);
    }

    public final void a(int i, int j, Object obj)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).onItemRangeChanged(i, j, obj);
        }

    }

    public final boolean a()
    {
        return !mObservers.isEmpty();
    }

    public final void b()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((mObservers)mObservers.get(i)).onChanged();
        }

    }

    public final void b(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).onItemRangeInserted(i, j);
        }

    }

    public final void c(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).onItemRangeRemoved(i, j);
        }

    }

    public final void d(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).onItemRangeMoved(i, j, 1);
        }

    }

    ()
    {
    }
}
