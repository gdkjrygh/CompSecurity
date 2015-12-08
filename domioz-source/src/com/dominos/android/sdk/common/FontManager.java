// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;

public class FontManager
{

    private static final String TAG = com/dominos/android/sdk/common/FontManager.getSimpleName();
    private static Typeface dominosFont;
    private static final String fontName = "dominos-font.ttf";
    private static Field mField;

    public FontManager()
    {
    }

    public static void applyDominosFont(Activity activity)
    {
        getDominosFont(activity);
        traverseTree(activity.getWindow().getDecorView());
    }

    public static void applyDominosFont(Context context, View view)
    {
        getDominosFont(context);
        traverseTree(view);
    }

    public static void applyDominosFont(Fragment fragment)
    {
        getDominosFont(fragment.getActivity());
        traverseTree(fragment.getView());
    }

    public static void applyDominosFont(ViewGroup viewgroup)
    {
        getDominosFont((Activity)viewgroup.getContext());
        traverseTree(viewgroup);
    }

    public static void applyDominosFont(TextView textview)
    {
        textview.setTypeface(getDominosFont(textview.getContext()));
    }

    public static void applyDominosFont(TextView textview, ColorStateList colorstatelist)
    {
        applyDominosFont(textview);
        textview.setTextColor(colorstatelist);
    }

    public static void applyWiderCursor(Activity activity)
    {
        try
        {
            setUpField();
            traverseTreeForCursor(activity.getWindow().getDecorView());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void applyWiderCursor(Fragment fragment)
    {
        try
        {
            setUpField();
            traverseTreeForCursor(fragment.getView());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            return;
        }
    }

    public static void applyWiderCursor(EditText edittext)
    {
        try
        {
            setUpField();
            mField.set(edittext, Integer.valueOf(com.dominos.android.sdk.R.drawable.wide_cursor));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EditText edittext)
        {
            return;
        }
    }

    public static void boldFont(TextView textview)
    {
        textview.setTypeface(null, 1);
    }

    public static Typeface getDominosFont(Context context)
    {
        if (dominosFont == null)
        {
            dominosFont = Typeface.createFromAsset(context.getAssets(), "fonts/dominos-font.ttf");
        }
        return dominosFont;
    }

    private static void setUpField()
    {
        Field field = android/widget/TextView.getDeclaredField("mCursorDrawableRes");
        mField = field;
        field.setAccessible(true);
    }

    private static void traverseTree(View view)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                traverseTree(view.getChildAt(i));
            }

        } else
        if (view instanceof TextView)
        {
            ((TextView)view).setTypeface(dominosFont);
        }
    }

    private static void traverseTreeForCursor(View view)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                traverseTreeForCursor(view.getChildAt(i));
            }

        } else
        if (view instanceof EditText)
        {
            view = (EditText)view;
            mField.set(view, Integer.valueOf(com.dominos.android.sdk.R.drawable.wide_cursor));
        }
    }

}
