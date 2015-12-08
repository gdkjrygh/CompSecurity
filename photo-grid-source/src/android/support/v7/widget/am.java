// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            an

final class am extends Observable
{

    am()
    {
    }

    public final void a()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((an)mObservers.get(i)).a();
        }

    }

    public final void a(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((an)mObservers.get(k)).a(i, j);
        }

    }

    public final void b(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((an)mObservers.get(k)).b(i, j);
        }

    }
}
