// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            aa, m

public class ListMenuItemView extends LinearLayout
    implements aa
{

    private m a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private Drawable g;
    private int h;
    private Context i;
    private boolean j;
    private int k;
    private Context l;
    private LayoutInflater m;
    private boolean n;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        l = context;
        attributeset = context.obtainStyledAttributes(attributeset, l.aG, i1, 0);
        g = attributeset.getDrawable(l.aH);
        h = attributeset.getResourceId(l.aI, -1);
        j = attributeset.getBoolean(l.aJ, false);
        i = context;
        attributeset.recycle();
    }

    private LayoutInflater d()
    {
        if (m == null)
        {
            m = LayoutInflater.from(l);
        }
        return m;
    }

    public final m a()
    {
        return a;
    }

    public final void a(m m1)
    {
        a = m1;
        k = 0;
        Object obj;
        int i1;
        boolean flag;
        if (m1.isVisible())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        obj = m1.a(this);
        if (obj != null)
        {
            d.setText(((CharSequence) (obj)));
            if (d.getVisibility() != 0)
            {
                d.setVisibility(0);
            }
        } else
        if (d.getVisibility() != 8)
        {
            d.setVisibility(8);
        }
        flag = m1.isCheckable();
        if (flag || c != null || e != null)
        {
            Object obj1;
            if (a.g())
            {
                if (c == null)
                {
                    c = (RadioButton)d().inflate(i.k, this, false);
                    addView(c);
                }
                obj = c;
                obj1 = e;
            } else
            {
                if (e == null)
                {
                    e = (CheckBox)d().inflate(i.h, this, false);
                    addView(e);
                }
                obj = e;
                obj1 = c;
            }
            if (flag)
            {
                ((CompoundButton) (obj)).setChecked(a.isChecked());
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                if (((CompoundButton) (obj)).getVisibility() != i1)
                {
                    ((CompoundButton) (obj)).setVisibility(i1);
                }
                if (obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
                {
                    ((CompoundButton) (obj1)).setVisibility(8);
                }
            } else
            {
                if (e != null)
                {
                    e.setVisibility(8);
                }
                if (c != null)
                {
                    c.setVisibility(8);
                }
            }
        }
        flag = m1.f();
        m1.d();
        if (flag && a.f())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (i1 == 0)
        {
            f.setText(a.e());
        }
        if (f.getVisibility() != i1)
        {
            f.setVisibility(i1);
        }
        obj = m1.getIcon();
        if (a.h() || n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if ((i1 != 0 || j) && (b != null || obj != null || j))
        {
            if (b == null)
            {
                b = (ImageView)d().inflate(i.i, this, false);
                addView(b, 0);
            }
            if (obj != null || j)
            {
                obj1 = b;
                if (i1 == 0)
                {
                    obj = null;
                }
                ((ImageView) (obj1)).setImageDrawable(((Drawable) (obj)));
                if (b.getVisibility() != 0)
                {
                    b.setVisibility(0);
                }
            } else
            {
                b.setVisibility(8);
            }
        }
        setEnabled(m1.isEnabled());
    }

    public final boolean b()
    {
        return false;
    }

    public final void c()
    {
        n = true;
        j = true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundDrawable(g);
        d = (TextView)findViewById(g.v);
        if (h != -1)
        {
            d.setTextAppearance(i, h);
        }
        f = (TextView)findViewById(g.s);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (b != null && j)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)b.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i1, j1);
    }
}
