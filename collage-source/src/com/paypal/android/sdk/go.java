// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.paypal.android.sdk:
//            gn

public final class go
{

    private static final Map a;
    private static Pattern b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    private static HashMap c = new HashMap();

    public static int a(String s, Context context)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return (int)b(s, context);
        }
    }

    public static Bitmap a(String s, Context context, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (context != null)
        {
            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
        } else
        {
            options.inTargetDensity = 160;
        }
        options.inDensity = 240;
        options.inScaled = false;
        s = Base64.decode(s, 0);
        return BitmapFactory.decodeByteArray(s, 0, s.length, options);
    }

    public static void a(View view, int i, int j)
    {
        view = view.getLayoutParams();
        view.width = i;
        view.height = -2;
    }

    public static void a(View view, String s, String s1, String s2, String s3)
    {
        Context context = view.getContext();
        view.setPadding(a(s, context), a(s1, context), a(s2, context), a(s3, context));
    }

    public static void a(View view, boolean flag, Context context)
    {
        a(view, -1, -2);
        a(view, "10dip", "0dip", "10dip", "0dip");
        android.graphics.drawable.Drawable drawable;
        if (flag)
        {
            drawable = gn.a(context);
        } else
        {
            drawable = gn.b(context);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
        } else
        {
            view.setBackgroundDrawable(drawable);
        }
        view.setFocusable(true);
        view.setMinimumHeight(a("54dip", context));
        if (view instanceof TextView)
        {
            context = (TextView)view;
            context.setGravity(17);
            context.setTextColor(-1);
            context.setTextSize(20F);
            context.setTypeface(gn.f);
        }
        if (!(view instanceof Button))
        {
            view.setClickable(true);
        }
    }

    public static float b(String s, Context context)
    {
        if (s == null)
        {
            return 0.0F;
        }
        String s1 = s.toLowerCase();
        if (c.containsKey(s1))
        {
            return ((Float)c.get(s1)).floatValue();
        }
        s = b.matcher(s1);
        if (!s.matches())
        {
            throw new NumberFormatException();
        }
        float f = Float.parseFloat(s.group(1));
        s = s.group(3).toLowerCase();
        Integer integer = (Integer)a.get(s);
        s = integer;
        if (integer == null)
        {
            s = Integer.valueOf(1);
        }
        f = TypedValue.applyDimension(s.intValue(), f, context.getResources().getDisplayMetrics());
        c.put(s1, Float.valueOf(f));
        return f;
    }

    public static void b(View view, String s, String s1, String s2, String s3)
    {
        Context context = view.getContext();
        view = view.getLayoutParams();
        if (view instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            ((android.view.ViewGroup.MarginLayoutParams)view).setMargins(a(s, context), a(s1, context), a(s2, context), a(s3, context));
        }
    }

    public static Bitmap c(String s, Context context)
    {
        return a(s, context, 240);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("px", Integer.valueOf(0));
        hashmap.put("dip", Integer.valueOf(1));
        hashmap.put("dp", Integer.valueOf(1));
        hashmap.put("sp", Integer.valueOf(2));
        hashmap.put("pt", Integer.valueOf(3));
        hashmap.put("in", Integer.valueOf(4));
        hashmap.put("mm", Integer.valueOf(5));
        a = Collections.unmodifiableMap(hashmap);
    }
}
