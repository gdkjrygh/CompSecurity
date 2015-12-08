// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import uh;

public final class ViewStubCompat extends View
{

    public LayoutInflater a;
    private int b;
    private int c;
    private WeakReference d;

    public ViewStubCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 0;
        context = context.obtainStyledAttributes(attributeset, uh.cm, i, 0);
        c = context.getResourceId(uh.co, -1);
        b = context.getResourceId(uh.cp, 0);
        setId(context.getResourceId(uh.cn, -1));
        context.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a()
    {
        Object obj = getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            if (b != 0)
            {
                ViewGroup viewgroup = (ViewGroup)obj;
                android.view.ViewGroup.LayoutParams layoutparams;
                int i;
                if (a != null)
                {
                    obj = a;
                } else
                {
                    obj = LayoutInflater.from(getContext());
                }
                obj = ((LayoutInflater) (obj)).inflate(b, viewgroup, false);
                if (c != -1)
                {
                    ((View) (obj)).setId(c);
                }
                i = viewgroup.indexOfChild(this);
                viewgroup.removeViewInLayout(this);
                layoutparams = getLayoutParams();
                if (layoutparams != null)
                {
                    viewgroup.addView(((View) (obj)), i, layoutparams);
                } else
                {
                    viewgroup.addView(((View) (obj)), i);
                }
                d = new WeakReference(obj);
                return ((View) (obj));
            } else
            {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
        } else
        {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    protected final void dispatchDraw(Canvas canvas)
    {
    }

    public final void draw(Canvas canvas)
    {
    }

    protected final void onMeasure(int i, int j)
    {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        View view = (View)d.get();
        if (view == null) goto _L4; else goto _L3
_L3:
        view.setVisibility(i);
_L6:
        return;
_L4:
        throw new IllegalStateException("setVisibility called on un-referenced view");
_L2:
        super.setVisibility(i);
        if (i == 0 || i == 4)
        {
            a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
