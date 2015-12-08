// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

public abstract class aa
{

    private DataSetObservable a;

    public aa()
    {
        a = new DataSetObservable();
    }

    public abstract int a();

    public Object a(View view, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public final void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public abstract boolean a(View view, Object obj);

    public int b()
    {
        return -1;
    }

    public final void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }

    public void b(View view, int i)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
