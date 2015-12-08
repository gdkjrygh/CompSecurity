// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.storepickup.pojo.Inventory;
import com.jcp.storepickup.pojo.Items;
import com.jcp.storepickup.pojo.Stores;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bq
{

    public static int a(CharSequence charsequence, CharSequence charsequence1)
    {
        int j = 0;
        if (!a(charsequence) && !a(charsequence1)) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        return j;
_L2:
        int i = 0;
        do
        {
            int k = a(charsequence, charsequence1, j);
            j = i;
            if (k == -1)
            {
                continue;
            }
            i++;
            j = k + charsequence1.length();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int a(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return charsequence.toString().indexOf(charsequence1.toString(), i);
    }

    public static String a(int i, String s, String s1)
    {
        if (i != 1)
        {
            s = s1;
        }
        return String.format("%d %s", new Object[] {
            Integer.valueOf(i), s
        });
    }

    public static String a(List list, boolean flag)
    {
        Object obj;
        Iterator iterator;
        iterator = null;
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        iterator = list.iterator();
        list = ((List) (obj));
_L4:
        obj = list;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Iterator iterator1 = ((Stores)iterator.next()).getItems().iterator();
        do
        {
            do
            {
                if (!iterator1.hasNext())
                {
                    break MISSING_BLOCK_LABEL_178;
                }
                obj = ((Items)iterator1.next()).getInventory().getUpdatedAsOf();
                list = ((List) (obj));
            } while (obj == null);
            list = ((List) (obj));
        } while (TextUtils.isEmpty(((CharSequence) (obj))));
_L10:
        list = ((List) (obj));
        if (obj == null) goto _L4; else goto _L3
_L3:
        list = ((List) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L5
_L5:
        Iterator iterator2;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return f(((String) (obj)));
        } else
        {
            return a(true);
        }
_L2:
        iterator2 = list.iterator();
        obj = iterator;
_L8:
        if (!iterator2.hasNext()) goto _L5; else goto _L6
_L6:
        list = ((Stores)iterator2.next()).getInventory().getUpdateAsOf();
        obj = list;
        if (list == null) goto _L8; else goto _L7
_L7:
        obj = list;
        if (TextUtils.isEmpty(list)) goto _L8; else goto _L9
_L9:
        obj = list;
          goto _L5
        obj = list;
          goto _L10
    }

    private static String a(boolean flag)
    {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpledateformat;
        if (flag)
        {
            simpledateformat = new SimpleDateFormat("  MM'/'d hh:mm aaa 'CDT'");
        } else
        {
            simpledateformat = new SimpleDateFormat("  MM'/'d hh:mm aaa");
        }
        return simpledateformat.format(calendar.getTime());
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    private static boolean a(String s, String s1)
    {
        boolean flag = false;
        if (s1 != null)
        {
            flag = Pattern.matches(s, s1);
        }
        return flag;
    }

    public static boolean b(String s)
    {
        return !TextUtils.isEmpty(s) && b.a.matcher(s).matches();
    }

    public static boolean c(String s)
    {
        return s != null && a("\\d{10}$", e(s));
    }

    public static boolean d(String s)
    {
        return s != null && a("^\\d{5}(-\\d{4})?$", s);
    }

    public static String e(String s)
    {
        if (s != null)
        {
            return s.replaceAll("[-()]", "");
        } else
        {
            return null;
        }
    }

    private static String f(String s)
    {
        try
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            s = (new SimpleDateFormat("  MM'/'d hh:mm aaa 'CDT'")).format(simpledateformat.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
