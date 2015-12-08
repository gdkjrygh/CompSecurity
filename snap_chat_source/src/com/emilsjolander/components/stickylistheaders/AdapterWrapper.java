// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            StickyListHeadersAdapter, WrapperView, CheckableWrapperView

class AdapterWrapper extends BaseAdapter
    implements StickyListHeadersAdapter
{
    public static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick$17e13fe2();
    }


    private final Context mContext;
    private DataSetObserver mDataSetObserver;
    final StickyListHeadersAdapter mDelegate;
    Drawable mDivider;
    int mDividerHeight;
    private final List mHeaderCache = new LinkedList();
    OnHeaderClickListener mOnHeaderClickListener;

    AdapterWrapper(Context context, StickyListHeadersAdapter stickylistheadersadapter)
    {
        mDataSetObserver = new DataSetObserver() {

            private AdapterWrapper this$0;

            public final void onChanged()
            {
                notifyDataSetChanged();
            }

            public final void onInvalidated()
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
            if (mHeaderCache.size() > 0)
            {
                view = (View)mHeaderCache.remove(0);
            } else
            {
                view = null;
            }
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

                private AdapterWrapper this$0;
                private int val$position;

                public final void onClick(View view1)
                {
                    if (mOnHeaderClickListener != null)
                    {
                        mDelegate.getHeaderId(position);
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

    private WrapperView getView$1ad34c65(final int position, View view)
    {
        Object obj;
        View view1;
        View view2;
        obj = null;
        boolean flag;
        if (view == null)
        {
            view = new WrapperView(mContext);
        } else
        {
            view = (WrapperView)view;
        }
        view2 = mDelegate.getView(position, ((WrapperView) (view)).mItem, view);
        if (position != 0 && mDelegate.getHeaderId(position) == mDelegate.getHeaderId(position - 1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = ((WrapperView) (view)).mHeader;
            if (obj != null)
            {
                mHeaderCache.add(obj);
            }
            view1 = null;
        } else
        {
            if (((WrapperView) (view)).mHeader == null)
            {
                if (mHeaderCache.size() > 0)
                {
                    obj = (View)mHeaderCache.remove(0);
                }
            } else
            {
                obj = ((WrapperView) (view)).mHeader;
            }
            view1 = mDelegate.getHeaderView(position, ((View) (obj)), view);
            if (view1 == null)
            {
                throw new NullPointerException("Header view must not be null.");
            }
            view1.setClickable(true);
            view1.setOnClickListener(new _cls2());
        }
        if (!(view2 instanceof Checkable) || (view instanceof CheckableWrapperView)) goto _L2; else goto _L1
_L1:
        obj = new CheckableWrapperView(mContext);
_L4:
        view = mDivider;
        position = mDividerHeight;
        if (view2 == null)
        {
            throw new NullPointerException("List view item must not be null.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = view;
        if (!(view2 instanceof Checkable))
        {
            obj = view;
            if (view instanceof CheckableWrapperView)
            {
                obj = new WrapperView(mContext);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((WrapperView) (obj)).mItem != view2)
        {
            ((WrapperView) (obj)).removeView(((WrapperView) (obj)).mItem);
            obj.mItem = view2;
            android.view.ViewParent viewparent = view2.getParent();
            if (viewparent != null && viewparent != obj && (viewparent instanceof ViewGroup))
            {
                ((ViewGroup)viewparent).removeView(view2);
            }
            ((WrapperView) (obj)).addView(view2);
        }
        if (((WrapperView) (obj)).mHeader != view1)
        {
            if (((WrapperView) (obj)).mHeader != null)
            {
                ((WrapperView) (obj)).removeView(((WrapperView) (obj)).mHeader);
            }
            obj.mHeader = view1;
            if (view1 != null)
            {
                ((WrapperView) (obj)).addView(view1);
            }
        }
        if (((WrapperView) (obj)).mDivider != view)
        {
            obj.mDivider = view;
            obj.mDividerHeight = position;
            ((WrapperView) (obj)).invalidate();
        }
        return ((WrapperView) (obj));
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
            mHeaderCache.add(wrapperview);
        }
    }

    private void setDivider(Drawable drawable)
    {
        mDivider = drawable;
    }

    private void setDividerHeight(int i)
    {
        mDividerHeight = i;
    }

    private void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
        mOnHeaderClickListener = onheaderclicklistener;
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

    public final long getHeaderId(int i)
    {
        return mDelegate.getHeaderId(i);
    }

    public final View getHeaderView(int i, View view, ViewGroup viewgroup)
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

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        View view1;
        View view2;
        viewgroup = null;
        boolean flag;
        if (view == null)
        {
            view = new WrapperView(mContext);
        } else
        {
            view = (WrapperView)view;
        }
        view2 = mDelegate.getView(position, ((WrapperView) (view)).mItem, view);
        if (position != 0 && mDelegate.getHeaderId(position) == mDelegate.getHeaderId(position - 1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewgroup = ((WrapperView) (view)).mHeader;
            if (viewgroup != null)
            {
                mHeaderCache.add(viewgroup);
            }
            view1 = null;
        } else
        {
            if (((WrapperView) (view)).mHeader == null)
            {
                if (mHeaderCache.size() > 0)
                {
                    viewgroup = (View)mHeaderCache.remove(0);
                }
            } else
            {
                viewgroup = ((WrapperView) (view)).mHeader;
            }
            view1 = mDelegate.getHeaderView(position, viewgroup, view);
            if (view1 == null)
            {
                throw new NullPointerException("Header view must not be null.");
            }
            view1.setClickable(true);
            view1.setOnClickListener(new _cls2());
        }
        if (!(view2 instanceof Checkable) || (view instanceof CheckableWrapperView)) goto _L2; else goto _L1
_L1:
        viewgroup = new CheckableWrapperView(mContext);
_L4:
        view = mDivider;
        position = mDividerHeight;
        if (view2 == null)
        {
            throw new NullPointerException("List view item must not be null.");
        }
        break; /* Loop/switch isn't completed */
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
        if (((WrapperView) (viewgroup)).mItem != view2)
        {
            viewgroup.removeView(((WrapperView) (viewgroup)).mItem);
            viewgroup.mItem = view2;
            android.view.ViewParent viewparent = view2.getParent();
            if (viewparent != null && viewparent != viewgroup && (viewparent instanceof ViewGroup))
            {
                ((ViewGroup)viewparent).removeView(view2);
            }
            viewgroup.addView(view2);
        }
        if (((WrapperView) (viewgroup)).mHeader != view1)
        {
            if (((WrapperView) (viewgroup)).mHeader != null)
            {
                viewgroup.removeView(((WrapperView) (viewgroup)).mHeader);
            }
            viewgroup.mHeader = view1;
            if (view1 != null)
            {
                viewgroup.addView(view1);
            }
        }
        if (((WrapperView) (viewgroup)).mDivider != view)
        {
            viewgroup.mDivider = view;
            viewgroup.mDividerHeight = position;
            viewgroup.invalidate();
        }
        return viewgroup;
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

    public String toString()
    {
        return mDelegate.toString();
    }




}
