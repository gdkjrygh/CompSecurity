// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

final class d
{

    private static Field a;
    private static boolean b;

    static Drawable a(CompoundButton compoundbutton)
    {
        if (!b)
        {
            try
            {
                Field field = android/widget/CompoundButton.getDeclaredField("mButtonDrawable");
                a = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", nosuchfieldexception);
            }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        compoundbutton = (Drawable)a.get(compoundbutton);
        return compoundbutton;
        compoundbutton;
        Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", compoundbutton);
        a = null;
        return null;
    }
}
