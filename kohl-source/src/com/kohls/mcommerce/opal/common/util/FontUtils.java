// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Hashtable;

public class FontUtils
{

    public static final String Gotham_Bold = "Gotham-Bold.otf";
    public static final String Gotham_Book = "Gotham-Book.otf";
    private static Hashtable mFontMap = new Hashtable();

    public FontUtils()
    {
    }

    public static Typeface loadTypeFace(Context context, String s)
    {
        com/kohls/mcommerce/opal/common/util/FontUtils;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Font name can not be NULL!");
        }
        break MISSING_BLOCK_LABEL_26;
        context;
        com/kohls/mcommerce/opal/common/util/FontUtils;
        JVM INSTR monitorexit ;
        throw context;
        if (!mFontMap.containsKey(s)) goto _L2; else goto _L1
_L1:
        context = (Typeface)mFontMap.get(s);
_L4:
        com/kohls/mcommerce/opal/common/util/FontUtils;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        throw new IllegalArgumentException("Context name can not be NULL!");
        context = Typeface.createFromAsset(context.getAssets(), (new StringBuilder()).append("fonts/").append(s).toString());
        if (context == null) goto _L4; else goto _L3
_L3:
        mFontMap.put(s, context);
          goto _L4
    }

    public static void setFonts(Context context, View view, String s)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        view = (ViewGroup)view;
        int i = 0;
_L4:
        if (i >= view.getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        setFonts(context, view.getChildAt(i), s);
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        if (!(view instanceof TextView))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (((TextView)view).getTypeface() != null)
        {
            ((TextView)view).setTypeface(loadTypeFace(context, s), ((TextView)view).getTypeface().getStyle());
            return;
        }
        try
        {
            ((TextView)view).setTypeface(loadTypeFace(context, s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return;
        if (view instanceof Button)
        {
            ((Button)view).setTypeface(loadTypeFace(context, s), ((Button)view).getTypeface().getStyle());
            return;
        }
        if (view instanceof EditText)
        {
            ((EditText)view).setTypeface(loadTypeFace(context, s), ((EditText)view).getTypeface().getStyle());
        }
_L3:
    }

}
