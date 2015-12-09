// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class cb
{

    private static Method a;

    public static void a(ViewGroup viewgroup)
    {
        if (a == null)
        {
            try
            {
                a = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", nosuchmethodexception);
            }
            a.setAccessible(true);
        }
        try
        {
            a.invoke(viewgroup, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
        }
    }
}
