// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class e
{

    private static final String a = android/widget/TextView.getPackage().getName();
    private static final String b = android/view/View.getPackage().getName();

    public e()
    {
    }

    public static Class a(String s)
        throws ClassNotFoundException
    {
        if (s.contains("."))
        {
            return Class.forName(s);
        }
        Class class1;
        try
        {
            class1 = Class.forName(String.format("%s.%s", new Object[] {
                a, s
            }));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return Class.forName(String.format("%s.%s", new Object[] {
                b, s
            }));
        }
        return class1;
    }

    public static Object a(String s, Context context, AttributeSet attributeset)
        throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException
    {
        s = a(s);
        try
        {
            attributeset = ((AttributeSet) (s.getConstructor(new Class[] {
                android/content/Context, android/util/AttributeSet
            }).newInstance(new Object[] {
                context, attributeset
            })));
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            return s.getConstructor(new Class[] {
                android/content/Context
            }).newInstance(new Object[] {
                context
            });
        }
        return attributeset;
    }

}
