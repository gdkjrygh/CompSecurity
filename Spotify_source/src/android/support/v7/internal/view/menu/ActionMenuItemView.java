// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import aak;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import km;
import sr;
import tz;
import ua;
import ui;
import uk;
import ux;
import ze;

public class ActionMenuItemView extends AppCompatTextView
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, ux, ze
{

    public ui a;
    public ua b;
    private uk c;
    private CharSequence d;
    private Drawable e;
    private aak f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        Resources resources = context.getResources();
        g = resources.getBoolean(0x7f0a0002);
        context = context.obtainStyledAttributes(attributeset, sr.v, k, 0);
        h = context.getDimensionPixelSize(sr.w, 0);
        context.recycle();
        j = (int)(resources.getDisplayMetrics().density * 32F + 0.5F);
        setOnClickListener(this);
        setOnLongClickListener(this);
        i = -1;
    }

    public static ua a(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.b;
    }

    public static ui b(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.a;
    }

    public static uk c(ActionMenuItemView actionmenuitemview)
    {
        return actionmenuitemview.c;
    }

    private void f()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag3 = false;
            boolean flag;
            if (!TextUtils.isEmpty(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (e != null)
            {
                boolean flag1;
                boolean flag2;
                if ((c.b & 4) == 4)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
                flag2 = flag3;
                if (!g)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        if (flag & flag2)
        {
            charsequence = d;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public final uk a()
    {
        return c;
    }

    public final void a(uk uk1)
    {
        c = uk1;
        Drawable drawable = uk1.getIcon();
        e = drawable;
        if (drawable != null)
        {
            int k1 = drawable.getIntrinsicWidth();
            int j1 = drawable.getIntrinsicHeight();
            int i1 = j1;
            int k = k1;
            if (k1 > j)
            {
                float f1 = (float)j / (float)k1;
                k = j;
                i1 = (int)((float)j1 * f1);
            }
            k1 = i1;
            j1 = k;
            if (i1 > j)
            {
                float f2 = (float)j / (float)i1;
                k1 = j;
                j1 = (int)((float)k * f2);
            }
            drawable.setBounds(0, 0, j1, k1);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
        d = uk1.a(this);
        setContentDescription(d);
        f();
        setId(uk1.getItemId());
        int l;
        if (uk1.isVisible())
        {
            l = 0;
        } else
        {
            l = 8;
        }
        setVisibility(l);
        setEnabled(uk1.isEnabled());
        if (uk1.hasSubMenu() && f == null)
        {
            f = new tz(this);
        }
    }

    public final boolean b()
    {
        return true;
    }

    public final boolean c()
    {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean d()
    {
        return c() && c.getIcon() == null;
    }

    public final boolean e()
    {
        return c();
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            a.a(c);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        g = getContext().getResources().getBoolean(0x7f0a0002);
        f();
    }

    public boolean onLongClick(View view)
    {
        if (c())
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int k = getWidth();
        int i1 = getHeight();
        int j1 = ai[1];
        int k1 = i1 / 2;
        int l = ai[0];
        l = k / 2 + l;
        k = l;
        if (km.h(view) == 0)
        {
            k = context.getResources().getDisplayMetrics().widthPixels - l;
        }
        view = Toast.makeText(context, c.getTitle(), 0);
        if (j1 + k1 < rect.height())
        {
            view.setGravity(0x800035, k, (ai[1] + i1) - rect.top);
        } else
        {
            view.setGravity(81, 0, i1);
        }
        view.show();
        return true;
    }

    protected void onMeasure(int k, int l)
    {
        boolean flag = c();
        if (flag && i >= 0)
        {
            super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(k, l);
        int i1 = android.view.View.MeasureSpec.getMode(k);
        k = android.view.View.MeasureSpec.getSize(k);
        int j1 = getMeasuredWidth();
        if (i1 == 0x80000000)
        {
            k = Math.min(k, h);
        } else
        {
            k = h;
        }
        if (i1 != 0x40000000 && h > 0 && j1 < k)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), l);
        }
        if (!flag && e != null)
        {
            super.setPadding((getMeasuredWidth() - e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (c.hasSubMenu() && f != null && f.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setPadding(int k, int l, int i1, int j1)
    {
        i = k;
        super.setPadding(k, l, i1, j1);
    }
}
