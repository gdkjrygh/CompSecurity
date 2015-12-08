// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class aU
{

    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    public DataSetObservable mObservable;

    public aU()
    {
        mObservable = new DataSetObservable();
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a()
    {
    }

    public final void a(DataSetObserver datasetobserver)
    {
        mObservable.registerObserver(datasetobserver);
    }

    public void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(Object obj)
    {
    }

    public abstract boolean a(View view, Object obj);

    public int b(Object obj)
    {
        return -1;
    }

    public Parcelable b()
    {
        return null;
    }

    public CharSequence b(int i)
    {
        return null;
    }

    public final void b(DataSetObserver datasetobserver)
    {
        mObservable.unregisterObserver(datasetobserver);
    }

    public abstract int c();
}
