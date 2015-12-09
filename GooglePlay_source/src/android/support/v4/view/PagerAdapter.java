// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{

    private DataSetObservable mObservable;

    public PagerAdapter()
    {
        mObservable = new DataSetObservable();
    }

    public void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
    {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void finishUpdate$52bc874c()
    {
    }

    public abstract int getCount();

    public int getItemPosition(Object obj)
    {
        return -1;
    }

    public CharSequence getPageTitle(int i)
    {
        return null;
    }

    public float getPageWidth$13461e()
    {
        return 1.0F;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged()
    {
        mObservable.notifyChanged();
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.registerObserver(datasetobserver);
    }

    public void restoreState$2cb49ec(Parcelable parcelable)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void setPrimaryItem$30510aeb(Object obj)
    {
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.unregisterObserver(datasetobserver);
    }
}
