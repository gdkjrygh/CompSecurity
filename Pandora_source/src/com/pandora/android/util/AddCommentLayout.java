// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

// Referenced classes of package com.pandora.android.util:
//            s

public class AddCommentLayout extends LinearLayout
{
    public static interface a
    {

        public abstract void a(String s1, String s2);
    }


    private View a;
    private EditText b;
    private Button c;
    private View d;
    private a e;
    private boolean f;
    private boolean g;
    private InputMethodManager h;

    public AddCommentLayout(Context context)
    {
        super(context);
        f = false;
        g = false;
        d();
    }

    public AddCommentLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        g = false;
        d();
    }

    public AddCommentLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = false;
        g = false;
        d();
    }

    static EditText a(AddCommentLayout addcommentlayout)
    {
        return addcommentlayout.b;
    }

    static View b(AddCommentLayout addcommentlayout)
    {
        return addcommentlayout.d;
    }

    static a c(AddCommentLayout addcommentlayout)
    {
        return addcommentlayout.e;
    }

    static Button d(AddCommentLayout addcommentlayout)
    {
        return addcommentlayout.c;
    }

    private void d()
    {
        a = LayoutInflater.from(getContext()).inflate(0x7f04001f, this, false);
        addView(a, 0);
        b = (EditText)findViewById(0x7f1000b2);
        c = (Button)findViewById(0x7f1000b4);
        d = findViewById(0x7f1000b3);
        h = (InputMethodManager)getContext().getSystemService("input_method");
        e();
    }

    private void e()
    {
        b.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final AddCommentLayout a;

            public void onFocusChange(View view, boolean flag)
            {
                if (!flag)
                {
                    a.a();
                }
            }

            
            {
                a = AddCommentLayout.this;
                super();
            }
        });
        b.addTextChangedListener(new TextWatcher() {

            final AddCommentLayout a;

            public void afterTextChanged(Editable editable)
            {
                editable = AddCommentLayout.b(a);
                int i;
                if (AddCommentLayout.a(a).getText().toString().trim().length() > 0)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                editable.setVisibility(i);
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                a = AddCommentLayout.this;
                super();
            }
        });
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final AddCommentLayout a;

            public void onClick(View view)
            {
                view = s.a(AddCommentLayout.a(a).getText());
                p.df.a.a("AddCommentLayout", (new StringBuilder()).append("commentButton.clicked: '").append(view).append("'").toString());
                if (AddCommentLayout.c(a) != null)
                {
                    AddCommentLayout.c(a).a(view, AddCommentLayout.d(a).getTag().toString());
                }
                AddCommentLayout.e(a);
                a.a();
                if (AddCommentLayout.f(a))
                {
                    a.b();
                }
            }

            
            {
                a = AddCommentLayout.this;
                super();
            }
        });
    }

    static void e(AddCommentLayout addcommentlayout)
    {
        addcommentlayout.f();
    }

    private void f()
    {
        if (b != null && d != null)
        {
            b.setText("");
            d.setVisibility(8);
        }
    }

    static boolean f(AddCommentLayout addcommentlayout)
    {
        return addcommentlayout.g;
    }

    public void a()
    {
        h.hideSoftInputFromWindow(b.getWindowToken(), 0);
    }

    public void a(String s1, String s2, String s3)
    {
        if (!s.a(s1))
        {
            c.setTag(s1);
            s1 = s2;
            if (s.a(s2))
            {
                s1 = getContext().getString(0x7f08022f);
            }
            c.setText(s1);
            s1 = s3;
            if (s.a(s3))
            {
                s1 = getContext().getString(0x7f0801ba);
            }
            b.setHint(s1);
            a.setVisibility(0);
            setVisibility(0);
            if (f)
            {
                b.requestFocus();
                h.showSoftInput(b, 1);
                return;
            }
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.setVisibility(8);
        }
        setVisibility(8);
        f();
    }

    public void c()
    {
        if (getVisibility() == 0)
        {
            b();
            a();
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && g)
        {
            b();
            return true;
        } else
        {
            return super.dispatchKeyEventPreIme(keyevent);
        }
    }

    public void setCommentButtonListener(a a1)
    {
        e = a1;
    }

    public void setForceKeyboard(boolean flag)
    {
        f = flag;
    }

    public void setHideOnClick(boolean flag)
    {
        g = flag;
    }
}
