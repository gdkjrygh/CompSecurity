// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapter, StickyGridHeadersGridView

public class StickyGridHeadersBaseAdapterWrapper extends BaseAdapter
{
    protected class FillerView extends View
    {

        private View mMeasureTarget;
        final StickyGridHeadersBaseAdapterWrapper this$0;

        protected void onMeasure(int i, int j)
        {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(mMeasureTarget.getMeasuredHeight(), 0x40000000));
        }

        public void setMeasureTarget(View view)
        {
            mMeasureTarget = view;
        }

        public FillerView(Context context)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context);
        }

        public FillerView(Context context, AttributeSet attributeset)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context, attributeset);
        }

        public FillerView(Context context, AttributeSet attributeset, int i)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context, attributeset, i);
        }
    }

    protected class HeaderFillerView extends FrameLayout
    {

        private int mHeaderId;
        final StickyGridHeadersBaseAdapterWrapper this$0;

        protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
        {
            return generateDefaultLayoutParams();
        }

        protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
        {
            return new android.widget.FrameLayout.LayoutParams(-1, -1);
        }

        public int getHeaderId()
        {
            return mHeaderId;
        }

        protected void onMeasure(int i, int j)
        {
            View view = (View)getTag();
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            Object obj = layoutparams;
            if (layoutparams == null)
            {
                obj = generateDefaultLayoutParams();
                view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
            if (view.getVisibility() != 8)
            {
                j = getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, ((android.view.ViewGroup.LayoutParams) (obj)).height);
                view.measure(getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(mGridView.getWidth(), 0x40000000), 0, ((android.view.ViewGroup.LayoutParams) (obj)).width), j);
            }
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), view.getMeasuredHeight());
        }

        public void setHeaderId(int i)
        {
            mHeaderId = i;
        }

        public HeaderFillerView(Context context)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context);
        }

        public HeaderFillerView(Context context, AttributeSet attributeset)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context, attributeset);
        }

        public HeaderFillerView(Context context, AttributeSet attributeset, int i)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super(context, attributeset, i);
        }
    }

    protected class HeaderHolder
    {

        protected View mHeaderView;
        final StickyGridHeadersBaseAdapterWrapper this$0;

        protected HeaderHolder()
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super();
        }
    }

    protected class Position
    {

        protected int mHeader;
        protected int mPosition;
        final StickyGridHeadersBaseAdapterWrapper this$0;

        protected Position(int i, int j)
        {
            this$0 = StickyGridHeadersBaseAdapterWrapper.this;
            super();
            mPosition = i;
            mHeader = j;
        }
    }


    protected static final int ID_FILLER = -2;
    protected static final int ID_HEADER = -1;
    protected static final int ID_HEADER_FILLER = -3;
    protected static final int POSITION_FILLER = -1;
    protected static final int POSITION_HEADER = -2;
    protected static final int POSITION_HEADER_FILLER = -3;
    protected static final int VIEW_TYPE_FILLER = 0;
    protected static final int VIEW_TYPE_HEADER = 1;
    protected static final int VIEW_TYPE_HEADER_FILLER = 2;
    private static final int sNumViewTypes = 3;
    private final Context mContext;
    private int mCount;
    private boolean mCounted;
    private final DataSetObserver mDataSetObserver = new DataSetObserver() {

        final StickyGridHeadersBaseAdapterWrapper this$0;

        public void onChanged()
        {
            updateCount();
            notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            mCounted = false;
            notifyDataSetInvalidated();
        }

            
            {
                this$0 = StickyGridHeadersBaseAdapterWrapper.this;
                super();
            }
    };
    private final StickyGridHeadersBaseAdapter mDelegate;
    private final StickyGridHeadersGridView mGridView;
    private View mLastHeaderViewSeen;
    private View mLastViewSeen;
    private int mNumColumns;

    public StickyGridHeadersBaseAdapterWrapper(Context context, StickyGridHeadersGridView stickygridheadersgridview, StickyGridHeadersBaseAdapter stickygridheadersbaseadapter)
    {
        mCounted = false;
        mNumColumns = 1;
        mContext = context;
        mDelegate = stickygridheadersbaseadapter;
        mGridView = stickygridheadersgridview;
        stickygridheadersbaseadapter.registerDataSetObserver(mDataSetObserver);
    }

    private FillerView getFillerView(View view, ViewGroup viewgroup, View view1)
    {
label0:
        {
            if (view != null)
            {
                viewgroup = view;
                if (view instanceof FillerView)
                {
                    break label0;
                }
            }
            viewgroup = new FillerView(mContext);
        }
        view = (FillerView)viewgroup;
        view.setMeasureTarget(view1);
        return view;
    }

    private HeaderFillerView getHeaderFillerView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            if (view != null)
            {
                viewgroup = view;
                if (view instanceof HeaderFillerView)
                {
                    break label0;
                }
            }
            viewgroup = new HeaderFillerView(mContext);
        }
        return (HeaderFillerView)viewgroup;
    }

    private int unFilledSpacesInHeaderGroup(int i)
    {
        i = mDelegate.getCountForHeader(i) % mNumColumns;
        if (i == 0)
        {
            return 0;
        } else
        {
            return mNumColumns - i;
        }
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        if (mCounted)
        {
            return mCount;
        }
        mCount = 0;
        int j = mDelegate.getNumHeaders();
        if (j == 0)
        {
            mCount = mDelegate.getCount();
            mCounted = true;
            return mCount;
        }
        for (int i = 0; i < j; i++)
        {
            mCount = mCount + (mDelegate.getCountForHeader(i) + unFilledSpacesInHeaderGroup(i) + mNumColumns);
        }

        mCounted = true;
        return mCount;
    }

    protected long getHeaderId(int i)
    {
        return (long)translatePosition(i).mHeader;
    }

    protected View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        if (mDelegate.getNumHeaders() == 0)
        {
            return null;
        } else
        {
            return mDelegate.getHeaderView(translatePosition(i).mHeader, view, viewgroup);
        }
    }

    public Object getItem(int i)
        throws ArrayIndexOutOfBoundsException
    {
        Position position = translatePosition(i);
        if (position.mPosition == -1 || position.mPosition == -2)
        {
            return null;
        } else
        {
            return mDelegate.getItem(position.mPosition);
        }
    }

    public long getItemId(int i)
    {
        Position position = translatePosition(i);
        if (position.mPosition == -2)
        {
            return -1L;
        }
        if (position.mPosition == -1)
        {
            return -2L;
        }
        if (position.mPosition == -3)
        {
            return -3L;
        } else
        {
            return mDelegate.getItemId(position.mPosition);
        }
    }

    public int getItemViewType(int i)
    {
        Position position = translatePosition(i);
        if (position.mPosition == -2)
        {
            i = 1;
        } else
        {
            if (position.mPosition == -1)
            {
                return 0;
            }
            if (position.mPosition == -3)
            {
                return 2;
            }
            int j = mDelegate.getItemViewType(position.mPosition);
            i = j;
            if (j != -1)
            {
                return j + 3;
            }
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Position position = translatePosition(i);
        if (position.mPosition == -2)
        {
            view = getHeaderFillerView(position.mHeader, view, viewgroup);
            viewgroup = mDelegate.getHeaderView(position.mHeader, (View)view.getTag(), viewgroup);
            mGridView.detachHeader((View)view.getTag());
            view.setTag(viewgroup);
            mGridView.attachHeader(viewgroup);
            mLastHeaderViewSeen = view;
            view.forceLayout();
            return view;
        }
        if (position.mPosition == -3)
        {
            view = getFillerView(view, viewgroup, mLastHeaderViewSeen);
            view.forceLayout();
            return view;
        }
        if (position.mPosition == -1)
        {
            view = getFillerView(view, viewgroup, mLastViewSeen);
            view.forceLayout();
            return view;
        } else
        {
            view = mDelegate.getView(position.mPosition, view, viewgroup);
            mLastViewSeen = view;
            return view;
        }
    }

    public int getViewTypeCount()
    {
        return mDelegate.getViewTypeCount() + 3;
    }

    public StickyGridHeadersBaseAdapter getWrappedAdapter()
    {
        return mDelegate;
    }

    public boolean hasStableIds()
    {
        return mDelegate.hasStableIds();
    }

    public boolean isEmpty()
    {
        return mDelegate.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        Position position = translatePosition(i);
        if (position.mPosition == -1 || position.mPosition == -2)
        {
            return false;
        } else
        {
            return mDelegate.isEnabled(position.mPosition);
        }
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        mDelegate.registerDataSetObserver(datasetobserver);
    }

    public void setNumColumns(int i)
    {
        mNumColumns = i;
        mCounted = false;
    }

    protected Position translatePosition(int i)
    {
        int i1 = mDelegate.getNumHeaders();
        if (i1 == 0)
        {
            if (i >= mDelegate.getCount())
            {
                return new Position(-1, 0);
            } else
            {
                return new Position(i, 0);
            }
        }
        int j = i;
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            int l = mDelegate.getCountForHeader(i);
            if (k == 0)
            {
                return new Position(-2, i);
            }
            k -= mNumColumns;
            if (k < 0)
            {
                return new Position(-3, i);
            }
            j -= mNumColumns;
            if (k < l)
            {
                return new Position(j, i);
            }
            int j1 = unFilledSpacesInHeaderGroup(i);
            j -= j1;
            k -= l + j1;
            if (k < 0)
            {
                return new Position(-1, i);
            }
        }

        return new Position(-1, i);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        mDelegate.unregisterDataSetObserver(datasetobserver);
    }

    protected void updateCount()
    {
        mCount = 0;
        int j = mDelegate.getNumHeaders();
        if (j == 0)
        {
            mCount = mDelegate.getCount();
            mCounted = true;
            return;
        }
        for (int i = 0; i < j; i++)
        {
            mCount = mCount + (mDelegate.getCountForHeader(i) + mNumColumns);
        }

        mCounted = true;
    }


/*
    static boolean access$002(StickyGridHeadersBaseAdapterWrapper stickygridheadersbaseadapterwrapper, boolean flag)
    {
        stickygridheadersbaseadapterwrapper.mCounted = flag;
        return flag;
    }

*/

}
