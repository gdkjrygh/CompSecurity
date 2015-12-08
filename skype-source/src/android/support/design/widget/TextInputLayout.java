// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.o;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            d, a, w, p

public class TextInputLayout extends LinearLayout
{
    private final class a extends android.support.v4.view.a
    {

        final TextInputLayout a;

        public final void a(View view, c c1)
        {
            super.a(view, c1);
            c1.b(android/support/design/widget/TextInputLayout.getSimpleName());
            view = TextInputLayout.b(a).e();
            if (!TextUtils.isEmpty(view))
            {
                c1.c(view);
            }
            if (android.support.design.widget.TextInputLayout.c(a) != null)
            {
                c1.d(android.support.design.widget.TextInputLayout.c(a));
            }
            if (TextInputLayout.d(a) != null)
            {
                view = TextInputLayout.d(a).getText();
            } else
            {
                view = null;
            }
            if (!TextUtils.isEmpty(view))
            {
                c1.p();
                c1.e(view);
            }
        }

        public final void a(View view, AccessibilityEvent accessibilityevent)
        {
            super.a(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
        }

        public final void b(View view, AccessibilityEvent accessibilityevent)
        {
            super.b(view, accessibilityevent);
            view = TextInputLayout.b(a).e();
            if (!TextUtils.isEmpty(view))
            {
                accessibilityevent.getText().add(view);
            }
        }

        private a()
        {
            a = TextInputLayout.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private EditText a;
    private CharSequence b;
    private Paint c;
    private boolean d;
    private TextView e;
    private int f;
    private ColorStateList g;
    private ColorStateList h;
    private final d i;
    private boolean j;
    private p k;

    public TextInputLayout(Context context)
    {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset);
        i = new d(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        i.a(android.support.design.widget.a.b);
        i.b(new AccelerateInterpolator());
        i.d(0x800033);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.TextInputLayout, l, android.support.design.a.h.Widget_Design_TextInputLayout);
        b = context.getText(android.support.design.a.i.TextInputLayout_android_hint);
        j = context.getBoolean(android.support.design.a.i.TextInputLayout_hintAnimationEnabled, true);
        if (context.hasValue(android.support.design.a.i.TextInputLayout_android_textColorHint))
        {
            attributeset = context.getColorStateList(android.support.design.a.i.TextInputLayout_android_textColorHint);
            h = attributeset;
            g = attributeset;
        }
        if (context.getResourceId(android.support.design.a.i.TextInputLayout_hintTextAppearance, -1) != -1)
        {
            setHintTextAppearance(context.getResourceId(android.support.design.a.i.TextInputLayout_hintTextAppearance, 0));
        }
        f = context.getResourceId(android.support.design.a.i.TextInputLayout_errorTextAppearance, 0);
        boolean flag = context.getBoolean(android.support.design.a.i.TextInputLayout_errorEnabled, false);
        context.recycle();
        setErrorEnabled(flag);
        if (x.e(this) == 0)
        {
            x.c(this, 1);
        }
        x.a(this, new a((byte)0));
    }

    private android.widget.LinearLayout.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
        {
            layoutparams = (android.widget.LinearLayout.LayoutParams)layoutparams;
        } else
        {
            layoutparams = new android.widget.LinearLayout.LayoutParams(layoutparams);
        }
        if (c == null)
        {
            c = new Paint();
        }
        c.setTypeface(i.a());
        c.setTextSize(i.c());
        layoutparams.topMargin = (int)(-c.ascent());
        return layoutparams;
    }

    private void a(float f1)
    {
        if (i.b() == f1)
        {
            return;
        }
        if (k == null)
        {
            k = w.a();
            k.a(android.support.design.widget.a.a);
            k.a(200);
            k.a(new p.c() {

                final TextInputLayout a;

                public final void a(p p1)
                {
                    TextInputLayout.b(a).b(p1.d());
                }

            
            {
                a = TextInputLayout.this;
                super();
            }
            });
        }
        k.a(i.b(), f1);
        k.a();
    }

    static void a(TextInputLayout textinputlayout)
    {
        textinputlayout.a(true);
    }

