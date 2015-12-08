// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersAdapter, WrapperView, CheckableWrapperView

class AdapterWrapper extends BaseAdapter
    implements StickyListHeadersAdapter
{
    static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick(View view, int i, long l);
    }


    private final Context mContext;
    private DataSetObserver mDataSetObserver;
    final StickyListHeadersAdapter mDelegate;
    private Drawable mDivider;
    private int mDividerHeight;
    private final List mHeaderCache = new LinkedList();
    private OnHeaderClickListener mOnHeaderClickListener;

    AdapterWrapper(Context context, StickyListHeadersAdapter stickylistheadersadapter)
    {
        mDataSetObserver = new DataSetObserver() {

            final AdapterWrapper this$0;

            public void onChanged()
            {
                notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                mHeaderCache.clear();
                notifyDataSetInvalidated();
            }

            
            {
                this$0 = AdapterWrapper.this;
                super();
            }
        };
        mContext = context;
        mDelegate = stickylistheadersadapter;
        stickylistheadersadapter.registerDataSetObserver(mDataSetObserver);
    }

    private View configureHeader(WrapperView wrapperview, final int position)
    {
        View view;
        if (wrapperview.mHeader == null)
        {
            view = popHeader();
        } else
        {
            view = wrapperview.mHeader;
        }
        wrapperview = mDelegate.getHeaderView(position, view, wrapperview);
        if (wrapperview == null)
        {
            throw new NullPointerException("Header view must not be null.");
        } else
        {
            wrapperview.setClickable(true);
            wrapperview.setOnClickListener(new android.view.View.OnClickListener() {

                final AdapterWrapper this$0;
                final int val$position;

                public void onClick(View view1)
                {
                    if (mOnHeaderClickListener != null)
                    {
                        long l = mDelegate.getHeaderId(position);
                        mOnHeaderClickListener.onHeaderClick(view1, position, l);
                    }
                }

            
            {
                this$0 = AdapterWrapper.this;
                position = i;
                super();
            }
            });
            return wrapperview;
        }
    }

    private View popHeader()
    {
        if (mHeaderCache.size() > 0)
        {
            return (View)mHeaderCache.remove(0);
        } else
        {
            return null;
        }
    }

    private boolean previousPositionHasSameHeader(int i)
    {
        return i != 0 && mDelegate.getHeaderId(i) == mDelegate.getHeaderId(i - 1);
    }

    private void recycleHeaderIfExists(WrapperView wrapperview)
    {
        wrapperview = wrapperview.mHeader;
        if (wrapperview != null)
        {
            wrapperview.setVisibility(0);
            mHeaderCache.add(wrapperview);
        }
    }

    public boolean areAllItemsEnabled()
    {
        return mDelegate.areAllItemsEnabled();
    }

    public boolean equals(Object obj)
    {
        return mDelegate.equals(obj);
    }

    public int getCount()
    {
        return mDelegate.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return ((BaseAdapter)mDelegate).getDropDownView(i, view, viewgroup);
    }

    public long getHeaderId(int i)
    {
        return mDelegate.getHeaderId(i);
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        return mDelegate.getHeaderView(i, view, viewgroup);
    }

    public Object getItem(int i)
    {
        return mDelegate.getItem(i);
    }

    public long getItemId(int i)
    {
        return mDelegate.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return mDelegate.getItemViewType(i);
    }

    public volatile View getView(int i, View view, ViewGroup viewgroup)
    {
        return getView(i, view, viewgroup);
    }

    public WrapperView getView(int i, View view, ViewGroup viewgroup)
    {
        View view2;
        View view1;
        if (view == null)
        {
            view = new WrapperView(mContext);
        } else
        {
            view = (WrapperView)view;
        }
        view2 = mDelegate.getView(i, ((WrapperView) (view)).mItem, viewgroup);
        view1 = null;
        if (previousPositionHasSameHeader(i))
        {
            recycleHeaderIfExists(view);
        } else
        {
            view1 = configureHeader(view, i);
        }
        if (!(view2 instanceof Checkable) || (view instanceof CheckableWrapperView)) goto _L2; else goto _L1
_L1:
        viewgroup = new CheckableWrapperView(mContext);
_L4:
        viewgroup.update(view2, view1, mDivider, mDividerHeight);
        return viewgroup;
_L2:
        viewgroup = view;
        if (!(view2 instanceof Checkable))
        {
            viewgroup = view;
            if (view instanceof CheckableWrapperView)
            {
                viewgroup = new WrapperView(mContext);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getViewTypeCount()
    {
        return mDelegate.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return mDelegate.hasStableIds();
    }

    public int hashCode()
    {
        return mDelegate.hashCode();
    }

    public boolean isEmpty()
    {
        return mDelegate.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return mDelegate.isEnabled(i);
    }

    public void notifyDataSetChanged()
    {
        ((BaseAdapter)mDelegate).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        ((BaseAdapter)mDelegate).notifyDataSetInvalidated();
    }

    void setDivider(Drawable drawable, int i)
    {
        mDivider = drawable;
        mDividerHeight = i;
        notifyDataSetChanged();
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
        mOnHeaderClickListener = onheaderclicklistener;
    }

    public String toString()
    {
        return mDelegate.toString();
    }




}
