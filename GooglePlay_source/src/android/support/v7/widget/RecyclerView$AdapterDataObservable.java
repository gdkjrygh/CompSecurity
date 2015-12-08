// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class  extends Observable
{

    public final void notifyChanged()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((mObservers)mObservers.get(i)).Changed();
        }

    }

    public final void notifyItemRangeChanged(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).ItemRangeChanged(i, j);
        }

    }

    public final void notifyItemRangeInserted(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).ItemRangeInserted(i, j);
        }

    }

    public final void notifyItemRangeRemoved(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).ItemRangeRemoved(i, j);
        }

    }

    ()
    {
    }
}
