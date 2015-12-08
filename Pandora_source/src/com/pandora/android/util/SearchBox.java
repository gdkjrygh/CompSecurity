// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.util:
//            s, x

public class SearchBox extends LinearLayout
{
    public static interface a
    {

        public abstract void a(String s1);
    }

    public static interface b
    {

        public abstract void a();
    }


    protected AutoCompleteTextView a;
    protected View b;
    private View c;
    private View d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private x i;
    private a j;
    private b k;
    private boolean l;
    private Runnable m;
    private android.widget.TextView.OnEditorActionListener n;
    private TextWatcher o;

    public SearchBox(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = false;
        n = new android.widget.TextView.OnEditorActionListener() {

            final SearchBox a;
            private long b;

            public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 3 || i1 == 0)
                {
                    if (System.currentTimeMillis() - b > 400L)
                    {
                        a.b();
                    }
                    b = System.currentTimeMillis();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = SearchBox.this;
                super();
                b = System.currentTimeMillis();
            }
        };
        o = new TextWatcher() {

            final SearchBox a;

            public void afterTextChanged(Editable editable)
            {
                if (com.pandora.android.util.SearchBox.b(a) != null && !com.pandora.android.util.SearchBox.b(a).equals(s.a(editable)))
                {
                    SearchBox.a(a, null);
                    com.pandora.android.util.SearchBox.b(a, null);
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                boolean flag = true;
                if (charsequence.length() > 0 && !s.u())
                {
                    a.b.setVisibility(0);
                }
                if (SearchBox.a(a) != null && charsequence.length() == 1)
                {
                    x x1 = SearchBox.a(a);
                    if (charsequence.charAt(0) != '@')
                    {
                        flag = false;
                    }
                    x1.a(flag, a.a);
                }
            }

            
            {
                a = SearchBox.this;
                super();
            }
        };
        a(attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f040072, this);
        a = (AutoCompleteTextView)findViewById(0x7f1001d7);
        a.addTextChangedListener(o);
        a.setOnEditorActionListener(n);
        if (!s.u())
        {
            b = findViewById(0x7f1001d8);
            if (b != null)
            {
                b.setVisibility(8);
                b.setOnClickListener(new android.view.View.OnClickListener() {

                    final SearchBox a;

                    public void onClick(View view)
                    {
                        a.a();
                        a.d();
                    }

            
            {
                a = SearchBox.this;
                super();
            }
                });
            }
        }
        d = findViewById(0x7f100080);
        setFocusable(true);
        if (!s.p())
        {
            i = new x(context);
        }
    }

    static x a(SearchBox searchbox)
    {
        return searchbox.i;
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.SearchBox);
        f = attributeset.getString(0);
        if (s.a(f))
        {
            f = getContext().getString(0x7f080131);
        }
        g = attributeset.getBoolean(1, false);
        h = attributeset.getBoolean(2, true);
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    static void a(SearchBox searchbox, android.view.View.OnClickListener onclicklistener)
    {
        searchbox.b(onclicklistener);
    }

    static void a(SearchBox searchbox, String s1)
    {
        searchbox.a(s1);
    }

    private void a(String s1)
    {
label0:
        {
            if (j != null)
            {
                if (i == null)
                {
                    break label0;
                }
                j.a(i.a(s1));
            }
            return;
        }
        j.a(s1);
    }

    static String b(SearchBox searchbox)
    {
        return searchbox.e;
    }

    static String b(SearchBox searchbox, String s1)
    {
        searchbox.e = s1;
        return s1;
    }

    private void b(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
        if (d != null)
        {
            d.setOnClickListener(onclicklistener);
        }
        a.clearFocus();
        a.setFocusable(false);
        a.setCursorVisible(false);
        setSmallHint(0x7f080123);
        j = null;
    }

    static void c(SearchBox searchbox)
    {
        searchbox.g();
    }

    static View d(SearchBox searchbox)
    {
        return searchbox.d;
    }

    private void g()
    {
        l = false;
        if (m != null)
        {
            Runnable runnable = m;
            m = null;
            runnable.run();
        }
    }

    private void setSmallHint(String s1)
    {
        Object obj = s1;
        if (g)
        {
            obj = s1;
            if (!isInEditMode())
            {
                obj = Html.fromHtml((new StringBuilder()).append("<small>").append(s1).append("</small>").toString());
            }
        }
        a.setHint(((CharSequence) (obj)));
    }

    public void a()
    {
        a.setText("");
        if (!s.u())
        {
            b.setVisibility(8);
        }
        if (k != null)
        {
            k.a();
        }
    }

