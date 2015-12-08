// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class wq extends ViewGroup
{

    public final Context a;
    public ActionMenuView b;
    public aay c;
    public int d;
    public ob e;
    private wr f;
    private boolean g;
    private boolean h;

    wq(Context context)
    {
        this(context, null);
    }

    wq(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public wq(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new wr(this);
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(b.g, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
        {
            a = new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId);
            return;
        } else
        {
            a = context;
            return;
        }
    }

    public static int a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return i - j;
        } else
        {
            return i + j;
        }
    }

    public static int a(View view, int i, int j, int k)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(View view, int i, int j, int k, boolean flag)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j = (k - i1) / 2 + j;
        if (flag)
        {
            view.layout(i - l, j, i, i1 + j);
        } else
        {
            view.layout(i, j, i + l, i1 + j);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
    }

    static void a(wq wq1, int i)
    {
        wq1.View.setVisibility(0);
    }

    static void b(wq wq1, int i)
    {
        wq1.View.setVisibility(i);
    }

    public ob a(int i, long l)
    {
        if (e != null)
        {
            e.a();
        }
        if (i == 0)
        {
            if (getVisibility() != 0)
            {
                mk.c(this, 0.0F);
            }
            ob ob1 = mk.r(this).a(1.0F);
            ob1.a(l);
            ob1.a(f.a(ob1, i));
            return ob1;
        } else
        {
            ob ob2 = mk.r(this).a(0.0F);
            ob2.a(l);
            ob2.a(f.a(ob2, i));
            return ob2;
        }
    }

    public void a(int i)
    {
        d = i;
        requestLayout();
    }

    public boolean a()
    {
        if (c != null)
        {
            return c.b();
        } else
        {
            return false;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = getContext().obtainStyledAttributes(null, uh.a, b.i, 0);
        a(configuration.getLayoutDimension(uh.j, 0));
        configuration.recycle();
        if (c != null)
        {
            configuration = c;
            configuration.g = ((aay) (configuration)).b.getResources().getInteger(b.bq);
            if (((aay) (configuration)).c != null)
            {
                ((aay) (configuration)).c.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = lt.a(motionevent);
        if (i == 9)
        {
            h = false;
        }
        if (!h)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i == 9 && !flag)
            {
                h = true;
            }
        }
        if (i == 10 || i == 3)
        {
            h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = lt.a(motionevent);
        if (i == 0)
        {
            g = false;
        }
        if (!g)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i == 0 && !flag)
            {
                g = true;
            }
        }
        if (i == 1 || i == 3)
        {
            g = false;
        }
        return true;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            if (e != null)
            {
                e.a();
            }
            super.setVisibility(i);
        }
    }
}
