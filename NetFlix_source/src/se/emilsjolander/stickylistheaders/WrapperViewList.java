// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            WrapperView

class WrapperViewList extends ListView
{
    static interface LifeCycleListener
    {

        public abstract void onDispatchDrawOccurred(Canvas canvas);
    }


    private boolean mClippingToPadding;
    private List mFooterViews;
    private LifeCycleListener mLifeCycleListener;
    private Field mSelectorPositionField;
    private Rect mSelectorRect;
    private int mTopClippingLength;

    public WrapperViewList(Context context)
    {
        super(context);
        mSelectorRect = new Rect();
        mClippingToPadding = true;
        try
        {
            context = android/widget/AbsListView.getDeclaredField("mSelectorRect");
            context.setAccessible(true);
            mSelectorRect = (Rect)context.get(this);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                mSelectorPositionField = android/widget/AbsListView.getDeclaredField("mSelectorPosition");
                mSelectorPositionField.setAccessible(true);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private int getSelectorPosition()
    {
        if (mSelectorPositionField == null)
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                if (getChildAt(i).getBottom() == mSelectorRect.bottom)
                {
                    return getFixedFirstVisibleItem() + i;
                }
            }

            break MISSING_BLOCK_LABEL_65;
        }
        int j = mSelectorPositionField.getInt(this);
        return j;
        Object obj;
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
_L2:
        return -1;
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void positionSelectorRect()
    {
        if (!mSelectorRect.isEmpty())
        {
            int i = getSelectorPosition();
            if (i >= 0)
            {
                Object obj = getChildAt(i - getFixedFirstVisibleItem());
                if (obj instanceof WrapperView)
                {
                    obj = (WrapperView)obj;
                    mSelectorRect.top = ((WrapperView) (obj)).getTop() + ((WrapperView) (obj)).mItemTop;
                }
            }
        }
    }

    public void addFooterView(View view)
    {
        super.addFooterView(view);
        if (mFooterViews == null)
        {
            mFooterViews = new ArrayList();
        }
        mFooterViews.add(view);
    }

    boolean containsFooterView(View view)
    {
        if (mFooterViews == null)
        {
            return false;
        } else
        {
            return mFooterViews.contains(view);
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        positionSelectorRect();
        if (mTopClippingLength != 0)
        {
            canvas.save();
            Rect rect = canvas.getClipBounds();
            rect.top = mTopClippingLength;
            canvas.clipRect(rect);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else
        {
            super.dispatchDraw(canvas);
        }
        mLifeCycleListener.onDispatchDrawOccurred(canvas);
    }

    int getFixedFirstVisibleItem()
    {
        int k = getFirstVisiblePosition();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return k;
        }
        int j = 0;
        do
        {
label0:
            {
                int i = k;
                if (j < getChildCount())
                {
                    if (getChildAt(j).getBottom() < 0)
                    {
                        break label0;
                    }
                    i = k + j;
                }
                j = i;
                if (!mClippingToPadding)
                {
                    j = i;
                    if (getPaddingTop() > 0)
                    {
                        j = i;
                        if (i > 0)
                        {
                            j = i;
                            if (getChildAt(0).getTop() > 0)
                            {
                                j = i - 1;
                            }
                        }
                    }
                }
                return j;
            }
            j++;
        } while (true);
    }

    public boolean performItemClick(View view, int i, long l)
    {
        View view1 = view;
        if (view instanceof WrapperView)
        {
            view1 = ((WrapperView)view).mItem;
        }
        return super.performItemClick(view1, i, l);
    }

    public boolean removeFooterView(View view)
    {
        if (super.removeFooterView(view))
        {
            mFooterViews.remove(view);
            return true;
        } else
        {
            return false;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        mClippingToPadding = flag;
        super.setClipToPadding(flag);
    }

    void setLifeCycleListener(LifeCycleListener lifecyclelistener)
    {
        mLifeCycleListener = lifecyclelistener;
    }

    void setTopClippingLength(int i)
    {
        mTopClippingLength = i;
    }
}
