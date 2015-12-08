// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.lucasr.twowayview.TwoWayLayoutManager;

public class enn extends TwoWayLayoutManager
{

    public final enk a;
    public int b;
    private final Rect c = new Rect();
    private final eno d;
    private final enu e;

    public enn(Context context, enk enk1, eno eno1)
    {
        super(org.lucasr.twowayview.TwoWayLayoutManager.Orientation.VERTICAL);
        a = enk1;
        d = eno1;
        e = (enu)olm.a(context, enu);
    }

    private void a(View view, float f, float f1)
    {
        if (view.getWidth() != view.getMeasuredWidth() && f == (float)view.getLeft() && f1 == (float)view.getTop() && Math.abs(view.getTranslationX()) < 0.001F && Math.abs(view.getTranslationY()) < 0.001F)
        {
            eno eno1 = d;
            if (eno1.f != null)
            {
                eno1.f.a(view);
            }
        }
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

    public int getDecoratedBottom(View view)
    {
        int j = super.getDecoratedBottom(view);
        int i;
        if (view == e.b)
        {
            i = Math.round(view.getTranslationY());
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public int getDecoratedTop(View view)
    {
        int j = super.getDecoratedTop(view);
        int i;
        if (view == e.b)
        {
            i = Math.round(view.getTranslationY());
        } else
        {
            i = 0;
        }
        return i + j;
    }

    protected void layoutChild(View view, org.lucasr.twowayview.TwoWayLayoutManager.Direction direction)
    {
        boolean flag = false;
        int k = 1;
        int i;
        int i1;
        if (getLayoutDirection() == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i1 = getPosition(view);
        if (i1 >= getAdapter().a())
        {
            return;
        }
        a.a(i1, c);
        int l = getPaddingLeft() + c.left;
        int j = l;
        if (i != 0)
        {
            j = getWidth() - getPaddingRight() - l - view.getMeasuredWidth();
        }
        view.setTag(b.mh, new Point(view.getWidth(), view.getHeight()));
        if (i1 == getPendingScrollPosition())
        {
            i = getPendingScrollOffset() + getStartWithPadding();
            a(view, j, i);
            view.layout(j, i, view.getMeasuredWidth() + j, view.getMeasuredHeight() + i);
            return;
        }
        if (direction == org.lucasr.twowayview.TwoWayLayoutManager.Direction.END)
        {
            direction = findViewByPosition(i1 - 1);
            if (direction == null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    flag = view.isLaidOut();
                } else
                if (view.getTop() != 0 || view.getBottom() != 0)
                {
                    flag = true;
                }
                if (flag)
                {
                    i = view.getTop();
                } else
                {
                    i = getStartWithPadding();
                }
            } else
            {
                k = direction.getTop();
                i = k;
                if (c.left == 0)
                {
                    i = k + (direction.getMeasuredHeight() + b);
                }
            }
            view.layout(j, i, view.getMeasuredWidth() + j, view.getMeasuredHeight() + i);
            return;
        }
        direction = findViewByPosition(i1 + 1);
        if (i != 0)
        {
            if (direction.getRight() == getWidth() - getPaddingRight())
            {
                i = k;
            } else
            {
                i = 0;
            }
        } else
        {
            i = k;
            if (direction.getLeft() != getPaddingLeft())
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            i = direction.getTop() - b;
        } else
        {
            i = direction.getTop() + direction.getMeasuredHeight();
        }
        a(view, j, i - view.getMeasuredHeight());
        view.layout(j, i - view.getMeasuredHeight(), view.getMeasuredWidth() + j, i);
    }

    protected void measureChild(View view, org.lucasr.twowayview.TwoWayLayoutManager.Direction direction)
    {
        int i = getPosition(view);
        if (i >= getAdapter().a())
        {
            return;
        }
        a.a(i, c);
        int j = android.view.View.MeasureSpec.makeMeasureSpec(c.width(), 0x40000000);
        if (c.height() == -1)
        {
            i = 0;
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(c.height(), 0x40000000);
        }
        view.measure(j, i);
    }

    public void onLayoutChildren(afe afe, afl afl)
    {
        enk enk1 = a;
        int i = getWidth() - getPaddingLeft() - getPaddingRight();
        if (enk1.g != i)
        {
            enk1.g = i;
            enk1.e = Math.round((float)i * 0.36F);
            enk1.b = Math.round(((float)i * 0.48F) / enk1.a);
            enk1.d = Math.round((float)enk1.b / 1.3F);
            enk1.c = Math.round((float)enk1.b / 0.5F);
            enk1.b();
        }
        super.onLayoutChildren(afe, afl);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return false;
    }
}
