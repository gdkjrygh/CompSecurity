// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.co;

import android.app.Activity;
import com.pandora.android.activity.ErrorStateActivity;
import com.pandora.android.activity.c;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import java.util.Calendar;

public class a
{

    public static int a(String s1)
    {
        if (s.a(s1))
        {
            return 0x7f08015d;
        }
        return s.j(s1) ? 0 : 0x7f08015c;
    }

    public static boolean a(int i)
    {
        return b(i) >= 14;
    }

    public static boolean a(Activity activity, int i)
    {
        if (b(i) < 14)
        {
            com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/ErrorStateActivity);
            return false;
        } else
        {
            return true;
        }
    }

    private static int b(int i)
    {
        return Calendar.getInstance().get(1) - i;
    }

    public static int b(String s1)
    {
        if (s.a(s1))
        {
            return 0x7f080171;
        }
        return s1.length() >= 5 ? 0 : 0x7f080167;
    }

    public static int c(String s1)
    {
        if (s.a(s1))
        {
            return 0x7f080171;
        }
        return s1.length() >= 6 ? 0 : 0x7f080166;
    }

    public static int d(String s1)
    {
        boolean flag = r.a();
        if (s.a(s1))
        {
            return !flag ? 0x7f080189 : 0x7f08018a;
        }
        if (flag)
        {
            if (!h(s1) || s1.length() != 4)
            {
                return 0x7f08016c;
            }
        } else
        if (!h(s1) || s1.length() != 5)
        {
            return 0x7f08016b;
        }
        return 0;
    }

    public static int e(String s1)
    {
        return !s.a(s1) ? 0 : 0x7f08015e;
    }

    public static int f(String s1)
    {
        if (s.a(s1))
        {
            return 0x7f080155;
        }
        if (!h(s1) || s1.length() != 4)
        {
            return 0x7f080163;
        }
        return b(g(s1)) <= 113 ? 0 : 0x7f080154;
    }

    public static int g(String s1)
    {
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return -1;
        }
        return i;
    }

    private static boolean h(String s1)
    {
        try
        {
            Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        return true;
    }
}
