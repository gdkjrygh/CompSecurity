// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.application;

import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.pinterest.kit.utils.NumberUtils;
import java.io.InputStream;

// Referenced classes of package com.pinterest.kit.application:
//            CommonApplication

public class Resources
{

    public Resources()
    {
    }

    public static Bitmap bitmap(int i)
    {
        return bitmap(i, null);
    }

    public static Bitmap bitmap(int i, android.graphics.BitmapFactory.Options options)
    {
        if (i <= 0)
        {
            return null;
        }
        android.content.res.Resources resources = get();
        android.graphics.BitmapFactory.Options options1 = options;
        if (options == null)
        {
            options1 = new android.graphics.BitmapFactory.Options();
        }
        return BitmapFactory.decodeResource(resources, i, options1);
    }

    public static int color(int i)
    {
        return get().getColor(i);
    }

    public static Configuration configuration()
    {
        return get().getConfiguration();
    }

    public static float dimension(int i)
    {
        return get().getDimension(i);
    }

    public static Drawable drawable(int i)
    {
        if (i <= 0)
        {
            return null;
        } else
        {
            return get().getDrawable(i);
        }
    }

    private static android.content.res.Resources get()
    {
        return CommonApplication.context().getResources();
    }

    public static int[] intArray(int i)
    {
        return get().getIntArray(i);
    }

    public static Integer integer(int i)
    {
        return Integer.valueOf(get().getInteger(i));
    }

    public static InputStream raw(int i)
    {
        if (i <= 0)
        {
            return null;
        } else
        {
            return get().openRawResource(i);
        }
    }

    public static String string(int i)
    {
        return get().getString(i);
    }

    public static transient String string(int i, Object aobj[])
    {
        return get().getString(i, aobj);
    }

    public static String[] stringArray(int i)
    {
        return get().getStringArray(i);
    }

    public static String stringPlural(int i, Integer integer1)
    {
        Integer integer2 = integer1;
        if (integer1 == null)
        {
            integer2 = Integer.valueOf(0);
        }
        return get().getQuantityString(i, integer2.intValue(), new Object[] {
            integer2
        });
    }

    public static transient String stringPlural(int i, Integer integer1, Object aobj[])
    {
        Integer integer2 = integer1;
        if (integer1 == null)
        {
            integer2 = Integer.valueOf(0);
        }
        return get().getQuantityString(i, integer2.intValue(), aobj);
    }

    public static String stringPluralShort(int i, Integer integer1)
    {
        Integer integer2 = integer1;
        if (integer1 == null)
        {
            integer2 = Integer.valueOf(0);
        }
        return get().getQuantityString(i, integer2.intValue(), new Object[] {
            NumberUtils.getFormattedNumber(integer2.intValue())
        });
    }
}
