// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;
import com.a.a.d;
import com.google.b.b.b;
import com.google.b.g;
import com.google.b.k;
import com.google.b.v;
import java.text.DecimalFormat;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.jcp.util:
//            ae

public final class a
{

    private static final String a = com/jcp/util/a.getName();

    private a()
    {
    }

    public static Bitmap a(String s, int i, int j)
    {
        try
        {
            s = a(s, com.google.b.a.e, j, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(a, s.getMessage());
            return null;
        }
        return s;
    }

    static Bitmap a(String s, com.google.b.a a1, int i, int j)
    {
        if (s == null)
        {
            return null;
        }
        Object obj = a(((CharSequence) (s)));
        EnumMap enummap;
        int l;
        int i1;
        if (obj != null)
        {
            enummap = new EnumMap(com/google/b/g);
            enummap.put(g.b, obj);
        } else
        {
            enummap = null;
        }
        obj = new k();
        try
        {
            a1 = ((k) (obj)).a(s, a1, i, j, enummap);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        l = a1.f();
        i1 = a1.g();
        s = new int[l * i1];
        for (i = 0; i < i1; i++)
        {
            int j1 = i * l;
            j = 0;
            while (j < l) 
            {
                if (a1.a(j, i))
                {
                    s[j1 + j] = 0xff000000;
                } else
                {
                    s[j1 + j] = -1;
                }
                j++;
            }
        }

        a1 = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_8888);
        a1.setPixels(s, 0, l, 0, 0, l, i1);
        return a1;
    }

    private static String a(CharSequence charsequence)
    {
        for (int i = 0; i < charsequence.length(); i++)
        {
            if (charsequence.charAt(i) > '\377')
            {
                return "UTF-8";
            }
        }

        return null;
    }

    public static void a(AnimationDrawable animationdrawable, ImageView imageview, Context context)
    {
        imageview.setLayerType(1, null);
        animationdrawable.setOneShot(false);
        imageview = new DecimalFormat("00");
        int i = 1;
        while (i <= 14) 
        {
            try
            {
                animationdrawable.addFrame(d.a(context.getAssets(), (new StringBuilder()).append("svg/loader_catalog").append(imageview.format(i)).append(".svg").toString()).a(), 500);
            }
            catch (Exception exception)
            {
                ae.a(a, "Exception getting svg asset", exception);
            }
            i++;
        }
    }

}
