// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view:
//            e

private static final class se
    implements android.view.Item.OnMenuItemClickListener
{

    private static final Class a[] = {
        android/view/MenuItem
    };
    private Object b;
    private Method c;

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        try
        {
            if (c.getReturnType() == Boolean.TYPE)
            {
                return ((Boolean)c.invoke(b, new Object[] {
                    menuitem
                })).booleanValue();
            }
            c.invoke(b, new Object[] {
                menuitem
            });
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw new RuntimeException(menuitem);
        }
        return true;
    }


    public Listener(Object obj, String s)
    {
        b = obj;
        Class class1 = obj.getClass();
        try
        {
            c = class1.getMethod(s, a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = new InflateException((new StringBuilder("Couldn't resolve menu item onClick handler ")).append(s).append(" in class ").append(class1.getName()).toString());
        }
        s.initCause(((Throwable) (obj)));
        throw s;
    }
}
