// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

public final class dgo
{

    public static Drawable a(Context context)
    {
        Object obj = context.obtainStyledAttributes(new int[] {
            0x7f0100e6
        });
        int i = ((TypedArray) (obj)).getResourceId(0, 0);
        ((TypedArray) (obj)).recycle();
        context = context.obtainStyledAttributes(i, new int[] {
            0x7f010030
        });
        obj = context.getDrawable(0);
        context.recycle();
        return ((Drawable) (obj));
    }

    public static Drawable a(Context context, int i)
    {
        context = context.obtainStyledAttributes(new int[] {
            i
        });
        Drawable drawable = context.getDrawable(0);
        context.recycle();
        return drawable;
    }

    public static void a(Context context, TextView textview)
    {
        b(context, textview, 0x7f0101dc);
        textview.setTextColor(b(context, 0x7f010163));
    }

    public static void a(Context context, TextView textview, int i)
    {
        textview.setTextAppearance(context, i);
        if (!textview.isInEditMode())
        {
            android.graphics.Typeface typeface = dgd.a(context, i);
            if (typeface != null)
            {
                textview.setTypeface(typeface);
            }
            dfk.a(context, textview, i);
        }
    }

    public static void a(View view)
    {
        a(view, 0x7f010184);
    }

    public static void a(View view, int i)
    {
        a(view, a(view.getContext(), i));
    }

    public static void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static int b(Context context, int i)
    {
        context = context.obtainStyledAttributes(new int[] {
            i
        });
        i = context.getColor(0, 0);
        context.recycle();
        return i;
    }

    public static void b(Context context, TextView textview, int i)
    {
        TypedArray typedarray = context.obtainStyledAttributes(new int[] {
            i
        });
        i = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        a(context, textview, i);
    }

    public static ColorStateList c(Context context, int i)
    {
        context = context.obtainStyledAttributes(new int[] {
            i
        });
        ColorStateList colorstatelist = context.getColorStateList(0);
        context.recycle();
        return colorstatelist;
    }
}
