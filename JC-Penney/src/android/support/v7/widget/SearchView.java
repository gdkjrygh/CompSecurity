// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.e;
import android.support.v7.b.d;
import android.support.v7.d.a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            aa, ap, at, ar, 
//            aq, as

public class SearchView extends aa
    implements a
{

    static final ap a = new ap();
    private static final boolean b;
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private CharSequence E;
    private boolean F;
    private int G;
    private SearchableInfo H;
    private Bundle I;
    private Runnable J;
    private final Runnable K;
    private Runnable L;
    private final WeakHashMap M;
    private final SearchAutoComplete c;
    private final View d;
    private final View e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private final ImageView j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final Intent n;
    private final Intent o;
    private final CharSequence p;
    private ar q;
    private aq r;
    private android.view.View.OnFocusChangeListener s;
    private as t;
    private android.view.View.OnClickListener u;
    private boolean v;
    private boolean w;
    private e x;
    private boolean y;
    private CharSequence z;

    private Intent a(String s1, Uri uri, String s2, String s3, int i1, String s4)
    {
        s1 = new Intent(s1);
        s1.addFlags(0x10000000);
        if (uri != null)
        {
            s1.setData(uri);
        }
        s1.putExtra("user_query", E);
        if (s3 != null)
        {
            s1.putExtra("query", s3);
        }
        if (s2 != null)
        {
            s1.putExtra("intent_extra_data_key", s2);
        }
        if (I != null)
        {
            s1.putExtra("app_data", I);
        }
        if (i1 != 0)
        {
            s1.putExtra("action_key", i1);
            s1.putExtra("action_msg", s4);
        }
        if (b)
        {
            s1.setComponent(H.getSearchActivity());
        }
        return s1;
    }

    private void a(int i1, String s1, String s2)
    {
        s1 = a("android.intent.action.SEARCH", null, null, s2, i1, s1);
        getContext().startActivity(s1);
    }

    static void a(SearchView searchview, boolean flag)
    {
        searchview.setImeVisibility(flag);
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        w = flag;
        Object obj;
        int i1;
        boolean flag1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (!TextUtils.isEmpty(c.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f.setVisibility(i1);
        b(flag1);
        obj = d;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = j;
        if (v)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj)).setVisibility(i1);
        i();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        c(flag);
        h();
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (!v || k == null)
        {
            return charsequence;
        } else
        {
            int i1 = (int)((double)c.getTextSize() * 1.25D);
            k.setBounds(0, 0, i1, i1);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.setSpan(new ImageSpan(k), 1, 2, 33);
            spannablestringbuilder.append(charsequence);
            return spannablestringbuilder;
        }
    }

    private void b(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!y)
            {
                break label0;
            }
            byte0 = byte1;
            if (!f())
            {
                break label0;
            }
            byte0 = byte1;
            if (!hasFocus())
            {
                break label0;
            }
            if (!flag)
            {
                byte0 = byte1;
                if (D)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        g.setVisibility(byte0);
    }

    private void c(boolean flag)
    {
        int i1;
        if (D && !c() && flag)
        {
            i1 = 0;
            g.setVisibility(8);
        } else
        {
            i1 = 8;
        }
        i.setVisibility(i1);
    }

    private boolean e()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (H == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!H.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!H.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = n;
_L7:
        flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        if (H.getVoiceSearchLaunchRecognizer())
        {
            intent = o;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean f()
    {
        return (y || D) && !c();
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(d.abc_search_view_preferred_width);
    }

    private void h()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!f())
            {
                break label0;
            }
            if (g.getVisibility() != 0)
            {
                byte0 = byte1;
                if (i.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        e.setVisibility(byte0);
    }

    private void i()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        Drawable drawable;
        boolean flag;
        int i1;
        if (!TextUtils.isEmpty(c.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (v && !F)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        imageview = h;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = h.getDrawable();
        if (drawable != null)
        {
            int ai[];
            if (flag)
            {
                ai = ENABLED_STATE_SET;
            } else
            {
                ai = EMPTY_STATE_SET;
            }
            drawable.setState(ai);
        }
    }

    private void j()
    {
        post(K);
    }

    private void k()
    {
        CharSequence charsequence = getQueryHint();
        SearchAutoComplete searchautocomplete = c;
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        searchautocomplete.setHint(b(((CharSequence) (obj))));
    }

    private void l()
    {
        boolean flag = true;
        c.setThreshold(H.getSuggestThreshold());
        c.setImeOptions(H.getImeOptions());
        int j1 = H.getInputType();
        int i1 = j1;
        if ((j1 & 0xf) == 1)
        {
            j1 &= 0xfffeffff;
            i1 = j1;
            if (H.getSuggestAuthority() != null)
            {
                i1 = j1 | 0x10000 | 0x80000;
            }
        }
        c.setInputType(i1);
        if (x != null)
        {
            x.a(null);
        }
        if (H.getSuggestAuthority() != null)
        {
            x = new at(getContext(), this, H, M);
            c.setAdapter(x);
            at at1 = (at)x;
            byte byte0 = flag;
            if (A)
            {
                byte0 = 2;
            }
            at1.a(byte0);
        }
    }

    private void m()
    {
        android.text.Editable editable = c.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (q == null || !q.a(editable.toString())))
        {
            if (H != null)
            {
                a(0, null, editable.toString());
            }
            setImeVisibility(false);
            n();
        }
    }

    private void n()
    {
        c.dismissDropDown();
    }

    private void o()
    {
        if (TextUtils.isEmpty(c.getText()))
        {
            if (v && (r == null || !r.a()))
            {
                clearFocus();
                a(true);
            }
            return;
        } else
        {
            c.setText("");
            c.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private void p()
    {
        a(false);
        c.requestFocus();
        setImeVisibility(true);
        if (u != null)
        {
            u.onClick(this);
        }
    }

    private void q()
    {
        a.a(c);
        a.b(c);
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(J);
        } else
        {
            removeCallbacks(J);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        c.setText(charsequence);
        SearchAutoComplete searchautocomplete = c;
        int i1;
        if (TextUtils.isEmpty(charsequence))
        {
            i1 = 0;
        } else
        {
            i1 = charsequence.length();
        }
        searchautocomplete.setSelection(i1);
    }

    public void a()
    {
        if (F)
        {
            return;
        } else
        {
            F = true;
            G = c.getImeOptions();
            c.setImeOptions(G | 0x2000000);
            c.setText("");
            setIconified(false);
            return;
        }
    }

    void a(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    public void a(CharSequence charsequence, boolean flag)
    {
        c.setText(charsequence);
        if (charsequence != null)
        {
            c.setSelection(c.length());
            E = charsequence;
        }
        if (flag && !TextUtils.isEmpty(charsequence))
        {
            m();
        }
    }

    public void b()
    {
        a("", false);
        clearFocus();
        a(true);
        c.setImeOptions(G);
        F = false;
    }

    public boolean c()
    {
        return w;
    }

    public void clearFocus()
    {
        B = true;
        setImeVisibility(false);
        super.clearFocus();
        c.clearFocus();
        B = false;
    }

    void d()
    {
        a(c());
        j();
        if (c.hasFocus())
        {
            q();
        }
    }

    public int getImeOptions()
    {
        return c.getImeOptions();
    }

    public int getInputType()
    {
        return c.getInputType();
    }

    public int getMaxWidth()
    {
        return C;
    }

    public CharSequence getQuery()
    {
        return c.getText();
    }

    public CharSequence getQueryHint()
    {
        if (z != null)
        {
            return z;
        }
        if (b && H != null && H.getHintId() != 0)
        {
            return getContext().getText(H.getHintId());
        } else
        {
            return p;
        }
    }

    int getSuggestionCommitIconResId()
    {
        return m;
    }

    int getSuggestionRowLayout()
    {
        return l;
    }

    public e getSuggestionsAdapter()
    {
        return x;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(K);
        post(L);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (c())
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
        if (C > 0)
        {
            i1 = Math.min(C, k1);
        } else
        {
            i1 = Math.min(getPreferredWidth(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (C > 0)
        {
            i1 = Math.min(C, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (C > 0)
        {
            i1 = C;
        } else
        {
            i1 = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        j();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (B || !isFocusable()) 
        {
            return false;
        }
        if (!c())
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

    public void setAppSearchData(Bundle bundle)
    {
        I = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            o();
            return;
        } else
        {
            p();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (v == flag)
        {
            return;
        } else
        {
            v = flag;
            a(flag);
            k();
            return;
        }
    }

    public void setImeOptions(int i1)
    {
        c.setImeOptions(i1);
    }

    public void setInputType(int i1)
    {
        c.setInputType(i1);
    }

    public void setMaxWidth(int i1)
    {
        C = i1;
        requestLayout();
    }

    public void setOnCloseListener(aq aq1)
    {
        r = aq1;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        s = onfocuschangelistener;
    }

    public void setOnQueryTextListener(ar ar1)
    {
        q = ar1;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        u = onclicklistener;
    }

    public void setOnSuggestionListener(as as)
    {
        t = as;
    }

    public void setQueryHint(CharSequence charsequence)
    {
        z = charsequence;
        k();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        A = flag;
        if (x instanceof at)
        {
            at at1 = (at)x;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            at1.a(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        H = searchableinfo;
        if (H != null)
        {
            if (b)
            {
                l();
            }
            k();
        }
        boolean flag;
        if (b && e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        D = flag;
        if (D)
        {
            c.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        y = flag;
        a(c());
    }

    public void setSuggestionsAdapter(e e1)
    {
        x = e1;
        c.setAdapter(x);
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

    private class SearchAutoComplete extends p
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
            b.d();
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
                        android.support.v7.widget.SearchView.a(b, false);
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
                if (android.support.v7.widget.SearchView.a(getContext()))
                {
                    android.support.v7.widget.SearchView.a.a(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            b = searchview;
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
            this(context, attributeset, b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

}
