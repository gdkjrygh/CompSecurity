// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import vt;

public class ListViewCompat extends ListView
{

    public Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Field g;
    private vt h;

    public ListViewCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        try
        {
            g = android/widget/AbsListView.getDeclaredField("mIsChildViewEnabled");
            g.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public final int a(int i, int j)
    {
        Object obj;
        ListAdapter listadapter;
        int k;
        int l;
        int i1;
        k = getListPaddingTop();
        i1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        l = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        k += i1;
_L4:
        return k;
_L2:
        k = i1 + k;
        int j1;
        int l1;
        if (l <= 0 || obj == null)
        {
            l = 0;
        }
        l1 = listadapter.getCount();
        i1 = 0;
        j1 = 0;
        obj = null;
        do
        {
label0:
            {
                if (i1 >= l1)
                {
                    break label0;
                }
                int k1 = listadapter.getItemViewType(i1);
                if (k1 != j1)
                {
                    j1 = k1;
                    obj = null;
                }
                View view = listadapter.getView(i1, ((View) (obj)), this);
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                obj = layoutparams;
                if (layoutparams == null)
                {
                    obj = generateDefaultLayoutParams();
                    view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                }
                if (((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
                } else
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, k1);
                view.forceLayout();
                if (i1 > 0)
                {
                    k += l;
                }
                k1 = view.getMeasuredHeight() + k;
                k = j;
                if (k1 >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
                k = k1;
                obj = view;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return k;
    }

    public final void a(boolean flag)
    {
        if (h != null)
        {
            h.a = flag;
        }
    }

    public boolean a()
    {
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!a.isEmpty())
        {
            Drawable drawable = getSelector();
            if (drawable != null)
            {
                drawable.setBounds(a);
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged()
    {
        boolean flag = true;
        super.drawableStateChanged();
        a(true);
        Drawable drawable = getSelector();
        if (drawable != null)
        {
            if (!a() || !isPressed())
            {
                flag = false;
            }
            if (flag)
            {
                drawable.setState(getDrawableState());
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 30;
           goto _L1 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        f = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new vt(drawable);
        } else
        {
            obj = null;
        }
        h = ((vt) (obj));
        super.setSelector(h);
        obj = new Rect();
        if (drawable != null)
        {
            drawable.getPadding(((Rect) (obj)));
        }
        b = ((Rect) (obj)).left;
        c = ((Rect) (obj)).top;
        d = ((Rect) (obj)).right;
        e = ((Rect) (obj)).bottom;
    }

}
