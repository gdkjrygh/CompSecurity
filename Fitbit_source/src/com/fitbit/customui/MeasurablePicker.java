// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.data.domain.Measurable;
import com.fitbit.data.domain.m;
import com.fitbit.e.a;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.bq;
import com.fitbit.util.format.e;
import java.text.DecimalFormat;
import java.text.ParseException;

public abstract class MeasurablePicker extends LinearLayout
{
    public static interface a
    {

        public abstract void a(Object obj);
    }

    public abstract class b
    {

        protected Measurable b;
        protected Measurable c;
        protected Measurable d;
        final MeasurablePicker e;

        private double a()
        {
            if (e())
            {
                return (double)(Math.round(d.a(c.a()).b()) / (long)((int)com.fitbit.customui.MeasurablePicker.a(e) + 1));
            } else
            {
                return d.a(b.a()).b();
            }
        }

        private String a(double d1, String s1)
        {
            return String.format(e.getContext().getString(0x7f080220), new Object[] {
                com.fitbit.util.format.e.a(d1, MeasurablePicker.h(e)), s1
            });
        }

        private String a(double d1, String s1, boolean flag)
        {
            if (MeasurablePicker.d(e) && b.b() == -1D)
            {
                return s1;
            }
            if (!flag)
            {
                return a(d1, s1);
            } else
            {
                return a(d1);
            }
        }

        private String a(Measurable measurable, boolean flag)
        {
            return a(measurable.b(), ((m)measurable.a()).getShortDisplayName(), flag);
        }

        private boolean a(Measurable measurable, double d1)
        {
            return a(measurable, false).equals(a(d1, ((m)measurable.a()).getShortDisplayName(), false));
        }

        private double h()
        {
            if (e())
            {
                return (double)(Math.round(d.a(c.a()).b()) % (long)((int)com.fitbit.customui.MeasurablePicker.a(e) + 1));
            } else
            {
                return 0.0D;
            }
        }

        protected String a(double d1)
        {
            DecimalFormat decimalformat;
            if (e())
            {
                decimalformat = new DecimalFormat("#");
            } else
            {
                decimalformat = new DecimalFormat();
                decimalformat.setMaximumFractionDigits(MeasurablePicker.h(e));
            }
            return decimalformat.format(d1);
        }

