// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewCompatEclairMr1

static class  extends 
{

    public final boolean isOpaque(View view)
    {
        return view.isOpaque();
    }

    public final void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        if (ViewCompatEclairMr1.sChildrenDrawingOrderMethod == null)
        {
            try
            {
                ViewCompatEclairMr1.sChildrenDrawingOrderMethod = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", nosuchmethodexception);
            }
            ViewCompatEclairMr1.sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try
        {
            ViewCompatEclairMr1.sChildrenDrawingOrderMethod.invoke(viewgroup, new Object[] {
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

    ()
    {
    }
}
