// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public class AutofitHelper
{

    private TextView a;
    private TextPaint b;
    private float c;
    private int d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private ArrayList j;
    private TextWatcher k;
    private android.view.View.OnLayoutChangeListener l;

    private AutofitHelper(TextView textview)
    {
        float f1;
        TransformationMethod transformationmethod;
        int i1;
        k = new AutofitTextWatcher((byte)0);
        l = new AutofitOnLayoutChangeListener((byte)0);
        f1 = textview.getContext().getResources().getDisplayMetrics().scaledDensity;
        a = textview;
        b = new TextPaint();
        c(textview.getTextSize());
        i1 = -1;
        transformationmethod = textview.getTransformationMethod();
        if (transformationmethod == null || !(transformationmethod instanceof SingleLineTransformationMethod)) goto _L2; else goto _L1
_L1:
        i1 = 1;
_L4:
        d = i1;
        e = 8F * f1;
        f = c;
        g = 0.5F;
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            i1 = textview.getMaxLines();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static float a(CharSequence charsequence, TextPaint textpaint, float f1, int i1, float f2, float f3, float f4, DisplayMetrics displaymetrics)
    {
        float f5 = f2;
_L5:
        f2 = (f5 + f3) / 2.0F;
        textpaint.setTextSize(TypedValue.applyDimension(0, f2, displaymetrics));
        float f6;
        float f7;
        StaticLayout staticlayout;
        int j1;
        int k1;
        if (i1 != 1)
        {
            staticlayout = new StaticLayout(charsequence, textpaint, (int)f1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
            j1 = staticlayout.getLineCount();
        } else
        {
            staticlayout = null;
            j1 = 1;
        }
        if (j1 <= i1) goto _L2; else goto _L1
_L1:
        if (f3 - f5 >= f4) goto _L4; else goto _L3
_L3:
        return f5;
_L4:
        f3 = f2;
          goto _L5
_L2:
label0:
        {
            if (j1 >= i1)
            {
                break label0;
            }
            f5 = f2;
        }
          goto _L5
        if (i1 != 1) goto _L7; else goto _L6
_L6:
        f7 = textpaint.measureText(charsequence, 0, charsequence.length());
_L10:
        if (f3 - f5 < f4) goto _L3; else goto _L8
_L8:
        if (f7 > f1)
        {
            f3 = f2;
        } else
        if (f7 < f1)
        {
            f5 = f2;
        } else
        {
            return f2;
        }
          goto _L5
_L7:
        f6 = 0.0F;
        k1 = 0;
_L11:
        f7 = f6;
        if (k1 >= j1) goto _L10; else goto _L9
_L9:
        f7 = f6;
        if (staticlayout.getLineWidth(k1) > f6)
        {
            f7 = staticlayout.getLineWidth(k1);
        }
        k1++;
        f6 = f7;
          goto _L11
    }

    public static AutofitHelper a(TextView textview)
    {
        return a(textview, null, 0);
    }

    public static AutofitHelper a(TextView textview, AttributeSet attributeset, int i1)
    {
        boolean flag = true;
        AutofitHelper autofithelper = new AutofitHelper(textview);
        if (attributeset != null)
        {
            textview = textview.getContext();
            int j1 = (int)autofithelper.e;
            float f1 = autofithelper.g;
            textview = textview.obtainStyledAttributes(attributeset, R.styleable.AutofitTextView, i1, 0);
            flag = textview.getBoolean(R.styleable.AutofitTextView_sizeToFit, true);
            i1 = textview.getDimensionPixelSize(R.styleable.AutofitTextView_minTextSize, j1);
            f1 = textview.getFloat(R.styleable.AutofitTextView_precision, f1);
            textview.recycle();
            autofithelper.b(i1).a(f1);
        }
        autofithelper.a(flag);
        return autofithelper;
    }

    private void a()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        TextView textview;
        TextPaint textpaint;
        int i1;
        f4 = a.getTextSize();
        i = true;
        textview = a;
        textpaint = b;
        f3 = e;
        f1 = f;
        i1 = d;
        f2 = g;
        if (i1 > 0 && i1 != 0x7fffffff) goto _L2; else goto _L1
_L1:
        i = false;
        f1 = a.getTextSize();
        if (f1 != f4)
        {
            a(f1, f4);
        }
        return;
_L2:
label0:
        {
            int j1 = textview.getWidth() - textview.getPaddingLeft() - textview.getPaddingRight();
            if (j1 <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj = textview.getText();
            Object obj1 = textview.getTransformationMethod();
            CharSequence charsequence = ((CharSequence) (obj));
            if (obj1 != null)
            {
                charsequence = ((TransformationMethod) (obj1)).getTransformation(((CharSequence) (obj)), textview);
            }
            obj1 = textview.getContext();
            obj = Resources.getSystem();
            if (obj1 != null)
            {
                obj = ((Context) (obj1)).getResources();
            }
            obj = ((Resources) (obj)).getDisplayMetrics();
            textpaint.set(textview.getPaint());
            textpaint.setTextSize(f1);
            if (i1 != 1 || textpaint.measureText(charsequence, 0, charsequence.length()) <= (float)j1)
            {
                float f5 = j1;
                textpaint.setTextSize(TypedValue.applyDimension(0, f1, ((DisplayMetrics) (obj))));
                if ((new StaticLayout(charsequence, textpaint, (int)f5, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)).getLineCount() <= i1)
                {
                    break label0;
                }
            }
            f1 = a(charsequence, textpaint, j1, i1, 0.0F, f1, f2, ((DisplayMetrics) (obj)));
        }
        f2 = f1;
        if (f1 < f3)
        {
            f2 = f3;
        }
        textview.setTextSize(0, f2);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(float f1, float f2)
    {
        if (j != null)
        {
            Iterator iterator = j.iterator();
            while (iterator.hasNext()) 
            {
                ((OnTextSizeChangeListener)iterator.next()).onTextSizeChange(f1, f2);
            }
        }
    }

    static void a(AutofitHelper autofithelper)
    {
        autofithelper.a();
    }

    private void c(float f1)
    {
        if (c != f1)
        {
            c = f1;
        }
    }

    public final AutofitHelper a(float f1)
    {
        if (g != f1)
        {
            g = f1;
            a();
        }
        return this;
    }

    public final AutofitHelper a(int i1)
    {
        if (d != i1)
        {
            d = i1;
            a();
        }
        return this;
    }

    public final AutofitHelper a(OnTextSizeChangeListener ontextsizechangelistener)
    {
        if (j == null)
        {
            j = new ArrayList();
        }
        j.add(ontextsizechangelistener);
        return this;
    }

    public final AutofitHelper a(boolean flag)
    {
label0:
        {
            if (h != flag)
            {
                h = flag;
                if (!flag)
                {
                    break label0;
                }
                a.addTextChangedListener(k);
                a.addOnLayoutChangeListener(l);
                a();
            }
            return this;
        }
        a.removeTextChangedListener(k);
        a.removeOnLayoutChangeListener(l);
        a.setTextSize(0, c);
        return this;
    }

    public final void a(int i1, float f1)
    {
        if (i)
        {
            return;
        }
        Context context = a.getContext();
        Resources resources = Resources.getSystem();
        if (context != null)
        {
            resources = context.getResources();
        }
        c(TypedValue.applyDimension(i1, f1, resources.getDisplayMetrics()));
    }

    public final AutofitHelper b(float f1)
    {
        Context context = a.getContext();
        Resources resources = Resources.getSystem();
        if (context != null)
        {
            resources = context.getResources();
        }
        f1 = TypedValue.applyDimension(0, f1, resources.getDisplayMetrics());
        if (f1 != e)
        {
            e = f1;
            a();
        }
        return this;
    }

    private class AutofitTextWatcher
        implements TextWatcher
    {

        final AutofitHelper a;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
            AutofitHelper.a(a);
        }

        private AutofitTextWatcher()
        {
            a = AutofitHelper.this;
            super();
        }

        AutofitTextWatcher(byte byte0)
        {
            this();
        }
    }


    private class AutofitOnLayoutChangeListener
        implements android.view.View.OnLayoutChangeListener
    {

        final AutofitHelper a;

        public void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
                int k2, int l2)
        {
            AutofitHelper.a(a);
        }

        private AutofitOnLayoutChangeListener()
        {
            a = AutofitHelper.this;
            super();
        }

        AutofitOnLayoutChangeListener(byte byte0)
        {
            this();
        }
    }


    private class OnTextSizeChangeListener
    {

        public abstract void onTextSizeChange(float f1, float f2);
    }

}
