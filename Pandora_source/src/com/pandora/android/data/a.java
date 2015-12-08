// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.view.MenuItem;
import java.util.Locale;

public class a
{

    public static final a d = new a(0x7f120011, 0x7f10001d);
    public static final a e = new a(0x7f120007, 0x7f10000f);
    public static final a f = new a(0x7f120017, 0x7f10001f);
    public static final a g = new a(0x7f120016, 0x7f10001e);
    public static final a h = new a(0x7f12000b, 0x7f100016);
    public static final a i = new a(0x7f120006, 0x7f10000c);
    public int a;
    public int b;
    public MenuItem c;

    public a(int j, int k)
    {
        a = j;
        b = k;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (a != ((a) (obj)).a)
            {
                return false;
            }
            if (b != ((a) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a * 31 + b;
    }

    public String toString()
    {
        boolean flag = true;
        Locale locale = Locale.US;
        int j = a;
        int k = b;
        if (c == null)
        {
            flag = false;
        }
        return String.format(locale, "menuResId = %d, menuActionId = %d, has menuItem=%b", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(flag)
        });
    }

}
