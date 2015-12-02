// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.s;
import java.util.List;
import java.util.Random;

public final class a
{

    public static int a(long l, long l1)
    {
        int i;
        if (l1 > 0L)
        {
            if ((i = (int)((100L * l) / l1)) > 0)
            {
                return i;
            }
        }
        return 1;
    }

    public static int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.values().length];
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[examstatus.ordinal()])
        {
        default:
            return 90;

        case 1: // '\001'
            return (new Random()).nextInt(10) + 90;

        case 2: // '\002'
            return (new Random()).nextInt(40) + 50;

        case 3: // '\003'
            return (new Random()).nextInt(20) + 30;
        }
    }

    public static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(int i)
    {
        if (i <= 20)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER;
        }
        if (i <= 35)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE;
        } else
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        }
    }

    public static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(long l)
    {
        int i = (int)((100L * l) / s.c());
        if (i >= 90)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        }
        if (i >= 40)
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE;
        } else
        {
            return com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER;
        }
    }

    public static String a(String s1)
    {
        if (TextUtils.isEmpty(s1) || Character.isUpperCase(s1.charAt(0)))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).toString();
        }
    }

    public static boolean a()
    {
        return (new Random(System.currentTimeMillis())).nextInt(2) == 0;
    }

    public static ComponentName b()
    {
        Object obj = (ActivityManager)SecurityApplication.a().getSystemService("activity");
        try
        {
            obj = ((ActivityManager) (obj)).getRunningTasks(1);
        }
        catch (Exception exception)
        {
            return null;
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            return ((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity;
        } else
        {
            return null;
        }
    }
}
