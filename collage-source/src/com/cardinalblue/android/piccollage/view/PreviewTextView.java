// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            m

public class PreviewTextView extends View
{

    private m a;
    private float b;
    private int c;
    private TextScrapModel d;

    public PreviewTextView(Context context)
    {
        super(context);
        b = 1.0F;
        c = -1;
    }

    public PreviewTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 1.0F;
        c = -1;
    }

    public PreviewTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 1.0F;
        c = -1;
    }

    static float a(PreviewTextView previewtextview, float f)
    {
        previewtextview.b = f;
        return f;
    }

    static int a(PreviewTextView previewtextview)
    {
        return previewtextview.getMaxWidth();
    }

    private void a()
    {
        measure(0x40000000, 0x40000000);
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        layoutparams.width = getMeasuredWidth();
        layoutparams.height = getMeasuredHeight();
        setLayoutParams(layoutparams);
    }

    static m b(PreviewTextView previewtextview)
    {
        return previewtextview.a;
    }

    private int getMaxWidth()
    {
        if (c == -1)
        {
            c = (int)((float)k.c() * 0.8F);
        }
        return c;
    }

    public void a(TextScrapModel textscrapmodel)
    {
        d = textscrapmodel;
        a = new m(getContext(), textscrapmodel, false);
        a.a(new m.a() {

            final PreviewTextView a;

            public void a()
            {
                PreviewTextView.a(a, (float)PreviewTextView.a(a) / (float)PreviewTextView.b(a).c());
            }

            
            {
                a = PreviewTextView.this;
                super();
            }
        });
        a.a(new Canvas());
        b = (float)getMaxWidth() / (float)a.c();
    }

    public TextScrapModel getModel()
    {
        return d;
    }

    public String getString()
    {
        return a.a();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            canvas.save();
            float f = b / 3F;
            canvas.scale(f, f);
            a.a(canvas);
            canvas.restore();
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (a != null)
        {
            i = a.c();
            j = a.d();
            if ((float)i * (b / 3F) > (float)getMaxWidth())
            {
                b = b * ((float)getMaxWidth() / ((float)i * (b / 3F)));
            }
            setMeasuredDimension((int)((float)i * b), (int)((float)j * b));
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setBgColor(int i)
    {
        d.getText().getTextFormat().setBackgroundColor(i);
        a.a(i);
        postInvalidate();
    }

    public void setBgColorOption(ColorOption coloroption)
    {
        setBgColor(coloroption.getColor());
    }

    public void setColorOption(ColorOption coloroption)
    {
        TextFormatModel textformatmodel = d.getText().getTextFormat();
        textformatmodel.setTextColor(coloroption.getColor());
        textformatmodel.setBorderColor(coloroption.getContrastColor());
        a.a(coloroption);
        postInvalidate();
    }

    public void setFont(String s)
    {
        d.getText().getTextFormat().setFont(new FontModel(s, 40));
        int i = a.c();
        a.a(getContext(), s);
        int j = a.c();
        a();
        float f = b;
        b = ((float)i / (float)j) * f;
        postInvalidate();
    }

    public void setHasOutline(boolean flag)
    {
        d.getText().getTextFormat().setTextBorder(flag);
        a.a(flag);
        postInvalidate();
    }

    public void setString(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            d.getText().setText(s);
            int i = a.c();
            a.a(s);
            int j = a.c();
            a();
            float f = b;
            b = ((float)i / (float)j) * f;
            postInvalidate();
            return;
        }
    }
}
