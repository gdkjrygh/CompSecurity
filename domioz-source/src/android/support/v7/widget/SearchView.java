// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.a.e;
import android.support.v7.c.c;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, bz

public final class SearchView extends LinearLayoutCompat
    implements c
{

    static final bz a = new bz();
    private static final boolean b;
    private final SearchAutoComplete c;
    private final View d;
    private final View e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private final ImageView j;
    private android.view.View.OnClickListener k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private CharSequence r;
    private boolean s;
    private int t;
    private Runnable u;
    private final Runnable v;
    private Runnable w;

    static void a(SearchView searchview)
    {
        searchview.b(false);
    }

    private void a(boolean flag)
    {
label0:
        {
            boolean flag1 = true;
            byte byte0 = 8;
            m = flag;
            Object obj;
            Drawable drawable;
            int i1;
            int j1;
            int k1;
            if (flag)
            {
                j1 = 0;
            } else
            {
                j1 = 8;
            }
            if (!TextUtils.isEmpty(c.getText()))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f.setVisibility(j1);
            if (n && e() && hasFocus() && (i1 != 0 || !q))
            {
                j1 = 0;
            } else
            {
                j1 = 8;
            }
            g.setVisibility(j1);
            obj = d;
            if (flag)
            {
                j1 = 8;
            } else
            {
                j1 = 0;
            }
            ((View) (obj)).setVisibility(j1);
            obj = j;
            if (l)
            {
                j1 = 8;
            } else
            {
                j1 = 0;
            }
            ((ImageView) (obj)).setVisibility(j1);
            if (!TextUtils.isEmpty(c.getText()))
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 || l && !s)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            obj = h;
            if (k1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 8;
            }
            ((ImageView) (obj)).setVisibility(k1);
            drawable = h.getDrawable();
            if (drawable != null)
            {
                int ai[];
                if (j1 != 0)
                {
                    ai = ENABLED_STATE_SET;
                } else
                {
                    ai = EMPTY_STATE_SET;
                }
                drawable.setState(ai);
            }
            if (i1 == 0)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (q && !m && i1 != 0)
            {
                g.setVisibility(8);
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            i.setVisibility(i1);
            i1 = byte0;
            if (!e())
            {
                break label0;
            }
            if (g.getVisibility() != 0)
            {
                i1 = byte0;
                if (i.getVisibility() != 0)
                {
                    break label0;
                }
            }
            i1 = 0;
        }
        e.setVisibility(i1);
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            post(u);
        } else
        {
            removeCallbacks(u);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private int d()
    {
        return getContext().getResources().getDimensionPixelSize(e.d);
    }

    private boolean e()
    {
        return (n || q) && !m;
    }

    private void f()
    {
        post(v);
    }

    public final void a()
    {
        if (!s)
        {
            s = true;
            t = c.getImeOptions();
            c.setImeOptions(t | 0x2000000);
            c.setText("");
            a(false);
            c.requestFocus();
            b(true);
            if (k != null)
            {
                k.onClick(this);
                return;
            }
        }
    }

    public final void b()
    {
        c.setText("");
        c.setSelection(c.length());
        r = "";
        clearFocus();
        a(true);
        c.setImeOptions(t);
        s = false;
    }

    final void c()
    {
        a(m);
        f();
        if (c.hasFocus())
        {
            a.a(c);
            a.b(c);
        }
    }

    public final void clearFocus()
    {
        o = true;
        b(false);
        super.clearFocus();
        c.clearFocus();
        o = false;
    }

    protected final void onDetachedFromWindow()
    {
        removeCallbacks(v);
        post(w);
        super.onDetachedFromWindow();
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (m)
        {
            super.onMeasure(i1, j1);
            return;
        }
        l1 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = k1;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
        return;
_L2:
        if (p > 0)
        {
            i1 = Math.min(p, k1);
        } else
        {
            i1 = Math.min(d(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (p > 0)
        {
            i1 = Math.min(p, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (p > 0)
        {
            i1 = p;
        } else
        {
            i1 = d();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        f();
    }

    public final boolean requestFocus(int i1, Rect rect)
    {
        while (o || !isFocusable()) 
        {
            return false;
        }
        if (!m)
        {
            boolean flag = c.requestFocus(i1, rect);
            if (flag)
            {
                a(false);
            }
            return flag;
        } else
        {
            return super.requestFocus(i1, rect);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    private class SearchAutoComplete extends AppCompatAutoCompleteTextView
    {

        private int a;
        private SearchView b;

        public boolean enoughToFilter()
        {
            return a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            b.c();
        }

        public boolean onKeyPreIme(int i1, KeyEvent keyevent)
        {
            if (i1 == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        b.clearFocus();
                        SearchView.a(b);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i1, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && b.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext()))
                {
                    SearchView.a.c(this);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        public void setThreshold(int i1)
        {
            super.setThreshold(i1);
            a = i1;
        }

        public SearchAutoComplete(Context context)
        {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, b.p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

}
