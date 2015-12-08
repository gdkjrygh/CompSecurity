// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bo;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.an;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            m, q, o, ListPopupWindow, 
//            y, p

public class AppCompatSpinner extends Spinner
    implements bo
{

    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private al d;
    private m e;
    private Context f;
    private y g;
    private SpinnerAdapter h;
    private boolean i;
    private q j;
    private int k;
    private final Rect l;

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, (byte)0);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeset, int i1, byte byte0)
    {
        this(context, attributeset, i1, -1);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeset, int i1, int j1)
    {
        Object obj1;
        int l1;
        obj1 = null;
        super(context, attributeset, i1);
        l = new Rect();
        an an1 = an.a(context, attributeset, l.Spinner, i1);
        d = an1.a();
        e = new m(this, d);
        int k1 = an1.e(l.Spinner_popupTheme, 0);
        Object obj;
        if (k1 != 0)
        {
            obj = new android.support.v7.internal.view.b(context, k1);
        } else
        if (!a)
        {
            obj = context;
        } else
        {
            obj = null;
        }
        f = ((Context) (obj));
        if (f == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L3
_L3:
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
_L5:
        if (l1 == 1)
        {
            context = new q(this, f, attributeset, i1);
            obj = an.a(f, attributeset, l.Spinner, i1);
            k = ((an) (obj)).d(l.Spinner_android_dropDownWidth, -2);
            context.a(((an) (obj)).a(l.Spinner_android_popupBackground));
            j1 = l.Spinner_android_prompt;
            context.a = an1.a.getString(j1);
            ((an) (obj)).a.recycle();
            j = context;
            g = new o(this, this, context);
        }
_L2:
        an1.a.recycle();
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
_L7:
        l1 = j1;
        if (context != null)
        {
            context.recycle();
            l1 = j1;
        }
          goto _L5
        attributeset;
        context = obj1;
_L6:
        if (context != null)
        {
            context.recycle();
        }
        throw attributeset;
_L4:
        l1 = 1;
          goto _L5
        attributeset;
          goto _L6
        Exception exception;
        exception;
          goto _L7
    }

    static int a(AppCompatSpinner appcompatspinner, SpinnerAdapter spinneradapter, Drawable drawable)
    {
        return appcompatspinner.a(spinneradapter, drawable);
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

    static q a(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.j;
    }

    static boolean a()
    {
        return a;
    }

    static Rect b(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.l;
    }

    static int c(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.k;
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
            return ((ListPopupWindow) (j)).f;
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
        if (j == null) goto _L2; else goto _L1
_L1:
        q q1 = j;
        if (((ListPopupWindow) (q1)).h) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return ((ListPopupWindow) (q1)).g;
_L2:
        if (b)
        {
            return super.getDropDownVerticalOffset();
        }
        if (true) goto _L3; else goto _L5
_L5:
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
            return ((ListPopupWindow) (j)).c.getBackground();
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
            return j.a;
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
        if (j != null && ((ListPopupWindow) (j)).c.isShowing())
        {
            j.d();
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
        if (j != null && !((ListPopupWindow) (j)).c.isShowing())
        {
            j.b();
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
                j.a(new p(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (e != null)
        {
            e.b(null);
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
            j.f = i1;
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
            q q1 = j;
            q1.g = i1;
            q1.h = true;
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
            j.a = charsequence;
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
