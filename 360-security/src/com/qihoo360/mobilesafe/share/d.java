// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import com.qihoo360.i.v1.main.IIpcPref;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            b

public class d
{

    private static b a = com.qihoo360.mobilesafe.share.b.a();

    public static void a(String s)
    {
        s = b(s).edit();
        s.clear();
        s.commit();
    }

    public static void a(String s, String s1)
    {
        s = b(s).edit();
        s.remove(s1);
        s.commit();
    }

    public static final void a(String s, String s1, int i)
    {
        s = b(s).edit();
        s.putInt(s1, i);
        s.commit();
    }

    public static final void a(String s, String s1, long l)
    {
        s = b(s).edit();
        s.putLong(s1, l);
        s.commit();
    }

    public static final void a(String s, String s1, String s2)
    {
        s = b(s).edit();
        s.putString(s1, s2);
        s.commit();
    }

    public static final void a(String s, String s1, boolean flag)
    {
        s = b(s).edit();
        s.putBoolean(s1, flag);
        s.commit();
    }

    public static final int b(String s, String s1, int i)
    {
        s = b(s);
        int j;
        try
        {
            j = s.getInt(s1, i);
        }
        catch (Exception exception)
        {
            int k;
            try
            {
                k = Integer.valueOf(s.getString(s1, null)).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return i;
            }
            return k;
        }
        return j;
    }

    public static final long b(String s, String s1, long l)
    {
        s = b(s);
        long l1;
        try
        {
            l1 = s.getLong(s1, l);
        }
        catch (Exception exception)
        {
            long l2;
            try
            {
                l2 = Long.valueOf(s.getString(s1, null)).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return l;
            }
            return l2;
        }
        return l1;
    }

    private static IIpcPref b(String s)
    {
        if (s != null)
        {
            return a.getSharedPreferences(s);
        } else
        {
            return a.getDefaultSharedPreferences();
        }
    }

    public static final String b(String s, String s1, String s2)
    {
        return b(s).getString(s1, s2);
    }

    public static boolean b(String s, String s1)
    {
        return b(s).contains(s1);
    }

    public static final boolean b(String s, String s1, boolean flag)
    {
        s = b(s);
        boolean flag1;
        try
        {
            flag1 = s.getBoolean(s1, flag);
        }
        catch (Exception exception)
        {
            boolean flag2;
            try
            {
                flag2 = Boolean.valueOf(s.getString(s1, null)).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return flag;
            }
            return flag2;
        }
        return flag1;
    }

}
