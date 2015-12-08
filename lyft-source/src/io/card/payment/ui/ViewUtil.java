// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
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

// Referenced classes of package io.card.payment.ui:
//            Appearance

public class ViewUtil
{

    private static final Map DIMENSION_STRING_CONSTANT = initDimensionStringConstantMap();
    static Pattern DIMENSION_VALUE_PATTERN = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    static HashMap pxDimensionLookupTable = new HashMap();

    public static Bitmap base64ToBitmap(String s, Context context)
    {
        return base64ToBitmap(s, context, 240);
    }

    public static Bitmap base64ToBitmap(String s, Context context, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (context != null)
        {
            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
        } else
        {
            options.inTargetDensity = 160;
        }
        options.inDensity = i;
        options.inScaled = false;
        s = Base64.decode(s, 0);
        return BitmapFactory.decodeByteArray(s, 0, s.length, options);
    }

    static Map initDimensionStringConstantMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("px", Integer.valueOf(0));
        hashmap.put("dip", Integer.valueOf(1));
        hashmap.put("dp", Integer.valueOf(1));
        hashmap.put("sp", Integer.valueOf(2));
        hashmap.put("pt", Integer.valueOf(3));
        hashmap.put("in", Integer.valueOf(4));
        hashmap.put("mm", Integer.valueOf(5));
        return Collections.unmodifiableMap(hashmap);
    }

    public static void setBackground(View view, Drawable drawable)
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

    public static void setDimensions(View view, int i, int j)
    {
        view = view.getLayoutParams();
        view.width = i;
        view.height = j;
    }

    public static void setMargins(View view, String s, String s1, String s2, String s3)
    {
        Context context = view.getContext();
        view = view.getLayoutParams();
        if (view instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            ((android.view.ViewGroup.MarginLayoutParams)view).setMargins(typedDimensionValueToPixelsInt(s, context), typedDimensionValueToPixelsInt(s1, context), typedDimensionValueToPixelsInt(s2, context), typedDimensionValueToPixelsInt(s3, context));
        }
    }

    public static void setPadding(View view, String s, String s1, String s2, String s3)
    {
        Context context = view.getContext();
        view.setPadding(typedDimensionValueToPixelsInt(s, context), typedDimensionValueToPixelsInt(s1, context), typedDimensionValueToPixelsInt(s2, context), typedDimensionValueToPixelsInt(s3, context));
    }

    public static void styleAsButton(View view, boolean flag, Context context)
    {
        setDimensions(view, -1, -2);
        setPadding(view, "10dip", "0dip", "10dip", "0dip");
        Drawable drawable;
        if (flag)
        {
            drawable = Appearance.buttonBackgroundPrimary(context);
        } else
        {
            drawable = Appearance.buttonBackgroundSecondary(context);
        }
        setBackground(view, drawable);
        view.setFocusable(true);
        view.setMinimumHeight(typedDimensionValueToPixelsInt("54dip", context));
        if (view instanceof TextView)
        {
            styleAsButtonText((TextView)view);
        }
        if (!(view instanceof Button))
        {
            view.setClickable(true);
        }
    }

    public static void styleAsButtonText(TextView textview)
    {
        textview.setGravity(17);
        textview.setTextColor(-1);
        textview.setTextSize(20F);
        textview.setTypeface(Appearance.TYPEFACE_BUTTON);
    }

    public static float typedDimensionValueToPixels(String s, Context context)
    {
        if (s == null)
        {
            return 0.0F;
        }
        String s1 = s.toLowerCase();
        if (pxDimensionLookupTable.containsKey(s1))
        {
            return ((Float)pxDimensionLookupTable.get(s1)).floatValue();
        }
        s = DIMENSION_VALUE_PATTERN.matcher(s1);
        if (!s.matches())
        {
            throw new NumberFormatException();
        }
        float f = Float.parseFloat(s.group(1));
        s = s.group(3).toLowerCase();
        Integer integer = (Integer)DIMENSION_STRING_CONSTANT.get(s);
        s = integer;
        if (integer == null)
        {
            s = Integer.valueOf(1);
        }
        f = TypedValue.applyDimension(s.intValue(), f, context.getResources().getDisplayMetrics());
        pxDimensionLookupTable.put(s1, Float.valueOf(f));
        return f;
    }

    public static int typedDimensionValueToPixelsInt(String s, Context context)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return (int)typedDimensionValueToPixels(s, context);
        }
    }

}
