// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Layout;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public final class gjk
{

    final TextView a;
    private final float b;
    private final TextView c;

    public gjk(TextView textview)
    {
        this(textview, null);
    }

    public gjk(TextView textview, TextView textview1)
    {
        float f = textview.getTextSize();
        a = textview;
        b = f;
        c = textview1;
    }

    private static boolean a(Layout layout)
    {
        float f = layout.getPaint().measureText(String.valueOf(layout.getText()));
        return (float)layout.getWidth() > f;
    }

    public final gjk a()
    {
        android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private gjk a;

            public final void onGlobalLayout()
            {
                gcg.a(a.a.getViewTreeObserver(), this);
                a.b();
            }

            
            {
                a = gjk.this;
                super();
            }
        };
        a.getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
        return this;
    }

    public final void b()
    {
        Layout layout = a.getLayout();
        if (layout == null)
        {
            a();
        } else
        if (!a(layout))
        {
            TextPaint textpaint = layout.getPaint();
            float f1 = b;
            float f = 1.0F;
            do
            {
                float f2 = (f + f1) / 2.0F;
                textpaint.setTextSize(f2);
                float f3;
                if (a(layout))
                {
                    f3 = f2;
                    f2 = f1;
                } else
                {
                    f3 = f;
                }
                f1 = f2;
                f = f3;
            } while (f2 - f3 > 1.0F);
            a.setTextSize(0, f3);
            if (c != null)
            {
                c.setTextSize(0, f3);
                return;
            }
        }
    }
}