    private void a(boolean flag)
    {
        int l;
        int ai[];
        d d1;
        boolean flag1;
        int i1;
        if (a != null && !TextUtils.isEmpty(a.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ai = getDrawableState();
        i1 = ai.length;
        l = 0;
_L5:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (ai[l] != 0x101009c) goto _L2; else goto _L1
_L1:
        l = 1;
_L3:
        if (g != null && h != null)
        {
            i.b(g.getDefaultColor());
            d1 = i;
            int j1;
            if (l != 0)
            {
                j1 = h.getDefaultColor();
            } else
            {
                j1 = g.getDefaultColor();
            }
            d1.a(j1);
        }
        if (flag1 || l != 0)
        {
            if (k != null && k.b())
            {
                k.e();
            }
            if (flag && j)
            {
                a(1.0F);
                return;
            } else
            {
                i.b(1.0F);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_197;
_L2:
        l++;
        continue; /* Loop/switch isn't completed */
        l = 0;
          goto _L3
        if (k != null && k.b())
        {
            k.e();
        }
        if (flag && j)
        {
            a(0.0F);
            return;
        }
        i.b(0.0F);
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static d b(TextInputLayout textinputlayout)
    {
        return textinputlayout.i;
    }

    static EditText c(TextInputLayout textinputlayout)
    {
        return textinputlayout.a;
    }

    static TextView d(TextInputLayout textinputlayout)
    {
        return textinputlayout.e;
    }

    public void addView(View view, int l, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (view instanceof EditText)
        {
            EditText edittext = (EditText)view;
            if (a != null)
            {
                throw new IllegalArgumentException("We already have an EditText, can only have one");
            }
            a = edittext;
            i.a(a.getTypeface());
            i.a(a.getTextSize());
            i.c(a.getGravity());
            a.addTextChangedListener(new TextWatcher() {

                final TextInputLayout a;

                public final void afterTextChanged(Editable editable)
                {
                    TextInputLayout.a(a);
                }

                public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                }

                public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                }

            
            {
                a = TextInputLayout.this;
                super();
            }
            });
            if (g == null)
            {
                g = a.getHintTextColors();
            }
            if (TextUtils.isEmpty(b))
            {
                setHint(a.getHint());
                a.setHint(null);
            }
            if (e != null)
            {
                x.b(e, x.m(a), 0, x.n(a), a.getPaddingBottom());
            }
            a(false);
            super.addView(view, 0, a(layoutparams));
            return;
        } else
        {
            super.addView(view, l, layoutparams);
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        i.a(canvas);
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        if (a != null)
        {
            l = a.getLeft() + a.getCompoundPaddingLeft();
            j1 = a.getRight() - a.getCompoundPaddingRight();
            i.a(l, a.getTop() + a.getCompoundPaddingTop(), j1, a.getBottom() - a.getCompoundPaddingBottom());
            i.b(l, getPaddingTop(), j1, k1 - i1 - getPaddingBottom());
            i.d();
        }
    }

    public void refreshDrawableState()
    {
        super.refreshDrawableState();
        a(x.E(this));
    }

    public void setError(CharSequence charsequence)
    {
        if (!d)
        {
            if (TextUtils.isEmpty(charsequence))
            {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        x.c(e, 0.0F);
        e.setText(charsequence);
        x.s(e).a(1.0F).a(200L).a(android.support.design.widget.a.b).a(new ak() {

            final TextInputLayout a;

            public final void a(View view)
            {
                view.setVisibility(0);
            }

            
            {
                a = TextInputLayout.this;
                super();
            }
        }).e();
        x.a(a, ColorStateList.valueOf(e.getCurrentTextColor()));
_L4:
        sendAccessibilityEvent(2048);
        return;
_L2:
        if (e.getVisibility() == 0)
        {
            x.s(e).a(0.0F).a(200L).a(android.support.design.widget.a.b).a(new ak() {

                final TextInputLayout a;

                public final void b(View view)
                {
                    view.setVisibility(4);
                }

            
            {
                a = TextInputLayout.this;
                super();
            }
            }).e();
            charsequence = o.a(getContext());
            x.a(a, charsequence.b(android.support.design.a.e.abc_edit_text_material));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setErrorEnabled(boolean flag)
    {
        if (d != flag)
        {
            if (e != null)
            {
                x.s(e).d();
            }
            if (flag)
            {
                e = new TextView(getContext());
                e.setTextAppearance(getContext(), f);
                e.setVisibility(4);
                addView(e);
                if (a != null)
                {
                    x.b(e, x.m(a), 0, x.n(a), a.getPaddingBottom());
                }
            } else
            {
                removeView(e);
                e = null;
            }
            d = flag;
        }
    }

    public void setHint(CharSequence charsequence)
    {
        b = charsequence;
        i.a(charsequence);
        sendAccessibilityEvent(2048);
    }

    public void setHintAnimationEnabled(boolean flag)
    {
        j = flag;
    }

    public void setHintTextAppearance(int l)
    {
        i.e(l);
        h = ColorStateList.valueOf(i.f());
        if (a != null)
        {
            a(false);
            android.widget.LinearLayout.LayoutParams layoutparams = a(a.getLayoutParams());
            a.setLayoutParams(layoutparams);
            a.requestLayout();
        }
    }

    public void setTypeface(Typeface typeface)
    {
        i.a(typeface);
    }
}
