// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.CompatTextView;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import java.util.Locale;

// Referenced classes of package android.support.v7.internal.view.menu:
//            h

public class ActionMenuItemView extends CompatTextView
    implements ActionMenuView.a, m.a, android.view.View.OnClickListener, android.view.View.OnLongClickListener
{
    private class a
        implements TransformationMethod
    {

        final ActionMenuItemView a;
        private Locale b;

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
            if (charsequence != null)
            {
                return charsequence.toString().toUpperCase(b);
            } else
            {
                return null;
            }
        }

        public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
        {
        }

        public a()
        {
            a = ActionMenuItemView.this;
            super();
            b = getContext().getResources().getConfiguration().locale;
        }
    }


    private h a;
    private CharSequence b;
    private Drawable c;
    private f.b d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = context.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_config_allowActionMenuItemTextWithIcon);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionMenuItemView, 0, 0);
        g = context.getDimensionPixelSize(0, 0);
        context.recycle();
        setOnClickListener(this);
        setOnLongClickListener(this);
        setTransformationMethod(new a());
        h = -1;
    }

    private void e()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag2 = false;
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c != null)
            {
                flag1 = flag2;
                if (!a.l())
                {
                    break label0;
                }
                if (!e)
                {
                    flag1 = flag2;
                    if (!f)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        if (flag & flag1)
        {
            charsequence = b;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public void a(h h1, int i)
    {
        a = h1;
        setIcon(h1.getIcon());
        setTitle(h1.a(this));
        setId(h1.getItemId());
        if (h1.isVisible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        setEnabled(h1.isEnabled());
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(getText());
    }

    public boolean c()
    {
        return b() && a.getIcon() == null;
    }

    public boolean d()
    {
        return b();
    }

    public h getItemData()
    {
        return a;
    }

    public void onClick(View view)
    {
        if (d != null)
        {
            d.a(a);
        }
    }

    public boolean onLongClick(View view)
    {
        if (b())
        {
            return false;
        }
        view = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(view);
        getWindowVisibleDisplayFrame(rect);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = view[1];
        int l = j / 2;
        int i1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), a.getTitle(), 0);
        if (k + l < rect.height())
        {
            ((Toast) (obj)).setGravity(53, i1 - view[0] - i / 2, j);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, j);
        }
        ((Toast) (obj)).show();
        return true;
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = b();
        if (flag && h >= 0)
        {
            super.setPadding(h, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, j);
        int k = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        int l = getMeasuredWidth();
        if (k == 0x80000000)
        {
            i = Math.min(i, g);
        } else
        {
            i = g;
        }
        if (k != 0x40000000 && g > 0 && l < i)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        }
        if (!flag && c != null)
        {
            super.setPadding((getMeasuredWidth() - c.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setCheckable(boolean flag)
    {
    }

    public void setChecked(boolean flag)
    {
    }

    public void setExpandedFormat(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            if (a != null)
            {
                a.g();
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        c = drawable;
        setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(f.b b1)
    {
        d = b1;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        h = i;
        super.setPadding(i, j, k, l);
    }

    public void setTitle(CharSequence charsequence)
    {
        b = charsequence;
        setContentDescription(b);
        e();
    }
}