        public String a(boolean flag)
        {
            Measurable measurable = b;
            if (flag || e.j.getVisibility() == 0 && !e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return a(measurable, flag);
        }

        protected void a(Measurable measurable)
        {
            d = measurable;
        }

        protected void a(Measurable measurable, Measurable measurable1)
        {
            b = measurable;
            c = measurable1;
            b();
        }

        public String b(boolean flag)
        {
            return a(c, flag);
        }

        protected void b()
        {
            b.a(a());
            if (e())
            {
                c.a(h());
            }
            e.c(MeasurablePicker.f(e));
        }

        public void b(double d1)
        {
            b.a(d1);
            c();
        }

        public void b(Measurable measurable)
        {
            measurable = measurable.a(d.a());
            d.a(measurable.b());
            b();
        }

        protected void c()
        {
            double d2 = b.a(d.a()).b();
            double d1;
            boolean flag;
            boolean flag1;
            if (b.b() == a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            d1 = d2;
            if (e())
            {
                d1 = d2 + c.a(d.a()).b();
                flag1 = flag & a(c, h());
            }
            if (!flag1)
            {
                d.a(d1);
                MeasurablePicker.g(e);
            }
        }

        public void c(double d1)
        {
            c.a(d1);
            c();
        }

        protected Measurable d()
        {
            if (d == null || b == null)
            {
                return null;
            } else
            {
                return d.a(b.a());
            }
        }

        public boolean e()
        {
            return c != null;
        }

        public double f()
        {
            return b.b();
        }

        public double g()
        {
            return c.b();
        }

        public b()
        {
            e = MeasurablePicker.this;
            super();
        }
    }


    protected static final String d = "MeasurablePicker";
    private int A;
    private int B;
    private int C;
    private final android.view.View.OnFocusChangeListener a;
    private final android.view.View.OnLongClickListener b;
    private final android.view.View.OnLongClickListener c;
    protected final DecimalEditText e;
    protected final int f;
    protected final DecimalEditText g;
    protected final int h;
    protected b i;
    protected Spinner j;
    protected boolean k;
    protected boolean l;
    protected float m;
    private final android.view.View.OnClickListener n;
    private final TextWatcher o;
    private float p;
    private final android.view.View.OnFocusChangeListener q;
    private int r;
    private boolean s;
    private android.widget.TextView.OnEditorActionListener t;
    private final android.widget.TextView.OnEditorActionListener u;
    private a v;
    private boolean w;
    private final TextWatcher x;
    private double y;
    private CharSequence z;

    public MeasurablePicker(Context context)
    {
        this(context, null);
    }

    public MeasurablePicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = h();
        b = new android.view.View.OnLongClickListener() {

            final MeasurablePicker a;

            public boolean onLongClick(View view)
            {
                a.e.requestFocus();
                return false;
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        c = new android.view.View.OnLongClickListener() {

            final MeasurablePicker a;

            public boolean onLongClick(View view)
            {
                a.g.requestFocus();
                return false;
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        n = new android.view.View.OnClickListener() {

            final MeasurablePicker a;

            public void onClick(View view)
            {
                view.getOnFocusChangeListener().onFocusChange(view, true);
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        o = new TextWatcher() {

            final MeasurablePicker a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                if (!a.l) goto _L2; else goto _L1
_L1:
                charsequence = a.g.getText().toString();
                b b1;
                b1 = a.i;
                if (charsequence.length() != 0)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                double d1 = 0.0D;
_L3:
                try
                {
                    b1.c(d1);
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    com.fitbit.e.a.a("MeasurablePicker", "NumberFormatException: %s", charsequence, new Object[] {
                        charsequence.toString()
                    });
                }
                a.c(0);
_L2:
                return;
                d1 = com.fitbit.util.format.e.a(charsequence);
                  goto _L3
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        q = new android.view.View.OnFocusChangeListener() {

            final MeasurablePicker a;

            public void onFocusChange(View view, boolean flag)
            {
                double d1;
                boolean flag1;
                boolean flag2;
                d1 = 0.0D;
                flag1 = true;
                flag2 = false;
                if (a.g() != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (!flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (a.l) goto _L1; else goto _L3
_L3:
                if (a.i.g() == 0.0D)
                {
                    view = "";
                } else
                {
                    view = a.i;
                    flag = flag2;
                    if (!a.l)
                    {
                        flag = true;
                    }
                    view = view.b(flag);
                }
                a.a(a.g, view);
                a.l = true;
                return;
                if (!a.l) goto _L1; else goto _L4
_L4:
                b b1;
                view = a.g.getText().toString();
                b1 = a.i;
                if (view.length() != 0)
                {
                    break MISSING_BLOCK_LABEL_256;
                }
_L5:
                b1.c(d1);
                if (com.fitbit.customui.MeasurablePicker.a(a) != 0.0F && a.i.g() > (double)com.fitbit.customui.MeasurablePicker.a(a))
                {
                    a.i.c(com.fitbit.customui.MeasurablePicker.a(a));
                }
                view = a.i;
                if (!a.l)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                try
                {
                    view = view.b(flag);
                    a.a(a.g, view);
                    a.l = false;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    return;
                }
                d1 = com.fitbit.util.format.e.a(view);
                  goto _L5
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        r = 1;
        t = null;
        u = new android.widget.TextView.OnEditorActionListener() {

            final MeasurablePicker a;

            public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                textview.getOnFocusChangeListener().onFocusChange(textview, false);
                if (MeasurablePicker.b(a) != null)
                {
                    MeasurablePicker.b(a).onEditorAction(textview, i1, keyevent);
                }
                return false;
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        w = true;
        x = new TextWatcher() {

            final MeasurablePicker a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                if (!a.k || !MeasurablePicker.c(a))
                {
                    break MISSING_BLOCK_LABEL_130;
                }
                b b1;
                charsequence = a.e.getText().toString();
                a.c(0);
                b1 = a.i;
                if (charsequence.length() != 0)
                {
                    break MISSING_BLOCK_LABEL_101;
                }
                double d1;
                if (MeasurablePicker.d(a))
                {
                    d1 = -1D;
                } else
                {
                    d1 = 0.0D;
                }
                try
                {
                    b1.b(d1);
                    a.i.b(a.i.f());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    com.fitbit.e.a.a("MeasurablePicker", "NumberFormatException: %s", charsequence, new Object[] {
                        charsequence.toString()
                    });
                }
                break MISSING_BLOCK_LABEL_130;
                d1 = com.fitbit.util.format.e.a(charsequence);
                break MISSING_BLOCK_LABEL_73;
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
        B = 0x7f040189;
        C = 0x7f0401aa;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        attributeset = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.MeasurablePicker);
        B = attributeset.getResourceId(0, 0x7f040189);
        C = attributeset.getResourceId(1, 0x7f0401aa);
        attributeset.recycle();
        inflate(context, B, this);
        setBaselineAligned(true);
        e = (DecimalEditText)findViewById(0x7f110402);
        g = (DecimalEditText)findViewById(0x7f110403);
        f = e.getImeOptions();
        h = g.getImeOptions();
        g.b(0);
        j = (Spinner)findViewById(0x7f110088);
        g.setId(bq.a());
        e.setId(bq.a());
        j.setId(bq.a());
        k = false;
        l = false;
        m = 0.0F;
        p = 0.0F;
        a();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    static double a(MeasurablePicker measurablepicker, double d1)
    {
        measurablepicker.y = d1;
        return d1;
    }

    static float a(MeasurablePicker measurablepicker)
    {
        return measurablepicker.p;
    }

    private void a()
    {
        e.setOnFocusChangeListener(a);
        e.addTextChangedListener(x);
        g.setOnFocusChangeListener(q);
        g.addTextChangedListener(o);
        e.setOnEditorActionListener(u);
        g.setOnEditorActionListener(u);
        e.setOnClickListener(n);
        g.setOnClickListener(n);
        e.setOnLongClickListener(b);
        g.setOnLongClickListener(c);
    }

    static android.widget.TextView.OnEditorActionListener b(MeasurablePicker measurablepicker)
    {
        return measurablepicker.t;
    }

    static boolean c(MeasurablePicker measurablepicker)
    {
        return measurablepicker.w;
    }

    static boolean d(MeasurablePicker measurablepicker)
    {
        return measurablepicker.s;
    }

    static double e(MeasurablePicker measurablepicker)
    {
        return measurablepicker.y;
    }

    static int f(MeasurablePicker measurablepicker)
    {
        return measurablepicker.A;
    }

    static void g(MeasurablePicker measurablepicker)
    {
        measurablepicker.q();
    }

    static int h(MeasurablePicker measurablepicker)
    {
        return measurablepicker.r;
    }

    private void q()
    {
        if (v != null)
        {
            v.a(i.d());
        }
    }

    protected abstract void a(int i1);

    protected void a(EditText edittext, String s1)
    {
        w = false;
        if (edittext instanceof DecimalEditText)
        {
            ((DecimalEditText)edittext).b(s1);
        } else
        {
            edittext.setText(s1);
        }
        edittext.setSelection(edittext.getText().length());
        w = true;
    }

    public void a(android.widget.TextView.OnEditorActionListener oneditoractionlistener)
    {
        t = oneditoractionlistener;
    }

    public void a(a a1)
    {
        v = a1;
    }

    public void a(Measurable measurable)
    {
        Enum aenum[][] = c();
        int i1 = 0;
        int j1 = 0;
        for (; i1 < aenum.length; i1++)
        {
            Enum aenum1[] = aenum[i1];
            if (measurable.a() == aenum1[0])
            {
                j1 = i1;
            }
        }

        a(j1);
        j.setSelection(j1);
        i.b(measurable);
        a(((EditText) (e)), i.a(k));
        if (i.e())
        {
            a(((EditText) (g)), i.b(l));
        }
        q();
    }

    public void a(Measurable measurable, Measurable measurable1, float f1, float f2)
    {
        try
        {
            if (k)
            {
                i.b(i.f());
            }
            if (l)
            {
                i.c(i.g());
            }
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.a("MeasurablePicker", exception.toString(), new Object[0]);
        }
        e.d(f1);
        g.d(f2);
        m = f1;
        p = f2;
        i.a(measurable, measurable1);
        if (f1 != 0.0F && i.f() > (double)f1)
        {
            i.b(f1);
        }
        if (f2 != 0.0F && i.g() > (double)f2)
        {
            i.c(f1);
        }
        a(((EditText) (e)), i.a(k));
        if (i.e())
        {
            g.setVisibility(0);
            a(((EditText) (g)), i.b(l));
            e.b(0);
            e.setImeOptions(5);
            e.setNextFocusDownId(g.getId());
            if (getNextFocusDownId() != -1)
            {
                g.setNextFocusDownId(getNextFocusDownId());
                g.setImeOptions(5);
            } else
            {
                g.setNextFocusDownId(-1);
                g.setImeOptions(h);
            }
        } else
        {
            if (g.isFocused())
            {
                e.requestFocus();
            }
            g.setVisibility(8);
            l = false;
            e.b(i());
            if (getNextFocusDownId() != -1)
            {
                e.setNextFocusDownId(getNextFocusDownId());
                e.setImeOptions(5);
            } else
            {
                e.setNextFocusDownId(-1);
                e.setImeOptions(f);
            }
        }
        q();
    }

    public void a(CharSequence charsequence)
    {
        z = charsequence;
        if (i.e())
        {
            g.setError(charsequence);
            e.setError(null);
            return;
        } else
        {
            g.setError(null);
            e.setError(charsequence);
            return;
        }
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    public abstract void a(Enum aenum[][], float af[][]);

    protected abstract String b();

    public void b(int i1)
    {
        r = i1;
    }

    public void b(CharSequence charsequence)
    {
        j.setPrompt(charsequence);
    }

    public void c(int i1)
    {
        A = i1;
        if (A == 0)
        {
            e.c(0);
            g.c(0);
            return;
        }
        z = getContext().getString(A);
        if (i.e())
        {
            g.c(A);
            e.c(0);
            return;
        } else
        {
            g.c(0);
            e.c(A);
            return;
        }
    }

    protected abstract Enum[][] c();

    public void d()
    {
        if (i.e())
        {
            g.h();
            return;
        } else
        {
            e.h();
            return;
        }
    }

    public void d(int i1)
    {
        j.setMinimumWidth(i1);
    }

    public boolean e()
    {
        return s;
    }

    public void f()
    {
        j.setVisibility(8);
    }

    public Measurable g()
    {
        return i.d();
    }

    public android.view.View.OnFocusChangeListener h()
    {
        return new android.view.View.OnFocusChangeListener() {

            final MeasurablePicker a;

            public void onFocusChange(View view, boolean flag)
            {
                double d1;
                boolean flag1;
                d1 = 0.0D;
                flag1 = false;
                if (a.g() != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (!flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (a.k) goto _L1; else goto _L3
_L3:
                com.fitbit.customui.MeasurablePicker.a(a, a.g().b());
                if (a.i.f() == 0.0D)
                {
                    view = "";
                } else
                {
                    view = a.i;
                    flag = flag1;
                    if (!a.k)
                    {
                        flag = true;
                    }
                    view = view.a(flag);
                }
                a.a(a.e, view);
                a.k = true;
                return;
                if (!a.k) goto _L1; else goto _L4
_L4:
                view = a.e.getText().toString();
                if (com.fitbit.customui.MeasurablePicker.e(a) != -1D && !MeasurablePicker.d(a) || a.e.getText().length() != 0 || a.i.e()) goto _L6; else goto _L5
_L5:
                a.i.b(-1D);
_L7:
                view = a.i;
                b b1;
                if (!a.k)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                try
                {
                    view = view.a(flag);
                    a.a(a.e, view);
                    a.k = false;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    com.fitbit.e.a.a("MeasurablePicker", "ParseException: %s", view, new Object[] {
                        String.valueOf(view)
                    });
                }
                return;
_L6:
                b1 = a.i;
                if (view.length() != 0)
                {
                    break MISSING_BLOCK_LABEL_362;
                }
_L8:
                b1.b(d1);
                if (a.m != 0.0F && a.i.f() > (double)a.m)
                {
                    a.i.b(a.m);
                }
                  goto _L7
                d1 = com.fitbit.util.format.e.a(view);
                  goto _L8
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        };
    }

    public int i()
    {
        return r;
    }

    public void j()
    {
        e.setError(null);
        g.setError(null);
    }

    public void k()
    {
        e.i();
        g.i();
    }

    public CharSequence l()
    {
        return z;
    }

    protected void m()
    {
        ArrayAdapter arrayadapter;
        arrayadapter = new ArrayAdapter(getContext(), C);
        arrayadapter.setDropDownViewResource(0x1090009);
        Enum aenum[][] = c();
        int i1;
        int j1;
        try
        {
            j1 = aenum.length;
        }
        catch (Exception exception)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        arrayadapter.add(((m)aenum[i1][0]).getDisplayName());
        i1++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        j.setAdapter(arrayadapter);
        j.setPrompt(b());
        j.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final MeasurablePicker a;

            public void onItemSelected(AdapterView adapterview, View view, int k1, long l1)
            {
                a.e.h();
                a.g.h();
                a.a(k1);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        });
        return;
    }

    public a n()
    {
        return v;
    }

    public void o()
    {
        postDelayed(new Runnable() {

            final MeasurablePicker a;

            public void run()
            {
                a.e.requestFocus();
                ((InputMethodManager)a.getContext().getSystemService("input_method")).showSoftInput(a.e, 1);
            }

            
            {
                a = MeasurablePicker.this;
                super();
            }
        }, 200L);
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        super.onFocusChanged(flag, i1, rect);
        if (flag)
        {
            e.requestFocus(i1);
        }
    }

    public int p()
    {
        return j.getWidth();
    }
}
