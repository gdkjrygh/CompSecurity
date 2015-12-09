// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aak;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import kh;
import sr;
import tp;
import wa;
import wc;
import zl;
import zq;
import zr;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

public class AppCompatSpinner extends Spinner
    implements kh
{

    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private wa d;
    private zl e;
    private Context f;
    private aak g;
    private SpinnerAdapter h;
    private boolean i;
    private zr j;
    private int k;
    private final Rect l;

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010140);
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
        Object obj;
        int l1;
        super(context, attributeset, i1);
        l = new Rect();
        wc wc1 = wc.a(context, attributeset, sr.bq, i1);
        d = wc1.a();
        e = new zl(this, d);
        int k1 = wc1.e(sr.bu, 0);
        if (k1 != 0)
        {
            obj = new tp(context, k1);
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
        obj = context.obtainStyledAttributes(attributeset, c, i1, 0);
        k1 = j1;
        context = ((Context) (obj));
        if (!((TypedArray) (obj)).hasValue(0))
        {
            break MISSING_BLOCK_LABEL_143;
        }
        context = ((Context) (obj));
        k1 = ((TypedArray) (obj)).getInt(0, 0);
        l1 = k1;
        if (obj != null)
        {
            ((TypedArray) (obj)).recycle();
            l1 = k1;
        }
_L5:
        if (l1 == 1)
        {
            context = new zr(this, f, attributeset, i1);
            obj = wc.a(f, attributeset, sr.bq, i1);
            k = ((wc) (obj)).d(sr.br, -2);
            context.a(((wc) (obj)).a(sr.bs));
            j1 = sr.bt;
            context.a = wc1.a.getString(1);
            ((wc) (obj)).a.recycle();
            j = context;
            g = new aak(this, context) {

                private zr a;
                private AppCompatSpinner b;

                public final ListPopupWindow a()
                {
                    return a;
                }

                public final boolean b()
                {
                    if (!((ListPopupWindow) (AppCompatSpinner.a(b))).c.isShowing())
                    {
                        AppCompatSpinner.a(b).b();
                    }
                    return true;
                }

            
            {
                b = AppCompatSpinner.this;
                a = zr1;
                super(view);
            }
            };
        }
_L2:
        wc1.a.recycle();
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
        obj = null;
_L7:
        context = ((Context) (obj));
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception);
        l1 = j1;
        if (obj != null)
        {
            ((TypedArray) (obj)).recycle();
            l1 = j1;
        }
          goto _L5
        attributeset;
        context = null;
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
        exception;
          goto _L7
    }

    public static int a(AppCompatSpinner appcompatspinner, SpinnerAdapter spinneradapter, Drawable drawable)
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

    static zr a(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.j;
    }

    public static boolean a()
    {
        return a;
    }

    public static Rect b(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.l;
    }

    public static int c(AppCompatSpinner appcompatspinner)
    {
        return appcompatspinner.k;
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (e != null)
        {
            e.a(colorstatelist);
        }
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (e != null)
        {
            e.a(mode);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            e.a();
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
        zr zr1 = j;
        if (((ListPopupWindow) (zr1)).h) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return ((ListPopupWindow) (zr1)).g;
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

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (j != null && ((ListPopupWindow) (j)).c.isShowing())
        {
            j.dismiss();
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
                j.a(new zq(spinneradapter, context.getTheme()));
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
            zr zr1 = j;
            zr1.g = i1;
            zr1.h = true;
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
