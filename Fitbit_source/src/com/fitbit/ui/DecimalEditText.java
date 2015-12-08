// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.fitbit.customui.a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.ui:
//            EditText, c

public class DecimalEditText extends EditText
{
    public class a
        implements InputFilter
    {

        final DecimalEditText a;

        private CharSequence a(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
        {
            if (a.h)
            {
                return charsequence;
            }
            if (String.valueOf(charsequence.subSequence(i, j)).length() == 0 && k - l != 0)
            {
                return spanned.subSequence(k, l);
            } else
            {
                return "";
            }
        }

        public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
        {
            if (!a.g && !a.h) goto _L2; else goto _L1
_L1:
            return charsequence;
_L2:
            char c1;
            String s;
            s = String.valueOf(charsequence.subSequence(i, j));
            s = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(s).append(spanned.subSequence(l, spanned.length())).toString();
            c1 = a.d.getDecimalFormatSymbols().getDecimalSeparator();
            s = s.replace(String.valueOf(a.d.getDecimalFormatSymbols().getGroupingSeparator()), "");
            if (s.length() != 0) goto _L4; else goto _L3
_L3:
            double d1 = 0.0D;
_L6:
            if (d1 > a.f())
            {
                return a(charsequence, i, j, spanned, k, l);
            }
            break; /* Loop/switch isn't completed */
_L4:
            d1 = a.d.parse(s).doubleValue();
            if (true) goto _L6; else goto _L5
_L5:
            Object obj = com.fitbit.ui.DecimalEditText.a(s, c1);
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((String) (obj)).length() <= a.g())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = a(charsequence, i, j, spanned, k, l);
            return ((CharSequence) (obj));
            ParseException parseexception;
            parseexception;
            if (!s.equals(String.valueOf(c1)))
            {
                return a(charsequence, i, j, spanned, k, l);
            }
            if (true) goto _L1; else goto _L7
_L7:
        }

        public a()
        {
            a = DecimalEditText.this;
            super();
        }
    }

