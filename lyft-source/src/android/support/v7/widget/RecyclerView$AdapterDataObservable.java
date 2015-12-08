// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

class  extends Observable
{

    public void a(int i, int j)
    {
        a(i, j, null);
    }

    public void a(int i, int j, Object obj)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).mObservers(i, j, obj);
        }

    }

    public boolean a()
    {
        return !mObservers.isEmpty();
    }

    public void b()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((mObservers)mObservers.get(i)).mObservers();
        }

    }

    public void b(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).mObservers(i, j);
        }

    }

    public void c(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).mObservers(i, j);
        }

    }

    public void d(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((mObservers)mObservers.get(k)).mObservers(i, j, 1);
        }

    }

    ()
    {
    }
}
