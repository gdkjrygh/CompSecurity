// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.widget.TextView;
import java.lang.reflect.Field;

public class TextUtils
{

    private static final String DEFAULT_MONOSPACE_BOLD_FONT_FILENAME = "opensans_bold.ttf";
    private static final String DEFAULT_MONOSPACE_BOLD_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_MONOSPACE_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_MONOSPACE_NORMAL_FONT_FILENAME = "opensans_regular.ttf";
    private static final String DEFAULT_NORMAL_BOLD_FONT_FILENAME = "opensans_bold.ttf";
    private static final String DEFAULT_NORMAL_BOLD_ITALIC_FONT_FILENAME = "opensans_bold.ttf";
    private static final String DEFAULT_NORMAL_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_NORMAL_NORMAL_FONT_FILENAME = "opensans_regular.ttf";
    private static final String DEFAULT_SANS_BOLD_FONT_FILENAME = "opensans_bold.ttf";
    private static final String DEFAULT_SANS_BOLD_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_SANS_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_SANS_NORMAL_FONT_FILENAME = "opensans_regular.ttf";
    private static final String DEFAULT_SERIF_BOLD_FONT_FILENAME = "opensans_bold.ttf";
    private static final String DEFAULT_SERIF_BOLD_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_SERIF_ITALIC_FONT_FILENAME = "opensans_italic.ttf";
    private static final String DEFAULT_SERIF_NORMAL_FONT_FILENAME = "opensans_regular.ttf";
    private static final int monospace_idx = 3;
    private static final int normal_idx = 0;
    private static final int sans_idx = 1;
    private static final int serif_idx = 2;

    public TextUtils()
    {
    }

    public static void initFonts(Context context)
    {
        try
        {
            setDefaultFonts(context);
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                setDefaultFontForTypeFaceSans(context);
                setDefaultFontForTypeFaceSansSerif(context);
                setDefaultFontForTypeFaceMonospace(context);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void setDefaultFontForTypeFaceMonospace(Context context)
        throws NoSuchFieldException, IllegalAccessException
    {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        Typeface typeface2 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        setTypeFaceDefaults(Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf"), typeface, typeface1, typeface2, 3);
    }

    private static void setDefaultFontForTypeFaceSans(Context context)
        throws NoSuchFieldException, IllegalAccessException
    {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        Typeface typeface2 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        setTypeFaceDefaults(Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf"), typeface, typeface1, typeface2, 1);
    }

    private static void setDefaultFontForTypeFaceSansSerif(Context context)
        throws NoSuchFieldException, IllegalAccessException
    {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        Typeface typeface2 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        setTypeFaceDefaults(Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf"), typeface, typeface1, typeface2, 2);
    }

    private static void setDefaultFonts(Context context)
        throws NoSuchFieldException, IllegalAccessException
    {
        Object obj = Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf");
        Object obj1 = Typeface.createFromAsset(context.getAssets(), "opensans_italic.ttf");
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf");
        Field field = android/graphics/Typeface.getDeclaredField("DEFAULT");
        field.setAccessible(true);
        field.set(null, typeface1);
        field = android/graphics/Typeface.getDeclaredField("DEFAULT_BOLD");
        field.setAccessible(true);
        field.set(null, obj);
        field = android/graphics/Typeface.getDeclaredField("sDefaults");
        field.setAccessible(true);
        field.set(null, new Typeface[] {
            typeface1, obj, obj1, typeface
        });
        obj = Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf");
        obj1 = android/graphics/Typeface.getDeclaredField("SANS_SERIF");
        ((Field) (obj1)).setAccessible(true);
        ((Field) (obj1)).set(null, obj);
        obj = Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf");
        obj1 = android/graphics/Typeface.getDeclaredField("SERIF");
        ((Field) (obj1)).setAccessible(true);
        ((Field) (obj1)).set(null, obj);
        context = Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf");
        obj = android/graphics/Typeface.getDeclaredField("MONOSPACE");
        ((Field) (obj)).setAccessible(true);
        ((Field) (obj)).set(null, context);
    }

    private static void setTypeFaceDefaults(Typeface typeface, Typeface typeface1, Typeface typeface2, Typeface typeface3, int i)
        throws NoSuchFieldException, IllegalAccessException
    {
        Field field = android/graphics/Typeface.getDeclaredField("sTypefaceCache");
        field.setAccessible(true);
        SparseArray sparsearray = new SparseArray(3);
        field.get(sparsearray);
        SparseArray sparsearray1 = new SparseArray(4);
        sparsearray1.put(0, typeface);
        sparsearray1.put(1, typeface1);
        sparsearray1.put(2, typeface2);
        sparsearray1.put(3, typeface3);
        sparsearray.put(i, sparsearray1);
        field.set(null, sparsearray);
    }

    public static TextView setTypefaceBold(Context context, TextView textview)
    {
        textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "opensans_bold.ttf"));
        return textview;
    }

    public static TextView setTypefaceLight(Context context, TextView textview)
    {
        textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "opensans_light.ttf"));
        return textview;
    }

    public static TextView setTypefaceRegular(Context context, TextView textview)
    {
        textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "opensans_regular.ttf"));
        return textview;
    }

    public static TextView setTypefaceSemibold(Context context, TextView textview)
    {
        textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "opensans_semibold.ttf"));
        return textview;
    }
}
