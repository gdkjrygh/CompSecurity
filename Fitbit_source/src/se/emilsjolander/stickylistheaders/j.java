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
//            i

class j extends ListView
{
    static interface a
    {

        public abstract void a(Canvas canvas);
    }


    private a a;
    private List b;
    private int c;
    private Rect d;
    private Field e;
    private boolean f;
    private boolean g;

    public j(Context context)
    {
        super(context);
        d = new Rect();
        f = true;
        g = false;
        try
        {
            context = android/widget/AbsListView.getDeclaredField("mSelectorRect");
            context.setAccessible(true);
            d = (Rect)context.get(this);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                e = android/widget/AbsListView.getDeclaredField("mSelectorPosition");
                e.setAccessible(true);
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

    private void b()
    {
        if (!d.isEmpty())
        {
            int k = c();
            if (k >= 0)
            {
                Object obj = getChildAt(k - a());
                if (obj instanceof i)
                {
                    obj = (i)obj;
                    Rect rect = d;
                    int l = ((i) (obj)).getTop();
                    rect.top = ((i) (obj)).e + l;
                }
            }
        }
    }

    private void b(View view)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(view);
    }

    private int c()
    {
        if (e == null)
        {
            for (int k = 0; k < getChildCount(); k++)
            {
                if (getChildAt(k).getBottom() == d.bottom)
                {
                    return k + a();
                }
            }

            break MISSING_BLOCK_LABEL_65;
        }
        int l = e.getInt(this);
        return l;
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

    int a()
    {
        int k;
        int l;
        l = getFirstVisiblePosition();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return l;
        }
        k = 0;
_L3:
        if (k >= getChildCount())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (getChildAt(k).getBottom() < 0) goto _L2; else goto _L1
_L1:
        k += l;
_L4:
        l = k;
        if (!f)
        {
            l = k;
            if (getPaddingTop() > 0)
            {
                l = k;
                if (k > 0)
                {
                    l = k;
                    if (getChildAt(0).getTop() > 0)
                    {
                        l = k - 1;
                    }
                }
            }
        }
        return l;
_L2:
        k++;
          goto _L3
        k = l;
          goto _L4
    }

    void a(int k)
    {
        c = k;
    }

    void a(a a1)
    {
        a = a1;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    boolean a(View view)
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.contains(view);
        }
    }

    public void addFooterView(View view)
    {
        super.addFooterView(view);
        b(view);
    }

    public void addFooterView(View view, Object obj, boolean flag)
    {
        super.addFooterView(view, obj, flag);
        b(view);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        b();
        if (c != 0)
        {
            canvas.save();
            Rect rect = canvas.getClipBounds();
            rect.top = c;
            canvas.clipRect(rect);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else
        {
            super.dispatchDraw(canvas);
        }
        a.a(canvas);
    }

    protected void layoutChildren()
    {
        if (!g)
        {
            super.layoutChildren();
        }
    }

    public boolean performItemClick(View view, int k, long l)
    {
        View view1 = view;
        if (view instanceof i)
        {
            view1 = ((i)view).a;
        }
        return super.performItemClick(view1, k, l);
    }

    public boolean removeFooterView(View view)
    {
        if (super.removeFooterView(view))
        {
            b.remove(view);
            return true;
        } else
        {
            return false;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        f = flag;
        super.setClipToPadding(flag);
    }
}
