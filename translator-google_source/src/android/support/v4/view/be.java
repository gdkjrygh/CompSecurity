// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class be
{

    private DataSetObservable a;

    public be()
    {
        a = new DataSetObservable();
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a()
    {
    }

    public void a(int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public final void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(Object obj)
    {
    }

    public abstract boolean a(View view, Object obj);

    public Parcelable b()
    {
        return null;
    }

    public final void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }

    public abstract int c();
}
