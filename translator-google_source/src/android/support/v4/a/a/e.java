// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.a.a:
//            d, k

class e extends d
{

    e()
    {
    }

    public void b(Drawable drawable, int i)
    {
        if (!k.b)
        {
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("setLayoutDirection", new Class[] {
                    Integer.TYPE
                });
                k.a = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
            k.b = true;
        }
        if (k.a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        k.a.invoke(drawable, new Object[] {
            Integer.valueOf(i)
        });
        return;
        drawable;
        k.a = null;
        return;
    }
}
