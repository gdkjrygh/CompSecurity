// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;
import java.lang.reflect.Field;

final class ag
{

    private static Field a;
    private static boolean b;

    static void a(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!b)
        {
            try
            {
                Field field = android/view/LayoutInflater.getDeclaredField("mFactory2");
                a = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                (new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ")).append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.");
            }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        a.set(layoutinflater, factory2);
        return;
        factory2;
        (new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ")).append(layoutinflater).append("; inflation may have unexpected results.");
        return;
    }
}
