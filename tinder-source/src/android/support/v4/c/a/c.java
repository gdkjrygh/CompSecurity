// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

final class c
{

    static Method a;
    static boolean b;
    private static Method c;
    private static boolean d;

    public static int a(Drawable drawable)
    {
        if (!d)
        {
            int i;
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", nosuchmethodexception);
            }
            d = true;
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i = ((Integer)c.invoke(drawable, new Object[0])).intValue();
        return i;
        drawable;
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", drawable);
        c = null;
        return -1;
    }
}
