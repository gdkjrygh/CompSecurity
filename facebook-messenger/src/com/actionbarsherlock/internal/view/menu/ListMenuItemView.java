// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            k, c

public class ListMenuItemView extends LinearLayout
    implements com.actionbarsherlock.internal.view.menu.k
{

    final Context a;
    private c b;
    private ImageView c;
    private RadioButton d;
    private TextView e;
    private CheckBox f;
    private TextView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private LayoutInflater l;
    private boolean m;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        a = context;
        attributeset = context.obtainStyledAttributes(attributeset, q.SherlockMenuView, i1, 0);
        h = attributeset.getDrawable(q.SherlockMenuView_itemBackground);
        i = attributeset.getResourceId(q.SherlockMenuView_itemTextAppearance, -1);
        k = attributeset.getBoolean(q.SherlockMenuView_preserveIconSpacing, false);
        j = context;
        attributeset.recycle();
    }

    private void b()
    {
        c = (ImageView)getInflater().inflate(k.abs__list_menu_item_icon, this, false);
        addView(c, 0);
    }

    private void c()
    {
        d = (RadioButton)getInflater().inflate(k.abs__list_menu_item_radio, this, false);
        addView(d);
    }

    private void d()
    {
        f = (CheckBox)getInflater().inflate(k.abs__list_menu_item_checkbox, this, false);
        addView(f);
    }

    private LayoutInflater getInflater()
    {
        if (l == null)
        {
            l = LayoutInflater.from(a);
        }
        return l;
    }

    public void a(c c1, int i1)
    {
        b = c1;
        if (c1.u())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        setTitle(c1.a(this));
        setCheckable(c1.r());
        a(c1.l(), c1.j());
        setIcon(c1.q());
        setEnabled(c1.b());
    }

    public void a(boolean flag, char c1)
    {
        if (flag && b.l())
        {
            c1 = '\0';
        } else
        {
            c1 = '\b';
        }
        if (c1 == 0)
        {
            g.setText(b.k());
        }
        if (g.getVisibility() != c1)
        {
            g.setVisibility(c1);
        }
    }

    public boolean a()
    {
        return false;
    }

    public c getItemData()
    {
        return b;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundDrawable(h);
        e = (TextView)findViewById(i.abs__title);
        if (i != -1)
        {
            e.setTextAppearance(j, i);
        }
        g = (TextView)findViewById(i.abs__shortcut);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (c != null && k)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i1, j1);
    }

    public void setCheckable(boolean flag)
    {
        if (flag || d != null || f != null)
        {
            if (d == null)
            {
                c();
            }
            if (f == null)
            {
                d();
            }
            Object obj;
            Object obj1;
            if (b.s())
            {
                obj = d;
                obj1 = f;
            } else
            {
                obj = f;
                obj1 = d;
            }
            if (flag)
            {
                ((CompoundButton) (obj)).setChecked(b.t());
                int i1;
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
                if (((CompoundButton) (obj1)).getVisibility() != 8)
                {
                    ((CompoundButton) (obj1)).setVisibility(8);
                    return;
                }
            } else
            {
                f.setVisibility(8);
                d.setVisibility(8);
                return;
            }
        }
    }

    public void setChecked(boolean flag)
    {
        Object obj;
        if (b.s())
        {
            if (d == null)
            {
                c();
            }
            obj = d;
        } else
        {
            if (f == null)
            {
                d();
            }
            obj = f;
        }
        ((CompoundButton) (obj)).setChecked(flag);
    }

    public void setForceShowIcon(boolean flag)
    {
        m = flag;
        k = flag;
    }

    public void setIcon(Drawable drawable)
    {
        boolean flag;
        if (b.w() || m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_19;
        if ((flag || k) && (c != null || drawable != null || k))
        {
            if (c == null)
            {
                b();
            }
            if (drawable != null || k)
            {
                ImageView imageview = c;
                if (!flag)
                {
                    drawable = null;
                }
                imageview.setImageDrawable(drawable);
                if (c.getVisibility() != 0)
                {
                    c.setVisibility(0);
                    return;
                }
            } else
            {
                c.setVisibility(8);
                return;
            }
        }
        return;
    }

    public void setTitle(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            e.setText(charsequence);
            if (e.getVisibility() != 0)
            {
                e.setVisibility(0);
            }
        } else
        if (e.getVisibility() != 8)
        {
            e.setVisibility(8);
            return;
        }
    }
}
