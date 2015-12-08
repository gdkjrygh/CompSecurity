// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class abx extends Spinner
    implements mf
{

    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private yh d;
    private abp e;
    private Context f;
    private adu g;
    private SpinnerAdapter h;
    private boolean i;
    private aca j;
    private int k;
    private final Rect l;

    public abx(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.Q);
    }

    public abx(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, -1);
    }

    private abx(Context context, AttributeSet attributeset, int i1, int j1)
    {
        this(context, attributeset, i1, -1, null);
    }

    private abx(Context context, AttributeSet attributeset, int i1, int j1, android.content.res.Resources.Theme theme)
    {
        Object obj;
        int l1;
        obj = null;
        super(context, attributeset, i1);
        l = new Rect();
        yj yj1 = yj.a(context, attributeset, uh.aW, i1, 0);
        d = yj1.a();
        e = new abp(this, d);
        int k1 = yj1.f(uh.ba, 0);
        if (k1 != 0)
        {
            theme = new vc(context, k1);
        } else
        if (!a)
        {
            theme = context;
        } else
        {
            theme = null;
        }
        f = theme;
        if (f == null) goto _L2; else goto _L1
_L1:
        l1 = j1;
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L6; else goto _L5
_L5:
        context = context.obtainStyledAttributes(attributeset, c, i1, 0);
        k1 = j1;
        if (context.hasValue(0))
        {
            k1 = context.getInt(0, 0);
        }
        l1 = k1;
        if (context != null)
        {
            context.recycle();
            l1 = k1;
        }
_L4:
        if (l1 == 1)
        {
            context = new aca(this, f, attributeset, i1);
            theme = yj.a(f, attributeset, uh.aW, i1, 0);
            k = theme.e(uh.aX, -2);
            context.a(theme.a(uh.aY));
            j1 = uh.aZ;
            context.a = yj1.a.getString(j1);
            ((yj) (theme)).a.recycle();
            j = context;
            g = new aby(this, this, context);
        }
_L2:
        yj1.a.recycle();
        i = true;
        if (h != null)
        {
            setAdapter(h);
            h = null;
        }
        e.a(attributeset, i1);
        return;
        context;
        context = null;
_L8:
        l1 = j1;
        if (context != null)
        {
            context.recycle();
            l1 = j1;
        }
          goto _L4
        attributeset;
        context = obj;
_L7:
        if (context != null)
        {
            context.recycle();
        }
        throw attributeset;
_L6:
        l1 = 1;
          goto _L4
        attributeset;
          goto _L7
        theme;
          goto _L8
    }

    static int a(abx abx1, SpinnerAdapter spinneradapter, Drawable drawable)
    {
        return abx1.a(spinneradapter, drawable);
    }

    private int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int i1 = Math.max(0, getSelectedItemPosition());
        int k2 = Math.min(spinneradapter.getCount(), i1 + 15);
        int j1 = Math.max(0, i1 - (15 - (k2 - i1)));
        View view = null;
        int k1 = 0;
        i1 = 0;
        for (; j1 < k2; j1++)
        {
            int l1 = spinneradapter.getItemViewType(j1);
            if (l1 != i1)
            {
                view = null;
                i1 = l1;
            }
            view = spinneradapter.getView(j1, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(i2, j2);
            k1 = Math.max(k1, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(l);
            return l.left + l.right + k1;
        } else
        {
            return k1;
        }
    }

    static aca a(abx abx1)
    {
        return abx1.j;
    }

    static boolean a()
    {
        return a;
    }

    static Rect b(abx abx1)
    {
        return abx1.l;
    }

    static int c(abx abx1)
    {
        return abx1.k;
    }

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            e.a();
        }
    }

    public final int getDropDownHorizontalOffset()
    {
        if (j != null)
        {
            return ((adq) (j)).f;
        }
        if (b)
        {
            return super.getDropDownHorizontalOffset();
        } else
        {
            return 0;
        }
    }

    public final int getDropDownVerticalOffset()
    {
        if (j == null) goto _L2; else goto _L1
_L1:
        aca aca1 = j;
        if (((adq) (aca1)).h) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return ((adq) (aca1)).g;
_L2:
        if (b)
        {
            return super.getDropDownVerticalOffset();
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final int getDropDownWidth()
    {
        if (j != null)
        {
            return k;
        }
        if (b)
        {
            return super.getDropDownWidth();
        } else
        {
            return 0;
        }
    }

    public final Drawable getPopupBackground()
    {
        if (j != null)
        {
            return ((adq) (j)).c.getBackground();
        }
        if (b)
        {
            return super.getPopupBackground();
        } else
        {
            return null;
        }
    }

    public final Context getPopupContext()
    {
        if (j != null)
        {
            return f;
        }
        if (a)
        {
            return super.getPopupContext();
        } else
        {
            return null;
        }
    }

    public final CharSequence getPrompt()
    {
        if (j != null)
        {
            return j.a;
        } else
        {
            return super.getPrompt();
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (j != null && ((adq) (j)).c.isShowing())
        {
            j.c();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (j != null && android.view.View.MeasureSpec.getMode(i1) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i1)), getMeasuredHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g != null && g.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final boolean performClick()
    {
        if (j != null && !((adq) (j)).c.isShowing())
        {
            j.b();
            return true;
        } else
        {
            return super.performClick();
        }
    }

    public final volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public final void setAdapter(SpinnerAdapter spinneradapter)
    {
        if (!i)
        {
            h = spinneradapter;
        } else
        {
            super.setAdapter(spinneradapter);
            if (j != null)
            {
                Context context;
                if (f == null)
                {
                    context = getContext();
                } else
                {
                    context = f;
                }
                j.a(new abz(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (e != null)
        {
            e.b(null);
        }
    }

    public final void setBackgroundResource(int i1)
    {
        super.setBackgroundResource(i1);
        if (e != null)
        {
            e.a(i1);
        }
    }

    public final void setDropDownHorizontalOffset(int i1)
    {
        if (j != null)
        {
            j.f = i1;
        } else
        if (b)
        {
            super.setDropDownHorizontalOffset(i1);
            return;
        }
    }

    public final void setDropDownVerticalOffset(int i1)
    {
        if (j != null)
        {
            aca aca1 = j;
            aca1.g = i1;
            aca1.h = true;
        } else
        if (b)
        {
            super.setDropDownVerticalOffset(i1);
            return;
        }
    }

    public final void setDropDownWidth(int i1)
    {
        if (j != null)
        {
            k = i1;
        } else
        if (b)
        {
            super.setDropDownWidth(i1);
            return;
        }
    }

    public final void setPopupBackgroundDrawable(Drawable drawable)
    {
        if (j != null)
        {
            j.a(drawable);
        } else
        if (b)
        {
            super.setPopupBackgroundDrawable(drawable);
            return;
        }
    }

    public final void setPopupBackgroundResource(int i1)
    {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i1));
    }

    public final void setPrompt(CharSequence charsequence)
    {
        if (j != null)
        {
            j.a = charsequence;
            return;
        } else
        {
            super.setPrompt(charsequence);
            return;
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (e != null)
        {
            e.a(colorstatelist);
        }
    }

    public final void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (e != null)
        {
            e.a(mode);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
