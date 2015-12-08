// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.c.a:
//            a, c

static class rawable extends rawable
{

    public void b(Drawable drawable, int i)
    {
        if (!c.b)
        {
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("setLayoutDirection", new Class[] {
                    Integer.TYPE
                });
                c.a = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", nosuchmethodexception);
            }
            c.b = true;
        }
        if (c.a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        c.a.invoke(drawable, new Object[] {
            Integer.valueOf(i)
        });
        return;
        drawable;
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", drawable);
        c.a = null;
        return;
    }

    public int d(Drawable drawable)
    {
        int i = c.a(drawable);
        if (i < 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    rawable()
    {
    }
}
