// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.view:
//            a, b

public class ValidatingEditText extends EditText
{

    private static final int a[] = {
        0x7f010081
    };
    private static final int b[] = {
        0x7f010082
    };
    private static final int c[] = {
        0x7f010083
    };
    private boolean d;
    private boolean e;
    private String f;
    private p.co.b.b g;
    private TextWatcher h = new TextWatcher() {

        final ValidatingEditText a;

        public void afterTextChanged(Editable editable)
        {
            a.b();
            a.setError(false);
        }

        public void beforeTextChanged(CharSequence charsequence, int k, int l, int i1)
        {
        }

        public void onTextChanged(CharSequence charsequence, int k, int l, int i1)
        {
        }

            
            {
                a = ValidatingEditText.this;
                super();
            }
    };
    private android.view.View.OnFocusChangeListener i = new android.view.View.OnFocusChangeListener() {

        final ValidatingEditText a;

        public void onFocusChange(View view, boolean flag)
        {
            if (!flag)
            {
                view = a;
                if (!a.b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setError(flag);
            }
        }

            
            {
                a = ValidatingEditText.this;
                super();
            }
    };
    private a j = new b(this) {

        final ValidatingEditText a;

        public boolean a(a.a a1, MotionEvent motionevent)
        {
            super.a(a1, motionevent);
            if (motionevent.getAction() == 0)
            {
                if (a1 == a.a.a)
                {
                    if (!a.c() && !a.b())
                    {
                        a.d();
                        a.setError(true);
                    }
                } else
                if (a1 == a.a.c)
                {
                    a.setText("");
                    return true;
                }
            }
            return true;
        }

            
            {
                a = ValidatingEditText.this;
                super(validatingedittext1);
            }
    };

    public ValidatingEditText(Context context)
    {
        super(context);
        e();
    }

    public ValidatingEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e();
    }

    public ValidatingEditText(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e();
    }

    private void e()
    {
        setOnTouchListener(j);
        addTextChangedListener(h);
        setOnFocusChangeListener(i);
    }

    private void setErrorMessage(String s1)
    {
        f = s1;
    }

    boolean a()
    {
        return d;
    }

    public boolean b()
    {
        if (g == null)
        {
            throw new IllegalStateException("No validator set for this ValidatingEditText!");
        }
        int k = g.a(s.a(getText()));
        boolean flag;
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            setErrorMessage(getResources().getString(k));
        }
        refreshDrawableState();
        return flag;
    }

    public boolean c()
    {
        Editable editable = getEditableText();
        return editable == null || editable.length() == 0;
    }

    public void d()
    {
        s.e(f);
    }

    protected int[] onCreateDrawableState(int k)
    {
        int ai[] = super.onCreateDrawableState(k + 1);
        if (c())
        {
            mergeDrawableStates(ai, c);
            return ai;
        }
        if (d)
        {
            if (e)
            {
                mergeDrawableStates(ai, b);
                return ai;
            } else
            {
                mergeDrawableStates(ai, a);
                return ai;
            }
        } else
        {
            return super.onCreateDrawableState(k);
        }
    }

    public void setError(boolean flag)
    {
        boolean flag1 = false;
        if (c())
        {
            flag = false;
        }
        if (d != flag)
        {
            d = flag;
            flag1 = true;
        }
        if (flag1)
        {
            if (flag)
            {
                setTextColor(getResources().getColor(0x7f0b0054));
            } else
            {
                setTextColor(getResources().getColor(0x106000b));
            }
        }
        refreshDrawableState();
    }

    void setErrorPressed(boolean flag)
    {
        boolean flag1 = false;
        if (e != flag)
        {
            e = flag;
            flag1 = true;
        }
        if (flag1)
        {
            refreshDrawableState();
        }
    }

    public void setValidator(p.co.b.b b1)
    {
        g = b1;
        b();
    }

}
