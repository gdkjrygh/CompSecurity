// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abr;
import abv;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import os;
import sr;
import wc;
import we;
import yw;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat

public class SearchView extends LinearLayoutCompat
    implements yw
{

    static final abr a = new abr();
    private static final boolean b;
    private Runnable A = new Runnable() {

        private SearchView a;

        public final void run()
        {
            InputMethodManager inputmethodmanager;
            SearchView searchview;
            abr abr1;
            inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
            if (inputmethodmanager == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            abr1 = SearchView.a;
            searchview = a;
            if (abr1.d == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            abr1.d.invoke(inputmethodmanager, new Object[] {
                Integer.valueOf(0), null
            });
            return;
            Exception exception;
            exception;
            inputmethodmanager.showSoftInput(searchview, 0);
            return;
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private final Runnable B;
    private Runnable C = new Runnable() {

        public final void run()
        {
            SearchView.e();
        }

    };
    private final android.view.View.OnClickListener D;
    private android.view.View.OnKeyListener E = new android.view.View.OnKeyListener() {

        public final boolean onKey(View view, int j1, KeyEvent keyevent)
        {
            SearchView.h();
            return false;
        }

    };
    private final android.widget.TextView.OnEditorActionListener F;
    private final android.widget.AdapterView.OnItemClickListener G;
    private final android.widget.AdapterView.OnItemSelectedListener H;
    private TextWatcher I = new TextWatcher() {

        private SearchView a;

        public final void afterTextChanged(Editable editable)
        {
        }

        public final void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
        {
            SearchView.a(a, charsequence);
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private final SearchAutoComplete c;
    private final View d;
    private final View e;
    private final View f;
    private final ImageView i;
    private final ImageView j;
    private final ImageView k;
    private final ImageView l;
    private final View m;
    private final ImageView n;
    private final Drawable o;
    private final Intent p;
    private final Intent q;
    private final CharSequence r;
    private boolean s;
    private boolean t;
    private CharSequence u;
    private boolean v;
    private int w;
    private CharSequence x;
    private boolean y;
    private int z;

    public SearchView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010118);
    }

    public SearchView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        B = new Runnable() {

            private SearchView a;

            public final void run()
            {
                SearchView.a(a);
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        new WeakHashMap();
        D = new android.view.View.OnClickListener() {

            private SearchView a;

            public final void onClick(View view)
            {
                if (view == SearchView.c(a))
                {
                    SearchView.d(a);
                } else
                {
                    if (view == SearchView.e(a))
                    {
                        SearchView.f(a);
                        return;
                    }
                    if (view == SearchView.g(a))
                    {
                        SearchView.h(a);
                        return;
                    }
                    if (view == SearchView.i(a))
                    {
                        SearchView.g();
                        return;
                    }
                    if (view == SearchView.j(a))
                    {
                        SearchView.k(a);
                        return;
                    }
                }
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        F = new android.widget.TextView.OnEditorActionListener() {

            private SearchView a;

            public final boolean onEditorAction(TextView textview, int j1, KeyEvent keyevent)
            {
                SearchView.h(a);
                return true;
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        G = new android.widget.AdapterView.OnItemClickListener() {

            private SearchView a;

            public final void onItemClick(AdapterView adapterview, View view, int j1, long l1)
            {
                SearchView.a(a, j1);
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        H = new android.widget.AdapterView.OnItemSelectedListener() {

            private SearchView a;

            public final void onItemSelected(AdapterView adapterview, View view, int j1, long l1)
            {
                SearchView.b(a, j1);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        attributeset = wc.a(context, attributeset, sr.aY, i1);
        attributeset.a();
        LayoutInflater.from(context).inflate(attributeset.e(sr.bi, 0x7f030017), this, true);
        c = (SearchAutoComplete)findViewById(0x7f11028e);
        c.a = this;
        d = findViewById(0x7f11028b);
        e = findViewById(0x7f11028d);
        f = findViewById(0x7f110290);
        i = (ImageView)findViewById(0x7f11028a);
        j = (ImageView)findViewById(0x7f110291);
        k = (ImageView)findViewById(0x7f11028f);
        l = (ImageView)findViewById(0x7f110292);
        n = (ImageView)findViewById(0x7f11028c);
        e.setBackgroundDrawable(attributeset.a(sr.bj));
        f.setBackgroundDrawable(attributeset.a(sr.bn));
        i.setImageDrawable(attributeset.a(sr.bm));
        j.setImageDrawable(attributeset.a(sr.bg));
        k.setImageDrawable(attributeset.a(sr.bd));
        l.setImageDrawable(attributeset.a(sr.bp));
        n.setImageDrawable(attributeset.a(sr.bm));
        o = attributeset.a(sr.bl);
        attributeset.e(sr.bo, 0x7f030016);
        attributeset.e(sr.be, 0);
        i.setOnClickListener(D);
        k.setOnClickListener(D);
        j.setOnClickListener(D);
        l.setOnClickListener(D);
        c.setOnClickListener(D);
        c.addTextChangedListener(I);
        c.setOnEditorActionListener(F);
        c.setOnItemClickListener(G);
        c.setOnItemSelectedListener(H);
        c.setOnKeyListener(E);
        c.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            public final void onFocusChange(View view, boolean flag1)
            {
                SearchView.f();
            }

        });
        boolean flag = attributeset.a(sr.bh, true);
        if (s != flag)
        {
            s = flag;
            a(flag);
            n();
        }
        i1 = attributeset.c(sr.bc, -1);
        if (i1 != -1)
        {
            w = i1;
            requestLayout();
        }
        r = attributeset.c(sr.bf);
        u = attributeset.c(sr.bk);
        i1 = attributeset.a(sr.ba, -1);
        if (i1 != -1)
        {
            c.setImeOptions(i1);
        }
        i1 = attributeset.a(sr.bb, -1);
        if (i1 != -1)
        {
            c.setInputType(i1);
        }
        setFocusable(attributeset.a(sr.aZ, true));
        ((wc) (attributeset)).a.recycle();
        p = new Intent("android.speech.action.WEB_SEARCH");
        p.addFlags(0x10000000);
        p.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        q = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        q.addFlags(0x10000000);
        m = findViewById(c.getDropDownAnchor());
        if (m != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                m.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                    private SearchView a;

                    public final void onLayoutChange(View view, int j1, int k1, int l1, int i2, int j2, int k2, 
                            int l2, int i3)
                    {
                        SearchView.b(a);
                    }

            
            {
                a = SearchView.this;
                super();
            }
                });
            } else
            {
                m.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    private SearchView a;

                    public final void onGlobalLayout()
                    {
                        SearchView.b(a);
                    }

            
            {
                a = SearchView.this;
                super();
            }
                });
            }
        }
        a(s);
        n();
    }

    private Intent a(Cursor cursor)
    {
        Object obj = abv.a(cursor, "suggest_intent_action");
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            throw new NullPointerException();
        }
          goto _L2
_L11:
        String s1 = abv.a(cursor, "suggest_intent_data");
        Object obj1;
        if (b && s1 == null)
        {
            String s2;
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            int i1;
            try
            {
                i1 = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i1 = -1;
            }
            Log.w("SearchView", (new StringBuilder("Search suggestions cursor at row ")).append(i1).append(" returned exception.").toString(), ((Throwable) (obj)));
            return null;
        }
        obj1 = s1;
        if (s1 == null) goto _L4; else goto _L3
_L3:
        s2 = abv.a(cursor, "suggest_intent_data_id");
        obj1 = s1;
        if (s2 == null) goto _L4; else goto _L5
_L5:
        obj1 = (new StringBuilder()).append(s1).append("/").append(Uri.encode(s2)).toString();
          goto _L4
_L9:
        s2 = abv.a(cursor, "suggest_intent_query");
        s1 = abv.a(cursor, "suggest_intent_extra_data");
        obj = new Intent(((String) (obj)));
        ((Intent) (obj)).addFlags(0x10000000);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        ((Intent) (obj)).setData(((Uri) (obj1)));
        ((Intent) (obj)).putExtra("user_query", x);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        ((Intent) (obj)).putExtra("query", s2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        ((Intent) (obj)).putExtra("intent_extra_data_key", s1);
        if (b)
        {
            throw new NullPointerException();
        }
        break; /* Loop/switch isn't completed */
_L7:
        obj1 = Uri.parse(((String) (obj1)));
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj == null)
        {
            obj = "android.intent.action.SEARCH";
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        obj1 = null;
        if (true) goto _L9; else goto _L8
_L8:
        return ((Intent) (obj));
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void a(SearchView searchview)
    {
        int ai[];
        Drawable drawable;
        if (searchview.c.hasFocus())
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable = searchview.e.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        drawable = searchview.f.getBackground();
        if (drawable != null)
        {
            drawable.setState(ai);
        }
        searchview.invalidate();
    }

    static void a(SearchView searchview, CharSequence charsequence)
    {
        Editable editable = searchview.c.getText();
        searchview.x = editable;
        TextUtils.isEmpty(editable);
        searchview.j();
        searchview.o();
        searchview.l();
        searchview.k();
        charsequence.toString();
    }

    private void a(boolean flag)
    {
label0:
        {
            boolean flag1 = false;
            t = flag;
            View view;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            TextUtils.isEmpty(c.getText());
            i.setVisibility(i1);
            j();
            view = d;
            if (flag)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
            if (n.getDrawable() != null)
            {
                i1 = ((flag1) ? 1 : 0);
                if (!s)
                {
                    break label0;
                }
            }
            i1 = 8;
        }
        n.setVisibility(i1);
        l();
        o();
        k();
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static boolean a(SearchView searchview, int i1)
    {
        throw new NullPointerException();
    }

    static void b(SearchView searchview)
    {
        if (searchview.m.getWidth() > 1)
        {
            Resources resources = searchview.getContext().getResources();
            int k1 = searchview.e.getPaddingLeft();
            Rect rect = new Rect();
            boolean flag = we.a(searchview);
            int i1;
            int j1;
            int l1;
            int i2;
            if (searchview.s)
            {
                i1 = resources.getDimensionPixelSize(0x7f0c0059);
                i1 = resources.getDimensionPixelSize(0x7f0c005a) + i1;
            } else
            {
                i1 = 0;
            }
            searchview.c.getDropDownBackground().getPadding(rect);
            if (flag)
            {
                j1 = -rect.left;
            } else
            {
                j1 = k1 - (rect.left + i1);
            }
            searchview.c.setDropDownHorizontalOffset(j1);
            j1 = searchview.m.getWidth();
            l1 = rect.left;
            i2 = rect.right;
            searchview.c.setDropDownWidth((i1 + (j1 + l1 + i2)) - k1);
        }
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            post(A);
        } else
        {
            removeCallbacks(A);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    static boolean b(SearchView searchview, int i1)
    {
        searchview.c.getText();
        throw new NullPointerException();
    }

    static ImageView c(SearchView searchview)
    {
        return searchview.i;
    }

    static void d(SearchView searchview)
    {
        searchview.p();
    }

    static ImageView e(SearchView searchview)
    {
        return searchview.k;
    }

    static os e()
    {
        return null;
    }

    static android.view.View.OnFocusChangeListener f()
    {
        return null;
    }

    static void f(SearchView searchview)
    {
        if (TextUtils.isEmpty(searchview.c.getText()))
        {
            if (searchview.s)
            {
                searchview.clearFocus();
                searchview.a(true);
            }
            return;
        } else
        {
            searchview.c.setText("");
            searchview.c.requestFocus();
            searchview.b(true);
            return;
        }
    }

    static ImageView g(SearchView searchview)
    {
        return searchview.j;
    }

    static void g()
    {
    }

    static SearchableInfo h()
    {
        return null;
    }

    static void h(SearchView searchview)
    {
        Editable editable = searchview.c.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0)
        {
            searchview.b(false);
            searchview.c.dismissDropDown();
        }
    }

    private int i()
    {
        return getContext().getResources().getDimensionPixelSize(0x7f0c0062);
    }

    static ImageView i(SearchView searchview)
    {
        return searchview.l;
    }

    static SearchAutoComplete j(SearchView searchview)
    {
        return searchview.c;
    }

    private void j()
    {
        j.setVisibility(8);
    }

    private void k()
    {
        f.setVisibility(8);
    }

    static void k(SearchView searchview)
    {
        searchview.q();
    }

    private void l()
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
            if (s && !y)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        imageview = k;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = k.getDrawable();
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

    static void l(SearchView searchview)
    {
        searchview.b(false);
    }

    private void m()
    {
        post(B);
    }

    private void n()
    {
        Object obj;
        Object obj1;
        SearchAutoComplete searchautocomplete;
        if (u != null)
        {
            obj1 = u;
        } else
        {
            obj1 = r;
        }
        searchautocomplete = c;
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        obj1 = obj;
        if (s)
        {
            if (o == null)
            {
                obj1 = obj;
            } else
            {
                int i1 = (int)((double)c.getTextSize() * 1.25D);
                o.setBounds(0, 0, i1, i1);
                obj1 = new SpannableStringBuilder("   ");
                ((SpannableStringBuilder) (obj1)).setSpan(new ImageSpan(o), 1, 2, 33);
                ((SpannableStringBuilder) (obj1)).append(((CharSequence) (obj)));
            }
        }
        searchautocomplete.setHint(((CharSequence) (obj1)));
    }

    private void o()
    {
        l.setVisibility(8);
    }

    private void p()
    {
        a(false);
        c.requestFocus();
        b(true);
    }

    private void q()
    {
        abr abr1 = a;
        SearchAutoComplete searchautocomplete = c;
        Exception exception;
        if (abr1.a != null)
        {
            try
            {
                abr1.a.invoke(searchautocomplete, new Object[0]);
            }
            catch (Exception exception1) { }
        }
        abr1 = a;
        searchautocomplete = c;
        if (abr1.b == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        abr1.b.invoke(searchautocomplete, new Object[0]);
        return;
        exception;
    }

    public final void a()
    {
        if (y)
        {
            return;
        } else
        {
            y = true;
            z = c.getImeOptions();
            c.setImeOptions(z | 0x2000000);
            c.setText("");
            p();
            return;
        }
    }

    public final void a(CharSequence charsequence)
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

    public final void b()
    {
        c.setText("");
        c.setSelection(c.length());
        x = "";
        clearFocus();
        a(true);
        c.setImeOptions(z);
        y = false;
    }

    final void c()
    {
        a(t);
        m();
        if (c.hasFocus())
        {
            q();
        }
    }

    public void clearFocus()
    {
        v = true;
        b(false);
        super.clearFocus();
        c.clearFocus();
        v = false;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(B);
        post(C);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (t)
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
        if (w > 0)
        {
            i1 = Math.min(w, k1);
        } else
        {
            i1 = Math.min(i(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (w > 0)
        {
            i1 = Math.min(w, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (w > 0)
        {
            i1 = w;
        } else
        {
            i1 = i();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        m();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (v || !isFocusable()) 
        {
            return false;
        }
        if (!t)
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

        SearchView a;
        private int b;

        public boolean enoughToFilter()
        {
            return b <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            a.c();
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
                        a.clearFocus();
                        SearchView.l(a);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i1, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            abr abr1;
            super.onWindowFocusChanged(flag);
            if (!flag || !a.hasFocus() || getVisibility() != 0)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
            if (!SearchView.a(getContext()))
            {
                break MISSING_BLOCK_LABEL_85;
            }
            abr1 = SearchView.a;
            if (abr1.c == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            abr1.c.invoke(this, new Object[] {
                Boolean.valueOf(true)
            });
            return;
            Exception exception;
            exception;
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
            b = i1;
        }

        public SearchAutoComplete(Context context)
        {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, 0x7f010137);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            b = getThreshold();
        }
    }

}
