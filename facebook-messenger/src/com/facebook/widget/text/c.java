// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.common.a.ik;
import java.util.HashMap;

// Referenced classes of package com.facebook.widget.text:
//            d, e

public class c
{

    private static final HashMap a = ik.a();

    public c()
    {
    }

    public static Typeface a(Context context, d d1, Typeface typeface)
    {
        if (d1 == d.BUILTIN)
        {
            return typeface;
        }
        if (typeface != null && typeface.isBold())
        {
            return a(context, e.HELVETICA_NEUE_BOLD);
        } else
        {
            return a(context, e.HELVETICA_NEUE_REGULAR);
        }
    }

    private static Typeface a(Context context, e e1)
    {
        Typeface typeface1 = (Typeface)a.get(e1);
        Typeface typeface = typeface1;
        if (typeface1 == null)
        {
            typeface = Typeface.createFromAsset(context.getAssets(), e1.mFontAssetFilePath);
            a.put(e1, typeface);
        }
        return typeface;
    }

    public static void a(TextView textview, d d1, Typeface typeface)
    {
        d1 = a(textview.getContext(), d1, typeface);
        if (d1 == typeface)
        {
            return;
        } else
        {
            textview.setTypeface(d1);
            return;
        }
    }

}
