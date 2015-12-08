// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

class DrawableCompatJellybeanMr1
{

    private static Method a;
    private static boolean b;

    public static void a(Drawable drawable, int i)
    {
        if (!b)
        {
            try
            {
                a = android/graphics/drawable/Drawable.getDeclaredMethod("setLayoutDirection", new Class[] {
                    Integer.TYPE
                });
                a.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", nosuchmethodexception);
            }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.invoke(drawable, new Object[] {
            Integer.valueOf(i)
        });
        return;
        drawable;
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", drawable);
        a = null;
        return;
    }
}