    public void a(int i1, a a1)
    {
        a.setOnClickListener(null);
        if (d != null)
        {
            d.setOnClickListener(null);
        }
        a.setFocusableInTouchMode(true);
        a.setCursorVisible(true);
        a.setOnTouchListener(new android.view.View.OnTouchListener() {

            final SearchBox a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    a.a.setCursorVisible(true);
                }
                return false;
            }

            
            {
                a = SearchBox.this;
                super();
            }
        });
        a.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SearchBox a;

            public void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    a.a.setCursorVisible(true);
                    a.c();
                    return;
                } else
                {
                    a.a.setCursorVisible(false);
                    s.a(a.getContext(), a.a);
                    return;
                }
            }

            
            {
                a = SearchBox.this;
                super();
            }
        });
        if (s.u())
        {
            if (a.isInTouchMode())
            {
                a.requestFocus();
            } else
            {
                a.requestFocusFromTouch();
            }
            if (c == null)
            {
                c = findViewById(0x7f1001d9);
            }
            c.setVisibility(8);
            c.setOnClickListener(null);
            a.setPadding(getResources().getDimensionPixelSize(0x7f090082), 0, 0, 0);
        }
        if (i1 != -1)
        {
            setSmallHint(i1);
        }
        setSearchListener(a1);
    }

    public void a(TextWatcher textwatcher)
    {
        a.addTextChangedListener(textwatcher);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        if (s.u())
        {
            if (c == null)
            {
                c = findViewById(0x7f1001d9);
            }
            c.setVisibility(0);
            c.setOnClickListener(onclicklistener);
            a.setPadding(0, 0, 0, 0);
            a.setOnFocusChangeListener(null);
        }
        if (l)
        {
            m = new Runnable(onclicklistener) {

                final android.view.View.OnClickListener a;
                final SearchBox b;

                public void run()
                {
                    SearchBox.a(b, a);
                }

            
            {
                b = SearchBox.this;
                a = onclicklistener;
                super();
            }
            };
            return;
        } else
        {
            b(onclicklistener);
            return;
        }
    }

    public void b()
    {
        String s1 = s.a(a.getText());
        a(s1);
        e = s1;
    }

    public void b(TextWatcher textwatcher)
    {
        a.removeTextChangedListener(textwatcher);
    }

    public void c()
    {
        Context context;
        context = getContext();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        l = true;
        if (!((InputMethodManager)context.getSystemService("input_method")).showSoftInput(a, 1, new ResultReceiver(new Handler()) {

        final SearchBox a;

        protected void onReceiveResult(int i1, Bundle bundle)
        {
            SearchBox.c(a);
        }

            
            {
                a = SearchBox.this;
                super(handler);
            }
    }))
        {
            g();
        }
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        g();
        throw runtimeexception;
    }

    public void d()
    {
        a.clearFocus();
        a.setCursorVisible(false);
        s.a(getContext(), a);
    }

    public void e()
    {
        if (s.u() || a.getText().length() > 0)
        {
            return;
        }
        Object obj = (TextView)findViewById(0x7f1001d6);
        if (g && !isInEditMode())
        {
            String s1 = getResources().getString(0x7f080123);
            ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder()).append("<small>").append(s1).append("</small>").toString()));
        }
        ((TextView) (obj)).setVisibility(0);
        d.animate().translationX(-d.getWidth()).setDuration(100L).setListener(new AnimatorListenerAdapter() {

            final SearchBox a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                SearchBox.d(a).setVisibility(8);
            }

            
            {
                a = SearchBox.this;
                super();
            }
        }).start();
        ((TextView) (obj)).animate().translationX(-s.t().widthPixels).setDuration(250L).setListener(new AnimatorListenerAdapter(((TextView) (obj))) {

            final TextView a;
            final SearchBox b;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.setVisibility(8);
            }

            
            {
                b = SearchBox.this;
                a = textview;
                super();
            }
        }).start();
        ((TextView) (obj)).animate().alpha(0.0F).setDuration(250L).start();
        a.animate().alpha(1.0F).setDuration(250L).start();
        obj = ObjectAnimator.ofFloat(a, "translationX", new float[] {
            (float)s.t().widthPixels, (float)(-d.getWidth())
        });
        ((ObjectAnimator) (obj)).setDuration(250L);
        ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator(1.0F));
        ((ObjectAnimator) (obj)).start();
    }

    public void f()
    {
        if (s.u())
        {
            return;
        } else
        {
            d.setTranslationX(-d.getWidth());
            a.setTranslationX(-d.getWidth());
            a.animate().translationX(0.0F).setDuration(100L).start();
            d.animate().translationX(0.0F).setDuration(100L).setStartDelay(150L).start();
            return;
        }
    }

    public String getSearchText()
    {
        return s.a(a.getText());
    }

    public void onAttachedToWindow()
    {
        if (!isInEditMode())
        {
            com.pandora.android.provider.b.a.e().c(this);
        }
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        if (!isInEditMode())
        {
            com.pandora.android.provider.b.a.e().b(this);
        }
        super.onDetachedFromWindow();
    }

    public void setHint(int i1)
    {
        a.setHint(getResources().getString(i1));
    }

    public void setSearchListener(a a1)
    {
        j = a1;
    }

    public void setSearchText(CharSequence charsequence)
    {
        a.setText(charsequence);
    }

    public void setSearchTextChangedListener(b b1)
    {
        k = b1;
    }

    public void setSmallHint(int i1)
    {
        setSmallHint(getResources().getString(i1));
    }
}
