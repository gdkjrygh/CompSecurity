// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.domain.a;
import com.fitbit.data.domain.s;
import java.util.ArrayList;

public class w
{

    public w()
    {
    }

    public static Enum a(int i, Class class1)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        int k = aenum.length;
        for (int j = 0; j < k; j++)
        {
            Enum enum = aenum[j];
            if (((a)enum).getCode() == i)
            {
                return enum;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("code: ").append(i).append("; clazz: ").append(class1).toString());
    }

    public static Enum a(String s1, Class class1)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            if (((s)enum).getSerializableName().equalsIgnoreCase(s1))
            {
                return enum;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("name: ").append(s1).append("; clazz: ").append(class1).toString());
    }

    public static Enum a(String s1, Class class1, Enum enum)
    {
        if (s1 == null)
        {
            return enum;
        }
        try
        {
            s1 = Enum.valueOf(class1, s1.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return enum;
        }
        return s1;
    }

    public static transient Integer[] a(Enum aenum[])
    {
        Integer ainteger[] = new Integer[aenum.length];
        int k = aenum.length;
        int j = 0;
        for (int i = 0; j < k; i++)
        {
            ainteger[i] = Integer.valueOf(((a)aenum[j]).getCode());
            j++;
        }

        return ainteger;
    }

    public static transient String[] b(Enum aenum[])
    {
        int j = 0;
        String as[] = new String[aenum.length];
        int k = aenum.length;
        for (int i = 0; j < k; i++)
        {
            as[i] = aenum[j].name();
            j++;
        }

        return as;
    }

    public static transient ArrayList c(Enum aenum[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aenum[i].name());
        }

        return arraylist;
    }
}
