// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.paypal.android.sdk:
//            dy

public final class dz
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

    public static View a(LinearLayout linearlayout)
    {
        View view = new View(linearlayout.getContext());
        linearlayout.addView(view);
        a(view, ((Drawable) (new ColorDrawable(dy.f))));
        a(view, -1, "1dip");
        b(view, null, "12dip", null, "12dip");
        return view;
    }

    public static android.view.ViewGroup.LayoutParams a()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public static ViewGroup a(Context context)
    {
        context = new ScrollView(context);
        context.setBackgroundColor(dy.d);
        return context;
    }

    public static ImageView a(Context context, String s, String s1)
    {
        ImageView imageview = new ImageView(context);
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imageview.setImageBitmap(c(s, context));
        imageview.setAdjustViewBounds(true);
        imageview.setContentDescription(s1);
        return imageview;
    }

    public static LinearLayout a(Context context, boolean flag, int i, LinearLayout linearlayout)
    {
        LinearLayout linearlayout1 = new LinearLayout(context);
        if (i != 0)
        {
            linearlayout1.setId(i);
        }
        linearlayout.addView(linearlayout1);
        linearlayout1.setGravity(17);
        linearlayout1.setOrientation(0);
        a(((View) (linearlayout1)), flag, context);
        a(((View) (linearlayout1)), -1, "58dip");
        b(linearlayout1, null, null, null, "4dip");
        return linearlayout1;
    }

    public static LinearLayout a(ViewGroup viewgroup)
    {
        LinearLayout linearlayout = new LinearLayout(viewgroup.getContext());
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(dy.d);
        viewgroup.addView(linearlayout);
        a(((View) (linearlayout)), -1, -2);
        return linearlayout;
    }

    public static android.widget.RelativeLayout.LayoutParams a(int i, int j, int k, int l)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(k, l);
        return layoutparams;
    }

    public static android.widget.RelativeLayout.LayoutParams a(Context context, String s, String s1, int i)
    {
        context = new android.widget.RelativeLayout.LayoutParams(a(s, context), a(s1, context));
        context.addRule(i);
        return context;
    }

    public static void a(View view)
    {
        b(view, "4dip", null, "4dip", null);
    }

    public static void a(View view, int i, float f)
    {
        view = view.getLayoutParams();
        if (view instanceof android.widget.LinearLayout.LayoutParams)
        {
            view = (android.widget.LinearLayout.LayoutParams)view;
            view.gravity = i;
            view.weight = f;
        }
    }

    public static void a(View view, int i, int j)
    {
        view = view.getLayoutParams();
        view.width = i;
        view.height = j;
    }

    public static void a(View view, int i, String s)
    {
        a(view, i, a(s, view.getContext()));
    }

    private static void a(View view, Drawable drawable)
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

    public static void a(View view, String s, int i)
    {
        a(view, a(s, view.getContext()), -2);
    }

    public static void a(View view, String s, String s1)
    {
        b(view, "4dip", s, "4dip", s1);
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
        Drawable drawable;
        if (flag)
        {
            drawable = dy.a(context);
        } else
        {
            drawable = dy.b(context);
        }
        a(view, drawable);
        view.setFocusable(true);
        view.setMinimumHeight(a("54dip", context));
        if (view instanceof TextView)
        {
            a((TextView)view);
        }
        if (!(view instanceof Button))
        {
            view.setClickable(true);
        }
    }

    public static void a(Button button)
    {
        a(((TextView) (button)), 17);
    }

    public static void a(TextView textview)
    {
        textview.setGravity(17);
        textview.setTextColor(-1);
        textview.setTextSize(20F);
        textview.setTypeface(dy.m);
    }

    public static void a(TextView textview, int i)
    {
        a(((View) (textview)), "2dip", "2dip", "2dip", "2dip");
        textview.setTypeface(dy.n);
        textview.setTextColor(dy.t);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            textview.setBackgroundDrawable(dy.c(textview.getContext()));
        } else
        {
            textview.setBackground(dy.c(textview.getContext()));
        }
        textview.setAutoLinkMask(15);
        textview.setTextSize(14F);
        textview.setTextColor(dy.t);
        textview.setGravity(i);
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

    public static LinearLayout b(ViewGroup viewgroup)
    {
        LinearLayout linearlayout = new LinearLayout(viewgroup.getContext());
        linearlayout.setOrientation(1);
        a(linearlayout, "10dip", "14dip", "10dip", "14dip");
        viewgroup.addView(linearlayout, a());
        return linearlayout;
    }

    public static void b(View view, String s, String s1)
    {
        Context context = view.getContext();
        a(view, a(s, context), a(s1, context));
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

    public static void b(TextView textview)
    {
        textview.setTextColor(dy.k);
        textview.setLinkTextColor(dy.t);
        textview.setTypeface(dy.s);
        textview.setTextSize(13F);
        textview.setSingleLine(false);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(TextView textview, int i)
    {
        textview.setTextSize(18F);
        textview.setTypeface(dy.o);
        textview.setSingleLine(true);
        textview.setGravity(i);
        textview.setTextColor(dy.g);
    }

    public static Bitmap c(String s, Context context)
    {
        return a(s, context, 240);
    }

    public static void c(TextView textview, int i)
    {
        textview.setTextSize(16F);
        textview.setTypeface(dy.p);
        textview.setSingleLine(true);
        textview.setGravity(83);
        textview.setTextColor(dy.g);
    }

    public static void d(TextView textview, int i)
    {
        textview.setTextSize(14F);
        textview.setTypeface(dy.q);
        textview.setSingleLine(true);
        textview.setGravity(i);
        textview.setTextColor(dy.g);
    }

    public static void e(TextView textview, int i)
    {
        textview.setTextSize(13F);
        textview.setTypeface(dy.q);
        textview.setSingleLine(true);
        textview.setGravity(83);
        textview.setTextColor(dy.g);
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
