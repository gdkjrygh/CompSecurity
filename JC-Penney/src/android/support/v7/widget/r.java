// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bk;
import android.support.v7.b.k;
import android.support.v7.internal.view.b;
import android.support.v7.internal.widget.ak;
import android.support.v7.internal.widget.am;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            q, u, s, ah, 
//            t

public class r extends Spinner
    implements bk
{

    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private ak d;
    private q e;
    private Context f;
    private ah g;
    private SpinnerAdapter h;
    private boolean i;
    private u j;
    private int k;
    private final Rect l;

    public r(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, -1);
    }

    public r(Context context, AttributeSet attributeset, int i1, int j1)
    {
        this(context, attributeset, i1, j1, null);
    }

    public r(Context context, AttributeSet attributeset, int i1, int j1, android.content.res.Resources.Theme theme)
    {
        int i2;
        super(context, attributeset, i1);
        l = new Rect();
        am am1 = am.a(context, attributeset, k.Spinner, i1, 0);
        d = am1.c();
        e = new q(this, d);
        int k1;
        if (theme != null)
        {
            f = new b(context, theme);
        } else
        {
            int l1 = am1.g(k.Spinner_popupTheme, 0);
            if (l1 != 0)
            {
                f = new b(context, l1);
            } else
            {
                if (!a)
                {
                    theme = context;
                } else
                {
                    theme = null;
                }
                f = theme;
            }
        }
        if (f == null) goto _L2; else goto _L1
_L1:
        i2 = j1;
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L6; else goto _L5
_L5:
        theme = context.obtainStyledAttributes(attributeset, c, i1, 0);
        k1 = j1;
        context = theme;
        if (!theme.hasValue(0))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        context = theme;
        k1 = theme.getInt(0, 0);
        i2 = k1;
        if (theme != null)
        {
            theme.recycle();
            i2 = k1;
        }
_L4:
        if (i2 == 1)
        {
            context = new u(this, f, attributeset, i1);
            theme = am.a(f, attributeset, k.Spinner, i1, 0);
            k = theme.f(k.Spinner_android_dropDownWidth, -2);
            context.a(theme.a(k.Spinner_android_popupBackground));
            context.a(am1.c(k.Spinner_android_prompt));
            theme.b();
            j = context;
            g = new s(this, this, context);
        }
_L2:
        am1.b();
        i = true;
        if (h != null)
        {
            setAdapter(h);
            h = null;
        }
        e.a(attributeset, i1);
        return;
        Exception exception;
        exception;
        theme = null;
_L8:
        context = theme;
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception);
        i2 = j1;
        if (theme != null)
        {
            theme.recycle();
            i2 = j1;
        }
          goto _L4
        attributeset;
        context = null;
_L7:
        if (context != null)
        {
            context.recycle();
        }
        throw attributeset;
_L6:
        i2 = 1;
          goto _L4
        attributeset;
          goto _L7
        exception;
          goto _L8
    }

    static int a(r r1, SpinnerAdapter spinneradapter, Drawable drawable)
    {
        return r1.a(spinneradapter, drawable);
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

    static u a(r r1)
    {
        return r1.j;
    }

    static boolean a()
    {
        return a;
    }

    static Rect b(r r1)
    {
        return r1.l;
    }

    static int c(r r1)
    {
        return r1.k;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            e.c();
        }
    }

    public int getDropDownHorizontalOffset()
    {
        if (j != null)
        {
            return j.f();
        }
        if (b)
        {
            return super.getDropDownHorizontalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownVerticalOffset()
    {
        if (j != null)
        {
            return j.g();
        }
        if (b)
        {
            return super.getDropDownVerticalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownWidth()
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

    public Drawable getPopupBackground()
    {
        if (j != null)
        {
            return j.d();
        }
        if (b)
        {
            return super.getPopupBackground();
        } else
        {
            return null;
        }
    }

    public Context getPopupContext()
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

    public CharSequence getPrompt()
    {
        if (j != null)
        {
            return j.a();
        } else
        {
            return super.getPrompt();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (e != null)
        {
            return e.a();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (e != null)
        {
            return e.b();
        } else
        {
            return null;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (j != null && j.k())
        {
            j.i();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (j != null && android.view.View.MeasureSpec.getMode(i1) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i1)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g != null && g.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean performClick()
    {
        if (j != null && !j.k())
        {
            j.c();
            return true;
        } else
        {
            return super.performClick();
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
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
                j.a(new t(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (e != null)
        {
            e.a(drawable);
        }
    }

    public void setBackgroundResource(int i1)
    {
        super.setBackgroundResource(i1);
        if (e != null)
        {
            e.a(i1);
        }
    }

    public void setDropDownHorizontalOffset(int i1)
    {
        if (j != null)
        {
            j.b(i1);
        } else
        if (b)
        {
            super.setDropDownHorizontalOffset(i1);
            return;
        }
    }

    public void setDropDownVerticalOffset(int i1)
    {
        if (j != null)
        {
            j.c(i1);
        } else
        if (b)
        {
            super.setDropDownVerticalOffset(i1);
            return;
        }
    }

    public void setDropDownWidth(int i1)
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

    public void setPopupBackgroundDrawable(Drawable drawable)
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

    public void setPopupBackgroundResource(int i1)
    {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i1));
    }

    public void setPrompt(CharSequence charsequence)
    {
        if (j != null)
        {
            j.a(charsequence);
            return;
        } else
        {
            super.setPrompt(charsequence);
            return;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (e != null)
        {
            e.a(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
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
