// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObservable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class md
{

    public DataSetObservable a;

    public md()
    {
        a = new DataSetObservable();
    }

    public int a(Object obj)
    {
        return -1;
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(ViewGroup viewgroup)
    {
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View view, Object obj);

    public Parcelable af_()
    {
        return null;
    }

    public abstract int b();

    public CharSequence b(int i)
    {
        return null;
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
    }

    public void c()
    {
        a.notifyChanged();
    }
}
