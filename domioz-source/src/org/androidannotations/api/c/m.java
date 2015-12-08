// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

// Referenced classes of package org.androidannotations.api.c:
//            l

public abstract class m
{

    private static final Method a = a(android/content/SharedPreferences$Editor, "apply", new Class[0]);
    private static final Method b = a(android/content/SharedPreferences, "getStringSet", new Class[] {
        java/lang/String, java/util/Set
    });
    private static final Method c = a(android/content/SharedPreferences$Editor, "putStringSet", new Class[] {
        java/lang/String, java/util/Set
    });

    private static transient Object a(Method method, Object obj, Object aobj[])
    {
        if (method == null)
        {
            throw new NoSuchMethodException();
        }
        obj = method.invoke(obj, aobj);
        return obj;
        obj;
_L2:
        throw new NoSuchMethodException(method.getName());
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static transient Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static Set a(SharedPreferences sharedpreferences, String s, Set set)
    {
        Set set1;
        try
        {
            set1 = (Set)a(b, sharedpreferences, new Object[] {
                s, set
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            sharedpreferences = sharedpreferences.getString(s, null);
            if (sharedpreferences == null)
            {
                return set;
            } else
            {
                return l.a(sharedpreferences);
            }
        }
        return set1;
    }

    public static void a(android.content.SharedPreferences.Editor editor)
    {
        try
        {
            a(a, editor, new Object[0]);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            editor.commit();
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, String s, Set set)
    {
        try
        {
            a(c, editor, new Object[] {
                s, set
            });
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            editor.putString(s, l.a(set));
        }
    }

}
