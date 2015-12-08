// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class jz
{

    public DataSetObservable a;

    public jz()
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

    public Object a(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public final void a(DataSetObserver datasetobserver)
    {
        a.registerObserver(datasetobserver);
    }

    public void a(ViewGroup viewgroup)
    {
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View view, Object obj);

    public abstract int b();

    public CharSequence b(int i)
    {
        return null;
    }

    public final void b(DataSetObserver datasetobserver)
    {
        a.unregisterObserver(datasetobserver);
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
    }

    public float c(int i)
    {
        return 1.0F;
    }

    public final void c()
    {
        a.notifyChanged();
    }
}
