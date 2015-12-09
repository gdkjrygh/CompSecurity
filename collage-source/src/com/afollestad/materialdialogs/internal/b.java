// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatEditText;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import com.afollestad.materialdialogs.util.a;

public class b
{

    public b()
    {
    }

    private static ColorStateList a(Context context, int i)
    {
        int j = com.afollestad.materialdialogs.util.a.a(context, com.afollestad.materialdialogs.R.attr.colorControlNormal);
        int k = com.afollestad.materialdialogs.util.a.a(context, com.afollestad.materialdialogs.R.attr.colorControlNormal);
        return new ColorStateList(new int[][] {
            new int[] {
                0xfefeff62
            }, new int[] {
                0xfefeff59, 0xfefeff64
            }, new int[0]
        }, new int[] {
            j, k, i
        });
    }

    public static void a(CheckBox checkbox, int i)
    {
        int ai[] = {
            0xfefeff60
        };
        int ai1[] = {
            0x10100a0
        };
        int j = com.afollestad.materialdialogs.util.a.a(checkbox.getContext(), com.afollestad.materialdialogs.R.attr.colorControlNormal);
        ColorStateList colorstatelist = new ColorStateList(new int[][] {
            ai, ai1
        }, new int[] {
            j, i
        });
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            checkbox.setButtonTintList(colorstatelist);
            return;
        } else
        {
            Drawable drawable = DrawableCompat.wrap(ContextCompat.getDrawable(checkbox.getContext(), com.afollestad.materialdialogs.R.drawable.abc_btn_check_material));
            DrawableCompat.setTintList(drawable, colorstatelist);
            checkbox.setButtonDrawable(drawable);
            return;
        }
    }

    public static void a(EditText edittext, int i)
    {
        ColorStateList colorstatelist = a(edittext.getContext(), i);
        if (edittext instanceof AppCompatEditText)
        {
            ((AppCompatEditText)edittext).setSupportBackgroundTintList(colorstatelist);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            edittext.setBackgroundTintList(colorstatelist);
            return;
        }
    }

    public static void a(ProgressBar progressbar, int i)
    {
        a(progressbar, i, false);
    }

    public static void a(ProgressBar progressbar, int i, boolean flag)
    {
        ColorStateList colorstatelist = ColorStateList.valueOf(i);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            progressbar.setProgressTintList(colorstatelist);
            progressbar.setSecondaryProgressTintList(colorstatelist);
            if (!flag)
            {
                progressbar.setIndeterminateTintList(colorstatelist);
            }
        } else
        {
            android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
            if (android.os.Build.VERSION.SDK_INT <= 10)
            {
                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            }
            if (!flag && progressbar.getIndeterminateDrawable() != null)
            {
                progressbar.getIndeterminateDrawable().setColorFilter(i, mode);
            }
            if (progressbar.getProgressDrawable() != null)
            {
                progressbar.getProgressDrawable().setColorFilter(i, mode);
                return;
            }
        }
    }

    public static void a(RadioButton radiobutton, int i)
    {
        int j = com.afollestad.materialdialogs.util.a.a(radiobutton.getContext(), com.afollestad.materialdialogs.R.attr.colorControlNormal);
        ColorStateList colorstatelist = new ColorStateList(new int[][] {
            new int[] {
                0xfefeff60
            }, new int[] {
                0x10100a0
            }
        }, new int[] {
            j, i
        });
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            radiobutton.setButtonTintList(colorstatelist);
            return;
        } else
        {
            Drawable drawable = DrawableCompat.wrap(ContextCompat.getDrawable(radiobutton.getContext(), com.afollestad.materialdialogs.R.drawable.abc_btn_radio_material));
            DrawableCompat.setTintList(drawable, colorstatelist);
            radiobutton.setButtonDrawable(drawable);
            return;
        }
    }
}
