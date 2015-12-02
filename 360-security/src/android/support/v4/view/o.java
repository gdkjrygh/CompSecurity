// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class o
{

    private DataSetObservable a;

    public o()
    {
        a = new DataSetObservable();
    }

    public int a(Object obj)
    {
        return -1;
    }

    public Parcelable a()
    {
        return null;
    }

    public Object a(View view, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        return a(((View) (viewgroup)), i);
    }

    public void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(View view)
    {
    }

    public void a(View view, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(ViewGroup viewgroup)
    {
        a(((View) (viewgroup)));
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        a(((View) (viewgroup)), i, obj);
    }

    public abstract boolean a(View view, Object obj);

    public abstract int b();

    public void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }

    public void b(View view)
    {
    }

    public void b(View view, int i, Object obj)
    {
    }

    public void b(ViewGroup viewgroup)
    {
        b(((View) (viewgroup)));
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
        b(((View) (viewgroup)), i, obj);
    }

    public CharSequence c(int i)
    {
        return null;
    }

    public void c()
    {
        a.notifyChanged();
    }

    public float d(int i)
    {
        return 1.0F;
    }
}
