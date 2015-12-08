// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            CursorFilter

public abstract class CursorAdapter extends BaseAdapter
    implements CursorFilter.CursorFilterClient, Filterable
{
    private final class ChangeObserver extends ContentObserver
    {

        final CursorAdapter this$0;

        public final boolean deliverSelfNotifications()
        {
            return true;
        }

        public final void onChange(boolean flag)
        {
            onContentChanged();
        }

        public ChangeObserver()
        {
            this$0 = CursorAdapter.this;
            super(new Handler());
        }
    }

    private final class MyDataSetObserver extends DataSetObserver
    {

        final CursorAdapter this$0;

        public final void onChanged()
        {
            mDataValid = true;
            notifyDataSetChanged();
        }

        public final void onInvalidated()
        {
            mDataValid = false;
            notifyDataSetInvalidated();
        }

        private MyDataSetObserver()
        {
            this$0 = CursorAdapter.this;
            super();
        }

        MyDataSetObserver(byte byte0)
        {
            this();
        }
    }


    protected boolean mAutoRequery;
    protected ChangeObserver mChangeObserver;
    public Context mContext;
    public Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected int mRowIDColumn;

    public CursorAdapter(Context context, Cursor cursor, boolean flag)
    {
        mAutoRequery = true;
        mCursor = null;
        mDataValid = false;
        mContext = context;
        mRowIDColumn = -1;
        mChangeObserver = new ChangeObserver();
        mDataSetObserver = new MyDataSetObserver((byte)0);
    }

    public abstract void bindView$4693bf34(View view, Cursor cursor);

    public void changeCursor(Cursor cursor)
    {
        if (cursor == mCursor)
        {
            cursor = null;
        } else
        {
            Cursor cursor1 = mCursor;
            if (cursor1 != null)
            {
                if (mChangeObserver != null)
                {
                    cursor1.unregisterContentObserver(mChangeObserver);
                }
                if (mDataSetObserver != null)
                {
                    cursor1.unregisterDataSetObserver(mDataSetObserver);
                }
            }
            mCursor = cursor;
            if (cursor != null)
            {
                if (mChangeObserver != null)
                {
                    cursor.registerContentObserver(mChangeObserver);
                }
                if (mDataSetObserver != null)
                {
                    cursor.registerDataSetObserver(mDataSetObserver);
                }
                mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
                mDataValid = true;
                notifyDataSetChanged();
                cursor = cursor1;
            } else
            {
                mRowIDColumn = -1;
                mDataValid = false;
                notifyDataSetInvalidated();
                cursor = cursor1;
            }
        }
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public CharSequence convertToString(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    public int getCount()
    {
        if (mDataValid && mCursor != null)
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

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (mDataValid)
        {
            mCursor.moveToPosition(i);
            if (view == null)
            {
                view = newDropDownView(mContext, mCursor, viewgroup);
            }
            bindView$4693bf34(view, mCursor);
            return view;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (mCursorFilter == null)
        {
            mCursorFilter = new CursorFilter(this);
        }
        return mCursorFilter;
    }

    public Object getItem(int i)
    {
        if (mDataValid && mCursor != null)
        {
            mCursor.moveToPosition(i);
            return mCursor;
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        long l1 = 0L;
        long l = l1;
        if (mDataValid)
        {
            l = l1;
            if (mCursor != null)
            {
                l = l1;
                if (mCursor.moveToPosition(i))
                {
                    l = mCursor.getLong(mRowIDColumn);
                }
            }
        }
        return l;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!mDataValid)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!mCursor.moveToPosition(i))
        {
            throw new IllegalStateException((new StringBuilder("couldn't move cursor to position ")).append(i).toString());
        }
        if (view == null)
        {
            view = newView(mContext, mCursor, viewgroup);
        }
        bindView$4693bf34(view, mCursor);
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return newView(context, cursor, viewgroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

    protected final void onContentChanged()
    {
        if (mAutoRequery && mCursor != null && !mCursor.isClosed())
        {
            mDataValid = mCursor.requery();
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
        return mCursor;
    }
}
