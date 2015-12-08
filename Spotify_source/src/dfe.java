// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dfe
{

    public static void a(View view)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                a(view.getChildAt(i));
            }

        } else
        if ((view instanceof TextView) && view.getTag(0x7f110015) != null)
        {
            view = (TextView)view;
            int k = -(int)Math.ceil(Math.abs(view.getPaint().getFontMetrics().top));
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            Integer integer = (Integer)view.getTag(0x7f110018);
            int j = ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()).topMargin;
            if (integer == null)
            {
                view.setTag(0x7f110018, Integer.valueOf(j));
            } else
            {
                j = integer.intValue();
            }
            marginlayoutparams.topMargin = j + k;
            k = -(int)Math.ceil(Math.abs(view.getPaint().getFontMetrics().bottom));
            marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            integer = (Integer)view.getTag(0x7f110016);
            j = ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()).bottomMargin;
            if (integer == null)
            {
                view.setTag(0x7f110016, Integer.valueOf(j));
            } else
            {
                j = integer.intValue();
            }
            marginlayoutparams.bottomMargin = j + k;
            j = dft.b(8F, view.getResources());
            view.setLineSpacing(j * (b(view) / j) - b(view), 1.0F);
        }
    }

    public static void a(TextView textview)
    {
        textview.setTag(0x7f110015, new Object());
    }

    private static int b(TextView textview)
    {
        Integer integer = (Integer)textview.getTag(0x7f110017);
        int i = textview.getLineHeight();
        if (integer == null)
        {
            textview.setTag(0x7f110017, Integer.valueOf(i));
            return i;
        } else
        {
            return integer.intValue();
        }
    }
}
