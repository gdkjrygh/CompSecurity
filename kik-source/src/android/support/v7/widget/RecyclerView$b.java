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

    public final void a()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((mObservers)mObservers.get(i)).a();
        }

    }

    ()
    {
    }
}
