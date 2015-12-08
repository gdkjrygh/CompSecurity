// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.database.DataSetObserver;
import com.skype.android.widget.recycler.OnAnyChangeObserver;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSearchAdapter

private static final class observer extends OnAnyChangeObserver
{

    private final DataSetObserver observer;

    public final boolean equals(Object obj)
    {
        return this == obj || (obj instanceof observer) && observer == ((observer)obj).observer;
    }

    public final int hashCode()
    {
        if (observer != null)
        {
            return observer.hashCode();
        } else
        {
            return 0;
        }
    }

    public final void onChanged()
    {
        observer.onChanged();
    }

    public (DataSetObserver datasetobserver)
    {
        observer = datasetobserver;
    }
}
