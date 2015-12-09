// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class GridViewWithHeaderAndFooter extends GridView
{

    public static boolean DEBUG = false;
    private static final String LOG_TAG = "GridViewHeaderAndFooter";
    private ArrayList mFooterViewInfos;
    private ArrayList mHeaderViewInfos;
    private d mItemClickHandler;
    private int mNumColumns;
    private android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private android.widget.AdapterView.OnItemLongClickListener mOnItemLongClickListener;
    private ListAdapter mOriginalAdapter;
    private int mRowHeight;
    private View mViewForMeasureRowHeight;

    public GridViewWithHeaderAndFooter(Context context)
    {
        super(context);
        mNumColumns = -1;
        mViewForMeasureRowHeight = null;
        mRowHeight = -1;
        mHeaderViewInfos = new ArrayList();
        mFooterViewInfos = new ArrayList();
        initHeaderGridView();
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mNumColumns = -1;
        mViewForMeasureRowHeight = null;
        mRowHeight = -1;
        mHeaderViewInfos = new ArrayList();
        mFooterViewInfos = new ArrayList();
        initHeaderGridView();
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mNumColumns = -1;
        mViewForMeasureRowHeight = null;
        mRowHeight = -1;
        mHeaderViewInfos = new ArrayList();
        mFooterViewInfos = new ArrayList();
        initHeaderGridView();
    }

    private int getColumnWidthCompatible()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return super.getColumnWidth();
        }
        int i;
        try
        {
            Field field = android/widget/GridView.getDeclaredField("mColumnWidth");
            field.setAccessible(true);
            i = field.getInt(this);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        return i;
    }

    private d getItemClickHandler()
    {
    /* block-local class not found */
    class d {}

        if (mItemClickHandler == null)
        {
            mItemClickHandler = new d(null);
        }
        return mItemClickHandler;
    }

    private int getNumColumnsCompatible()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return super.getNumColumns();
        }
        int i;
        try
        {
            Field field = android/widget/GridView.getDeclaredField("mNumColumns");
            field.setAccessible(true);
            i = field.getInt(this);
        }
        catch (Exception exception)
        {
            if (mNumColumns != -1)
            {
                return mNumColumns;
            } else
            {
                throw new RuntimeException("Can not determine the mNumColumns for this API platform, please call setNumColumns to set it.");
            }
        }
        return i;
    }

    private void initHeaderGridView()
    {
    }

    private void removeFixedViewInfo(View view, ArrayList arraylist)
    {
        int j = arraylist.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
    /* block-local class not found */
    class a {}

                    if (((a)arraylist.get(i)).a != view)
                    {
                        break label0;
                    }
                    arraylist.remove(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void addFooterView(View view)
    {
        addFooterView(view, null, true);
    }

    public void addFooterView(View view, Object obj, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
    /* block-local class not found */
    class c {}

        if (listadapter != null && !(listadapter instanceof c))
        {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        a a1 = new a(null);
    /* block-local class not found */
    class b {}

        b b1 = new b(getContext());
        if (layoutparams != null)
        {
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height));
            b1.setLayoutParams(new android.widget.AbsListView.LayoutParams(layoutparams.width, layoutparams.height));
        }
        b1.addView(view);
        a1.a = view;
        a1.b = b1;
        a1.c = obj;
        a1.d = flag;
        mFooterViewInfos.add(a1);
        if (listadapter != null)
        {
            ((c)listadapter).c();
        }
    }

    public void addHeaderView(View view)
    {
        addHeaderView(view, null, true);
    }

    public void addHeaderView(View view, Object obj, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !(listadapter instanceof c))
        {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        a a1 = new a(null);
        b b1 = new b(getContext());
        if (layoutparams != null)
        {
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height));
            b1.setLayoutParams(new android.widget.AbsListView.LayoutParams(layoutparams.width, layoutparams.height));
        }
        b1.addView(view);
        a1.a = view;
        a1.b = b1;
        a1.c = obj;
        a1.d = flag;
        mHeaderViewInfos.add(a1);
        if (listadapter != null)
        {
            ((c)listadapter).c();
        }
    }

    public int getFooterViewCount()
    {
        return mFooterViewInfos.size();
    }

    public int getHeaderHeight(int i)
    {
        if (i >= 0)
        {
            return ((a)mHeaderViewInfos.get(i)).a.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    public int getHeaderViewCount()
    {
        return mHeaderViewInfos.size();
    }

    public int getHorizontalSpacing()
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                Field field = android/widget/GridView.getDeclaredField("mHorizontalSpacing");
                field.setAccessible(true);
                return field.getInt(this);
            }
            i = super.getHorizontalSpacing();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    public ListAdapter getOriginalAdapter()
    {
        return mOriginalAdapter;
    }

    public int getRowHeight()
    {
        if (mRowHeight > 0)
        {
            return mRowHeight;
        }
        Object obj = getAdapter();
        int j = getNumColumnsCompatible();
        if (obj == null || ((ListAdapter) (obj)).getCount() <= (mHeaderViewInfos.size() + mFooterViewInfos.size()) * j)
        {
            return -1;
        }
        int i = getColumnWidthCompatible();
        View view = getAdapter().getView(j * mHeaderViewInfos.size(), mViewForMeasureRowHeight, this);
        android.widget.AbsListView.LayoutParams layoutparams = (android.widget.AbsListView.LayoutParams)view.getLayoutParams();
        obj = layoutparams;
        if (layoutparams == null)
        {
            obj = new android.widget.AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        j = getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, ((android.widget.AbsListView.LayoutParams) (obj)).height);
        view.measure(getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), 0, ((android.widget.AbsListView.LayoutParams) (obj)).width), j);
        mViewForMeasureRowHeight = view;
        mRowHeight = view.getMeasuredHeight();
        return mRowHeight;
    }

    public int getVerticalSpacing()
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                Field field = android/widget/GridView.getDeclaredField("mVerticalSpacing");
                field.setAccessible(true);
                return field.getInt(this);
            }
            i = super.getVerticalSpacing();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    public void invalidateRowHeight()
    {
        mRowHeight = -1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mViewForMeasureRowHeight = null;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof c))
        {
            ((c)listadapter).a(getNumColumnsCompatible());
            ((c)listadapter).b(getRowHeight());
        }
    }

    public boolean removeFooterView(View view)
    {
        if (mFooterViewInfos.size() > 0)
        {
            ListAdapter listadapter = getAdapter();
            boolean flag;
            if (listadapter != null && ((c)listadapter).b(view))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            removeFixedViewInfo(view, mFooterViewInfos);
            return flag;
        } else
        {
            return false;
        }
    }

    public boolean removeHeaderView(View view)
    {
        if (mHeaderViewInfos.size() > 0)
        {
            ListAdapter listadapter = getAdapter();
            boolean flag;
            if (listadapter != null && ((c)listadapter).a(view))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            removeFixedViewInfo(view, mHeaderViewInfos);
            return flag;
        } else
        {
            return false;
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        mOriginalAdapter = listadapter;
        if (mHeaderViewInfos.size() > 0 || mFooterViewInfos.size() > 0)
        {
            listadapter = new c(mHeaderViewInfos, mFooterViewInfos, listadapter);
            int i = getNumColumnsCompatible();
            if (i > 1)
            {
                listadapter.a(i);
            }
            listadapter.b(getRowHeight());
            super.setAdapter(listadapter);
            return;
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setClipChildren(boolean flag)
    {
    }

    public void setClipChildrenSupper(boolean flag)
    {
        super.setClipChildren(false);
    }

    public void setNumColumns(int i)
    {
        super.setNumColumns(i);
        mNumColumns = i;
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof c))
        {
            ((c)listadapter).a(i);
        }
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mOnItemClickListener = onitemclicklistener;
        super.setOnItemClickListener(getItemClickHandler());
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        mOnItemLongClickListener = onitemlongclicklistener;
        super.setOnItemLongClickListener(getItemClickHandler());
    }

    public void tryToScrollToBottomSmoothly()
    {
        int i = getAdapter().getCount() - 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            smoothScrollToPositionFromTop(i, 0);
            return;
        } else
        {
            setSelection(i);
            return;
        }
    }

    public void tryToScrollToBottomSmoothly(int i)
    {
        int j = getAdapter().getCount() - 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            smoothScrollToPositionFromTop(j, 0, i);
            return;
        } else
        {
            setSelection(j);
            return;
        }
    }

    static 
    {
        DEBUG = false;
    }



}
