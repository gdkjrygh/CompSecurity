// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.adapters;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

// Referenced classes of package com.android.ex.photo.adapters:
//            BaseFragmentPagerAdapter

public abstract class BaseCursorPagerAdapter extends BaseFragmentPagerAdapter
{

    protected Context mContext;
    protected Cursor mCursor;
    protected SparseIntArray mItemPosition;
    protected final HashMap mObjectRowMap = new HashMap();
    protected int mRowIDColumn;

    public BaseCursorPagerAdapter(Context context, FragmentManager fragmentmanager, Cursor cursor)
    {
        super(fragmentmanager);
        init(context, cursor);
    }

    private void init(Context context, Cursor cursor)
    {
        int i;
        if (cursor != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mCursor = cursor;
        mContext = context;
        if (i != 0)
        {
            i = mCursor.getColumnIndex("uri");
        } else
        {
            i = -1;
        }
        mRowIDColumn = i;
    }

    private boolean moveCursorTo(int i)
    {
        if (mCursor != null && !mCursor.isClosed())
        {
            return mCursor.moveToPosition(i);
        } else
        {
            return false;
        }
    }

    private void setItemPosition()
    {
        if (mCursor == null || mCursor.isClosed())
        {
            mItemPosition = null;
            return;
        }
        SparseIntArray sparseintarray = new SparseIntArray(mCursor.getCount());
        mCursor.moveToPosition(-1);
        for (; mCursor.moveToNext(); sparseintarray.append(mCursor.getString(mRowIDColumn).hashCode(), mCursor.getPosition())) { }
        mItemPosition = sparseintarray;
    }

    public final void destroyItem(View view, int i, Object obj)
    {
        mObjectRowMap.remove(obj);
        super.destroyItem(view, i, obj);
    }

    public final int getCount()
    {
        if (mCursor != null)
        {
            return mCursor.getCount();
        } else
        {
            return 0;
        }
    }

    public final Cursor getCursor()
    {
        return mCursor;
    }

    public final Fragment getItem(int i)
    {
        if (mCursor != null && moveCursorTo(i))
        {
            return getItem(mContext, mCursor, i);
        } else
        {
            return null;
        }
    }

    public abstract Fragment getItem(Context context, Cursor cursor, int i);

    public final int getItemPosition(Object obj)
    {
        obj = (Integer)mObjectRowMap.get(obj);
        if (obj == null || mItemPosition == null)
        {
            return -2;
        } else
        {
            return mItemPosition.get(((Integer) (obj)).intValue(), -2);
        }
    }

    public final Object instantiateItem(View view, int i)
    {
        if (mCursor == null)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Integer integer;
        if (moveCursorTo(i))
        {
            integer = Integer.valueOf(mCursor.getString(mRowIDColumn).hashCode());
        } else
        {
            integer = null;
        }
        view = ((View) (super.instantiateItem(view, i)));
        if (view != null)
        {
            mObjectRowMap.put(view, integer);
        }
        return view;
    }

    protected final String makeFragmentName(int i, int j)
    {
        if (moveCursorTo(j))
        {
            j = mCursor.getString(mRowIDColumn).hashCode();
            return (new StringBuilder(37)).append("android:pager:").append(i).append(":").append(j).toString();
        } else
        {
            return super.makeFragmentName(i, j);
        }
    }

    public Cursor swapCursor(Cursor cursor)
    {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2))
        {
            int i;
            int j;
            if (mCursor == null)
            {
                i = -1;
            } else
            {
                i = mCursor.getCount();
            }
            if (cursor == null)
            {
                j = -1;
            } else
            {
                j = cursor.getCount();
            }
            Log.v("BaseCursorPagerAdapter", (new StringBuilder(43)).append("swapCursor old=").append(i).append("; new=").append(j).toString());
        }
        if (cursor == mCursor)
        {
            return null;
        }
        Cursor cursor1 = mCursor;
        mCursor = cursor;
        if (cursor != null)
        {
            mRowIDColumn = cursor.getColumnIndex("uri");
        } else
        {
            mRowIDColumn = -1;
        }
        setItemPosition();
        notifyDataSetChanged();
        return cursor1;
    }
}
