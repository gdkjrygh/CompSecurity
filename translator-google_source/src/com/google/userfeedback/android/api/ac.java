// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import java.lang.reflect.Field;

public final class ac
{

    public int a;
    public Object b;
    public Field c;
    public Class d;
    public int e;
    public byte f[];

    ac(int i)
    {
        this(i, null, null, null, 0);
    }

    ac(int i, Object obj, Field field, Class class1, int j)
    {
        a = i;
        b = obj;
        c = field;
        d = class1;
        e = j;
        if (field != null && field.getType().equals((new byte[0]).getClass()))
        {
            try
            {
                f = (byte[])field.get(obj);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                f = null;
                ((IllegalArgumentException) (obj)).printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                f = null;
            }
            ((IllegalAccessException) (obj)).printStackTrace();
            return;
        } else
        {
            f = null;
            return;
        }
    }

    final boolean a()
    {
        return f != null;
    }

    final boolean b()
    {
        return b == null;
    }

    final boolean c()
    {
        return d != null;
    }
}
