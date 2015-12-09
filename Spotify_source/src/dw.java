// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

final class dw
{

    private static Method a;
    private static boolean b;

    public static int a(Drawable drawable)
    {
        if (!b)
        {
            int i;
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("getLayoutDirection", new Class[0]);
                a = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", nosuchmethodexception);
            }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i = ((Integer)a.invoke(drawable, new Object[0])).intValue();
        return i;
        drawable;
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", drawable);
        a = null;
        return -1;
    }
}
