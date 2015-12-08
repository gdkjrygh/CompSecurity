// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.f;

public class a
{

    public a()
    {
    }

    public static int a(int i, float f1)
    {
        return Color.argb(Math.round((float)Color.alpha(i) * f1), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(Context context, int i)
    {
        return a(context, i, 0);
    }

    public static int a(Context context, int i, int j)
    {
        context = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        i = context.getColor(0, j);
        context.recycle();
        return i;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    private static int a(e e1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.afollestad.materialdialogs.e.values().length];
                try
                {
                    a[e.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[e1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;
        }
    }

    public static ColorStateList a(Context context, int i, ColorStateList colorstatelist)
    {
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        TypedValue typedvalue = typedarray.peekValue(0);
        if (typedvalue == null)
        {
            typedarray.recycle();
            return colorstatelist;
        }
        if (typedvalue.type < 28 || typedvalue.type > 31)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = g(context, typedvalue.data);
        typedarray.recycle();
        return context;
        context = typedarray.getColorStateList(0);
        if (context != null)
        {
            typedarray.recycle();
            return context;
        } else
        {
            typedarray.recycle();
            return colorstatelist;
        }
        context;
        typedarray.recycle();
        throw context;
    }

    private static Drawable a(Context context, int i, Drawable drawable)
    {
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        context = typedarray.getDrawable(0);
        if (context != null || drawable == null)
        {
            drawable = context;
        }
        typedarray.recycle();
        return drawable;
        context;
        typedarray.recycle();
        throw context;
    }

    public static e a(Context context, int i, e e1)
    {
        context = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        context.getInt(0, a(e1));
        JVM INSTR tableswitch 1 2: default 85
    //                   1 58
    //                   2 68;
           goto _L1 _L2 _L3
_L1:
        e1 = e.a;
        context.recycle();
        return e1;
_L2:
        e1 = e.b;
        context.recycle();
        return e1;
_L3:
        e1 = e.c;
        context.recycle();
        return e1;
        e1;
        context.recycle();
        throw e1;
    }

    public static void a(DialogInterface dialoginterface, com.afollestad.materialdialogs.f.a a1)
    {
        dialoginterface = (f)dialoginterface;
        if (dialoginterface.f() == null)
        {
            return;
        } else
        {
            dialoginterface.f().post(new DialogUtils._cls1(dialoginterface, a1));
            return;
        }
    }

    public static void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.setBackgroundDrawable(drawable);
            return;
        } else
        {
            view.setBackground(drawable);
            return;
        }
    }

    public static boolean a(int i)
    {
        return 1.0D - (0.29899999999999999D * (double)Color.red(i) + 0.58699999999999997D * (double)Color.green(i) + 0.114D * (double)Color.blue(i)) / 255D >= 0.5D;
    }

    public static boolean a(Context context, int i, boolean flag)
    {
        context = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        flag = context.getBoolean(0, flag);
        context.recycle();
        return flag;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    public static int b(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT <= 22)
        {
            return context.getResources().getColor(i);
        } else
        {
            return context.getColor(i);
        }
    }

    private static int b(Context context, int i, int j)
    {
        context = context.getTheme().obtainStyledAttributes(new int[] {
            i
        });
        i = context.getDimensionPixelSize(0, j);
        context.recycle();
        return i;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    public static void b(DialogInterface dialoginterface, com.afollestad.materialdialogs.f.a a1)
    {
        dialoginterface = (f)dialoginterface;
        if (dialoginterface.f() == null)
        {
            return;
        } else
        {
            dialoginterface.f().post(new DialogUtils._cls2(dialoginterface, a1));
            return;
        }
    }

    public static String c(Context context, int i)
    {
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedvalue, true);
        return (String)typedvalue.string;
    }

    public static Drawable d(Context context, int i)
    {
        return a(context, i, ((Drawable) (null)));
    }

    public static int e(Context context, int i)
    {
        return b(context, i, -1);
    }

    public static boolean f(Context context, int i)
    {
        return a(context, i, false);
    }

    public static ColorStateList g(Context context, int i)
    {
        int k = a(context, 0x1010036);
        int j = i;
        if (i == 0)
        {
            j = k;
        }
        i = a(j, 0.4F);
        return new ColorStateList(new int[][] {
            new int[] {
                0xfefeff62
            }, new int[0]
        }, new int[] {
            i, j
        });
    }

    // Unreferenced inner class com/afollestad/materialdialogs/util/DialogUtils$1

/* anonymous class */
    static final class DialogUtils._cls1
        implements Runnable
    {

        final f a;
        final com.afollestad.materialdialogs.f.a b;

        public void run()
        {
            a.f().requestFocus();
            InputMethodManager inputmethodmanager = (InputMethodManager)b.a().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.showSoftInput(a.f(), 1);
            }
        }

            
            {
                a = f1;
                b = a1;
                super();
            }
    }


    // Unreferenced inner class com/afollestad/materialdialogs/util/DialogUtils$2

/* anonymous class */
    static final class DialogUtils._cls2
        implements Runnable
    {

        final f a;
        final com.afollestad.materialdialogs.f.a b;

        public void run()
        {
            a.f().requestFocus();
            InputMethodManager inputmethodmanager = (InputMethodManager)b.a().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(a.f().getWindowToken(), 0);
            }
        }

            
            {
                a = f1;
                b = a1;
                super();
            }
    }

}
