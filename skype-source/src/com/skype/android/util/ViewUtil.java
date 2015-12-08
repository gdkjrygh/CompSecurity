// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Spinner;
import android.widget.TextView;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewUtil
{

    private static final AtomicInteger a = new AtomicInteger(1);

    private ViewUtil()
    {
    }

    public static int a()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            int i;
            int k;
            do
            {
                k = a.get();
                int j = k + 1;
                i = j;
                if (j > 0xffffff)
                {
                    i = 1;
                }
            } while (!a.compareAndSet(k, i));
            return k;
        } else
        {
            return View.generateViewId();
        }
    }

    public static int a(TextView textview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return textview.getHighlightColor();
        }
        Class class1 = textview.getClass();
_L1:
        Field afield[];
        int j;
        afield = class1.getDeclaredFields();
        j = afield.length;
        Field field;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_65;
        }

        field = afield[i];
        if (field.getName().equals("mHighlightColor"))
        {
            field.setAccessible(true);
            return field.getInt(textview);
        }
        break MISSING_BLOCK_LABEL_120;
        if (class1.getSuperclass() == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        class1 = class1.getSuperclass();
          goto _L1
        try
        {
            throw new RuntimeException((new StringBuilder("Couldn't find field: ")).append("mHighlightColor").toString());
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            textview.printStackTrace();
        }
        throw new RuntimeException("Can't get highlight color");
    }

    public static Drawable a(Application application, int i, HashMap hashmap, com.skype.android.text.SymbolDrawable.Options options)
    {
        Resources resources = application.getResources();
        SymbolDrawable asymboldrawable[] = new SymbolDrawable[hashmap.size()];
        int j = 0;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.next();
            SymbolDrawable symboldrawable = new SymbolDrawable(com.skype.android.widget.SymbolElement.SymbolCode.cp, SegoeTypeFaceFactory.getInstance(application), options);
            symboldrawable.setSymbolCode((com.skype.android.widget.SymbolElement.SymbolCode)entry.getKey());
            symboldrawable.setSymbolColor(resources.getColor(((Integer)entry.getValue()).intValue()));
            symboldrawable.a(resources.getDimension(i));
            symboldrawable.a();
            asymboldrawable[j] = symboldrawable;
            j++;
        }

        return new LayerDrawable(asymboldrawable);
    }

    public static Drawable a(Application application, HashMap hashmap)
    {
        return a(application, 0x7f0c01f4, hashmap, new com.skype.android.text.SymbolDrawable.Options(1.1F));
    }

    public static SpannableStringBuilder a(CharSequence charsequence, CharSequence charsequence1)
    {
        return new SpannableStringBuilder((new StringBuilder()).append(charsequence).append("\n").append(charsequence1).toString());
    }

    public static View a(View view, int i)
    {
        return view.findViewById(i);
    }

    public static String a(int i)
    {
        if (i > 99)
        {
            return "99+";
        }
        if (i == 0)
        {
            return "0";
        } else
        {
            return String.valueOf(i);
        }
    }

    public static transient void a(android.view.View.OnClickListener onclicklistener, View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            View view = aview[i];
            if (view != null)
            {
                view.setOnClickListener(onclicklistener);
            }
        }

    }

    public static void a(View view)
    {
        if (!Build.MANUFACTURER.contains("Amazon"))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        view.getClass().getMethod("setAmazonSystemUi", new Class[] {
            Integer.TYPE, Boolean.TYPE
        }).invoke(view, new Object[] {
            Integer.valueOf(1), Boolean.valueOf(true)
        });
        ((Activity)view.getContext()).getWindow().addFlags(1024);
        return;
        view;
        view.printStackTrace();
        return;
        view;
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

    public static void a(View view, boolean flag)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int i;
            if (flag)
            {
                i = 0x40000;
            } else
            {
                i = 0x60000;
            }
            view.setDescendantFocusability(i);
        }
    }

    public static transient void a(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            View view = aview[i];
            view.setFocusable(false);
            view.setFocusableInTouchMode(false);
            view.setClickable(false);
        }

    }

    public static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean a(Spinner spinner)
    {
        return a(spinner, spinner.getContext().getResources().getDrawable(0x7f0201c8));
    }

    public static boolean a(Spinner spinner, Drawable drawable)
    {
        Object obj;
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            spinner.setPopupBackgroundDrawable(drawable);
            return true;
        }
        Field field;
        Method amethod[];
        int j;
        try
        {
            obj = Class.forName("android.widget.Spinner$DropdownPopup");
        }
        // Misplaced declaration of an exception variable
        catch (Spinner spinner)
        {
            return false;
        }
        field = null;
        amethod = ((Class) (obj)).getSuperclass().getDeclaredMethods();
        j = amethod.length;
        i = 0;
_L6:
        obj = field;
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = amethod[i];
        if (!((Method) (obj)).getName().equalsIgnoreCase("setBackgroundDrawable")) goto _L3; else goto _L2
_L4:
        ((Method) (obj)).setAccessible(true);
        field = spinner.getClass().getDeclaredField("mPopup");
        field.setAccessible(true);
        ((Method) (obj)).invoke(field.get(spinner), new Object[] {
            drawable
        });
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean a(CharSequence charsequence)
    {
        if (!(charsequence instanceof Spanned))
        {
            return false;
        }
        charsequence = (Spanned)charsequence;
        return ((URLSpan[])charsequence.getSpans(0, charsequence.length(), android/text/style/URLSpan)).length > 0;
    }

    public static CharSequence[] a(Context context, int ai[])
    {
        CharSequence acharsequence[] = new CharSequence[2];
        for (int i = 0; i < 2; i++)
        {
            acharsequence[i] = context.getResources().getString(ai[i]);
        }

        return acharsequence;
    }

    public static SpannableStringBuilder b(CharSequence charsequence, CharSequence charsequence1)
    {
        return new SpannableStringBuilder((new StringBuilder()).append(charsequence).append(" ").append(charsequence1).toString());
    }

    public static String b(TextView textview)
    {
        if (textview.getContentDescription() != null)
        {
            return textview.getContentDescription().toString();
        } else
        {
            return textview.getText().toString();
        }
    }

    public static void b(View view)
    {
        if (!Build.MANUFACTURER.contains("Amazon"))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        view.getClass().getMethod("setAmazonSystemUi", new Class[] {
            Integer.TYPE, Boolean.TYPE
        }).invoke(view, new Object[] {
            Integer.valueOf(1), Boolean.valueOf(true)
        });
        ((Activity)view.getContext()).getWindow().clearFlags(1024);
        return;
        view;
        view.printStackTrace();
        return;
        view;
    }

}
