// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.v;
import android.support.v4.view.x;
import android.support.v7.internal.view.b;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//            b, j

public class AppCompatSpinner extends Spinner
    implements v
{
    private static final class a
        implements ListAdapter, SpinnerAdapter
    {

        private SpinnerAdapter a;
        private ListAdapter b;

        public final boolean areAllItemsEnabled()
        {
            ListAdapter listadapter = b;
            if (listadapter != null)
            {
                return listadapter.areAllItemsEnabled();
            } else
            {
                return true;
            }
        }

        public final int getCount()
        {
            if (a == null)
            {
                return 0;
            } else
            {
                return a.getCount();
            }
        }

        public final View getDropDownView(int i1, View view, ViewGroup viewgroup)
        {
            if (a == null)
            {
                return null;
            } else
            {
                return a.getDropDownView(i1, view, viewgroup);
            }
        }

        public final Object getItem(int i1)
        {
            if (a == null)
            {
                return null;
            } else
            {
                return a.getItem(i1);
            }
        }

        public final long getItemId(int i1)
        {
            if (a == null)
            {
                return -1L;
            } else
            {
                return a.getItemId(i1);
            }
        }

        public final int getItemViewType(int i1)
        {
            return 0;
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            return getDropDownView(i1, view, viewgroup);
        }

        public final int getViewTypeCount()
        {
            return 1;
        }

        public final boolean hasStableIds()
        {
            return a != null && a.hasStableIds();
        }

        public final boolean isEmpty()
        {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i1)
        {
            ListAdapter listadapter = b;
            if (listadapter != null)
            {
                return listadapter.isEnabled(i1);
            } else
            {
                return true;
            }
        }

        public final void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            if (a != null)
            {
                a.registerDataSetObserver(datasetobserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            if (a != null)
            {
                a.unregisterDataSetObserver(datasetobserver);
            }
        }

        public a(SpinnerAdapter spinneradapter, android.content.res.Resources.Theme theme)
        {
            a = spinneradapter;
            if (spinneradapter instanceof ListAdapter)
            {
                b = (ListAdapter)spinneradapter;
            }
            if (theme != null && AppCompatSpinner.a() && (spinneradapter instanceof ThemedSpinnerAdapter))
            {
                spinneradapter = (ThemedSpinnerAdapter)spinneradapter;
                if (spinneradapter.getDropDownViewTheme() != theme)
                {
                    spinneradapter.setDropDownViewTheme(theme);
                }
            }
        }
    }

    private final class b extends j
    {

        final AppCompatSpinner a;
        private CharSequence c;
        private ListAdapter d;
        private final Rect e = new Rect();

        static ListAdapter a(b b1)
        {
            return b1.d;
        }

        static boolean a(b b1, View view)
        {
            return x.G(view) && view.getGlobalVisibleRect(b1.e);
        }

        static void b(b b1)
        {
            b1.super.c();
        }

        public final CharSequence a()
        {
            return c;
        }

        public final void a(ListAdapter listadapter)
        {
            super.a(listadapter);
            d = listadapter;
        }

        public final void a(CharSequence charsequence)
        {
            c = charsequence;
        }

        final void b()
        {
            Drawable drawable = f();
            int i1 = 0;
            int i2;
            int j2;
            int k2;
            if (drawable != null)
            {
                drawable.getPadding(android.support.v7.widget.AppCompatSpinner.b(a));
                int j1;
                int k1;
                int l1;
                if (r.a(a))
                {
                    i1 = android.support.v7.widget.AppCompatSpinner.b(a).right;
                } else
                {
                    i1 = -android.support.v7.widget.AppCompatSpinner.b(a).left;
                }
            } else
            {
                Rect rect = android.support.v7.widget.AppCompatSpinner.b(a);
                android.support.v7.widget.AppCompatSpinner.b(a).right = 0;
                rect.left = 0;
            }
            i2 = a.getPaddingLeft();
            j2 = a.getPaddingRight();
            k2 = a.getWidth();
            if (AppCompatSpinner.c(a) == -2)
            {
                k1 = AppCompatSpinner.a(a, (SpinnerAdapter)d, f());
                l1 = a.getContext().getResources().getDisplayMetrics().widthPixels - android.support.v7.widget.AppCompatSpinner.b(a).left - android.support.v7.widget.AppCompatSpinner.b(a).right;
                j1 = k1;
                if (k1 > l1)
                {
                    j1 = l1;
                }
                d(Math.max(j1, k2 - i2 - j2));
            } else
            if (AppCompatSpinner.c(a) == -1)
            {
                d(k2 - i2 - j2);
            } else
            {
                d(AppCompatSpinner.c(a));
            }
            if (r.a(a))
            {
                i1 += k2 - j2 - j();
            } else
            {
                i1 += i2;
            }
            a(i1);
        }

        public final void c()
        {
            boolean flag = n();
            b();
            l();
            super.c();
            p().setChoiceMode(1);
            e(a.getSelectedItemPosition());
            ViewTreeObserver viewtreeobserver;
            if (!flag)
            {
                if ((viewtreeobserver = a.getViewTreeObserver()) != null)
                {
                    android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener(this) {

                        final b a;

                        public final void onGlobalLayout()
                        {
                            if (!b.a(a, a.a))
                            {
                                a.k();
                                return;
                            } else
                            {
                                a.b();
                                android.support.v7.widget.b.b(a);
                                return;
                            }
                        }

            
            {
                a = b1;
                super();
            }
                    };
                    viewtreeobserver.addOnGlobalLayoutListener(ongloballayoutlistener);
                    a(new android.widget.PopupWindow.OnDismissListener(this, ongloballayoutlistener) {

                        final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
                        final b b;

                        public final void onDismiss()
                        {
                            ViewTreeObserver viewtreeobserver = b.a.getViewTreeObserver();
                            if (viewtreeobserver != null)
                            {
                                viewtreeobserver.removeGlobalOnLayoutListener(a);
                            }
                        }

            
            {
                b = b1;
                a = ongloballayoutlistener;
                super();
            }
                    });
                    return;
                }
            }
        }

        public b(Context context, AttributeSet attributeset, int i1)
        {
            a = AppCompatSpinner.this;
            super(context, attributeset, i1);
            a(AppCompatSpinner.this);
            e();
            d();
            a(new _cls1(this, AppCompatSpinner.this));
        }
    }


    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private o d;
    private android.support.v7.widget.b e;
    private Context f;
    private j.b g;
    private SpinnerAdapter h;
    private boolean i;
    private b j;
    private int k;
    private final Rect l;

    public AppCompatSpinner(Context context)
    {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.spinnerStyle);
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
        Object obj1;
        int l1;
        super(context, attributeset, i1);
        l = new Rect();
        p p1 = p.a(context, attributeset, android.support.v7.appcompat.a.k.Spinner, i1);
        d = p1.c();
        e = new android.support.v7.widget.b(this, d);
        int k1 = p1.f(android.support.v7.appcompat.a.k.Spinner_popupTheme, 0);
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
        obj1 = null;
        obj = null;
        context = context.obtainStyledAttributes(attributeset, c, i1, 0);
        k1 = j1;
        obj = context;
        obj1 = context;
        if (!context.hasValue(0))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = context;
        obj1 = context;
        k1 = context.getInt(0, 0);
        l1 = k1;
        if (context != null)
        {
            context.recycle();
            l1 = k1;
        }
_L6:
        if (l1 == 1)
        {
            context = new b(f, attributeset, i1);
            obj = p.a(f, attributeset, android.support.v7.appcompat.a.k.Spinner, i1);
            k = ((p) (obj)).e(android.support.v7.appcompat.a.k.Spinner_android_dropDownWidth, -2);
            context.a(((p) (obj)).a(android.support.v7.appcompat.a.k.Spinner_android_popupBackground));
            context.a(p1.d(android.support.v7.appcompat.a.k.Spinner_android_prompt));
            ((p) (obj)).b();
            j = context;
            g = new j.b(this, context) {

                final b a;
                final AppCompatSpinner b;

                public final j a()
                {
                    return a;
                }

                public final boolean b()
                {
                    if (!AppCompatSpinner.a(b).n())
                    {
                        AppCompatSpinner.a(b).c();
                    }
                    return true;
                }

            
            {
                b = AppCompatSpinner.this;
                a = b1;
                super(view);
            }
            };
        }
_L2:
        p1.b();
        i = true;
        if (h != null)
        {
            setAdapter(h);
            h = null;
        }
        e.a(attributeset, i1);
        return;
        context;
        obj1 = obj;
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", context);
        l1 = j1;
        if (obj != null)
        {
            ((TypedArray) (obj)).recycle();
            l1 = j1;
        }
        continue; /* Loop/switch isn't completed */
        context;
        if (obj1 != null)
        {
            ((TypedArray) (obj1)).recycle();
        }
        throw context;
_L4:
        l1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int a(AppCompatSpinner appcompatspinner, SpinnerAdapter spinneradapter, Drawable drawable)
    {
        return appcompatspinner.a(spinneradapter, drawable);
    }

    private int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        int j1;
        if (spinneradapter == null)
        {
            j1 = 0;
        } else
        {
            int i1 = 0;
            View view = null;
            int k1 = 0;
            int j2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int k2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            j1 = Math.max(0, getSelectedItemPosition());
            int l2 = Math.min(spinneradapter.getCount(), j1 + 15);
            for (j1 = Math.max(0, j1 - (15 - (l2 - j1))); j1 < l2;)
            {
                int i2 = spinneradapter.getItemViewType(j1);
                int l1 = k1;
                if (i2 != k1)
                {
                    l1 = i2;
                    view = null;
                }
                view = spinneradapter.getView(j1, view, this);
                if (view.getLayoutParams() == null)
                {
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(j2, k2);
                i1 = Math.max(i1, view.getMeasuredWidth());
                j1++;
                k1 = l1;
            }

            j1 = i1;
            if (drawable != null)
            {
                drawable.getPadding(l);
                return i1 + (l.left + l.right);
            }
        }
        return j1;
    }

    static b a(AppCompatSpinner appcompatspinner)
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
            e.b();
        }
    }

    public int getDropDownHorizontalOffset()
    {
        if (j != null)
        {
            return j.h();
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
            return j.i();
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
            return j.f();
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

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (j != null && j.n())
        {
            j.k();
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
        if (j != null && !j.n())
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
                j.a(new a(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (e != null)
        {
            e.a();
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
            j.a(i1);
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
            j.b(i1);
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

    // Unreferenced inner class android/support/v7/widget/AppCompatSpinner$b$1

/* anonymous class */
    final class b._cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final AppCompatSpinner a;
        final b b;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            b.a.setSelection(i1);
            if (b.a.getOnItemClickListener() != null)
            {
                b.a.performItemClick(view, i1, b.a(b).getItemId(i1));
            }
            b.k();
        }

            
            {
                b = b1;
                a = appcompatspinner;
                super();
            }
    }

}
