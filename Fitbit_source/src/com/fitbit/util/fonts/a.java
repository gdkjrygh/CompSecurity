// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.fonts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.fitbit.util.fonts:
//            FitbitFont

public class a
{

    public a()
    {
    }

    public static String a()
    {
        String s = "";
        FitbitFont afitbitfont[] = FitbitFont.values();
        int j = afitbitfont.length;
        for (int i = 0; i < j; i++)
        {
            FitbitFont fitbitfont = afitbitfont[i];
            s = (new StringBuilder()).append(s).append("@font-face {font-family: '").append(fitbitfont.a()).append("';src: url('file:///android_asset/").append(fitbitfont.b()).append("');} ").toString();
        }

        return s;
    }

    public static void a(Context context, View view, FitbitFont fitbitfont)
    {
        if (view instanceof ViewGroup)
        {
            for (int i = 0; i < ((ViewGroup)view).getChildCount(); i++)
            {
                a(context, ((ViewGroup)view).getChildAt(i), fitbitfont);
            }

        } else
        if (view instanceof TextView)
        {
            android.graphics.Typeface typeface = ((TextView)view).getTypeface();
            ((TextView)view).setTypeface(fitbitfont.a(context, typeface));
        }
    }
}
