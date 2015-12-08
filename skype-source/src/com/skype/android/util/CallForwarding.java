// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.Setup;
import com.skype.SkyLib;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CallForwarding
{
    public static class Number
    {

        public final int a;
        public final int b;
        public final String c;

        public boolean equals(Object obj)
        {
            return obj != null && toString().equals(obj.toString());
        }

        public int hashCode()
        {
            return toString().hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append(a).append(",").append(b).append(",").append(c).toString();
        }

        public Number(int i, int j, String s)
        {
            a = i;
            b = j;
            c = s;
        }

        public Number(String s)
        {
            this(0, 60, s);
        }
    }


    private SkyLib a;
    private Account b;

    public CallForwarding(SkyLib skylib, Account account)
    {
        a = skylib;
        b = account;
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list != null)
        {
            Number number;
            for (list = list.iterator(); list.hasNext(); stringbuilder.append(number.toString()))
            {
                number = (Number)list.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(" ");
                }
            }

        }
        return stringbuilder.toString();
    }

    public final Number a(String s)
    {
        Number number = null;
        Iterator iterator = a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Number number1 = (Number)iterator.next();
            if (s.equals(number1.c))
            {
                number = number1;
            }
        } while (true);
        return number;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        String s = b.getOfflineCallforwardProp();
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split(" ");
            for (int i = 0; i < as.length; i++)
            {
                String as1[] = as[i].split(",");
                if (as1.length == 3)
                {
                    arraylist.add(new Number(Integer.parseInt(as1[0]), Integer.parseInt(as1[1]), as1[2]));
                }
            }

        }
        return arraylist;
    }

    public final void a(Number number)
    {
        String s1 = b.getOfflineCallforwardProp();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        if (s.length() > 0)
        {
            number = (new StringBuilder()).append(s).append(" ").append(number.toString()).toString();
        } else
        {
            number = number.toString();
        }
        b.setServersideStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD, number);
    }

    public final void a(boolean flag)
    {
        Setup setup = a.getSetup();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setup.setInt("Lib/Call/ApplyCF", i);
    }

    public final boolean a(Number number, String s)
    {
        boolean flag1 = false;
        List list = a();
        Iterator iterator = list.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            Number number1 = (Number)iterator.next();
            if (!number1.equals(number))
            {
                continue;
            }
            number = new Number(number1.a, number1.b, s);
            list.remove(number1);
            list.add(number);
            flag = true;
            break;
        } while (true);
        if (flag)
        {
            number = a(list);
            b.setServersideStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD, number);
        }
        return flag;
    }

    public final boolean b()
    {
        return a.getSetup().getInt("Lib/Call/ApplyCF", 0) == 1;
    }

    public final boolean b(Number number)
    {
        List list = a();
        Object obj = null;
        Iterator iterator = list.iterator();
        Number number1;
        do
        {
            number1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            number1 = (Number)iterator.next();
        } while (!number1.equals(number));
        if (number1 != null)
        {
            list.remove(number1);
            number = a(list);
            b.setServersideStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD, number);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean c()
    {
        return b.setServersideStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD, "");
    }
}
