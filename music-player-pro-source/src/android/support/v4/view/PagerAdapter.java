// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcelable;
import android.view.View;

public abstract class PagerAdapter
{
    static interface DataSetObserver
    {

        public abstract void onDataSetChanged();
    }


    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private DataSetObserver mObserver;

    public PagerAdapter()
    {
    }

    public abstract void destroyItem(View view, int i, Object obj);

    public abstract void finishUpdate(View view);

    public abstract int getCount();

    public int getItemPosition(Object obj)
    {
        return -1;
    }

    public abstract Object instantiateItem(View view, int i);

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged()
    {
        if (mObserver != null)
        {
            mObserver.onDataSetChanged();
        }
    }

    public abstract void restoreState(Parcelable parcelable, ClassLoader classloader);

    public abstract Parcelable saveState();

    void setDataSetObserver(DataSetObserver datasetobserver)
    {
        mObserver = datasetobserver;
    }

    public void setPrimaryItem(View view, int i, Object obj)
    {
    }

    public abstract void startUpdate(View view);
}