    public class b
        implements TextWatcher
    {

        final DecimalEditText a;
        private boolean b;
        private int c;
        private int d;

        public void afterTextChanged(Editable editable)
        {
            if (b || a.g || a.h)
            {
                return;
            }
            b = true;
            char c1;
            Object obj;
            int i;
            char c3;
            c3 = a.d.getDecimalFormatSymbols().getGroupingSeparator();
            c1 = a.d.getDecimalFormatSymbols().getDecimalSeparator();
            obj = new StringBuilder(editable.length());
            i = editable.length() - 1;
            int k = -1;
_L15:
            if (i < 0) goto _L2; else goto _L1
_L1:
            char c2 = editable.charAt(i);
            if (i != d && c2 != c3) goto _L4; else goto _L3
_L3:
            if (c > i)
            {
                c = c - 1;
            }
              goto _L5
_L4:
            ((StringBuilder) (obj)).append(c2);
            int j;
            j = k;
            if (c2 == c1)
            {
                j = i;
            }
              goto _L6
_L2:
            String s = ((StringBuilder) (obj)).reverse().toString();
            if (k != -1) goto _L8; else goto _L7
_L7:
            editable = s;
              goto _L9
_L20:
            if (i + 1 >= editable.length() || editable.charAt(i) != '0') goto _L11; else goto _L10
_L10:
            if (c > i)
            {
                c = c - 1;
            }
              goto _L12
_L8:
            editable = s.substring(0, k);
              goto _L9
_L17:
            obj = String.valueOf(c1);
              goto _L13
_L19:
            s = s.substring(k + 1);
              goto _L14
_L11:
            String s1;
            editable = editable.substring(i);
            s1 = a.d.format(a.d.parse(editable));
            i = s1.length() - 1;
            j = editable.length() - 1;
_L21:
            if (i < 0 || j < 0)
            {
                break MISSING_BLOCK_LABEL_390;
            }
            if (s1.charAt(i) == editable.charAt(j))
            {
                k = j - 1;
                break MISSING_BLOCK_LABEL_565;
            }
            k = j;
            if (c <= j + 1)
            {
                break MISSING_BLOCK_LABEL_565;
            }
            c = c + 1;
            k = j;
            break MISSING_BLOCK_LABEL_565;
            editable;
            editable.printStackTrace();
            b = false;
            return;
            editable = (new StringBuilder()).append(s1).append(((String) (obj))).append(s).toString();
            a.setText(editable);
            if (c != -1 && editable.length() > 0)
            {
                a.setSelection(Math.min(c, editable.length()));
            }
            b = false;
            return;
            editable;
            a.setSelection(0);
            editable.printStackTrace();
            b = false;
            return;
            editable;
            b = false;
            throw editable;
_L5:
            j = k;
            if (k != -1)
            {
                j = k;
                if (k > i)
                {
                    j = k - 1;
                }
            }
_L6:
            i--;
            k = j;
              goto _L15
_L9:
            if (k != -1) goto _L17; else goto _L16
_L16:
            obj = "";
_L13:
            if (k != -1) goto _L19; else goto _L18
_L18:
            s = "";
_L14:
            i = 0;
              goto _L20
_L12:
            i++;
              goto _L20
            i--;
            j = k;
              goto _L21
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (b || a.g || a.h)
            {
                return;
            }
            c = i + k;
            if (j == 1 && k == 0 && charsequence.charAt(i) == a.d.getDecimalFormatSymbols().getGroupingSeparator() && a.getSelectionStart() == i + 1)
            {
                d = i - 1;
                return;
            } else
            {
                d = -1;
                return;
            }
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public b()
        {
            a = DecimalEditText.this;
            super();
            d = -1;
        }
    }


    public static final int b = 2;
    public static final double c = 999999.98999999999D;
    protected final DecimalFormat d;
    protected int e;
    protected double f;
    protected boolean g;
    protected boolean h;

    public DecimalEditText(Context context)
    {
        this(context, null);
    }

    public DecimalEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public DecimalEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new DecimalFormat();
        e = 2;
        f = 999999.98999999999D;
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.DecimalEditText, i, 0);
        boolean flag = context.getBoolean(0, true);
        context.recycle();
        b(flag);
    }

    public DecimalEditText(Context context, AttributeSet attributeset, int i, boolean flag)
    {
        super(context, attributeset, i);
        d = new DecimalFormat();
        e = 2;
        f = 999999.98999999999D;
    }

    protected static String a(String s, char c1)
    {
        int i = s.indexOf(c1);
        s = a(s.split((new StringBuilder()).append("\\").append(String.valueOf(c1)).toString()));
        if (i != 0 && s.length > 1)
        {
            return s[1];
        }
        if (i == 0 && s.length > 0)
        {
            return s[0];
        } else
        {
            return null;
        }
    }

    private static String[] a(String as[])
    {
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s.length() > 0)
            {
                arraylist.add(s);
            }
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private void b(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        b(i);
        a(new InputFilter[] {
            new a()
        });
        addTextChangedListener(new b());
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    protected transient void a(InputFilter ainputfilter[])
    {
        InputFilter ainputfilter1[] = getFilters();
        InputFilter ainputfilter2[] = new InputFilter[ainputfilter1.length + ainputfilter.length];
        System.arraycopy(ainputfilter1, 0, ainputfilter2, 0, ainputfilter1.length);
        System.arraycopy(ainputfilter, 0, ainputfilter2, ainputfilter1.length, ainputfilter.length);
        setFilters(ainputfilter2);
    }

    public void b(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (e == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != 0)
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            setKeyListener(null);
        }
        e = i;
        if (i == 0)
        {
            setKeyListener(new com.fitbit.customui.a());
            return;
        } else
        {
            setKeyListener(new c());
            return;
        }
    }

    public void b(CharSequence charsequence)
    {
        g = true;
        setText(charsequence);
        g = false;
    }

    public void d(double d1)
    {
        f = d1;
    }

    public double f()
    {
        return f;
    }

    public int g()
    {
        return e;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
    }
}
