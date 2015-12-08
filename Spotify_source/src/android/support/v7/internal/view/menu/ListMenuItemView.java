// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

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
import sr;
import uk;
import ux;

public class ListMenuItemView extends LinearLayout
    implements ux
{

    public boolean a;
    public boolean b;
    private uk c;
    private ImageView d;
    private RadioButton e;
    private TextView f;
    private CheckBox g;
    private TextView h;
    private Drawable i;
    private int j;
    private Context k;
    private Context l;
    private LayoutInflater m;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        l = context;
        attributeset = context.obtainStyledAttributes(attributeset, sr.aR, i1, 0);
        i = attributeset.getDrawable(sr.aS);
        j = attributeset.getResourceId(sr.aT, -1);
        a = attributeset.getBoolean(sr.aU, false);
        k = context;
        attributeset.recycle();
    }

    private LayoutInflater c()
    {
        if (m == null)
        {
            m = LayoutInflater.from(l);
        }
        return m;
    }

    public final uk a()
    {
        return c;
    }

    public final void a(uk uk1)
    {
        char c1;
        Object obj;
        int i1;
        c = uk1;
        boolean flag;
        if (uk1.isVisible())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        obj = uk1.a(this);
        if (obj != null)
        {
            f.setText(((CharSequence) (obj)));
            if (f.getVisibility() != 0)
            {
                f.setVisibility(0);
            }
        } else
        if (f.getVisibility() != 8)
        {
            f.setVisibility(8);
        }
        flag = uk1.isCheckable();
        if (flag || e != null || g != null)
        {
            Object obj1;
            if (c.e())
            {
                if (e == null)
                {
                    e = (RadioButton)c().inflate(0x7f030010, this, false);
                    addView(e);
                }
                obj = e;
                obj1 = g;
            } else
            {
                if (g == null)
                {
                    g = (CheckBox)c().inflate(0x7f03000d, this, false);
                    addView(g);
                }
                obj = g;
                obj1 = e;
            }
            if (flag)
            {
                ((CompoundButton) (obj)).setChecked(c.isChecked());
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
                if (g != null)
                {
                    g.setVisibility(8);
                }
                if (e != null)
                {
                    e.setVisibility(8);
                }
            }
        }
        flag = uk1.d();
        uk1.c();
        if (flag && c.d())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        obj1 = h;
        c1 = c.c();
        if (c1 != 0) goto _L4; else goto _L3
_L3:
        obj = "";
_L10:
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
_L2:
        if (h.getVisibility() != i1)
        {
            h.setVisibility(i1);
        }
        obj = uk1.getIcon();
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if ((i1 != 0 || a) && (d != null || obj != null || a))
        {
            if (d == null)
            {
                d = (ImageView)c().inflate(0x7f03000e, this, false);
                addView(d, 0);
            }
            if (obj != null || a)
            {
                obj1 = d;
                if (i1 == 0)
                {
                    obj = null;
                }
                ((ImageView) (obj1)).setImageDrawable(((Drawable) (obj)));
                if (d.getVisibility() != 0)
                {
                    d.setVisibility(0);
                }
            } else
            {
                d.setVisibility(8);
            }
        }
        setEnabled(uk1.isEnabled());
        return;
_L4:
        obj = new StringBuilder(null);
        c1;
        JVM INSTR lookupswitch 3: default 584
    //                   8: 607
    //                   10: 598
    //                   32: 616;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_616;
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        ((StringBuilder) (obj)).append(c1);
_L11:
        obj = ((StringBuilder) (obj)).toString();
        if (true) goto _L10; else goto _L9
_L9:
        ((StringBuilder) (obj)).append(null);
          goto _L11
_L6:
        ((StringBuilder) (obj)).append(null);
          goto _L11
        ((StringBuilder) (obj)).append(null);
          goto _L11
    }

    public final boolean b()
    {
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundDrawable(i);
        f = (TextView)findViewById(0x7f11026e);
        if (j != -1)
        {
            f.setTextAppearance(k, j);
        }
        h = (TextView)findViewById(0x7f11027e);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (d != null && a)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i1, j1);
    }
}
