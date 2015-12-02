// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.config.a.d;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.q;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.widget.titlebar:
//            a

public class TitleBarViewStub extends View
{

    private WeakReference a;
    private String b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private d f;

    public TitleBarViewStub(Context context)
    {
        this(context, null, 0);
    }

    public TitleBarViewStub(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TitleBarViewStub(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        f = (d)t.a(context).a(com/facebook/config/a/d);
        context = context.obtainStyledAttributes(attributeset, q.TitleBarViewStub, j, 0);
        b = context.getString(q.TitleBarViewStub_title);
        c = a(context, q.TitleBarViewStub_hasProgressBar);
        d = a(context, q.TitleBarViewStub_hasBackButton);
        e = a(context, q.TitleBarViewStub_navless);
        context.recycle();
        setWillNotDraw(true);
    }

    private View a()
    {
        Object obj = getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ViewGroup viewgroup = (ViewGroup)obj;
            obj = LayoutInflater.from(getContext());
            Object obj1;
            int j;
            if (f == d.FB4A && Boolean.TRUE.equals(e))
            {
                obj = ((LayoutInflater) (obj)).inflate(k.titlebar_wrapper_navless, viewgroup, false);
            } else
            {
                obj = ((LayoutInflater) (obj)).inflate(k.titlebar_wrapper, viewgroup, false);
            }
            if (obj instanceof a)
            {
                obj1 = (a)obj;
            } else
            {
                obj1 = (a)((View) (obj)).findViewById(i.titlebar);
            }
            if (b != null)
            {
                ((a) (obj1)).setTitle(b);
            }
            if (c != null)
            {
                ((a) (obj1)).setHasProgressBar(c.booleanValue());
            }
            if (d != null)
            {
                ((a) (obj1)).setHasBackButton(d.booleanValue());
            }
            j = viewgroup.indexOfChild(this);
            viewgroup.removeViewInLayout(this);
            obj1 = getLayoutParams();
            if (obj1 != null)
            {
                viewgroup.addView(((View) (obj)), j, ((android.view.ViewGroup.LayoutParams) (obj1)));
            } else
            {
                viewgroup.addView(((View) (obj)), j);
            }
            a = new WeakReference(obj);
            return ((View) (obj));
        } else
        {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    private Boolean a(TypedArray typedarray, int j)
    {
        if (typedarray.hasValue(j))
        {
            return Boolean.valueOf(typedarray.getBoolean(j, false));
        } else
        {
            return null;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public void draw(Canvas canvas)
    {
    }

    protected void onMeasure(int j, int l)
    {
        setMeasuredDimension(0, 0);
    }

    public void setVisibility(int j)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        View view = (View)a.get();
        if (view == null) goto _L4; else goto _L3
_L3:
        view.setVisibility(j);
_L6:
        return;
_L4:
        throw new IllegalStateException("setVisibility called on un-referenced view");
_L2:
        super.setVisibility(j);
        if (j == 0 || j == 4)
        {
            a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
