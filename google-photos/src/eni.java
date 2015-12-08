// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import org.lucasr.twowayview.TwoWayLayoutManager;

public class eni extends TwoWayLayoutManager
{

    public final enj a;
    public int b;
    private final Rect c = new Rect();

    public eni(enj enj1)
    {
        super(org.lucasr.twowayview.TwoWayLayoutManager.Orientation.VERTICAL);
        a = enj1;
    }

    protected boolean canAddMoreViews(org.lucasr.twowayview.TwoWayLayoutManager.Direction direction, int i)
    {
        boolean flag;
        if (getLayoutDirection() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (direction != org.lucasr.twowayview.TwoWayLayoutManager.Direction.START) goto _L2; else goto _L1
_L1:
        direction = getChildAt(0);
        if (direction == null || direction.getTop() <= i && (!flag || direction.getLeft() + direction.getWidth() >= getWidth() - getPaddingRight()) && (flag || direction.getLeft() <= 0)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        direction = getChildAt(getChildCount() - 1);
        if (direction == null || direction.getTop() + direction.getHeight() >= i && (!flag || direction.getLeft() <= 0) && (flag || direction.getLeft() + direction.getWidth() >= getWidth() - getPaddingRight()))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected void layoutChild(View view, org.lucasr.twowayview.TwoWayLayoutManager.Direction direction)
    {
        boolean flag = true;
        boolean flag1 = false;
        int i;
        int l;
        if (getLayoutDirection() == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = getPosition(view);
        if (l >= getAdapter().a())
        {
            return;
        }
        boolean flag2 = a.a(l);
        if (flag2)
        {
            a.a(l, c);
        }
        int k = getPaddingLeft();
        int j;
        if (flag2)
        {
            j = c.left;
        } else
        {
            j = 0;
        }
        k = j + k;
        j = k;
        if (i != 0)
        {
            j = a.d - getPaddingRight() - k - view.getMeasuredWidth();
        }
        k = view.getMeasuredWidth() + j;
        if (l == getPendingScrollPosition())
        {
            i = getPendingScrollOffset() + getStartWithPadding();
            view.layout(j, i, k, view.getMeasuredHeight() + i);
            return;
        }
        if (direction == org.lucasr.twowayview.TwoWayLayoutManager.Direction.END)
        {
            direction = findViewByPosition(l - 1);
            if (direction == null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    flag1 = view.isLaidOut();
                } else
                if (view.getTop() != 0 || view.getBottom() != 0)
                {
                    flag1 = true;
                }
                if (flag1)
                {
                    i = view.getTop();
                } else
                {
                    i = getStartWithPadding();
                }
            } else
            if (!flag2 || c.left == 0)
            {
                i = direction.getTop();
                i = direction.getMeasuredHeight() + i + b;
            } else
            {
                i = direction.getTop();
            }
            view.layout(j, i, k, view.getMeasuredHeight() + i);
            return;
        }
        direction = findViewByPosition(l + 1);
        if (i != 0)
        {
            if (direction.getRight() == a.d - getPaddingRight())
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
        } else
        {
            i = ((flag) ? 1 : 0);
            if (direction.getLeft() != getPaddingLeft())
            {
                i = 0;
            }
        }
        if (!flag2 || i != 0)
        {
            i = direction.getTop() - b;
        } else
        {
            i = direction.getTop() + direction.getMeasuredHeight();
        }
        view.layout(j, i - view.getMeasuredHeight(), k, i);
    }

    protected void measureChild(View view, org.lucasr.twowayview.TwoWayLayoutManager.Direction direction)
    {
        int i = getPosition(view);
        if (i >= getAdapter().a())
        {
            return;
        }
        int j;
        if (a.a(i))
        {
            a.a(i, c);
            j = android.view.View.MeasureSpec.makeMeasureSpec(c.width(), 0x40000000);
            i = android.view.View.MeasureSpec.makeMeasureSpec(c.height(), 0x40000000);
        } else
        {
            j = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
            if (view.getLayoutParams().height > 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 0x40000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        view.measure(j, i);
    }

    public void onLayoutChildren(afe afe, afl afl)
    {
        enj enj1 = a;
        int i = getWidth() - getPaddingLeft() - getPaddingRight();
        int j = getHeight();
        if (enj1.d != i)
        {
            enj1.d = i;
            enj1.f = Math.max(2.1F, (float)i / (float)enj1.a);
            enj1.e = (int)Math.max(enj1.a, Math.min(enj1.b, (float)j * 0.9F));
            enj1.b();
        }
        super.onLayoutChildren(afe, afl);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return false;
    }
}
