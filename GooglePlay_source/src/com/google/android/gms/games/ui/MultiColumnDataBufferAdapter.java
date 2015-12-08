// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.Stack;

// Referenced classes of package com.google.android.gms.games.ui:
//            DataBufferAdapter

public abstract class MultiColumnDataBufferAdapter extends DataBufferAdapter
{
    private static final class EmptyView extends View
    {

        public EmptyView(Context context)
        {
            super(context);
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
        }
    }


    private int mInterTileMargin;
    private final boolean mIsStretchable;
    private final int mMaxNumRows;
    private final int mNumColumns;
    private int mPaddingLeft;
    private int mPaddingRight;
    private Stack mRecycledEmptyViews;
    private Stack mRecycledViews;

    public MultiColumnDataBufferAdapter(Context context, int i)
    {
        this(context, 0x7f0e0013, (byte)0);
    }

    private MultiColumnDataBufferAdapter(Context context, int i, byte byte0)
    {
        this(context, i, 0);
    }

    private MultiColumnDataBufferAdapter(Context context, int i, int j)
    {
        super(context);
        mRecycledViews = new Stack();
        mRecycledEmptyViews = new Stack();
        context = context.getResources();
        j = -1;
        int k = context.getInteger(i);
        i = k;
_L1:
        android.content.res.Resources.NotFoundException notfoundexception;
        if (i <= 0)
        {
            throw new IllegalArgumentException("numColumns must be at least 1.");
        } else
        {
            mNumColumns = i;
            mMaxNumRows = -1;
            i = context.getDimensionPixelSize(0x7f0c0221);
            mPaddingRight = i;
            mPaddingLeft = i;
            mInterTileMargin = context.getDimensionPixelSize(0x7f0c0220);
            mIsStretchable = false;
            return;
        }
        notfoundexception;
        GamesLog.w("MultiColDBufferAdapter", (new StringBuilder("Unable to find resource: ")).append(i).toString(), notfoundexception);
        i = j;
          goto _L1
    }

    public abstract void bindTileView$4098fe8c(View view, int i, Object obj);

    public final void bindView$675318ec(View view, Object obj)
    {
    }

    public final int getElementCount()
    {
        int i;
        if (mDataBuffer == null)
        {
            i = 0;
        } else
        {
            int j = ((super.getElementCount() + mNumColumns) - 1) / mNumColumns;
            i = j;
            if (mMaxNumRows > 0)
            {
                return Math.min(mMaxNumRows, j);
            }
        }
        return i;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    protected final View getViewForElement(int i, View view, ViewGroup viewgroup)
    {
        int j;
        int l;
        int i1;
        if (view == null)
        {
            viewgroup = new LinearLayout(mContext);
            viewgroup.setClickable(true);
            viewgroup.setFocusable(false);
            UiUtils.hideViewFromAccessibilityServices(viewgroup);
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            viewgroup.setOrientation(0);
            viewgroup.setPadding(mPaddingLeft, viewgroup.getPaddingTop(), mPaddingRight, viewgroup.getPaddingBottom());
        } else
        {
            viewgroup = (LinearLayout)view;
        }
        if (i > 0)
        {
            viewgroup.setPadding(viewgroup.getPaddingLeft(), mInterTileMargin, viewgroup.getPaddingRight(), viewgroup.getPaddingBottom());
        }
        l = mNumColumns;
        i1 = mDataBuffer.getCount();
        j = 0;
        do
        {
            if (j < mNumColumns)
            {
                Object obj = viewgroup.getChildAt(j);
                int j1 = i * l + j;
                boolean flag;
                if (j1 >= i1 || j1 < 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    if (!(obj instanceof EmptyView))
                    {
                        if (obj != null)
                        {
                            mRecycledViews.push(obj);
                            viewgroup.removeViewAt(j);
                        }
                        if (!mRecycledEmptyViews.empty())
                        {
                            view = (View)mRecycledEmptyViews.pop();
                        } else
                        {
                            view = new EmptyView(mContext);
                        }
                        viewgroup.addView(view, j);
                    } else
                    {
                        view = ((View) (obj));
                    }
                } else
                {
                    Object obj1 = mDataBuffer.get(j1);
                    if (obj instanceof EmptyView)
                    {
                        mRecycledEmptyViews.push((EmptyView)obj);
                        viewgroup.removeViewAt(j);
                        if (!mRecycledViews.empty())
                        {
                            view = (View)mRecycledViews.pop();
                        } else
                        {
                            view = newTileView$70777715();
                            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
                        }
                        viewgroup.addView(view, j);
                    } else
                    {
                        view = ((View) (obj));
                        if (obj == null)
                        {
                            view = newTileView$70777715();
                            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
                            viewgroup.addView(view, j);
                        }
                    }
                    bindTileView$4098fe8c(view, j1, obj1);
                }
                obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                if (j == 0)
                {
                    obj.leftMargin = 0;
                    obj.rightMargin = mInterTileMargin;
                } else
                if (j == mNumColumns - 1)
                {
                    obj.leftMargin = mInterTileMargin;
                    obj.rightMargin = 0;
                } else
                {
                    int k = mInterTileMargin;
                    obj.rightMargin = k;
                    obj.leftMargin = k;
                }
                view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                j++;
                continue;
            }
            return viewgroup;
        } while (true);
    }

    public abstract View newTileView$70777715();

    public final View newView$6591d710(Context context, ViewGroup viewgroup)
    {
        return null;
    }
}
